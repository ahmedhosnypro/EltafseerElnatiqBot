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

public class RevokeChatInviteLink extends BotApiMethod<ChatInviteLink> {
   public static final String PATH = "revokeChatInviteLink";
   private static final String CHATID_FIELD = "chat_id";
   private static final String INVITELINK_FIELD = "invite_link";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("invite_link")
   @NonNull
   private String inviteLink;

   public String getMethod() {
      return "revokeChatInviteLink";
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
      }
   }

   public static RevokeChatInviteLink.RevokeChatInviteLinkBuilder builder() {
      return new RevokeChatInviteLink.RevokeChatInviteLinkBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof RevokeChatInviteLink)) {
         return false;
      } else {
         RevokeChatInviteLink other = (RevokeChatInviteLink)o;
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
      return other instanceof RevokeChatInviteLink;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $chatId = this.getChatId();
      int result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
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

   public String toString() {
      return "RevokeChatInviteLink(chatId=" + this.getChatId() + ", inviteLink=" + this.getInviteLink() + ")";
   }

   public RevokeChatInviteLink() {
   }

   public RevokeChatInviteLink(@NonNull String chatId, @NonNull String inviteLink) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (inviteLink == null) {
         throw new NullPointerException("inviteLink is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.inviteLink = inviteLink;
      }
   }

   public static class RevokeChatInviteLinkBuilder {
      private String chatId;
      private String inviteLink;

      RevokeChatInviteLinkBuilder() {
      }

      @JsonProperty("chat_id")
      public RevokeChatInviteLink.RevokeChatInviteLinkBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("invite_link")
      public RevokeChatInviteLink.RevokeChatInviteLinkBuilder inviteLink(@NonNull String inviteLink) {
         if (inviteLink == null) {
            throw new NullPointerException("inviteLink is marked non-null but is null");
         } else {
            this.inviteLink = inviteLink;
            return this;
         }
      }

      public RevokeChatInviteLink build() {
         return new RevokeChatInviteLink(this.chatId, this.inviteLink);
      }

      public String toString() {
         return "RevokeChatInviteLink.RevokeChatInviteLinkBuilder(chatId=" + this.chatId + ", inviteLink=" + this.inviteLink + ")";
      }
   }
}
