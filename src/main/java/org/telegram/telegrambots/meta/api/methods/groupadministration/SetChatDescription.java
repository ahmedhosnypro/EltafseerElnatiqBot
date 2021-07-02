package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetChatDescription extends BotApiMethod<Boolean> {
   public static final String PATH = "setChatDescription";
   private static final String CHATID_FIELD = "chat_id";
   private static final String DESCRIPTION_FIELD = "description";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("description")
   private String description;

   public String getMethod() {
      return "setChatDescription";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error setting chat description", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.description == null) {
            throw new TelegramApiValidationException("Description can't be null", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static SetChatDescription.SetChatDescriptionBuilder builder() {
      return new SetChatDescription.SetChatDescriptionBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetChatDescription)) {
         return false;
      } else {
         SetChatDescription other = (SetChatDescription)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$chatId = this.getChatId();
            Object other$chatId = other.getChatId();
            if (this$chatId == null) {
               if (other$chatId != null) {
                  return false;
               }
            } else if (!this$chatId.equals(other$chatId)) {
               return false;
            }

            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
               if (other$description != null) {
                  return false;
               }
            } else if (!this$description.equals(other$description)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetChatDescription;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $chatId = this.getChatId();
      int result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   public String getDescription() {
      return this.description;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   public String toString() {
      return "SetChatDescription(chatId=" + this.getChatId() + ", description=" + this.getDescription() + ")";
   }

   public SetChatDescription() {
   }

   public SetChatDescription(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public SetChatDescription(@NonNull String chatId, String description) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.description = description;
      }
   }

   public static class SetChatDescriptionBuilder {
      private String chatId;
      private String description;

      SetChatDescriptionBuilder() {
      }

      @JsonProperty("chat_id")
      public SetChatDescription.SetChatDescriptionBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("description")
      public SetChatDescription.SetChatDescriptionBuilder description(String description) {
         this.description = description;
         return this;
      }

      public SetChatDescription build() {
         return new SetChatDescription(this.chatId, this.description);
      }

      public String toString() {
         return "SetChatDescription.SetChatDescriptionBuilder(chatId=" + this.chatId + ", description=" + this.description + ")";
      }
   }
}
