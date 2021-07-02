package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class Contact implements BotApiObject {
   private static final String PHONENUMBER_FIELD = "phone_number";
   private static final String FIRSTNAME_FIELD = "first_name";
   private static final String LASTNAME_FIELD = "last_name";
   private static final String USERID_FIELD = "user_id";
   private static final String VCARD_FIELD = "vcard";
   @JsonProperty("phone_number")
   private String phoneNumber;
   @JsonProperty("first_name")
   private String firstName;
   @JsonProperty("last_name")
   private String lastName;
   @JsonProperty("user_id")
   private Long userId;
   @JsonProperty("vcard")
   private String vCard;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Contact)) {
         return false;
      } else {
         Contact other = (Contact)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label71: {
               Object this$userId = this.getUserId();
               Object other$userId = other.getUserId();
               if (this$userId == null) {
                  if (other$userId == null) {
                     break label71;
                  }
               } else if (this$userId.equals(other$userId)) {
                  break label71;
               }

               return false;
            }

            Object this$phoneNumber = this.getPhoneNumber();
            Object other$phoneNumber = other.getPhoneNumber();
            if (this$phoneNumber == null) {
               if (other$phoneNumber != null) {
                  return false;
               }
            } else if (!this$phoneNumber.equals(other$phoneNumber)) {
               return false;
            }

            label57: {
               Object this$firstName = this.getFirstName();
               Object other$firstName = other.getFirstName();
               if (this$firstName == null) {
                  if (other$firstName == null) {
                     break label57;
                  }
               } else if (this$firstName.equals(other$firstName)) {
                  break label57;
               }

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
               if (other$vCard == null) {
                  return true;
               }
            } else if (this$vCard.equals(other$vCard)) {
               return true;
            }

            return false;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Contact;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $phoneNumber = this.getPhoneNumber();
      result = result * 59 + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $vCard = this.getVCard();
      result = result * 59 + ($vCard == null ? 43 : $vCard.hashCode());
      return result;
   }

   public String getPhoneNumber() {
      return this.phoneNumber;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public Long getUserId() {
      return this.userId;
   }

   public String getVCard() {
      return this.vCard;
   }

   @JsonProperty("phone_number")
   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   @JsonProperty("first_name")
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   @JsonProperty("last_name")
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   @JsonProperty("user_id")
   public void setUserId(Long userId) {
      this.userId = userId;
   }

   @JsonProperty("vcard")
   public void setVCard(String vCard) {
      this.vCard = vCard;
   }

   public String toString() {
      return "Contact(phoneNumber=" + this.getPhoneNumber() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", userId=" + this.getUserId() + ", vCard=" + this.getVCard() + ")";
   }

   public Contact() {
   }

   public Contact(String phoneNumber, String firstName, String lastName, Long userId, String vCard) {
      this.phoneNumber = phoneNumber;
      this.firstName = firstName;
      this.lastName = lastName;
      this.userId = userId;
      this.vCard = vCard;
   }
}
