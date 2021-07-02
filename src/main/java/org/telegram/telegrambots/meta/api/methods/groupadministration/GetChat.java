package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetChat extends BotApiMethod<Chat> {
   public static final String PATH = "getChat";
   private static final String CHATID_FIELD = "chat_id";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;

   public String getMethod() {
      return "getChat";
   }

   public Chat deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Chat> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Chat>>() {
         });
         if (result.getOk()) {
            return (Chat)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error getting chat", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId == null || this.chatId.isEmpty()) {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static GetChat.GetChatBuilder builder() {
      return new GetChat.GetChatBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetChat)) {
         return false;
      } else {
         GetChat other = (GetChat)o;
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
      return other instanceof GetChat;
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
      return "GetChat(chatId=" + this.getChatId() + ")";
   }

   public GetChat() {
   }

   public GetChat(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public static class GetChatBuilder {
      private String chatId;

      GetChatBuilder() {
      }

      @JsonProperty("chat_id")
      public GetChat.GetChatBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public GetChat build() {
         return new GetChat(this.chatId);
      }

      public String toString() {
         return "GetChat.GetChatBuilder(chatId=" + this.chatId + ")";
      }
   }
}
