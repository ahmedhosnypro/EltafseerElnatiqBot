package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultContact implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String PHONE_NUMBER_FIELD = "phone_number";
   private static final String FIRST_NAME_FIELD = "first_name";
   private static final String LAST_NAME_FIELD = "last_name";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String THUMBURL_FIELD = "thumb_url";
   private static final String THUMBWIDTH_FIELD = "thumb_width";
   private static final String THUMBHEIGHT_FIELD = "thumb_height";
   private static final String VCARD_FIELD = "vcard";
   @JsonProperty("type")
   private final String type = "contact";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("phone_number")
   @NonNull
   private String phoneNumber;
   @JsonProperty("first_name")
   @NonNull
   private String firstName;
   @JsonProperty("last_name")
   private String lastName;
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
   @JsonProperty("vcard")
   private String vCard;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.phoneNumber != null && !this.phoneNumber.isEmpty()) {
            if (this.firstName != null && !this.firstName.isEmpty()) {
               if (this.inputMessageContent != null) {
                  this.inputMessageContent.validate();
               }

               if (this.replyMarkup != null) {
                  this.replyMarkup.validate();
               }

            } else {
               throw new TelegramApiValidationException("FirstName parameter can't be empty", this);
            }
         } else {
            throw new TelegramApiValidationException("PhoneNumber parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultContact.InlineQueryResultContactBuilder builder() {
      return new InlineQueryResultContact.InlineQueryResultContactBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultContact)) {
         return false;
      } else {
         InlineQueryResultContact other = (InlineQueryResultContact)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label143: {
               Object this$thumbWidth = this.getThumbWidth();
               Object other$thumbWidth = other.getThumbWidth();
               if (this$thumbWidth == null) {
                  if (other$thumbWidth == null) {
                     break label143;
                  }
               } else if (this$thumbWidth.equals(other$thumbWidth)) {
                  break label143;
               }

               return false;
            }

            Object this$thumbHeight = this.getThumbHeight();
            Object other$thumbHeight = other.getThumbHeight();
            if (this$thumbHeight == null) {
               if (other$thumbHeight != null) {
                  return false;
               }
            } else if (!this$thumbHeight.equals(other$thumbHeight)) {
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

            label122: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label122;
                  }
               } else if (this$id.equals(other$id)) {
                  break label122;
               }

               return false;
            }

            label115: {
               Object this$phoneNumber = this.getPhoneNumber();
               Object other$phoneNumber = other.getPhoneNumber();
               if (this$phoneNumber == null) {
                  if (other$phoneNumber == null) {
                     break label115;
                  }
               } else if (this$phoneNumber.equals(other$phoneNumber)) {
                  break label115;
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

            label94: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label94;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label94;
               }

               return false;
            }

            label87: {
               Object this$inputMessageContent = this.getInputMessageContent();
               Object other$inputMessageContent = other.getInputMessageContent();
               if (this$inputMessageContent == null) {
                  if (other$inputMessageContent == null) {
                     break label87;
                  }
               } else if (this$inputMessageContent.equals(other$inputMessageContent)) {
                  break label87;
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
      return other instanceof InlineQueryResultContact;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $thumbWidth = this.getThumbWidth();
      int result = result * 59 + ($thumbWidth == null ? 43 : $thumbWidth.hashCode());
      Object $thumbHeight = this.getThumbHeight();
      result = result * 59 + ($thumbHeight == null ? 43 : $thumbHeight.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $phoneNumber = this.getPhoneNumber();
      result = result * 59 + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $inputMessageContent = this.getInputMessageContent();
      result = result * 59 + ($inputMessageContent == null ? 43 : $inputMessageContent.hashCode());
      Object $thumbUrl = this.getThumbUrl();
      result = result * 59 + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
      Object $vCard = this.getVCard();
      result = result * 59 + ($vCard == null ? 43 : $vCard.hashCode());
      return result;
   }

   public String getType() {
      Objects.requireNonNull(this);
      return "contact";
   }

   @NonNull
   public String getId() {
      return this.id;
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

   public String getVCard() {
      return this.vCard;
   }

   @JsonProperty("id")
   public void setId(@NonNull String id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
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

   @JsonProperty("vcard")
   public void setVCard(String vCard) {
      this.vCard = vCard;
   }

   public String toString() {
      return "InlineQueryResultContact(type=" + this.getType() + ", id=" + this.getId() + ", phoneNumber=" + this.getPhoneNumber() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", replyMarkup=" + this.getReplyMarkup() + ", inputMessageContent=" + this.getInputMessageContent() + ", thumbUrl=" + this.getThumbUrl() + ", thumbWidth=" + this.getThumbWidth() + ", thumbHeight=" + this.getThumbHeight() + ", vCard=" + this.getVCard() + ")";
   }

   public InlineQueryResultContact(@NonNull String id, @NonNull String phoneNumber, @NonNull String firstName) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (phoneNumber == null) {
         throw new NullPointerException("phoneNumber is marked non-null but is null");
      } else if (firstName == null) {
         throw new NullPointerException("firstName is marked non-null but is null");
      } else {
         this.id = id;
         this.phoneNumber = phoneNumber;
         this.firstName = firstName;
      }
   }

   public InlineQueryResultContact() {
   }

   public InlineQueryResultContact(@NonNull String id, @NonNull String phoneNumber, @NonNull String firstName, String lastName, InlineKeyboardMarkup replyMarkup, InputMessageContent inputMessageContent, String thumbUrl, Integer thumbWidth, Integer thumbHeight, String vCard) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (phoneNumber == null) {
         throw new NullPointerException("phoneNumber is marked non-null but is null");
      } else if (firstName == null) {
         throw new NullPointerException("firstName is marked non-null but is null");
      } else {
         this.id = id;
         this.phoneNumber = phoneNumber;
         this.firstName = firstName;
         this.lastName = lastName;
         this.replyMarkup = replyMarkup;
         this.inputMessageContent = inputMessageContent;
         this.thumbUrl = thumbUrl;
         this.thumbWidth = thumbWidth;
         this.thumbHeight = thumbHeight;
         this.vCard = vCard;
      }
   }

   public static class InlineQueryResultContactBuilder {
      private String id;
      private String phoneNumber;
      private String firstName;
      private String lastName;
      private InlineKeyboardMarkup replyMarkup;
      private InputMessageContent inputMessageContent;
      private String thumbUrl;
      private Integer thumbWidth;
      private Integer thumbHeight;
      private String vCard;

      InlineQueryResultContactBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultContact.InlineQueryResultContactBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("phone_number")
      public InlineQueryResultContact.InlineQueryResultContactBuilder phoneNumber(@NonNull String phoneNumber) {
         if (phoneNumber == null) {
            throw new NullPointerException("phoneNumber is marked non-null but is null");
         } else {
            this.phoneNumber = phoneNumber;
            return this;
         }
      }

      @JsonProperty("first_name")
      public InlineQueryResultContact.InlineQueryResultContactBuilder firstName(@NonNull String firstName) {
         if (firstName == null) {
            throw new NullPointerException("firstName is marked non-null but is null");
         } else {
            this.firstName = firstName;
            return this;
         }
      }

      @JsonProperty("last_name")
      public InlineQueryResultContact.InlineQueryResultContactBuilder lastName(String lastName) {
         this.lastName = lastName;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultContact.InlineQueryResultContactBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultContact.InlineQueryResultContactBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("thumb_url")
      public InlineQueryResultContact.InlineQueryResultContactBuilder thumbUrl(String thumbUrl) {
         this.thumbUrl = thumbUrl;
         return this;
      }

      @JsonProperty("thumb_width")
      public InlineQueryResultContact.InlineQueryResultContactBuilder thumbWidth(Integer thumbWidth) {
         this.thumbWidth = thumbWidth;
         return this;
      }

      @JsonProperty("thumb_height")
      public InlineQueryResultContact.InlineQueryResultContactBuilder thumbHeight(Integer thumbHeight) {
         this.thumbHeight = thumbHeight;
         return this;
      }

      @JsonProperty("vcard")
      public InlineQueryResultContact.InlineQueryResultContactBuilder vCard(String vCard) {
         this.vCard = vCard;
         return this;
      }

      public InlineQueryResultContact build() {
         return new InlineQueryResultContact(this.id, this.phoneNumber, this.firstName, this.lastName, this.replyMarkup, this.inputMessageContent, this.thumbUrl, this.thumbWidth, this.thumbHeight, this.vCard);
      }

      public String toString() {
         return "InlineQueryResultContact.InlineQueryResultContactBuilder(id=" + this.id + ", phoneNumber=" + this.phoneNumber + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", replyMarkup=" + this.replyMarkup + ", inputMessageContent=" + this.inputMessageContent + ", thumbUrl=" + this.thumbUrl + ", thumbWidth=" + this.thumbWidth + ", thumbHeight=" + this.thumbHeight + ", vCard=" + this.vCard + ")";
      }
   }
}
