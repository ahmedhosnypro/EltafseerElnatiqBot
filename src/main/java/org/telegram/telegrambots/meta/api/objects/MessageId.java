package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class MessageId implements BotApiObject {
   private static final String MESSAGEID_FIELD = "message_id";
   @JsonProperty("message_id")
   private Long messageId;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof MessageId)) {
         return false;
      } else {
         MessageId other = (MessageId)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$messageId = this.getMessageId();
            Object other$messageId = other.getMessageId();
            if (this$messageId == null) {
               if (other$messageId != null) {
                  return false;
               }
            } else if (!this$messageId.equals(other$messageId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof MessageId;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
      return result;
   }

   public Long getMessageId() {
      return this.messageId;
   }

   @JsonProperty("message_id")
   public void setMessageId(Long messageId) {
      this.messageId = messageId;
   }

   public String toString() {
      return "MessageId(messageId=" + this.getMessageId() + ")";
   }

   public MessageId() {
   }

   public MessageId(Long messageId) {
      this.messageId = messageId;
   }
}
