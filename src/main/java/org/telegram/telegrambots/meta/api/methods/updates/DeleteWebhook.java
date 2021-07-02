package org.telegram.telegrambots.meta.api.methods.updates;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class DeleteWebhook extends BotApiMethod<Boolean> {
   public static final String PATH = "deleteWebhook";
   private static final String DROPPENDINGUPDATES_FIELD = "drop_pending_updates";
   @JsonProperty("drop_pending_updates")
   private Boolean dropPendingUpdates;

   public String getMethod() {
      return "deleteWebhook";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error deleting webhook", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
   }

   public static DeleteWebhook.DeleteWebhookBuilder builder() {
      return new DeleteWebhook.DeleteWebhookBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeleteWebhook)) {
         return false;
      } else {
         DeleteWebhook other = (DeleteWebhook)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$dropPendingUpdates = this.getDropPendingUpdates();
            Object other$dropPendingUpdates = other.getDropPendingUpdates();
            if (this$dropPendingUpdates == null) {
               if (other$dropPendingUpdates != null) {
                  return false;
               }
            } else if (!this$dropPendingUpdates.equals(other$dropPendingUpdates)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof DeleteWebhook;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $dropPendingUpdates = this.getDropPendingUpdates();
      int result = result * 59 + ($dropPendingUpdates == null ? 43 : $dropPendingUpdates.hashCode());
      return result;
   }

   public Boolean getDropPendingUpdates() {
      return this.dropPendingUpdates;
   }

   @JsonProperty("drop_pending_updates")
   public void setDropPendingUpdates(Boolean dropPendingUpdates) {
      this.dropPendingUpdates = dropPendingUpdates;
   }

   public String toString() {
      return "DeleteWebhook(dropPendingUpdates=" + this.getDropPendingUpdates() + ")";
   }

   public DeleteWebhook() {
   }

   public DeleteWebhook(Boolean dropPendingUpdates) {
      this.dropPendingUpdates = dropPendingUpdates;
   }

   public static class DeleteWebhookBuilder {
      private Boolean dropPendingUpdates;

      DeleteWebhookBuilder() {
      }

      @JsonProperty("drop_pending_updates")
      public DeleteWebhook.DeleteWebhookBuilder dropPendingUpdates(Boolean dropPendingUpdates) {
         this.dropPendingUpdates = dropPendingUpdates;
         return this;
      }

      public DeleteWebhook build() {
         return new DeleteWebhook(this.dropPendingUpdates);
      }

      public String toString() {
         return "DeleteWebhook.DeleteWebhookBuilder(dropPendingUpdates=" + this.dropPendingUpdates + ")";
      }
   }
}
