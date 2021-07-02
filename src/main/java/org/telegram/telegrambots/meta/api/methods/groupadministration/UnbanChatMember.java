package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class UnbanChatMember extends BotApiMethod<Boolean> {
   public static final String PATH = "unbanchatmember";
   private static final String CHATID_FIELD = "chat_id";
   private static final String USERID_FIELD = "user_id";
   private static final String ONLYISBANNED_FIELD = "only_if_banned";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("user_id")
   @NonNull
   private Long userId;
   @JsonProperty("only_if_banned")
   private Boolean onlyIfBanned;

   public String getMethod() {
      return "unbanchatmember";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error unbanning chat member", result);
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

   public static UnbanChatMember.UnbanChatMemberBuilder builder() {
      return new UnbanChatMember.UnbanChatMemberBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UnbanChatMember)) {
         return false;
      } else {
         UnbanChatMember other = (UnbanChatMember)o;
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

            Object this$onlyIfBanned = this.getOnlyIfBanned();
            Object other$onlyIfBanned = other.getOnlyIfBanned();
            if (this$onlyIfBanned == null) {
               if (other$onlyIfBanned != null) {
                  return false;
               }
            } else if (!this$onlyIfBanned.equals(other$onlyIfBanned)) {
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
      return other instanceof UnbanChatMember;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $onlyIfBanned = this.getOnlyIfBanned();
      result = result * 59 + ($onlyIfBanned == null ? 43 : $onlyIfBanned.hashCode());
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

   public Boolean getOnlyIfBanned() {
      return this.onlyIfBanned;
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

   @JsonProperty("only_if_banned")
   public void setOnlyIfBanned(Boolean onlyIfBanned) {
      this.onlyIfBanned = onlyIfBanned;
   }

   public String toString() {
      return "UnbanChatMember(chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ", onlyIfBanned=" + this.getOnlyIfBanned() + ")";
   }

   public UnbanChatMember(@NonNull String chatId, @NonNull Long userId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.userId = userId;
      }
   }

   public UnbanChatMember() {
   }

   public UnbanChatMember(@NonNull String chatId, @NonNull Long userId, Boolean onlyIfBanned) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.userId = userId;
         this.onlyIfBanned = onlyIfBanned;
      }
   }

   public static class UnbanChatMemberBuilder {
      private String chatId;
      private Long userId;
      private Boolean onlyIfBanned;

      UnbanChatMemberBuilder() {
      }

      @JsonProperty("chat_id")
      public UnbanChatMember.UnbanChatMemberBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("user_id")
      public UnbanChatMember.UnbanChatMemberBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      @JsonProperty("only_if_banned")
      public UnbanChatMember.UnbanChatMemberBuilder onlyIfBanned(Boolean onlyIfBanned) {
         this.onlyIfBanned = onlyIfBanned;
         return this;
      }

      public UnbanChatMember build() {
         return new UnbanChatMember(this.chatId, this.userId, this.onlyIfBanned);
      }

      public String toString() {
         return "UnbanChatMember.UnbanChatMemberBuilder(chatId=" + this.chatId + ", userId=" + this.userId + ", onlyIfBanned=" + this.onlyIfBanned + ")";
      }
   }
}
