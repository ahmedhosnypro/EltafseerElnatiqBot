package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class MessageAutoDeleteTimerChanged implements BotApiObject {
   private static final String MESSAGEAUTODELETETIME_FIELD = "message_auto_delete_time";
   @JsonProperty("message_auto_delete_time")
   private Integer messageAutoDeleteTime;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof MessageAutoDeleteTimerChanged)) {
         return false;
      } else {
         MessageAutoDeleteTimerChanged other = (MessageAutoDeleteTimerChanged)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$messageAutoDeleteTime = this.getMessageAutoDeleteTime();
            Object other$messageAutoDeleteTime = other.getMessageAutoDeleteTime();
            if (this$messageAutoDeleteTime == null) {
               if (other$messageAutoDeleteTime != null) {
                  return false;
               }
            } else if (!this$messageAutoDeleteTime.equals(other$messageAutoDeleteTime)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof MessageAutoDeleteTimerChanged;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageAutoDeleteTime = this.getMessageAutoDeleteTime();
      int result = result * 59 + ($messageAutoDeleteTime == null ? 43 : $messageAutoDeleteTime.hashCode());
      return result;
   }

   public Integer getMessageAutoDeleteTime() {
      return this.messageAutoDeleteTime;
   }

   @JsonProperty("message_auto_delete_time")
   public void setMessageAutoDeleteTime(Integer messageAutoDeleteTime) {
      this.messageAutoDeleteTime = messageAutoDeleteTime;
   }

   public String toString() {
      return "MessageAutoDeleteTimerChanged(messageAutoDeleteTime=" + this.getMessageAutoDeleteTime() + ")";
   }

   public MessageAutoDeleteTimerChanged() {
   }

   public MessageAutoDeleteTimerChanged(Integer messageAutoDeleteTime) {
      this.messageAutoDeleteTime = messageAutoDeleteTime;
   }
}
