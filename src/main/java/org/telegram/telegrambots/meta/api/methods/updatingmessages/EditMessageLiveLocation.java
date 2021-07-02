package org.telegram.telegrambots.meta.api.methods.updatingmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.io.Serializable;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class EditMessageLiveLocation extends BotApiMethod<Serializable> {
   public static final String PATH = "editMessageLiveLocation";
   private static final String CHATID_FIELD = "chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
   private static final String LATITUDE_FIELD = "latitude";
   private static final String LONGITUDE_FIELD = "longitude";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   private static final String HORIZONTALACCURACY_FIELD = "horizontal_accuracy";
   private static final String HEADING_FIELD = "heading";
   private static final String PROXIMITYALERTRADIUS_FIELD = "proximity_alert_radius";
   @JsonProperty("chat_id")
   private String chatId;
   @JsonProperty("message_id")
   private Integer messageId;
   @JsonProperty("inline_message_id")
   private String inlineMessageId;
   @JsonProperty("latitude")
   @NonNull
   private Double latitude;
   @JsonProperty("longitude")
   @NonNull
   private Double longitude;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("horizontal_accuracy")
   private Double horizontalAccuracy;
   @JsonProperty("heading")
   private Integer heading;
   @JsonProperty("proximity_alert_radius")
   private Integer proximityAlertRadius;

   public String getMethod() {
      return "editMessageLiveLocation";
   }

   public Serializable deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Serializable)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error editing message live location", result);
         }
      } catch (IOException var5) {
         try {
            ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
            });
            if (result.getOk()) {
               return (Serializable)result.getResult();
            } else {
               throw new TelegramApiRequestException("Error editing message live location", result);
            }
         } catch (IOException var4) {
            throw new TelegramApiRequestException("Unable to deserialize response", var5);
         }
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.inlineMessageId == null) {
         if (this.chatId == null || this.chatId.isEmpty()) {
            throw new TelegramApiValidationException("ChatId parameter can't be empty if inlineMessageId is not present", this);
         }

         if (this.messageId == null) {
            throw new TelegramApiValidationException("MessageId parameter can't be empty if inlineMessageId is not present", this);
         }
      } else {
         if (this.chatId != null) {
            throw new TelegramApiValidationException("ChatId parameter must be empty if inlineMessageId is provided", this);
         }

         if (this.messageId != null) {
            throw new TelegramApiValidationException("MessageId parameter must be empty if inlineMessageId is provided", this);
         }
      }

      if (this.latitude == null) {
         throw new TelegramApiValidationException("Latitude parameter can't be empty", this);
      } else if (this.longitude == null) {
         throw new TelegramApiValidationException("Longitude parameter can't be empty", this);
      } else if (this.horizontalAccuracy == null || !(this.horizontalAccuracy < 0.0D) && !(this.horizontalAccuracy > 1500.0D)) {
         if (this.heading == null || this.heading >= 1 && this.heading <= 360) {
            if (this.proximityAlertRadius != null && (this.proximityAlertRadius < 1 || this.proximityAlertRadius > 100000)) {
               throw new TelegramApiValidationException("Approaching notification distance parameter must be between 1 and 100000", this);
            } else {
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
   }

   public static EditMessageLiveLocation.EditMessageLiveLocationBuilder builder() {
      return new EditMessageLiveLocation.EditMessageLiveLocationBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EditMessageLiveLocation)) {
         return false;
      } else {
         EditMessageLiveLocation other = (EditMessageLiveLocation)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label119: {
               Object this$messageId = this.getMessageId();
               Object other$messageId = other.getMessageId();
               if (this$messageId == null) {
                  if (other$messageId == null) {
                     break label119;
                  }
               } else if (this$messageId.equals(other$messageId)) {
                  break label119;
               }

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

            label105: {
               Object this$longitude = this.getLongitude();
               Object other$longitude = other.getLongitude();
               if (this$longitude == null) {
                  if (other$longitude == null) {
                     break label105;
                  }
               } else if (this$longitude.equals(other$longitude)) {
                  break label105;
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

            label91: {
               Object this$heading = this.getHeading();
               Object other$heading = other.getHeading();
               if (this$heading == null) {
                  if (other$heading == null) {
                     break label91;
                  }
               } else if (this$heading.equals(other$heading)) {
                  break label91;
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

            label77: {
               Object this$chatId = this.getChatId();
               Object other$chatId = other.getChatId();
               if (this$chatId == null) {
                  if (other$chatId == null) {
                     break label77;
                  }
               } else if (this$chatId.equals(other$chatId)) {
                  break label77;
               }

               return false;
            }

            label70: {
               Object this$inlineMessageId = this.getInlineMessageId();
               Object other$inlineMessageId = other.getInlineMessageId();
               if (this$inlineMessageId == null) {
                  if (other$inlineMessageId == null) {
                     break label70;
                  }
               } else if (this$inlineMessageId.equals(other$inlineMessageId)) {
                  break label70;
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof EditMessageLiveLocation;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
      Object $latitude = this.getLatitude();
      result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());
      Object $longitude = this.getLongitude();
      result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());
      Object $horizontalAccuracy = this.getHorizontalAccuracy();
      result = result * 59 + ($horizontalAccuracy == null ? 43 : $horizontalAccuracy.hashCode());
      Object $heading = this.getHeading();
      result = result * 59 + ($heading == null ? 43 : $heading.hashCode());
      Object $proximityAlertRadius = this.getProximityAlertRadius();
      result = result * 59 + ($proximityAlertRadius == null ? 43 : $proximityAlertRadius.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $inlineMessageId = this.getInlineMessageId();
      result = result * 59 + ($inlineMessageId == null ? 43 : $inlineMessageId.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      return result;
   }

   public String getChatId() {
      return this.chatId;
   }

   public Integer getMessageId() {
      return this.messageId;
   }

   public String getInlineMessageId() {
      return this.inlineMessageId;
   }

   @NonNull
   public Double getLatitude() {
      return this.latitude;
   }

   @NonNull
   public Double getLongitude() {
      return this.longitude;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
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
   public void setChatId(String chatId) {
      this.chatId = chatId;
   }

   @JsonProperty("message_id")
   public void setMessageId(Integer messageId) {
      this.messageId = messageId;
   }

   @JsonProperty("inline_message_id")
   public void setInlineMessageId(String inlineMessageId) {
      this.inlineMessageId = inlineMessageId;
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

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
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
      return "EditMessageLiveLocation(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ", inlineMessageId=" + this.getInlineMessageId() + ", latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", replyMarkup=" + this.getReplyMarkup() + ", horizontalAccuracy=" + this.getHorizontalAccuracy() + ", heading=" + this.getHeading() + ", proximityAlertRadius=" + this.getProximityAlertRadius() + ")";
   }

   public EditMessageLiveLocation() {
   }

   public EditMessageLiveLocation(String chatId, Integer messageId, String inlineMessageId, @NonNull Double latitude, @NonNull Double longitude, InlineKeyboardMarkup replyMarkup, Double horizontalAccuracy, Integer heading, Integer proximityAlertRadius) {
      if (latitude == null) {
         throw new NullPointerException("latitude is marked non-null but is null");
      } else if (longitude == null) {
         throw new NullPointerException("longitude is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.messageId = messageId;
         this.inlineMessageId = inlineMessageId;
         this.latitude = latitude;
         this.longitude = longitude;
         this.replyMarkup = replyMarkup;
         this.horizontalAccuracy = horizontalAccuracy;
         this.heading = heading;
         this.proximityAlertRadius = proximityAlertRadius;
      }
   }

   public static class EditMessageLiveLocationBuilder {
      private String chatId;
      private Integer messageId;
      private String inlineMessageId;
      private Double latitude;
      private Double longitude;
      private InlineKeyboardMarkup replyMarkup;
      private Double horizontalAccuracy;
      private Integer heading;
      private Integer proximityAlertRadius;

      EditMessageLiveLocationBuilder() {
      }

      @JsonProperty("chat_id")
      public EditMessageLiveLocation.EditMessageLiveLocationBuilder chatId(String chatId) {
         this.chatId = chatId;
         return this;
      }

      @JsonProperty("message_id")
      public EditMessageLiveLocation.EditMessageLiveLocationBuilder messageId(Integer messageId) {
         this.messageId = messageId;
         return this;
      }

      @JsonProperty("inline_message_id")
      public EditMessageLiveLocation.EditMessageLiveLocationBuilder inlineMessageId(String inlineMessageId) {
         this.inlineMessageId = inlineMessageId;
         return this;
      }

      @JsonProperty("latitude")
      public EditMessageLiveLocation.EditMessageLiveLocationBuilder latitude(@NonNull Double latitude) {
         if (latitude == null) {
            throw new NullPointerException("latitude is marked non-null but is null");
         } else {
            this.latitude = latitude;
            return this;
         }
      }

      @JsonProperty("longitude")
      public EditMessageLiveLocation.EditMessageLiveLocationBuilder longitude(@NonNull Double longitude) {
         if (longitude == null) {
            throw new NullPointerException("longitude is marked non-null but is null");
         } else {
            this.longitude = longitude;
            return this;
         }
      }

      @JsonProperty("reply_markup")
      public EditMessageLiveLocation.EditMessageLiveLocationBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("horizontal_accuracy")
      public EditMessageLiveLocation.EditMessageLiveLocationBuilder horizontalAccuracy(Double horizontalAccuracy) {
         this.horizontalAccuracy = horizontalAccuracy;
         return this;
      }

      @JsonProperty("heading")
      public EditMessageLiveLocation.EditMessageLiveLocationBuilder heading(Integer heading) {
         this.heading = heading;
         return this;
      }

      @JsonProperty("proximity_alert_radius")
      public EditMessageLiveLocation.EditMessageLiveLocationBuilder proximityAlertRadius(Integer proximityAlertRadius) {
         this.proximityAlertRadius = proximityAlertRadius;
         return this;
      }

      public EditMessageLiveLocation build() {
         return new EditMessageLiveLocation(this.chatId, this.messageId, this.inlineMessageId, this.latitude, this.longitude, this.replyMarkup, this.horizontalAccuracy, this.heading, this.proximityAlertRadius);
      }

      public String toString() {
         return "EditMessageLiveLocation.EditMessageLiveLocationBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ", inlineMessageId=" + this.inlineMessageId + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", replyMarkup=" + this.replyMarkup + ", horizontalAccuracy=" + this.horizontalAccuracy + ", heading=" + this.heading + ", proximityAlertRadius=" + this.proximityAlertRadius + ")";
      }
   }
}
