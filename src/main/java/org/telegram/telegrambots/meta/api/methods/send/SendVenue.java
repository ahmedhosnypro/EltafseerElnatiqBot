package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendVenue extends BotApiMethod<Message> {
   public static final String PATH = "sendVenue";
   private static final String CHATID_FIELD = "chat_id";
   private static final String LATITUDE_FIELD = "latitude";
   private static final String LONGITUDE_FIELD = "longitude";
   private static final String TITLE_FIELD = "title";
   private static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   private static final String ADDRESS_FIELD = "address";
   private static final String FOURSQUAREID_FIELD = "foursquare_id";
   private static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   private static final String FOURSQUARETYPE_FIELD = "foursquare_type";
   private static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   private static final String GOOGLEPLACEID_FIELD = "google_place_id";
   private static final String GOOGLEPLACETYPE_FIELD = "google_place_type";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("latitude")
   @NonNull
   private Double latitude;
   @JsonProperty("longitude")
   @NonNull
   private Double longitude;
   @JsonProperty("title")
   @NonNull
   private String title;
   @JsonProperty("address")
   @NonNull
   private String address;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;
   @JsonProperty("foursquare_id")
   private String foursquareId;
   @JsonProperty("reply_to_message_id")
   private Integer replyToMessageId;
   @JsonProperty("reply_markup")
   private ReplyKeyboard replyMarkup;
   @JsonProperty("foursquare_type")
   private String foursquareType;
   @JsonProperty("allow_sending_without_reply")
   private Boolean allowSendingWithoutReply;
   @JsonProperty("google_place_id")
   private String googlePlaceId;
   @JsonProperty("google_place_type")
   private String googlePlaceType;

   public void enableNotification() {
      this.disableNotification = false;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public String getMethod() {
      return "sendVenue";
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending venue", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.longitude == null) {
            throw new TelegramApiValidationException("Longitude parameter can't be empty", this);
         } else if (this.latitude == null) {
            throw new TelegramApiValidationException("Latitude parameter can't be empty", this);
         } else if (this.title != null && !this.title.isEmpty()) {
            if (this.address == null) {
               throw new TelegramApiValidationException("Address parameter can't be empty", this);
            } else {
               if (this.replyMarkup != null) {
                  this.replyMarkup.validate();
               }

            }
         } else {
            throw new TelegramApiValidationException("Title parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendVenue.SendVenueBuilder builder() {
      return new SendVenue.SendVenueBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendVenue)) {
         return false;
      } else {
         SendVenue other = (SendVenue)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label167: {
               Object this$latitude = this.getLatitude();
               Object other$latitude = other.getLatitude();
               if (this$latitude == null) {
                  if (other$latitude == null) {
                     break label167;
                  }
               } else if (this$latitude.equals(other$latitude)) {
                  break label167;
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

            label153: {
               Object this$disableNotification = this.getDisableNotification();
               Object other$disableNotification = other.getDisableNotification();
               if (this$disableNotification == null) {
                  if (other$disableNotification == null) {
                     break label153;
                  }
               } else if (this$disableNotification.equals(other$disableNotification)) {
                  break label153;
               }

               return false;
            }

            Object this$replyToMessageId = this.getReplyToMessageId();
            Object other$replyToMessageId = other.getReplyToMessageId();
            if (this$replyToMessageId == null) {
               if (other$replyToMessageId != null) {
                  return false;
               }
            } else if (!this$replyToMessageId.equals(other$replyToMessageId)) {
               return false;
            }

            label139: {
               Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
               Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
               if (this$allowSendingWithoutReply == null) {
                  if (other$allowSendingWithoutReply == null) {
                     break label139;
                  }
               } else if (this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
                  break label139;
               }

               return false;
            }

            Object this$chatId = this.getChatId();
            Object other$chatId = other.getChatId();
            if (this$chatId == null) {
               if (other$chatId != null) {
                  return false;
               }
            } else if (!this$chatId.equals(other$chatId)) {
               return false;
            }

            label125: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label125;
                  }
               } else if (this$title.equals(other$title)) {
                  break label125;
               }

               return false;
            }

            label118: {
               Object this$address = this.getAddress();
               Object other$address = other.getAddress();
               if (this$address == null) {
                  if (other$address == null) {
                     break label118;
                  }
               } else if (this$address.equals(other$address)) {
                  break label118;
               }

               return false;
            }

            Object this$foursquareId = this.getFoursquareId();
            Object other$foursquareId = other.getFoursquareId();
            if (this$foursquareId == null) {
               if (other$foursquareId != null) {
                  return false;
               }
            } else if (!this$foursquareId.equals(other$foursquareId)) {
               return false;
            }

            label104: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label104;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label104;
               }

               return false;
            }

            label97: {
               Object this$foursquareType = this.getFoursquareType();
               Object other$foursquareType = other.getFoursquareType();
               if (this$foursquareType == null) {
                  if (other$foursquareType == null) {
                     break label97;
                  }
               } else if (this$foursquareType.equals(other$foursquareType)) {
                  break label97;
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
      return other instanceof SendVenue;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $latitude = this.getLatitude();
      int result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());
      Object $longitude = this.getLongitude();
      result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $address = this.getAddress();
      result = result * 59 + ($address == null ? 43 : $address.hashCode());
      Object $foursquareId = this.getFoursquareId();
      result = result * 59 + ($foursquareId == null ? 43 : $foursquareId.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $foursquareType = this.getFoursquareType();
      result = result * 59 + ($foursquareType == null ? 43 : $foursquareType.hashCode());
      Object $googlePlaceId = this.getGooglePlaceId();
      result = result * 59 + ($googlePlaceId == null ? 43 : $googlePlaceId.hashCode());
      Object $googlePlaceType = this.getGooglePlaceType();
      result = result * 59 + ($googlePlaceType == null ? 43 : $googlePlaceType.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public Double getLatitude() {
      return this.latitude;
   }

   @NonNull
   public Double getLongitude() {
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

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public String getFoursquareId() {
      return this.foursquareId;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public ReplyKeyboard getReplyMarkup() {
      return this.replyMarkup;
   }

   public String getFoursquareType() {
      return this.foursquareType;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
   }

   public String getGooglePlaceId() {
      return this.googlePlaceId;
   }

   public String getGooglePlaceType() {
      return this.googlePlaceType;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
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

   @JsonProperty("longitude")
   public void setLongitude(@NonNull Double longitude) {
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

   @JsonProperty("disable_notification")
   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   @JsonProperty("foursquare_id")
   public void setFoursquareId(String foursquareId) {
      this.foursquareId = foursquareId;
   }

   @JsonProperty("reply_to_message_id")
   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(ReplyKeyboard replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("foursquare_type")
   public void setFoursquareType(String foursquareType) {
      this.foursquareType = foursquareType;
   }

   @JsonProperty("allow_sending_without_reply")
   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
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
      return "SendVenue(chatId=" + this.getChatId() + ", latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", title=" + this.getTitle() + ", address=" + this.getAddress() + ", disableNotification=" + this.getDisableNotification() + ", foursquareId=" + this.getFoursquareId() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", foursquareType=" + this.getFoursquareType() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ", googlePlaceId=" + this.getGooglePlaceId() + ", googlePlaceType=" + this.getGooglePlaceType() + ")";
   }

   public SendVenue(@NonNull String chatId, @NonNull Double latitude, @NonNull Double longitude, @NonNull String title, @NonNull String address) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (address == null) {
         throw new NullPointerException("address is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.latitude = latitude;
         this.longitude = longitude;
         this.title = title;
         this.address = address;
      }
   }

   public SendVenue() {
   }

   public SendVenue(@NonNull String chatId, @NonNull Double latitude, @NonNull Double longitude, @NonNull String title, @NonNull String address, Boolean disableNotification, String foursquareId, Integer replyToMessageId, ReplyKeyboard replyMarkup, String foursquareType, Boolean allowSendingWithoutReply, String googlePlaceId, String googlePlaceType) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (address == null) {
         throw new NullPointerException("address is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.latitude = latitude;
         this.longitude = longitude;
         this.title = title;
         this.address = address;
         this.disableNotification = disableNotification;
         this.foursquareId = foursquareId;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.foursquareType = foursquareType;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         this.googlePlaceId = googlePlaceId;
         this.googlePlaceType = googlePlaceType;
      }
   }

   public static class SendVenueBuilder {
      private String chatId;
      private Double latitude;
      private Double longitude;
      private String title;
      private String address;
      private Boolean disableNotification;
      private String foursquareId;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private String foursquareType;
      private Boolean allowSendingWithoutReply;
      private String googlePlaceId;
      private String googlePlaceType;

      SendVenueBuilder() {
      }

      @JsonProperty("chat_id")
      public SendVenue.SendVenueBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("latitude")
      public SendVenue.SendVenueBuilder latitude(@NonNull Double latitude) {
         if (latitude == null) {
            throw new NullPointerException("latitude is marked non-null but is null");
         } else {
            this.latitude = latitude;
            return this;
         }
      }

      @JsonProperty("longitude")
      public SendVenue.SendVenueBuilder longitude(@NonNull Double longitude) {
         if (longitude == null) {
            throw new NullPointerException("longitude is marked non-null but is null");
         } else {
            this.longitude = longitude;
            return this;
         }
      }

      @JsonProperty("title")
      public SendVenue.SendVenueBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      @JsonProperty("address")
      public SendVenue.SendVenueBuilder address(@NonNull String address) {
         if (address == null) {
            throw new NullPointerException("address is marked non-null but is null");
         } else {
            this.address = address;
            return this;
         }
      }

      @JsonProperty("disable_notification")
      public SendVenue.SendVenueBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      @JsonProperty("foursquare_id")
      public SendVenue.SendVenueBuilder foursquareId(String foursquareId) {
         this.foursquareId = foursquareId;
         return this;
      }

      @JsonProperty("reply_to_message_id")
      public SendVenue.SendVenueBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      @JsonProperty("reply_markup")
      public SendVenue.SendVenueBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("foursquare_type")
      public SendVenue.SendVenueBuilder foursquareType(String foursquareType) {
         this.foursquareType = foursquareType;
         return this;
      }

      @JsonProperty("allow_sending_without_reply")
      public SendVenue.SendVenueBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      @JsonProperty("google_place_id")
      public SendVenue.SendVenueBuilder googlePlaceId(String googlePlaceId) {
         this.googlePlaceId = googlePlaceId;
         return this;
      }

      @JsonProperty("google_place_type")
      public SendVenue.SendVenueBuilder googlePlaceType(String googlePlaceType) {
         this.googlePlaceType = googlePlaceType;
         return this;
      }

      public SendVenue build() {
         return new SendVenue(this.chatId, this.latitude, this.longitude, this.title, this.address, this.disableNotification, this.foursquareId, this.replyToMessageId, this.replyMarkup, this.foursquareType, this.allowSendingWithoutReply, this.googlePlaceId, this.googlePlaceType);
      }

      public String toString() {
         return "SendVenue.SendVenueBuilder(chatId=" + this.chatId + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", title=" + this.title + ", address=" + this.address + ", disableNotification=" + this.disableNotification + ", foursquareId=" + this.foursquareId + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", foursquareType=" + this.foursquareType + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ", googlePlaceId=" + this.googlePlaceId + ", googlePlaceType=" + this.googlePlaceType + ")";
      }
   }
}
