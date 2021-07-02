package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetChatAdministratorCustomTitle extends BotApiMethod<Boolean> {
   public static final String PATH = "setChatAdministratorCustomTitle";
   private static final String CHATID_FIELD = "chat_id";
   private static final String USERID_FIELD = "user_id";
   private static final String CUSTOMTITLE_FIELD = "custom_title";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("user_id")
   @NonNull
   private Long userId;
   @JsonProperty("custom_title")
   @NonNull
   private String customTitle;

   public String getMethod() {
      return "setChatAdministratorCustomTitle";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error setting chat description", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.userId != null && this.userId != 0L) {
            if (this.customTitle == null) {
               throw new TelegramApiValidationException("CustomTitle can't be null", this);
            }
         } else {
            throw new TelegramApiValidationException("UserId can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static SetChatAdministratorCustomTitle.SetChatAdministratorCustomTitleBuilder builder() {
      return new SetChatAdministratorCustomTitle.SetChatAdministratorCustomTitleBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetChatAdministratorCustomTitle)) {
         return false;
      } else {
         SetChatAdministratorCustomTitle other = (SetChatAdministratorCustomTitle)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$userId = this.getUserId();
               Object other$userId = other.getUserId();
               if (this$userId == null) {
                  if (other$userId == null) {
                     break label47;
                  }
               } else if (this$userId.equals(other$userId)) {
                  break label47;
               }

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

            Object this$customTitle = this.getCustomTitle();
            Object other$customTitle = other.getCustomTitle();
            if (this$customTitle == null) {
               if (other$customTitle != null) {
                  return false;
               }
            } else if (!this$customTitle.equals(other$customTitle)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetChatAdministratorCustomTitle;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $customTitle = this.getCustomTitle();
      result = result * 59 + ($customTitle == null ? 43 : $customTitle.hashCode());
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

   @NonNull
   public String getCustomTitle() {
      return this.customTitle;
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

   @JsonProperty("custom_title")
   public void setCustomTitle(@NonNull String customTitle) {
      if (customTitle == null) {
         throw new NullPointerException("customTitle is marked non-null but is null");
      } else {
         this.customTitle = customTitle;
      }
   }

   public String toString() {
      return "SetChatAdministratorCustomTitle(chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ", customTitle=" + this.getCustomTitle() + ")";
   }

   public SetChatAdministratorCustomTitle() {
   }

   public SetChatAdministratorCustomTitle(@NonNull String chatId, @NonNull Long userId, @NonNull String customTitle) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else if (customTitle == null) {
         throw new NullPointerException("customTitle is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.userId = userId;
         this.customTitle = customTitle;
      }
   }

   public static class SetChatAdministratorCustomTitleBuilder {
      private String chatId;
      private Long userId;
      private String customTitle;

      SetChatAdministratorCustomTitleBuilder() {
      }

      @JsonProperty("chat_id")
      public SetChatAdministratorCustomTitle.SetChatAdministratorCustomTitleBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("user_id")
      public SetChatAdministratorCustomTitle.SetChatAdministratorCustomTitleBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      @JsonProperty("custom_title")
      public SetChatAdministratorCustomTitle.SetChatAdministratorCustomTitleBuilder customTitle(@NonNull String customTitle) {
         if (customTitle == null) {
            throw new NullPointerException("customTitle is marked non-null but is null");
         } else {
            this.customTitle = customTitle;
            return this;
         }
      }

      public SetChatAdministratorCustomTitle build() {
         return new SetChatAdministratorCustomTitle(this.chatId, this.userId, this.customTitle);
      }

      public String toString() {
         return "SetChatAdministratorCustomTitle.SetChatAdministratorCustomTitleBuilder(chatId=" + this.chatId + ", userId=" + this.userId + ", customTitle=" + this.customTitle + ")";
      }
   }
}
