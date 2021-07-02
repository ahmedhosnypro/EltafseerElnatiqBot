package org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.NonNull;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InputLocationMessageContent implements InputMessageContent {
   private static final String LATITUDE_FIELD = "latitude";
   private static final String LONGITUDE_FIELD = "longitude";
   private static final String LIVEPERIOD_FIELD = "live_period";
   private static final String HORIZONTALACCURACY_FIELD = "horizontal_accuracy";
   private static final String HEADING_FIELD = "heading";
   private static final String PROXIMITYALERTRADIUS_FIELD = "proximity_alert_radius";
   @JsonProperty("latitude")
   @NonNull
   private Double latitude;
   @JsonProperty("longitude")
   @NonNull
   private Double longitude;
   @JsonProperty("live_period")
   private Integer livePeriod;
   @JsonProperty("horizontal_accuracy")
   private Double horizontalAccuracy;
   @JsonProperty("heading")
   private Integer heading;
   @JsonProperty("proximity_alert_radius")
   private Integer proximityAlertRadius;

   public void validate() throws TelegramApiValidationException {
      if (this.latitude == null) {
         throw new TelegramApiValidationException("Latitude parameter can't be empty", this);
      } else if (this.longitude == null) {
         throw new TelegramApiValidationException("Longitude parameter can't be empty", this);
      } else if (this.livePeriod != null && (this.livePeriod < 60 || this.livePeriod > 86400)) {
         throw new TelegramApiValidationException("Live period parameter must be between 60 and 86400", this);
      } else if (this.horizontalAccuracy != null && (this.horizontalAccuracy < 0.0D || this.horizontalAccuracy > 1500.0D)) {
         throw new TelegramApiValidationException("Horizontal Accuracy parameter must be between 0 and 1500", this);
      } else if (this.heading == null || this.heading >= 1 && this.heading <= 360) {
         if (this.proximityAlertRadius != null && (this.proximityAlertRadius < 1 || this.proximityAlertRadius > 100000)) {
            throw new TelegramApiValidationException("Approaching notification distance parameter must be between 1 and 100000", this);
         }
      } else {
         throw new TelegramApiValidationException("Heading Accuracy parameter must be between 1 and 360", this);
      }
   }

   public static InputLocationMessageContent.InputLocationMessageContentBuilder builder() {
      return new InputLocationMessageContent.InputLocationMessageContentBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputLocationMessageContent)) {
         return false;
      } else {
         InputLocationMessageContent other = (InputLocationMessageContent)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$latitude = this.getLatitude();
            Object other$latitude = other.getLatitude();
            if (this$latitude == null) {
               if (other$latitude != null) {
                  return false;
               }
            } else if (!this$latitude.equals(other$latitude)) {
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

            Object this$livePeriod = this.getLivePeriod();
            Object other$livePeriod = other.getLivePeriod();
            if (this$livePeriod == null) {
               if (other$livePeriod != null) {
                  return false;
               }
            } else if (!this$livePeriod.equals(other$livePeriod)) {
               return false;
            }

            label62: {
               Object this$horizontalAccuracy = this.getHorizontalAccuracy();
               Object other$horizontalAccuracy = other.getHorizontalAccuracy();
               if (this$horizontalAccuracy == null) {
                  if (other$horizontalAccuracy == null) {
                     break label62;
                  }
               } else if (this$horizontalAccuracy.equals(other$horizontalAccuracy)) {
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
      return other instanceof InputLocationMessageContent;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $latitude = this.getLatitude();
      int result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());
      Object $longitude = this.getLongitude();
      result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());
      Object $livePeriod = this.getLivePeriod();
      result = result * 59 + ($livePeriod == null ? 43 : $livePeriod.hashCode());
      Object $horizontalAccuracy = this.getHorizontalAccuracy();
      result = result * 59 + ($horizontalAccuracy == null ? 43 : $horizontalAccuracy.hashCode());
      Object $heading = this.getHeading();
      result = result * 59 + ($heading == null ? 43 : $heading.hashCode());
      Object $proximityAlertRadius = this.getProximityAlertRadius();
      result = result * 59 + ($proximityAlertRadius == null ? 43 : $proximityAlertRadius.hashCode());
      return result;
   }

   @NonNull
   public Double getLatitude() {
      return this.latitude;
   }

   @NonNull
   public Double getLongitude() {
      return this.longitude;
   }

   public Integer getLivePeriod() {
      return this.livePeriod;
   }

   public Double getHorizontalAccuracy() {
      return this.horizontalAccuracy;
   }

   public Integer getHeading() {
      return this.heading;
   }

   public Integer getProximityAlertRadius() {
      return this.proximityAlertRadius;
   }

   @JsonProperty("latitude")
   public void setLatitude(@NonNull Double latitude) {
      if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else {
         this.latitude = latitude;
      }
   }

   @JsonProperty("longitude")
   public void setLongitude(@NonNull Double longitude) {
      if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else {
         this.longitude = longitude;
      }
   }

   @JsonProperty("live_period")
   public void setLivePeriod(Integer livePeriod) {
      this.livePeriod = livePeriod;
   }

   @JsonProperty("horizontal_accuracy")
   public void setHorizontalAccuracy(Double horizontalAccuracy) {
      this.horizontalAccuracy = horizontalAccuracy;
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
      return "InputLocationMessageContent(latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", livePeriod=" + this.getLivePeriod() + ", horizontalAccuracy=" + this.getHorizontalAccuracy() + ", heading=" + this.getHeading() + ", proximityAlertRadius=" + this.getProximityAlertRadius() + ")";
   }

   public InputLocationMessageContent(@NonNull Double latitude, @NonNull Double longitude) {
      if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else {
         this.latitude = latitude;
         this.longitude = longitude;
      }
   }

   public InputLocationMessageContent() {
   }

   public InputLocationMessageContent(@NonNull Double latitude, @NonNull Double longitude, Integer livePeriod, Double horizontalAccuracy, Integer heading, Integer proximityAlertRadius) {
      if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else {
         this.latitude = latitude;
         this.longitude = longitude;
         this.livePeriod = livePeriod;
         this.horizontalAccuracy = horizontalAccuracy;
         this.heading = heading;
         this.proximityAlertRadius = proximityAlertRadius;
      }
   }

   public static class InputLocationMessageContentBuilder {
      private Double latitude;
      private Double longitude;
      private Integer livePeriod;
      private Double horizontalAccuracy;
      private Integer heading;
      private Integer proximityAlertRadius;

      InputLocationMessageContentBuilder() {
      }

      @JsonProperty("latitude")
      public InputLocationMessageContent.InputLocationMessageContentBuilder latitude(@NonNull Double latitude) {
         if (latitude == null) {
            throw new NullPointerException("latitude is marked non-null but is null");
         } else {
            this.latitude = latitude;
            return this;
         }
      }

      @JsonProperty("longitude")
      public InputLocationMessageContent.InputLocationMessageContentBuilder longitude(@NonNull Double longitude) {
         if (longitude == null) {
            throw new NullPointerException("longitude is marked non-null but is null");
         } else {
            this.longitude = longitude;
            return this;
         }
      }

      @JsonProperty("live_period")
      public InputLocationMessageContent.InputLocationMessageContentBuilder livePeriod(Integer livePeriod) {
         this.livePeriod = livePeriod;
         return this;
      }

      @JsonProperty("horizontal_accuracy")
      public InputLocationMessageContent.InputLocationMessageContentBuilder horizontalAccuracy(Double horizontalAccuracy) {
         this.horizontalAccuracy = horizontalAccuracy;
         return this;
      }

      @JsonProperty("heading")
      public InputLocationMessageContent.InputLocationMessageContentBuilder heading(Integer heading) {
         this.heading = heading;
         return this;
      }

      @JsonProperty("proximity_alert_radius")
      public InputLocationMessageContent.InputLocationMessageContentBuilder proximityAlertRadius(Integer proximityAlertRadius) {
         this.proximityAlertRadius = proximityAlertRadius;
         return this;
      }

      public InputLocationMessageContent build() {
         return new InputLocationMessageContent(this.latitude, this.longitude, this.livePeriod, this.horizontalAccuracy, this.heading, this.proximityAlertRadius);
      }

      public String toString() {
         return "InputLocationMessageContent.InputLocationMessageContentBuilder(latitude=" + this.latitude + ", longitude=" + this.longitude + ", livePeriod=" + this.livePeriod + ", horizontalAccuracy=" + this.horizontalAccuracy + ", heading=" + this.heading + ", proximityAlertRadius=" + this.proximityAlertRadius + ")";
      }
   }
}
