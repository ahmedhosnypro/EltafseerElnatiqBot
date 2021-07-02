package org.telegram.telegrambots.meta.api.methods.updates;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class Close extends BotApiMethod<Boolean> {
   public static final String PATH = "close";

   public String getMethod() {
      return "close";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error closing", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
   }

   public static Close.CloseBuilder builder() {
      return new Close.CloseBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Close)) {
         return false;
      } else {
         Close other = (Close)o;
         return other.canEqual(this);
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Close;
   }

   public int hashCode() {
      int result = true;
      return 1;
   }

   public String toString() {
      return "Close()";
   }

   public static class CloseBuilder {
      CloseBuilder() {
      }

      public Close build() {
         return new Close();
      }

      public String toString() {
         return "Close.CloseBuilder()";
      }
   }
}
