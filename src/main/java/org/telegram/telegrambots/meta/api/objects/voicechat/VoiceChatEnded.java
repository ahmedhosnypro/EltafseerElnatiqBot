package org.telegram.telegrambots.meta.api.objects.voicechat;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class VoiceChatEnded implements BotApiObject {
   private static final String DURATION_FIELD = "duration";
   @JsonProperty("duration")
   private Integer duration;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VoiceChatEnded)) {
         return false;
      } else {
         VoiceChatEnded other = (VoiceChatEnded)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$duration = this.getDuration();
            Object other$duration = other.getDuration();
            if (this$duration == null) {
               if (other$duration != null) {
                  return false;
               }
            } else if (!this$duration.equals(other$duration)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof VoiceChatEnded;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $duration = this.getDuration();
      int result = result * 59 + ($duration == null ? 43 : $duration.hashCode());
      return result;
   }

   public Integer getDuration() {
      return this.duration;
   }

   @JsonProperty("duration")
   public void setDuration(Integer duration) {
      this.duration = duration;
   }

   public String toString() {
      return "VoiceChatEnded(duration=" + this.getDuration() + ")";
   }

   public VoiceChatEnded() {
   }

   public VoiceChatEnded(Integer duration) {
      this.duration = duration;
   }
}
