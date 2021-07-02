package org.telegram.telegrambots.meta.api.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.User;

public class PreCheckoutQuery implements BotApiObject {
   private static final String ID_FIELD = "id";
   private static final String FROM_FIELD = "from";
   private static final String CURRENCY_FIELD = "currency";
   private static final String TOTAL_AMOUNT_FIELD = "total_amount";
   private static final String INVOICE_PAYLOAD_FIELD = "invoice_payload";
   private static final String SHIPPING_OPTION_ID_FIELD = "shipping_option_id";
   private static final String ORDER_INFO_FIELD = "order_info";
   @JsonProperty("id")
   private String id;
   @JsonProperty("from")
   private User from;
   @JsonProperty("currency")
   private String currency;
   @JsonProperty("total_amount")
   private Integer totalAmount;
   @JsonProperty("invoice_payload")
   private String invoicePayload;
   @JsonProperty("shipping_option_id")
   private String shippingOptionId;
   @JsonProperty("order_info")
   private OrderInfo orderInfo;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PreCheckoutQuery)) {
         return false;
      } else {
         PreCheckoutQuery other = (PreCheckoutQuery)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label95: {
               Object this$totalAmount = this.getTotalAmount();
               Object other$totalAmount = other.getTotalAmount();
               if (this$totalAmount == null) {
                  if (other$totalAmount == null) {
                     break label95;
                  }
               } else if (this$totalAmount.equals(other$totalAmount)) {
                  break label95;
               }

               return false;
            }

            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
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

            label74: {
               Object this$currency = this.getCurrency();
               Object other$currency = other.getCurrency();
               if (this$currency == null) {
                  if (other$currency == null) {
                     break label74;
                  }
               } else if (this$currency.equals(other$currency)) {
                  break label74;
               }

               return false;
            }

            label67: {
               Object this$invoicePayload = this.getInvoicePayload();
               Object other$invoicePayload = other.getInvoicePayload();
               if (this$invoicePayload == null) {
                  if (other$invoicePayload == null) {
                     break label67;
                  }
               } else if (this$invoicePayload.equals(other$invoicePayload)) {
                  break label67;
               }

               return false;
            }

            Object this$shippingOptionId = this.getShippingOptionId();
            Object other$shippingOptionId = other.getShippingOptionId();
            if (this$shippingOptionId == null) {
               if (other$shippingOptionId != null) {
                  return false;
               }
            } else if (!this$shippingOptionId.equals(other$shippingOptionId)) {
               return false;
            }

            Object this$orderInfo = this.getOrderInfo();
            Object other$orderInfo = other.getOrderInfo();
            if (this$orderInfo == null) {
               if (other$orderInfo != null) {
                  return false;
               }
            } else if (!this$orderInfo.equals(other$orderInfo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PreCheckoutQuery;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $totalAmount = this.getTotalAmount();
      int result = result * 59 + ($totalAmount == null ? 43 : $totalAmount.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $from = this.getFrom();
      result = result * 59 + ($from == null ? 43 : $from.hashCode());
      Object $currency = this.getCurrency();
      result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
      Object $invoicePayload = this.getInvoicePayload();
      result = result * 59 + ($invoicePayload == null ? 43 : $invoicePayload.hashCode());
      Object $shippingOptionId = this.getShippingOptionId();
      result = result * 59 + ($shippingOptionId == null ? 43 : $shippingOptionId.hashCode());
      Object $orderInfo = this.getOrderInfo();
      result = result * 59 + ($orderInfo == null ? 43 : $orderInfo.hashCode());
      return result;
   }

   public String getId() {
      return this.id;
   }

   public User getFrom() {
      return this.from;
   }

   public String getCurrency() {
      return this.currency;
   }

   public Integer getTotalAmount() {
      return this.totalAmount;
   }

   public String getInvoicePayload() {
      return this.invoicePayload;
   }

   public String getShippingOptionId() {
      return this.shippingOptionId;
   }

   public OrderInfo getOrderInfo() {
      return this.orderInfo;
   }

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("from")
   public void setFrom(User from) {
      this.from = from;
   }

   @JsonProperty("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty("total_amount")
   public void setTotalAmount(Integer totalAmount) {
      this.totalAmount = totalAmount;
   }

   @JsonProperty("invoice_payload")
   public void setInvoicePayload(String invoicePayload) {
      this.invoicePayload = invoicePayload;
   }

   @JsonProperty("shipping_option_id")
   public void setShippingOptionId(String shippingOptionId) {
      this.shippingOptionId = shippingOptionId;
   }

   @JsonProperty("order_info")
   public void setOrderInfo(OrderInfo orderInfo) {
      this.orderInfo = orderInfo;
   }

   public String toString() {
      return "PreCheckoutQuery(id=" + this.getId() + ", from=" + this.getFrom() + ", currency=" + this.getCurrency() + ", totalAmount=" + this.getTotalAmount() + ", invoicePayload=" + this.getInvoicePayload() + ", shippingOptionId=" + this.getShippingOptionId() + ", orderInfo=" + this.getOrderInfo() + ")";
   }

   public PreCheckoutQuery() {
   }

   public PreCheckoutQuery(String id, User from, String currency, Integer totalAmount, String invoicePayload, String shippingOptionId, OrderInfo orderInfo) {
      this.id = id;
      this.from = from;
      this.currency = currency;
      this.totalAmount = totalAmount;
      this.invoicePayload = invoicePayload;
      this.shippingOptionId = shippingOptionId;
      this.orderInfo = orderInfo;
   }
}
