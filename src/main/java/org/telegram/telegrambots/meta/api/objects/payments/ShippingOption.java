package org.telegram.telegrambots.meta.api.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class ShippingOption implements Validable, BotApiObject {
   private static final String ID_FIELD = "id";
   private static final String TITLE_FIELD = "title";
   private static final String PRICES_FIELD = "prices";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("title")
   @NonNull
   private String title;
   @JsonProperty("prices")
   @NonNull
   private List<LabeledPrice> prices;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.title != null && !this.title.isEmpty()) {
            if (this.prices != null && !this.prices.isEmpty()) {
               Iterator var1 = this.prices.iterator();

               while(var1.hasNext()) {
                  LabeledPrice price = (LabeledPrice)var1.next();
                  price.validate();
               }

            } else {
               throw new TelegramApiValidationException("Prices parameter can't be empty", this);
            }
         } else {
            throw new TelegramApiValidationException("Title parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("Id parameter can't be empty", this);
      }
   }

   public static ShippingOption.ShippingOptionBuilder builder() {
      return new ShippingOption.ShippingOptionBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ShippingOption)) {
         return false;
      } else {
         ShippingOption other = (ShippingOption)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label47;
                  }
               } else if (this$id.equals(other$id)) {
                  break label47;
               }

               return false;
            }

            Object this$title = this.getTitle();
            Object other$title = other.getTitle();
            if (this$title == null) {
               if (other$title != null) {
                  return false;
               }
            } else if (!this$title.equals(other$title)) {
               return false;
            }

            Object this$prices = this.getPrices();
            Object other$prices = other.getPrices();
            if (this$prices == null) {
               if (other$prices != null) {
                  return false;
               }
            } else if (!this$prices.equals(other$prices)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ShippingOption;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      int result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $prices = this.getPrices();
      result = result * 59 + ($prices == null ? 43 : $prices.hashCode());
      return result;
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getTitle() {
      return this.title;
   }

   @NonNull
   public List<LabeledPrice> getPrices() {
      return this.prices;
   }

   @JsonProperty("id")
   public void setId(@NonNull String id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
      }
   }

   @JsonProperty("title")
   public void setTitle(@NonNull String title) {
      if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.title = title;
      }
   }

   @JsonProperty("prices")
   public void setPrices(@NonNull List<LabeledPrice> prices) {
      if (prices == null) {
         throw new NullPointerException("prices is marked non-null but is null");
      } else {
         this.prices = prices;
      }
   }

   public String toString() {
      return "ShippingOption(id=" + this.getId() + ", title=" + this.getTitle() + ", prices=" + this.getPrices() + ")";
   }

   public ShippingOption() {
   }

   public ShippingOption(@NonNull String id, @NonNull String title, @NonNull List<LabeledPrice> prices) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (prices == null) {
         throw new NullPointerException("prices is marked non-null but is null");
      } else {
         this.id = id;
         this.title = title;
         this.prices = prices;
      }
   }

   public static class ShippingOptionBuilder {
      private String id;
      private String title;
      private ArrayList<LabeledPrice> prices;

      ShippingOptionBuilder() {
      }

      @JsonProperty("id")
      public ShippingOption.ShippingOptionBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("title")
      public ShippingOption.ShippingOptionBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      public ShippingOption.ShippingOptionBuilder price(LabeledPrice price) {
         if (this.prices == null) {
            this.prices = new ArrayList();
         }

         this.prices.add(price);
         return this;
      }

      @JsonProperty("prices")
      public ShippingOption.ShippingOptionBuilder prices(Collection<? extends LabeledPrice> prices) {
         if (prices == null) {
            throw new NullPointerException("prices cannot be null");
         } else {
            if (this.prices == null) {
               this.prices = new ArrayList();
            }

            this.prices.addAll(prices);
            return this;
         }
      }

      public ShippingOption.ShippingOptionBuilder clearPrices() {
         if (this.prices != null) {
            this.prices.clear();
         }

         return this;
      }

      public ShippingOption build() {
         List prices;
         switch(this.prices == null ? 0 : this.prices.size()) {
         case 0:
            prices = Collections.emptyList();
            break;
         case 1:
            prices = Collections.singletonList((LabeledPrice)this.prices.get(0));
            break;
         default:
            prices = Collections.unmodifiableList(new ArrayList(this.prices));
         }

         return new ShippingOption(this.id, this.title, prices);
      }

      public String toString() {
         return "ShippingOption.ShippingOptionBuilder(id=" + this.id + ", title=" + this.title + ", prices=" + this.prices + ")";
      }
   }
}
