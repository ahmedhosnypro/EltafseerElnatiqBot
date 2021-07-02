package org.telegram.telegrambots.meta.api.objects.voicechat;

import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class VoiceChatStarted implements BotApiObject {
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VoiceChatStarted)) {
         return false;
      } else {
         VoiceChatStarted other = (VoiceChatStarted)o;
         return other.canEqual(this);
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof VoiceChatStarted;
   }

   public int hashCode() {
      int result = true;
      return 1;
   }

   public String toString() {
      return "VoiceChatStarted()";
   }
}
