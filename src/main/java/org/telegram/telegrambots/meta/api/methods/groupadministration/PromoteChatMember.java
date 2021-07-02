package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class PromoteChatMember extends BotApiMethod<Boolean> {
   public static final String PATH = "promoteChatMember";
   private static final String CHATID_FIELD = "chat_id";
   private static final String USER_ID_FIELD = "user_id";
   private static final String CANCHANGEINFORMATION_FIELD = "can_change_info";
   private static final String CANPOSTMESSAGES_FIELD = "can_post_messages";
   private static final String CANEDITMESSAGES_FIELD = "can_edit_messages";
   private static final String CANDELETEMESSAGES_FIELD = "can_delete_messages";
   private static final String CANINVITEUSERS_FIELD = "can_invite_users";
   private static final String CANRESTRICTMEMBERS_FIELD = "can_restrict_members";
   private static final String CANPINMESSAGES_FIELD = "can_pin_messages";
   private static final String CANPROMOTEMEMBERS_FIELD = "can_promote_members";
   private static final String ISANONYMOUS_FIELD = "is_anonymous";
   private static final String CANMANAGECHAT_FIELD = "can_manage_chat";
   private static final String CANMANAGEVOICECHATS_FIELD = "can_manage_voice_chats";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("user_id")
   @NonNull
   private Long userId;
   @JsonProperty("can_change_info")
   private Boolean canChangeInformation;
   @JsonProperty("can_post_messages")
   private Boolean canPostMessages;
   @JsonProperty("can_edit_messages")
   private Boolean canEditMessages;
   @JsonProperty("can_delete_messages")
   private Boolean canDeleteMessages;
   @JsonProperty("can_invite_users")
   private Boolean canInviteUsers;
   @JsonProperty("can_restrict_members")
   private Boolean canRestrictMembers;
   @JsonProperty("can_pin_messages")
   private Boolean canPinMessages;
   @JsonProperty("can_promote_members")
   private Boolean canPromoteMembers;
   @JsonProperty("is_anonymous")
   private Boolean isAnonymous;
   @JsonProperty("can_manage_chat")
   private Boolean canManageChat;
   @JsonProperty("can_manage_voice_chats")
   private Boolean canManageVoiceChats;

   public String getMethod() {
      return "promoteChatMember";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error promoting chat member", result);
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

   public static PromoteChatMember.PromoteChatMemberBuilder builder() {
      return new PromoteChatMember.PromoteChatMemberBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PromoteChatMember)) {
         return false;
      } else {
         PromoteChatMember other = (PromoteChatMember)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label167: {
               Object this$userId = this.getUserId();
               Object other$userId = other.getUserId();
               if (this$userId == null) {
                  if (other$userId == null) {
                     break label167;
                  }
               } else if (this$userId.equals(other$userId)) {
                  break label167;
               }

               return false;
            }

            Object this$canChangeInformation = this.getCanChangeInformation();
            Object other$canChangeInformation = other.getCanChangeInformation();
            if (this$canChangeInformation == null) {
               if (other$canChangeInformation != null) {
                  return false;
               }
            } else if (!this$canChangeInformation.equals(other$canChangeInformation)) {
               return false;
            }

            label153: {
               Object this$canPostMessages = this.getCanPostMessages();
               Object other$canPostMessages = other.getCanPostMessages();
               if (this$canPostMessages == null) {
                  if (other$canPostMessages == null) {
                     break label153;
                  }
               } else if (this$canPostMessages.equals(other$canPostMessages)) {
                  break label153;
               }

               return false;
            }

            Object this$canEditMessages = this.getCanEditMessages();
            Object other$canEditMessages = other.getCanEditMessages();
            if (this$canEditMessages == null) {
               if (other$canEditMessages != null) {
                  return false;
               }
            } else if (!this$canEditMessages.equals(other$canEditMessages)) {
               return false;
            }

            label139: {
               Object this$canDeleteMessages = this.getCanDeleteMessages();
               Object other$canDeleteMessages = other.getCanDeleteMessages();
               if (this$canDeleteMessages == null) {
                  if (other$canDeleteMessages == null) {
                     break label139;
                  }
               } else if (this$canDeleteMessages.equals(other$canDeleteMessages)) {
                  break label139;
               }

               return false;
            }

            Object this$canInviteUsers = this.getCanInviteUsers();
            Object other$canInviteUsers = other.getCanInviteUsers();
            if (this$canInviteUsers == null) {
               if (other$canInviteUsers != null) {
                  return false;
               }
            } else if (!this$canInviteUsers.equals(other$canInviteUsers)) {
               return false;
            }

            label125: {
               Object this$canRestrictMembers = this.getCanRestrictMembers();
               Object other$canRestrictMembers = other.getCanRestrictMembers();
               if (this$canRestrictMembers == null) {
                  if (other$canRestrictMembers == null) {
                     break label125;
                  }
               } else if (this$canRestrictMembers.equals(other$canRestrictMembers)) {
                  break label125;
               }

               return false;
            }

            label118: {
               Object this$canPinMessages = this.getCanPinMessages();
               Object other$canPinMessages = other.getCanPinMessages();
               if (this$canPinMessages == null) {
                  if (other$canPinMessages == null) {
                     break label118;
                  }
               } else if (this$canPinMessages.equals(other$canPinMessages)) {
                  break label118;
               }

               return false;
            }

            Object this$canPromoteMembers = this.getCanPromoteMembers();
            Object other$canPromoteMembers = other.getCanPromoteMembers();
            if (this$canPromoteMembers == null) {
               if (other$canPromoteMembers != null) {
                  return false;
               }
            } else if (!this$canPromoteMembers.equals(other$canPromoteMembers)) {
               return false;
            }

            label104: {
               Object this$isAnonymous = this.getIsAnonymous();
               Object other$isAnonymous = other.getIsAnonymous();
               if (this$isAnonymous == null) {
                  if (other$isAnonymous == null) {
                     break label104;
                  }
               } else if (this$isAnonymous.equals(other$isAnonymous)) {
                  break label104;
               }

               return false;
            }

            label97: {
               Object this$canManageChat = this.getCanManageChat();
               Object other$canManageChat = other.getCanManageChat();
               if (this$canManageChat == null) {
                  if (other$canManageChat == null) {
                     break label97;
                  }
               } else if (this$canManageChat.equals(other$canManageChat)) {
                  break label97;
               }

               return false;
            }

            Object this$canManageVoiceChats = this.getCanManageVoiceChats();
            Object other$canManageVoiceChats = other.getCanManageVoiceChats();
            if (this$canManageVoiceChats == null) {
               if (other$canManageVoiceChats != null) {
                  return false;
               }
            } else if (!this$canManageVoiceChats.equals(other$canManageVoiceChats)) {
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
      return other instanceof PromoteChatMember;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $canChangeInformation = this.getCanChangeInformation();
      result = result * 59 + ($canChangeInformation == null ? 43 : $canChangeInformation.hashCode());
      Object $canPostMessages = this.getCanPostMessages();
      result = result * 59 + ($canPostMessages == null ? 43 : $canPostMessages.hashCode());
      Object $canEditMessages = this.getCanEditMessages();
      result = result * 59 + ($canEditMessages == null ? 43 : $canEditMessages.hashCode());
      Object $canDeleteMessages = this.getCanDeleteMessages();
      result = result * 59 + ($canDeleteMessages == null ? 43 : $canDeleteMessages.hashCode());
      Object $canInviteUsers = this.getCanInviteUsers();
      result = result * 59 + ($canInviteUsers == null ? 43 : $canInviteUsers.hashCode());
      Object $canRestrictMembers = this.getCanRestrictMembers();
      result = result * 59 + ($canRestrictMembers == null ? 43 : $canRestrictMembers.hashCode());
      Object $canPinMessages = this.getCanPinMessages();
      result = result * 59 + ($canPinMessages == null ? 43 : $canPinMessages.hashCode());
      Object $canPromoteMembers = this.getCanPromoteMembers();
      result = result * 59 + ($canPromoteMembers == null ? 43 : $canPromoteMembers.hashCode());
      Object $isAnonymous = this.getIsAnonymous();
      result = result * 59 + ($isAnonymous == null ? 43 : $isAnonymous.hashCode());
      Object $canManageChat = this.getCanManageChat();
      result = result * 59 + ($canManageChat == null ? 43 : $canManageChat.hashCode());
      Object $canManageVoiceChats = this.getCanManageVoiceChats();
      result = result * 59 + ($canManageVoiceChats == null ? 43 : $canManageVoiceChats.hashCode());
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

   public Boolean getCanChangeInformation() {
      return this.canChangeInformation;
   }

   public Boolean getCanPostMessages() {
      return this.canPostMessages;
   }

   public Boolean getCanEditMessages() {
      return this.canEditMessages;
   }

   public Boolean getCanDeleteMessages() {
      return this.canDeleteMessages;
   }

   public Boolean getCanInviteUsers() {
      return this.canInviteUsers;
   }

   public Boolean getCanRestrictMembers() {
      return this.canRestrictMembers;
   }

   public Boolean getCanPinMessages() {
      return this.canPinMessages;
   }

   public Boolean getCanPromoteMembers() {
      return this.canPromoteMembers;
   }

   public Boolean getIsAnonymous() {
      return this.isAnonymous;
   }

   public Boolean getCanManageChat() {
      return this.canManageChat;
   }

   public Boolean getCanManageVoiceChats() {
      return this.canManageVoiceChats;
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

   @JsonProperty("can_change_info")
   public void setCanChangeInformation(Boolean canChangeInformation) {
      this.canChangeInformation = canChangeInformation;
   }

   @JsonProperty("can_post_messages")
   public void setCanPostMessages(Boolean canPostMessages) {
      this.canPostMessages = canPostMessages;
   }

   @JsonProperty("can_edit_messages")
   public void setCanEditMessages(Boolean canEditMessages) {
      this.canEditMessages = canEditMessages;
   }

   @JsonProperty("can_delete_messages")
   public void setCanDeleteMessages(Boolean canDeleteMessages) {
      this.canDeleteMessages = canDeleteMessages;
   }

   @JsonProperty("can_invite_users")
   public void setCanInviteUsers(Boolean canInviteUsers) {
      this.canInviteUsers = canInviteUsers;
   }

   @JsonProperty("can_restrict_members")
   public void setCanRestrictMembers(Boolean canRestrictMembers) {
      this.canRestrictMembers = canRestrictMembers;
   }

   @JsonProperty("can_pin_messages")
   public void setCanPinMessages(Boolean canPinMessages) {
      this.canPinMessages = canPinMessages;
   }

   @JsonProperty("can_promote_members")
   public void setCanPromoteMembers(Boolean canPromoteMembers) {
      this.canPromoteMembers = canPromoteMembers;
   }

   @JsonProperty("is_anonymous")
   public void setIsAnonymous(Boolean isAnonymous) {
      this.isAnonymous = isAnonymous;
   }

   @JsonProperty("can_manage_chat")
   public void setCanManageChat(Boolean canManageChat) {
      this.canManageChat = canManageChat;
   }

   @JsonProperty("can_manage_voice_chats")
   public void setCanManageVoiceChats(Boolean canManageVoiceChats) {
      this.canManageVoiceChats = canManageVoiceChats;
   }

   public String toString() {
      return "PromoteChatMember(chatId=" + this.getChatId() + ", userId=" + this.getUserId() + ", canChangeInformation=" + this.getCanChangeInformation() + ", canPostMessages=" + this.getCanPostMessages() + ", canEditMessages=" + this.getCanEditMessages() + ", canDeleteMessages=" + this.getCanDeleteMessages() + ", canInviteUsers=" + this.getCanInviteUsers() + ", canRestrictMembers=" + this.getCanRestrictMembers() + ", canPinMessages=" + this.getCanPinMessages() + ", canPromoteMembers=" + this.getCanPromoteMembers() + ", isAnonymous=" + this.getIsAnonymous() + ", canManageChat=" + this.getCanManageChat() + ", canManageVoiceChats=" + this.getCanManageVoiceChats() + ")";
   }

   public PromoteChatMember(@NonNull String chatId, @NonNull Long userId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.userId = userId;
      }
   }

   public PromoteChatMember() {
   }

   public PromoteChatMember(@NonNull String chatId, @NonNull Long userId, Boolean canChangeInformation, Boolean canPostMessages, Boolean canEditMessages, Boolean canDeleteMessages, Boolean canInviteUsers, Boolean canRestrictMembers, Boolean canPinMessages, Boolean canPromoteMembers, Boolean isAnonymous, Boolean canManageChat, Boolean canManageVoiceChats) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.userId = userId;
         this.canChangeInformation = canChangeInformation;
         this.canPostMessages = canPostMessages;
         this.canEditMessages = canEditMessages;
         this.canDeleteMessages = canDeleteMessages;
         this.canInviteUsers = canInviteUsers;
         this.canRestrictMembers = canRestrictMembers;
         this.canPinMessages = canPinMessages;
         this.canPromoteMembers = canPromoteMembers;
         this.isAnonymous = isAnonymous;
         this.canManageChat = canManageChat;
         this.canManageVoiceChats = canManageVoiceChats;
      }
   }

   public static class PromoteChatMemberBuilder {
      private String chatId;
      private Long userId;
      private Boolean canChangeInformation;
      private Boolean canPostMessages;
      private Boolean canEditMessages;
      private Boolean canDeleteMessages;
      private Boolean canInviteUsers;
      private Boolean canRestrictMembers;
      private Boolean canPinMessages;
      private Boolean canPromoteMembers;
      private Boolean isAnonymous;
      private Boolean canManageChat;
      private Boolean canManageVoiceChats;

      PromoteChatMemberBuilder() {
      }

      @JsonProperty("chat_id")
      public PromoteChatMember.PromoteChatMemberBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("user_id")
      public PromoteChatMember.PromoteChatMemberBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      @JsonProperty("can_change_info")
      public PromoteChatMember.PromoteChatMemberBuilder canChangeInformation(Boolean canChangeInformation) {
         this.canChangeInformation = canChangeInformation;
         return this;
      }

      @JsonProperty("can_post_messages")
      public PromoteChatMember.PromoteChatMemberBuilder canPostMessages(Boolean canPostMessages) {
         this.canPostMessages = canPostMessages;
         return this;
      }

      @JsonProperty("can_edit_messages")
      public PromoteChatMember.PromoteChatMemberBuilder canEditMessages(Boolean canEditMessages) {
         this.canEditMessages = canEditMessages;
         return this;
      }

      @JsonProperty("can_delete_messages")
      public PromoteChatMember.PromoteChatMemberBuilder canDeleteMessages(Boolean canDeleteMessages) {
         this.canDeleteMessages = canDeleteMessages;
         return this;
      }

      @JsonProperty("can_invite_users")
      public PromoteChatMember.PromoteChatMemberBuilder canInviteUsers(Boolean canInviteUsers) {
         this.canInviteUsers = canInviteUsers;
         return this;
      }

      @JsonProperty("can_restrict_members")
      public PromoteChatMember.PromoteChatMemberBuilder canRestrictMembers(Boolean canRestrictMembers) {
         this.canRestrictMembers = canRestrictMembers;
         return this;
      }

      @JsonProperty("can_pin_messages")
      public PromoteChatMember.PromoteChatMemberBuilder canPinMessages(Boolean canPinMessages) {
         this.canPinMessages = canPinMessages;
         return this;
      }

      @JsonProperty("can_promote_members")
      public PromoteChatMember.PromoteChatMemberBuilder canPromoteMembers(Boolean canPromoteMembers) {
         this.canPromoteMembers = canPromoteMembers;
         return this;
      }

      @JsonProperty("is_anonymous")
      public PromoteChatMember.PromoteChatMemberBuilder isAnonymous(Boolean isAnonymous) {
         this.isAnonymous = isAnonymous;
         return this;
      }

      @JsonProperty("can_manage_chat")
      public PromoteChatMember.PromoteChatMemberBuilder canManageChat(Boolean canManageChat) {
         this.canManageChat = canManageChat;
         return this;
      }

      @JsonProperty("can_manage_voice_chats")
      public PromoteChatMember.PromoteChatMemberBuilder canManageVoiceChats(Boolean canManageVoiceChats) {
         this.canManageVoiceChats = canManageVoiceChats;
         return this;
      }

      public PromoteChatMember build() {
         return new PromoteChatMember(this.chatId, this.userId, this.canChangeInformation, this.canPostMessages, this.canEditMessages, this.canDeleteMessages, this.canInviteUsers, this.canRestrictMembers, this.canPinMessages, this.canPromoteMembers, this.isAnonymous, this.canManageChat, this.canManageVoiceChats);
      }

      public String toString() {
         return "PromoteChatMember.PromoteChatMemberBuilder(chatId=" + this.chatId + ", userId=" + this.userId + ", canChangeInformation=" + this.canChangeInformation + ", canPostMessages=" + this.canPostMessages + ", canEditMessages=" + this.canEditMessages + ", canDeleteMessages=" + this.canDeleteMessages + ", canInviteUsers=" + this.canInviteUsers + ", canRestrictMembers=" + this.canRestrictMembers + ", canPinMessages=" + this.canPinMessages + ", canPromoteMembers=" + this.canPromoteMembers + ", isAnonymous=" + this.isAnonymous + ", canManageChat=" + this.canManageChat + ", canManageVoiceChats=" + this.canManageVoiceChats + ")";
      }
   }
}
