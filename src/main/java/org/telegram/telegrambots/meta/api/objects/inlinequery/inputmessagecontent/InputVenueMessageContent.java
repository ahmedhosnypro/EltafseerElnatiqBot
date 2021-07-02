package org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.NonNull;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InputVenueMessageContent implements InputMessageContent {
   private static final String LATITUDE_FIELD = "latitude";
   private static final String LONGITUDE_FIELD = "longitude";
   private static final String TITLE_FIELD = "title";
   private static final String ADDRESS_FIELD = "address";
   private static final String FOURSQUAREID_FIELD = "foursquare_id";
   private static final String FOURSQUARETYPE_FIELD = "foursquare_type";
   private static final String GOOGLEPLACEID_FIELD = "google_place_id";
   private static final String GOOGLEPLACETYPE_FIELD = "google_place_type";
   @JsonProperty("latitude")
   @NonNull
   private Float latitude;
   @JsonProperty("longitude")
   @NonNull
   private Float longitude;
   @JsonProperty("title")
   @NonNull
   private String title;
   @JsonProperty("address")
   @NonNull
   private String address;
   @JsonProperty("foursquare_id")
   private String foursquareId;
   @JsonProperty("foursquare_type")
   private String foursquareType;
   @JsonProperty("google_place_id")
   private String googlePlaceId;
   @JsonProperty("google_place_type")
   private String googlePlaceType;

   public void validate() throws TelegramApiValidationException {
      if (this.latitude == null) {
         throw new TelegramApiValidationException("Latitude parameter can't be empty", this);
      } else if (this.longitude == null) {
         throw new TelegramApiValidationException("Longitude parameter can't be empty", this);
      } else if (this.title != null && !this.title.isEmpty()) {
         if (this.address == null || this.address.isEmpty()) {
            throw new TelegramApiValidationException("Address parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("Title parameter can't be empty", this);
      }
   }

   public static InputVenueMessageContent.InputVenueMessageContentBuilder builder() {
      return new InputVenueMessageContent.InputVenueMessageContentBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputVenueMessageContent)) {
         return false;
      } else {
         InputVenueMessageContent other = (InputVenueMessageContent)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label107: {
               Object this$latitude = this.getLatitude();
               Object other$latitude = other.getLatitude();
               if (this$latitude == null) {
                  if (other$latitude == null) {
                     break label107;
                  }
               } else if (this$latitude.equals(other$latitude)) {
                  break label107;
               }

               return false;
            }

            Object this$longitude = this.getLongitude();
            Object other$longitude = other.getLongitude();
            if (this$longitude == null) {
               if (other$longitude != null) {
                  return false;
               }
            } else if (!this$longitude.equals(other$longitude)) {
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

            label86: {
               Object this$address = this.getAddress();
               Object other$address = other.getAddress();
               if (this$address == null) {
                  if (other$address == null) {
                     break label86;
                  }
               } else if (this$address.equals(other$address)) {
                  break label86;
               }

               return false;
            }

            label79: {
               Object this$foursquareId = this.getFoursquareId();
               Object other$foursquareId = other.getFoursquareId();
               if (this$foursquareId == null) {
                  if (other$foursquareId == null) {
                     break label79;
                  }
               } else if (this$foursquareId.equals(other$foursquareId)) {
                  break label79;
               }

               return false;
            }

            label72: {
               Object this$foursquareType = this.getFoursquareType();
               Object other$foursquareType = other.getFoursquareType();
               if (this$foursquareType == null) {
                  if (other$foursquareType == null) {
                     break label72;
                  }
               } else if (this$foursquareType.equals(other$foursquareType)) {
                  break label72;
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
      return other instanceof InputVenueMessageContent;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $latitude = this.getLatitude();
      int result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());
      Object $longitude = this.getLongitude();
      result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());
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

   @NonNull
   public Float getLatitude() {
      return this.latitude;
   }

   @NonNull
   public Float getLongitude() {
      return this.longitude;
   }

   @NonNull
   public String getTitle() {
      return this.title;
   }

   @NonNull
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

   @JsonProperty("latitude")
   public void setLatitude(@NonNull Float latitude) {
      if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else {
         this.latitude = latitude;
      }
   }

   @JsonProperty("longitude")
   public void setLongitude(@NonNull Float longitude) {
      if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else {
         this.longitude = longitude;
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

   @JsonProperty("address")
   public void setAddress(@NonNull String address) {
      if (address == null) {
         throw new NullPointerException("address is marked non-null but is null");
      } else {
         this.address = address;
      }
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
      return "InputVenueMessageContent(latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", title=" + this.getTitle() + ", address=" + this.getAddress() + ", foursquareId=" + this.getFoursquareId() + ", foursquareType=" + this.getFoursquareType() + ", googlePlaceId=" + this.getGooglePlaceId() + ", googlePlaceType=" + this.getGooglePlaceType() + ")";
   }

   public InputVenueMessageContent(@NonNull Float latitude, @NonNull Float longitude, @NonNull String title, @NonNull String address) {
      if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (address == null) {
         throw new NullPointerException("address is marked non-null but is null");
      } else {
         this.latitude = latitude;
         this.longitude = longitude;
         this.title = title;
         this.address = address;
      }
   }

   public InputVenueMessageContent() {
   }

   public InputVenueMessageContent(@NonNull Float latitude, @NonNull Float longitude, @NonNull String title, @NonNull String address, String foursquareId, String foursquareType, String googlePlaceId, String googlePlaceType) {
      if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (address == null) {
         throw new NullPointerException("address is marked non-null but is null");
      } else {
         this.latitude = latitude;
         this.longitude = longitude;
         this.title = title;
         this.address = address;
         this.foursquareId = foursquareId;
         this.foursquareType = foursquareType;
         this.googlePlaceId = googlePlaceId;
         this.googlePlaceType = googlePlaceType;
      }
   }

   public static class InputVenueMessageContentBuilder {
      private Float latitude;
      private Float longitude;
      private String title;
      private String address;
      private String foursquareId;
      private String foursquareType;
      private String googlePlaceId;
      private String googlePlaceType;

      InputVenueMessageContentBuilder() {
      }

      @JsonProperty("latitude")
      public InputVenueMessageContent.InputVenueMessageContentBuilder latitude(@NonNull Float latitude) {
         if (latitude == null) {
            throw new NullPointerException("latitude is marked non-null but is null");
         } else {
            this.latitude = latitude;
            return this;
         }
      }

      @JsonProperty("longitude")
      public InputVenueMessageContent.InputVenueMessageContentBuilder longitude(@NonNull Float longitude) {
         if (longitude == null) {
            throw new NullPointerException("longitude is marked non-null but is null");
         } else {
            this.longitude = longitude;
            return this;
         }
      }

      @JsonProperty("title")
      public InputVenueMessageContent.InputVenueMessageContentBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      @JsonProperty("address")
      public InputVenueMessageContent.InputVenueMessageContentBuilder address(@NonNull String address) {
         if (address == null) {
            throw new NullPointerException("address is marked non-null but is null");
         } else {
            this.address = address;
            return this;
         }
      }

      @JsonProperty("foursquare_id")
      public InputVenueMessageContent.InputVenueMessageContentBuilder foursquareId(String foursquareId) {
         this.foursquareId = foursquareId;
         return this;
      }

      @JsonProperty("foursquare_type")
      public InputVenueMessageContent.InputVenueMessageContentBuilder foursquareType(String foursquareType) {
         this.foursquareType = foursquareType;
         return this;
      }

      @JsonProperty("google_place_id")
      public InputVenueMessageContent.InputVenueMessageContentBuilder googlePlaceId(String googlePlaceId) {
         this.googlePlaceId = googlePlaceId;
         return this;
      }

      @JsonProperty("google_place_type")
      public InputVenueMessageContent.InputVenueMessageContentBuilder googlePlaceType(String googlePlaceType) {
         this.googlePlaceType = googlePlaceType;
         return this;
      }

      public InputVenueMessageContent build() {
         return new InputVenueMessageContent(this.latitude, this.longitude, this.title, this.address, this.foursquareId, this.foursquareType, this.googlePlaceId, this.googlePlaceType);
      }

      public String toString() {
         return "InputVenueMessageContent.InputVenueMessageContentBuilder(latitude=" + this.latitude + ", longitude=" + this.longitude + ", title=" + this.title + ", address=" + this.address + ", foursquareId=" + this.foursquareId + ", foursquareType=" + this.foursquareType + ", googlePlaceId=" + this.googlePlaceId + ", googlePlaceType=" + this.googlePlaceType + ")";
      }
   }
}
