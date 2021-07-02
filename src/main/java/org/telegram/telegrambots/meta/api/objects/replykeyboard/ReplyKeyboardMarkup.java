package org.telegram.telegrambots.meta.api.objects.replykeyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class ReplyKeyboardMarkup implements ReplyKeyboard {
   private static final String KEYBOARD_FIELD = "keyboard";
   private static final String RESIZEKEYBOARD_FIELD = "resize_keyboard";
   private static final String ONETIMEKEYBOARD_FIELD = "one_time_keyboard";
   private static final String SELECTIVE_FIELD = "selective";
   @JsonProperty("keyboard")
   @NonNull
   private List<KeyboardRow> keyboard;
   @JsonProperty("resize_keyboard")
   private Boolean resizeKeyboard;
   @JsonProperty("one_time_keyboard")
   private Boolean oneTimeKeyboard;
   @JsonProperty("selective")
   private Boolean selective;

   public void validate() throws TelegramApiValidationException {
      if (this.keyboard == null) {
         throw new TelegramApiValidationException("Keyboard parameter can't be null", this);
      } else {
         Iterator var1 = this.keyboard.iterator();

         while(var1.hasNext()) {
            KeyboardRow keyboardButtons = (KeyboardRow)var1.next();
            keyboardButtons.validate();
         }

      }
   }

   public static ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder builder() {
      return new ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ReplyKeyboardMarkup)) {
         return false;
      } else {
         ReplyKeyboardMarkup other = (ReplyKeyboardMarkup)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$resizeKeyboard = this.getResizeKeyboard();
               Object other$resizeKeyboard = other.getResizeKeyboard();
               if (this$resizeKeyboard == null) {
                  if (other$resizeKeyboard == null) {
                     break label59;
                  }
               } else if (this$resizeKeyboard.equals(other$resizeKeyboard)) {
                  break label59;
               }

               return false;
            }

            Object this$oneTimeKeyboard = this.getOneTimeKeyboard();
            Object other$oneTimeKeyboard = other.getOneTimeKeyboard();
            if (this$oneTimeKeyboard == null) {
               if (other$oneTimeKeyboard != null) {
                  return false;
               }
            } else if (!this$oneTimeKeyboard.equals(other$oneTimeKeyboard)) {
               return false;
            }

            Object this$selective = this.getSelective();
            Object other$selective = other.getSelective();
            if (this$selective == null) {
               if (other$selective != null) {
                  return false;
               }
            } else if (!this$selective.equals(other$selective)) {
               return false;
            }

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
      return other instanceof ReplyKeyboardMarkup;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $resizeKeyboard = this.getResizeKeyboard();
      int result = result * 59 + ($resizeKeyboard == null ? 43 : $resizeKeyboard.hashCode());
      Object $oneTimeKeyboard = this.getOneTimeKeyboard();
      result = result * 59 + ($oneTimeKeyboard == null ? 43 : $oneTimeKeyboard.hashCode());
      Object $selective = this.getSelective();
      result = result * 59 + ($selective == null ? 43 : $selective.hashCode());
      Object $keyboard = this.getKeyboard();
      result = result * 59 + ($keyboard == null ? 43 : $keyboard.hashCode());
      return result;
   }

   @NonNull
   public List<KeyboardRow> getKeyboard() {
      return this.keyboard;
   }

   public Boolean getResizeKeyboard() {
      return this.resizeKeyboard;
   }

   public Boolean getOneTimeKeyboard() {
      return this.oneTimeKeyboard;
   }

   public Boolean getSelective() {
      return this.selective;
   }

   @JsonProperty("resize_keyboard")
   public void setResizeKeyboard(Boolean resizeKeyboard) {
      this.resizeKeyboard = resizeKeyboard;
   }

   @JsonProperty("one_time_keyboard")
   public void setOneTimeKeyboard(Boolean oneTimeKeyboard) {
      this.oneTimeKeyboard = oneTimeKeyboard;
   }

   @JsonProperty("selective")
   public void setSelective(Boolean selective) {
      this.selective = selective;
   }

   public String toString() {
      return "ReplyKeyboardMarkup(keyboard=" + this.getKeyboard() + ", resizeKeyboard=" + this.getResizeKeyboard() + ", oneTimeKeyboard=" + this.getOneTimeKeyboard() + ", selective=" + this.getSelective() + ")";
   }

   public ReplyKeyboardMarkup() {
   }

   public ReplyKeyboardMarkup(@NonNull List<KeyboardRow> keyboard) {
      if (keyboard == null) {
         throw new NullPointerException("keyboard is marked non-null but is null");
      } else {
         this.keyboard = keyboard;
      }
   }

   public ReplyKeyboardMarkup(@NonNull List<KeyboardRow> keyboard, Boolean resizeKeyboard, Boolean oneTimeKeyboard, Boolean selective) {
      if (keyboard == null) {
         throw new NullPointerException("keyboard is marked non-null but is null");
      } else {
         this.keyboard = keyboard;
         this.resizeKeyboard = resizeKeyboard;
         this.oneTimeKeyboard = oneTimeKeyboard;
         this.selective = selective;
      }
   }

   @JsonProperty("keyboard")
   public void setKeyboard(@NonNull List<KeyboardRow> keyboard) {
      if (keyboard == null) {
         throw new NullPointerException("keyboard is marked non-null but is null");
      } else {
         this.keyboard = keyboard;
      }
   }

   public static class ReplyKeyboardMarkupBuilder {
      private ArrayList<KeyboardRow> keyboard;
      private Boolean resizeKeyboard;
      private Boolean oneTimeKeyboard;
      private Boolean selective;

      ReplyKeyboardMarkupBuilder() {
      }

      public ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder keyboardRow(KeyboardRow keyboardRow) {
         if (this.keyboard == null) {
            this.keyboard = new ArrayList();
         }

         this.keyboard.add(keyboardRow);
         return this;
      }

      @JsonProperty("keyboard")
      public ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder keyboard(Collection<? extends KeyboardRow> keyboard) {
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

      public ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder clearKeyboard() {
         if (this.keyboard != null) {
            this.keyboard.clear();
         }

         return this;
      }

      @JsonProperty("resize_keyboard")
      public ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder resizeKeyboard(Boolean resizeKeyboard) {
         this.resizeKeyboard = resizeKeyboard;
         return this;
      }

      @JsonProperty("one_time_keyboard")
      public ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder oneTimeKeyboard(Boolean oneTimeKeyboard) {
         this.oneTimeKeyboard = oneTimeKeyboard;
         return this;
      }

      @JsonProperty("selective")
      public ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder selective(Boolean selective) {
         this.selective = selective;
         return this;
      }

      public ReplyKeyboardMarkup build() {
         List keyboard;
         switch(this.keyboard == null ? 0 : this.keyboard.size()) {
         case 0:
            keyboard = Collections.emptyList();
            break;
         case 1:
            keyboard = Collections.singletonList((KeyboardRow)this.keyboard.get(0));
            break;
         default:
            keyboard = Collections.unmodifiableList(new ArrayList(this.keyboard));
         }

         return new ReplyKeyboardMarkup(keyboard, this.resizeKeyboard, this.oneTimeKeyboard, this.selective);
      }

      public String toString() {
         return "ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder(keyboard=" + this.keyboard + ", resizeKeyboard=" + this.resizeKeyboard + ", oneTimeKeyboard=" + this.oneTimeKeyboard + ", selective=" + this.selective + ")";
      }
   }
}
