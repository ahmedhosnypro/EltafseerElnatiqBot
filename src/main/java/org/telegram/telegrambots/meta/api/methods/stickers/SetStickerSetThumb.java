package org.telegram.telegrambots.meta.api.methods.stickers;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetStickerSetThumb extends BotApiMethod<Boolean> {
   private static final String PATH = "setStickerSetThumb";
   public static final String NAME_FIELD = "name";
   public static final String USERID_FIELD = "user_id";
   public static final String THUMB_FIELD = "thumb";
   @NonNull
   private String name;
   @NonNull
   private Long userId;
   @NonNull
   private InputFile thumb;

   public String getMethod() {
      return "setStickerSetThumb";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error setting sticker thumb in set", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.name != null && !this.name.isEmpty()) {
         if (this.userId != null && this.userId != 0L) {
            if (this.thumb == null) {
               throw new TelegramApiValidationException("thumb can't be null", this);
            } else {
               this.thumb.validate();
            }
         } else {
            throw new TelegramApiValidationException("userId can't be null", this);
         }
      } else {
         throw new TelegramApiValidationException("name can't be null", this);
      }
   }

   public static SetStickerSetThumb.SetStickerSetThumbBuilder builder() {
      return new SetStickerSetThumb.SetStickerSetThumbBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetStickerSetThumb)) {
         return false;
      } else {
         SetStickerSetThumb other = (SetStickerSetThumb)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$userId = this.getUserId();
               Object other$userId = other.getUserId();
               if (this$userId == null) {
                  if (other$userId == null) {
                     break label47;
                  }
               } else if (this$userId.equals(other$userId)) {
                  break label47;
               }

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

            Object this$thumb = this.getThumb();
            Object other$thumb = other.getThumb();
            if (this$thumb == null) {
               if (other$thumb != null) {
                  return false;
               }
            } else if (!this$thumb.equals(other$thumb)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetStickerSetThumb;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      return result;
   }

   @NonNull
   public String getName() {
      return this.name;
   }

   @NonNull
   public Long getUserId() {
      return this.userId;
   }

   @NonNull
   public InputFile getThumb() {
      return this.thumb;
   }

   public void setName(@NonNull String name) {
      if (name == null) {
         throw new NullPointerException("name is marked non-null but is null");
      } else {
         this.name = name;
      }
   }

   public void setUserId(@NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
      }
   }

   public void setThumb(@NonNull InputFile thumb) {
      if (thumb == null) {
         throw new NullPointerException("thumb is marked non-null but is null");
      } else {
         this.thumb = thumb;
      }
   }

   public String toString() {
      return "SetStickerSetThumb(name=" + this.getName() + ", userId=" + this.getUserId() + ", thumb=" + this.getThumb() + ")";
   }

   public SetStickerSetThumb() {
   }

   public SetStickerSetThumb(@NonNull String name, @NonNull Long userId, @NonNull InputFile thumb) {
      if (name == null) {
         throw new NullPointerException("name is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else if (thumb == null) {
         throw new NullPointerException("thumb is marked non-null but is null");
      } else {
         this.name = name;
         this.userId = userId;
         this.thumb = thumb;
      }
   }

   public static class SetStickerSetThumbBuilder {
      private String name;
      private Long userId;
      private InputFile thumb;

      SetStickerSetThumbBuilder() {
      }

      public SetStickerSetThumb.SetStickerSetThumbBuilder name(@NonNull String name) {
         if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
         } else {
            this.name = name;
            return this;
         }
      }

      public SetStickerSetThumb.SetStickerSetThumbBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      public SetStickerSetThumb.SetStickerSetThumbBuilder thumb(@NonNull InputFile thumb) {
         if (thumb == null) {
            throw new NullPointerException("thumb is marked non-null but is null");
         } else {
            this.thumb = thumb;
            return this;
         }
      }

      public SetStickerSetThumb build() {
         return new SetStickerSetThumb(this.name, this.userId, this.thumb);
      }

      public String toString() {
         return "SetStickerSetThumb.SetStickerSetThumbBuilder(name=" + this.name + ", userId=" + this.userId + ", thumb=" + this.thumb + ")";
      }
   }
}
