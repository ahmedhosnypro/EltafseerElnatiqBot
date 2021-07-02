package org.telegram.telegrambots.meta.api.methods.updates;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class LogOut extends BotApiMethod<Boolean> {
   public static final String PATH = "logOut";

   public String getMethod() {
      return "logOut";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error logging out", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
   }

   public static LogOut.LogOutBuilder builder() {
      return new LogOut.LogOutBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof LogOut)) {
         return false;
      } else {
         LogOut other = (LogOut)o;
         return other.canEqual(this);
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof LogOut;
   }

   public int hashCode() {
      int result = true;
      return 1;
   }

   public String toString() {
      return "LogOut()";
   }

   public static class LogOutBuilder {
      LogOutBuilder() {
      }

      public LogOut build() {
         return new LogOut();
      }

      public String toString() {
         return "LogOut.LogOutBuilder()";
      }
   }
}
