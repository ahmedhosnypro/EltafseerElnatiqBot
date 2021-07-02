package org.telegram.telegrambots.meta.api.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.User;

public class ShippingQuery implements BotApiObject {
   private static final String ID_FIELD = "id";
   private static final String FROM_FIELD = "from";
   private static final String INVOICE_PAYLOAD_FIELD = "invoice_payload";
   private static final String SHIPPING_ADDRESS_FIELD = "shipping_address";
   @JsonProperty("id")
   private String id;
   @JsonProperty("from")
   private User from;
   @JsonProperty("invoice_payload")
   private String invoicePayload;
   @JsonProperty("shipping_address")
   private ShippingAddress shippingAddress;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ShippingQuery)) {
         return false;
      } else {
         ShippingQuery other = (ShippingQuery)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label59;
                  }
               } else if (this$id.equals(other$id)) {
                  break label59;
               }

               return false;
            }

            Object this$from = this.getFrom();
            Object other$from = other.getFrom();
            if (this$from == null) {
               if (other$from != null) {
                  return false;
               }
            } else if (!this$from.equals(other$from)) {
               return false;
            }

            Object this$invoicePayload = this.getInvoicePayload();
            Object other$invoicePayload = other.getInvoicePayload();
            if (this$invoicePayload == null) {
               if (other$invoicePayload != null) {
                  return false;
               }
            } else if (!this$invoicePayload.equals(other$invoicePayload)) {
               return false;
            }

            Object this$shippingAddress = this.getShippingAddress();
            Object other$shippingAddress = other.getShippingAddress();
            if (this$shippingAddress == null) {
               if (other$shippingAddress != null) {
                  return false;
               }
            } else if (!this$shippingAddress.equals(other$shippingAddress)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ShippingQuery;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      int result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $from = this.getFrom();
      result = result * 59 + ($from == null ? 43 : $from.hashCode());
      Object $invoicePayload = this.getInvoicePayload();
      result = result * 59 + ($invoicePayload == null ? 43 : $invoicePayload.hashCode());
      Object $shippingAddress = this.getShippingAddress();
      result = result * 59 + ($shippingAddress == null ? 43 : $shippingAddress.hashCode());
      return result;
   }

   public String getId() {
      return this.id;
   }

   public User getFrom() {
      return this.from;
   }

   public String getInvoicePayload() {
      return this.invoicePayload;
   }

   public ShippingAddress getShippingAddress() {
      return this.shippingAddress;
   }

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("from")
   public void setFrom(User from) {
      this.from = from;
   }

   @JsonProperty("invoice_payload")
   public void setInvoicePayload(String invoicePayload) {
      this.invoicePayload = invoicePayload;
   }

   @JsonProperty("shipping_address")
   public void setShippingAddress(ShippingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
   }

   public String toString() {
      return "ShippingQuery(id=" + this.getId() + ", from=" + this.getFrom() + ", invoicePayload=" + this.getInvoicePayload() + ", shippingAddress=" + this.getShippingAddress() + ")";
   }

   public ShippingQuery() {
   }

   public ShippingQuery(String id, User from, String invoicePayload, ShippingAddress shippingAddress) {
      this.id = id;
      this.from = from;
      this.invoicePayload = invoicePayload;
      this.shippingAddress = shippingAddress;
   }
}
