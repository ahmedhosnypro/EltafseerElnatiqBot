package org.telegram.telegrambots.meta.api.objects.replykeyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineKeyboardMarkup implements ReplyKeyboard {
   private static final String KEYBOARD_FIELD = "inline_keyboard";
   @JsonProperty("inline_keyboard")
   @NonNull
   private List<List<InlineKeyboardButton>> keyboard;

   public void validate() throws TelegramApiValidationException {
      if (this.keyboard == null) {
         throw new TelegramApiValidationException("Keyboard parameter can't be null", this);
      } else {
         Iterator var1 = this.keyboard.iterator();

         while(var1.hasNext()) {
            List<InlineKeyboardButton> inlineKeyboardButtons = (List)var1.next();
            Iterator var3 = inlineKeyboardButtons.iterator();

            while(var3.hasNext()) {
               InlineKeyboardButton inlineKeyboardButton = (InlineKeyboardButton)var3.next();
               inlineKeyboardButton.validate();
            }
         }

      }
   }

   public static InlineKeyboardMarkup.InlineKeyboardMarkupBuilder builder() {
      return new InlineKeyboardMarkup.InlineKeyboardMarkupBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineKeyboardMarkup)) {
         return false;
      } else {
         InlineKeyboardMarkup other = (InlineKeyboardMarkup)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$keyboard = this.getKeyboard();
            Object other$keyboard = other.getKeyboard();
            if (this$keyboard == null) {
               if (other$keyboard != null) {
                  return false;
               }
            } else if (!this$keyboard.equals(other$keyboard)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InlineKeyboardMarkup;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $keyboard = this.getKeyboard();
      int result = result * 59 + ($keyboard == null ? 43 : $keyboard.hashCode());
      return result;
   }

   @NonNull
   public List<List<InlineKeyboardButton>> getKeyboard() {
      return this.keyboard;
   }

   @JsonProperty("inline_keyboard")
   public void setKeyboard(@NonNull List<List<InlineKeyboardButton>> keyboard) {
      if (keyboard == null) {
         throw new NullPointerException("keyboard is marked non-null but is null");
      } else {
         this.keyboard = keyboard;
      }
   }

   public String toString() {
      return "InlineKeyboardMarkup(keyboard=" + this.getKeyboard() + ")";
   }

   public InlineKeyboardMarkup() {
   }

   public InlineKeyboardMarkup(@NonNull List<List<InlineKeyboardButton>> keyboard) {
      if (keyboard == null) {
         throw new NullPointerException("keyboard is marked non-null but is null");
      } else {
         this.keyboard = keyboard;
      }
   }

   public static class InlineKeyboardMarkupBuilder {
      private ArrayList<List<InlineKeyboardButton>> keyboard;

      InlineKeyboardMarkupBuilder() {
      }

      public InlineKeyboardMarkup.InlineKeyboardMarkupBuilder keyboardRow(List<InlineKeyboardButton> keyboardRow) {
         if (this.keyboard == null) {
            this.keyboard = new ArrayList();
         }

         this.keyboard.add(keyboardRow);
         return this;
      }

      @JsonProperty("inline_keyboard")
      public InlineKeyboardMarkup.InlineKeyboardMarkupBuilder keyboard(Collection<? extends List<InlineKeyboardButton>> keyboard) {
         if (keyboard == null) {
            throw new NullPointerException("keyboard cannot be null");
         } else {
            if (this.keyboard == null) {
               this.keyboard = new ArrayList();
            }

            this.keyboard.addAll(keyboard);
            return this;
         }
      }

      public InlineKeyboardMarkup.InlineKeyboardMarkupBuilder clearKeyboard() {
         if (this.keyboard != null) {
            this.keyboard.clear();
         }

         return this;
      }

      public InlineKeyboardMarkup build() {
         List keyboard;
         switch(this.keyboard == null ? 0 : this.keyboard.size()) {
         case 0:
            keyboard = Collections.emptyList();
            break;
         case 1:
            keyboard = Collections.singletonList((List)this.keyboard.get(0));
            break;
         default:
            keyboard = Collections.unmodifiableList(new ArrayList(this.keyboard));
         }

         return new InlineKeyboardMarkup(keyboard);
      }

      public String toString() {
         return "InlineKeyboardMarkup.InlineKeyboardMarkupBuilder(keyboard=" + this.keyboard + ")";
      }
   }
}
