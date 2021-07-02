package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetChatTitle extends BotApiMethod<Boolean> {
   public static final String PATH = "setChatTitle";
   private static final String CHATID_FIELD = "chat_id";
   private static final String TITLE_FIELD = "title";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("title")
   @NonNull
   private String title;

   public String getMethod() {
      return "setChatTitle";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error setting chat title", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.title == null || this.title.isEmpty()) {
            throw new TelegramApiValidationException("Title can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static SetChatTitle.SetChatTitleBuilder builder() {
      return new SetChatTitle.SetChatTitleBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetChatTitle)) {
         return false;
      } else {
         SetChatTitle other = (SetChatTitle)o;
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

            Object this$title = this.getTitle();
            Object other$title = other.getTitle();
            if (this$title == null) {
               if (other$title != null) {
                  return false;
               }
            } else if (!this$title.equals(other$title)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetChatTitle;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $chatId = this.getChatId();
      int result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("title")
   public void setTitle(@NonNull String title) {
      if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.title = title;
      }
   }

   public String toString() {
      return "SetChatTitle(chatId=" + this.getChatId() + ", title=" + this.getTitle() + ")";
   }

   public SetChatTitle() {
   }

   public SetChatTitle(@NonNull String chatId, @NonNull String title) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.title = title;
      }
   }

   public static class SetChatTitleBuilder {
      private String chatId;
      private String title;

      SetChatTitleBuilder() {
      }

      @JsonProperty("chat_id")
      public SetChatTitle.SetChatTitleBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("title")
      public SetChatTitle.SetChatTitleBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      public SetChatTitle build() {
         return new SetChatTitle(this.chatId, this.title);
      }

      public String toString() {
         return "SetChatTitle.SetChatTitleBuilder(chatId=" + this.chatId + ", title=" + this.title + ")";
      }
   }
}
