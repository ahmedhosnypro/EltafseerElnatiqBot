package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class AnswerPreCheckoutQuery extends BotApiMethod<Boolean> {
   public static final String PATH = "answerPreCheckoutQuery";
   private static final String PRE_CHECKOUT_QUERY_ID_FIELD = "pre_checkout_query_id";
   private static final String OK_FIELD = "ok";
   private static final String ERROR_MESSAGE_FIELD = "error_message";
   @JsonProperty("pre_checkout_query_id")
   @NonNull
   private String preCheckoutQueryId;
   @JsonProperty("ok")
   @NonNull
   private Boolean ok;
   @JsonProperty("error_message")
   private String errorMessage;

   public void validate() throws TelegramApiValidationException {
      if (this.preCheckoutQueryId != null && !this.preCheckoutQueryId.isEmpty()) {
         if (this.ok == null) {
            throw new TelegramApiValidationException("Ok can't be null", this);
         } else if (!this.ok && (this.errorMessage == null || this.errorMessage.isEmpty())) {
            throw new TelegramApiValidationException("ErrorMessage can't be empty if not ok", this);
         }
      } else {
         throw new TelegramApiValidationException("PreCheckoutQueryId can't be empty", this);
      }
   }

   public String getMethod() {
      return "answerPreCheckoutQuery";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error answering pre-checkout query", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public static AnswerPreCheckoutQuery.AnswerPreCheckoutQueryBuilder builder() {
      return new AnswerPreCheckoutQuery.AnswerPreCheckoutQueryBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AnswerPreCheckoutQuery)) {
         return false;
      } else {
         AnswerPreCheckoutQuery other = (AnswerPreCheckoutQuery)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$ok = this.getOk();
               Object other$ok = other.getOk();
               if (this$ok == null) {
                  if (other$ok == null) {
                     break label47;
                  }
               } else if (this$ok.equals(other$ok)) {
                  break label47;
               }

               return false;
            }

            Object this$preCheckoutQueryId = this.getPreCheckoutQueryId();
            Object other$preCheckoutQueryId = other.getPreCheckoutQueryId();
            if (this$preCheckoutQueryId == null) {
               if (other$preCheckoutQueryId != null) {
                  return false;
               }
            } else if (!this$preCheckoutQueryId.equals(other$preCheckoutQueryId)) {
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
      return other instanceof AnswerPreCheckoutQuery;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $ok = this.getOk();
      int result = result * 59 + ($ok == null ? 43 : $ok.hashCode());
      Object $preCheckoutQueryId = this.getPreCheckoutQueryId();
      result = result * 59 + ($preCheckoutQueryId == null ? 43 : $preCheckoutQueryId.hashCode());
      Object $errorMessage = this.getErrorMessage();
      result = result * 59 + ($errorMessage == null ? 43 : $errorMessage.hashCode());
      return result;
   }

   @NonNull
   public String getPreCheckoutQueryId() {
      return this.preCheckoutQueryId;
   }

   @NonNull
   public Boolean getOk() {
      return this.ok;
   }

   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("pre_checkout_query_id")
   public void setPreCheckoutQueryId(@NonNull String preCheckoutQueryId) {
      if (preCheckoutQueryId == null) {
         throw new NullPointerException("preCheckoutQueryId is marked non-null but is null");
      } else {
         this.preCheckoutQueryId = preCheckoutQueryId;
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

   @JsonProperty("error_message")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   public String toString() {
      return "AnswerPreCheckoutQuery(preCheckoutQueryId=" + this.getPreCheckoutQueryId() + ", ok=" + this.getOk() + ", errorMessage=" + this.getErrorMessage() + ")";
   }

   public AnswerPreCheckoutQuery() {
   }

   public AnswerPreCheckoutQuery(@NonNull String preCheckoutQueryId, @NonNull Boolean ok) {
      if (preCheckoutQueryId == null) {
         throw new NullPointerException("preCheckoutQueryId is marked non-null but is null");
      } else if (ok == null) {
         throw new NullPointerException("ok is marked non-null but is null");
      } else {
         this.preCheckoutQueryId = preCheckoutQueryId;
         this.ok = ok;
      }
   }

   public AnswerPreCheckoutQuery(@NonNull String preCheckoutQueryId, @NonNull Boolean ok, String errorMessage) {
      if (preCheckoutQueryId == null) {
         throw new NullPointerException("preCheckoutQueryId is marked non-null but is null");
      } else if (ok == null) {
         throw new NullPointerException("ok is marked non-null but is null");
      } else {
         this.preCheckoutQueryId = preCheckoutQueryId;
         this.ok = ok;
         this.errorMessage = errorMessage;
      }
   }

   public static class AnswerPreCheckoutQueryBuilder {
      private String preCheckoutQueryId;
      private Boolean ok;
      private String errorMessage;

      AnswerPreCheckoutQueryBuilder() {
      }

      @JsonProperty("pre_checkout_query_id")
      public AnswerPreCheckoutQuery.AnswerPreCheckoutQueryBuilder preCheckoutQueryId(@NonNull String preCheckoutQueryId) {
         if (preCheckoutQueryId == null) {
            throw new NullPointerException("preCheckoutQueryId is marked non-null but is null");
         } else {
            this.preCheckoutQueryId = preCheckoutQueryId;
            return this;
         }
      }

      @JsonProperty("ok")
      public AnswerPreCheckoutQuery.AnswerPreCheckoutQueryBuilder ok(@NonNull Boolean ok) {
         if (ok == null) {
            throw new NullPointerException("ok is marked non-null but is null");
         } else {
            this.ok = ok;
            return this;
         }
      }

      @JsonProperty("error_message")
      public AnswerPreCheckoutQuery.AnswerPreCheckoutQueryBuilder errorMessage(String errorMessage) {
         this.errorMessage = errorMessage;
         return this;
      }

      public AnswerPreCheckoutQuery build() {
         return new AnswerPreCheckoutQuery(this.preCheckoutQueryId, this.ok, this.errorMessage);
      }

      public String toString() {
         return "AnswerPreCheckoutQuery.AnswerPreCheckoutQueryBuilder(preCheckoutQueryId=" + this.preCheckoutQueryId + ", ok=" + this.ok + ", errorMessage=" + this.errorMessage + ")";
      }
   }
}
