package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Strings;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.ChatInviteLink;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class EditChatInviteLink extends BotApiMethod<ChatInviteLink> {
   public static final String PATH = "editChatInviteLink";
   private static final String CHATID_FIELD = "chat_id";
   private static final String INVITELINK_FIELD = "invite_link";
   private static final String EXPIREDATE_FIELD = "expire_date";
   private static final String MEMBERLIMIT_FIELD = "member_limit";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("invite_link")
   @NonNull
   private String inviteLink;
   @JsonProperty("expire_date")
   private Integer expireDate;
   @JsonProperty("member_limit")
   private Integer memberLimit;

   public String getMethod() {
      return "editChatInviteLink";
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
      if (Strings.isNullOrEmpty(this.chatId)) {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      } else if (Strings.isNullOrEmpty(this.inviteLink)) {
         throw new TelegramApiValidationException("InviteLink can't be empty", this);
      } else if (this.memberLimit != null && (this.memberLimit < 1 || this.memberLimit > 99999)) {
         throw new TelegramApiValidationException("MemberLimit must be between 1 and 99999", this);
      }
   }

   public static EditChatInviteLink.EditChatInviteLinkBuilder builder() {
      return new EditChatInviteLink.EditChatInviteLinkBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EditChatInviteLink)) {
         return false;
      } else {
         EditChatInviteLink other = (EditChatInviteLink)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$expireDate = this.getExpireDate();
               Object other$expireDate = other.getExpireDate();
               if (this$expireDate == null) {
                  if (other$expireDate == null) {
                     break label59;
                  }
               } else if (this$expireDate.equals(other$expireDate)) {
                  break label59;
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

            Object this$inviteLink = this.getInviteLink();
            Object other$inviteLink = other.getInviteLink();
            if (this$inviteLink == null) {
               if (other$inviteLink != null) {
                  return false;
               }
            } else if (!this$inviteLink.equals(other$inviteLink)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof EditChatInviteLink;
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
      Object $inviteLink = this.getInviteLink();
      result = result * 59 + ($inviteLink == null ? 43 : $inviteLink.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public String getInviteLink() {
      return this.inviteLink;
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

   @JsonProperty("invite_link")
   public void setInviteLink(@NonNull String inviteLink) {
      if (inviteLink == null) {
         throw new NullPointerException("inviteLink is marked non-null but is null");
      } else {
         this.inviteLink = inviteLink;
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
      return "EditChatInviteLink(chatId=" + this.getChatId() + ", inviteLink=" + this.getInviteLink() + ", expireDate=" + this.getExpireDate() + ", memberLimit=" + this.getMemberLimit() + ")";
   }

   public EditChatInviteLink() {
   }

   public EditChatInviteLink(@NonNull String chatId, @NonNull String inviteLink, Integer expireDate, Integer memberLimit) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (inviteLink == null) {
         throw new NullPointerException("inviteLink is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.inviteLink = inviteLink;
         this.expireDate = expireDate;
         this.memberLimit = memberLimit;
      }
   }

   public EditChatInviteLink(@NonNull String chatId, @NonNull String inviteLink) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (inviteLink == null) {
         throw new NullPointerException("inviteLink is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.inviteLink = inviteLink;
      }
   }

   public static class EditChatInviteLinkBuilder {
      private String chatId;
      private String inviteLink;
      private Integer expireDate;
      private Integer memberLimit;

      EditChatInviteLinkBuilder() {
      }

      @JsonProperty("chat_id")
      public EditChatInviteLink.EditChatInviteLinkBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("invite_link")
      public EditChatInviteLink.EditChatInviteLinkBuilder inviteLink(@NonNull String inviteLink) {
         if (inviteLink == null) {
            throw new NullPointerException("inviteLink is marked non-null but is null");
         } else {
            this.inviteLink = inviteLink;
            return this;
         }
      }

      @JsonProperty("expire_date")
      public EditChatInviteLink.EditChatInviteLinkBuilder expireDate(Integer expireDate) {
         this.expireDate = expireDate;
         return this;
      }

      @JsonProperty("member_limit")
      public EditChatInviteLink.EditChatInviteLinkBuilder memberLimit(Integer memberLimit) {
         this.memberLimit = memberLimit;
         return this;
      }

      public EditChatInviteLink build() {
         return new EditChatInviteLink(this.chatId, this.inviteLink, this.expireDate, this.memberLimit);
      }

      public String toString() {
         return "EditChatInviteLink.EditChatInviteLinkBuilder(chatId=" + this.chatId + ", inviteLink=" + this.inviteLink + ", expireDate=" + this.expireDate + ", memberLimit=" + this.memberLimit + ")";
      }
   }
}
