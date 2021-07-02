package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class ExportChatInviteLink extends BotApiMethod<String> {
   public static final String PATH = "exportChatInviteLink";
   private static final String CHATID_FIELD = "chat_id";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;

   public String getMethod() {
      return "exportChatInviteLink";
   }

   public String deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<String> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<String>>() {
         });
         if (result.getOk()) {
            return (String)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error exporting invite link", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId == null || this.chatId.isEmpty()) {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static ExportChatInviteLink.ExportChatInviteLinkBuilder builder() {
      return new ExportChatInviteLink.ExportChatInviteLinkBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ExportChatInviteLink)) {
         return false;
      } else {
         ExportChatInviteLink other = (ExportChatInviteLink)o;
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ExportChatInviteLink;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $chatId = this.getChatId();
      int result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public String toString() {
      return "ExportChatInviteLink(chatId=" + this.getChatId() + ")";
   }

   public ExportChatInviteLink() {
   }

   public ExportChatInviteLink(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public static class ExportChatInviteLinkBuilder {
      private String chatId;

      ExportChatInviteLinkBuilder() {
      }

      @JsonProperty("chat_id")
      public ExportChatInviteLink.ExportChatInviteLinkBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public ExportChatInviteLink build() {
         return new ExportChatInviteLink(this.chatId);
      }

      public String toString() {
         return "ExportChatInviteLink.ExportChatInviteLinkBuilder(chatId=" + this.chatId + ")";
      }
   }
}
