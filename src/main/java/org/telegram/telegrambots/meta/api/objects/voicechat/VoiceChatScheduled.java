package org.telegram.telegrambots.meta.api.objects.voicechat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class VoiceChatScheduled implements BotApiObject {
   private static final String STARTDATE_FIELD = "start_date";
   @JsonProperty("start_date")
   @NonNull
   private Integer startDate;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VoiceChatScheduled)) {
         return false;
      } else {
         VoiceChatScheduled other = (VoiceChatScheduled)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$startDate = this.getStartDate();
            Object other$startDate = other.getStartDate();
            if (this$startDate == null) {
               if (other$startDate != null) {
                  return false;
               }
            } else if (!this$startDate.equals(other$startDate)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof VoiceChatScheduled;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $startDate = this.getStartDate();
      int result = result * 59 + ($startDate == null ? 43 : $startDate.hashCode());
      return result;
   }

   @NonNull
   public Integer getStartDate() {
      return this.startDate;
   }

   @JsonProperty("start_date")
   public void setStartDate(@NonNull Integer startDate) {
      if (startDate == null) {
         throw new NullPointerException("startDate is marked non-null but is null");
      } else {
         this.startDate = startDate;
      }
   }

   public String toString() {
      return "VoiceChatScheduled(startDate=" + this.getStartDate() + ")";
   }

   public VoiceChatScheduled() {
   }

   public VoiceChatScheduled(@NonNull Integer startDate) {
      if (startDate == null) {
         throw new NullPointerException("startDate is marked non-null but is null");
      } else {
         this.startDate = startDate;
      }
   }
}
