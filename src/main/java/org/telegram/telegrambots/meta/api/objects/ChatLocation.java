package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class ChatLocation implements BotApiObject {
   private static final String LOCATION_FIELD = "location";
   private static final String ADDRESS_FIELD = "address";
   @JsonProperty("location")
   private Location location;
   @JsonProperty("address")
   private String address;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ChatLocation)) {
         return false;
      } else {
         ChatLocation other = (ChatLocation)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$location = this.getLocation();
            Object other$location = other.getLocation();
            if (this$location == null) {
               if (other$location != null) {
                  return false;
               }
            } else if (!this$location.equals(other$location)) {
               return false;
            }

            Object this$address = this.getAddress();
            Object other$address = other.getAddress();
            if (this$address == null) {
               if (other$address != null) {
                  return false;
               }
            } else if (!this$address.equals(other$address)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ChatLocation;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $location = this.getLocation();
      int result = result * 59 + ($location == null ? 43 : $location.hashCode());
      Object $address = this.getAddress();
      result = result * 59 + ($address == null ? 43 : $address.hashCode());
      return result;
   }

   public Location getLocation() {
      return this.location;
   }

   public String getAddress() {
      return this.address;
   }

   @JsonProperty("location")
   public void setLocation(Location location) {
      this.location = location;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   public String toString() {
      return "ChatLocation(location=" + this.getLocation() + ", address=" + this.getAddress() + ")";
   }

   public ChatLocation() {
   }

   public ChatLocation(Location location, String address) {
      this.location = location;
      this.address = address;
   }
}
