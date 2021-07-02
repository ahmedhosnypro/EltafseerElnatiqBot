package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Strings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.payments.LabeledPrice;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendInvoice extends BotApiMethod<Message> {
   public static final String PATH = "sendinvoice";
   private static final String CHATID_FIELD = "chat_id";
   private static final String TITLE_FIELD = "title";
   private static final String DESCRIPTION_FIELD = "description";
   private static final String PAYLOAD_FIELD = "payload";
   private static final String PROVIDER_TOKEN_FIELD = "provider_token";
   private static final String START_PARAMETER_FIELD = "start_parameter";
   private static final String CURRENCY_FIELD = "currency";
   private static final String PRICES_FIELD = "prices";
   private static final String PHOTO_URL_FIELD = "photo_url";
   private static final String PHOTO_SIZE_FIELD = "photo_size";
   private static final String PHOTO_WIDTH_FIELD = "photo_width";
   private static final String PHOTO_HEIGHT_FIELD = "photo_height";
   private static final String NEED_NAME_FIELD = "need_name";
   private static final String NEED_PHONE_NUMBER_FIELD = "need_phone_number";
   private static final String NEED_EMAIL_FIELD = "need_email";
   private static final String NEED_SHIPPING_ADDRESS_FIELD = "need_shipping_address";
   private static final String SEND_PHONE_NUMBER_TO_PROVIDER_FIELD = "send_phone_number_to_provider";
   private static final String SEND_EMAIL_TO_PROVIDER_FIELD = "send_email_to_provider";
   private static final String IS_FLEXIBLE_FIELD = "is_flexible";
   private static final String DISABLE_NOTIFICATION_FIELD = "disable_notification";
   private static final String REPLY_TO_MESSAGE_ID_FIELD = "reply_to_message_id";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String PROVIDER_DATA_FIELD = "provider_data";
   private static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   private static final String MAXTIPAMOUNT_FIELD = "max_tip_amount";
   private static final String SUGGESTEDTIPAMOUNTS_FIELD = "suggested_tip_amounts";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("title")
   @NonNull
   private String title;
   @JsonProperty("description")
   @NonNull
   private String description;
   @JsonProperty("payload")
   @NonNull
   private String payload;
   @JsonProperty("provider_token")
   @NonNull
   private String providerToken;
   @JsonProperty("start_parameter")
   @NonNull
   private String startParameter;
   @JsonProperty("currency")
   @NonNull
   private String currency;
   @JsonProperty("prices")
   @NonNull
   private List<LabeledPrice> prices;
   @JsonProperty("photo_url")
   private String photoUrl;
   @JsonProperty("photo_size")
   private Integer photoSize;
   @JsonProperty("photo_width")
   private Integer photoWidth;
   @JsonProperty("photo_height")
   private Integer photoHeight;
   @JsonProperty("need_name")
   private Boolean needName;
   @JsonProperty("need_phone_number")
   private Boolean needPhoneNumber;
   @JsonProperty("need_email")
   private Boolean needEmail;
   @JsonProperty("need_shipping_address")
   private Boolean needShippingAddress;
   @JsonProperty("is_flexible")
   private Boolean isFlexible;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;
   @JsonProperty("reply_to_message_id")
   private Integer replyToMessageId;
   @JsonProperty("send_phone_number_to_provider")
   private Boolean sendPhoneNumberToProvider;
   @JsonProperty("send_email_to_provider")
   private Boolean sendEmailToProvider;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("provider_data")
   private String providerData;
   @JsonProperty("allow_sending_without_reply")
   private Boolean allowSendingWithoutReply;
   @JsonProperty("max_tip_amount")
   private Integer maxTipAmount;
   @JsonProperty("suggested_tip_amounts")
   private List<Integer> suggestedTipAmounts;

   public String getMethod() {
      return "sendinvoice";
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending invoice", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (Strings.isNullOrEmpty(this.chatId)) {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      } else if (Strings.isNullOrEmpty(this.title)) {
         throw new TelegramApiValidationException("Title parameter can't be empty", this);
      } else if (Strings.isNullOrEmpty(this.description)) {
         throw new TelegramApiValidationException("Description parameter can't be empty", this);
      } else if (Strings.isNullOrEmpty(this.payload)) {
         throw new TelegramApiValidationException("Payload parameter can't be empty", this);
      } else if (Strings.isNullOrEmpty(this.providerToken)) {
         throw new TelegramApiValidationException("ProviderToken parameter can't be empty", this);
      } else if (Strings.isNullOrEmpty(this.startParameter)) {
         throw new TelegramApiValidationException("StartParameter parameter can't be empty", this);
      } else if (Strings.isNullOrEmpty(this.currency)) {
         throw new TelegramApiValidationException("Currency parameter can't be empty", this);
      } else if (this.prices != null && !this.prices.isEmpty()) {
         Iterator var1 = this.prices.iterator();

         while(var1.hasNext()) {
            LabeledPrice price = (LabeledPrice)var1.next();
            price.validate();
         }

         if (this.suggestedTipAmounts != null && !this.suggestedTipAmounts.isEmpty() && this.suggestedTipAmounts.size() > 4) {
            throw new TelegramApiValidationException("No more that 4 suggested tips allowed", this);
         } else {
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("Prices parameter can't be empty", this);
      }
   }

   public static SendInvoice.SendInvoiceBuilder builder() {
      return new SendInvoice.SendInvoiceBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendInvoice)) {
         return false;
      } else {
         SendInvoice other = (SendInvoice)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$photoSize = this.getPhotoSize();
            Object other$photoSize = other.getPhotoSize();
            if (this$photoSize == null) {
               if (other$photoSize != null) {
                  return false;
               }
            } else if (!this$photoSize.equals(other$photoSize)) {
               return false;
            }

            Object this$photoWidth = this.getPhotoWidth();
            Object other$photoWidth = other.getPhotoWidth();
            if (this$photoWidth == null) {
               if (other$photoWidth != null) {
                  return false;
               }
            } else if (!this$photoWidth.equals(other$photoWidth)) {
               return false;
            }

            Object this$photoHeight = this.getPhotoHeight();
            Object other$photoHeight = other.getPhotoHeight();
            if (this$photoHeight == null) {
               if (other$photoHeight != null) {
                  return false;
               }
            } else if (!this$photoHeight.equals(other$photoHeight)) {
               return false;
            }

            label302: {
               Object this$needName = this.getNeedName();
               Object other$needName = other.getNeedName();
               if (this$needName == null) {
                  if (other$needName == null) {
                     break label302;
                  }
               } else if (this$needName.equals(other$needName)) {
                  break label302;
               }

               return false;
            }

            label295: {
               Object this$needPhoneNumber = this.getNeedPhoneNumber();
               Object other$needPhoneNumber = other.getNeedPhoneNumber();
               if (this$needPhoneNumber == null) {
                  if (other$needPhoneNumber == null) {
                     break label295;
                  }
               } else if (this$needPhoneNumber.equals(other$needPhoneNumber)) {
                  break label295;
               }

               return false;
            }

            Object this$needEmail = this.getNeedEmail();
            Object other$needEmail = other.getNeedEmail();
            if (this$needEmail == null) {
               if (other$needEmail != null) {
                  return false;
               }
            } else if (!this$needEmail.equals(other$needEmail)) {
               return false;
            }

            label281: {
               Object this$needShippingAddress = this.getNeedShippingAddress();
               Object other$needShippingAddress = other.getNeedShippingAddress();
               if (this$needShippingAddress == null) {
                  if (other$needShippingAddress == null) {
                     break label281;
                  }
               } else if (this$needShippingAddress.equals(other$needShippingAddress)) {
                  break label281;
               }

               return false;
            }

            label274: {
               Object this$isFlexible = this.getIsFlexible();
               Object other$isFlexible = other.getIsFlexible();
               if (this$isFlexible == null) {
                  if (other$isFlexible == null) {
                     break label274;
                  }
               } else if (this$isFlexible.equals(other$isFlexible)) {
                  break label274;
               }

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

            Object this$replyToMessageId = this.getReplyToMessageId();
            Object other$replyToMessageId = other.getReplyToMessageId();
            if (this$replyToMessageId == null) {
               if (other$replyToMessageId != null) {
                  return false;
               }
            } else if (!this$replyToMessageId.equals(other$replyToMessageId)) {
               return false;
            }

            label253: {
               Object this$sendPhoneNumberToProvider = this.getSendPhoneNumberToProvider();
               Object other$sendPhoneNumberToProvider = other.getSendPhoneNumberToProvider();
               if (this$sendPhoneNumberToProvider == null) {
                  if (other$sendPhoneNumberToProvider == null) {
                     break label253;
                  }
               } else if (this$sendPhoneNumberToProvider.equals(other$sendPhoneNumberToProvider)) {
                  break label253;
               }

               return false;
            }

            label246: {
               Object this$sendEmailToProvider = this.getSendEmailToProvider();
               Object other$sendEmailToProvider = other.getSendEmailToProvider();
               if (this$sendEmailToProvider == null) {
                  if (other$sendEmailToProvider == null) {
                     break label246;
                  }
               } else if (this$sendEmailToProvider.equals(other$sendEmailToProvider)) {
                  break label246;
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

            label232: {
               Object this$maxTipAmount = this.getMaxTipAmount();
               Object other$maxTipAmount = other.getMaxTipAmount();
               if (this$maxTipAmount == null) {
                  if (other$maxTipAmount == null) {
                     break label232;
                  }
               } else if (this$maxTipAmount.equals(other$maxTipAmount)) {
                  break label232;
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

            label218: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label218;
                  }
               } else if (this$title.equals(other$title)) {
                  break label218;
               }

               return false;
            }

            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
               if (other$description != null) {
                  return false;
               }
            } else if (!this$description.equals(other$description)) {
               return false;
            }

            Object this$payload = this.getPayload();
            Object other$payload = other.getPayload();
            if (this$payload == null) {
               if (other$payload != null) {
                  return false;
               }
            } else if (!this$payload.equals(other$payload)) {
               return false;
            }

            Object this$providerToken = this.getProviderToken();
            Object other$providerToken = other.getProviderToken();
            if (this$providerToken == null) {
               if (other$providerToken != null) {
                  return false;
               }
            } else if (!this$providerToken.equals(other$providerToken)) {
               return false;
            }

            label190: {
               Object this$startParameter = this.getStartParameter();
               Object other$startParameter = other.getStartParameter();
               if (this$startParameter == null) {
                  if (other$startParameter == null) {
                     break label190;
                  }
               } else if (this$startParameter.equals(other$startParameter)) {
                  break label190;
               }

               return false;
            }

            label183: {
               Object this$currency = this.getCurrency();
               Object other$currency = other.getCurrency();
               if (this$currency == null) {
                  if (other$currency == null) {
                     break label183;
                  }
               } else if (this$currency.equals(other$currency)) {
                  break label183;
               }

               return false;
            }

            Object this$prices = this.getPrices();
            Object other$prices = other.getPrices();
            if (this$prices == null) {
               if (other$prices != null) {
                  return false;
               }
            } else if (!this$prices.equals(other$prices)) {
               return false;
            }

            label169: {
               Object this$photoUrl = this.getPhotoUrl();
               Object other$photoUrl = other.getPhotoUrl();
               if (this$photoUrl == null) {
                  if (other$photoUrl == null) {
                     break label169;
                  }
               } else if (this$photoUrl.equals(other$photoUrl)) {
                  break label169;
               }

               return false;
            }

            label162: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label162;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label162;
               }

               return false;
            }

            Object this$providerData = this.getProviderData();
            Object other$providerData = other.getProviderData();
            if (this$providerData == null) {
               if (other$providerData != null) {
                  return false;
               }
            } else if (!this$providerData.equals(other$providerData)) {
               return false;
            }

            Object this$suggestedTipAmounts = this.getSuggestedTipAmounts();
            Object other$suggestedTipAmounts = other.getSuggestedTipAmounts();
            if (this$suggestedTipAmounts == null) {
               if (other$suggestedTipAmounts != null) {
                  return false;
               }
            } else if (!this$suggestedTipAmounts.equals(other$suggestedTipAmounts)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SendInvoice;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $photoSize = this.getPhotoSize();
      int result = result * 59 + ($photoSize == null ? 43 : $photoSize.hashCode());
      Object $photoWidth = this.getPhotoWidth();
      result = result * 59 + ($photoWidth == null ? 43 : $photoWidth.hashCode());
      Object $photoHeight = this.getPhotoHeight();
      result = result * 59 + ($photoHeight == null ? 43 : $photoHeight.hashCode());
      Object $needName = this.getNeedName();
      result = result * 59 + ($needName == null ? 43 : $needName.hashCode());
      Object $needPhoneNumber = this.getNeedPhoneNumber();
      result = result * 59 + ($needPhoneNumber == null ? 43 : $needPhoneNumber.hashCode());
      Object $needEmail = this.getNeedEmail();
      result = result * 59 + ($needEmail == null ? 43 : $needEmail.hashCode());
      Object $needShippingAddress = this.getNeedShippingAddress();
      result = result * 59 + ($needShippingAddress == null ? 43 : $needShippingAddress.hashCode());
      Object $isFlexible = this.getIsFlexible();
      result = result * 59 + ($isFlexible == null ? 43 : $isFlexible.hashCode());
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $sendPhoneNumberToProvider = this.getSendPhoneNumberToProvider();
      result = result * 59 + ($sendPhoneNumberToProvider == null ? 43 : $sendPhoneNumberToProvider.hashCode());
      Object $sendEmailToProvider = this.getSendEmailToProvider();
      result = result * 59 + ($sendEmailToProvider == null ? 43 : $sendEmailToProvider.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $maxTipAmount = this.getMaxTipAmount();
      result = result * 59 + ($maxTipAmount == null ? 43 : $maxTipAmount.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $payload = this.getPayload();
      result = result * 59 + ($payload == null ? 43 : $payload.hashCode());
      Object $providerToken = this.getProviderToken();
      result = result * 59 + ($providerToken == null ? 43 : $providerToken.hashCode());
      Object $startParameter = this.getStartParameter();
      result = result * 59 + ($startParameter == null ? 43 : $startParameter.hashCode());
      Object $currency = this.getCurrency();
      result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
      Object $prices = this.getPrices();
      result = result * 59 + ($prices == null ? 43 : $prices.hashCode());
      Object $photoUrl = this.getPhotoUrl();
      result = result * 59 + ($photoUrl == null ? 43 : $photoUrl.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $providerData = this.getProviderData();
      result = result * 59 + ($providerData == null ? 43 : $providerData.hashCode());
      Object $suggestedTipAmounts = this.getSuggestedTipAmounts();
      result = result * 59 + ($suggestedTipAmounts == null ? 43 : $suggestedTipAmounts.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public String getTitle() {
      return this.title;
   }

   @NonNull
   public String getDescription() {
      return this.description;
   }

   @NonNull
   public String getPayload() {
      return this.payload;
   }

   @NonNull
   public String getProviderToken() {
      return this.providerToken;
   }

   @NonNull
   public String getStartParameter() {
      return this.startParameter;
   }

   @NonNull
   public String getCurrency() {
      return this.currency;
   }

   @NonNull
   public List<LabeledPrice> getPrices() {
      return this.prices;
   }

   public String getPhotoUrl() {
      return this.photoUrl;
   }

   public Integer getPhotoSize() {
      return this.photoSize;
   }

   public Integer getPhotoWidth() {
      return this.photoWidth;
   }

   public Integer getPhotoHeight() {
      return this.photoHeight;
   }

   public Boolean getNeedName() {
      return this.needName;
   }

   public Boolean getNeedPhoneNumber() {
      return this.needPhoneNumber;
   }

   public Boolean getNeedEmail() {
      return this.needEmail;
   }

   public Boolean getNeedShippingAddress() {
      return this.needShippingAddress;
   }

   public Boolean getIsFlexible() {
      return this.isFlexible;
   }

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public Boolean getSendPhoneNumberToProvider() {
      return this.sendPhoneNumberToProvider;
   }

   public Boolean getSendEmailToProvider() {
      return this.sendEmailToProvider;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
   }

   public String getProviderData() {
      return this.providerData;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
   }

   public Integer getMaxTipAmount() {
      return this.maxTipAmount;
   }

   public List<Integer> getSuggestedTipAmounts() {
      return this.suggestedTipAmounts;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
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

   @JsonProperty("description")
   public void setDescription(@NonNull String description) {
      if (description == null) {
         throw new NullPointerException("description is marked non-null but is null");
      } else {
         this.description = description;
      }
   }

   @JsonProperty("payload")
   public void setPayload(@NonNull String payload) {
      if (payload == null) {
         throw new NullPointerException("payload is marked non-null but is null");
      } else {
         this.payload = payload;
      }
   }

   @JsonProperty("provider_token")
   public void setProviderToken(@NonNull String providerToken) {
      if (providerToken == null) {
         throw new NullPointerException("providerToken is marked non-null but is null");
      } else {
         this.providerToken = providerToken;
      }
   }

   @JsonProperty("start_parameter")
   public void setStartParameter(@NonNull String startParameter) {
      if (startParameter == null) {
         throw new NullPointerException("startParameter is marked non-null but is null");
      } else {
         this.startParameter = startParameter;
      }
   }

   @JsonProperty("currency")
   public void setCurrency(@NonNull String currency) {
      if (currency == null) {
         throw new NullPointerException("currency is marked non-null but is null");
      } else {
         this.currency = currency;
      }
   }

   @JsonProperty("prices")
   public void setPrices(@NonNull List<LabeledPrice> prices) {
      if (prices == null) {
         throw new NullPointerException("prices is marked non-null but is null");
      } else {
         this.prices = prices;
      }
   }

   @JsonProperty("photo_url")
   public void setPhotoUrl(String photoUrl) {
      this.photoUrl = photoUrl;
   }

   @JsonProperty("photo_size")
   public void setPhotoSize(Integer photoSize) {
      this.photoSize = photoSize;
   }

   @JsonProperty("photo_width")
   public void setPhotoWidth(Integer photoWidth) {
      this.photoWidth = photoWidth;
   }

   @JsonProperty("photo_height")
   public void setPhotoHeight(Integer photoHeight) {
      this.photoHeight = photoHeight;
   }

   @JsonProperty("need_name")
   public void setNeedName(Boolean needName) {
      this.needName = needName;
   }

   @JsonProperty("need_phone_number")
   public void setNeedPhoneNumber(Boolean needPhoneNumber) {
      this.needPhoneNumber = needPhoneNumber;
   }

   @JsonProperty("need_email")
   public void setNeedEmail(Boolean needEmail) {
      this.needEmail = needEmail;
   }

   @JsonProperty("need_shipping_address")
   public void setNeedShippingAddress(Boolean needShippingAddress) {
      this.needShippingAddress = needShippingAddress;
   }

   @JsonProperty("is_flexible")
   public void setIsFlexible(Boolean isFlexible) {
      this.isFlexible = isFlexible;
   }

   @JsonProperty("disable_notification")
   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   @JsonProperty("reply_to_message_id")
   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   @JsonProperty("send_phone_number_to_provider")
   public void setSendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
      this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
   }

   @JsonProperty("send_email_to_provider")
   public void setSendEmailToProvider(Boolean sendEmailToProvider) {
      this.sendEmailToProvider = sendEmailToProvider;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("provider_data")
   public void setProviderData(String providerData) {
      this.providerData = providerData;
   }

   @JsonProperty("allow_sending_without_reply")
   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   @JsonProperty("max_tip_amount")
   public void setMaxTipAmount(Integer maxTipAmount) {
      this.maxTipAmount = maxTipAmount;
   }

   @JsonProperty("suggested_tip_amounts")
   public void setSuggestedTipAmounts(List<Integer> suggestedTipAmounts) {
      this.suggestedTipAmounts = suggestedTipAmounts;
   }

   public String toString() {
      return "SendInvoice(chatId=" + this.getChatId() + ", title=" + this.getTitle() + ", description=" + this.getDescription() + ", payload=" + this.getPayload() + ", providerToken=" + this.getProviderToken() + ", startParameter=" + this.getStartParameter() + ", currency=" + this.getCurrency() + ", prices=" + this.getPrices() + ", photoUrl=" + this.getPhotoUrl() + ", photoSize=" + this.getPhotoSize() + ", photoWidth=" + this.getPhotoWidth() + ", photoHeight=" + this.getPhotoHeight() + ", needName=" + this.getNeedName() + ", needPhoneNumber=" + this.getNeedPhoneNumber() + ", needEmail=" + this.getNeedEmail() + ", needShippingAddress=" + this.getNeedShippingAddress() + ", isFlexible=" + this.getIsFlexible() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", sendPhoneNumberToProvider=" + this.getSendPhoneNumberToProvider() + ", sendEmailToProvider=" + this.getSendEmailToProvider() + ", replyMarkup=" + this.getReplyMarkup() + ", providerData=" + this.getProviderData() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ", maxTipAmount=" + this.getMaxTipAmount() + ", suggestedTipAmounts=" + this.getSuggestedTipAmounts() + ")";
   }

   public SendInvoice(@NonNull String chatId, @NonNull String title, @NonNull String description, @NonNull String payload, @NonNull String providerToken, @NonNull String startParameter, @NonNull String currency, @NonNull List<LabeledPrice> prices) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (description == null) {
         throw new NullPointerException("description is marked non-null but is null");
      } else if (payload == null) {
         throw new NullPointerException("payload is marked non-null but is null");
      } else if (providerToken == null) {
         throw new NullPointerException("providerToken is marked non-null but is null");
      } else if (startParameter == null) {
         throw new NullPointerException("startParameter is marked non-null but is null");
      } else if (currency == null) {
         throw new NullPointerException("currency is marked non-null but is null");
      } else if (prices == null) {
         throw new NullPointerException("prices is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.title = title;
         this.description = description;
         this.payload = payload;
         this.providerToken = providerToken;
         this.startParameter = startParameter;
         this.currency = currency;
         this.prices = prices;
      }
   }

   public SendInvoice() {
   }

   public SendInvoice(@NonNull String chatId, @NonNull String title, @NonNull String description, @NonNull String payload, @NonNull String providerToken, @NonNull String startParameter, @NonNull String currency, @NonNull List<LabeledPrice> prices, String photoUrl, Integer photoSize, Integer photoWidth, Integer photoHeight, Boolean needName, Boolean needPhoneNumber, Boolean needEmail, Boolean needShippingAddress, Boolean isFlexible, Boolean disableNotification, Integer replyToMessageId, Boolean sendPhoneNumberToProvider, Boolean sendEmailToProvider, InlineKeyboardMarkup replyMarkup, String providerData, Boolean allowSendingWithoutReply, Integer maxTipAmount, List<Integer> suggestedTipAmounts) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (description == null) {
         throw new NullPointerException("description is marked non-null but is null");
      } else if (payload == null) {
         throw new NullPointerException("payload is marked non-null but is null");
      } else if (providerToken == null) {
         throw new NullPointerException("providerToken is marked non-null but is null");
      } else if (startParameter == null) {
         throw new NullPointerException("startParameter is marked non-null but is null");
      } else if (currency == null) {
         throw new NullPointerException("currency is marked non-null but is null");
      } else if (prices == null) {
         throw new NullPointerException("prices is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.title = title;
         this.description = description;
         this.payload = payload;
         this.providerToken = providerToken;
         this.startParameter = startParameter;
         this.currency = currency;
         this.prices = prices;
         this.photoUrl = photoUrl;
         this.photoSize = photoSize;
         this.photoWidth = photoWidth;
         this.photoHeight = photoHeight;
         this.needName = needName;
         this.needPhoneNumber = needPhoneNumber;
         this.needEmail = needEmail;
         this.needShippingAddress = needShippingAddress;
         this.isFlexible = isFlexible;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
         this.sendEmailToProvider = sendEmailToProvider;
         this.replyMarkup = replyMarkup;
         this.providerData = providerData;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         this.maxTipAmount = maxTipAmount;
         this.suggestedTipAmounts = suggestedTipAmounts;
      }
   }

   public static class SendInvoiceBuilder {
      private String chatId;
      private String title;
      private String description;
      private String payload;
      private String providerToken;
      private String startParameter;
      private String currency;
      private ArrayList<LabeledPrice> prices;
      private String photoUrl;
      private Integer photoSize;
      private Integer photoWidth;
      private Integer photoHeight;
      private Boolean needName;
      private Boolean needPhoneNumber;
      private Boolean needEmail;
      private Boolean needShippingAddress;
      private Boolean isFlexible;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private Boolean sendPhoneNumberToProvider;
      private Boolean sendEmailToProvider;
      private InlineKeyboardMarkup replyMarkup;
      private String providerData;
      private Boolean allowSendingWithoutReply;
      private Integer maxTipAmount;
      private ArrayList<Integer> suggestedTipAmounts;

      SendInvoiceBuilder() {
      }

      @JsonProperty("chat_id")
      public SendInvoice.SendInvoiceBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("title")
      public SendInvoice.SendInvoiceBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      @JsonProperty("description")
      public SendInvoice.SendInvoiceBuilder description(@NonNull String description) {
         if (description == null) {
            throw new NullPointerException("description is marked non-null but is null");
         } else {
            this.description = description;
            return this;
         }
      }

      @JsonProperty("payload")
      public SendInvoice.SendInvoiceBuilder payload(@NonNull String payload) {
         if (payload == null) {
            throw new NullPointerException("payload is marked non-null but is null");
         } else {
            this.payload = payload;
            return this;
         }
      }

      @JsonProperty("provider_token")
      public SendInvoice.SendInvoiceBuilder providerToken(@NonNull String providerToken) {
         if (providerToken == null) {
            throw new NullPointerException("providerToken is marked non-null but is null");
         } else {
            this.providerToken = providerToken;
            return this;
         }
      }

      @JsonProperty("start_parameter")
      public SendInvoice.SendInvoiceBuilder startParameter(@NonNull String startParameter) {
         if (startParameter == null) {
            throw new NullPointerException("startParameter is marked non-null but is null");
         } else {
            this.startParameter = startParameter;
            return this;
         }
      }

      @JsonProperty("currency")
      public SendInvoice.SendInvoiceBuilder currency(@NonNull String currency) {
         if (currency == null) {
            throw new NullPointerException("currency is marked non-null but is null");
         } else {
            this.currency = currency;
            return this;
         }
      }

      public SendInvoice.SendInvoiceBuilder price(LabeledPrice price) {
         if (this.prices == null) {
            this.prices = new ArrayList();
         }

         this.prices.add(price);
         return this;
      }

      @JsonProperty("prices")
      public SendInvoice.SendInvoiceBuilder prices(Collection<? extends LabeledPrice> prices) {
         if (prices == null) {
            throw new NullPointerException("prices cannot be null");
         } else {
            if (this.prices == null) {
               this.prices = new ArrayList();
            }

            this.prices.addAll(prices);
            return this;
         }
      }

      public SendInvoice.SendInvoiceBuilder clearPrices() {
         if (this.prices != null) {
            this.prices.clear();
         }

         return this;
      }

      @JsonProperty("photo_url")
      public SendInvoice.SendInvoiceBuilder photoUrl(String photoUrl) {
         this.photoUrl = photoUrl;
         return this;
      }

      @JsonProperty("photo_size")
      public SendInvoice.SendInvoiceBuilder photoSize(Integer photoSize) {
         this.photoSize = photoSize;
         return this;
      }

      @JsonProperty("photo_width")
      public SendInvoice.SendInvoiceBuilder photoWidth(Integer photoWidth) {
         this.photoWidth = photoWidth;
         return this;
      }

      @JsonProperty("photo_height")
      public SendInvoice.SendInvoiceBuilder photoHeight(Integer photoHeight) {
         this.photoHeight = photoHeight;
         return this;
      }

      @JsonProperty("need_name")
      public SendInvoice.SendInvoiceBuilder needName(Boolean needName) {
         this.needName = needName;
         return this;
      }

      @JsonProperty("need_phone_number")
      public SendInvoice.SendInvoiceBuilder needPhoneNumber(Boolean needPhoneNumber) {
         this.needPhoneNumber = needPhoneNumber;
         return this;
      }

      @JsonProperty("need_email")
      public SendInvoice.SendInvoiceBuilder needEmail(Boolean needEmail) {
         this.needEmail = needEmail;
         return this;
      }

      @JsonProperty("need_shipping_address")
      public SendInvoice.SendInvoiceBuilder needShippingAddress(Boolean needShippingAddress) {
         this.needShippingAddress = needShippingAddress;
         return this;
      }

      @JsonProperty("is_flexible")
      public SendInvoice.SendInvoiceBuilder isFlexible(Boolean isFlexible) {
         this.isFlexible = isFlexible;
         return this;
      }

      @JsonProperty("disable_notification")
      public SendInvoice.SendInvoiceBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      @JsonProperty("reply_to_message_id")
      public SendInvoice.SendInvoiceBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      @JsonProperty("send_phone_number_to_provider")
      public SendInvoice.SendInvoiceBuilder sendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
         this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
         return this;
      }

      @JsonProperty("send_email_to_provider")
      public SendInvoice.SendInvoiceBuilder sendEmailToProvider(Boolean sendEmailToProvider) {
         this.sendEmailToProvider = sendEmailToProvider;
         return this;
      }

      @JsonProperty("reply_markup")
      public SendInvoice.SendInvoiceBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("provider_data")
      public SendInvoice.SendInvoiceBuilder providerData(String providerData) {
         this.providerData = providerData;
         return this;
      }

      @JsonProperty("allow_sending_without_reply")
      public SendInvoice.SendInvoiceBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      @JsonProperty("max_tip_amount")
      public SendInvoice.SendInvoiceBuilder maxTipAmount(Integer maxTipAmount) {
         this.maxTipAmount = maxTipAmount;
         return this;
      }

      public SendInvoice.SendInvoiceBuilder suggestedTipAmount(Integer suggestedTipAmount) {
         if (this.suggestedTipAmounts == null) {
            this.suggestedTipAmounts = new ArrayList();
         }

         this.suggestedTipAmounts.add(suggestedTipAmount);
         return this;
      }

      @JsonProperty("suggested_tip_amounts")
      public SendInvoice.SendInvoiceBuilder suggestedTipAmounts(Collection<? extends Integer> suggestedTipAmounts) {
         if (suggestedTipAmounts == null) {
            throw new NullPointerException("suggestedTipAmounts cannot be null");
         } else {
            if (this.suggestedTipAmounts == null) {
               this.suggestedTipAmounts = new ArrayList();
            }

            this.suggestedTipAmounts.addAll(suggestedTipAmounts);
            return this;
         }
      }

      public SendInvoice.SendInvoiceBuilder clearSuggestedTipAmounts() {
         if (this.suggestedTipAmounts != null) {
            this.suggestedTipAmounts.clear();
         }

         return this;
      }

      public SendInvoice build() {
         List prices;
         switch(this.prices == null ? 0 : this.prices.size()) {
         case 0:
            prices = Collections.emptyList();
            break;
         case 1:
            prices = Collections.singletonList((LabeledPrice)this.prices.get(0));
            break;
         default:
            prices = Collections.unmodifiableList(new ArrayList(this.prices));
         }

         List suggestedTipAmounts;
         switch(this.suggestedTipAmounts == null ? 0 : this.suggestedTipAmounts.size()) {
         case 0:
            suggestedTipAmounts = Collections.emptyList();
            break;
         case 1:
            suggestedTipAmounts = Collections.singletonList((Integer)this.suggestedTipAmounts.get(0));
            break;
         default:
            suggestedTipAmounts = Collections.unmodifiableList(new ArrayList(this.suggestedTipAmounts));
         }

         return new SendInvoice(this.chatId, this.title, this.description, this.payload, this.providerToken, this.startParameter, this.currency, prices, this.photoUrl, this.photoSize, this.photoWidth, this.photoHeight, this.needName, this.needPhoneNumber, this.needEmail, this.needShippingAddress, this.isFlexible, this.disableNotification, this.replyToMessageId, this.sendPhoneNumberToProvider, this.sendEmailToProvider, this.replyMarkup, this.providerData, this.allowSendingWithoutReply, this.maxTipAmount, suggestedTipAmounts);
      }

      public String toString() {
         return "SendInvoice.SendInvoiceBuilder(chatId=" + this.chatId + ", title=" + this.title + ", description=" + this.description + ", payload=" + this.payload + ", providerToken=" + this.providerToken + ", startParameter=" + this.startParameter + ", currency=" + this.currency + ", prices=" + this.prices + ", photoUrl=" + this.photoUrl + ", photoSize=" + this.photoSize + ", photoWidth=" + this.photoWidth + ", photoHeight=" + this.photoHeight + ", needName=" + this.needName + ", needPhoneNumber=" + this.needPhoneNumber + ", needEmail=" + this.needEmail + ", needShippingAddress=" + this.needShippingAddress + ", isFlexible=" + this.isFlexible + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", sendPhoneNumberToProvider=" + this.sendPhoneNumberToProvider + ", sendEmailToProvider=" + this.sendEmailToProvider + ", replyMarkup=" + this.replyMarkup + ", providerData=" + this.providerData + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ", maxTipAmount=" + this.maxTipAmount + ", suggestedTipAmounts=" + this.suggestedTipAmounts + ")";
      }
   }
}
