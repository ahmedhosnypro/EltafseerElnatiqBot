package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class Chat implements BotApiObject {
   private static final String ID_FIELD = "id";
   private static final String TYPE_FIELD = "type";
   private static final String TITLE_FIELD = "title";
   private static final String USERNAME_FIELD = "username";
   private static final String FIRSTNAME_FIELD = "first_name";
   private static final String LASTNAME_FIELD = "last_name";
   private static final String BIO_FIELD = "bio";
   private static final String ALL_MEMBERS_ARE_ADMINISTRATORS_FIELD = "all_members_are_administrators";
   private static final String PHOTO_FIELD = "photo";
   private static final String DESCRIPTION_FIELD = "description";
   private static final String INVITELINK_FIELD = "invite_link";
   private static final String PINNEDMESSAGE_FIELD = "pinned_message";
   private static final String STICKERSETNAME_FIELD = "sticker_set_name";
   private static final String CANSETSTICKERSET_FIELD = "can_set_sticker_set";
   private static final String PERMISSIONS_FIELD = "permissions";
   private static final String SLOWMODEDELAY_FIELD = "slow_mode_delay";
   private static final String LINKEDCHATID_FIELD = "linked_chat_id";
   private static final String LOCATION_FIELD = "location";
   private static final String MESSAGEAUTODELETETIME_FIELD = "message_auto_delete_time";
   private static final String USERCHATTYPE = "private";
   private static final String GROUPCHATTYPE = "group";
   private static final String CHANNELCHATTYPE = "channel";
   private static final String SUPERGROUPCHATTYPE = "supergroup";
   @JsonProperty("id")
   @NonNull
   private Long id;
   @JsonProperty("type")
   @NonNull
   private String type;
   @JsonProperty("title")
   private String title;
   @JsonProperty("first_name")
   private String firstName;
   @JsonProperty("last_name")
   private String lastName;
   @JsonProperty("username")
   private String userName;
   @JsonProperty("all_members_are_administrators")
   private Boolean allMembersAreAdministrators;
   @JsonProperty("photo")
   private ChatPhoto photo;
   @JsonProperty("description")
   private String description;
   @JsonProperty("invite_link")
   private String inviteLink;
   @JsonProperty("pinned_message")
   private Message pinnedMessage;
   @JsonProperty("sticker_set_name")
   private String stickerSetName;
   @JsonProperty("can_set_sticker_set")
   private Boolean canSetStickerSet;
   @JsonProperty("permissions")
   private ChatPermissions permissions;
   @JsonProperty("slow_mode_delay")
   private Integer slowModeDelay;
   @JsonProperty("bio")
   private String bio;
   @JsonProperty("linked_chat_id")
   private Long linkedChatId;
   @JsonProperty("location")
   private ChatLocation location;
   @JsonProperty("message_auto_delete_time")
   private Integer messageAutoDeleteTime;

   @JsonIgnore
   public Boolean isGroupChat() {
      return "group".equals(this.type);
   }

   @JsonIgnore
   public Boolean isChannelChat() {
      return "channel".equals(this.type);
   }

   @JsonIgnore
   public Boolean isUserChat() {
      return "private".equals(this.type);
   }

   @JsonIgnore
   public Boolean isSuperGroupChat() {
      return "supergroup".equals(this.type);
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Chat)) {
         return false;
      } else {
         Chat other = (Chat)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label239: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label239;
                  }
               } else if (this$id.equals(other$id)) {
                  break label239;
               }

               return false;
            }

            Object this$allMembersAreAdministrators = this.getAllMembersAreAdministrators();
            Object other$allMembersAreAdministrators = other.getAllMembersAreAdministrators();
            if (this$allMembersAreAdministrators == null) {
               if (other$allMembersAreAdministrators != null) {
                  return false;
               }
            } else if (!this$allMembersAreAdministrators.equals(other$allMembersAreAdministrators)) {
               return false;
            }

            Object this$canSetStickerSet = this.getCanSetStickerSet();
            Object other$canSetStickerSet = other.getCanSetStickerSet();
            if (this$canSetStickerSet == null) {
               if (other$canSetStickerSet != null) {
                  return false;
               }
            } else if (!this$canSetStickerSet.equals(other$canSetStickerSet)) {
               return false;
            }

            label218: {
               Object this$slowModeDelay = this.getSlowModeDelay();
               Object other$slowModeDelay = other.getSlowModeDelay();
               if (this$slowModeDelay == null) {
                  if (other$slowModeDelay == null) {
                     break label218;
                  }
               } else if (this$slowModeDelay.equals(other$slowModeDelay)) {
                  break label218;
               }

               return false;
            }

            label211: {
               Object this$linkedChatId = this.getLinkedChatId();
               Object other$linkedChatId = other.getLinkedChatId();
               if (this$linkedChatId == null) {
                  if (other$linkedChatId == null) {
                     break label211;
                  }
               } else if (this$linkedChatId.equals(other$linkedChatId)) {
                  break label211;
               }

               return false;
            }

            Object this$messageAutoDeleteTime = this.getMessageAutoDeleteTime();
            Object other$messageAutoDeleteTime = other.getMessageAutoDeleteTime();
            if (this$messageAutoDeleteTime == null) {
               if (other$messageAutoDeleteTime != null) {
                  return false;
               }
            } else if (!this$messageAutoDeleteTime.equals(other$messageAutoDeleteTime)) {
               return false;
            }

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            label190: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label190;
                  }
               } else if (this$title.equals(other$title)) {
                  break label190;
               }

               return false;
            }

            label183: {
               Object this$firstName = this.getFirstName();
               Object other$firstName = other.getFirstName();
               if (this$firstName == null) {
                  if (other$firstName == null) {
                     break label183;
                  }
               } else if (this$firstName.equals(other$firstName)) {
                  break label183;
               }

               return false;
            }

            Object this$lastName = this.getLastName();
            Object other$lastName = other.getLastName();
            if (this$lastName == null) {
               if (other$lastName != null) {
                  return false;
               }
            } else if (!this$lastName.equals(other$lastName)) {
               return false;
            }

            label169: {
               Object this$userName = this.getUserName();
               Object other$userName = other.getUserName();
               if (this$userName == null) {
                  if (other$userName == null) {
                     break label169;
                  }
               } else if (this$userName.equals(other$userName)) {
                  break label169;
               }

               return false;
            }

            Object this$photo = this.getPhoto();
            Object other$photo = other.getPhoto();
            if (this$photo == null) {
               if (other$photo != null) {
                  return false;
               }
            } else if (!this$photo.equals(other$photo)) {
               return false;
            }

            label155: {
               Object this$description = this.getDescription();
               Object other$description = other.getDescription();
               if (this$description == null) {
                  if (other$description == null) {
                     break label155;
                  }
               } else if (this$description.equals(other$description)) {
                  break label155;
               }

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

            Object this$pinnedMessage = this.getPinnedMessage();
            Object other$pinnedMessage = other.getPinnedMessage();
            if (this$pinnedMessage == null) {
               if (other$pinnedMessage != null) {
                  return false;
               }
            } else if (!this$pinnedMessage.equals(other$pinnedMessage)) {
               return false;
            }

            label134: {
               Object this$stickerSetName = this.getStickerSetName();
               Object other$stickerSetName = other.getStickerSetName();
               if (this$stickerSetName == null) {
                  if (other$stickerSetName == null) {
                     break label134;
                  }
               } else if (this$stickerSetName.equals(other$stickerSetName)) {
                  break label134;
               }

               return false;
            }

            label127: {
               Object this$permissions = this.getPermissions();
               Object other$permissions = other.getPermissions();
               if (this$permissions == null) {
                  if (other$permissions == null) {
                     break label127;
                  }
               } else if (this$permissions.equals(other$permissions)) {
                  break label127;
               }

               return false;
            }

            Object this$bio = this.getBio();
            Object other$bio = other.getBio();
            if (this$bio == null) {
               if (other$bio != null) {
                  return false;
               }
            } else if (!this$bio.equals(other$bio)) {
               return false;
            }

            Object this$location = this.getLocation();
            Object other$location = other.getLocation();
            if (this$location == null) {
               if (other$location != null) {
                  return false;
               }
            } else if (!this$location.equals(other$location)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Chat;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      int result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $allMembersAreAdministrators = this.getAllMembersAreAdministrators();
      result = result * 59 + ($allMembersAreAdministrators == null ? 43 : $allMembersAreAdministrators.hashCode());
      Object $canSetStickerSet = this.getCanSetStickerSet();
      result = result * 59 + ($canSetStickerSet == null ? 43 : $canSetStickerSet.hashCode());
      Object $slowModeDelay = this.getSlowModeDelay();
      result = result * 59 + ($slowModeDelay == null ? 43 : $slowModeDelay.hashCode());
      Object $linkedChatId = this.getLinkedChatId();
      result = result * 59 + ($linkedChatId == null ? 43 : $linkedChatId.hashCode());
      Object $messageAutoDeleteTime = this.getMessageAutoDeleteTime();
      result = result * 59 + ($messageAutoDeleteTime == null ? 43 : $messageAutoDeleteTime.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $userName = this.getUserName();
      result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
      Object $photo = this.getPhoto();
      result = result * 59 + ($photo == null ? 43 : $photo.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $inviteLink = this.getInviteLink();
      result = result * 59 + ($inviteLink == null ? 43 : $inviteLink.hashCode());
      Object $pinnedMessage = this.getPinnedMessage();
      result = result * 59 + ($pinnedMessage == null ? 43 : $pinnedMessage.hashCode());
      Object $stickerSetName = this.getStickerSetName();
      result = result * 59 + ($stickerSetName == null ? 43 : $stickerSetName.hashCode());
      Object $permissions = this.getPermissions();
      result = result * 59 + ($permissions == null ? 43 : $permissions.hashCode());
      Object $bio = this.getBio();
      result = result * 59 + ($bio == null ? 43 : $bio.hashCode());
      Object $location = this.getLocation();
      result = result * 59 + ($location == null ? 43 : $location.hashCode());
      return result;
   }

   @NonNull
   public Long getId() {
      return this.id;
   }

   @NonNull
   public String getType() {
      return this.type;
   }

   public String getTitle() {
      return this.title;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public String getUserName() {
      return this.userName;
   }

   public Boolean getAllMembersAreAdministrators() {
      return this.allMembersAreAdministrators;
   }

   public ChatPhoto getPhoto() {
      return this.photo;
   }

   public String getDescription() {
      return this.description;
   }

   public String getInviteLink() {
      return this.inviteLink;
   }

   public Message getPinnedMessage() {
      return this.pinnedMessage;
   }

   public String getStickerSetName() {
      return this.stickerSetName;
   }

   public Boolean getCanSetStickerSet() {
      return this.canSetStickerSet;
   }

   public ChatPermissions getPermissions() {
      return this.permissions;
   }

   public Integer getSlowModeDelay() {
      return this.slowModeDelay;
   }

   public String getBio() {
      return this.bio;
   }

   public Long getLinkedChatId() {
      return this.linkedChatId;
   }

   public ChatLocation getLocation() {
      return this.location;
   }

   public Integer getMessageAutoDeleteTime() {
      return this.messageAutoDeleteTime;
   }

   @JsonProperty("id")
   public void setId(@NonNull Long id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
      }
   }

   @JsonProperty("type")
   public void setType(@NonNull String type) {
      if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else {
         this.type = type;
      }
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("first_name")
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   @JsonProperty("last_name")
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   @JsonProperty("username")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("all_members_are_administrators")
   public void setAllMembersAreAdministrators(Boolean allMembersAreAdministrators) {
      this.allMembersAreAdministrators = allMembersAreAdministrators;
   }

   @JsonProperty("photo")
   public void setPhoto(ChatPhoto photo) {
      this.photo = photo;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("invite_link")
   public void setInviteLink(String inviteLink) {
      this.inviteLink = inviteLink;
   }

   @JsonProperty("pinned_message")
   public void setPinnedMessage(Message pinnedMessage) {
      this.pinnedMessage = pinnedMessage;
   }

   @JsonProperty("sticker_set_name")
   public void setStickerSetName(String stickerSetName) {
      this.stickerSetName = stickerSetName;
   }

   @JsonProperty("can_set_sticker_set")
   public void setCanSetStickerSet(Boolean canSetStickerSet) {
      this.canSetStickerSet = canSetStickerSet;
   }

   @JsonProperty("permissions")
   public void setPermissions(ChatPermissions permissions) {
      this.permissions = permissions;
   }

   @JsonProperty("slow_mode_delay")
   public void setSlowModeDelay(Integer slowModeDelay) {
      this.slowModeDelay = slowModeDelay;
   }

   @JsonProperty("bio")
   public void setBio(String bio) {
      this.bio = bio;
   }

   @JsonProperty("linked_chat_id")
   public void setLinkedChatId(Long linkedChatId) {
      this.linkedChatId = linkedChatId;
   }

   @JsonProperty("location")
   public void setLocation(ChatLocation location) {
      this.location = location;
   }

   @JsonProperty("message_auto_delete_time")
   public void setMessageAutoDeleteTime(Integer messageAutoDeleteTime) {
      this.messageAutoDeleteTime = messageAutoDeleteTime;
   }

   public String toString() {
      return "Chat(id=" + this.getId() + ", type=" + this.getType() + ", title=" + this.getTitle() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", userName=" + this.getUserName() + ", allMembersAreAdministrators=" + this.getAllMembersAreAdministrators() + ", photo=" + this.getPhoto() + ", description=" + this.getDescription() + ", inviteLink=" + this.getInviteLink() + ", pinnedMessage=" + this.getPinnedMessage() + ", stickerSetName=" + this.getStickerSetName() + ", canSetStickerSet=" + this.getCanSetStickerSet() + ", permissions=" + this.getPermissions() + ", slowModeDelay=" + this.getSlowModeDelay() + ", bio=" + this.getBio() + ", linkedChatId=" + this.getLinkedChatId() + ", location=" + this.getLocation() + ", messageAutoDeleteTime=" + this.getMessageAutoDeleteTime() + ")";
   }

   public Chat(@NonNull Long id, @NonNull String type) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else {
         this.id = id;
         this.type = type;
      }
   }

   public Chat() {
   }

   public Chat(@NonNull Long id, @NonNull String type, String title, String firstName, String lastName, String userName, Boolean allMembersAreAdministrators, ChatPhoto photo, String description, String inviteLink, Message pinnedMessage, String stickerSetName, Boolean canSetStickerSet, ChatPermissions permissions, Integer slowModeDelay, String bio, Long linkedChatId, ChatLocation location, Integer messageAutoDeleteTime) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else {
         this.id = id;
         this.type = type;
         this.title = title;
         this.firstName = firstName;
         this.lastName = lastName;
         this.userName = userName;
         this.allMembersAreAdministrators = allMembersAreAdministrators;
         this.photo = photo;
         this.description = description;
         this.inviteLink = inviteLink;
         this.pinnedMessage = pinnedMessage;
         this.stickerSetName = stickerSetName;
         this.canSetStickerSet = canSetStickerSet;
         this.permissions = permissions;
         this.slowModeDelay = slowModeDelay;
         this.bio = bio;
         this.linkedChatId = linkedChatId;
         this.location = location;
         this.messageAutoDeleteTime = messageAutoDeleteTime;
      }
   }
}
