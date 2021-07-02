package org.telegram.telegrambots.meta.api.objects.polls;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class PollOption implements BotApiObject {
   private static final String TEXT_FIELD = "text";
   private static final String VOTERCOUNT_FIELD = "voter_count";
   @JsonProperty("text")
   private String text;
   @JsonProperty("voter_count")
   private Integer voterCount;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PollOption)) {
         return false;
      } else {
         PollOption other = (PollOption)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$voterCount = this.getVoterCount();
            Object other$voterCount = other.getVoterCount();
            if (this$voterCount == null) {
               if (other$voterCount != null) {
                  return false;
               }
            } else if (!this$voterCount.equals(other$voterCount)) {
               return false;
            }

            Object this$text = this.getText();
            Object other$text = other.getText();
            if (this$text == null) {
               if (other$text != null) {
                  return false;
               }
            } else if (!this$text.equals(other$text)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PollOption;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $voterCount = this.getVoterCount();
      int result = result * 59 + ($voterCount == null ? 43 : $voterCount.hashCode());
      Object $text = this.getText();
      result = result * 59 + ($text == null ? 43 : $text.hashCode());
      return result;
   }

   public String getText() {
      return this.text;
   }

   public Integer getVoterCount() {
      return this.voterCount;
   }

   @JsonProperty("text")
   public void setText(String text) {
      this.text = text;
   }

   @JsonProperty("voter_count")
   public void setVoterCount(Integer voterCount) {
      this.voterCount = voterCount;
   }

   public String toString() {
      return "PollOption(text=" + this.getText() + ", voterCount=" + this.getVoterCount() + ")";
   }

   public PollOption() {
   }

   public PollOption(String text, Integer voterCount) {
      this.text = text;
      this.voterCount = voterCount;
   }
}
