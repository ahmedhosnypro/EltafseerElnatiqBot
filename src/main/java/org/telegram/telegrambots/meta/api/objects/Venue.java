package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class Venue implements BotApiObject {
   private static final String LOCATION_FIELD = "location";
   private static final String TITLE_FIELD = "title";
   private static final String ADDRESS_FIELD = "address";
   private static final String FOURSQUAREID_FIELD = "foursquare_id";
   private static final String FOURSQUARETYPE_FIELD = "foursquare_type";
   private static final String GOOGLEPLACEID_FIELD = "google_place_id";
   private static final String GOOGLEPLACETYPE_FIELD = "google_place_type";
   @JsonProperty("location")
   private Location location;
   @JsonProperty("title")
   private String title;
   @JsonProperty("address")
   private String address;
   @JsonProperty("foursquare_id")
   private String foursquareId;
   @JsonProperty("foursquare_type")
   private String foursquareType;
   @JsonProperty("google_place_id")
   private String googlePlaceId;
   @JsonProperty("google_place_type")
   private String googlePlaceType;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Venue)) {
         return false;
      } else {
         Venue other = (Venue)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label95: {
               Object this$location = this.getLocation();
               Object other$location = other.getLocation();
               if (this$location == null) {
                  if (other$location == null) {
                     break label95;
                  }
               } else if (this$location.equals(other$location)) {
                  break label95;
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

            Object this$address = this.getAddress();
            Object other$address = other.getAddress();
            if (this$address == null) {
               if (other$address != null) {
                  return false;
               }
            } else if (!this$address.equals(other$address)) {
               return false;
            }

            label74: {
               Object this$foursquareId = this.getFoursquareId();
               Object other$foursquareId = other.getFoursquareId();
               if (this$foursquareId == null) {
                  if (other$foursquareId == null) {
                     break label74;
                  }
               } else if (this$foursquareId.equals(other$foursquareId)) {
                  break label74;
               }

               return false;
            }

            label67: {
               Object this$foursquareType = this.getFoursquareType();
               Object other$foursquareType = other.getFoursquareType();
               if (this$foursquareType == null) {
                  if (other$foursquareType == null) {
                     break label67;
                  }
               } else if (this$foursquareType.equals(other$foursquareType)) {
                  break label67;
               }

               return false;
            }

            Object this$googlePlaceId = this.getGooglePlaceId();
            Object other$googlePlaceId = other.getGooglePlaceId();
            if (this$googlePlaceId == null) {
               if (other$googlePlaceId != null) {
                  return false;
               }
            } else if (!this$googlePlaceId.equals(other$googlePlaceId)) {
               return false;
            }

            Object this$googlePlaceType = this.getGooglePlaceType();
            Object other$googlePlaceType = other.getGooglePlaceType();
            if (this$googlePlaceType == null) {
               if (other$googlePlaceType != null) {
                  return false;
               }
            } else if (!this$googlePlaceType.equals(other$googlePlaceType)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Venue;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $location = this.getLocation();
      int result = result * 59 + ($location == null ? 43 : $location.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $address = this.getAddress();
      result = result * 59 + ($address == null ? 43 : $address.hashCode());
      Object $foursquareId = this.getFoursquareId();
      result = result * 59 + ($foursquareId == null ? 43 : $foursquareId.hashCode());
      Object $foursquareType = this.getFoursquareType();
      result = result * 59 + ($foursquareType == null ? 43 : $foursquareType.hashCode());
      Object $googlePlaceId = this.getGooglePlaceId();
      result = result * 59 + ($googlePlaceId == null ? 43 : $googlePlaceId.hashCode());
      Object $googlePlaceType = this.getGooglePlaceType();
      result = result * 59 + ($googlePlaceType == null ? 43 : $googlePlaceType.hashCode());
      return result;
   }

   public Location getLocation() {
      return this.location;
   }

   public String getTitle() {
      return this.title;
   }

   public String getAddress() {
      return this.address;
   }

   public String getFoursquareId() {
      return this.foursquareId;
   }

   public String getFoursquareType() {
      return this.foursquareType;
   }

   public String getGooglePlaceId() {
      return this.googlePlaceId;
   }

   public String getGooglePlaceType() {
      return this.googlePlaceType;
   }

   @JsonProperty("location")
   public void setLocation(Location location) {
      this.location = location;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("foursquare_id")
   public void setFoursquareId(String foursquareId) {
      this.foursquareId = foursquareId;
   }

   @JsonProperty("foursquare_type")
   public void setFoursquareType(String foursquareType) {
      this.foursquareType = foursquareType;
   }

   @JsonProperty("google_place_id")
   public void setGooglePlaceId(String googlePlaceId) {
      this.googlePlaceId = googlePlaceId;
   }

   @JsonProperty("google_place_type")
   public void setGooglePlaceType(String googlePlaceType) {
      this.googlePlaceType = googlePlaceType;
   }

   public String toString() {
      return "Venue(location=" + this.getLocation() + ", title=" + this.getTitle() + ", address=" + this.getAddress() + ", foursquareId=" + this.getFoursquareId() + ", foursquareType=" + this.getFoursquareType() + ", googlePlaceId=" + this.getGooglePlaceId() + ", googlePlaceType=" + this.getGooglePlaceType() + ")";
   }

   public Venue() {
   }

   public Venue(Location location, String title, String address, String foursquareId, String foursquareType, String googlePlaceId, String googlePlaceType) {
      this.location = location;
      this.title = title;
      this.address = address;
      this.foursquareId = foursquareId;
      this.foursquareType = foursquareType;
      this.googlePlaceId = googlePlaceId;
      this.googlePlaceType = googlePlaceType;
   }
}
