package org.telegram.telegrambots.meta.api.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class ShippingAddress implements BotApiObject {
   private static final String COUNTRY_CODE_FIELD = "country_code";
   private static final String STATE_FIELD = "state";
   private static final String CITY_FIELD = "city";
   private static final String STREET_LINE1_FIELD = "street_line1";
   private static final String STREET_LINE2_FIELD = "street_line2";
   private static final String POST_CODE_FIELD = "post_code";
   @JsonProperty("country_code")
   private String countryCode;
   @JsonProperty("state")
   private String state;
   @JsonProperty("city")
   private String city;
   @JsonProperty("street_line1")
   private String streetLine1;
   @JsonProperty("street_line2")
   private String streetLine2;
   @JsonProperty("post_code")
   private String postCode;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ShippingAddress)) {
         return false;
      } else {
         ShippingAddress other = (ShippingAddress)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$countryCode = this.getCountryCode();
            Object other$countryCode = other.getCountryCode();
            if (this$countryCode == null) {
               if (other$countryCode != null) {
                  return false;
               }
            } else if (!this$countryCode.equals(other$countryCode)) {
               return false;
            }

            Object this$state = this.getState();
            Object other$state = other.getState();
            if (this$state == null) {
               if (other$state != null) {
                  return false;
               }
            } else if (!this$state.equals(other$state)) {
               return false;
            }

            Object this$city = this.getCity();
            Object other$city = other.getCity();
            if (this$city == null) {
               if (other$city != null) {
                  return false;
               }
            } else if (!this$city.equals(other$city)) {
               return false;
            }

            label62: {
               Object this$streetLine1 = this.getStreetLine1();
               Object other$streetLine1 = other.getStreetLine1();
               if (this$streetLine1 == null) {
                  if (other$streetLine1 == null) {
                     break label62;
                  }
               } else if (this$streetLine1.equals(other$streetLine1)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$streetLine2 = this.getStreetLine2();
               Object other$streetLine2 = other.getStreetLine2();
               if (this$streetLine2 == null) {
                  if (other$streetLine2 == null) {
                     break label55;
                  }
               } else if (this$streetLine2.equals(other$streetLine2)) {
                  break label55;
               }

               return false;
            }

            Object this$postCode = this.getPostCode();
            Object other$postCode = other.getPostCode();
            if (this$postCode == null) {
               if (other$postCode != null) {
                  return false;
               }
            } else if (!this$postCode.equals(other$postCode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ShippingAddress;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $countryCode = this.getCountryCode();
      int result = result * 59 + ($countryCode == null ? 43 : $countryCode.hashCode());
      Object $state = this.getState();
      result = result * 59 + ($state == null ? 43 : $state.hashCode());
      Object $city = this.getCity();
      result = result * 59 + ($city == null ? 43 : $city.hashCode());
      Object $streetLine1 = this.getStreetLine1();
      result = result * 59 + ($streetLine1 == null ? 43 : $streetLine1.hashCode());
      Object $streetLine2 = this.getStreetLine2();
      result = result * 59 + ($streetLine2 == null ? 43 : $streetLine2.hashCode());
      Object $postCode = this.getPostCode();
      result = result * 59 + ($postCode == null ? 43 : $postCode.hashCode());
      return result;
   }

   public String getCountryCode() {
      return this.countryCode;
   }

   public String getState() {
      return this.state;
   }

   public String getCity() {
      return this.city;
   }

   public String getStreetLine1() {
      return this.streetLine1;
   }

   public String getStreetLine2() {
      return this.streetLine2;
   }

   public String getPostCode() {
      return this.postCode;
   }

   @JsonProperty("country_code")
   public void setCountryCode(String countryCode) {
      this.countryCode = countryCode;
   }

   @JsonProperty("state")
   public void setState(String state) {
      this.state = state;
   }

   @JsonProperty("city")
   public void setCity(String city) {
      this.city = city;
   }

   @JsonProperty("street_line1")
   public void setStreetLine1(String streetLine1) {
      this.streetLine1 = streetLine1;
   }

   @JsonProperty("street_line2")
   public void setStreetLine2(String streetLine2) {
      this.streetLine2 = streetLine2;
   }

   @JsonProperty("post_code")
   public void setPostCode(String postCode) {
      this.postCode = postCode;
   }

   public String toString() {
      return "ShippingAddress(countryCode=" + this.getCountryCode() + ", state=" + this.getState() + ", city=" + this.getCity() + ", streetLine1=" + this.getStreetLine1() + ", streetLine2=" + this.getStreetLine2() + ", postCode=" + this.getPostCode() + ")";
   }

   public ShippingAddress() {
   }

   public ShippingAddress(String countryCode, String state, String city, String streetLine1, String streetLine2, String postCode) {
      this.countryCode = countryCode;
      this.state = state;
      this.city = city;
      this.streetLine1 = streetLine1;
      this.streetLine2 = streetLine2;
      this.postCode = postCode;
   }
}
