package org.telegram.telegrambots.meta.api.methods.pinnedmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class PinChatMessage extends BotApiMethod<Boolean> {
   public static final String PATH = "pinChatMessage";
   private static final String CHATID_FIELD = "chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   private static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("message_id")
   @NonNull
   private Integer messageId;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;

   public String getMethod() {
      return "pinChatMessage";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error pinning chat message", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.messageId == null) {
            throw new TelegramApiValidationException("MessageId parameter can't be null", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static PinChatMessage.PinChatMessageBuilder builder() {
      return new PinChatMessage.PinChatMessageBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PinChatMessage)) {
         return false;
      } else {
         PinChatMessage other = (PinChatMessage)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$messageId = this.getMessageId();
               Object other$messageId = other.getMessageId();
               if (this$messageId == null) {
                  if (other$messageId == null) {
                     break label47;
                  }
               } else if (this$messageId.equals(other$messageId)) {
                  break label47;
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PinChatMessage;
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
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
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
      return "PinChatMessage(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ", disableNotification=" + this.getDisableNotification() + ")";
   }

   public PinChatMessage(@NonNull String chatId, @NonNull Integer messageId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (messageId == null) {
         throw new NullPointerException("messageId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.messageId = messageId;
      }
   }

   public PinChatMessage() {
   }

   public PinChatMessage(@NonNull String chatId, @NonNull Integer messageId, Boolean disableNotification) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (messageId == null) {
         throw new NullPointerException("messageId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.messageId = messageId;
         this.disableNotification = disableNotification;
      }
   }

   public static class PinChatMessageBuilder {
      private String chatId;
      private Integer messageId;
      private Boolean disableNotification;

      PinChatMessageBuilder() {
      }

      @JsonProperty("chat_id")
      public PinChatMessage.PinChatMessageBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("message_id")
      public PinChatMessage.PinChatMessageBuilder messageId(@NonNull Integer messageId) {
         if (messageId == null) {
            throw new NullPointerException("messageId is marked non-null but is null");
         } else {
            this.messageId = messageId;
            return this;
         }
      }

      @JsonProperty("disable_notification")
      public PinChatMessage.PinChatMessageBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      public PinChatMessage build() {
         return new PinChatMessage(this.chatId, this.messageId, this.disableNotification);
      }

      public String toString() {
         return "PinChatMessage.PinChatMessageBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ", disableNotification=" + this.disableNotification + ")";
      }
   }
}
