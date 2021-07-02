package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class ChatMemberUpdated implements BotApiObject {
   private static final String CHAT_FIELD = "chat";
   private static final String FROM_FIELD = "from";
   private static final String DATE_FIELD = "date";
   private static final String OLDCHATMEMBER_FIELD = "old_chat_member";
   private static final String NEWCHATMEMBER_FIELD = "new_chat_member";
   private static final String INVITELINK_FIELD = "invite_link";
   @JsonProperty("chat")
   private Chat chat;
   @JsonProperty("from")
   private User from;
   @JsonProperty("date")
   private Integer date;
   @JsonProperty("old_chat_member")
   private ChatMember oldChatMember;
   @JsonProperty("new_chat_member")
   private ChatMember newChatMember;
   @JsonProperty("invite_link")
   private ChatInviteLink inviteLink;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ChatMemberUpdated)) {
         return false;
      } else {
         ChatMemberUpdated other = (ChatMemberUpdated)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$date = this.getDate();
            Object other$date = other.getDate();
            if (this$date == null) {
               if (other$date != null) {
                  return false;
               }
            } else if (!this$date.equals(other$date)) {
               return false;
            }

            Object this$chat = this.getChat();
            Object other$chat = other.getChat();
            if (this$chat == null) {
               if (other$chat != null) {
                  return false;
               }
            } else if (!this$chat.equals(other$chat)) {
               return false;
            }

            Object this$from = this.getFrom();
            Object other$from = other.getFrom();
            if (this$from == null) {
               if (other$from != null) {
                  return false;
               }
            } else if (!this$from.equals(other$from)) {
               return false;
            }

            label62: {
               Object this$oldChatMember = this.getOldChatMember();
               Object other$oldChatMember = other.getOldChatMember();
               if (this$oldChatMember == null) {
                  if (other$oldChatMember == null) {
                     break label62;
                  }
               } else if (this$oldChatMember.equals(other$oldChatMember)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$newChatMember = this.getNewChatMember();
               Object other$newChatMember = other.getNewChatMember();
               if (this$newChatMember == null) {
                  if (other$newChatMember == null) {
                     break label55;
                  }
               } else if (this$newChatMember.equals(other$newChatMember)) {
                  break label55;
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ChatMemberUpdated;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $date = this.getDate();
      int result = result * 59 + ($date == null ? 43 : $date.hashCode());
      Object $chat = this.getChat();
      result = result * 59 + ($chat == null ? 43 : $chat.hashCode());
      Object $from = this.getFrom();
      result = result * 59 + ($from == null ? 43 : $from.hashCode());
      Object $oldChatMember = this.getOldChatMember();
      result = result * 59 + ($oldChatMember == null ? 43 : $oldChatMember.hashCode());
      Object $newChatMember = this.getNewChatMember();
      result = result * 59 + ($newChatMember == null ? 43 : $newChatMember.hashCode());
      Object $inviteLink = this.getInviteLink();
      result = result * 59 + ($inviteLink == null ? 43 : $inviteLink.hashCode());
      return result;
   }

   public Chat getChat() {
      return this.chat;
   }

   public User getFrom() {
      return this.from;
   }

   public Integer getDate() {
      return this.date;
   }

   public ChatMember getOldChatMember() {
      return this.oldChatMember;
   }

   public ChatMember getNewChatMember() {
      return this.newChatMember;
   }

   public ChatInviteLink getInviteLink() {
      return this.inviteLink;
   }

   @JsonProperty("chat")
   public void setChat(Chat chat) {
      this.chat = chat;
   }

   @JsonProperty("from")
   public void setFrom(User from) {
      this.from = from;
   }

   @JsonProperty("date")
   public void setDate(Integer date) {
      this.date = date;
   }

   @JsonProperty("old_chat_member")
   public void setOldChatMember(ChatMember oldChatMember) {
      this.oldChatMember = oldChatMember;
   }

   @JsonProperty("new_chat_member")
   public void setNewChatMember(ChatMember newChatMember) {
      this.newChatMember = newChatMember;
   }

   @JsonProperty("invite_link")
   public void setInviteLink(ChatInviteLink inviteLink) {
      this.inviteLink = inviteLink;
   }

   public String toString() {
      return "ChatMemberUpdated(chat=" + this.getChat() + ", from=" + this.getFrom() + ", date=" + this.getDate() + ", oldChatMember=" + this.getOldChatMember() + ", newChatMember=" + this.getNewChatMember() + ", inviteLink=" + this.getInviteLink() + ")";
   }

   public ChatMemberUpdated() {
   }

   public ChatMemberUpdated(Chat chat, User from, Integer date, ChatMember oldChatMember, ChatMember newChatMember, ChatInviteLink inviteLink) {
      this.chat = chat;
      this.from = from;
      this.date = date;
      this.oldChatMember = oldChatMember;
      this.newChatMember = newChatMember;
      this.inviteLink = inviteLink;
   }
}
