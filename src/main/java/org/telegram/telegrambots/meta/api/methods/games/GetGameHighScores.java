package org.telegram.telegrambots.meta.api.methods.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.games.GameHighScore;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetGameHighScores extends BotApiMethod<ArrayList<GameHighScore>> {
   public static final String PATH = "getGameHighScores";
   private static final String CHATID_FIELD = "chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
   private static final String USER_ID_FIELD = "user_id";
   @JsonProperty("chat_id")
   private String chatId;
   @JsonProperty("message_id")
   private Integer messageId;
   @JsonProperty("inline_message_id")
   private String inlineMessageId;
   @JsonProperty("user_id")
   @NonNull
   private Long userId;

   public String getMethod() {
      return "getGameHighScores";
   }

   public ArrayList<GameHighScore> deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<ArrayList<GameHighScore>> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<ArrayList<GameHighScore>>>() {
         });
         if (result.getOk()) {
            return (ArrayList)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error getting game high scores", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.userId == null) {
         throw new TelegramApiValidationException("UserId parameter can't be empty", this);
      } else {
         if (this.inlineMessageId == null) {
            if (this.chatId == null || this.chatId.isEmpty()) {
               throw new TelegramApiValidationException("ChatId parameter can't be empty if inlineMessageId is not present", this);
            }

            if (this.messageId == null) {
               throw new TelegramApiValidationException("MessageId parameter can't be empty if inlineMessageId is not present", this);
            }
         } else {
            if (this.chatId != null) {
               throw new TelegramApiValidationException("ChatId parameter must be empty if inlineMessageId is provided", this);
            }

            if (this.messageId != null) {
               throw new TelegramApiValidationException("MessageId parameter must be empty if inlineMessageId is provided", this);
            }
         }

      }
   }

   public static GetGameHighScores.GetGameHighScoresBuilder builder() {
      return new GetGameHighScores.GetGameHighScoresBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetGameHighScores)) {
         return false;
      } else {
         GetGameHighScores other = (GetGameHighScores)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$messageId = this.getMessageId();
               Object other$messageId = other.getMessageId();
               if (this$messageId == null) {
                  if (other$messageId == null) {
                     break label59;
                  }
               } else if (this$messageId.equals(other$messageId)) {
                  break label59;
               }

               return false;
            }

            Object this$userId = this.getUserId();
            Object other$userId = other.getUserId();
            if (this$userId == null) {
               if (other$userId != null) {
                  return false;
               }
            } else if (!this$userId.equals(other$userId)) {
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

            Object this$inlineMessageId = this.getInlineMessageId();
            Object other$inlineMessageId = other.getInlineMessageId();
            if (this$inlineMessageId == null) {
               if (other$inlineMessageId != null) {
                  return false;
               }
            } else if (!this$inlineMessageId.equals(other$inlineMessageId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetGameHighScores;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
      Object $userId = this.getUserId();
      result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $inlineMessageId = this.getInlineMessageId();
      result = result * 59 + ($inlineMessageId == null ? 43 : $inlineMessageId.hashCode());
      return result;
   }

   public String getChatId() {
      return this.chatId;
   }

   public Integer getMessageId() {
      return this.messageId;
   }

   public String getInlineMessageId() {
      return this.inlineMessageId;
   }

   @NonNull
   public Long getUserId() {
      return this.userId;
   }

   @JsonProperty("chat_id")
   public void setChatId(String chatId) {
      this.chatId = chatId;
   }

   @JsonProperty("message_id")
   public void setMessageId(Integer messageId) {
      this.messageId = messageId;
   }

   @JsonProperty("inline_message_id")
   public void setInlineMessageId(String inlineMessageId) {
      this.inlineMessageId = inlineMessageId;
   }

   @JsonProperty("user_id")
   public void setUserId(@NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
      }
   }

   public String toString() {
      return "GetGameHighScores(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ", inlineMessageId=" + this.getInlineMessageId() + ", userId=" + this.getUserId() + ")";
   }

   public GetGameHighScores() {
   }

   public GetGameHighScores(@NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
      }
   }

   public GetGameHighScores(String chatId, Integer messageId, String inlineMessageId, @NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.messageId = messageId;
         this.inlineMessageId = inlineMessageId;
         this.userId = userId;
      }
   }

   public static class GetGameHighScoresBuilder {
      private String chatId;
      private Integer messageId;
      private String inlineMessageId;
      private Long userId;

      GetGameHighScoresBuilder() {
      }

      @JsonProperty("chat_id")
      public GetGameHighScores.GetGameHighScoresBuilder chatId(String chatId) {
         this.chatId = chatId;
         return this;
      }

      @JsonProperty("message_id")
      public GetGameHighScores.GetGameHighScoresBuilder messageId(Integer messageId) {
         this.messageId = messageId;
         return this;
      }

      @JsonProperty("inline_message_id")
      public GetGameHighScores.GetGameHighScoresBuilder inlineMessageId(String inlineMessageId) {
         this.inlineMessageId = inlineMessageId;
         return this;
      }

      @JsonProperty("user_id")
      public GetGameHighScores.GetGameHighScoresBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      public GetGameHighScores build() {
         return new GetGameHighScores(this.chatId, this.messageId, this.inlineMessageId, this.userId);
      }

      public String toString() {
         return "GetGameHighScores.GetGameHighScoresBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ", inlineMessageId=" + this.inlineMessageId + ", userId=" + this.userId + ")";
      }
   }
}
