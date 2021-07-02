package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultVenue implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String TITLE_FIELD = "title";
   private static final String LATITUDE_FIELD = "latitude";
   private static final String LONGITUDE_FIELD = "longitude";
   private static final String ADDRESS_FIELD = "address";
   private static final String FOURSQUAREID_FIELD = "foursquare_id";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String THUMBURL_FIELD = "thumb_url";
   private static final String THUMBWIDTH_FIELD = "thumb_width";
   private static final String THUMBHEIGHT_FIELD = "thumb_height";
   private static final String FOURSQUARETYPE_FIELD = "foursquare_type";
   private static final String GOOGLEPLACEID_FIELD = "google_place_id";
   private static final String GOOGLEPLACETYPE_FIELD = "google_place_type";
   @JsonProperty("type")
   private final String type = "venue";
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
   @JsonProperty("address")
   @NonNull
   private String address;
   @JsonProperty("foursquare_id")
   private String foursquareId;
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
   @JsonProperty("foursquare_type")
   private String foursquareType;
   @JsonProperty("google_place_id")
   private String googlePlaceId;
   @JsonProperty("google_place_type")
   private String googlePlaceType;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.title != null && !this.title.isEmpty()) {
            if (this.latitude == null) {
               throw new TelegramApiValidationException("Latitude parameter can't be empty", this);
            } else if (this.longitude == null) {
               throw new TelegramApiValidationException("Longitude parameter can't be empty", this);
            } else if (this.address != null && !this.address.isEmpty()) {
               if (this.inputMessageContent != null) {
                  this.inputMessageContent.validate();
               }

               if (this.replyMarkup != null) {
                  this.replyMarkup.validate();
               }

            } else {
               throw new TelegramApiValidationException("Address parameter can't be empty", this);
            }
         } else {
            throw new TelegramApiValidationException("Title parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultVenue.InlineQueryResultVenueBuilder builder() {
      return new InlineQueryResultVenue.InlineQueryResultVenueBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultVenue)) {
         return false;
      } else {
         InlineQueryResultVenue other = (InlineQueryResultVenue)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label191: {
               Object this$latitude = this.getLatitude();
               Object other$latitude = other.getLatitude();
               if (this$latitude == null) {
                  if (other$latitude == null) {
                     break label191;
                  }
               } else if (this$latitude.equals(other$latitude)) {
                  break label191;
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

            Object this$thumbWidth = this.getThumbWidth();
            Object other$thumbWidth = other.getThumbWidth();
            if (this$thumbWidth == null) {
               if (other$thumbWidth != null) {
                  return false;
               }
            } else if (!this$thumbWidth.equals(other$thumbWidth)) {
               return false;
            }

            label170: {
               Object this$thumbHeight = this.getThumbHeight();
               Object other$thumbHeight = other.getThumbHeight();
               if (this$thumbHeight == null) {
                  if (other$thumbHeight == null) {
                     break label170;
                  }
               } else if (this$thumbHeight.equals(other$thumbHeight)) {
                  break label170;
               }

               return false;
            }

            label163: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label163;
                  }
               } else if (this$type.equals(other$type)) {
                  break label163;
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

            Object this$title = this.getTitle();
            Object other$title = other.getTitle();
            if (this$title == null) {
               if (other$title != null) {
                  return false;
               }
            } else if (!this$title.equals(other$title)) {
               return false;
            }

            label142: {
               Object this$address = this.getAddress();
               Object other$address = other.getAddress();
               if (this$address == null) {
                  if (other$address == null) {
                     break label142;
                  }
               } else if (this$address.equals(other$address)) {
                  break label142;
               }

               return false;
            }

            label135: {
               Object this$foursquareId = this.getFoursquareId();
               Object other$foursquareId = other.getFoursquareId();
               if (this$foursquareId == null) {
                  if (other$foursquareId == null) {
                     break label135;
                  }
               } else if (this$foursquareId.equals(other$foursquareId)) {
                  break label135;
               }

               return false;
            }

            Object this$replyMarkup = this.getReplyMarkup();
            Object other$replyMarkup = other.getReplyMarkup();
            if (this$replyMarkup == null) {
               if (other$replyMarkup != null) {
                  return false;
               }
            } else if (!this$replyMarkup.equals(other$replyMarkup)) {
               return false;
            }

            label121: {
               Object this$inputMessageContent = this.getInputMessageContent();
               Object other$inputMessageContent = other.getInputMessageContent();
               if (this$inputMessageContent == null) {
                  if (other$inputMessageContent == null) {
                     break label121;
                  }
               } else if (this$inputMessageContent.equals(other$inputMessageContent)) {
                  break label121;
               }

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

            label107: {
               Object this$foursquareType = this.getFoursquareType();
               Object other$foursquareType = other.getFoursquareType();
               if (this$foursquareType == null) {
                  if (other$foursquareType == null) {
                     break label107;
                  }
               } else if (this$foursquareType.equals(other$foursquareType)) {
                  break label107;
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
      return other instanceof InlineQueryResultVenue;
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
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $address = this.getAddress();
      result = result * 59 + ($address == null ? 43 : $address.hashCode());
      Object $foursquareId = this.getFoursquareId();
      result = result * 59 + ($foursquareId == null ? 43 : $foursquareId.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $inputMessageContent = this.getInputMessageContent();
      result = result * 59 + ($inputMessageContent == null ? 43 : $inputMessageContent.hashCode());
      Object $thumbUrl = this.getThumbUrl();
      result = result * 59 + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
      Object $foursquareType = this.getFoursquareType();
      result = result * 59 + ($foursquareType == null ? 43 : $foursquareType.hashCode());
      Object $googlePlaceId = this.getGooglePlaceId();
      result = result * 59 + ($googlePlaceId == null ? 43 : $googlePlaceId.hashCode());
      Object $googlePlaceType = this.getGooglePlaceType();
      result = result * 59 + ($googlePlaceType == null ? 43 : $googlePlaceType.hashCode());
      return result;
   }

   public String getType() {
      Objects.requireNonNull(this);
      return "venue";
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

   @NonNull
   public String getAddress() {
      return this.address;
   }

   public String getFoursquareId() {
      return this.foursquareId;
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

   public String getFoursquareType() {
      return this.foursquareType;
   }

   public String getGooglePlaceId() {
      return this.googlePlaceId;
   }

   public String getGooglePlaceType() {
      return this.googlePlaceType;
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
      return "InlineQueryResultVenue(type=" + this.getType() + ", id=" + this.getId() + ", title=" + this.getTitle() + ", latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", address=" + this.getAddress() + ", foursquareId=" + this.getFoursquareId() + ", replyMarkup=" + this.getReplyMarkup() + ", inputMessageContent=" + this.getInputMessageContent() + ", thumbUrl=" + this.getThumbUrl() + ", thumbWidth=" + this.getThumbWidth() + ", thumbHeight=" + this.getThumbHeight() + ", foursquareType=" + this.getFoursquareType() + ", googlePlaceId=" + this.getGooglePlaceId() + ", googlePlaceType=" + this.getGooglePlaceType() + ")";
   }

   public InlineQueryResultVenue(@NonNull String id, @NonNull String title, @NonNull Float latitude, @NonNull Float longitude, @NonNull String address) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else if (address == null) {
         throw new NullPointerException("address is marked non-null but is null");
      } else {
         this.id = id;
         this.title = title;
         this.latitude = latitude;
         this.longitude = longitude;
         this.address = address;
      }
   }

   public InlineQueryResultVenue() {
   }

   public InlineQueryResultVenue(@NonNull String id, @NonNull String title, @NonNull Float latitude, @NonNull Float longitude, @NonNull String address, String foursquareId, InlineKeyboardMarkup replyMarkup, InputMessageContent inputMessageContent, String thumbUrl, Integer thumbWidth, Integer thumbHeight, String foursquareType, String googlePlaceId, String googlePlaceType) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else if (address == null) {
         throw new NullPointerException("address is marked non-null but is null");
      } else {
         this.id = id;
         this.title = title;
         this.latitude = latitude;
         this.longitude = longitude;
         this.address = address;
         this.foursquareId = foursquareId;
         this.replyMarkup = replyMarkup;
         this.inputMessageContent = inputMessageContent;
         this.thumbUrl = thumbUrl;
         this.thumbWidth = thumbWidth;
         this.thumbHeight = thumbHeight;
         this.foursquareType = foursquareType;
         this.googlePlaceId = googlePlaceId;
         this.googlePlaceType = googlePlaceType;
      }
   }

   public static class InlineQueryResultVenueBuilder {
      private String id;
      private String title;
      private Float latitude;
      private Float longitude;
      private String address;
      private String foursquareId;
      private InlineKeyboardMarkup replyMarkup;
      private InputMessageContent inputMessageContent;
      private String thumbUrl;
      private Integer thumbWidth;
      private Integer thumbHeight;
      private String foursquareType;
      private String googlePlaceId;
      private String googlePlaceType;

      InlineQueryResultVenueBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      @JsonProperty("latitude")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder latitude(@NonNull Float latitude) {
         if (latitude == null) {
            throw new NullPointerException("latitude is marked non-null but is null");
         } else {
            this.latitude = latitude;
            return this;
         }
      }

      @JsonProperty("longitude")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder longitude(@NonNull Float longitude) {
         if (longitude == null) {
            throw new NullPointerException("longitude is marked non-null but is null");
         } else {
            this.longitude = longitude;
            return this;
         }
      }

      @JsonProperty("address")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder address(@NonNull String address) {
         if (address == null) {
            throw new NullPointerException("address is marked non-null but is null");
         } else {
            this.address = address;
            return this;
         }
      }

      @JsonProperty("foursquare_id")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder foursquareId(String foursquareId) {
         this.foursquareId = foursquareId;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("thumb_url")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder thumbUrl(String thumbUrl) {
         this.thumbUrl = thumbUrl;
         return this;
      }

      @JsonProperty("thumb_width")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder thumbWidth(Integer thumbWidth) {
         this.thumbWidth = thumbWidth;
         return this;
      }

      @JsonProperty("thumb_height")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder thumbHeight(Integer thumbHeight) {
         this.thumbHeight = thumbHeight;
         return this;
      }

      @JsonProperty("foursquare_type")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder foursquareType(String foursquareType) {
         this.foursquareType = foursquareType;
         return this;
      }

      @JsonProperty("google_place_id")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder googlePlaceId(String googlePlaceId) {
         this.googlePlaceId = googlePlaceId;
         return this;
      }

      @JsonProperty("google_place_type")
      public InlineQueryResultVenue.InlineQueryResultVenueBuilder googlePlaceType(String googlePlaceType) {
         this.googlePlaceType = googlePlaceType;
         return this;
      }

      public InlineQueryResultVenue build() {
         return new InlineQueryResultVenue(this.id, this.title, this.latitude, this.longitude, this.address, this.foursquareId, this.replyMarkup, this.inputMessageContent, this.thumbUrl, this.thumbWidth, this.thumbHeight, this.foursquareType, this.googlePlaceId, this.googlePlaceType);
      }

      public String toString() {
         return "InlineQueryResultVenue.InlineQueryResultVenueBuilder(id=" + this.id + ", title=" + this.title + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", address=" + this.address + ", foursquareId=" + this.foursquareId + ", replyMarkup=" + this.replyMarkup + ", inputMessageContent=" + this.inputMessageContent + ", thumbUrl=" + this.thumbUrl + ", thumbWidth=" + this.thumbWidth + ", thumbHeight=" + this.thumbHeight + ", foursquareType=" + this.foursquareType + ", googlePlaceId=" + this.googlePlaceId + ", googlePlaceType=" + this.googlePlaceType + ")";
      }
   }
}
