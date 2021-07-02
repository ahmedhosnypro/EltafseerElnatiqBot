package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class ChatMember implements BotApiObject {
   private static final String USER_FIELD = "user";
   private static final String STATUS_FIELD = "status";
   private static final String UNTILDATE_FIELD = "until_date";
   private static final String CANBEEDITED_FIELD = "can_be_edited";
   private static final String CANCHANGEINFO_FIELD = "can_change_info";
   private static final String CANPOSTMESSAGES_FIELD = "can_post_messages";
   private static final String CANEDITMESSAGES_FIELD = "can_edit_messages";
   private static final String CANDELETEMESSAGES_FIELD = "can_delete_messages";
   private static final String CANINVITEUSERS_FIELD = "can_invite_users";
   private static final String CANRESTRICTMEMBERS_FIELD = "can_restrict_members";
   private static final String CANPINMESSAGES_FIELD = "can_pin_messages";
   private static final String CANPROMOTEMEMBERS_FIELD = "can_promote_members";
   private static final String CANSENDMESSAGES_FIELD = "can_send_messages";
   private static final String CANSENDMEDIAMESSAGES_FIELD = "can_send_media_messages";
   private static final String CANSENDOTHERMESSAGES_FIELD = "can_send_other_messages";
   private static final String CANADDWEBPAGEPREVIEWS_FIELD = "can_add_web_page_previews";
   private static final String CAN_SEND_POLLS_FIELD = "can_send_polls";
   private static final String ISMEMBER_FIELD = "is_member";
   private static final String CUSTOMTITLE_FIELD = "custom_title";
   private static final String ISANONYMOUS_FIELD = "is_anonymous";
   private static final String CANMANAGECHAT_FIELD = "can_manage_chat";
   private static final String CANMANAGEVOICECHATS_FIELD = "can_manage_voice_chats";
   @JsonProperty("user")
   private User user;
   @JsonProperty("status")
   private String status;
   @JsonProperty("until_date")
   private Integer untilDate;
   @JsonProperty("can_be_edited")
   private Boolean canBeEdited;
   @JsonProperty("can_change_info")
   private Boolean canChangeInfo;
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
   @JsonProperty("can_send_messages")
   private Boolean canSendMessages;
   @JsonProperty("can_send_media_messages")
   private Boolean canSendMediaMessages;
   @JsonProperty("can_send_other_messages")
   private Boolean canSendOtherMessages;
   @JsonProperty("can_add_web_page_previews")
   private Boolean canAddWebPagePreviews;
   @JsonProperty("can_send_polls")
   private Boolean canSendPolls;
   @JsonProperty("is_member")
   private Boolean isMember;
   @JsonProperty("custom_title")
   private String customTitle;
   @JsonProperty("is_anonymous")
   private Boolean isAnonymous;
   @JsonProperty("can_manage_chat")
   private Boolean canManageChat;
   @JsonProperty("can_manage_voice_chats")
   private Boolean canManageVoiceChats;

   public Instant getUntilDateAsInstant() {
      return this.untilDate == null ? null : Instant.ofEpochSecond((long)this.untilDate);
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ChatMember)) {
         return false;
      } else {
         ChatMember other = (ChatMember)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$untilDate = this.getUntilDate();
            Object other$untilDate = other.getUntilDate();
            if (this$untilDate == null) {
               if (other$untilDate != null) {
                  return false;
               }
            } else if (!this$untilDate.equals(other$untilDate)) {
               return false;
            }

            Object this$canBeEdited = this.getCanBeEdited();
            Object other$canBeEdited = other.getCanBeEdited();
            if (this$canBeEdited == null) {
               if (other$canBeEdited != null) {
                  return false;
               }
            } else if (!this$canBeEdited.equals(other$canBeEdited)) {
               return false;
            }

            Object this$canChangeInfo = this.getCanChangeInfo();
            Object other$canChangeInfo = other.getCanChangeInfo();
            if (this$canChangeInfo == null) {
               if (other$canChangeInfo != null) {
                  return false;
               }
            } else if (!this$canChangeInfo.equals(other$canChangeInfo)) {
               return false;
            }

            label254: {
               Object this$canPostMessages = this.getCanPostMessages();
               Object other$canPostMessages = other.getCanPostMessages();
               if (this$canPostMessages == null) {
                  if (other$canPostMessages == null) {
                     break label254;
                  }
               } else if (this$canPostMessages.equals(other$canPostMessages)) {
                  break label254;
               }

               return false;
            }

            label247: {
               Object this$canEditMessages = this.getCanEditMessages();
               Object other$canEditMessages = other.getCanEditMessages();
               if (this$canEditMessages == null) {
                  if (other$canEditMessages == null) {
                     break label247;
                  }
               } else if (this$canEditMessages.equals(other$canEditMessages)) {
                  break label247;
               }

               return false;
            }

            Object this$canDeleteMessages = this.getCanDeleteMessages();
            Object other$canDeleteMessages = other.getCanDeleteMessages();
            if (this$canDeleteMessages == null) {
               if (other$canDeleteMessages != null) {
                  return false;
               }
            } else if (!this$canDeleteMessages.equals(other$canDeleteMessages)) {
               return false;
            }

            label233: {
               Object this$canInviteUsers = this.getCanInviteUsers();
               Object other$canInviteUsers = other.getCanInviteUsers();
               if (this$canInviteUsers == null) {
                  if (other$canInviteUsers == null) {
                     break label233;
                  }
               } else if (this$canInviteUsers.equals(other$canInviteUsers)) {
                  break label233;
               }

               return false;
            }

            label226: {
               Object this$canRestrictMembers = this.getCanRestrictMembers();
               Object other$canRestrictMembers = other.getCanRestrictMembers();
               if (this$canRestrictMembers == null) {
                  if (other$canRestrictMembers == null) {
                     break label226;
                  }
               } else if (this$canRestrictMembers.equals(other$canRestrictMembers)) {
                  break label226;
               }

               return false;
            }

            Object this$canPinMessages = this.getCanPinMessages();
            Object other$canPinMessages = other.getCanPinMessages();
            if (this$canPinMessages == null) {
               if (other$canPinMessages != null) {
                  return false;
               }
            } else if (!this$canPinMessages.equals(other$canPinMessages)) {
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

            label205: {
               Object this$canSendMessages = this.getCanSendMessages();
               Object other$canSendMessages = other.getCanSendMessages();
               if (this$canSendMessages == null) {
                  if (other$canSendMessages == null) {
                     break label205;
                  }
               } else if (this$canSendMessages.equals(other$canSendMessages)) {
                  break label205;
               }

               return false;
            }

            label198: {
               Object this$canSendMediaMessages = this.getCanSendMediaMessages();
               Object other$canSendMediaMessages = other.getCanSendMediaMessages();
               if (this$canSendMediaMessages == null) {
                  if (other$canSendMediaMessages == null) {
                     break label198;
                  }
               } else if (this$canSendMediaMessages.equals(other$canSendMediaMessages)) {
                  break label198;
               }

               return false;
            }

            Object this$canSendOtherMessages = this.getCanSendOtherMessages();
            Object other$canSendOtherMessages = other.getCanSendOtherMessages();
            if (this$canSendOtherMessages == null) {
               if (other$canSendOtherMessages != null) {
                  return false;
               }
            } else if (!this$canSendOtherMessages.equals(other$canSendOtherMessages)) {
               return false;
            }

            label184: {
               Object this$canAddWebPagePreviews = this.getCanAddWebPagePreviews();
               Object other$canAddWebPagePreviews = other.getCanAddWebPagePreviews();
               if (this$canAddWebPagePreviews == null) {
                  if (other$canAddWebPagePreviews == null) {
                     break label184;
                  }
               } else if (this$canAddWebPagePreviews.equals(other$canAddWebPagePreviews)) {
                  break label184;
               }

               return false;
            }

            Object this$canSendPolls = this.getCanSendPolls();
            Object other$canSendPolls = other.getCanSendPolls();
            if (this$canSendPolls == null) {
               if (other$canSendPolls != null) {
                  return false;
               }
            } else if (!this$canSendPolls.equals(other$canSendPolls)) {
               return false;
            }

            label170: {
               Object this$isMember = this.getIsMember();
               Object other$isMember = other.getIsMember();
               if (this$isMember == null) {
                  if (other$isMember == null) {
                     break label170;
                  }
               } else if (this$isMember.equals(other$isMember)) {
                  break label170;
               }

               return false;
            }

            Object this$isAnonymous = this.getIsAnonymous();
            Object other$isAnonymous = other.getIsAnonymous();
            if (this$isAnonymous == null) {
               if (other$isAnonymous != null) {
                  return false;
               }
            } else if (!this$isAnonymous.equals(other$isAnonymous)) {
               return false;
            }

            Object this$canManageChat = this.getCanManageChat();
            Object other$canManageChat = other.getCanManageChat();
            if (this$canManageChat == null) {
               if (other$canManageChat != null) {
                  return false;
               }
            } else if (!this$canManageChat.equals(other$canManageChat)) {
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

            label142: {
               Object this$user = this.getUser();
               Object other$user = other.getUser();
               if (this$user == null) {
                  if (other$user == null) {
                     break label142;
                  }
               } else if (this$user.equals(other$user)) {
                  break label142;
               }

               return false;
            }

            label135: {
               Object this$status = this.getStatus();
               Object other$status = other.getStatus();
               if (this$status == null) {
                  if (other$status == null) {
                     break label135;
                  }
               } else if (this$status.equals(other$status)) {
                  break label135;
               }

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
      return other instanceof ChatMember;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $untilDate = this.getUntilDate();
      int result = result * 59 + ($untilDate == null ? 43 : $untilDate.hashCode());
      Object $canBeEdited = this.getCanBeEdited();
      result = result * 59 + ($canBeEdited == null ? 43 : $canBeEdited.hashCode());
      Object $canChangeInfo = this.getCanChangeInfo();
      result = result * 59 + ($canChangeInfo == null ? 43 : $canChangeInfo.hashCode());
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
      Object $canSendMessages = this.getCanSendMessages();
      result = result * 59 + ($canSendMessages == null ? 43 : $canSendMessages.hashCode());
      Object $canSendMediaMessages = this.getCanSendMediaMessages();
      result = result * 59 + ($canSendMediaMessages == null ? 43 : $canSendMediaMessages.hashCode());
      Object $canSendOtherMessages = this.getCanSendOtherMessages();
      result = result * 59 + ($canSendOtherMessages == null ? 43 : $canSendOtherMessages.hashCode());
      Object $canAddWebPagePreviews = this.getCanAddWebPagePreviews();
      result = result * 59 + ($canAddWebPagePreviews == null ? 43 : $canAddWebPagePreviews.hashCode());
      Object $canSendPolls = this.getCanSendPolls();
      result = result * 59 + ($canSendPolls == null ? 43 : $canSendPolls.hashCode());
      Object $isMember = this.getIsMember();
      result = result * 59 + ($isMember == null ? 43 : $isMember.hashCode());
      Object $isAnonymous = this.getIsAnonymous();
      result = result * 59 + ($isAnonymous == null ? 43 : $isAnonymous.hashCode());
      Object $canManageChat = this.getCanManageChat();
      result = result * 59 + ($canManageChat == null ? 43 : $canManageChat.hashCode());
      Object $canManageVoiceChats = this.getCanManageVoiceChats();
      result = result * 59 + ($canManageVoiceChats == null ? 43 : $canManageVoiceChats.hashCode());
      Object $user = this.getUser();
      result = result * 59 + ($user == null ? 43 : $user.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $customTitle = this.getCustomTitle();
      result = result * 59 + ($customTitle == null ? 43 : $customTitle.hashCode());
      return result;
   }

   public User getUser() {
      return this.user;
   }

   public String getStatus() {
      return this.status;
   }

   public Integer getUntilDate() {
      return this.untilDate;
   }

   public Boolean getCanBeEdited() {
      return this.canBeEdited;
   }

   public Boolean getCanChangeInfo() {
      return this.canChangeInfo;
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

   public Boolean getCanSendMessages() {
      return this.canSendMessages;
   }

   public Boolean getCanSendMediaMessages() {
      return this.canSendMediaMessages;
   }

   public Boolean getCanSendOtherMessages() {
      return this.canSendOtherMessages;
   }

   public Boolean getCanAddWebPagePreviews() {
      return this.canAddWebPagePreviews;
   }

   public Boolean getCanSendPolls() {
      return this.canSendPolls;
   }

   public Boolean getIsMember() {
      return this.isMember;
   }

   public String getCustomTitle() {
      return this.customTitle;
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

   @JsonProperty("user")
   public void setUser(User user) {
      this.user = user;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("until_date")
   public void setUntilDate(Integer untilDate) {
      this.untilDate = untilDate;
   }

   @JsonProperty("can_be_edited")
   public void setCanBeEdited(Boolean canBeEdited) {
      this.canBeEdited = canBeEdited;
   }

   @JsonProperty("can_change_info")
   public void setCanChangeInfo(Boolean canChangeInfo) {
      this.canChangeInfo = canChangeInfo;
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

   @JsonProperty("can_send_messages")
   public void setCanSendMessages(Boolean canSendMessages) {
      this.canSendMessages = canSendMessages;
   }

   @JsonProperty("can_send_media_messages")
   public void setCanSendMediaMessages(Boolean canSendMediaMessages) {
      this.canSendMediaMessages = canSendMediaMessages;
   }

   @JsonProperty("can_send_other_messages")
   public void setCanSendOtherMessages(Boolean canSendOtherMessages) {
      this.canSendOtherMessages = canSendOtherMessages;
   }

   @JsonProperty("can_add_web_page_previews")
   public void setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
      this.canAddWebPagePreviews = canAddWebPagePreviews;
   }

   @JsonProperty("can_send_polls")
   public void setCanSendPolls(Boolean canSendPolls) {
      this.canSendPolls = canSendPolls;
   }

   @JsonProperty("is_member")
   public void setIsMember(Boolean isMember) {
      this.isMember = isMember;
   }

   @JsonProperty("custom_title")
   public void setCustomTitle(String customTitle) {
      this.customTitle = customTitle;
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
      return "ChatMember(user=" + this.getUser() + ", status=" + this.getStatus() + ", untilDate=" + this.getUntilDate() + ", canBeEdited=" + this.getCanBeEdited() + ", canChangeInfo=" + this.getCanChangeInfo() + ", canPostMessages=" + this.getCanPostMessages() + ", canEditMessages=" + this.getCanEditMessages() + ", canDeleteMessages=" + this.getCanDeleteMessages() + ", canInviteUsers=" + this.getCanInviteUsers() + ", canRestrictMembers=" + this.getCanRestrictMembers() + ", canPinMessages=" + this.getCanPinMessages() + ", canPromoteMembers=" + this.getCanPromoteMembers() + ", canSendMessages=" + this.getCanSendMessages() + ", canSendMediaMessages=" + this.getCanSendMediaMessages() + ", canSendOtherMessages=" + this.getCanSendOtherMessages() + ", canAddWebPagePreviews=" + this.getCanAddWebPagePreviews() + ", canSendPolls=" + this.getCanSendPolls() + ", isMember=" + this.getIsMember() + ", customTitle=" + this.getCustomTitle() + ", isAnonymous=" + this.getIsAnonymous() + ", canManageChat=" + this.getCanManageChat() + ", canManageVoiceChats=" + this.getCanManageVoiceChats() + ")";
   }

   public ChatMember() {
   }

   public ChatMember(User user, String status, Integer untilDate, Boolean canBeEdited, Boolean canChangeInfo, Boolean canPostMessages, Boolean canEditMessages, Boolean canDeleteMessages, Boolean canInviteUsers, Boolean canRestrictMembers, Boolean canPinMessages, Boolean canPromoteMembers, Boolean canSendMessages, Boolean canSendMediaMessages, Boolean canSendOtherMessages, Boolean canAddWebPagePreviews, Boolean canSendPolls, Boolean isMember, String customTitle, Boolean isAnonymous, Boolean canManageChat, Boolean canManageVoiceChats) {
      this.user = user;
      this.status = status;
      this.untilDate = untilDate;
      this.canBeEdited = canBeEdited;
      this.canChangeInfo = canChangeInfo;
      this.canPostMessages = canPostMessages;
      this.canEditMessages = canEditMessages;
      this.canDeleteMessages = canDeleteMessages;
      this.canInviteUsers = canInviteUsers;
      this.canRestrictMembers = canRestrictMembers;
      this.canPinMessages = canPinMessages;
      this.canPromoteMembers = canPromoteMembers;
      this.canSendMessages = canSendMessages;
      this.canSendMediaMessages = canSendMediaMessages;
      this.canSendOtherMessages = canSendOtherMessages;
      this.canAddWebPagePreviews = canAddWebPagePreviews;
      this.canSendPolls = canSendPolls;
      this.isMember = isMember;
      this.customTitle = customTitle;
      this.isAnonymous = isAnonymous;
      this.canManageChat = canManageChat;
      this.canManageVoiceChats = canManageVoiceChats;
   }
}
