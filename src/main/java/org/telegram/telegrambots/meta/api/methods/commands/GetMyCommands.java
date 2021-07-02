package org.telegram.telegrambots.meta.api.methods.commands;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetMyCommands extends BotApiMethod<ArrayList<BotCommand>> {
   public static final String PATH = "getMyCommands";

   public String getMethod() {
      return "getMyCommands";
   }

   public ArrayList<BotCommand> deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<ArrayList<BotCommand>> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<ArrayList<BotCommand>>>() {
         });
         if (result.getOk()) {
            return (ArrayList)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending commands", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
   }

   public static GetMyCommands.GetMyCommandsBuilder builder() {
      return new GetMyCommands.GetMyCommandsBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetMyCommands)) {
         return false;
      } else {
         GetMyCommands other = (GetMyCommands)o;
         return other.canEqual(this);
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetMyCommands;
   }

   public int hashCode() {
      int result = true;
      return 1;
   }

   public String toString() {
      return "GetMyCommands()";
   }

   public static class GetMyCommandsBuilder {
      GetMyCommandsBuilder() {
      }

      public GetMyCommands build() {
         return new GetMyCommands();
      }

      public String toString() {
         return "GetMyCommands.GetMyCommandsBuilder()";
      }
   }
}
