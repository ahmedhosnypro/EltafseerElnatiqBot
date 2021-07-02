package org.telegram.telegrambots.meta.api.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class LabeledPrice implements Validable, BotApiObject {
   private static final String LABEL_FIELD = "label";
   private static final String AMOUNT_FIELD = "amount";
   @JsonProperty("label")
   @NonNull
   private String label;
   @JsonProperty("amount")
   @NonNull
   private Integer amount;

   public void validate() throws TelegramApiValidationException {
      if (this.label != null && !this.label.isEmpty()) {
         if (this.amount == null) {
            throw new TelegramApiValidationException("Amount parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("Label parameter can't be empty", this);
      }
   }

   public static LabeledPrice.LabeledPriceBuilder builder() {
      return new LabeledPrice.LabeledPriceBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof LabeledPrice)) {
         return false;
      } else {
         LabeledPrice other = (LabeledPrice)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$amount = this.getAmount();
            Object other$amount = other.getAmount();
            if (this$amount == null) {
               if (other$amount != null) {
                  return false;
               }
            } else if (!this$amount.equals(other$amount)) {
               return false;
            }

            Object this$label = this.getLabel();
            Object other$label = other.getLabel();
            if (this$label == null) {
               if (other$label != null) {
                  return false;
               }
            } else if (!this$label.equals(other$label)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof LabeledPrice;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $amount = this.getAmount();
      int result = result * 59 + ($amount == null ? 43 : $amount.hashCode());
      Object $label = this.getLabel();
      result = result * 59 + ($label == null ? 43 : $label.hashCode());
      return result;
   }

   @NonNull
   public String getLabel() {
      return this.label;
   }

   @NonNull
   public Integer getAmount() {
      return this.amount;
   }

   @JsonProperty("label")
   public void setLabel(@NonNull String label) {
      if (label == null) {
         throw new NullPointerException("label is marked non-null but is null");
      } else {
         this.label = label;
      }
   }

   @JsonProperty("amount")
   public void setAmount(@NonNull Integer amount) {
      if (amount == null) {
         throw new NullPointerException("amount is marked non-null but is null");
      } else {
         this.amount = amount;
      }
   }

   public String toString() {
      return "LabeledPrice(label=" + this.getLabel() + ", amount=" + this.getAmount() + ")";
   }

   public LabeledPrice() {
   }

   public LabeledPrice(@NonNull String label, @NonNull Integer amount) {
      if (label == null) {
         throw new NullPointerException("label is marked non-null but is null");
      } else if (amount == null) {
         throw new NullPointerException("amount is marked non-null but is null");
      } else {
         this.label = label;
         this.amount = amount;
      }
   }

   public static class LabeledPriceBuilder {
      private String label;
      private Integer amount;

      LabeledPriceBuilder() {
      }

      @JsonProperty("label")
      public LabeledPrice.LabeledPriceBuilder label(@NonNull String label) {
         if (label == null) {
            throw new NullPointerException("label is marked non-null but is null");
         } else {
            this.label = label;
            return this;
         }
      }

      @JsonProperty("amount")
      public LabeledPrice.LabeledPriceBuilder amount(@NonNull Integer amount) {
         if (amount == null) {
            throw new NullPointerException("amount is marked non-null but is null");
         } else {
            this.amount = amount;
            return this;
         }
      }

      public LabeledPrice build() {
         return new LabeledPrice(this.label, this.amount);
      }

      public String toString() {
         return "LabeledPrice.LabeledPriceBuilder(label=" + this.label + ", amount=" + this.amount + ")";
      }
   }
}
