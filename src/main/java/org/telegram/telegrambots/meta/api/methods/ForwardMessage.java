package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class ForwardMessage extends BotApiMethod<Message> {
   public static final String PATH = "forwardmessage";
   private static final String CHATID_FIELD = "chat_id";
   private static final String FROMCHATID_FIELD = "from_chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   private static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("from_chat_id")
   @NonNull
   private String fromChatId;
   @JsonProperty("message_id")
   @NonNull
   private Integer messageId;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.fromChatId != null && !this.fromChatId.isEmpty()) {
            if (this.messageId == null) {
               throw new TelegramApiValidationException("MessageId can't be empty", this);
            }
         } else {
            throw new TelegramApiValidationException("FromChatId can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public String getMethod() {
      return "forwardmessage";
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error forwarding message", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public static ForwardMessage.ForwardMessageBuilder builder() {
      return new ForwardMessage.ForwardMessageBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ForwardMessage)) {
         return false;
      } else {
         ForwardMessage other = (ForwardMessage)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$messageId = this.getMessageId();
               Object other$messageId = other.getMessageId();
               if (this$messageId == null) {
                  if (other$messageId == null) {
                     break label59;
                  }
               } else if (this$messageId.equals(other$messageId)) {
                  break label59;
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

            Object this$chatId = this.getChatId();
            Object other$chatId = other.getChatId();
            if (this$chatId == null) {
               if (other$chatId != null) {
                  return false;
               }
            } else if (!this$chatId.equals(other$chatId)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ForwardMessage;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $fromChatId = this.getFromChatId();
      result = result * 59 + ($fromChatId == null ? 43 : $fromChatId.hashCode());
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

   public Boolean getDisableNotification() {
      return this.disableNotification;
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

   @JsonProperty("disable_notification")
   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   public String toString() {
      return "ForwardMessage(chatId=" + this.getChatId() + ", fromChatId=" + this.getFromChatId() + ", messageId=" + this.getMessageId() + ", disableNotification=" + this.getDisableNotification() + ")";
   }

   public ForwardMessage() {
   }

   public ForwardMessage(@NonNull String chatId, @NonNull String fromChatId, @NonNull Integer messageId) {
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

   public ForwardMessage(@NonNull String chatId, @NonNull String fromChatId, @NonNull Integer messageId, Boolean disableNotification) {
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
         this.disableNotification = disableNotification;
      }
   }

   public static class ForwardMessageBuilder {
      private String chatId;
      private String fromChatId;
      private Integer messageId;
      private Boolean disableNotification;

      ForwardMessageBuilder() {
      }

      @JsonProperty("chat_id")
      public ForwardMessage.ForwardMessageBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("from_chat_id")
      public ForwardMessage.ForwardMessageBuilder fromChatId(@NonNull String fromChatId) {
         if (fromChatId == null) {
            throw new NullPointerException("fromChatId is marked non-null but is null");
         } else {
            this.fromChatId = fromChatId;
            return this;
         }
      }

      @JsonProperty("message_id")
      public ForwardMessage.ForwardMessageBuilder messageId(@NonNull Integer messageId) {
         if (messageId == null) {
            throw new NullPointerException("messageId is marked non-null but is null");
         } else {
            this.messageId = messageId;
            return this;
         }
      }

      @JsonProperty("disable_notification")
      public ForwardMessage.ForwardMessageBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      public ForwardMessage build() {
         return new ForwardMessage(this.chatId, this.fromChatId, this.messageId, this.disableNotification);
      }

      public String toString() {
         return "ForwardMessage.ForwardMessageBuilder(chatId=" + this.chatId + ", fromChatId=" + this.fromChatId + ", messageId=" + this.messageId + ", disableNotification=" + this.disableNotification + ")";
      }
   }
}
