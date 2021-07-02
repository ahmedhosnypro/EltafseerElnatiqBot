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

public class SendLocation extends BotApiMethod<Message> {
   public static final String PATH = "sendlocation";
   private static final String CHATID_FIELD = "chat_id";
   private static final String LATITUDE_FIELD = "latitude";
   private static final String LONGITUDE_FIELD = "longitude";
   private static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   private static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   private static final String LIVEPERIOD_FIELD = "live_period";
   private static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   private static final String HORIZONTALACCURACY_FIELD = "horizontal_accuracy";
   private static final String HEADING_FIELD = "heading";
   private static final String PROXIMITYALERTRADIUS_FIELD = "proximity_alert_radius";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("latitude")
   @NonNull
   private Double latitude;
   @JsonProperty("longitude")
   @NonNull
   private Double longitude;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;
   @JsonProperty("reply_to_message_id")
   private Integer replyToMessageId;
   @JsonProperty("reply_markup")
   private ReplyKeyboard replyMarkup;
   @JsonProperty("live_period")
   private Integer livePeriod;
   @JsonProperty("allow_sending_without_reply")
   private Boolean allowSendingWithoutReply;
   @JsonProperty("horizontal_accuracy")
   private Double horizontalAccuracy;
   @JsonProperty("heading")
   private Integer heading;
   @JsonProperty("proximity_alert_radius")
   private Integer proximityAlertRadius;

