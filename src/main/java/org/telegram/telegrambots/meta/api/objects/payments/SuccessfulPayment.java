package org.telegram.telegrambots.meta.api.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class SuccessfulPayment implements BotApiObject {
   private static final String CURRENCY_FIELD = "currency";
   private static final String TOTAL_AMOUNT_FIELD = "total_amount";
   private static final String INVOICE_PAYLOAD_FIELD = "invoice_payload";
   private static final String SHIPPING_OPTION_ID_FIELD = "shipping_option_id";
   private static final String ORDER_INFO_FIELD = "order_info";
   private static final String TELEGRAM_PAYMENT_CHARGE_ID_FIELD = "telegram_payment_charge_id";
   private static final String PROVIDER_PAYMENT_CHARGE_ID_FIELD = "provider_payment_charge_id";
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
   @JsonProperty("telegram_payment_charge_id")
   private String telegramPaymentChargeId;
   @JsonProperty("provider_payment_charge_id")
   private String providerPaymentChargeId;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SuccessfulPayment)) {
         return false;
      } else {
         SuccessfulPayment other = (SuccessfulPayment)o;
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

            Object this$currency = this.getCurrency();
            Object other$currency = other.getCurrency();
            if (this$currency == null) {
               if (other$currency != null) {
                  return false;
               }
            } else if (!this$currency.equals(other$currency)) {
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

            label74: {
               Object this$shippingOptionId = this.getShippingOptionId();
               Object other$shippingOptionId = other.getShippingOptionId();
               if (this$shippingOptionId == null) {
                  if (other$shippingOptionId == null) {
                     break label74;
                  }
               } else if (this$shippingOptionId.equals(other$shippingOptionId)) {
                  break label74;
               }

               return false;
            }

            label67: {
               Object this$orderInfo = this.getOrderInfo();
               Object other$orderInfo = other.getOrderInfo();
               if (this$orderInfo == null) {
                  if (other$orderInfo == null) {
                     break label67;
                  }
               } else if (this$orderInfo.equals(other$orderInfo)) {
                  break label67;
               }

               return false;
            }

            Object this$telegramPaymentChargeId = this.getTelegramPaymentChargeId();
            Object other$telegramPaymentChargeId = other.getTelegramPaymentChargeId();
            if (this$telegramPaymentChargeId == null) {
               if (other$telegramPaymentChargeId != null) {
                  return false;
               }
            } else if (!this$telegramPaymentChargeId.equals(other$telegramPaymentChargeId)) {
               return false;
            }

            Object this$providerPaymentChargeId = this.getProviderPaymentChargeId();
            Object other$providerPaymentChargeId = other.getProviderPaymentChargeId();
            if (this$providerPaymentChargeId == null) {
               if (other$providerPaymentChargeId != null) {
                  return false;
               }
            } else if (!this$providerPaymentChargeId.equals(other$providerPaymentChargeId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SuccessfulPayment;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $totalAmount = this.getTotalAmount();
      int result = result * 59 + ($totalAmount == null ? 43 : $totalAmount.hashCode());
      Object $currency = this.getCurrency();
      result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
      Object $invoicePayload = this.getInvoicePayload();
      result = result * 59 + ($invoicePayload == null ? 43 : $invoicePayload.hashCode());
      Object $shippingOptionId = this.getShippingOptionId();
      result = result * 59 + ($shippingOptionId == null ? 43 : $shippingOptionId.hashCode());
      Object $orderInfo = this.getOrderInfo();
      result = result * 59 + ($orderInfo == null ? 43 : $orderInfo.hashCode());
      Object $telegramPaymentChargeId = this.getTelegramPaymentChargeId();
      result = result * 59 + ($telegramPaymentChargeId == null ? 43 : $telegramPaymentChargeId.hashCode());
      Object $providerPaymentChargeId = this.getProviderPaymentChargeId();
      result = result * 59 + ($providerPaymentChargeId == null ? 43 : $providerPaymentChargeId.hashCode());
      return result;
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

   public String getTelegramPaymentChargeId() {
      return this.telegramPaymentChargeId;
   }

   public String getProviderPaymentChargeId() {
      return this.providerPaymentChargeId;
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

   @JsonProperty("telegram_payment_charge_id")
   public void setTelegramPaymentChargeId(String telegramPaymentChargeId) {
      this.telegramPaymentChargeId = telegramPaymentChargeId;
   }

   @JsonProperty("provider_payment_charge_id")
   public void setProviderPaymentChargeId(String providerPaymentChargeId) {
      this.providerPaymentChargeId = providerPaymentChargeId;
   }

   public String toString() {
      return "SuccessfulPayment(currency=" + this.getCurrency() + ", totalAmount=" + this.getTotalAmount() + ", invoicePayload=" + this.getInvoicePayload() + ", shippingOptionId=" + this.getShippingOptionId() + ", orderInfo=" + this.getOrderInfo() + ", telegramPaymentChargeId=" + this.getTelegramPaymentChargeId() + ", providerPaymentChargeId=" + this.getProviderPaymentChargeId() + ")";
   }

   public SuccessfulPayment() {
   }

   public SuccessfulPayment(String currency, Integer totalAmount, String invoicePayload, String shippingOptionId, OrderInfo orderInfo, String telegramPaymentChargeId, String providerPaymentChargeId) {
      this.currency = currency;
      this.totalAmount = totalAmount;
      this.invoicePayload = invoicePayload;
      this.shippingOptionId = shippingOptionId;
      this.orderInfo = orderInfo;
      this.telegramPaymentChargeId = telegramPaymentChargeId;
      this.providerPaymentChargeId = providerPaymentChargeId;
   }
}
