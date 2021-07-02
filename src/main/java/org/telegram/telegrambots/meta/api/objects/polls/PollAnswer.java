package org.telegram.telegrambots.meta.api.objects.polls;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.User;

public class PollAnswer implements BotApiObject {
   private static final String POLLID_FIELD = "poll_id";
   private static final String USER_FIELD = "user";
   private static final String OPTIONIDS_FIELD = "option_ids";
   @JsonProperty("poll_id")
   private String pollId;
   @JsonProperty("user")
   private User user;
   @JsonProperty("option_ids")
   private List<Integer> optionIds;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PollAnswer)) {
         return false;
      } else {
         PollAnswer other = (PollAnswer)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$pollId = this.getPollId();
               Object other$pollId = other.getPollId();
               if (this$pollId == null) {
                  if (other$pollId == null) {
                     break label47;
                  }
               } else if (this$pollId.equals(other$pollId)) {
                  break label47;
               }

               return false;
            }

            Object this$user = this.getUser();
            Object other$user = other.getUser();
            if (this$user == null) {
               if (other$user != null) {
                  return false;
               }
            } else if (!this$user.equals(other$user)) {
               return false;
            }

            Object this$optionIds = this.getOptionIds();
            Object other$optionIds = other.getOptionIds();
            if (this$optionIds == null) {
               if (other$optionIds != null) {
                  return false;
               }
            } else if (!this$optionIds.equals(other$optionIds)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PollAnswer;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $pollId = this.getPollId();
      int result = result * 59 + ($pollId == null ? 43 : $pollId.hashCode());
      Object $user = this.getUser();
      result = result * 59 + ($user == null ? 43 : $user.hashCode());
      Object $optionIds = this.getOptionIds();
      result = result * 59 + ($optionIds == null ? 43 : $optionIds.hashCode());
      return result;
   }

   public String getPollId() {
      return this.pollId;
   }

   public User getUser() {
      return this.user;
   }

   public List<Integer> getOptionIds() {
      return this.optionIds;
   }

   @JsonProperty("poll_id")
   public void setPollId(String pollId) {
      this.pollId = pollId;
   }

   @JsonProperty("user")
   public void setUser(User user) {
      this.user = user;
   }

   @JsonProperty("option_ids")
   public void setOptionIds(List<Integer> optionIds) {
      this.optionIds = optionIds;
   }

   public String toString() {
      return "PollAnswer(pollId=" + this.getPollId() + ", user=" + this.getUser() + ", optionIds=" + this.getOptionIds() + ")";
   }

   public PollAnswer() {
   }

   public PollAnswer(String pollId, User user, List<Integer> optionIds) {
      this.pollId = pollId;
      this.user = user;
      this.optionIds = optionIds;
   }
}
