package org.telegram.telegrambots.meta.api.objects.replykeyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.NonNull;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class ForceReplyKeyboard implements ReplyKeyboard {
   private static final String FORCEREPLY_FIELD = "force_reply";
   private static final String SELECTIVE_FIELD = "selective";
   @JsonProperty("force_reply")
   @NonNull
   private Boolean forceReply;
   @JsonProperty("selective")
   private Boolean selective;

   public void validate() throws TelegramApiValidationException {
      if (this.forceReply == null) {
         throw new TelegramApiValidationException("ForceReply parameter can't not be null", this);
      }
   }

   public static ForceReplyKeyboard.ForceReplyKeyboardBuilder builder() {
      return new ForceReplyKeyboard.ForceReplyKeyboardBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ForceReplyKeyboard)) {
         return false;
      } else {
         ForceReplyKeyboard other = (ForceReplyKeyboard)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$forceReply = this.getForceReply();
            Object other$forceReply = other.getForceReply();
            if (this$forceReply == null) {
               if (other$forceReply != null) {
                  return false;
               }
            } else if (!this$forceReply.equals(other$forceReply)) {
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
      return other instanceof ForceReplyKeyboard;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $forceReply = this.getForceReply();
      int result = result * 59 + ($forceReply == null ? 43 : $forceReply.hashCode());
      Object $selective = this.getSelective();
      result = result * 59 + ($selective == null ? 43 : $selective.hashCode());
      return result;
   }

   @NonNull
   public Boolean getForceReply() {
      return this.forceReply;
   }

   public Boolean getSelective() {
      return this.selective;
   }

   @JsonProperty("force_reply")
   public void setForceReply(@NonNull Boolean forceReply) {
      if (forceReply == null) {
         throw new NullPointerException("forceReply is marked non-null but is null");
      } else {
         this.forceReply = forceReply;
      }
   }

   @JsonProperty("selective")
   public void setSelective(Boolean selective) {
      this.selective = selective;
   }

   public String toString() {
      return "ForceReplyKeyboard(forceReply=" + this.getForceReply() + ", selective=" + this.getSelective() + ")";
   }

   public ForceReplyKeyboard() {
   }

   public ForceReplyKeyboard(@NonNull Boolean forceReply) {
      if (forceReply == null) {
         throw new NullPointerException("forceReply is marked non-null but is null");
      } else {
         this.forceReply = forceReply;
      }
   }

   public ForceReplyKeyboard(@NonNull Boolean forceReply, Boolean selective) {
      if (forceReply == null) {
         throw new NullPointerException("forceReply is marked non-null but is null");
      } else {
         this.forceReply = forceReply;
         this.selective = selective;
      }
   }

   public static class ForceReplyKeyboardBuilder {
      private Boolean forceReply;
      private Boolean selective;

      ForceReplyKeyboardBuilder() {
      }

      @JsonProperty("force_reply")
      public ForceReplyKeyboard.ForceReplyKeyboardBuilder forceReply(@NonNull Boolean forceReply) {
         if (forceReply == null) {
            throw new NullPointerException("forceReply is marked non-null but is null");
         } else {
            this.forceReply = forceReply;
            return this;
         }
      }

      @JsonProperty("selective")
      public ForceReplyKeyboard.ForceReplyKeyboardBuilder selective(Boolean selective) {
         this.selective = selective;
         return this;
      }

      public ForceReplyKeyboard build() {
         return new ForceReplyKeyboard(this.forceReply, this.selective);
      }

      public String toString() {
         return "ForceReplyKeyboard.ForceReplyKeyboardBuilder(forceReply=" + this.forceReply + ", selective=" + this.selective + ")";
      }
   }
}
