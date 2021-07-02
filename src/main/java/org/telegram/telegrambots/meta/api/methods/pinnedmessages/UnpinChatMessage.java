package org.telegram.telegrambots.meta.api.methods.pinnedmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class UnpinChatMessage extends BotApiMethod<Boolean> {
   public static final String PATH = "unpinChatMessage";
   private static final String CHATID_FIELD = "chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("message_id")
   private Integer messageId;

   public String getMethod() {
      return "unpinChatMessage";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error unpinning chat message", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId == null || this.chatId.isEmpty()) {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static UnpinChatMessage.UnpinChatMessageBuilder builder() {
      return new UnpinChatMessage.UnpinChatMessageBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UnpinChatMessage)) {
         return false;
      } else {
         UnpinChatMessage other = (UnpinChatMessage)o;
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
      return other instanceof UnpinChatMessage;
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
   public void setMessageId(Integer messageId) {
      this.messageId = messageId;
   }

   public String toString() {
      return "UnpinChatMessage(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ")";
   }

   public UnpinChatMessage(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public UnpinChatMessage() {
   }

   public UnpinChatMessage(@NonNull String chatId, Integer messageId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.messageId = messageId;
      }
   }

   public static class UnpinChatMessageBuilder {
      private String chatId;
      private Integer messageId;

      UnpinChatMessageBuilder() {
      }

      @JsonProperty("chat_id")
      public UnpinChatMessage.UnpinChatMessageBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("message_id")
      public UnpinChatMessage.UnpinChatMessageBuilder messageId(Integer messageId) {
         this.messageId = messageId;
         return this;
      }

      public UnpinChatMessage build() {
         return new UnpinChatMessage(this.chatId, this.messageId);
      }

      public String toString() {
         return "UnpinChatMessage.UnpinChatMessageBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ")";
      }
   }
}
