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
public class InlineQueryResultDocument implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String TITLE_FIELD = "title";
   private static final String DOCUMENTURL_FIELD = "document_url";
   private static final String MIMETYPE_FIELD = "mime_type";
   private static final String DESCRIPTION_FIELD = "description";
   private static final String CAPTION_FIELD = "caption";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String THUMBURL_FIELD = "thumb_url";
   private static final String THUMBWIDTH_FIELD = "thumb_width";
   private static final String THUMBHEIGHT_FIELD = "thumb_height";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("type")
   private final String type = "document";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("title")
   @NonNull
   private String title;
   @JsonProperty("document_url")
   @NonNull
   private String documentUrl;
   @JsonProperty("mime_type")
   @NonNull
   private String mimeType;
   @JsonProperty("description")
   private String description;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("input_message_content")
   private InputMessageContent inputMessageContent;
   @JsonProperty("thumb_url")
   private String thumbUrl;
   @JsonProperty("thumb_width")
   private Integer thumbWidth;
   @JsonProperty("thumb_height")
   private Integer thumbHeight;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.mimeType != null && !this.mimeType.isEmpty()) {
            if (this.documentUrl != null && !this.documentUrl.isEmpty()) {
               if (this.title != null && !this.title.isEmpty()) {
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
                  throw new TelegramApiValidationException("Title parameter can't be empty", this);
               }
            } else {
               throw new TelegramApiValidationException("DocumentUrl parameter can't be empty", this);
            }
         } else {
            throw new TelegramApiValidationException("Mimetype parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultDocument.InlineQueryResultDocumentBuilder builder() {
      return new InlineQueryResultDocument.InlineQueryResultDocumentBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultDocument)) {
         return false;
      } else {
         InlineQueryResultDocument other = (InlineQueryResultDocument)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$thumbWidth = this.getThumbWidth();
            Object other$thumbWidth = other.getThumbWidth();
            if (this$thumbWidth == null) {
               if (other$thumbWidth != null) {
                  return false;
               }
            } else if (!this$thumbWidth.equals(other$thumbWidth)) {
               return false;
            }

            Object this$thumbHeight = this.getThumbHeight();
            Object other$thumbHeight = other.getThumbHeight();
            if (this$thumbHeight == null) {
               if (other$thumbHeight != null) {
                  return false;
               }
            } else if (!this$thumbHeight.equals(other$thumbHeight)) {
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
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label151;
                  }
               } else if (this$title.equals(other$title)) {
                  break label151;
               }

               return false;
            }

            Object this$documentUrl = this.getDocumentUrl();
            Object other$documentUrl = other.getDocumentUrl();
            if (this$documentUrl == null) {
               if (other$documentUrl != null) {
                  return false;
               }
            } else if (!this$documentUrl.equals(other$documentUrl)) {
               return false;
            }

            label137: {
               Object this$mimeType = this.getMimeType();
               Object other$mimeType = other.getMimeType();
               if (this$mimeType == null) {
                  if (other$mimeType == null) {
                     break label137;
                  }
               } else if (this$mimeType.equals(other$mimeType)) {
                  break label137;
               }

               return false;
            }

            label130: {
               Object this$description = this.getDescription();
               Object other$description = other.getDescription();
               if (this$description == null) {
                  if (other$description == null) {
                     break label130;
                  }
               } else if (this$description.equals(other$description)) {
                  break label130;
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

            Object this$replyMarkup = this.getReplyMarkup();
            Object other$replyMarkup = other.getReplyMarkup();
            if (this$replyMarkup == null) {
               if (other$replyMarkup != null) {
                  return false;
               }
            } else if (!this$replyMarkup.equals(other$replyMarkup)) {
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
               Object this$thumbUrl = this.getThumbUrl();
               Object other$thumbUrl = other.getThumbUrl();
               if (this$thumbUrl == null) {
                  if (other$thumbUrl == null) {
                     break label102;
                  }
               } else if (this$thumbUrl.equals(other$thumbUrl)) {
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
      return other instanceof InlineQueryResultDocument;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $thumbWidth = this.getThumbWidth();
      int result = result * 59 + ($thumbWidth == null ? 43 : $thumbWidth.hashCode());
      Object $thumbHeight = this.getThumbHeight();
      result = result * 59 + ($thumbHeight == null ? 43 : $thumbHeight.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $documentUrl = this.getDocumentUrl();
      result = result * 59 + ($documentUrl == null ? 43 : $documentUrl.hashCode());
      Object $mimeType = this.getMimeType();
      result = result * 59 + ($mimeType == null ? 43 : $mimeType.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $inputMessageContent = this.getInputMessageContent();
      result = result * 59 + ($inputMessageContent == null ? 43 : $inputMessageContent.hashCode());
      Object $thumbUrl = this.getThumbUrl();
      result = result * 59 + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $captionEntities = this.getCaptionEntities();
      result = result * 59 + ($captionEntities == null ? 43 : $captionEntities.hashCode());
      return result;
   }

   public String getType() {
      Objects.requireNonNull(this);
      return "document";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getTitle() {
      return this.title;
   }

   @NonNull
   public String getDocumentUrl() {
      return this.documentUrl;
   }

   @NonNull
   public String getMimeType() {
      return this.mimeType;
   }

   public String getDescription() {
      return this.description;
   }

   public String getCaption() {
      return this.caption;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
   }

   public InputMessageContent getInputMessageContent() {
      return this.inputMessageContent;
   }

   public String getThumbUrl() {
      return this.thumbUrl;
   }

   public Integer getThumbWidth() {
      return this.thumbWidth;
   }

   public Integer getThumbHeight() {
      return this.thumbHeight;
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

   @JsonProperty("title")
   public void setTitle(@NonNull String title) {
      if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.title = title;
      }
   }

   @JsonProperty("document_url")
   public void setDocumentUrl(@NonNull String documentUrl) {
      if (documentUrl == null) {
         throw new NullPointerException("documentUrl is marked non-null but is null");
      } else {
         this.documentUrl = documentUrl;
      }
   }

   @JsonProperty("mime_type")
   public void setMimeType(@NonNull String mimeType) {
      if (mimeType == null) {
         throw new NullPointerException("mimeType is marked non-null but is null");
      } else {
         this.mimeType = mimeType;
      }
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("caption")
   public void setCaption(String caption) {
      this.caption = caption;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("input_message_content")
   public void setInputMessageContent(InputMessageContent inputMessageContent) {
      this.inputMessageContent = inputMessageContent;
   }

   @JsonProperty("thumb_url")
   public void setThumbUrl(String thumbUrl) {
      this.thumbUrl = thumbUrl;
   }

   @JsonProperty("thumb_width")
   public void setThumbWidth(Integer thumbWidth) {
      this.thumbWidth = thumbWidth;
   }

   @JsonProperty("thumb_height")
   public void setThumbHeight(Integer thumbHeight) {
      this.thumbHeight = thumbHeight;
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
      return "InlineQueryResultDocument(type=" + this.getType() + ", id=" + this.getId() + ", title=" + this.getTitle() + ", documentUrl=" + this.getDocumentUrl() + ", mimeType=" + this.getMimeType() + ", description=" + this.getDescription() + ", caption=" + this.getCaption() + ", replyMarkup=" + this.getReplyMarkup() + ", inputMessageContent=" + this.getInputMessageContent() + ", thumbUrl=" + this.getThumbUrl() + ", thumbWidth=" + this.getThumbWidth() + ", thumbHeight=" + this.getThumbHeight() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultDocument(@NonNull String id, @NonNull String title, @NonNull String documentUrl, @NonNull String mimeType) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (documentUrl == null) {
         throw new NullPointerException("documentUrl is marked non-null but is null");
      } else if (mimeType == null) {
         throw new NullPointerException("mimeType is marked non-null but is null");
      } else {
         this.id = id;
         this.title = title;
         this.documentUrl = documentUrl;
         this.mimeType = mimeType;
      }
   }

   public InlineQueryResultDocument() {
   }

   public InlineQueryResultDocument(@NonNull String id, @NonNull String title, @NonNull String documentUrl, @NonNull String mimeType, String description, String caption, InlineKeyboardMarkup replyMarkup, InputMessageContent inputMessageContent, String thumbUrl, Integer thumbWidth, Integer thumbHeight, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (documentUrl == null) {
         throw new NullPointerException("documentUrl is marked non-null but is null");
      } else if (mimeType == null) {
         throw new NullPointerException("mimeType is marked non-null but is null");
      } else {
         this.id = id;
         this.title = title;
         this.documentUrl = documentUrl;
         this.mimeType = mimeType;
         this.description = description;
         this.caption = caption;
         this.replyMarkup = replyMarkup;
         this.inputMessageContent = inputMessageContent;
         this.thumbUrl = thumbUrl;
         this.thumbWidth = thumbWidth;
         this.thumbHeight = thumbHeight;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultDocumentBuilder {
      private String id;
      private String title;
      private String documentUrl;
      private String mimeType;
      private String description;
      private String caption;
      private InlineKeyboardMarkup replyMarkup;
      private InputMessageContent inputMessageContent;
      private String thumbUrl;
      private Integer thumbWidth;
      private Integer thumbHeight;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultDocumentBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      @JsonProperty("document_url")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder documentUrl(@NonNull String documentUrl) {
         if (documentUrl == null) {
            throw new NullPointerException("documentUrl is marked non-null but is null");
         } else {
            this.documentUrl = documentUrl;
            return this;
         }
      }

      @JsonProperty("mime_type")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder mimeType(@NonNull String mimeType) {
         if (mimeType == null) {
            throw new NullPointerException("mimeType is marked non-null but is null");
         } else {
            this.mimeType = mimeType;
            return this;
         }
      }

      @JsonProperty("description")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder description(String description) {
         this.description = description;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("thumb_url")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder thumbUrl(String thumbUrl) {
         this.thumbUrl = thumbUrl;
         return this;
      }

      @JsonProperty("thumb_width")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder thumbWidth(Integer thumbWidth) {
         this.thumbWidth = thumbWidth;
         return this;
      }

      @JsonProperty("thumb_height")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder thumbHeight(Integer thumbHeight) {
         this.thumbHeight = thumbHeight;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultDocument.InlineQueryResultDocumentBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultDocument build() {
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

         return new InlineQueryResultDocument(this.id, this.title, this.documentUrl, this.mimeType, this.description, this.caption, this.replyMarkup, this.inputMessageContent, this.thumbUrl, this.thumbWidth, this.thumbHeight, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultDocument.InlineQueryResultDocumentBuilder(id=" + this.id + ", title=" + this.title + ", documentUrl=" + this.documentUrl + ", mimeType=" + this.mimeType + ", description=" + this.description + ", caption=" + this.caption + ", replyMarkup=" + this.replyMarkup + ", inputMessageContent=" + this.inputMessageContent + ", thumbUrl=" + this.thumbUrl + ", thumbWidth=" + this.thumbWidth + ", thumbHeight=" + this.thumbHeight + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
