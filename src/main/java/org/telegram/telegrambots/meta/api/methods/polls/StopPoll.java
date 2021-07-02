package org.telegram.telegrambots.meta.api.methods.polls;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.polls.Poll;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class StopPoll extends BotApiMethod<Poll> {
   public static final String PATH = "stopPoll";
   private static final String CHATID_FIELD = "chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("message_id")
   @NonNull
   private Integer messageId;

   public String getMethod() {
      return "stopPoll";
   }

   public Poll deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Poll> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Poll>>() {
         });
         if (result.getOk()) {
            return (Poll)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error stopping poll", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.messageId == null || this.messageId == 0) {
            throw new TelegramApiValidationException("Message Id parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static StopPoll.StopPollBuilder builder() {
      return new StopPoll.StopPollBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof StopPoll)) {
         return false;
      } else {
         StopPoll other = (StopPoll)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$messageId = this.getMessageId();
            Object other$messageId = other.getMessageId();
            if (this$messageId == null) {
               if (other$messageId != null) {
                  return false;
               }
            } else if (!this$messageId.equals(other$messageId)) {
               return false;
            }

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
      return other instanceof StopPoll;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public Integer getMessageId() {
      return this.messageId;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("message_id")
   public void setMessageId(@NonNull Integer messageId) {
      if (messageId == null) {
         throw new NullPointerException("messageId is marked non-null but is null");
      } else {
         this.messageId = messageId;
      }
   }

   public String toString() {
      return "StopPoll(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ")";
   }

   public StopPoll() {
   }

   public StopPoll(@NonNull String chatId, @NonNull Integer messageId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (messageId == null) {
         throw new NullPointerException("messageId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.messageId = messageId;
      }
   }

   public static class StopPollBuilder {
      private String chatId;
      private Integer messageId;

      StopPollBuilder() {
      }

      @JsonProperty("chat_id")
      public StopPoll.StopPollBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("message_id")
      public StopPoll.StopPollBuilder messageId(@NonNull Integer messageId) {
         if (messageId == null) {
            throw new NullPointerException("messageId is marked non-null but is null");
         } else {
            this.messageId = messageId;
            return this;
         }
      }

      public StopPoll build() {
         return new StopPoll(this.chatId, this.messageId);
      }

      public String toString() {
         return "StopPoll.StopPollBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ")";
      }
   }
}
