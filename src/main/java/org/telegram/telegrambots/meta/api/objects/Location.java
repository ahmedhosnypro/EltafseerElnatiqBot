package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class Location implements BotApiObject {
   private static final String LONGITUDE_FIELD = "longitude";
   private static final String LATITUDE_FIELD = "latitude";
   private static final String HORIZONTALACCURACY_FIELD = "horizontal_accuracy";
   private static final String LIVEPERIOD_FIELD = "live_period";
   private static final String HEADING_FIELD = "heading";
   private static final String PROXMITYALERTRADIUS_FIELD = "proximity_alert_radius";
   @JsonProperty("longitude")
   @NonNull
   private Double longitude;
   @JsonProperty("latitude")
   @NonNull
   private Double latitude;
   @JsonProperty("horizontal_accuracy")
   private Double horizontalAccuracy;
   @JsonProperty("live_period")
   private Integer livePeriod;
   @JsonProperty("heading")
   private Integer heading;
   @JsonProperty("proximity_alert_radius")
   private Integer proximityAlertRadius;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Location)) {
         return false;
      } else {
         Location other = (Location)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$longitude = this.getLongitude();
            Object other$longitude = other.getLongitude();
            if (this$longitude == null) {
               if (other$longitude != null) {
                  return false;
               }
            } else if (!this$longitude.equals(other$longitude)) {
               return false;
            }

            Object this$latitude = this.getLatitude();
            Object other$latitude = other.getLatitude();
            if (this$latitude == null) {
               if (other$latitude != null) {
                  return false;
               }
            } else if (!this$latitude.equals(other$latitude)) {
               return false;
            }

            Object this$horizontalAccuracy = this.getHorizontalAccuracy();
            Object other$horizontalAccuracy = other.getHorizontalAccuracy();
            if (this$horizontalAccuracy == null) {
               if (other$horizontalAccuracy != null) {
                  return false;
               }
            } else if (!this$horizontalAccuracy.equals(other$horizontalAccuracy)) {
               return false;
            }

            label62: {
               Object this$livePeriod = this.getLivePeriod();
               Object other$livePeriod = other.getLivePeriod();
               if (this$livePeriod == null) {
                  if (other$livePeriod == null) {
                     break label62;
                  }
               } else if (this$livePeriod.equals(other$livePeriod)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$heading = this.getHeading();
               Object other$heading = other.getHeading();
               if (this$heading == null) {
                  if (other$heading == null) {
                     break label55;
                  }
               } else if (this$heading.equals(other$heading)) {
                  break label55;
               }

               return false;
            }

            Object this$proximityAlertRadius = this.getProximityAlertRadius();
            Object other$proximityAlertRadius = other.getProximityAlertRadius();
            if (this$proximityAlertRadius == null) {
               if (other$proximityAlertRadius != null) {
                  return false;
               }
            } else if (!this$proximityAlertRadius.equals(other$proximityAlertRadius)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Location;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $longitude = this.getLongitude();
      int result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());
      Object $latitude = this.getLatitude();
      result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());
      Object $horizontalAccuracy = this.getHorizontalAccuracy();
      result = result * 59 + ($horizontalAccuracy == null ? 43 : $horizontalAccuracy.hashCode());
      Object $livePeriod = this.getLivePeriod();
      result = result * 59 + ($livePeriod == null ? 43 : $livePeriod.hashCode());
      Object $heading = this.getHeading();
      result = result * 59 + ($heading == null ? 43 : $heading.hashCode());
      Object $proximityAlertRadius = this.getProximityAlertRadius();
      result = result * 59 + ($proximityAlertRadius == null ? 43 : $proximityAlertRadius.hashCode());
      return result;
   }

   @NonNull
   public Double getLongitude() {
      return this.longitude;
   }

   @NonNull
   public Double getLatitude() {
      return this.latitude;
   }

   public Double getHorizontalAccuracy() {
      return this.horizontalAccuracy;
   }

   public Integer getLivePeriod() {
      return this.livePeriod;
   }

   public Integer getHeading() {
      return this.heading;
   }

   public Integer getProximityAlertRadius() {
      return this.proximityAlertRadius;
   }

   @JsonProperty("longitude")
   public void setLongitude(@NonNull Double longitude) {
      if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else {
         this.longitude = longitude;
      }
   }

   @JsonProperty("latitude")
   public void setLatitude(@NonNull Double latitude) {
      if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else {
         this.latitude = latitude;
      }
   }

   @JsonProperty("horizontal_accuracy")
   public void setHorizontalAccuracy(Double horizontalAccuracy) {
      this.horizontalAccuracy = horizontalAccuracy;
   }

   @JsonProperty("live_period")
   public void setLivePeriod(Integer livePeriod) {
      this.livePeriod = livePeriod;
   }

   @JsonProperty("heading")
   public void setHeading(Integer heading) {
      this.heading = heading;
   }

   @JsonProperty("proximity_alert_radius")
   public void setProximityAlertRadius(Integer proximityAlertRadius) {
      this.proximityAlertRadius = proximityAlertRadius;
   }

   public String toString() {
      return "Location(longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", horizontalAccuracy=" + this.getHorizontalAccuracy() + ", livePeriod=" + this.getLivePeriod() + ", heading=" + this.getHeading() + ", proximityAlertRadius=" + this.getProximityAlertRadius() + ")";
   }

   public Location(@NonNull Double longitude, @NonNull Double latitude, Double horizontalAccuracy, Integer livePeriod, Integer heading, Integer proximityAlertRadius) {
      if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else {
         this.longitude = longitude;
         this.latitude = latitude;
         this.horizontalAccuracy = horizontalAccuracy;
         this.livePeriod = livePeriod;
         this.heading = heading;
         this.proximityAlertRadius = proximityAlertRadius;
      }
   }

   public Location() {
   }
}
