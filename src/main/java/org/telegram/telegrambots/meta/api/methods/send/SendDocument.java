package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendDocument extends PartialBotApiMethod<Message> {
   public static final String PATH = "senddocument";
   public static final String CHATID_FIELD = "chat_id";
   public static final String DOCUMENT_FIELD = "document";
   public static final String CAPTION_FIELD = "caption";
   public static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   public static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   public static final String REPLYMARKUP_FIELD = "reply_markup";
   public static final String PARSEMODE_FIELD = "parse_mode";
   public static final String THUMB_FIELD = "thumb";
   public static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   public static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   public static final String DISABLECONTENTTYPEDETECTION_FIELD = "disable_content_type_detection";
   @NonNull
   private String chatId;
   @NonNull
   private InputFile document;
   private String caption;
   private Boolean disableNotification;
   private Integer replyToMessageId;
   private ReplyKeyboard replyMarkup;
   private String parseMode;
   private InputFile thumb;
   private List<MessageEntity> captionEntities;
   private Boolean allowSendingWithoutReply;
   private Boolean disableContentTypeDetection;

   public void enableNotification() {
      this.disableNotification = false;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending document", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.document == null) {
            throw new TelegramApiValidationException("Document parameter can't be empty", this);
         } else if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
            throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
         } else {
            this.document.validate();
            if (this.thumb != null) {
               this.thumb.validate();
            }

            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendDocument.SendDocumentBuilder builder() {
      return new SendDocument.SendDocumentBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendDocument)) {
         return false;
      } else {
         SendDocument other = (SendDocument)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label143: {
               Object this$disableNotification = this.getDisableNotification();
               Object other$disableNotification = other.getDisableNotification();
               if (this$disableNotification == null) {
                  if (other$disableNotification == null) {
                     break label143;
                  }
               } else if (this$disableNotification.equals(other$disableNotification)) {
                  break label143;
               }

               return false;
            }

            Object this$replyToMessageId = this.getReplyToMessageId();
            Object other$replyToMessageId = other.getReplyToMessageId();
            if (this$replyToMessageId == null) {
               if (other$replyToMessageId != null) {
                  return false;
               }
            } else if (!this$replyToMessageId.equals(other$replyToMessageId)) {
               return false;
            }

            Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
            Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
            if (this$allowSendingWithoutReply == null) {
               if (other$allowSendingWithoutReply != null) {
                  return false;
               }
            } else if (!this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
               return false;
            }

            label122: {
               Object this$disableContentTypeDetection = this.getDisableContentTypeDetection();
               Object other$disableContentTypeDetection = other.getDisableContentTypeDetection();
               if (this$disableContentTypeDetection == null) {
                  if (other$disableContentTypeDetection == null) {
                     break label122;
                  }
               } else if (this$disableContentTypeDetection.equals(other$disableContentTypeDetection)) {
                  break label122;
               }

               return false;
            }

            label115: {
               Object this$chatId = this.getChatId();
               Object other$chatId = other.getChatId();
               if (this$chatId == null) {
                  if (other$chatId == null) {
                     break label115;
                  }
               } else if (this$chatId.equals(other$chatId)) {
                  break label115;
               }

               return false;
            }

            Object this$document = this.getDocument();
            Object other$document = other.getDocument();
            if (this$document == null) {
               if (other$document != null) {
                  return false;
               }
            } else if (!this$document.equals(other$document)) {
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

            label94: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label94;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label94;
               }

               return false;
            }

            label87: {
               Object this$parseMode = this.getParseMode();
               Object other$parseMode = other.getParseMode();
               if (this$parseMode == null) {
                  if (other$parseMode == null) {
                     break label87;
                  }
               } else if (this$parseMode.equals(other$parseMode)) {
                  break label87;
               }

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
      return other instanceof SendDocument;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $disableNotification = this.getDisableNotification();
      int result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $disableContentTypeDetection = this.getDisableContentTypeDetection();
      result = result * 59 + ($disableContentTypeDetection == null ? 43 : $disableContentTypeDetection.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $document = this.getDocument();
      result = result * 59 + ($document == null ? 43 : $document.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      Object $captionEntities = this.getCaptionEntities();
      result = result * 59 + ($captionEntities == null ? 43 : $captionEntities.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public InputFile getDocument() {
      return this.document;
   }

   public String getCaption() {
      return this.caption;
   }

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public ReplyKeyboard getReplyMarkup() {
      return this.replyMarkup;
   }

   public String getParseMode() {
      return this.parseMode;
   }

   public InputFile getThumb() {
      return this.thumb;
   }

   public List<MessageEntity> getCaptionEntities() {
      return this.captionEntities;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
   }

   public Boolean getDisableContentTypeDetection() {
      return this.disableContentTypeDetection;
   }

   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public void setDocument(@NonNull InputFile document) {
      if (document == null) {
         throw new NullPointerException("document is marked non-null but is null");
      } else {
         this.document = document;
      }
   }

   public void setCaption(String caption) {
      this.caption = caption;
   }

   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   public void setReplyMarkup(ReplyKeyboard replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   public void setThumb(InputFile thumb) {
      this.thumb = thumb;
   }

   public void setCaptionEntities(List<MessageEntity> captionEntities) {
      this.captionEntities = captionEntities;
   }

   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   public void setDisableContentTypeDetection(Boolean disableContentTypeDetection) {
      this.disableContentTypeDetection = disableContentTypeDetection;
   }

   public String toString() {
      return "SendDocument(chatId=" + this.getChatId() + ", document=" + this.getDocument() + ", caption=" + this.getCaption() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", parseMode=" + this.getParseMode() + ", thumb=" + this.getThumb() + ", captionEntities=" + this.getCaptionEntities() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ", disableContentTypeDetection=" + this.getDisableContentTypeDetection() + ")";
   }

   public SendDocument(@NonNull String chatId, @NonNull InputFile document) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (document == null) {
         throw new NullPointerException("document is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.document = document;
      }
   }

   public SendDocument() {
   }

   public SendDocument(@NonNull String chatId, @NonNull InputFile document, String caption, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, String parseMode, InputFile thumb, List<MessageEntity> captionEntities, Boolean allowSendingWithoutReply, Boolean disableContentTypeDetection) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (document == null) {
         throw new NullPointerException("document is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.document = document;
         this.caption = caption;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.parseMode = parseMode;
         this.thumb = thumb;
         this.captionEntities = captionEntities;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         this.disableContentTypeDetection = disableContentTypeDetection;
      }
   }

   public static class SendDocumentBuilder {
      private String chatId;
      private InputFile document;
      private String caption;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private String parseMode;
      private InputFile thumb;
      private ArrayList<MessageEntity> captionEntities;
      private Boolean allowSendingWithoutReply;
      private Boolean disableContentTypeDetection;

      SendDocumentBuilder() {
      }

      public SendDocument.SendDocumentBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public SendDocument.SendDocumentBuilder document(@NonNull InputFile document) {
         if (document == null) {
            throw new NullPointerException("document is marked non-null but is null");
         } else {
            this.document = document;
            return this;
         }
      }

      public SendDocument.SendDocumentBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public SendDocument.SendDocumentBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      public SendDocument.SendDocumentBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      public SendDocument.SendDocumentBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public SendDocument.SendDocumentBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public SendDocument.SendDocumentBuilder thumb(InputFile thumb) {
         this.thumb = thumb;
         return this;
      }

      public SendDocument.SendDocumentBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      public SendDocument.SendDocumentBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public SendDocument.SendDocumentBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public SendDocument.SendDocumentBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendDocument.SendDocumentBuilder disableContentTypeDetection(Boolean disableContentTypeDetection) {
         this.disableContentTypeDetection = disableContentTypeDetection;
         return this;
      }

      public SendDocument build() {
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

         return new SendDocument(this.chatId, this.document, this.caption, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.parseMode, this.thumb, captionEntities, this.allowSendingWithoutReply, this.disableContentTypeDetection);
      }

      public String toString() {
         return "SendDocument.SendDocumentBuilder(chatId=" + this.chatId + ", document=" + this.document + ", caption=" + this.caption + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", parseMode=" + this.parseMode + ", thumb=" + this.thumb + ", captionEntities=" + this.captionEntities + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ", disableContentTypeDetection=" + this.disableContentTypeDetection + ")";
      }
   }
}
