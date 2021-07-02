package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.payments.ShippingOption;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class AnswerShippingQuery extends BotApiMethod<Boolean> {
   public static final String PATH = "answerShippingQuery";
   private static final String SHIPPING_QUERY_ID_FIELD = "shipping_query_id";
   private static final String OK_FIELD = "ok";
   private static final String SHIPPING_OPTIONS_FIELD = "shipping_options";
   private static final String ERROR_MESSAGE_FIELD = "error_message";
   @JsonProperty("shipping_query_id")
   @NonNull
   private String shippingQueryId;
   @JsonProperty("ok")
   @NonNull
   private Boolean ok;
   @JsonProperty("shipping_options")
   private List<ShippingOption> shippingOptions;
   @JsonProperty("error_message")
   private String errorMessage;

   public void validate() throws TelegramApiValidationException {
      if (this.shippingQueryId != null && !this.shippingQueryId.isEmpty()) {
         if (this.ok == null) {
            throw new TelegramApiValidationException("Ok can't be null", this);
         } else {
            if (this.ok) {
               if (this.shippingOptions == null || this.shippingOptions.isEmpty()) {
                  throw new TelegramApiValidationException("ShippingOptions array can't be empty if ok", this);
               }

               Iterator var1 = this.shippingOptions.iterator();

               while(var1.hasNext()) {
                  ShippingOption shippingOption = (ShippingOption)var1.next();
                  shippingOption.validate();
               }
            } else if (this.errorMessage == null || this.errorMessage.isEmpty()) {
               throw new TelegramApiValidationException("ErrorMessage can't be empty if not ok", this);
            }

         }
      } else {
         throw new TelegramApiValidationException("ShippingQueryId can't be empty", this);
      }
   }

   public String getMethod() {
      return "answerShippingQuery";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error answering shipping query", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public static AnswerShippingQuery.AnswerShippingQueryBuilder builder() {
      return new AnswerShippingQuery.AnswerShippingQueryBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AnswerShippingQuery)) {
         return false;
      } else {
         AnswerShippingQuery other = (AnswerShippingQuery)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$ok = this.getOk();
               Object other$ok = other.getOk();
               if (this$ok == null) {
                  if (other$ok == null) {
                     break label59;
                  }
               } else if (this$ok.equals(other$ok)) {
                  break label59;
               }

               return false;
            }

            Object this$shippingQueryId = this.getShippingQueryId();
            Object other$shippingQueryId = other.getShippingQueryId();
            if (this$shippingQueryId == null) {
               if (other$shippingQueryId != null) {
                  return false;
               }
            } else if (!this$shippingQueryId.equals(other$shippingQueryId)) {
               return false;
            }

            Object this$shippingOptions = this.getShippingOptions();
            Object other$shippingOptions = other.getShippingOptions();
            if (this$shippingOptions == null) {
               if (other$shippingOptions != null) {
                  return false;
               }
            } else if (!this$shippingOptions.equals(other$shippingOptions)) {
               return false;
            }

            Object this$errorMessage = this.getErrorMessage();
            Object other$errorMessage = other.getErrorMessage();
            if (this$errorMessage == null) {
               if (other$errorMessage != null) {
                  return false;
               }
            } else if (!this$errorMessage.equals(other$errorMessage)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof AnswerShippingQuery;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $ok = this.getOk();
      int result = result * 59 + ($ok == null ? 43 : $ok.hashCode());
      Object $shippingQueryId = this.getShippingQueryId();
      result = result * 59 + ($shippingQueryId == null ? 43 : $shippingQueryId.hashCode());
      Object $shippingOptions = this.getShippingOptions();
      result = result * 59 + ($shippingOptions == null ? 43 : $shippingOptions.hashCode());
      Object $errorMessage = this.getErrorMessage();
      result = result * 59 + ($errorMessage == null ? 43 : $errorMessage.hashCode());
      return result;
   }

   @NonNull
   public String getShippingQueryId() {
      return this.shippingQueryId;
   }

   @NonNull
   public Boolean getOk() {
      return this.ok;
   }

   public List<ShippingOption> getShippingOptions() {
      return this.shippingOptions;
   }

   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("shipping_query_id")
   public void setShippingQueryId(@NonNull String shippingQueryId) {
      if (shippingQueryId == null) {
         throw new NullPointerException("shippingQueryId is marked non-null but is null");
      } else {
         this.shippingQueryId = shippingQueryId;
      }
   }

   @JsonProperty("ok")
   public void setOk(@NonNull Boolean ok) {
      if (ok == null) {
         throw new NullPointerException("ok is marked non-null but is null");
      } else {
         this.ok = ok;
      }
   }

   @JsonProperty("shipping_options")
   public void setShippingOptions(List<ShippingOption> shippingOptions) {
      this.shippingOptions = shippingOptions;
   }

   @JsonProperty("error_message")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   public String toString() {
      return "AnswerShippingQuery(shippingQueryId=" + this.getShippingQueryId() + ", ok=" + this.getOk() + ", shippingOptions=" + this.getShippingOptions() + ", errorMessage=" + this.getErrorMessage() + ")";
   }

   public AnswerShippingQuery() {
   }

   public AnswerShippingQuery(@NonNull String shippingQueryId, @NonNull Boolean ok) {
      if (shippingQueryId == null) {
         throw new NullPointerException("shippingQueryId is marked non-null but is null");
      } else if (ok == null) {
         throw new NullPointerException("ok is marked non-null but is null");
      } else {
         this.shippingQueryId = shippingQueryId;
         this.ok = ok;
      }
   }

   public AnswerShippingQuery(@NonNull String shippingQueryId, @NonNull Boolean ok, List<ShippingOption> shippingOptions, String errorMessage) {
      if (shippingQueryId == null) {
         throw new NullPointerException("shippingQueryId is marked non-null but is null");
      } else if (ok == null) {
         throw new NullPointerException("ok is marked non-null but is null");
      } else {
         this.shippingQueryId = shippingQueryId;
         this.ok = ok;
         this.shippingOptions = shippingOptions;
         this.errorMessage = errorMessage;
      }
   }

   public static class AnswerShippingQueryBuilder {
      private String shippingQueryId;
      private Boolean ok;
      private List<ShippingOption> shippingOptions;
      private String errorMessage;

      AnswerShippingQueryBuilder() {
      }

      @JsonProperty("shipping_query_id")
      public AnswerShippingQuery.AnswerShippingQueryBuilder shippingQueryId(@NonNull String shippingQueryId) {
         if (shippingQueryId == null) {
            throw new NullPointerException("shippingQueryId is marked non-null but is null");
         } else {
            this.shippingQueryId = shippingQueryId;
            return this;
         }
      }

      @JsonProperty("ok")
      public AnswerShippingQuery.AnswerShippingQueryBuilder ok(@NonNull Boolean ok) {
         if (ok == null) {
            throw new NullPointerException("ok is marked non-null but is null");
         } else {
            this.ok = ok;
            return this;
         }
      }

      @JsonProperty("shipping_options")
      public AnswerShippingQuery.AnswerShippingQueryBuilder shippingOptions(List<ShippingOption> shippingOptions) {
         this.shippingOptions = shippingOptions;
         return this;
      }

      @JsonProperty("error_message")
      public AnswerShippingQuery.AnswerShippingQueryBuilder errorMessage(String errorMessage) {
         this.errorMessage = errorMessage;
         return this;
      }

      public AnswerShippingQuery build() {
         return new AnswerShippingQuery(this.shippingQueryId, this.ok, this.shippingOptions, this.errorMessage);
      }

      public String toString() {
         return "AnswerShippingQuery.AnswerShippingQueryBuilder(shippingQueryId=" + this.shippingQueryId + ", ok=" + this.ok + ", shippingOptions=" + this.shippingOptions + ", errorMessage=" + this.errorMessage + ")";
      }
   }
}
