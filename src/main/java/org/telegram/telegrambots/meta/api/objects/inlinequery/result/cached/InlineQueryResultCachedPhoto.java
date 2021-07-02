package org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultCachedPhoto implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String PHOTOFILEID_FIELD = "photo_file_id";
   private static final String TITLE_FIELD = "title";
   private static final String DESCRIPTION_FIELD = "description";
   private static final String CAPTION_FIELD = "caption";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("type")
   private final String type = "photo";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("photo_file_id")
   @NonNull
   private String photoFileId;
   @JsonProperty("title")
   private String title;
   @JsonProperty("description")
   private String description;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("input_message_content")
   private InputMessageContent inputMessageContent;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.photoFileId != null && !this.photoFileId.isEmpty()) {
            if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
               throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
            } else {
               if (this.inputMessageContent != null) {
                  this.inputMessageContent.validate();
               }

               if (this.replyMarkup != null) {
                  this.replyMarkup.validate();
               }

            }
         } else {
            throw new TelegramApiValidationException("PhotoFileId parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder builder() {
      return new InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultCachedPhoto)) {
         return false;
      } else {
         InlineQueryResultCachedPhoto other = (InlineQueryResultCachedPhoto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
               return false;
            }

            Object this$photoFileId = this.getPhotoFileId();
            Object other$photoFileId = other.getPhotoFileId();
            if (this$photoFileId == null) {
               if (other$photoFileId != null) {
                  return false;
               }
            } else if (!this$photoFileId.equals(other$photoFileId)) {
               return false;
            }

            label110: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label110;
                  }
               } else if (this$title.equals(other$title)) {
                  break label110;
               }

               return false;
            }

            label103: {
               Object this$description = this.getDescription();
               Object other$description = other.getDescription();
               if (this$description == null) {
                  if (other$description == null) {
                     break label103;
                  }
               } else if (this$description.equals(other$description)) {
                  break label103;
               }

               return false;
            }

            Object this$caption = this.getCaption();
            Object other$caption = other.getCaption();
            if (this$caption == null) {
               if (other$caption != null) {
                  return false;
               }
            } else if (!this$caption.equals(other$caption)) {
               return false;
            }

            label89: {
               Object this$inputMessageContent = this.getInputMessageContent();
               Object other$inputMessageContent = other.getInputMessageContent();
               if (this$inputMessageContent == null) {
                  if (other$inputMessageContent == null) {
                     break label89;
                  }
               } else if (this$inputMessageContent.equals(other$inputMessageContent)) {
                  break label89;
               }

               return false;
            }

            label82: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label82;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label82;
               }

               return false;
            }

            Object this$parseMode = this.getParseMode();
            Object other$parseMode = other.getParseMode();
            if (this$parseMode == null) {
               if (other$parseMode != null) {
                  return false;
               }
            } else if (!this$parseMode.equals(other$parseMode)) {
               return false;
            }

            Object this$captionEntities = this.getCaptionEntities();
            Object other$captionEntities = other.getCaptionEntities();
            if (this$captionEntities == null) {
               if (other$captionEntities != null) {
                  return false;
               }
            } else if (!this$captionEntities.equals(other$captionEntities)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InlineQueryResultCachedPhoto;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $type = this.getType();
      int result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $photoFileId = this.getPhotoFileId();
      result = result * 59 + ($photoFileId == null ? 43 : $photoFileId.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $inputMessageContent = this.getInputMessageContent();
      result = result * 59 + ($inputMessageContent == null ? 43 : $inputMessageContent.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $captionEntities = this.getCaptionEntities();
      result = result * 59 + ($captionEntities == null ? 43 : $captionEntities.hashCode());
      return result;
   }

   public String getType() {
      Objects.requireNonNull(this);
      return "photo";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getPhotoFileId() {
      return this.photoFileId;
   }

   public String getTitle() {
      return this.title;
   }

   public String getDescription() {
      return this.description;
   }

   public String getCaption() {
      return this.caption;
   }

   public InputMessageContent getInputMessageContent() {
      return this.inputMessageContent;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
   }

   public String getParseMode() {
      return this.parseMode;
   }

   public List<MessageEntity> getCaptionEntities() {
      return this.captionEntities;
   }

   @JsonProperty("id")
   public void setId(@NonNull String id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
      }
   }

   @JsonProperty("photo_file_id")
   public void setPhotoFileId(@NonNull String photoFileId) {
      if (photoFileId == null) {
         throw new NullPointerException("photoFileId is marked non-null but is null");
      } else {
         this.photoFileId = photoFileId;
      }
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("caption")
   public void setCaption(String caption) {
      this.caption = caption;
   }

   @JsonProperty("input_message_content")
   public void setInputMessageContent(InputMessageContent inputMessageContent) {
      this.inputMessageContent = inputMessageContent;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("parse_mode")
   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   @JsonProperty("caption_entities")
   public void setCaptionEntities(List<MessageEntity> captionEntities) {
      this.captionEntities = captionEntities;
   }

   public String toString() {
      return "InlineQueryResultCachedPhoto(type=" + this.getType() + ", id=" + this.getId() + ", photoFileId=" + this.getPhotoFileId() + ", title=" + this.getTitle() + ", description=" + this.getDescription() + ", caption=" + this.getCaption() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultCachedPhoto(@NonNull String id, @NonNull String photoFileId) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (photoFileId == null) {
         throw new NullPointerException("photoFileId is marked non-null but is null");
      } else {
         this.id = id;
         this.photoFileId = photoFileId;
      }
   }

   public InlineQueryResultCachedPhoto() {
   }

   public InlineQueryResultCachedPhoto(@NonNull String id, @NonNull String photoFileId, String title, String description, String caption, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (photoFileId == null) {
         throw new NullPointerException("photoFileId is marked non-null but is null");
      } else {
         this.id = id;
         this.photoFileId = photoFileId;
         this.title = title;
         this.description = description;
         this.caption = caption;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultCachedPhotoBuilder {
      private String id;
      private String photoFileId;
      private String title;
      private String description;
      private String caption;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultCachedPhotoBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("photo_file_id")
      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder photoFileId(@NonNull String photoFileId) {
         if (photoFileId == null) {
            throw new NullPointerException("photoFileId is marked non-null but is null");
         } else {
            this.photoFileId = photoFileId;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder title(String title) {
         this.title = title;
         return this;
      }

      @JsonProperty("description")
      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder description(String description) {
         this.description = description;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
         if (captionEntities == null) {
            throw new NullPointerException("captionEntities cannot be null");
         } else {
            if (this.captionEntities == null) {
               this.captionEntities = new ArrayList();
            }

            this.captionEntities.addAll(captionEntities);
            return this;
         }
      }

      public InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultCachedPhoto build() {
         List captionEntities;
         switch(this.captionEntities == null ? 0 : this.captionEntities.size()) {
         case 0:
            captionEntities = Collections.emptyList();
            break;
         case 1:
            captionEntities = Collections.singletonList((MessageEntity)this.captionEntities.get(0));
            break;
         default:
            captionEntities = Collections.unmodifiableList(new ArrayList(this.captionEntities));
         }

         return new InlineQueryResultCachedPhoto(this.id, this.photoFileId, this.title, this.description, this.caption, this.inputMessageContent, this.replyMarkup, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultCachedPhoto.InlineQueryResultCachedPhotoBuilder(id=" + this.id + ", photoFileId=" + this.photoFileId + ", title=" + this.title + ", description=" + this.description + ", caption=" + this.caption + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
