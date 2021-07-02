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
public class InlineQueryResultCachedDocument implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String TITLE_FIELD = "title";
   private static final String DOCUMENT_FILE_ID_FIELD = "document_file_id";
   private static final String DESCRIPTION_FIELD = "description";
   private static final String CAPTION_FIELD = "caption";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("type")
   private final String type = "document";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("title")
   private String title;
   @JsonProperty("document_file_id")
   @NonNull
   private String documentFileId;
   @JsonProperty("description")
   private String description;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("input_message_content")
   private InputMessageContent inputMessageContent;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.documentFileId != null && !this.documentFileId.isEmpty()) {
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
            throw new TelegramApiValidationException("DocumentFileId parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder builder() {
      return new InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultCachedDocument)) {
         return false;
      } else {
         InlineQueryResultCachedDocument other = (InlineQueryResultCachedDocument)o;
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

            Object this$title = this.getTitle();
            Object other$title = other.getTitle();
            if (this$title == null) {
               if (other$title != null) {
                  return false;
               }
            } else if (!this$title.equals(other$title)) {
               return false;
            }

            label110: {
               Object this$documentFileId = this.getDocumentFileId();
               Object other$documentFileId = other.getDocumentFileId();
               if (this$documentFileId == null) {
                  if (other$documentFileId == null) {
                     break label110;
                  }
               } else if (this$documentFileId.equals(other$documentFileId)) {
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
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label89;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label89;
               }

               return false;
            }

            label82: {
               Object this$inputMessageContent = this.getInputMessageContent();
               Object other$inputMessageContent = other.getInputMessageContent();
               if (this$inputMessageContent == null) {
                  if (other$inputMessageContent == null) {
                     break label82;
                  }
               } else if (this$inputMessageContent.equals(other$inputMessageContent)) {
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
      return other instanceof InlineQueryResultCachedDocument;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $type = this.getType();
      int result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $documentFileId = this.getDocumentFileId();
      result = result * 59 + ($documentFileId == null ? 43 : $documentFileId.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $inputMessageContent = this.getInputMessageContent();
      result = result * 59 + ($inputMessageContent == null ? 43 : $inputMessageContent.hashCode());
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

   public String getTitle() {
      return this.title;
   }

   @NonNull
   public String getDocumentFileId() {
      return this.documentFileId;
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
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("document_file_id")
   public void setDocumentFileId(@NonNull String documentFileId) {
      if (documentFileId == null) {
         throw new NullPointerException("documentFileId is marked non-null but is null");
      } else {
         this.documentFileId = documentFileId;
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

   @JsonProperty("parse_mode")
   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   @JsonProperty("caption_entities")
   public void setCaptionEntities(List<MessageEntity> captionEntities) {
      this.captionEntities = captionEntities;
   }

   public String toString() {
      return "InlineQueryResultCachedDocument(type=" + this.getType() + ", id=" + this.getId() + ", title=" + this.getTitle() + ", documentFileId=" + this.getDocumentFileId() + ", description=" + this.getDescription() + ", caption=" + this.getCaption() + ", replyMarkup=" + this.getReplyMarkup() + ", inputMessageContent=" + this.getInputMessageContent() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultCachedDocument(@NonNull String id, @NonNull String documentFileId) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (documentFileId == null) {
         throw new NullPointerException("documentFileId is marked non-null but is null");
      } else {
         this.id = id;
         this.documentFileId = documentFileId;
      }
   }

   public InlineQueryResultCachedDocument() {
   }

   public InlineQueryResultCachedDocument(@NonNull String id, String title, @NonNull String documentFileId, String description, String caption, InlineKeyboardMarkup replyMarkup, InputMessageContent inputMessageContent, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (documentFileId == null) {
         throw new NullPointerException("documentFileId is marked non-null but is null");
      } else {
         this.id = id;
         this.title = title;
         this.documentFileId = documentFileId;
         this.description = description;
         this.caption = caption;
         this.replyMarkup = replyMarkup;
         this.inputMessageContent = inputMessageContent;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultCachedDocumentBuilder {
      private String id;
      private String title;
      private String documentFileId;
      private String description;
      private String caption;
      private InlineKeyboardMarkup replyMarkup;
      private InputMessageContent inputMessageContent;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultCachedDocumentBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder title(String title) {
         this.title = title;
         return this;
      }

      @JsonProperty("document_file_id")
      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder documentFileId(@NonNull String documentFileId) {
         if (documentFileId == null) {
            throw new NullPointerException("documentFileId is marked non-null but is null");
         } else {
            this.documentFileId = documentFileId;
            return this;
         }
      }

      @JsonProperty("description")
      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder description(String description) {
         this.description = description;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultCachedDocument build() {
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

         return new InlineQueryResultCachedDocument(this.id, this.title, this.documentFileId, this.description, this.caption, this.replyMarkup, this.inputMessageContent, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultCachedDocument.InlineQueryResultCachedDocumentBuilder(id=" + this.id + ", title=" + this.title + ", documentFileId=" + this.documentFileId + ", description=" + this.description + ", caption=" + this.caption + ", replyMarkup=" + this.replyMarkup + ", inputMessageContent=" + this.inputMessageContent + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
