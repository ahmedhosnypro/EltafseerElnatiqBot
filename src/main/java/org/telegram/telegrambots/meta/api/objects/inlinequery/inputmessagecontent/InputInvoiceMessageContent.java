package org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.payments.LabeledPrice;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InputInvoiceMessageContent implements InputMessageContent {
   private static final String TITLE_FIELD = "title";
   private static final String DESCRIPTION_FIELD = "description";
   private static final String PAYLOAD_FIELD = "payload";
   private static final String PROVIDERTOKEN_FIELD = "provider_token";
   private static final String CURRENCY_FIELD = "currency";
   private static final String PRICES_FIELD = "prices";
   private static final String MAXTIPAMOUNT_FIELD = "max_tip_amount";
   private static final String SUGGESTEDTIPAMOUNTS_FIELD = "suggested_tip_amounts";
   private static final String PROVIDERDATA_FIELD = "provider_data";
   private static final String PHOTOURL_FIELD = "photo_url";
   private static final String PHOTOSIZE_FIELD = "photo_size";
   private static final String PHOTOWIDTH_FIELD = "photo_width";
   private static final String PHOTOHEIGHT_FIELD = "photo_height";
   private static final String NEEDNAME_FIELD = "need_name";
   private static final String NEEDPHONENUMBER_FIELD = "need_phone_number";
   private static final String NEEDEMAIL_FIELD = "need_email";
   private static final String NEEDSHIPPINGADDRESS_FIELD = "need_shipping_address";
   private static final String SENDPHONENUMBERTOPROVIDER_FIELD = "send_phone_number_to_provider";
   private static final String SENDEMAILTOPROVIDER_FIELD = "send_email_to_provider";
   private static final String ISFLEXIBLE_FIELD = "is_flexible";
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
   @JsonProperty("currency")
   @NonNull
   private String currency;
   @JsonProperty("prices")
   @NonNull
   private List<LabeledPrice> prices;
   @JsonProperty("max_tip_amount")
   private Integer maxTipAmount;
   @JsonProperty("suggested_tip_amounts")
   private List<Integer> suggestedTipAmounts;
   @JsonProperty("provider_data")
   private String providerData;
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
   @JsonProperty("send_phone_number_to_provider")
   private Boolean sendPhoneNumberToProvider;
   @JsonProperty("send_email_to_provider")
   private Boolean sendEmailToProvider;
   @JsonProperty("is_flexible")
   private Boolean isFlexible;

   public void validate() throws TelegramApiValidationException {
      if (!Strings.isNullOrEmpty(this.title) && this.title.length() <= 32) {
         if (!Strings.isNullOrEmpty(this.description) && this.description.length() <= 32) {
            if (!Strings.isNullOrEmpty(this.payload) && this.payload.length() <= 32) {
               if (Strings.isNullOrEmpty(this.providerToken)) {
                  throw new TelegramApiValidationException("ProviderToken parameter must not be empty", this);
               } else if (Strings.isNullOrEmpty(this.currency)) {
                  throw new TelegramApiValidationException("Currency parameter must not be empty", this);
               } else if (this.prices != null && !this.prices.isEmpty()) {
                  Iterator var1 = this.prices.iterator();

                  while(var1.hasNext()) {
                     LabeledPrice price = (LabeledPrice)var1.next();
                     price.validate();
                  }

                  if (this.suggestedTipAmounts != null && !this.suggestedTipAmounts.isEmpty() && this.suggestedTipAmounts.size() > 4) {
                     throw new TelegramApiValidationException("Only up to 4 suggested tip amounts are allowed", this);
                  }
               } else {
                  throw new TelegramApiValidationException("Prices parameter must not be empty", this);
               }
            } else {
               throw new TelegramApiValidationException("Payload parameter must be between 1 and 128 characters", this);
            }
         } else {
            throw new TelegramApiValidationException("Description parameter must be between 1 and 255 characters", this);
         }
      } else {
         throw new TelegramApiValidationException("Title parameter must be between 1 and 32 characters", this);
      }
   }

   public static InputInvoiceMessageContent.InputInvoiceMessageContentBuilder builder() {
      return new InputInvoiceMessageContent.InputInvoiceMessageContentBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputInvoiceMessageContent)) {
         return false;
      } else {
         InputInvoiceMessageContent other = (InputInvoiceMessageContent)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label251: {
               Object this$maxTipAmount = this.getMaxTipAmount();
               Object other$maxTipAmount = other.getMaxTipAmount();
               if (this$maxTipAmount == null) {
                  if (other$maxTipAmount == null) {
                     break label251;
                  }
               } else if (this$maxTipAmount.equals(other$maxTipAmount)) {
                  break label251;
               }

               return false;
            }

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

            label230: {
               Object this$photoHeight = this.getPhotoHeight();
               Object other$photoHeight = other.getPhotoHeight();
               if (this$photoHeight == null) {
                  if (other$photoHeight == null) {
                     break label230;
                  }
               } else if (this$photoHeight.equals(other$photoHeight)) {
                  break label230;
               }

               return false;
            }

            label223: {
               Object this$needName = this.getNeedName();
               Object other$needName = other.getNeedName();
               if (this$needName == null) {
                  if (other$needName == null) {
                     break label223;
                  }
               } else if (this$needName.equals(other$needName)) {
                  break label223;
               }

               return false;
            }

            label216: {
               Object this$needPhoneNumber = this.getNeedPhoneNumber();
               Object other$needPhoneNumber = other.getNeedPhoneNumber();
               if (this$needPhoneNumber == null) {
                  if (other$needPhoneNumber == null) {
                     break label216;
                  }
               } else if (this$needPhoneNumber.equals(other$needPhoneNumber)) {
                  break label216;
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

            label202: {
               Object this$needShippingAddress = this.getNeedShippingAddress();
               Object other$needShippingAddress = other.getNeedShippingAddress();
               if (this$needShippingAddress == null) {
                  if (other$needShippingAddress == null) {
                     break label202;
                  }
               } else if (this$needShippingAddress.equals(other$needShippingAddress)) {
                  break label202;
               }

               return false;
            }

            Object this$sendPhoneNumberToProvider = this.getSendPhoneNumberToProvider();
            Object other$sendPhoneNumberToProvider = other.getSendPhoneNumberToProvider();
            if (this$sendPhoneNumberToProvider == null) {
               if (other$sendPhoneNumberToProvider != null) {
                  return false;
               }
            } else if (!this$sendPhoneNumberToProvider.equals(other$sendPhoneNumberToProvider)) {
               return false;
            }

            label188: {
               Object this$sendEmailToProvider = this.getSendEmailToProvider();
               Object other$sendEmailToProvider = other.getSendEmailToProvider();
               if (this$sendEmailToProvider == null) {
                  if (other$sendEmailToProvider == null) {
                     break label188;
                  }
               } else if (this$sendEmailToProvider.equals(other$sendEmailToProvider)) {
                  break label188;
               }

               return false;
            }

            Object this$isFlexible = this.getIsFlexible();
            Object other$isFlexible = other.getIsFlexible();
            if (this$isFlexible == null) {
               if (other$isFlexible != null) {
                  return false;
               }
            } else if (!this$isFlexible.equals(other$isFlexible)) {
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

            label167: {
               Object this$description = this.getDescription();
               Object other$description = other.getDescription();
               if (this$description == null) {
                  if (other$description == null) {
                     break label167;
                  }
               } else if (this$description.equals(other$description)) {
                  break label167;
               }

               return false;
            }

            label160: {
               Object this$payload = this.getPayload();
               Object other$payload = other.getPayload();
               if (this$payload == null) {
                  if (other$payload == null) {
                     break label160;
                  }
               } else if (this$payload.equals(other$payload)) {
                  break label160;
               }

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

            Object this$currency = this.getCurrency();
            Object other$currency = other.getCurrency();
            if (this$currency == null) {
               if (other$currency != null) {
                  return false;
               }
            } else if (!this$currency.equals(other$currency)) {
               return false;
            }

            label139: {
               Object this$prices = this.getPrices();
               Object other$prices = other.getPrices();
               if (this$prices == null) {
                  if (other$prices == null) {
                     break label139;
                  }
               } else if (this$prices.equals(other$prices)) {
                  break label139;
               }

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

            Object this$providerData = this.getProviderData();
            Object other$providerData = other.getProviderData();
            if (this$providerData == null) {
               if (other$providerData != null) {
                  return false;
               }
            } else if (!this$providerData.equals(other$providerData)) {
               return false;
            }

            Object this$photoUrl = this.getPhotoUrl();
            Object other$photoUrl = other.getPhotoUrl();
            if (this$photoUrl == null) {
               if (other$photoUrl != null) {
                  return false;
               }
            } else if (!this$photoUrl.equals(other$photoUrl)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InputInvoiceMessageContent;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $maxTipAmount = this.getMaxTipAmount();
      int result = result * 59 + ($maxTipAmount == null ? 43 : $maxTipAmount.hashCode());
      Object $photoSize = this.getPhotoSize();
      result = result * 59 + ($photoSize == null ? 43 : $photoSize.hashCode());
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
      Object $sendPhoneNumberToProvider = this.getSendPhoneNumberToProvider();
      result = result * 59 + ($sendPhoneNumberToProvider == null ? 43 : $sendPhoneNumberToProvider.hashCode());
      Object $sendEmailToProvider = this.getSendEmailToProvider();
      result = result * 59 + ($sendEmailToProvider == null ? 43 : $sendEmailToProvider.hashCode());
      Object $isFlexible = this.getIsFlexible();
      result = result * 59 + ($isFlexible == null ? 43 : $isFlexible.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $payload = this.getPayload();
      result = result * 59 + ($payload == null ? 43 : $payload.hashCode());
      Object $providerToken = this.getProviderToken();
      result = result * 59 + ($providerToken == null ? 43 : $providerToken.hashCode());
      Object $currency = this.getCurrency();
      result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
      Object $prices = this.getPrices();
      result = result * 59 + ($prices == null ? 43 : $prices.hashCode());
      Object $suggestedTipAmounts = this.getSuggestedTipAmounts();
      result = result * 59 + ($suggestedTipAmounts == null ? 43 : $suggestedTipAmounts.hashCode());
      Object $providerData = this.getProviderData();
      result = result * 59 + ($providerData == null ? 43 : $providerData.hashCode());
      Object $photoUrl = this.getPhotoUrl();
      result = result * 59 + ($photoUrl == null ? 43 : $photoUrl.hashCode());
      return result;
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
   public String getCurrency() {
      return this.currency;
   }

   @NonNull
   public List<LabeledPrice> getPrices() {
      return this.prices;
   }

   public Integer getMaxTipAmount() {
      return this.maxTipAmount;
   }

   public List<Integer> getSuggestedTipAmounts() {
      return this.suggestedTipAmounts;
   }

   public String getProviderData() {
      return this.providerData;
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

   public Boolean getSendPhoneNumberToProvider() {
      return this.sendPhoneNumberToProvider;
   }

   public Boolean getSendEmailToProvider() {
      return this.sendEmailToProvider;
   }

   public Boolean getIsFlexible() {
      return this.isFlexible;
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

   @JsonProperty("max_tip_amount")
   public void setMaxTipAmount(Integer maxTipAmount) {
      this.maxTipAmount = maxTipAmount;
   }

   @JsonProperty("suggested_tip_amounts")
   public void setSuggestedTipAmounts(List<Integer> suggestedTipAmounts) {
      this.suggestedTipAmounts = suggestedTipAmounts;
   }

   @JsonProperty("provider_data")
   public void setProviderData(String providerData) {
      this.providerData = providerData;
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

   @JsonProperty("send_phone_number_to_provider")
   public void setSendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
      this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
   }

   @JsonProperty("send_email_to_provider")
   public void setSendEmailToProvider(Boolean sendEmailToProvider) {
      this.sendEmailToProvider = sendEmailToProvider;
   }

   @JsonProperty("is_flexible")
   public void setIsFlexible(Boolean isFlexible) {
      this.isFlexible = isFlexible;
   }

   public String toString() {
      return "InputInvoiceMessageContent(title=" + this.getTitle() + ", description=" + this.getDescription() + ", payload=" + this.getPayload() + ", providerToken=" + this.getProviderToken() + ", currency=" + this.getCurrency() + ", prices=" + this.getPrices() + ", maxTipAmount=" + this.getMaxTipAmount() + ", suggestedTipAmounts=" + this.getSuggestedTipAmounts() + ", providerData=" + this.getProviderData() + ", photoUrl=" + this.getPhotoUrl() + ", photoSize=" + this.getPhotoSize() + ", photoWidth=" + this.getPhotoWidth() + ", photoHeight=" + this.getPhotoHeight() + ", needName=" + this.getNeedName() + ", needPhoneNumber=" + this.getNeedPhoneNumber() + ", needEmail=" + this.getNeedEmail() + ", needShippingAddress=" + this.getNeedShippingAddress() + ", sendPhoneNumberToProvider=" + this.getSendPhoneNumberToProvider() + ", sendEmailToProvider=" + this.getSendEmailToProvider() + ", isFlexible=" + this.getIsFlexible() + ")";
   }

   public InputInvoiceMessageContent(@NonNull String title, @NonNull String description, @NonNull String payload, @NonNull String providerToken, @NonNull String currency, @NonNull List<LabeledPrice> prices) {
      if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (description == null) {
         throw new NullPointerException("description is marked non-null but is null");
      } else if (payload == null) {
         throw new NullPointerException("payload is marked non-null but is null");
      } else if (providerToken == null) {
         throw new NullPointerException("providerToken is marked non-null but is null");
      } else if (currency == null) {
         throw new NullPointerException("currency is marked non-null but is null");
      } else if (prices == null) {
         throw new NullPointerException("prices is marked non-null but is null");
      } else {
         this.title = title;
         this.description = description;
         this.payload = payload;
         this.providerToken = providerToken;
         this.currency = currency;
         this.prices = prices;
      }
   }

   public InputInvoiceMessageContent() {
   }

   public InputInvoiceMessageContent(@NonNull String title, @NonNull String description, @NonNull String payload, @NonNull String providerToken, @NonNull String currency, @NonNull List<LabeledPrice> prices, Integer maxTipAmount, List<Integer> suggestedTipAmounts, String providerData, String photoUrl, Integer photoSize, Integer photoWidth, Integer photoHeight, Boolean needName, Boolean needPhoneNumber, Boolean needEmail, Boolean needShippingAddress, Boolean sendPhoneNumberToProvider, Boolean sendEmailToProvider, Boolean isFlexible) {
      if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (description == null) {
         throw new NullPointerException("description is marked non-null but is null");
      } else if (payload == null) {
         throw new NullPointerException("payload is marked non-null but is null");
      } else if (providerToken == null) {
         throw new NullPointerException("providerToken is marked non-null but is null");
      } else if (currency == null) {
         throw new NullPointerException("currency is marked non-null but is null");
      } else if (prices == null) {
         throw new NullPointerException("prices is marked non-null but is null");
      } else {
         this.title = title;
         this.description = description;
         this.payload = payload;
         this.providerToken = providerToken;
         this.currency = currency;
         this.prices = prices;
         this.maxTipAmount = maxTipAmount;
         this.suggestedTipAmounts = suggestedTipAmounts;
         this.providerData = providerData;
         this.photoUrl = photoUrl;
         this.photoSize = photoSize;
         this.photoWidth = photoWidth;
         this.photoHeight = photoHeight;
         this.needName = needName;
         this.needPhoneNumber = needPhoneNumber;
         this.needEmail = needEmail;
         this.needShippingAddress = needShippingAddress;
         this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
         this.sendEmailToProvider = sendEmailToProvider;
         this.isFlexible = isFlexible;
      }
   }

   public static class InputInvoiceMessageContentBuilder {
      private String title;
      private String description;
      private String payload;
      private String providerToken;
      private String currency;
      private ArrayList<LabeledPrice> prices;
      private Integer maxTipAmount;
      private ArrayList<Integer> suggestedTipAmounts;
      private String providerData;
      private String photoUrl;
      private Integer photoSize;
      private Integer photoWidth;
      private Integer photoHeight;
      private Boolean needName;
      private Boolean needPhoneNumber;
      private Boolean needEmail;
      private Boolean needShippingAddress;
      private Boolean sendPhoneNumberToProvider;
      private Boolean sendEmailToProvider;
      private Boolean isFlexible;

      InputInvoiceMessageContentBuilder() {
      }

      @JsonProperty("title")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      @JsonProperty("description")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder description(@NonNull String description) {
         if (description == null) {
            throw new NullPointerException("description is marked non-null but is null");
         } else {
            this.description = description;
            return this;
         }
      }

      @JsonProperty("payload")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder payload(@NonNull String payload) {
         if (payload == null) {
            throw new NullPointerException("payload is marked non-null but is null");
         } else {
            this.payload = payload;
            return this;
         }
      }

      @JsonProperty("provider_token")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder providerToken(@NonNull String providerToken) {
         if (providerToken == null) {
            throw new NullPointerException("providerToken is marked non-null but is null");
         } else {
            this.providerToken = providerToken;
            return this;
         }
      }

      @JsonProperty("currency")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder currency(@NonNull String currency) {
         if (currency == null) {
            throw new NullPointerException("currency is marked non-null but is null");
         } else {
            this.currency = currency;
            return this;
         }
      }

      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder price(LabeledPrice price) {
         if (this.prices == null) {
            this.prices = new ArrayList();
         }

         this.prices.add(price);
         return this;
      }

      @JsonProperty("prices")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder prices(Collection<? extends LabeledPrice> prices) {
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

      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder clearPrices() {
         if (this.prices != null) {
            this.prices.clear();
         }

         return this;
      }

      @JsonProperty("max_tip_amount")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder maxTipAmount(Integer maxTipAmount) {
         this.maxTipAmount = maxTipAmount;
         return this;
      }

      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder suggestedTipAmount(Integer suggestedTipAmount) {
         if (this.suggestedTipAmounts == null) {
            this.suggestedTipAmounts = new ArrayList();
         }

         this.suggestedTipAmounts.add(suggestedTipAmount);
         return this;
      }

      @JsonProperty("suggested_tip_amounts")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder suggestedTipAmounts(Collection<? extends Integer> suggestedTipAmounts) {
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

      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder clearSuggestedTipAmounts() {
         if (this.suggestedTipAmounts != null) {
            this.suggestedTipAmounts.clear();
         }

         return this;
      }

      @JsonProperty("provider_data")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder providerData(String providerData) {
         this.providerData = providerData;
         return this;
      }

      @JsonProperty("photo_url")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder photoUrl(String photoUrl) {
         this.photoUrl = photoUrl;
         return this;
      }

      @JsonProperty("photo_size")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder photoSize(Integer photoSize) {
         this.photoSize = photoSize;
         return this;
      }

      @JsonProperty("photo_width")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder photoWidth(Integer photoWidth) {
         this.photoWidth = photoWidth;
         return this;
      }

      @JsonProperty("photo_height")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder photoHeight(Integer photoHeight) {
         this.photoHeight = photoHeight;
         return this;
      }

      @JsonProperty("need_name")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder needName(Boolean needName) {
         this.needName = needName;
         return this;
      }

      @JsonProperty("need_phone_number")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder needPhoneNumber(Boolean needPhoneNumber) {
         this.needPhoneNumber = needPhoneNumber;
         return this;
      }

      @JsonProperty("need_email")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder needEmail(Boolean needEmail) {
         this.needEmail = needEmail;
         return this;
      }

      @JsonProperty("need_shipping_address")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder needShippingAddress(Boolean needShippingAddress) {
         this.needShippingAddress = needShippingAddress;
         return this;
      }

      @JsonProperty("send_phone_number_to_provider")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder sendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
         this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
         return this;
      }

      @JsonProperty("send_email_to_provider")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder sendEmailToProvider(Boolean sendEmailToProvider) {
         this.sendEmailToProvider = sendEmailToProvider;
         return this;
      }

      @JsonProperty("is_flexible")
      public InputInvoiceMessageContent.InputInvoiceMessageContentBuilder isFlexible(Boolean isFlexible) {
         this.isFlexible = isFlexible;
         return this;
      }

      public InputInvoiceMessageContent build() {
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

         return new InputInvoiceMessageContent(this.title, this.description, this.payload, this.providerToken, this.currency, prices, this.maxTipAmount, suggestedTipAmounts, this.providerData, this.photoUrl, this.photoSize, this.photoWidth, this.photoHeight, this.needName, this.needPhoneNumber, this.needEmail, this.needShippingAddress, this.sendPhoneNumberToProvider, this.sendEmailToProvider, this.isFlexible);
      }

      public String toString() {
         return "InputInvoiceMessageContent.InputInvoiceMessageContentBuilder(title=" + this.title + ", description=" + this.description + ", payload=" + this.payload + ", providerToken=" + this.providerToken + ", currency=" + this.currency + ", prices=" + this.prices + ", maxTipAmount=" + this.maxTipAmount + ", suggestedTipAmounts=" + this.suggestedTipAmounts + ", providerData=" + this.providerData + ", photoUrl=" + this.photoUrl + ", photoSize=" + this.photoSize + ", photoWidth=" + this.photoWidth + ", photoHeight=" + this.photoHeight + ", needName=" + this.needName + ", needPhoneNumber=" + this.needPhoneNumber + ", needEmail=" + this.needEmail + ", needShippingAddress=" + this.needShippingAddress + ", sendPhoneNumberToProvider=" + this.sendPhoneNumberToProvider + ", sendEmailToProvider=" + this.sendEmailToProvider + ", isFlexible=" + this.isFlexible + ")";
      }
   }
}
