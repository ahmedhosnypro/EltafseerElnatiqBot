package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.ActionType;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendChatAction extends BotApiMethod<Boolean> {
   public static final String PATH = "sendChatAction";
   public static final String CHATID_FIELD = "chat_id";
   private static final String ACTION_FIELD = "action";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("action")
   @NonNull
   private String action;

   @JsonIgnore
   public ActionType getActionType() {
      return ActionType.get(this.action);
   }

   @JsonIgnore
   public void setAction(ActionType action) {
      this.action = action.toString();
   }

   public String getMethod() {
      return "sendChatAction";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending chat action", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.action == null) {
            throw new TelegramApiValidationException("Action parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendChatAction.SendChatActionBuilder builder() {
      return new SendChatAction.SendChatActionBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendChatAction)) {
         return false;
      } else {
         SendChatAction other = (SendChatAction)o;
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

            Object this$action = this.getAction();
            Object other$action = other.getAction();
            if (this$action == null) {
               if (other$action != null) {
                  return false;
               }
            } else if (!this$action.equals(other$action)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SendChatAction;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $chatId = this.getChatId();
      int result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $action = this.getAction();
      result = result * 59 + ($action == null ? 43 : $action.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public String getAction() {
      return this.action;
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
      return "SendChatAction(chatId=" + this.getChatId() + ", action=" + this.getAction() + ")";
   }

   public SendChatAction() {
   }

   public SendChatAction(@NonNull String chatId, @NonNull String action) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (action == null) {
         throw new NullPointerException("action is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.action = action;
      }
   }

   public static class SendChatActionBuilder {
      private String chatId;
      private String action;

      SendChatActionBuilder() {
      }

      @JsonProperty("chat_id")
      public SendChatAction.SendChatActionBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("action")
      public SendChatAction.SendChatActionBuilder action(@NonNull String action) {
         if (action == null) {
            throw new NullPointerException("action is marked non-null but is null");
         } else {
            this.action = action;
            return this;
         }
      }

      public SendChatAction build() {
         return new SendChatAction(this.chatId, this.action);
      }

      public String toString() {
         return "SendChatAction.SendChatActionBuilder(chatId=" + this.chatId + ", action=" + this.action + ")";
      }
   }
}
