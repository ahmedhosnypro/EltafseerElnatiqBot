package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.ChatInviteLink;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class CreateChatInviteLink extends BotApiMethod<ChatInviteLink> {
   public static final String PATH = "createChatInviteLink";
   private static final String CHATID_FIELD = "chat_id";
   private static final String EXPIREDATE_FIELD = "expire_date";
   private static final String MEMBERLIMIT_FIELD = "member_limit";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("expire_date")
   private Integer expireDate;
   @JsonProperty("member_limit")
   private Integer memberLimit;

   public String getMethod() {
      return "createChatInviteLink";
   }

   public ChatInviteLink deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<ChatInviteLink> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<ChatInviteLink>>() {
         });
         if (result.getOk()) {
            return (ChatInviteLink)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error creating invite link", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.memberLimit != null && (this.memberLimit < 1 || this.memberLimit > 99999)) {
            throw new TelegramApiValidationException("MemberLimit must be between 1 and 99999", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static CreateChatInviteLink.CreateChatInviteLinkBuilder builder() {
      return new CreateChatInviteLink.CreateChatInviteLinkBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CreateChatInviteLink)) {
         return false;
      } else {
         CreateChatInviteLink other = (CreateChatInviteLink)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$expireDate = this.getExpireDate();
               Object other$expireDate = other.getExpireDate();
               if (this$expireDate == null) {
                  if (other$expireDate == null) {
                     break label47;
                  }
               } else if (this$expireDate.equals(other$expireDate)) {
                  break label47;
               }

               return false;
            }

            Object this$memberLimit = this.getMemberLimit();
            Object other$memberLimit = other.getMemberLimit();
            if (this$memberLimit == null) {
               if (other$memberLimit != null) {
                  return false;
               }
            } else if (!this$memberLimit.equals(other$memberLimit)) {
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
      return other instanceof CreateChatInviteLink;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $expireDate = this.getExpireDate();
      int result = result * 59 + ($expireDate == null ? 43 : $expireDate.hashCode());
      Object $memberLimit = this.getMemberLimit();
      result = result * 59 + ($memberLimit == null ? 43 : $memberLimit.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   public Integer getExpireDate() {
      return this.expireDate;
   }

   public Integer getMemberLimit() {
      return this.memberLimit;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("expire_date")
   public void setExpireDate(Integer expireDate) {
      this.expireDate = expireDate;
   }

   @JsonProperty("member_limit")
   public void setMemberLimit(Integer memberLimit) {
      this.memberLimit = memberLimit;
   }

   public String toString() {
      return "CreateChatInviteLink(chatId=" + this.getChatId() + ", expireDate=" + this.getExpireDate() + ", memberLimit=" + this.getMemberLimit() + ")";
   }

   public CreateChatInviteLink() {
   }

   public CreateChatInviteLink(@NonNull String chatId, Integer expireDate, Integer memberLimit) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.expireDate = expireDate;
         this.memberLimit = memberLimit;
      }
   }

   public CreateChatInviteLink(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public static class CreateChatInviteLinkBuilder {
      private String chatId;
      private Integer expireDate;
      private Integer memberLimit;

      CreateChatInviteLinkBuilder() {
      }

      @JsonProperty("chat_id")
      public CreateChatInviteLink.CreateChatInviteLinkBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("expire_date")
      public CreateChatInviteLink.CreateChatInviteLinkBuilder expireDate(Integer expireDate) {
         this.expireDate = expireDate;
         return this;
      }

      @JsonProperty("member_limit")
      public CreateChatInviteLink.CreateChatInviteLinkBuilder memberLimit(Integer memberLimit) {
         this.memberLimit = memberLimit;
         return this;
      }

      public CreateChatInviteLink build() {
         return new CreateChatInviteLink(this.chatId, this.expireDate, this.memberLimit);
      }

      public String toString() {
         return "CreateChatInviteLink.CreateChatInviteLinkBuilder(chatId=" + this.chatId + ", expireDate=" + this.expireDate + ", memberLimit=" + this.memberLimit + ")";
      }
   }
}
