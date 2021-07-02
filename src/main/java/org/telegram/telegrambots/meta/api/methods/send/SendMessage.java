package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.IOException;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendMessage extends BotApiMethod<Message> {
   public static final String PATH = "sendmessage";
   private static final String CHATID_FIELD = "chat_id";
   private static final String TEXT_FIELD = "text";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String DISABLEWEBPAGEPREVIEW_FIELD = "disable_web_page_preview";
   private static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   private static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   private static final String ENTITIES_FIELD = "entities";
   private static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("text")
   @NonNull
   private String text;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("disable_web_page_preview")
   private Boolean disableWebPagePreview;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;
   @JsonProperty("reply_to_message_id")
   private Integer replyToMessageId;
   @JsonProperty("reply_markup")
   @JsonDeserialize
   private ReplyKeyboard replyMarkup;
   @JsonProperty("entities")
   private List<MessageEntity> entities;
   @JsonProperty("allow_sending_without_reply")
   private Boolean allowSendingWithoutReply;

   public void disableWebPagePreview() {
      this.disableWebPagePreview = true;
   }

   public void enableWebPagePreview() {
      this.disableWebPagePreview = null;
   }

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
      return "sendmessage";
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending message", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.text != null && !this.text.isEmpty()) {
            if (this.parseMode != null && this.entities != null && !this.entities.isEmpty()) {
               throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
            } else {
               if (this.replyMarkup != null) {
                  this.replyMarkup.validate();
               }

            }
         } else {
            throw new TelegramApiValidationException("Text parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendMessage.SendMessageBuilder builder() {
      return new SendMessage.SendMessageBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendMessage)) {
         return false;
      } else {
         SendMessage other = (SendMessage)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label119: {
               Object this$disableWebPagePreview = this.getDisableWebPagePreview();
               Object other$disableWebPagePreview = other.getDisableWebPagePreview();
               if (this$disableWebPagePreview == null) {
                  if (other$disableWebPagePreview == null) {
                     break label119;
                  }
               } else if (this$disableWebPagePreview.equals(other$disableWebPagePreview)) {
                  break label119;
               }

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

            label105: {
               Object this$replyToMessageId = this.getReplyToMessageId();
               Object other$replyToMessageId = other.getReplyToMessageId();
               if (this$replyToMessageId == null) {
                  if (other$replyToMessageId == null) {
                     break label105;
                  }
               } else if (this$replyToMessageId.equals(other$replyToMessageId)) {
                  break label105;
               }

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

            label91: {
               Object this$chatId = this.getChatId();
               Object other$chatId = other.getChatId();
               if (this$chatId == null) {
                  if (other$chatId == null) {
                     break label91;
                  }
               } else if (this$chatId.equals(other$chatId)) {
                  break label91;
               }

               return false;
            }

            Object this$text = this.getText();
            Object other$text = other.getText();
            if (this$text == null) {
               if (other$text != null) {
                  return false;
               }
            } else if (!this$text.equals(other$text)) {
               return false;
            }

            label77: {
               Object this$parseMode = this.getParseMode();
               Object other$parseMode = other.getParseMode();
               if (this$parseMode == null) {
                  if (other$parseMode == null) {
                     break label77;
                  }
               } else if (this$parseMode.equals(other$parseMode)) {
                  break label77;
               }

               return false;
            }

            label70: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label70;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label70;
               }

               return false;
            }

            Object this$entities = this.getEntities();
            Object other$entities = other.getEntities();
            if (this$entities == null) {
               if (other$entities != null) {
                  return false;
               }
            } else if (!this$entities.equals(other$entities)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SendMessage;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $disableWebPagePreview = this.getDisableWebPagePreview();
      int result = result * 59 + ($disableWebPagePreview == null ? 43 : $disableWebPagePreview.hashCode());
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $text = this.getText();
      result = result * 59 + ($text == null ? 43 : $text.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $entities = this.getEntities();
      result = result * 59 + ($entities == null ? 43 : $entities.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public String getText() {
      return this.text;
   }

   public String getParseMode() {
      return this.parseMode;
   }

   public Boolean getDisableWebPagePreview() {
      return this.disableWebPagePreview;
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

   public List<MessageEntity> getEntities() {
      return this.entities;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("text")
   public void setText(@NonNull String text) {
      if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.text = text;
      }
   }

   @JsonProperty("parse_mode")
   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   @JsonProperty("disable_web_page_preview")
   public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
      this.disableWebPagePreview = disableWebPagePreview;
   }

   @JsonProperty("disable_notification")
   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   @JsonProperty("reply_to_message_id")
   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   @JsonProperty("reply_markup")
   @JsonDeserialize
   public void setReplyMarkup(ReplyKeyboard replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("entities")
   public void setEntities(List<MessageEntity> entities) {
      this.entities = entities;
   }

   @JsonProperty("allow_sending_without_reply")
   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   public String toString() {
      return "SendMessage(chatId=" + this.getChatId() + ", text=" + this.getText() + ", parseMode=" + this.getParseMode() + ", disableWebPagePreview=" + this.getDisableWebPagePreview() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", entities=" + this.getEntities() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendMessage(@NonNull String chatId, @NonNull String text) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.text = text;
      }
   }

   public SendMessage() {
   }

   public SendMessage(@NonNull String chatId, @NonNull String text, String parseMode, Boolean disableWebPagePreview, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, List<MessageEntity> entities, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.text = text;
         this.parseMode = parseMode;
         this.disableWebPagePreview = disableWebPagePreview;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.entities = entities;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendMessageBuilder {
      private String chatId;
      private String text;
      private String parseMode;
      private Boolean disableWebPagePreview;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private List<MessageEntity> entities;
      private Boolean allowSendingWithoutReply;

      SendMessageBuilder() {
      }

      @JsonProperty("chat_id")
      public SendMessage.SendMessageBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("text")
      public SendMessage.SendMessageBuilder text(@NonNull String text) {
         if (text == null) {
            throw new NullPointerException("text is marked non-null but is null");
         } else {
            this.text = text;
            return this;
         }
      }

      @JsonProperty("parse_mode")
      public SendMessage.SendMessageBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      @JsonProperty("disable_web_page_preview")
      public SendMessage.SendMessageBuilder disableWebPagePreview(Boolean disableWebPagePreview) {
         this.disableWebPagePreview = disableWebPagePreview;
         return this;
      }

      @JsonProperty("disable_notification")
      public SendMessage.SendMessageBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      @JsonProperty("reply_to_message_id")
      public SendMessage.SendMessageBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      @JsonProperty("reply_markup")
      @JsonDeserialize
      public SendMessage.SendMessageBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("entities")
      public SendMessage.SendMessageBuilder entities(List<MessageEntity> entities) {
         this.entities = entities;
         return this;
      }

      @JsonProperty("allow_sending_without_reply")
      public SendMessage.SendMessageBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendMessage build() {
         return new SendMessage(this.chatId, this.text, this.parseMode, this.disableWebPagePreview, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.entities, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendMessage.SendMessageBuilder(chatId=" + this.chatId + ", text=" + this.text + ", parseMode=" + this.parseMode + ", disableWebPagePreview=" + this.disableWebPagePreview + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", entities=" + this.entities + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
