package org.telegram.telegrambots.meta.api.objects.games;

import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class CallbackGame implements BotApiObject {
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CallbackGame)) {
         return false;
      } else {
         CallbackGame other = (CallbackGame)o;
         return other.canEqual(this);
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CallbackGame;
   }

   public int hashCode() {
      int result = true;
      return 1;
   }

   public String toString() {
      return "CallbackGame()";
   }
}
