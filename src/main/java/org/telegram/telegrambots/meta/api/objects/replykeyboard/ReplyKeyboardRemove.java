package org.telegram.telegrambots.meta.api.objects.replykeyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.NonNull;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class ReplyKeyboardRemove implements ReplyKeyboard {
   private static final String REMOVEKEYBOARD_FIELD = "remove_keyboard";
   private static final String SELECTIVE_FIELD = "selective";
   @JsonProperty("remove_keyboard")
   @NonNull
   private Boolean removeKeyboard;
   @JsonProperty("selective")
   private Boolean selective;

   public void validate() throws TelegramApiValidationException {
      if (this.removeKeyboard == null) {
         throw new TelegramApiValidationException("RemoveKeyboard parameter can't be null", this);
      }
   }

   public static ReplyKeyboardRemove.ReplyKeyboardRemoveBuilder builder() {
      return new ReplyKeyboardRemove.ReplyKeyboardRemoveBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ReplyKeyboardRemove)) {
         return false;
      } else {
         ReplyKeyboardRemove other = (ReplyKeyboardRemove)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$removeKeyboard = this.getRemoveKeyboard();
            Object other$removeKeyboard = other.getRemoveKeyboard();
            if (this$removeKeyboard == null) {
               if (other$removeKeyboard != null) {
                  return false;
               }
            } else if (!this$removeKeyboard.equals(other$removeKeyboard)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ReplyKeyboardRemove;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $removeKeyboard = this.getRemoveKeyboard();
      int result = result * 59 + ($removeKeyboard == null ? 43 : $removeKeyboard.hashCode());
      Object $selective = this.getSelective();
      result = result * 59 + ($selective == null ? 43 : $selective.hashCode());
      return result;
   }

   @NonNull
   public Boolean getRemoveKeyboard() {
      return this.removeKeyboard;
   }

   public Boolean getSelective() {
      return this.selective;
   }

   @JsonProperty("remove_keyboard")
   public void setRemoveKeyboard(@NonNull Boolean removeKeyboard) {
      if (removeKeyboard == null) {
         throw new NullPointerException("removeKeyboard is marked non-null but is null");
      } else {
         this.removeKeyboard = removeKeyboard;
      }
   }

   @JsonProperty("selective")
   public void setSelective(Boolean selective) {
      this.selective = selective;
   }

   public String toString() {
      return "ReplyKeyboardRemove(removeKeyboard=" + this.getRemoveKeyboard() + ", selective=" + this.getSelective() + ")";
   }

   public ReplyKeyboardRemove() {
   }

   public ReplyKeyboardRemove(@NonNull Boolean removeKeyboard) {
      if (removeKeyboard == null) {
         throw new NullPointerException("removeKeyboard is marked non-null but is null");
      } else {
         this.removeKeyboard = removeKeyboard;
      }
   }

   public ReplyKeyboardRemove(@NonNull Boolean removeKeyboard, Boolean selective) {
      if (removeKeyboard == null) {
         throw new NullPointerException("removeKeyboard is marked non-null but is null");
      } else {
         this.removeKeyboard = removeKeyboard;
         this.selective = selective;
      }
   }

   public static class ReplyKeyboardRemoveBuilder {
      private Boolean removeKeyboard;
      private Boolean selective;

      ReplyKeyboardRemoveBuilder() {
      }

      @JsonProperty("remove_keyboard")
      public ReplyKeyboardRemove.ReplyKeyboardRemoveBuilder removeKeyboard(@NonNull Boolean removeKeyboard) {
         if (removeKeyboard == null) {
            throw new NullPointerException("removeKeyboard is marked non-null but is null");
         } else {
            this.removeKeyboard = removeKeyboard;
            return this;
         }
      }

      @JsonProperty("selective")
      public ReplyKeyboardRemove.ReplyKeyboardRemoveBuilder selective(Boolean selective) {
         this.selective = selective;
         return this;
      }

      public ReplyKeyboardRemove build() {
         return new ReplyKeyboardRemove(this.removeKeyboard, this.selective);
      }

      public String toString() {
         return "ReplyKeyboardRemove.ReplyKeyboardRemoveBuilder(removeKeyboard=" + this.removeKeyboard + ", selective=" + this.selective + ")";
      }
   }
}
