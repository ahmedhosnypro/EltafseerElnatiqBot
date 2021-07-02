package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.IOException;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.MessageId;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class CopyMessage extends BotApiMethod<MessageId> {
   public static final String PATH = "copyMessage";
   private static final String CHATID_FIELD = "chat_id";
   private static final String FROMCHATID_FIELD = "from_chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   private static final String CAPTION_FIELD = "caption";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTIONENTITIES_FIELD = "caption_entities";
   private static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   private static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   private static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("from_chat_id")
   @NonNull
   private String fromChatId;
   @JsonProperty("message_id")
   @NonNull
   private Integer messageId;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;
   @JsonProperty("reply_to_message_id")
   private Integer replyToMessageId;
   @JsonProperty("allow_sending_without_reply")
   private Boolean allowSendingWithoutReply;
   @JsonProperty("reply_markup")
   @JsonDeserialize
   private ReplyKeyboard replyMarkup;

   public void enableNotification() {
      this.disableNotification = null;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public void enableMarkdown(boolean enable) {
      if (enable) {
         this.parseMode = "Markdown";
      } else {
         this.parseMode = null;
      }

   }

   public void enableHtml(boolean enable) {
      if (enable) {
         this.parseMode = "html";
      } else {
         this.parseMode = null;
      }

   }

   public void enableMarkdownV2(boolean enable) {
      if (enable) {
         this.parseMode = "MarkdownV2";
      } else {
         this.parseMode = null;
      }

   }

   public String getMethod() {
      return "copyMessage";
   }

   public MessageId deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<MessageId> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<MessageId>>() {
         });
         if (result.getOk()) {
            return (MessageId)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error copying message", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.fromChatId == null) {
            throw new TelegramApiValidationException("FromChatId parameter can't be empty", this);
         } else if (this.messageId == null) {
            throw new TelegramApiValidationException("MessageId parameter can't be empty", this);
         } else if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
            throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
         } else {
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static CopyMessage.CopyMessageBuilder builder() {
      return new CopyMessage.CopyMessageBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CopyMessage)) {
         return false;
      } else {
         CopyMessage other = (CopyMessage)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$messageId = this.getMessageId();
            Object other$messageId = other.getMessageId();
            if (this$messageId == null) {
               if (other$messageId != null) {
                  return false;
               }
            } else if (!this$messageId.equals(other$messageId)) {
               return false;
            }

            Object this$disableNotification = this.getDisableNotification();
            Object other$disableNotification = other.getDisableNotification();
            if (this$disableNotification == null) {
               if (other$disableNotification != null) {
                  return false;
               }
            } else if (!this$disableNotification.equals(other$disableNotification)) {
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

            label110: {
               Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
               Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
               if (this$allowSendingWithoutReply == null) {
                  if (other$allowSendingWithoutReply == null) {
                     break label110;
                  }
               } else if (this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
                  break label110;
               }

               return false;
            }

            label103: {
               Object this$chatId = this.getChatId();
               Object other$chatId = other.getChatId();
               if (this$chatId == null) {
                  if (other$chatId == null) {
                     break label103;
                  }
               } else if (this$chatId.equals(other$chatId)) {
                  break label103;
               }

               return false;
            }

            Object this$fromChatId = this.getFromChatId();
            Object other$fromChatId = other.getFromChatId();
            if (this$fromChatId == null) {
               if (other$fromChatId != null) {
                  return false;
               }
            } else if (!this$fromChatId.equals(other$fromChatId)) {
               return false;
            }

            label89: {
               Object this$caption = this.getCaption();
               Object other$caption = other.getCaption();
               if (this$caption == null) {
                  if (other$caption == null) {
                     break label89;
                  }
               } else if (this$caption.equals(other$caption)) {
                  break label89;
               }

               return false;
            }

            label82: {
               Object this$parseMode = this.getParseMode();
               Object other$parseMode = other.getParseMode();
               if (this$parseMode == null) {
                  if (other$parseMode == null) {
                     break label82;
                  }
               } else if (this$parseMode.equals(other$parseMode)) {
                  break label82;
               }

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

            Object this$replyMarkup = this.getReplyMarkup();
            Object other$replyMarkup = other.getReplyMarkup();
            if (this$replyMarkup == null) {
               if (other$replyMarkup != null) {
                  return false;
               }
            } else if (!this$replyMarkup.equals(other$replyMarkup)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CopyMessage;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $fromChatId = this.getFromChatId();
      result = result * 59 + ($fromChatId == null ? 43 : $fromChatId.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $captionEntities = this.getCaptionEntities();
      result = result * 59 + ($captionEntities == null ? 43 : $captionEntities.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public String getFromChatId() {
      return this.fromChatId;
   }

   @NonNull
   public Integer getMessageId() {
      return this.messageId;
   }

   public String getCaption() {
      return this.caption;
   }

   public String getParseMode() {
      return this.parseMode;
   }

   public List<MessageEntity> getCaptionEntities() {
      return this.captionEntities;
   }

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
   }

   public ReplyKeyboard getReplyMarkup() {
      return this.replyMarkup;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("from_chat_id")
   public void setFromChatId(@NonNull String fromChatId) {
      if (fromChatId == null) {
         throw new NullPointerException("fromChatId is marked non-null but is null");
      } else {
         this.fromChatId = fromChatId;
      }
   }

   @JsonProperty("message_id")
   public void setMessageId(@NonNull Integer messageId) {
      if (messageId == null) {
         throw new NullPointerException("messageId is marked non-null but is null");
      } else {
         this.messageId = messageId;
      }
   }

   @JsonProperty("caption")
   public void setCaption(String caption) {
      this.caption = caption;
   }

   @JsonProperty("parse_mode")
   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   @JsonProperty("caption_entities")
   public void setCaptionEntities(List<MessageEntity> captionEntities) {
      this.captionEntities = captionEntities;
   }

   @JsonProperty("disable_notification")
   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   @JsonProperty("reply_to_message_id")
   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   @JsonProperty("allow_sending_without_reply")
   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   @JsonProperty("reply_markup")
   @JsonDeserialize
   public void setReplyMarkup(ReplyKeyboard replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   public String toString() {
      return "CopyMessage(chatId=" + this.getChatId() + ", fromChatId=" + this.getFromChatId() + ", messageId=" + this.getMessageId() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ", replyMarkup=" + this.getReplyMarkup() + ")";
   }

   public CopyMessage(@NonNull String chatId, @NonNull String fromChatId, @NonNull Integer messageId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (fromChatId == null) {
         throw new NullPointerException("fromChatId is marked non-null but is null");
      } else if (messageId == null) {
         throw new NullPointerException("messageId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.fromChatId = fromChatId;
         this.messageId = messageId;
      }
   }

   public CopyMessage() {
   }

   public CopyMessage(@NonNull String chatId, @NonNull String fromChatId, @NonNull Integer messageId, String caption, String parseMode, List<MessageEntity> captionEntities, Boolean disableNotification, Integer replyToMessageId, Boolean allowSendingWithoutReply, ReplyKeyboard replyMarkup) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (fromChatId == null) {
         throw new NullPointerException("fromChatId is marked non-null but is null");
      } else if (messageId == null) {
         throw new NullPointerException("messageId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.fromChatId = fromChatId;
         this.messageId = messageId;
         this.caption = caption;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         this.replyMarkup = replyMarkup;
      }
   }

   public static class CopyMessageBuilder {
      private String chatId;
      private String fromChatId;
      private Integer messageId;
      private String caption;
      private String parseMode;
      private List<MessageEntity> captionEntities;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private Boolean allowSendingWithoutReply;
      private ReplyKeyboard replyMarkup;

      CopyMessageBuilder() {
      }

      @JsonProperty("chat_id")
      public CopyMessage.CopyMessageBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("from_chat_id")
      public CopyMessage.CopyMessageBuilder fromChatId(@NonNull String fromChatId) {
         if (fromChatId == null) {
            throw new NullPointerException("fromChatId is marked non-null but is null");
         } else {
            this.fromChatId = fromChatId;
            return this;
         }
      }

      @JsonProperty("message_id")
      public CopyMessage.CopyMessageBuilder messageId(@NonNull Integer messageId) {
         if (messageId == null) {
            throw new NullPointerException("messageId is marked non-null but is null");
         } else {
            this.messageId = messageId;
            return this;
         }
      }

      @JsonProperty("caption")
      public CopyMessage.CopyMessageBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("parse_mode")
      public CopyMessage.CopyMessageBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      @JsonProperty("caption_entities")
      public CopyMessage.CopyMessageBuilder captionEntities(List<MessageEntity> captionEntities) {
         this.captionEntities = captionEntities;
         return this;
      }

      @JsonProperty("disable_notification")
      public CopyMessage.CopyMessageBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      @JsonProperty("reply_to_message_id")
      public CopyMessage.CopyMessageBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      @JsonProperty("allow_sending_without_reply")
      public CopyMessage.CopyMessageBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      @JsonProperty("reply_markup")
      @JsonDeserialize
      public CopyMessage.CopyMessageBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public CopyMessage build() {
         return new CopyMessage(this.chatId, this.fromChatId, this.messageId, this.caption, this.parseMode, this.captionEntities, this.disableNotification, this.replyToMessageId, this.allowSendingWithoutReply, this.replyMarkup);
      }

      public String toString() {
         return "CopyMessage.CopyMessageBuilder(chatId=" + this.chatId + ", fromChatId=" + this.fromChatId + ", messageId=" + this.messageId + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ", replyMarkup=" + this.replyMarkup + ")";
      }
   }
}
