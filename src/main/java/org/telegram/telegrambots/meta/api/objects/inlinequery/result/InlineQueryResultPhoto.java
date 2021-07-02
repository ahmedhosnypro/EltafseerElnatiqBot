package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

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
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultPhoto implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String PHOTOURL_FIELD = "photo_url";
   private static final String MIMETYPE_FIELD = "mime_type";
   private static final String PHOTOWIDTH_FIELD = "photo_width";
   private static final String PHOTOHEIGHT_FIELD = "photo_height";
   private static final String THUMBURL_FIELD = "thumb_url";
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
   @JsonProperty("photo_url")
   @NonNull
   private String photoUrl;
   @JsonProperty("mime_type")
   private String mimeType;
   @JsonProperty("photo_width")
   private Integer photoWidth;
   @JsonProperty("photo_height")
   private Integer photoHeight;
   @JsonProperty("thumb_url")
   private String thumbUrl;
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
         if (this.photoUrl != null && !this.photoUrl.isEmpty()) {
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
            throw new TelegramApiValidationException("PhotoUrl parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultPhoto.InlineQueryResultPhotoBuilder builder() {
      return new InlineQueryResultPhoto.InlineQueryResultPhotoBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultPhoto)) {
         return false;
      } else {
         InlineQueryResultPhoto other = (InlineQueryResultPhoto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$photoWidth = this.getPhotoWidth();
            Object other$photoWidth = other.getPhotoWidth();
            if (this$photoWidth == null) {
               if (other$photoWidth != null) {
                  return false;
               }
            } else if (!this$photoWidth.equals(other$photoWidth)) {
               return false;
            }

            Object this$photoHeight = this.getPhotoHeight();
            Object other$photoHeight = other.getPhotoHeight();
            if (this$photoHeight == null) {
               if (other$photoHeight != null) {
                  return false;
               }
            } else if (!this$photoHeight.equals(other$photoHeight)) {
               return false;
            }

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            label158: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label158;
                  }
               } else if (this$id.equals(other$id)) {
                  break label158;
               }

               return false;
            }

            label151: {
               Object this$photoUrl = this.getPhotoUrl();
               Object other$photoUrl = other.getPhotoUrl();
               if (this$photoUrl == null) {
                  if (other$photoUrl == null) {
                     break label151;
                  }
               } else if (this$photoUrl.equals(other$photoUrl)) {
                  break label151;
               }

               return false;
            }

            Object this$mimeType = this.getMimeType();
            Object other$mimeType = other.getMimeType();
            if (this$mimeType == null) {
               if (other$mimeType != null) {
                  return false;
               }
            } else if (!this$mimeType.equals(other$mimeType)) {
               return false;
            }

            label137: {
               Object this$thumbUrl = this.getThumbUrl();
               Object other$thumbUrl = other.getThumbUrl();
               if (this$thumbUrl == null) {
                  if (other$thumbUrl == null) {
                     break label137;
                  }
               } else if (this$thumbUrl.equals(other$thumbUrl)) {
                  break label137;
               }

               return false;
            }

            label130: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label130;
                  }
               } else if (this$title.equals(other$title)) {
                  break label130;
               }

               return false;
            }

            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
               if (other$description != null) {
                  return false;
               }
            } else if (!this$description.equals(other$description)) {
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

            label109: {
               Object this$inputMessageContent = this.getInputMessageContent();
               Object other$inputMessageContent = other.getInputMessageContent();
               if (this$inputMessageContent == null) {
                  if (other$inputMessageContent == null) {
                     break label109;
                  }
               } else if (this$inputMessageContent.equals(other$inputMessageContent)) {
                  break label109;
               }

               return false;
            }

            label102: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label102;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label102;
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
      return other instanceof InlineQueryResultPhoto;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $photoWidth = this.getPhotoWidth();
      int result = result * 59 + ($photoWidth == null ? 43 : $photoWidth.hashCode());
      Object $photoHeight = this.getPhotoHeight();
      result = result * 59 + ($photoHeight == null ? 43 : $photoHeight.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $photoUrl = this.getPhotoUrl();
      result = result * 59 + ($photoUrl == null ? 43 : $photoUrl.hashCode());
      Object $mimeType = this.getMimeType();
      result = result * 59 + ($mimeType == null ? 43 : $mimeType.hashCode());
      Object $thumbUrl = this.getThumbUrl();
      result = result * 59 + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
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
   public String getPhotoUrl() {
      return this.photoUrl;
   }

   public String getMimeType() {
      return this.mimeType;
   }

   public Integer getPhotoWidth() {
      return this.photoWidth;
   }

   public Integer getPhotoHeight() {
      return this.photoHeight;
   }

   public String getThumbUrl() {
      return this.thumbUrl;
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

   @JsonProperty("photo_url")
   public void setPhotoUrl(@NonNull String photoUrl) {
      if (photoUrl == null) {
         throw new NullPointerException("photoUrl is marked non-null but is null");
      } else {
         this.photoUrl = photoUrl;
      }
   }

   @JsonProperty("mime_type")
   public void setMimeType(String mimeType) {
      this.mimeType = mimeType;
   }

   @JsonProperty("photo_width")
   public void setPhotoWidth(Integer photoWidth) {
      this.photoWidth = photoWidth;
   }

   @JsonProperty("photo_height")
   public void setPhotoHeight(Integer photoHeight) {
      this.photoHeight = photoHeight;
   }

   @JsonProperty("thumb_url")
   public void setThumbUrl(String thumbUrl) {
      this.thumbUrl = thumbUrl;
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
      return "InlineQueryResultPhoto(type=" + this.getType() + ", id=" + this.getId() + ", photoUrl=" + this.getPhotoUrl() + ", mimeType=" + this.getMimeType() + ", photoWidth=" + this.getPhotoWidth() + ", photoHeight=" + this.getPhotoHeight() + ", thumbUrl=" + this.getThumbUrl() + ", title=" + this.getTitle() + ", description=" + this.getDescription() + ", caption=" + this.getCaption() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultPhoto(@NonNull String id, @NonNull String photoUrl) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (photoUrl == null) {
         throw new NullPointerException("photoUrl is marked non-null but is null");
      } else {
         this.id = id;
         this.photoUrl = photoUrl;
      }
   }

   public InlineQueryResultPhoto() {
   }

   public InlineQueryResultPhoto(@NonNull String id, @NonNull String photoUrl, String mimeType, Integer photoWidth, Integer photoHeight, String thumbUrl, String title, String description, String caption, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (photoUrl == null) {
         throw new NullPointerException("photoUrl is marked non-null but is null");
      } else {
         this.id = id;
         this.photoUrl = photoUrl;
         this.mimeType = mimeType;
         this.photoWidth = photoWidth;
         this.photoHeight = photoHeight;
         this.thumbUrl = thumbUrl;
         this.title = title;
         this.description = description;
         this.caption = caption;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultPhotoBuilder {
      private String id;
      private String photoUrl;
      private String mimeType;
      private Integer photoWidth;
      private Integer photoHeight;
      private String thumbUrl;
      private String title;
      private String description;
      private String caption;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultPhotoBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("photo_url")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder photoUrl(@NonNull String photoUrl) {
         if (photoUrl == null) {
            throw new NullPointerException("photoUrl is marked non-null but is null");
         } else {
            this.photoUrl = photoUrl;
            return this;
         }
      }

      @JsonProperty("mime_type")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder mimeType(String mimeType) {
         this.mimeType = mimeType;
         return this;
      }

      @JsonProperty("photo_width")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder photoWidth(Integer photoWidth) {
         this.photoWidth = photoWidth;
         return this;
      }

      @JsonProperty("photo_height")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder photoHeight(Integer photoHeight) {
         this.photoHeight = photoHeight;
         return this;
      }

      @JsonProperty("thumb_url")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder thumbUrl(String thumbUrl) {
         this.thumbUrl = thumbUrl;
         return this;
      }

      @JsonProperty("title")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder title(String title) {
         this.title = title;
         return this;
      }

      @JsonProperty("description")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder description(String description) {
         this.description = description;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultPhoto.InlineQueryResultPhotoBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultPhoto build() {
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

         return new InlineQueryResultPhoto(this.id, this.photoUrl, this.mimeType, this.photoWidth, this.photoHeight, this.thumbUrl, this.title, this.description, this.caption, this.inputMessageContent, this.replyMarkup, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultPhoto.InlineQueryResultPhotoBuilder(id=" + this.id + ", photoUrl=" + this.photoUrl + ", mimeType=" + this.mimeType + ", photoWidth=" + this.photoWidth + ", photoHeight=" + this.photoHeight + ", thumbUrl=" + this.thumbUrl + ", title=" + this.title + ", description=" + this.description + ", caption=" + this.caption + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
