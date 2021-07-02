package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.ChatPermissions;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetChatPermissions extends BotApiMethod<Boolean> {
   public static final String PATH = "setChatPermissions";
   private static final String CHAT_ID_FIELD = "chat_id";
   private static final String PERMISSIONS_FIELD = "permissions";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("permissions")
   @NonNull
   private ChatPermissions permissions;

   public String getMethod() {
      return "setChatPermissions";
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
         if (this.permissions == null) {
            throw new TelegramApiValidationException("Permissions can't be null", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static SetChatPermissions.SetChatPermissionsBuilder builder() {
      return new SetChatPermissions.SetChatPermissionsBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetChatPermissions)) {
         return false;
      } else {
         SetChatPermissions other = (SetChatPermissions)o;
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

            Object this$permissions = this.getPermissions();
            Object other$permissions = other.getPermissions();
            if (this$permissions == null) {
               if (other$permissions != null) {
                  return false;
               }
            } else if (!this$permissions.equals(other$permissions)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetChatPermissions;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $chatId = this.getChatId();
      int result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $permissions = this.getPermissions();
      result = result * 59 + ($permissions == null ? 43 : $permissions.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public ChatPermissions getPermissions() {
      return this.permissions;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("permissions")
   public void setPermissions(@NonNull ChatPermissions permissions) {
      if (permissions == null) {
         throw new NullPointerException("permissions is marked non-null but is null");
      } else {
         this.permissions = permissions;
      }
   }

   public String toString() {
      return "SetChatPermissions(chatId=" + this.getChatId() + ", permissions=" + this.getPermissions() + ")";
   }

   public SetChatPermissions() {
   }

   public SetChatPermissions(@NonNull String chatId, @NonNull ChatPermissions permissions) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (permissions == null) {
         throw new NullPointerException("permissions is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.permissions = permissions;
      }
   }

   public static class SetChatPermissionsBuilder {
      private String chatId;
      private ChatPermissions permissions;

      SetChatPermissionsBuilder() {
      }

      @JsonProperty("chat_id")
      public SetChatPermissions.SetChatPermissionsBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("permissions")
      public SetChatPermissions.SetChatPermissionsBuilder permissions(@NonNull ChatPermissions permissions) {
         if (permissions == null) {
            throw new NullPointerException("permissions is marked non-null but is null");
         } else {
            this.permissions = permissions;
            return this;
         }
      }

      public SetChatPermissions build() {
         return new SetChatPermissions(this.chatId, this.permissions);
      }

      public String toString() {
         return "SetChatPermissions.SetChatPermissionsBuilder(chatId=" + this.chatId + ", permissions=" + this.permissions + ")";
      }
   }
}
