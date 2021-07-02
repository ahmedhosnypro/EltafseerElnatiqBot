package org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.NonNull;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InputContactMessageContent implements InputMessageContent {
   private static final String PHONE_NUMBER_FIELD = "phone_number";
   private static final String FIRST_NAME_FIELD = "first_name";
   private static final String LAST_NAME_FIELD = "last_name";
   private static final String VCARD_FIELD = "vcard";
   @JsonProperty("phone_number")
   @NonNull
   private String phoneNumber;
   @JsonProperty("first_name")
   @NonNull
   private String firstName;
   @JsonProperty("last_name")
   private String lastName;
   @JsonProperty("vcard")
   private String vCard;

   public void validate() throws TelegramApiValidationException {
      if (this.phoneNumber != null && !this.phoneNumber.isEmpty()) {
         if (this.firstName == null || this.firstName.isEmpty()) {
            throw new TelegramApiValidationException("FirstName parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("PhoneNumber parameter can't be empty", this);
      }
   }

   public static InputContactMessageContent.InputContactMessageContentBuilder builder() {
      return new InputContactMessageContent.InputContactMessageContentBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputContactMessageContent)) {
         return false;
      } else {
         InputContactMessageContent other = (InputContactMessageContent)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$phoneNumber = this.getPhoneNumber();
               Object other$phoneNumber = other.getPhoneNumber();
               if (this$phoneNumber == null) {
                  if (other$phoneNumber == null) {
                     break label59;
                  }
               } else if (this$phoneNumber.equals(other$phoneNumber)) {
                  break label59;
               }

               return false;
            }

            Object this$firstName = this.getFirstName();
            Object other$firstName = other.getFirstName();
            if (this$firstName == null) {
               if (other$firstName != null) {
                  return false;
               }
            } else if (!this$firstName.equals(other$firstName)) {
               return false;
            }

            Object this$lastName = this.getLastName();
            Object other$lastName = other.getLastName();
            if (this$lastName == null) {
               if (other$lastName != null) {
                  return false;
               }
            } else if (!this$lastName.equals(other$lastName)) {
               return false;
            }

            Object this$vCard = this.getVCard();
            Object other$vCard = other.getVCard();
            if (this$vCard == null) {
               if (other$vCard != null) {
                  return false;
               }
            } else if (!this$vCard.equals(other$vCard)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InputContactMessageContent;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $phoneNumber = this.getPhoneNumber();
      int result = result * 59 + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $vCard = this.getVCard();
      result = result * 59 + ($vCard == null ? 43 : $vCard.hashCode());
      return result;
   }

   @NonNull
   public String getPhoneNumber() {
      return this.phoneNumber;
   }

   @NonNull
   public String getFirstName() {
      return this.firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public String getVCard() {
      return this.vCard;
   }

   @JsonProperty("phone_number")
   public void setPhoneNumber(@NonNull String phoneNumber) {
      if (phoneNumber == null) {
         throw new NullPointerException("phoneNumber is marked non-null but is null");
      } else {
         this.phoneNumber = phoneNumber;
      }
   }

   @JsonProperty("first_name")
   public void setFirstName(@NonNull String firstName) {
      if (firstName == null) {
         throw new NullPointerException("firstName is marked non-null but is null");
      } else {
         this.firstName = firstName;
      }
   }

   @JsonProperty("last_name")
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   @JsonProperty("vcard")
   public void setVCard(String vCard) {
      this.vCard = vCard;
   }

   public String toString() {
      return "InputContactMessageContent(phoneNumber=" + this.getPhoneNumber() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", vCard=" + this.getVCard() + ")";
   }

   public InputContactMessageContent(@NonNull String phoneNumber, @NonNull String firstName) {
      if (phoneNumber == null) {
         throw new NullPointerException("phoneNumber is marked non-null but is null");
      } else if (firstName == null) {
         throw new NullPointerException("firstName is marked non-null but is null");
      } else {
         this.phoneNumber = phoneNumber;
         this.firstName = firstName;
      }
   }

   public InputContactMessageContent() {
   }

   public InputContactMessageContent(@NonNull String phoneNumber, @NonNull String firstName, String lastName, String vCard) {
      if (phoneNumber == null) {
         throw new NullPointerException("phoneNumber is marked non-null but is null");
      } else if (firstName == null) {
         throw new NullPointerException("firstName is marked non-null but is null");
      } else {
         this.phoneNumber = phoneNumber;
         this.firstName = firstName;
         this.lastName = lastName;
         this.vCard = vCard;
      }
   }

   public static class InputContactMessageContentBuilder {
      private String phoneNumber;
      private String firstName;
      private String lastName;
      private String vCard;

      InputContactMessageContentBuilder() {
      }

      @JsonProperty("phone_number")
      public InputContactMessageContent.InputContactMessageContentBuilder phoneNumber(@NonNull String phoneNumber) {
         if (phoneNumber == null) {
            throw new NullPointerException("phoneNumber is marked non-null but is null");
         } else {
            this.phoneNumber = phoneNumber;
            return this;
         }
      }

      @JsonProperty("first_name")
      public InputContactMessageContent.InputContactMessageContentBuilder firstName(@NonNull String firstName) {
         if (firstName == null) {
            throw new NullPointerException("firstName is marked non-null but is null");
         } else {
            this.firstName = firstName;
            return this;
         }
      }

      @JsonProperty("last_name")
      public InputContactMessageContent.InputContactMessageContentBuilder lastName(String lastName) {
         this.lastName = lastName;
         return this;
      }

      @JsonProperty("vcard")
      public InputContactMessageContent.InputContactMessageContentBuilder vCard(String vCard) {
         this.vCard = vCard;
         return this;
      }

      public InputContactMessageContent build() {
         return new InputContactMessageContent(this.phoneNumber, this.firstName, this.lastName, this.vCard);
      }

      public String toString() {
         return "InputContactMessageContent.InputContactMessageContentBuilder(phoneNumber=" + this.phoneNumber + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", vCard=" + this.vCard + ")";
      }
   }
}
