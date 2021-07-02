package org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class KeyboardButton implements Validable, BotApiObject {
   private static final String TEXT_FIELD = "text";
   private static final String REQUEST_CONTACT_FIELD = "request_contact";
   private static final String REQUEST_LOCATION_FIELD = "request_location";
   private static final String REQUEST_POLL_FIELD = "request_poll";
   @JsonProperty("text")
   @NonNull
   private String text;
   @JsonProperty("request_contact")
   private Boolean requestContact;
   @JsonProperty("request_location")
   private Boolean requestLocation;
   @JsonProperty("request_poll")
   private KeyboardButtonPollType requestPoll;

   public void validate() throws TelegramApiValidationException {
      if (this.text != null && !this.text.isEmpty()) {
         if (this.requestContact != null && this.requestLocation != null && this.requestContact && this.requestLocation) {
            throw new TelegramApiValidationException("Cant request contact and location at the same time", this);
         } else if (this.requestContact != null && this.requestPoll != null && this.requestContact) {
            throw new TelegramApiValidationException("Cant request contact and poll at the same time", this);
         } else if (this.requestLocation != null && this.requestPoll != null && this.requestLocation) {
            throw new TelegramApiValidationException("Cant request location and poll at the same time", this);
         }
      } else {
         throw new TelegramApiValidationException("Text parameter can't be empty", this);
      }
   }

   public static KeyboardButton.KeyboardButtonBuilder builder() {
      return new KeyboardButton.KeyboardButtonBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof KeyboardButton)) {
         return false;
      } else {
         KeyboardButton other = (KeyboardButton)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$requestContact = this.getRequestContact();
               Object other$requestContact = other.getRequestContact();
               if (this$requestContact == null) {
                  if (other$requestContact == null) {
                     break label59;
                  }
               } else if (this$requestContact.equals(other$requestContact)) {
                  break label59;
               }

               return false;
            }

            Object this$requestLocation = this.getRequestLocation();
            Object other$requestLocation = other.getRequestLocation();
            if (this$requestLocation == null) {
               if (other$requestLocation != null) {
                  return false;
               }
            } else if (!this$requestLocation.equals(other$requestLocation)) {
               return false;
            }

            Object this$text = this.getText();
            Object other$text = other.getText();
            if (this$text == null) {
               if (other$text != null) {
                  return false;
               }
            } else if (!this$text.equals(other$text)) {
               return false;
            }

            Object this$requestPoll = this.getRequestPoll();
            Object other$requestPoll = other.getRequestPoll();
            if (this$requestPoll == null) {
               if (other$requestPoll != null) {
                  return false;
               }
            } else if (!this$requestPoll.equals(other$requestPoll)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof KeyboardButton;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $requestContact = this.getRequestContact();
      int result = result * 59 + ($requestContact == null ? 43 : $requestContact.hashCode());
      Object $requestLocation = this.getRequestLocation();
      result = result * 59 + ($requestLocation == null ? 43 : $requestLocation.hashCode());
      Object $text = this.getText();
      result = result * 59 + ($text == null ? 43 : $text.hashCode());
      Object $requestPoll = this.getRequestPoll();
      result = result * 59 + ($requestPoll == null ? 43 : $requestPoll.hashCode());
      return result;
   }

   @NonNull
   public String getText() {
      return this.text;
   }

   public Boolean getRequestContact() {
      return this.requestContact;
   }

   public Boolean getRequestLocation() {
      return this.requestLocation;
   }

   public KeyboardButtonPollType getRequestPoll() {
      return this.requestPoll;
   }

   @JsonProperty("text")
   public void setText(@NonNull String text) {
      if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.text = text;
      }
   }

   @JsonProperty("request_contact")
   public void setRequestContact(Boolean requestContact) {
      this.requestContact = requestContact;
   }

   @JsonProperty("request_location")
   public void setRequestLocation(Boolean requestLocation) {
      this.requestLocation = requestLocation;
   }

   @JsonProperty("request_poll")
   public void setRequestPoll(KeyboardButtonPollType requestPoll) {
      this.requestPoll = requestPoll;
   }

   public String toString() {
      return "KeyboardButton(text=" + this.getText() + ", requestContact=" + this.getRequestContact() + ", requestLocation=" + this.getRequestLocation() + ", requestPoll=" + this.getRequestPoll() + ")";
   }

   public KeyboardButton() {
   }

   public KeyboardButton(@NonNull String text) {
      if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.text = text;
      }
   }

   public KeyboardButton(@NonNull String text, Boolean requestContact, Boolean requestLocation, KeyboardButtonPollType requestPoll) {
      if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.text = text;
         this.requestContact = requestContact;
         this.requestLocation = requestLocation;
         this.requestPoll = requestPoll;
      }
   }

   public static class KeyboardButtonBuilder {
      private String text;
      private Boolean requestContact;
      private Boolean requestLocation;
      private KeyboardButtonPollType requestPoll;

      KeyboardButtonBuilder() {
      }

      @JsonProperty("text")
      public KeyboardButton.KeyboardButtonBuilder text(@NonNull String text) {
         if (text == null) {
            throw new NullPointerException("text is marked non-null but is null");
         } else {
            this.text = text;
            return this;
         }
      }

      @JsonProperty("request_contact")
      public KeyboardButton.KeyboardButtonBuilder requestContact(Boolean requestContact) {
         this.requestContact = requestContact;
         return this;
      }

      @JsonProperty("request_location")
      public KeyboardButton.KeyboardButtonBuilder requestLocation(Boolean requestLocation) {
         this.requestLocation = requestLocation;
         return this;
      }

      @JsonProperty("request_poll")
      public KeyboardButton.KeyboardButtonBuilder requestPoll(KeyboardButtonPollType requestPoll) {
         this.requestPoll = requestPoll;
         return this;
      }

      public KeyboardButton build() {
         return new KeyboardButton(this.text, this.requestContact, this.requestLocation, this.requestPoll);
      }

      public String toString() {
         return "KeyboardButton.KeyboardButtonBuilder(text=" + this.text + ", requestContact=" + this.requestContact + ", requestLocation=" + this.requestLocation + ", requestPoll=" + this.requestPoll + ")";
      }
   }
}
