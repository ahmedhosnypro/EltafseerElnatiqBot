package org.telegram.telegrambots.meta.exceptions;

import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;

public class TelegramApiValidationException extends TelegramApiException {
   private PartialBotApiMethod method;
   private BotApiObject object;

   public TelegramApiValidationException(String message, PartialBotApiMethod method) {
      super(message);
      this.method = method;
   }

   public TelegramApiValidationException(String message, BotApiObject object) {
      super(message);
      this.object = object;
   }

   public BotApiObject getObject() {
      return this.object;
   }

   public PartialBotApiMethod getMethod() {
      return this.method;
   }

   public String toString() {
      if (this.method != null) {
         return super.toString() + " in method: " + this.method.toString();
      } else {
         return this.object != null ? super.toString() + " in object: " + this.object.toString() : super.toString();
      }
   }
}
