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
import org.telegram.telegrambots.meta.api.objects.ChatPermissions;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class RestrictChatMember extends BotApiMethod<Boolean> {
   public static final String PATH = "restrictchatmember";
   private static final String CHATID_FIELD = "chat_id";
   private static final String USER_ID_FIELD = "user_id";
   private static final String UNTILDATE_FIELD = "until_date";
   private static final String CANSENDMESSAGES_FIELD = "can_send_messages";
   private static final String CANSENDMEDIAMESSAGES_FIELD = "can_send_media_messages";
   private static final String CANSENDOTHERMESSAGES_FIELD = "can_send_other_messages";
   private static final String CANADDWEBPAGEPREVIEWS_FIELD = "can_add_web_page_previews";
   private static final String PERMISSIONS_FIELD = "permissions";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("user_id")
   @NonNull
   private Long userId;
   @JsonProperty("permissions")
   @NonNull
   private ChatPermissions permissions;
   @JsonProperty("until_date")
   private Integer untilDate;

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
      return "restrictchatmember";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error restricting chat member", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.userId == null) {
            throw new TelegramApiValidationException("UserId can't be empty", this);
         } else if (this.permissions == null) {
            throw new TelegramApiValidationException("Permissions can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static RestrictChatMember.RestrictChatMemberBuilder builder() {
      return new RestrictChatMember.RestrictChatMemberBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof RestrictChatMember)) {
         return false;
      } else {
         RestrictChatMember other = (RestrictChatMember)o;
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

            Object this$chatId = this.getChatId();
            Object other$chatId = other.getChatId();
            if (this$chatId == null) {
               if (other$chatId != null) {
                  return false;
               }
            } else if (!this$chatId.equals(other$chatId)) {
               return false;
            }

            Object this$permissions = this.getPermissions();
            Object other$permissions = other.getPermissions();
            if (this$permissions == null) {
               if (other$permissions != null) {
                  return false;
               }
            } else if (!this$permissions.equals(other$permissions)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof RestrictChatMember;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $untilDate = this.getUntilDate();
      result = result * 59 + ($untilDate == null ? 43 : $untilDate.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $permissions = this.getPermissions();
      result = result * 59 + ($permissions == null ? 43 : $permissions.hashCode());
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
   public ChatPermissions getPermissions() {
      return this.permissions;
   }

   public Integer getUntilDate() {
      return this.untilDate;
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

   @JsonProperty("permissions")
   public void setPermissions(@NonNull ChatPermissions permissions) {
      if (permissions == null) {
         throw new NullPointerException("permissions is marked non-null but is null");
      } else {
         this.permissions = permissions;
      }
   }

   @JsonProperty("until_date")
   public void setUntilDate(Integer untilDate) {
      this.untilDate = untilDate;
   }

   public String toString() {
      return "RestrictChatMember(chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ", permissions=" + this.getPermissions() + ", untilDate=" + this.getUntilDate() + ")";
   }

   public RestrictChatMember() {
   }

   public RestrictChatMember(@NonNull String chatId, @NonNull Long userId, @NonNull ChatPermissions permissions) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else if (permissions == null) {
         throw new NullPointerException("permissions is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.userId = userId;
         this.permissions = permissions;
      }
   }

   public RestrictChatMember(@NonNull String chatId, @NonNull Long userId, @NonNull ChatPermissions permissions, Integer untilDate) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else if (permissions == null) {
         throw new NullPointerException("permissions is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.userId = userId;
         this.permissions = permissions;
         this.untilDate = untilDate;
      }
   }

   public static class RestrictChatMemberBuilder {
      private String chatId;
      private Long userId;
      private ChatPermissions permissions;
      private Integer untilDate;

      RestrictChatMemberBuilder() {
      }

      @JsonProperty("chat_id")
      public RestrictChatMember.RestrictChatMemberBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("user_id")
      public RestrictChatMember.RestrictChatMemberBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      @JsonProperty("permissions")
      public RestrictChatMember.RestrictChatMemberBuilder permissions(@NonNull ChatPermissions permissions) {
         if (permissions == null) {
            throw new NullPointerException("permissions is marked non-null but is null");
         } else {
            this.permissions = permissions;
            return this;
         }
      }

      @JsonProperty("until_date")
      public RestrictChatMember.RestrictChatMemberBuilder untilDate(Integer untilDate) {
         this.untilDate = untilDate;
         return this;
      }

      public RestrictChatMember build() {
         return new RestrictChatMember(this.chatId, this.userId, this.permissions, this.untilDate);
      }

      public String toString() {
         return "RestrictChatMember.RestrictChatMemberBuilder(chatId=" + this.chatId + ", userId=" + this.userId + ", permissions=" + this.permissions + ", untilDate=" + this.untilDate + ")";
      }
   }
}
