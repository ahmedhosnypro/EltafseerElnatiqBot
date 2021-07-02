package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetMe extends BotApiMethod<User> {
   public static final String PATH = "getme";

   public String getMethod() {
      return "getme";
   }

   public User deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<User> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<User>>() {
         });
         if (result.getOk()) {
            return (User)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error getting me", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
   }

   public static GetMe.GetMeBuilder builder() {
      return new GetMe.GetMeBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetMe)) {
         return false;
      } else {
         GetMe other = (GetMe)o;
         return other.canEqual(this);
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetMe;
   }

   public int hashCode() {
      int result = true;
      return 1;
   }

   public String toString() {
      return "GetMe()";
   }

   public static class GetMeBuilder {
      GetMeBuilder() {
      }

      public GetMe build() {
         return new GetMe();
      }

      public String toString() {
         return "GetMe.GetMeBuilder()";
      }
   }
}
