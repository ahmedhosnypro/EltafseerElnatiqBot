package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class ChatPermissions implements BotApiObject {
   private static final String CAN_SEND_MESSAGES_FIELD = "can_send_messages";
   private static final String CAN_SEND_MEDIA_MESSAGES_FIELD = "can_send_media_messages";
   private static final String CAN_SEND_POLLS_FIELD = "can_send_polls";
   private static final String CAN_SEND_OTHER_MESSAGES_FIELD = "can_send_other_messages";
   private static final String CAN_ADD_WEB_PAGE_PREVIEWS_FIELD = "can_add_web_page_previews";
   private static final String CAN_CHANGE_INFO_FIELD = "can_change_info";
   private static final String CAN_INVITE_USERS_FIELD = "can_invite_users";
   private static final String CAN_PIN_MESSAGES_FIELD = "can_pin_messages";
   @JsonProperty("can_send_messages")
   private Boolean canSendMessages;
   @JsonProperty("can_send_media_messages")
   private Boolean canSendMediaMessages;
   @JsonProperty("can_send_polls")
   private Boolean canSendPolls;
   @JsonProperty("can_send_other_messages")
   private Boolean canSendOtherMessages;
   @JsonProperty("can_add_web_page_previews")
   private Boolean canAddWebPagePreviews;
   @JsonProperty("can_change_info")
   private Boolean canChangeInfo;
   @JsonProperty("can_invite_users")
   private Boolean canInviteUsers;
   @JsonProperty("can_pin_messages")
   private Boolean canPinMessages;

   public static ChatPermissions.ChatPermissionsBuilder builder() {
      return new ChatPermissions.ChatPermissionsBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ChatPermissions)) {
         return false;
      } else {
         ChatPermissions other = (ChatPermissions)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label107: {
               Object this$canSendMessages = this.getCanSendMessages();
               Object other$canSendMessages = other.getCanSendMessages();
               if (this$canSendMessages == null) {
                  if (other$canSendMessages == null) {
                     break label107;
                  }
               } else if (this$canSendMessages.equals(other$canSendMessages)) {
                  break label107;
               }

               return false;
            }

            Object this$canSendMediaMessages = this.getCanSendMediaMessages();
            Object other$canSendMediaMessages = other.getCanSendMediaMessages();
            if (this$canSendMediaMessages == null) {
               if (other$canSendMediaMessages != null) {
                  return false;
               }
            } else if (!this$canSendMediaMessages.equals(other$canSendMediaMessages)) {
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

            label86: {
               Object this$canSendOtherMessages = this.getCanSendOtherMessages();
               Object other$canSendOtherMessages = other.getCanSendOtherMessages();
               if (this$canSendOtherMessages == null) {
                  if (other$canSendOtherMessages == null) {
                     break label86;
                  }
               } else if (this$canSendOtherMessages.equals(other$canSendOtherMessages)) {
                  break label86;
               }

               return false;
            }

            label79: {
               Object this$canAddWebPagePreviews = this.getCanAddWebPagePreviews();
               Object other$canAddWebPagePreviews = other.getCanAddWebPagePreviews();
               if (this$canAddWebPagePreviews == null) {
                  if (other$canAddWebPagePreviews == null) {
                     break label79;
                  }
               } else if (this$canAddWebPagePreviews.equals(other$canAddWebPagePreviews)) {
                  break label79;
               }

               return false;
            }

            label72: {
               Object this$canChangeInfo = this.getCanChangeInfo();
               Object other$canChangeInfo = other.getCanChangeInfo();
               if (this$canChangeInfo == null) {
                  if (other$canChangeInfo == null) {
                     break label72;
                  }
               } else if (this$canChangeInfo.equals(other$canChangeInfo)) {
                  break label72;
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

            Object this$canPinMessages = this.getCanPinMessages();
            Object other$canPinMessages = other.getCanPinMessages();
            if (this$canPinMessages == null) {
               if (other$canPinMessages != null) {
                  return false;
               }
            } else if (!this$canPinMessages.equals(other$canPinMessages)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ChatPermissions;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $canSendMessages = this.getCanSendMessages();
      int result = result * 59 + ($canSendMessages == null ? 43 : $canSendMessages.hashCode());
      Object $canSendMediaMessages = this.getCanSendMediaMessages();
      result = result * 59 + ($canSendMediaMessages == null ? 43 : $canSendMediaMessages.hashCode());
      Object $canSendPolls = this.getCanSendPolls();
      result = result * 59 + ($canSendPolls == null ? 43 : $canSendPolls.hashCode());
      Object $canSendOtherMessages = this.getCanSendOtherMessages();
      result = result * 59 + ($canSendOtherMessages == null ? 43 : $canSendOtherMessages.hashCode());
      Object $canAddWebPagePreviews = this.getCanAddWebPagePreviews();
      result = result * 59 + ($canAddWebPagePreviews == null ? 43 : $canAddWebPagePreviews.hashCode());
      Object $canChangeInfo = this.getCanChangeInfo();
      result = result * 59 + ($canChangeInfo == null ? 43 : $canChangeInfo.hashCode());
      Object $canInviteUsers = this.getCanInviteUsers();
      result = result * 59 + ($canInviteUsers == null ? 43 : $canInviteUsers.hashCode());
      Object $canPinMessages = this.getCanPinMessages();
      result = result * 59 + ($canPinMessages == null ? 43 : $canPinMessages.hashCode());
      return result;
   }

   public Boolean getCanSendMessages() {
      return this.canSendMessages;
   }

   public Boolean getCanSendMediaMessages() {
      return this.canSendMediaMessages;
   }

   public Boolean getCanSendPolls() {
      return this.canSendPolls;
   }

   public Boolean getCanSendOtherMessages() {
      return this.canSendOtherMessages;
   }

   public Boolean getCanAddWebPagePreviews() {
      return this.canAddWebPagePreviews;
   }

   public Boolean getCanChangeInfo() {
      return this.canChangeInfo;
   }

   public Boolean getCanInviteUsers() {
      return this.canInviteUsers;
   }

   public Boolean getCanPinMessages() {
      return this.canPinMessages;
   }

   @JsonProperty("can_send_messages")
   public void setCanSendMessages(Boolean canSendMessages) {
      this.canSendMessages = canSendMessages;
   }

   @JsonProperty("can_send_media_messages")
   public void setCanSendMediaMessages(Boolean canSendMediaMessages) {
      this.canSendMediaMessages = canSendMediaMessages;
   }

   @JsonProperty("can_send_polls")
   public void setCanSendPolls(Boolean canSendPolls) {
      this.canSendPolls = canSendPolls;
   }

   @JsonProperty("can_send_other_messages")
   public void setCanSendOtherMessages(Boolean canSendOtherMessages) {
      this.canSendOtherMessages = canSendOtherMessages;
   }

   @JsonProperty("can_add_web_page_previews")
   public void setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
      this.canAddWebPagePreviews = canAddWebPagePreviews;
   }

   @JsonProperty("can_change_info")
   public void setCanChangeInfo(Boolean canChangeInfo) {
      this.canChangeInfo = canChangeInfo;
   }

   @JsonProperty("can_invite_users")
   public void setCanInviteUsers(Boolean canInviteUsers) {
      this.canInviteUsers = canInviteUsers;
   }

   @JsonProperty("can_pin_messages")
   public void setCanPinMessages(Boolean canPinMessages) {
      this.canPinMessages = canPinMessages;
   }

   public String toString() {
      return "ChatPermissions(canSendMessages=" + this.getCanSendMessages() + ", canSendMediaMessages=" + this.getCanSendMediaMessages() + ", canSendPolls=" + this.getCanSendPolls() + ", canSendOtherMessages=" + this.getCanSendOtherMessages() + ", canAddWebPagePreviews=" + this.getCanAddWebPagePreviews() + ", canChangeInfo=" + this.getCanChangeInfo() + ", canInviteUsers=" + this.getCanInviteUsers() + ", canPinMessages=" + this.getCanPinMessages() + ")";
   }

   public ChatPermissions() {
   }

   public ChatPermissions(Boolean canSendMessages, Boolean canSendMediaMessages, Boolean canSendPolls, Boolean canSendOtherMessages, Boolean canAddWebPagePreviews, Boolean canChangeInfo, Boolean canInviteUsers, Boolean canPinMessages) {
      this.canSendMessages = canSendMessages;
      this.canSendMediaMessages = canSendMediaMessages;
      this.canSendPolls = canSendPolls;
      this.canSendOtherMessages = canSendOtherMessages;
      this.canAddWebPagePreviews = canAddWebPagePreviews;
      this.canChangeInfo = canChangeInfo;
      this.canInviteUsers = canInviteUsers;
      this.canPinMessages = canPinMessages;
   }

   public static class ChatPermissionsBuilder {
      private Boolean canSendMessages;
      private Boolean canSendMediaMessages;
      private Boolean canSendPolls;
      private Boolean canSendOtherMessages;
      private Boolean canAddWebPagePreviews;
      private Boolean canChangeInfo;
      private Boolean canInviteUsers;
      private Boolean canPinMessages;

      ChatPermissionsBuilder() {
      }

      @JsonProperty("can_send_messages")
      public ChatPermissions.ChatPermissionsBuilder canSendMessages(Boolean canSendMessages) {
         this.canSendMessages = canSendMessages;
         return this;
      }

      @JsonProperty("can_send_media_messages")
      public ChatPermissions.ChatPermissionsBuilder canSendMediaMessages(Boolean canSendMediaMessages) {
         this.canSendMediaMessages = canSendMediaMessages;
         return this;
      }

      @JsonProperty("can_send_polls")
      public ChatPermissions.ChatPermissionsBuilder canSendPolls(Boolean canSendPolls) {
         this.canSendPolls = canSendPolls;
         return this;
      }

      @JsonProperty("can_send_other_messages")
      public ChatPermissions.ChatPermissionsBuilder canSendOtherMessages(Boolean canSendOtherMessages) {
         this.canSendOtherMessages = canSendOtherMessages;
         return this;
      }

      @JsonProperty("can_add_web_page_previews")
      public ChatPermissions.ChatPermissionsBuilder canAddWebPagePreviews(Boolean canAddWebPagePreviews) {
         this.canAddWebPagePreviews = canAddWebPagePreviews;
         return this;
      }

      @JsonProperty("can_change_info")
      public ChatPermissions.ChatPermissionsBuilder canChangeInfo(Boolean canChangeInfo) {
         this.canChangeInfo = canChangeInfo;
         return this;
      }

      @JsonProperty("can_invite_users")
      public ChatPermissions.ChatPermissionsBuilder canInviteUsers(Boolean canInviteUsers) {
         this.canInviteUsers = canInviteUsers;
         return this;
      }

      @JsonProperty("can_pin_messages")
      public ChatPermissions.ChatPermissionsBuilder canPinMessages(Boolean canPinMessages) {
         this.canPinMessages = canPinMessages;
         return this;
      }

      public ChatPermissions build() {
         return new ChatPermissions(this.canSendMessages, this.canSendMediaMessages, this.canSendPolls, this.canSendOtherMessages, this.canAddWebPagePreviews, this.canChangeInfo, this.canInviteUsers, this.canPinMessages);
      }

      public String toString() {
         return "ChatPermissions.ChatPermissionsBuilder(canSendMessages=" + this.canSendMessages + ", canSendMediaMessages=" + this.canSendMediaMessages + ", canSendPolls=" + this.canSendPolls + ", canSendOtherMessages=" + this.canSendOtherMessages + ", canAddWebPagePreviews=" + this.canAddWebPagePreviews + ", canChangeInfo=" + this.canChangeInfo + ", canInviteUsers=" + this.canInviteUsers + ", canPinMessages=" + this.canPinMessages + ")";
      }
   }
}
