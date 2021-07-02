package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class KickChatMember extends BotApiMethod<Boolean> {
   public static final String PATH = "kickchatmember";
   private static final String CHATID_FIELD = "chat_id";
   private static final String USER_ID_FIELD = "user_id";
   private static final String UNTILDATE_FIELD = "until_date";
   private static final String REVOKEMESSAGES_FIELD = "revoke_messages";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("user_id")
   @NonNull
   private Long userId;
   @JsonProperty("until_date")
   private Integer untilDate;
   @JsonProperty("revoke_messages")
   private Boolean revokeMessages;

   @JsonIgnore
   public void setUntilDateInstant(Instant instant) {
      this.setUntilDate((int)instant.getEpochSecond());
   }

   @JsonIgnore
   public void setUntilDateDateTime(ZonedDateTime date) {
      this.setUntilDateInstant(date.toInstant());
   }

   @JsonIgnore
   public void forTimePeriodDuration(Duration duration) {
      this.setUntilDateInstant(Instant.now().plusMillis(duration.toMillis()));
   }

   public String getMethod() {
      return "kickchatmember";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error kicking chat member", result);
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

   public static KickChatMember.KickChatMemberBuilder builder() {
      return new KickChatMember.KickChatMemberBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof KickChatMember)) {
         return false;
      } else {
         KickChatMember other = (KickChatMember)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$userId = this.getUserId();
               Object other$userId = other.getUserId();
               if (this$userId == null) {
                  if (other$userId == null) {
                     break label59;
                  }
               } else if (this$userId.equals(other$userId)) {
                  break label59;
               }

               return false;
            }

            Object this$untilDate = this.getUntilDate();
            Object other$untilDate = other.getUntilDate();
            if (this$untilDate == null) {
               if (other$untilDate != null) {
                  return false;
               }
            } else if (!this$untilDate.equals(other$untilDate)) {
               return false;
            }

            Object this$revokeMessages = this.getRevokeMessages();
            Object other$revokeMessages = other.getRevokeMessages();
            if (this$revokeMessages == null) {
               if (other$revokeMessages != null) {
                  return false;
               }
            } else if (!this$revokeMessages.equals(other$revokeMessages)) {
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
      return other instanceof KickChatMember;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $untilDate = this.getUntilDate();
      result = result * 59 + ($untilDate == null ? 43 : $untilDate.hashCode());
      Object $revokeMessages = this.getRevokeMessages();
      result = result * 59 + ($revokeMessages == null ? 43 : $revokeMessages.hashCode());
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

   public Integer getUntilDate() {
      return this.untilDate;
   }

   public Boolean getRevokeMessages() {
      return this.revokeMessages;
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

   @JsonProperty("until_date")
   public void setUntilDate(Integer untilDate) {
      this.untilDate = untilDate;
   }

   @JsonProperty("revoke_messages")
   public void setRevokeMessages(Boolean revokeMessages) {
      this.revokeMessages = revokeMessages;
   }

   public String toString() {
      return "KickChatMember(chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ", untilDate=" + this.getUntilDate() + ", revokeMessages=" + this.getRevokeMessages() + ")";
   }

   public KickChatMember() {
   }

   public KickChatMember(@NonNull String chatId, @NonNull Long userId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.userId = userId;
      }
   }

   public KickChatMember(@NonNull String chatId, @NonNull Long userId, Integer untilDate, Boolean revokeMessages) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.userId = userId;
         this.untilDate = untilDate;
         this.revokeMessages = revokeMessages;
      }
   }

   public static class KickChatMemberBuilder {
      private String chatId;
      private Long userId;
      private Integer untilDate;
      private Boolean revokeMessages;

      KickChatMemberBuilder() {
      }

      @JsonProperty("chat_id")
      public KickChatMember.KickChatMemberBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("user_id")
      public KickChatMember.KickChatMemberBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      @JsonProperty("until_date")
      public KickChatMember.KickChatMemberBuilder untilDate(Integer untilDate) {
         this.untilDate = untilDate;
         return this;
      }

      @JsonProperty("revoke_messages")
      public KickChatMember.KickChatMemberBuilder revokeMessages(Boolean revokeMessages) {
         this.revokeMessages = revokeMessages;
         return this;
      }

      public KickChatMember build() {
         return new KickChatMember(this.chatId, this.userId, this.untilDate, this.revokeMessages);
      }

      public String toString() {
         return "KickChatMember.KickChatMemberBuilder(chatId=" + this.chatId + ", userId=" + this.userId + ", untilDate=" + this.untilDate + ", revokeMessages=" + this.revokeMessages + ")";
      }
   }
}
