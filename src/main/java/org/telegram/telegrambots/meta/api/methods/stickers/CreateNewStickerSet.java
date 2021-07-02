package org.telegram.telegrambots.meta.api.methods.stickers;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.stickers.MaskPosition;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class CreateNewStickerSet extends PartialBotApiMethod<Boolean> {
   public static final String PATH = "createNewStickerSet";
   public static final String USERID_FIELD = "user_id";
   public static final String NAME_FIELD = "name";
   public static final String TITLE_FIELD = "title";
   public static final String PNGSTICKER_FIELD = "png_sticker";
   public static final String TGSSTICKER_FIELD = "tgs_sticker";
   public static final String EMOJIS_FIELD = "emojis";
   public static final String CONTAINSMASKS_FIELD = "contains_masks";
   public static final String MASKPOSITION_FIELD = "mask_position";
   @NonNull
   private Long userId;
   @NonNull
   private String name;
   @NonNull
   private String title;
   @NonNull
   private String emojis;
   private Boolean containsMasks;
   private MaskPosition maskPosition;
   private InputFile pngSticker;
   private InputFile tgsSticker;

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error creating new sticker set", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.userId != null && this.userId > 0L) {
         if (this.name != null && !this.name.isEmpty()) {
            if (this.title != null && !this.title.isEmpty()) {
               if (this.emojis != null && !this.emojis.isEmpty()) {
                  if (this.pngSticker == null && this.tgsSticker == null) {
                     throw new TelegramApiValidationException("One of pngSticker or tgsSticker is needed", this);
                  } else if (this.pngSticker != null && this.tgsSticker != null) {
                     throw new TelegramApiValidationException("Only one of pngSticker or tgsSticker are allowed", this);
                  } else {
                     if (this.pngSticker != null) {
                        this.pngSticker.validate();
                     }

                     if (this.tgsSticker != null) {
                        this.tgsSticker.validate();
                     }

                     if (this.maskPosition != null) {
                        this.maskPosition.validate();
                     }

                  }
               } else {
                  throw new TelegramApiValidationException("emojis can't be empty", this);
               }
            } else {
               throw new TelegramApiValidationException("title can't be empty", this);
            }
         } else {
            throw new TelegramApiValidationException("name can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("userId can't be empty", this);
      }
   }

   public static CreateNewStickerSet.CreateNewStickerSetBuilder builder() {
      return new CreateNewStickerSet.CreateNewStickerSetBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CreateNewStickerSet)) {
         return false;
      } else {
         CreateNewStickerSet other = (CreateNewStickerSet)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label107: {
               Object this$userId = this.getUserId();
               Object other$userId = other.getUserId();
               if (this$userId == null) {
                  if (other$userId == null) {
                     break label107;
                  }
               } else if (this$userId.equals(other$userId)) {
                  break label107;
               }

               return false;
            }

            Object this$containsMasks = this.getContainsMasks();
            Object other$containsMasks = other.getContainsMasks();
            if (this$containsMasks == null) {
               if (other$containsMasks != null) {
                  return false;
               }
            } else if (!this$containsMasks.equals(other$containsMasks)) {
               return false;
            }

            Object this$name = this.getName();
            Object other$name = other.getName();
            if (this$name == null) {
               if (other$name != null) {
                  return false;
               }
            } else if (!this$name.equals(other$name)) {
               return false;
            }

            label86: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label86;
                  }
               } else if (this$title.equals(other$title)) {
                  break label86;
               }

               return false;
            }

            label79: {
               Object this$emojis = this.getEmojis();
               Object other$emojis = other.getEmojis();
               if (this$emojis == null) {
                  if (other$emojis == null) {
                     break label79;
                  }
               } else if (this$emojis.equals(other$emojis)) {
                  break label79;
               }

               return false;
            }

            label72: {
               Object this$maskPosition = this.getMaskPosition();
               Object other$maskPosition = other.getMaskPosition();
               if (this$maskPosition == null) {
                  if (other$maskPosition == null) {
                     break label72;
                  }
               } else if (this$maskPosition.equals(other$maskPosition)) {
                  break label72;
               }

               return false;
            }

            Object this$pngSticker = this.getPngSticker();
            Object other$pngSticker = other.getPngSticker();
            if (this$pngSticker == null) {
               if (other$pngSticker != null) {
                  return false;
               }
            } else if (!this$pngSticker.equals(other$pngSticker)) {
               return false;
            }

            Object this$tgsSticker = this.getTgsSticker();
            Object other$tgsSticker = other.getTgsSticker();
            if (this$tgsSticker == null) {
               if (other$tgsSticker != null) {
                  return false;
               }
            } else if (!this$tgsSticker.equals(other$tgsSticker)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CreateNewStickerSet;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $containsMasks = this.getContainsMasks();
      result = result * 59 + ($containsMasks == null ? 43 : $containsMasks.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $emojis = this.getEmojis();
      result = result * 59 + ($emojis == null ? 43 : $emojis.hashCode());
      Object $maskPosition = this.getMaskPosition();
      result = result * 59 + ($maskPosition == null ? 43 : $maskPosition.hashCode());
      Object $pngSticker = this.getPngSticker();
      result = result * 59 + ($pngSticker == null ? 43 : $pngSticker.hashCode());
      Object $tgsSticker = this.getTgsSticker();
      result = result * 59 + ($tgsSticker == null ? 43 : $tgsSticker.hashCode());
      return result;
   }

   @NonNull
   public Long getUserId() {
      return this.userId;
   }

   @NonNull
   public String getName() {
      return this.name;
   }

   @NonNull
   public String getTitle() {
      return this.title;
   }

   @NonNull
   public String getEmojis() {
      return this.emojis;
   }

   public Boolean getContainsMasks() {
      return this.containsMasks;
   }

   public MaskPosition getMaskPosition() {
      return this.maskPosition;
   }

   public InputFile getPngSticker() {
      return this.pngSticker;
   }

   public InputFile getTgsSticker() {
      return this.tgsSticker;
   }

   public void setUserId(@NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
      }
   }

   public void setName(@NonNull String name) {
      if (name == null) {
         throw new NullPointerException("name is marked non-null but is null");
      } else {
         this.name = name;
      }
   }

   public void setTitle(@NonNull String title) {
      if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.title = title;
      }
   }

   public void setEmojis(@NonNull String emojis) {
      if (emojis == null) {
         throw new NullPointerException("emojis is marked non-null but is null");
      } else {
         this.emojis = emojis;
      }
   }

   public void setContainsMasks(Boolean containsMasks) {
      this.containsMasks = containsMasks;
   }

   public void setMaskPosition(MaskPosition maskPosition) {
      this.maskPosition = maskPosition;
   }

   public void setPngSticker(InputFile pngSticker) {
      this.pngSticker = pngSticker;
   }

   public void setTgsSticker(InputFile tgsSticker) {
      this.tgsSticker = tgsSticker;
   }

   public String toString() {
      return "CreateNewStickerSet(userId=" + this.getUserId() + ", name=" + this.getName() + ", title=" + this.getTitle() + ", emojis=" + this.getEmojis() + ", containsMasks=" + this.getContainsMasks() + ", maskPosition=" + this.getMaskPosition() + ", pngSticker=" + this.getPngSticker() + ", tgsSticker=" + this.getTgsSticker() + ")";
   }

   public CreateNewStickerSet(@NonNull Long userId, @NonNull String name, @NonNull String title, @NonNull String emojis) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else if (name == null) {
         throw new NullPointerException("name is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (emojis == null) {
         throw new NullPointerException("emojis is marked non-null but is null");
      } else {
         this.userId = userId;
         this.name = name;
         this.title = title;
         this.emojis = emojis;
      }
   }

   public CreateNewStickerSet() {
   }

   public CreateNewStickerSet(@NonNull Long userId, @NonNull String name, @NonNull String title, @NonNull String emojis, Boolean containsMasks, MaskPosition maskPosition, InputFile pngSticker, InputFile tgsSticker) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else if (name == null) {
         throw new NullPointerException("name is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (emojis == null) {
         throw new NullPointerException("emojis is marked non-null but is null");
      } else {
         this.userId = userId;
         this.name = name;
         this.title = title;
         this.emojis = emojis;
         this.containsMasks = containsMasks;
         this.maskPosition = maskPosition;
         this.pngSticker = pngSticker;
         this.tgsSticker = tgsSticker;
      }
   }

   public static class CreateNewStickerSetBuilder {
      private Long userId;
      private String name;
      private String title;
      private String emojis;
      private Boolean containsMasks;
      private MaskPosition maskPosition;
      private InputFile pngSticker;
      private InputFile tgsSticker;

      CreateNewStickerSetBuilder() {
      }

      public CreateNewStickerSet.CreateNewStickerSetBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      public CreateNewStickerSet.CreateNewStickerSetBuilder name(@NonNull String name) {
         if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
         } else {
            this.name = name;
            return this;
         }
      }

      public CreateNewStickerSet.CreateNewStickerSetBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      public CreateNewStickerSet.CreateNewStickerSetBuilder emojis(@NonNull String emojis) {
         if (emojis == null) {
            throw new NullPointerException("emojis is marked non-null but is null");
         } else {
            this.emojis = emojis;
            return this;
         }
      }

      public CreateNewStickerSet.CreateNewStickerSetBuilder containsMasks(Boolean containsMasks) {
         this.containsMasks = containsMasks;
         return this;
      }

      public CreateNewStickerSet.CreateNewStickerSetBuilder maskPosition(MaskPosition maskPosition) {
         this.maskPosition = maskPosition;
         return this;
      }

      public CreateNewStickerSet.CreateNewStickerSetBuilder pngSticker(InputFile pngSticker) {
         this.pngSticker = pngSticker;
         return this;
      }

      public CreateNewStickerSet.CreateNewStickerSetBuilder tgsSticker(InputFile tgsSticker) {
         this.tgsSticker = tgsSticker;
         return this;
      }

      public CreateNewStickerSet build() {
         return new CreateNewStickerSet(this.userId, this.name, this.title, this.emojis, this.containsMasks, this.maskPosition, this.pngSticker, this.tgsSticker);
      }

      public String toString() {
         return "CreateNewStickerSet.CreateNewStickerSetBuilder(userId=" + this.userId + ", name=" + this.name + ", title=" + this.title + ", emojis=" + this.emojis + ", containsMasks=" + this.containsMasks + ", maskPosition=" + this.maskPosition + ", pngSticker=" + this.pngSticker + ", tgsSticker=" + this.tgsSticker + ")";
      }
   }
}
