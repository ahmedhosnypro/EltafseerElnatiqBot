package org.telegram.telegrambots.meta.api.methods.pinnedmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class UnpinAllChatMessages extends BotApiMethod<Boolean> {
   public static final String PATH = "unpinAllChatMessages";
   private static final String CHATID_FIELD = "chat_id";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;

   public String getMethod() {
      return "unpinAllChatMessages";
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

   public static UnpinAllChatMessages.UnpinAllChatMessagesBuilder builder() {
      return new UnpinAllChatMessages.UnpinAllChatMessagesBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UnpinAllChatMessages)) {
         return false;
      } else {
         UnpinAllChatMessages other = (UnpinAllChatMessages)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
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
      return other instanceof UnpinAllChatMessages;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $chatId = this.getChatId();
      int result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public String toString() {
      return "UnpinAllChatMessages(chatId=" + this.getChatId() + ")";
   }

   public UnpinAllChatMessages() {
   }

   public UnpinAllChatMessages(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public static class UnpinAllChatMessagesBuilder {
      private String chatId;

      UnpinAllChatMessagesBuilder() {
      }

      @JsonProperty("chat_id")
      public UnpinAllChatMessages.UnpinAllChatMessagesBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public UnpinAllChatMessages build() {
         return new UnpinAllChatMessages(this.chatId);
      }

      public String toString() {
         return "UnpinAllChatMessages.UnpinAllChatMessagesBuilder(chatId=" + this.chatId + ")";
      }
   }
}
