package org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class KeyboardButtonPollType implements BotApiObject, Validable {
   private static final String TYPE_FIELD = "type";
   @JsonProperty("type")
   private String type;

   public void validate() throws TelegramApiValidationException {
   }

   public static KeyboardButtonPollType.KeyboardButtonPollTypeBuilder builder() {
      return new KeyboardButtonPollType.KeyboardButtonPollTypeBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof KeyboardButtonPollType)) {
         return false;
      } else {
         KeyboardButtonPollType other = (KeyboardButtonPollType)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof KeyboardButtonPollType;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $type = this.getType();
      int result = result * 59 + ($type == null ? 43 : $type.hashCode());
      return result;
   }

   public String getType() {
      return this.type;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   public String toString() {
      return "KeyboardButtonPollType(type=" + this.getType() + ")";
   }

   public KeyboardButtonPollType() {
   }

   public KeyboardButtonPollType(String type) {
      this.type = type;
   }

   public static class KeyboardButtonPollTypeBuilder {
      private String type;

      KeyboardButtonPollTypeBuilder() {
      }

      @JsonProperty("type")
      public KeyboardButtonPollType.KeyboardButtonPollTypeBuilder type(String type) {
         this.type = type;
         return this;
      }

      public KeyboardButtonPollType build() {
         return new KeyboardButtonPollType(this.type);
      }

      public String toString() {
         return "KeyboardButtonPollType.KeyboardButtonPollTypeBuilder(type=" + this.type + ")";
      }
   }
}
