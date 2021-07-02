package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementError;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetPassportDataErrors extends BotApiMethod<Boolean> {
   public static final String PATH = "setPassportDataErrors";
   private static final String USERID_FIELD = "user_id";
   private static final String ERRORS_FIELD = "errors";
   @JsonProperty("user_id")
   @NonNull
   private Long userId;
   @JsonProperty("errors")
   @NonNull
   private List<PassportElementError> errors;

   public String getMethod() {
      return "setPassportDataErrors";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error setting passport data errors", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.userId == null) {
         throw new TelegramApiValidationException("User ID can't be empty", this);
      } else if (this.errors == null || this.errors.isEmpty()) {
         throw new TelegramApiValidationException("Errors can't be empty", this);
      }
   }

   public static SetPassportDataErrors.SetPassportDataErrorsBuilder builder() {
      return new SetPassportDataErrors.SetPassportDataErrorsBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetPassportDataErrors)) {
         return false;
      } else {
         SetPassportDataErrors other = (SetPassportDataErrors)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$userId = this.getUserId();
            Object other$userId = other.getUserId();
            if (this$userId == null) {
               if (other$userId != null) {
                  return false;
               }
            } else if (!this$userId.equals(other$userId)) {
               return false;
            }

            Object this$errors = this.getErrors();
            Object other$errors = other.getErrors();
            if (this$errors == null) {
               if (other$errors != null) {
                  return false;
               }
            } else if (!this$errors.equals(other$errors)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetPassportDataErrors;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $errors = this.getErrors();
      result = result * 59 + ($errors == null ? 43 : $errors.hashCode());
      return result;
   }

   @NonNull
   public Long getUserId() {
      return this.userId;
   }

   @NonNull
   public List<PassportElementError> getErrors() {
      return this.errors;
   }

   @JsonProperty("user_id")
   public void setUserId(@NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
      }
   }

   @JsonProperty("errors")
   public void setErrors(@NonNull List<PassportElementError> errors) {
      if (errors == null) {
         throw new NullPointerException("errors is marked non-null but is null");
      } else {
         this.errors = errors;
      }
   }

   public String toString() {
      return "SetPassportDataErrors(userId=" + this.getUserId() + ", errors=" + this.getErrors() + ")";
   }

   public SetPassportDataErrors() {
   }

   public SetPassportDataErrors(@NonNull Long userId, @NonNull List<PassportElementError> errors) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else if (errors == null) {
         throw new NullPointerException("errors is marked non-null but is null");
      } else {
         this.userId = userId;
         this.errors = errors;
      }
   }

   public static class SetPassportDataErrorsBuilder {
      private Long userId;
      private ArrayList<PassportElementError> errors;

      SetPassportDataErrorsBuilder() {
      }

      @JsonProperty("user_id")
      public SetPassportDataErrors.SetPassportDataErrorsBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      public SetPassportDataErrors.SetPassportDataErrorsBuilder error(PassportElementError error) {
         if (this.errors == null) {
            this.errors = new ArrayList();
         }

         this.errors.add(error);
         return this;
      }

      @JsonProperty("errors")
      public SetPassportDataErrors.SetPassportDataErrorsBuilder errors(Collection<? extends PassportElementError> errors) {
         if (errors == null) {
            throw new NullPointerException("errors cannot be null");
         } else {
            if (this.errors == null) {
               this.errors = new ArrayList();
            }

            this.errors.addAll(errors);
            return this;
         }
      }

      public SetPassportDataErrors.SetPassportDataErrorsBuilder clearErrors() {
         if (this.errors != null) {
            this.errors.clear();
         }

         return this;
      }

      public SetPassportDataErrors build() {
         List errors;
         switch(this.errors == null ? 0 : this.errors.size()) {
         case 0:
            errors = Collections.emptyList();
            break;
         case 1:
            errors = Collections.singletonList((PassportElementError)this.errors.get(0));
            break;
         default:
            errors = Collections.unmodifiableList(new ArrayList(this.errors));
         }

         return new SetPassportDataErrors(this.userId, errors);
      }

      public String toString() {
         return "SetPassportDataErrors.SetPassportDataErrorsBuilder(userId=" + this.userId + ", errors=" + this.errors + ")";
      }
   }
}
