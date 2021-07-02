package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultLocation implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String TITLE_FIELD = "title";
   private static final String LATITUDE_FIELD = "latitude";
   private static final String LONGITUDE_FIELD = "longitude";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String THUMBURL_FIELD = "thumb_url";
   private static final String THUMBWIDTH_FIELD = "thumb_width";
   private static final String THUMBHEIGHT_FIELD = "thumb_height";
   private static final String LIVEPERIOD_FIELD = "live_period";
   private static final String HORIZONTALACCURACY_FIELD = "horizontal_accuracy";
   private static final String HEADING_FIELD = "heading";
   private static final String PROXIMITYALERTRADIUS_FIELD = "proximity_alert_radius";
   @JsonProperty("type")
   private final String type = "location";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("title")
   @NonNull
   private String title;
   @JsonProperty("latitude")
   @NonNull
   private Float latitude;
   @JsonProperty("longitude")
   @NonNull
   private Float longitude;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("input_message_content")
   private InputMessageContent inputMessageContent;
   @JsonProperty("thumb_url")
   private String thumbUrl;
   @JsonProperty("thumb_width")
   private Integer thumbWidth;
   @JsonProperty("thumb_height")
   private Integer thumbHeight;
   @JsonProperty("live_period")
   private Integer livePeriod;
   @JsonProperty("horizontal_accuracy")
   private Double horizontalAccuracy;
   @JsonProperty("heading")
   private Integer heading;
   @JsonProperty("proximity_alert_radius")
   private Integer proximityAlertRadius;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.title != null && !this.title.isEmpty()) {
            if (this.latitude == null) {
               throw new TelegramApiValidationException("Latitude parameter can't be empty", this);
            } else if (this.longitude == null) {
               throw new TelegramApiValidationException("Longitude parameter can't be empty", this);
            } else if (this.livePeriod == null || this.livePeriod >= 60 && this.livePeriod <= 86400) {
               if (this.horizontalAccuracy == null || !(this.horizontalAccuracy < 0.0D) && !(this.horizontalAccuracy > 1500.0D)) {
                  if (this.heading == null || this.heading >= 1 && this.heading <= 360) {
                     if (this.proximityAlertRadius != null && (this.proximityAlertRadius < 1 || this.proximityAlertRadius > 100000)) {
                        throw new TelegramApiValidationException("Approaching notification distance parameter must be between 1 and 100000", this);
                     } else {
                        if (this.inputMessageContent != null) {
                           this.inputMessageContent.validate();
                        }

                        if (this.replyMarkup != null) {
                           this.replyMarkup.validate();
                        }

                     }
                  } else {
                     throw new TelegramApiValidationException("Heading Accuracy parameter must be between 1 and 360", this);
                  }
               } else {
                  throw new TelegramApiValidationException("Horizontal Accuracy parameter must be between 0 and 1500", this);
               }
            } else {
               throw new TelegramApiValidationException("Live period parameter must be between 60 and 86400", this);
            }
         } else {
            throw new TelegramApiValidationException("Title parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultLocation.InlineQueryResultLocationBuilder builder() {
      return new InlineQueryResultLocation.InlineQueryResultLocationBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultLocation)) {
         return false;
      } else {
         InlineQueryResultLocation other = (InlineQueryResultLocation)o;
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

            Object this$thumbWidth = this.getThumbWidth();
            Object other$thumbWidth = other.getThumbWidth();
            if (this$thumbWidth == null) {
               if (other$thumbWidth != null) {
                  return false;
               }
            } else if (!this$thumbWidth.equals(other$thumbWidth)) {
               return false;
            }

            label158: {
               Object this$thumbHeight = this.getThumbHeight();
               Object other$thumbHeight = other.getThumbHeight();
               if (this$thumbHeight == null) {
                  if (other$thumbHeight == null) {
                     break label158;
                  }
               } else if (this$thumbHeight.equals(other$thumbHeight)) {
                  break label158;
               }

               return false;
            }

            label151: {
               Object this$livePeriod = this.getLivePeriod();
               Object other$livePeriod = other.getLivePeriod();
               if (this$livePeriod == null) {
                  if (other$livePeriod == null) {
                     break label151;
                  }
               } else if (this$livePeriod.equals(other$livePeriod)) {
                  break label151;
               }

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

            label137: {
               Object this$heading = this.getHeading();
               Object other$heading = other.getHeading();
               if (this$heading == null) {
                  if (other$heading == null) {
                     break label137;
                  }
               } else if (this$heading.equals(other$heading)) {
                  break label137;
               }

               return false;
            }

            label130: {
               Object this$proximityAlertRadius = this.getProximityAlertRadius();
               Object other$proximityAlertRadius = other.getProximityAlertRadius();
               if (this$proximityAlertRadius == null) {
                  if (other$proximityAlertRadius == null) {
                     break label130;
                  }
               } else if (this$proximityAlertRadius.equals(other$proximityAlertRadius)) {
                  break label130;
               }

               return false;
            }

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
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

            label109: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label109;
                  }
               } else if (this$title.equals(other$title)) {
                  break label109;
               }

               return false;
            }

            label102: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label102;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label102;
               }

               return false;
            }

            Object this$inputMessageContent = this.getInputMessageContent();
            Object other$inputMessageContent = other.getInputMessageContent();
            if (this$inputMessageContent == null) {
               if (other$inputMessageContent != null) {
                  return false;
               }
            } else if (!this$inputMessageContent.equals(other$inputMessageContent)) {
               return false;
            }

            Object this$thumbUrl = this.getThumbUrl();
            Object other$thumbUrl = other.getThumbUrl();
            if (this$thumbUrl == null) {
               if (other$thumbUrl != null) {
                  return false;
               }
            } else if (!this$thumbUrl.equals(other$thumbUrl)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InlineQueryResultLocation;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $latitude = this.getLatitude();
      int result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());
      Object $longitude = this.getLongitude();
      result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());
      Object $thumbWidth = this.getThumbWidth();
      result = result * 59 + ($thumbWidth == null ? 43 : $thumbWidth.hashCode());
      Object $thumbHeight = this.getThumbHeight();
      result = result * 59 + ($thumbHeight == null ? 43 : $thumbHeight.hashCode());
      Object $livePeriod = this.getLivePeriod();
      result = result * 59 + ($livePeriod == null ? 43 : $livePeriod.hashCode());
      Object $horizontalAccuracy = this.getHorizontalAccuracy();
      result = result * 59 + ($horizontalAccuracy == null ? 43 : $horizontalAccuracy.hashCode());
      Object $heading = this.getHeading();
      result = result * 59 + ($heading == null ? 43 : $heading.hashCode());
      Object $proximityAlertRadius = this.getProximityAlertRadius();
      result = result * 59 + ($proximityAlertRadius == null ? 43 : $proximityAlertRadius.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $inputMessageContent = this.getInputMessageContent();
      result = result * 59 + ($inputMessageContent == null ? 43 : $inputMessageContent.hashCode());
      Object $thumbUrl = this.getThumbUrl();
      result = result * 59 + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
      return result;
   }

   public String getType() {
      Objects.requireNonNull(this);
      return "location";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getTitle() {
      return this.title;
   }

   @NonNull
   public Float getLatitude() {
      return this.latitude;
   }

   @NonNull
   public Float getLongitude() {
      return this.longitude;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
   }

   public InputMessageContent getInputMessageContent() {
      return this.inputMessageContent;
   }

   public String getThumbUrl() {
      return this.thumbUrl;
   }

   public Integer getThumbWidth() {
      return this.thumbWidth;
   }

   public Integer getThumbHeight() {
      return this.thumbHeight;
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

   @JsonProperty("id")
   public void setId(@NonNull String id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
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

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("input_message_content")
   public void setInputMessageContent(InputMessageContent inputMessageContent) {
      this.inputMessageContent = inputMessageContent;
   }

   @JsonProperty("thumb_url")
   public void setThumbUrl(String thumbUrl) {
      this.thumbUrl = thumbUrl;
   }

   @JsonProperty("thumb_width")
   public void setThumbWidth(Integer thumbWidth) {
      this.thumbWidth = thumbWidth;
   }

   @JsonProperty("thumb_height")
   public void setThumbHeight(Integer thumbHeight) {
      this.thumbHeight = thumbHeight;
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
      return "InlineQueryResultLocation(type=" + this.getType() + ", id=" + this.getId() + ", title=" + this.getTitle() + ", latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", replyMarkup=" + this.getReplyMarkup() + ", inputMessageContent=" + this.getInputMessageContent() + ", thumbUrl=" + this.getThumbUrl() + ", thumbWidth=" + this.getThumbWidth() + ", thumbHeight=" + this.getThumbHeight() + ", livePeriod=" + this.getLivePeriod() + ", horizontalAccuracy=" + this.getHorizontalAccuracy() + ", heading=" + this.getHeading() + ", proximityAlertRadius=" + this.getProximityAlertRadius() + ")";
   }

   public InlineQueryResultLocation(@NonNull String id, @NonNull String title, @NonNull Float latitude, @NonNull Float longitude) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else {
         this.id = id;
         this.title = title;
         this.latitude = latitude;
         this.longitude = longitude;
      }
   }

   public InlineQueryResultLocation() {
   }

   public InlineQueryResultLocation(@NonNull String id, @NonNull String title, @NonNull Float latitude, @NonNull Float longitude, InlineKeyboardMarkup replyMarkup, InputMessageContent inputMessageContent, String thumbUrl, Integer thumbWidth, Integer thumbHeight, Integer livePeriod, Double horizontalAccuracy, Integer heading, Integer proximityAlertRadius) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else {
         this.id = id;
         this.title = title;
         this.latitude = latitude;
         this.longitude = longitude;
         this.replyMarkup = replyMarkup;
         this.inputMessageContent = inputMessageContent;
         this.thumbUrl = thumbUrl;
         this.thumbWidth = thumbWidth;
         this.thumbHeight = thumbHeight;
         this.livePeriod = livePeriod;
         this.horizontalAccuracy = horizontalAccuracy;
         this.heading = heading;
         this.proximityAlertRadius = proximityAlertRadius;
      }
   }

   public static class InlineQueryResultLocationBuilder {
      private String id;
      private String title;
      private Float latitude;
      private Float longitude;
      private InlineKeyboardMarkup replyMarkup;
      private InputMessageContent inputMessageContent;
      private String thumbUrl;
      private Integer thumbWidth;
      private Integer thumbHeight;
      private Integer livePeriod;
      private Double horizontalAccuracy;
      private Integer heading;
      private Integer proximityAlertRadius;

      InlineQueryResultLocationBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      @JsonProperty("latitude")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder latitude(@NonNull Float latitude) {
         if (latitude == null) {
            throw new NullPointerException("latitude is marked non-null but is null");
         } else {
            this.latitude = latitude;
            return this;
         }
      }

      @JsonProperty("longitude")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder longitude(@NonNull Float longitude) {
         if (longitude == null) {
            throw new NullPointerException("longitude is marked non-null but is null");
         } else {
            this.longitude = longitude;
            return this;
         }
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("thumb_url")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder thumbUrl(String thumbUrl) {
         this.thumbUrl = thumbUrl;
         return this;
      }

      @JsonProperty("thumb_width")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder thumbWidth(Integer thumbWidth) {
         this.thumbWidth = thumbWidth;
         return this;
      }

      @JsonProperty("thumb_height")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder thumbHeight(Integer thumbHeight) {
         this.thumbHeight = thumbHeight;
         return this;
      }

      @JsonProperty("live_period")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder livePeriod(Integer livePeriod) {
         this.livePeriod = livePeriod;
         return this;
      }

      @JsonProperty("horizontal_accuracy")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder horizontalAccuracy(Double horizontalAccuracy) {
         this.horizontalAccuracy = horizontalAccuracy;
         return this;
      }

      @JsonProperty("heading")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder heading(Integer heading) {
         this.heading = heading;
         return this;
      }

      @JsonProperty("proximity_alert_radius")
      public InlineQueryResultLocation.InlineQueryResultLocationBuilder proximityAlertRadius(Integer proximityAlertRadius) {
         this.proximityAlertRadius = proximityAlertRadius;
         return this;
      }

      public InlineQueryResultLocation build() {
         return new InlineQueryResultLocation(this.id, this.title, this.latitude, this.longitude, this.replyMarkup, this.inputMessageContent, this.thumbUrl, this.thumbWidth, this.thumbHeight, this.livePeriod, this.horizontalAccuracy, this.heading, this.proximityAlertRadius);
      }

      public String toString() {
         return "InlineQueryResultLocation.InlineQueryResultLocationBuilder(id=" + this.id + ", title=" + this.title + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", replyMarkup=" + this.replyMarkup + ", inputMessageContent=" + this.inputMessageContent + ", thumbUrl=" + this.thumbUrl + ", thumbWidth=" + this.thumbWidth + ", thumbHeight=" + this.thumbHeight + ", livePeriod=" + this.livePeriod + ", horizontalAccuracy=" + this.horizontalAccuracy + ", heading=" + this.heading + ", proximityAlertRadius=" + this.proximityAlertRadius + ")";
      }
   }
}