   public void enableNotification() {
      this.disableNotification = false;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public String getMethod() {
      return "sendlocation";
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending location", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.latitude == null) {
            throw new TelegramApiValidationException("Latitude parameter can't be empty", this);
         } else if (this.longitude == null) {
            throw new TelegramApiValidationException("Longitude parameter can't be empty", this);
         } else if (this.horizontalAccuracy != null && (this.horizontalAccuracy < 0.0D || this.horizontalAccuracy > 1500.0D)) {
            throw new TelegramApiValidationException("Horizontal Accuracy parameter must be between 0 and 1500", this);
         } else if (this.heading != null && (this.heading < 1 || this.heading > 360)) {
            throw new TelegramApiValidationException("Heading Accuracy parameter must be between 1 and 360", this);
         } else if (this.proximityAlertRadius == null || this.proximityAlertRadius >= 1 && this.proximityAlertRadius <= 100000) {
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

            if (this.livePeriod != null && (this.livePeriod < 60 || this.livePeriod > 86400)) {
               throw new TelegramApiValidationException("Live period parameter must be between 60 and 86400", this);
            }
         } else {
            throw new TelegramApiValidationException("Proximity alert radius parameter must be between 1 and 100000", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendLocation.SendLocationBuilder builder() {
      return new SendLocation.SendLocationBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendLocation)) {
         return false;
      } else {
         SendLocation other = (SendLocation)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label143: {
               Object this$latitude = this.getLatitude();
               Object other$latitude = other.getLatitude();
               if (this$latitude == null) {
                  if (other$latitude == null) {
                     break label143;
                  }
               } else if (this$latitude.equals(other$latitude)) {
                  break label143;
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

            Object this$disableNotification = this.getDisableNotification();
            Object other$disableNotification = other.getDisableNotification();
            if (this$disableNotification == null) {
               if (other$disableNotification != null) {
                  return false;
               }
            } else if (!this$disableNotification.equals(other$disableNotification)) {
               return false;
            }

            label122: {
               Object this$replyToMessageId = this.getReplyToMessageId();
               Object other$replyToMessageId = other.getReplyToMessageId();
               if (this$replyToMessageId == null) {
                  if (other$replyToMessageId == null) {
                     break label122;
                  }
               } else if (this$replyToMessageId.equals(other$replyToMessageId)) {
                  break label122;
               }

               return false;
            }

            label115: {
               Object this$livePeriod = this.getLivePeriod();
               Object other$livePeriod = other.getLivePeriod();
               if (this$livePeriod == null) {
                  if (other$livePeriod == null) {
                     break label115;
                  }
               } else if (this$livePeriod.equals(other$livePeriod)) {
                  break label115;
               }

               return false;
            }

            Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
            Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
            if (this$allowSendingWithoutReply == null) {
               if (other$allowSendingWithoutReply != null) {
                  return false;
               }
            } else if (!this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
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

            label94: {
               Object this$heading = this.getHeading();
               Object other$heading = other.getHeading();
               if (this$heading == null) {
                  if (other$heading == null) {
                     break label94;
                  }
               } else if (this$heading.equals(other$heading)) {
                  break label94;
               }

               return false;
            }

            label87: {
               Object this$proximityAlertRadius = this.getProximityAlertRadius();
               Object other$proximityAlertRadius = other.getProximityAlertRadius();
               if (this$proximityAlertRadius == null) {
                  if (other$proximityAlertRadius == null) {
                     break label87;
                  }
               } else if (this$proximityAlertRadius.equals(other$proximityAlertRadius)) {
                  break label87;
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

            Object this$replyMarkup = this.getReplyMarkup();
            Object other$replyMarkup = other.getReplyMarkup();
            if (this$replyMarkup == null) {
               if (other$replyMarkup != null) {
                  return false;
               }
            } else if (!this$replyMarkup.equals(other$replyMarkup)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SendLocation;
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
      Object $livePeriod = this.getLivePeriod();
      result = result * 59 + ($livePeriod == null ? 43 : $livePeriod.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $horizontalAccuracy = this.getHorizontalAccuracy();
      result = result * 59 + ($horizontalAccuracy == null ? 43 : $horizontalAccuracy.hashCode());
      Object $heading = this.getHeading();
      result = result * 59 + ($heading == null ? 43 : $heading.hashCode());
      Object $proximityAlertRadius = this.getProximityAlertRadius();
      result = result * 59 + ($proximityAlertRadius == null ? 43 : $proximityAlertRadius.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
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

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public ReplyKeyboard getReplyMarkup() {
      return this.replyMarkup;
   }

   public Integer getLivePeriod() {
      return this.livePeriod;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
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

   @JsonProperty("disable_notification")
   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   @JsonProperty("reply_to_message_id")
   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(ReplyKeyboard replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("live_period")
   public void setLivePeriod(Integer livePeriod) {
      this.livePeriod = livePeriod;
   }

   @JsonProperty("allow_sending_without_reply")
   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
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
      return "SendLocation(chatId=" + this.getChatId() + ", latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", livePeriod=" + this.getLivePeriod() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ", horizontalAccuracy=" + this.getHorizontalAccuracy() + ", heading=" + this.getHeading() + ", proximityAlertRadius=" + this.getProximityAlertRadius() + ")";
   }

   public SendLocation(@NonNull String chatId, @NonNull Double latitude, @NonNull Double longitude) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.latitude = latitude;
         this.longitude = longitude;
      }
   }

   public SendLocation() {
   }

   public SendLocation(@NonNull String chatId, @NonNull Double latitude, @NonNull Double longitude, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, Integer livePeriod, Boolean allowSendingWithoutReply, Double horizontalAccuracy, Integer heading, Integer proximityAlertRadius) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.latitude = latitude;
         this.longitude = longitude;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.livePeriod = livePeriod;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         this.horizontalAccuracy = horizontalAccuracy;
         this.heading = heading;
         this.proximityAlertRadius = proximityAlertRadius;
      }
   }

   public static class SendLocationBuilder {
      private String chatId;
      private Double latitude;
      private Double longitude;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private Integer livePeriod;
      private Boolean allowSendingWithoutReply;
      private Double horizontalAccuracy;
      private Integer heading;
      private Integer proximityAlertRadius;

      SendLocationBuilder() {
      }

      @JsonProperty("chat_id")
      public SendLocation.SendLocationBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("latitude")
      public SendLocation.SendLocationBuilder latitude(@NonNull Double latitude) {
         if (latitude == null) {
            throw new NullPointerException("latitude is marked non-null but is null");
         } else {
            this.latitude = latitude;
            return this;
         }
      }

      @JsonProperty("longitude")
      public SendLocation.SendLocationBuilder longitude(@NonNull Double longitude) {
         if (longitude == null) {
            throw new NullPointerException("longitude is marked non-null but is null");
         } else {
            this.longitude = longitude;
            return this;
         }
      }

      @JsonProperty("disable_notification")
      public SendLocation.SendLocationBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      @JsonProperty("reply_to_message_id")
      public SendLocation.SendLocationBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      @JsonProperty("reply_markup")
      public SendLocation.SendLocationBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("live_period")
      public SendLocation.SendLocationBuilder livePeriod(Integer livePeriod) {
         this.livePeriod = livePeriod;
         return this;
      }

      @JsonProperty("allow_sending_without_reply")
      public SendLocation.SendLocationBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      @JsonProperty("horizontal_accuracy")
      public SendLocation.SendLocationBuilder horizontalAccuracy(Double horizontalAccuracy) {
         this.horizontalAccuracy = horizontalAccuracy;
         return this;
      }

      @JsonProperty("heading")
      public SendLocation.SendLocationBuilder heading(Integer heading) {
         this.heading = heading;
         return this;
      }

      @JsonProperty("proximity_alert_radius")
      public SendLocation.SendLocationBuilder proximityAlertRadius(Integer proximityAlertRadius) {
         this.proximityAlertRadius = proximityAlertRadius;
         return this;
      }

      public SendLocation build() {
         return new SendLocation(this.chatId, this.latitude, this.longitude, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.livePeriod, this.allowSendingWithoutReply, this.horizontalAccuracy, this.heading, this.proximityAlertRadius);
      }

      public String toString() {
         return "SendLocation.SendLocationBuilder(chatId=" + this.chatId + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", livePeriod=" + this.livePeriod + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ", horizontalAccuracy=" + this.horizontalAccuracy + ", heading=" + this.heading + ", proximityAlertRadius=" + this.proximityAlertRadius + ")";
      }
   }
}
