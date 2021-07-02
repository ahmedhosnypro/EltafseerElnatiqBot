package org.telegram.telegrambots.meta.api.methods.updates;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.WebhookInfo;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetWebhookInfo extends BotApiMethod<WebhookInfo> {
   public static final String PATH = "getwebhookinfo";

   public String getMethod() {
      return "getwebhookinfo";
   }

   public WebhookInfo deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<WebhookInfo> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<WebhookInfo>>() {
         });
         if (result.getOk()) {
            return (WebhookInfo)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error getting webhook info", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
   }

   public static GetWebhookInfo.GetWebhookInfoBuilder builder() {
      return new GetWebhookInfo.GetWebhookInfoBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetWebhookInfo)) {
         return false;
      } else {
         GetWebhookInfo other = (GetWebhookInfo)o;
         return other.canEqual(this);
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetWebhookInfo;
   }

   public int hashCode() {
      int result = true;
      return 1;
   }

   public String toString() {
      return "GetWebhookInfo()";
   }

   public static class GetWebhookInfoBuilder {
      GetWebhookInfoBuilder() {
      }

      public GetWebhookInfo build() {
         return new GetWebhookInfo();
      }

      public String toString() {
         return "GetWebhookInfo.GetWebhookInfoBuilder()";
      }
   }
}
