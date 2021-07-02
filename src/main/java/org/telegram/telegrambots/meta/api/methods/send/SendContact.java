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

public class SendContact extends BotApiMethod<Message> {
   public static final String PATH = "sendContact";
   private static final String CHATID_FIELD = "chat_id";
   private static final String PHONE_NUMBER_FIELD = "phone_number";
   private static final String FIRST_NAME_FIELD = "first_name";
   private static final String LAST_NAME_FIELD = "last_name";
   private static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   private static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   private static final String VCARD_FIELD = "vcard";
   private static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("phone_number")
   @NonNull
   private String phoneNumber;
   @JsonProperty("first_name")
   @NonNull
   private String firstName;
   @JsonProperty("last_name")
   private String lastName;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;
   @JsonProperty("reply_to_message_id")
   private Integer replyToMessageId;
   @JsonProperty("reply_markup")
   private ReplyKeyboard replyMarkup;
   @JsonProperty("vcard")
   private String vCard;
   @JsonProperty("allow_sending_without_reply")
   private Boolean allowSendingWithoutReply;

   public void enableNotification() {
      this.disableNotification = false;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public String getMethod() {
      return "sendContact";
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending contact", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.phoneNumber == null) {
            throw new TelegramApiValidationException("PhoneNumber parameter can't be empty", this);
         } else if (this.firstName == null) {
            throw new TelegramApiValidationException("FirstName parameter can't be empty", this);
         } else {
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendContact.SendContactBuilder builder() {
      return new SendContact.SendContactBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendContact)) {
         return false;
      } else {
         SendContact other = (SendContact)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label119: {
               Object this$disableNotification = this.getDisableNotification();
               Object other$disableNotification = other.getDisableNotification();
               if (this$disableNotification == null) {
                  if (other$disableNotification == null) {
                     break label119;
                  }
               } else if (this$disableNotification.equals(other$disableNotification)) {
                  break label119;
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

            label105: {
               Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
               Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
               if (this$allowSendingWithoutReply == null) {
                  if (other$allowSendingWithoutReply == null) {
                     break label105;
                  }
               } else if (this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
                  break label105;
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

            label91: {
               Object this$phoneNumber = this.getPhoneNumber();
               Object other$phoneNumber = other.getPhoneNumber();
               if (this$phoneNumber == null) {
                  if (other$phoneNumber == null) {
                     break label91;
                  }
               } else if (this$phoneNumber.equals(other$phoneNumber)) {
                  break label91;
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

            label77: {
               Object this$lastName = this.getLastName();
               Object other$lastName = other.getLastName();
               if (this$lastName == null) {
                  if (other$lastName == null) {
                     break label77;
                  }
               } else if (this$lastName.equals(other$lastName)) {
                  break label77;
               }

               return false;
            }

            label70: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label70;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label70;
               }

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
      return other instanceof SendContact;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $disableNotification = this.getDisableNotification();
      int result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $phoneNumber = this.getPhoneNumber();
      result = result * 59 + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $vCard = this.getVCard();
      result = result * 59 + ($vCard == null ? 43 : $vCard.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
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

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public ReplyKeyboard getReplyMarkup() {
      return this.replyMarkup;
   }

   public String getVCard() {
      return this.vCard;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
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

   @JsonProperty("vcard")
   public void setVCard(String vCard) {
      this.vCard = vCard;
   }

   @JsonProperty("allow_sending_without_reply")
   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   public String toString() {
      return "SendContact(chatId=" + this.getChatId() + ", phoneNumber=" + this.getPhoneNumber() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", vCard=" + this.getVCard() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendContact(@NonNull String chatId, @NonNull String phoneNumber, @NonNull String firstName) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (phoneNumber == null) {
         throw new NullPointerException("phoneNumber is marked non-null but is null");
      } else if (firstName == null) {
         throw new NullPointerException("firstName is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.phoneNumber = phoneNumber;
         this.firstName = firstName;
      }
   }

   public SendContact() {
   }

   public SendContact(@NonNull String chatId, @NonNull String phoneNumber, @NonNull String firstName, String lastName, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, String vCard, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (phoneNumber == null) {
         throw new NullPointerException("phoneNumber is marked non-null but is null");
      } else if (firstName == null) {
         throw new NullPointerException("firstName is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.phoneNumber = phoneNumber;
         this.firstName = firstName;
         this.lastName = lastName;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.vCard = vCard;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendContactBuilder {
      private String chatId;
      private String phoneNumber;
      private String firstName;
      private String lastName;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private String vCard;
      private Boolean allowSendingWithoutReply;

      SendContactBuilder() {
      }

      @JsonProperty("chat_id")
      public SendContact.SendContactBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("phone_number")
      public SendContact.SendContactBuilder phoneNumber(@NonNull String phoneNumber) {
         if (phoneNumber == null) {
            throw new NullPointerException("phoneNumber is marked non-null but is null");
         } else {
            this.phoneNumber = phoneNumber;
            return this;
         }
      }

      @JsonProperty("first_name")
      public SendContact.SendContactBuilder firstName(@NonNull String firstName) {
         if (firstName == null) {
            throw new NullPointerException("firstName is marked non-null but is null");
         } else {
            this.firstName = firstName;
            return this;
         }
      }

      @JsonProperty("last_name")
      public SendContact.SendContactBuilder lastName(String lastName) {
         this.lastName = lastName;
         return this;
      }

      @JsonProperty("disable_notification")
      public SendContact.SendContactBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      @JsonProperty("reply_to_message_id")
      public SendContact.SendContactBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      @JsonProperty("reply_markup")
      public SendContact.SendContactBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("vcard")
      public SendContact.SendContactBuilder vCard(String vCard) {
         this.vCard = vCard;
         return this;
      }

      @JsonProperty("allow_sending_without_reply")
      public SendContact.SendContactBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendContact build() {
         return new SendContact(this.chatId, this.phoneNumber, this.firstName, this.lastName, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.vCard, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendContact.SendContactBuilder(chatId=" + this.chatId + ", phoneNumber=" + this.phoneNumber + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", vCard=" + this.vCard + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
