package org.telegram.telegrambots.meta.api.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class OrderInfo implements BotApiObject {
   private static final String NAME_FIELD = "name";
   private static final String PHONE_NUMBER_FIELD = "phone_number";
   private static final String EMAIL_FIELD = "email";
   private static final String SHIPPING_ADDRESS_FIELD = "shipping_address";
   @JsonProperty("name")
   private String name;
   @JsonProperty("phone_number")
   private String phoneNumber;
   @JsonProperty("email")
   private String email;
   @JsonProperty("shipping_address")
   private ShippingAddress shippingAddress;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof OrderInfo)) {
         return false;
      } else {
         OrderInfo other = (OrderInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name == null) {
                     break label59;
                  }
               } else if (this$name.equals(other$name)) {
                  break label59;
               }

               return false;
            }

            Object this$phoneNumber = this.getPhoneNumber();
            Object other$phoneNumber = other.getPhoneNumber();
            if (this$phoneNumber == null) {
               if (other$phoneNumber != null) {
                  return false;
               }
            } else if (!this$phoneNumber.equals(other$phoneNumber)) {
               return false;
            }

            Object this$email = this.getEmail();
            Object other$email = other.getEmail();
            if (this$email == null) {
               if (other$email != null) {
                  return false;
               }
            } else if (!this$email.equals(other$email)) {
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
      return other instanceof OrderInfo;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $name = this.getName();
      int result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $phoneNumber = this.getPhoneNumber();
      result = result * 59 + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $shippingAddress = this.getShippingAddress();
      result = result * 59 + ($shippingAddress == null ? 43 : $shippingAddress.hashCode());
      return result;
   }

   public String getName() {
      return this.name;
   }

   public String getPhoneNumber() {
      return this.phoneNumber;
   }

   public String getEmail() {
      return this.email;
   }

   public ShippingAddress getShippingAddress() {
      return this.shippingAddress;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("phone_number")
   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   @JsonProperty("email")
   public void setEmail(String email) {
      this.email = email;
   }

   @JsonProperty("shipping_address")
   public void setShippingAddress(ShippingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
   }

   public String toString() {
      return "OrderInfo(name=" + this.getName() + ", phoneNumber=" + this.getPhoneNumber() + ", email=" + this.getEmail() + ", shippingAddress=" + this.getShippingAddress() + ")";
   }

   public OrderInfo() {
   }

   public OrderInfo(String name, String phoneNumber, String email, ShippingAddress shippingAddress) {
      this.name = name;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.shippingAddress = shippingAddress;
   }
}
