package org.telegram.telegrambots.meta.api.methods.updatingmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class DeleteMessage extends BotApiMethod<Boolean> {
   public static final String PATH = "deleteMessage";
   private static final String CHATID_FIELD = "chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("message_id")
   @NonNull
   private Integer messageId;

   public String getMethod() {
      return "deleteMessage";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error deleting message", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.messageId == null) {
            throw new TelegramApiValidationException("MessageId parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static DeleteMessage.DeleteMessageBuilder builder() {
      return new DeleteMessage.DeleteMessageBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeleteMessage)) {
         return false;
      } else {
         DeleteMessage other = (DeleteMessage)o;
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
      return other instanceof DeleteMessage;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
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

   public String toString() {
      return "DeleteMessage(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ")";
   }

   public DeleteMessage() {
   }

   public DeleteMessage(@NonNull String chatId, @NonNull Integer messageId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (messageId == null) {
         throw new NullPointerException("messageId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.messageId = messageId;
      }
   }

   public static class DeleteMessageBuilder {
      private String chatId;
      private Integer messageId;

      DeleteMessageBuilder() {
      }

      @JsonProperty("chat_id")
      public DeleteMessage.DeleteMessageBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("message_id")
      public DeleteMessage.DeleteMessageBuilder messageId(@NonNull Integer messageId) {
         if (messageId == null) {
            throw new NullPointerException("messageId is marked non-null but is null");
         } else {
            this.messageId = messageId;
            return this;
         }
      }

      public DeleteMessage build() {
         return new DeleteMessage(this.chatId, this.messageId);
      }

      public String toString() {
         return "DeleteMessage.DeleteMessageBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ")";
      }
   }
}
