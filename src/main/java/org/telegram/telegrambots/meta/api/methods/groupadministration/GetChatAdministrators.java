package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.ChatMember;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetChatAdministrators extends BotApiMethod<ArrayList<ChatMember>> {
   public static final String PATH = "getChatAdministrators";
   private static final String CHATID_FIELD = "chat_id";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;

   public String getMethod() {
      return "getChatAdministrators";
   }

   public ArrayList<ChatMember> deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<ArrayList<ChatMember>> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<ArrayList<ChatMember>>>() {
         });
         if (result.getOk()) {
            return (ArrayList)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error getting chat administrators", result);
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

   public static GetChatAdministrators.GetChatAdministratorsBuilder builder() {
      return new GetChatAdministrators.GetChatAdministratorsBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetChatAdministrators)) {
         return false;
      } else {
         GetChatAdministrators other = (GetChatAdministrators)o;
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
      return other instanceof GetChatAdministrators;
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
      return "GetChatAdministrators(chatId=" + this.getChatId() + ")";
   }

   public GetChatAdministrators() {
   }

   public GetChatAdministrators(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public static class GetChatAdministratorsBuilder {
      private String chatId;

      GetChatAdministratorsBuilder() {
      }

      @JsonProperty("chat_id")
      public GetChatAdministrators.GetChatAdministratorsBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public GetChatAdministrators build() {
         return new GetChatAdministrators(this.chatId);
      }

      public String toString() {
         return "GetChatAdministrators.GetChatAdministratorsBuilder(chatId=" + this.chatId + ")";
      }
   }
}
