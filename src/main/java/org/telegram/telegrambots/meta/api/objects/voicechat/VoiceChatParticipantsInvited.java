package org.telegram.telegrambots.meta.api.objects.voicechat;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.User;

public class VoiceChatParticipantsInvited implements BotApiObject {
   private static final String USERS_FIELD = "users";
   @JsonProperty("users")
   private List<User> users;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VoiceChatParticipantsInvited)) {
         return false;
      } else {
         VoiceChatParticipantsInvited other = (VoiceChatParticipantsInvited)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$users = this.getUsers();
            Object other$users = other.getUsers();
            if (this$users == null) {
               if (other$users != null) {
                  return false;
               }
            } else if (!this$users.equals(other$users)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof VoiceChatParticipantsInvited;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $users = this.getUsers();
      int result = result * 59 + ($users == null ? 43 : $users.hashCode());
      return result;
   }

   public List<User> getUsers() {
      return this.users;
   }

   @JsonProperty("users")
   public void setUsers(List<User> users) {
      this.users = users;
   }

   public String toString() {
      return "VoiceChatParticipantsInvited(users=" + this.getUsers() + ")";
   }

   public VoiceChatParticipantsInvited() {
   }

   public VoiceChatParticipantsInvited(List<User> users) {
      this.users = users;
   }
}
