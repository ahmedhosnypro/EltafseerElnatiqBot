package org.telegram.telegrambots.meta.api.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;

public class Invoice implements BotApiObject {
   private static final String TITLE_FIELD = "title";
   private static final String DESCRIPTION_FIELD = "description";
   private static final String START_PARAMETER_FIELD = "start_parameter";
   private static final String CURRENCY_FIELD = "currency";
   private static final String TOTAL_AMOUNT_FIELD = "total_amount";
   private static final String PHOTO_FIELD = "photo";
   @JsonProperty("title")
   private String title;
   @JsonProperty("description")
   private String description;
   @JsonProperty("start_parameter")
   private String startParameter;
   @JsonProperty("currency")
   private String currency;
   @JsonProperty("total_amount")
   private Integer totalAmount;
   @JsonProperty("photo")
   private PhotoSize photo;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Invoice)) {
         return false;
      } else {
         Invoice other = (Invoice)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$totalAmount = this.getTotalAmount();
            Object other$totalAmount = other.getTotalAmount();
            if (this$totalAmount == null) {
               if (other$totalAmount != null) {
                  return false;
               }
            } else if (!this$totalAmount.equals(other$totalAmount)) {
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

            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
               if (other$description != null) {
                  return false;
               }
            } else if (!this$description.equals(other$description)) {
               return false;
            }

            label62: {
               Object this$startParameter = this.getStartParameter();
               Object other$startParameter = other.getStartParameter();
               if (this$startParameter == null) {
                  if (other$startParameter == null) {
                     break label62;
                  }
               } else if (this$startParameter.equals(other$startParameter)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$currency = this.getCurrency();
               Object other$currency = other.getCurrency();
               if (this$currency == null) {
                  if (other$currency == null) {
                     break label55;
                  }
               } else if (this$currency.equals(other$currency)) {
                  break label55;
               }

               return false;
            }

            Object this$photo = this.getPhoto();
            Object other$photo = other.getPhoto();
            if (this$photo == null) {
               if (other$photo != null) {
                  return false;
               }
            } else if (!this$photo.equals(other$photo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Invoice;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $totalAmount = this.getTotalAmount();
      int result = result * 59 + ($totalAmount == null ? 43 : $totalAmount.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $startParameter = this.getStartParameter();
      result = result * 59 + ($startParameter == null ? 43 : $startParameter.hashCode());
      Object $currency = this.getCurrency();
      result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
      Object $photo = this.getPhoto();
      result = result * 59 + ($photo == null ? 43 : $photo.hashCode());
      return result;
   }

   public String getTitle() {
      return this.title;
   }

   public String getDescription() {
      return this.description;
   }

   public String getStartParameter() {
      return this.startParameter;
   }

   public String getCurrency() {
      return this.currency;
   }

   public Integer getTotalAmount() {
      return this.totalAmount;
   }

   public PhotoSize getPhoto() {
      return this.photo;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("start_parameter")
   public void setStartParameter(String startParameter) {
      this.startParameter = startParameter;
   }

   @JsonProperty("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty("total_amount")
   public void setTotalAmount(Integer totalAmount) {
      this.totalAmount = totalAmount;
   }

   @JsonProperty("photo")
   public void setPhoto(PhotoSize photo) {
      this.photo = photo;
   }

   public String toString() {
      return "Invoice(title=" + this.getTitle() + ", description=" + this.getDescription() + ", startParameter=" + this.getStartParameter() + ", currency=" + this.getCurrency() + ", totalAmount=" + this.getTotalAmount() + ", photo=" + this.getPhoto() + ")";
   }

   public Invoice() {
   }

   public Invoice(String title, String description, String startParameter, String currency, Integer totalAmount, PhotoSize photo) {
      this.title = title;
      this.description = description;
      this.startParameter = startParameter;
      this.currency = currency;
      this.totalAmount = totalAmount;
      this.photo = photo;
   }
}
