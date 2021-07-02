package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.ChatMember;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetChatMember extends BotApiMethod<ChatMember> {
   public static final String PATH = "getChatMember";
   private static final String CHATID_FIELD = "chat_id";
   private static final String USERID_FIELD = "user_id";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("user_id")
   @NonNull
   private Long userId;

   public String getMethod() {
      return "getChatMember";
   }

   public ChatMember deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<ChatMember> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<ChatMember>>() {
         });
         if (result.getOk()) {
            return (ChatMember)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error getting chat member", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.userId == null) {
            throw new TelegramApiValidationException("UserId can't be null", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static GetChatMember.GetChatMemberBuilder builder() {
      return new GetChatMember.GetChatMemberBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetChatMember)) {
         return false;
      } else {
         GetChatMember other = (GetChatMember)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$userId = this.getUserId();
            Object other$userId = other.getUserId();
            if (this$userId == null) {
               if (other$userId != null) {
                  return false;
               }
            } else if (!this$userId.equals(other$userId)) {
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
      return other instanceof GetChatMember;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public Long getUserId() {
      return this.userId;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("user_id")
   public void setUserId(@NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
      }
   }

   public String toString() {
      return "GetChatMember(chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ")";
   }

   public GetChatMember() {
   }

   public GetChatMember(@NonNull String chatId, @NonNull Long userId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.userId = userId;
      }
   }

   public static class GetChatMemberBuilder {
      private String chatId;
      private Long userId;

      GetChatMemberBuilder() {
      }

      @JsonProperty("chat_id")
      public GetChatMember.GetChatMemberBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("user_id")
      public GetChatMember.GetChatMemberBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      public GetChatMember build() {
         return new GetChatMember(this.chatId, this.userId);
      }

      public String toString() {
         return "GetChatMember.GetChatMemberBuilder(chatId=" + this.chatId + ", userId=" + this.userId + ")";
      }
   }
}
