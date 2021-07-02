package org.telegram.telegrambots.meta.api.methods.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.io.Serializable;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetGameScore extends BotApiMethod<Serializable> {
   public static final String PATH = "setGameScore";
   private static final String USER_ID_FIELD = "user_id";
   private static final String SCORE_FIELD = "score";
   private static final String CHATID_FIELD = "chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
   private static final String DISABLEEDITMESSAGE_FIELD = "disable_edit_message";
   private static final String FORCE_FIELD = "force";
   @JsonProperty("chat_id")
   private String chatId;
   @JsonProperty("message_id")
   private Integer messageId;
   @JsonProperty("inline_message_id")
   private String inlineMessageId;
   @JsonProperty("disable_edit_message")
   private Boolean disableEditMessage;
   @JsonProperty("user_id")
   @NonNull
   private Long userId;
   @JsonProperty("score")
   @NonNull
   private Integer score;
   @JsonProperty("force")
   private Boolean force;

   public String getMethod() {
      return "setGameScore";
   }

   public Serializable deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Serializable)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error setting game score", result);
         }
      } catch (IOException var5) {
         try {
            ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
            });
            if (result.getOk()) {
               return (Serializable)result.getResult();
            } else {
               throw new TelegramApiRequestException("Error setting game score", result);
            }
         } catch (IOException var4) {
            throw new TelegramApiRequestException("Unable to deserialize response", var4);
         }
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.userId == null) {
         throw new TelegramApiValidationException("UserId parameter can't be empty", this);
      } else if (this.score == null) {
         throw new TelegramApiValidationException("Score parameter can't be empty", this);
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

   public static SetGameScore.SetGameScoreBuilder builder() {
      return new SetGameScore.SetGameScoreBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetGameScore)) {
         return false;
      } else {
         SetGameScore other = (SetGameScore)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label95: {
               Object this$messageId = this.getMessageId();
               Object other$messageId = other.getMessageId();
               if (this$messageId == null) {
                  if (other$messageId == null) {
                     break label95;
                  }
               } else if (this$messageId.equals(other$messageId)) {
                  break label95;
               }

               return false;
            }

            Object this$disableEditMessage = this.getDisableEditMessage();
            Object other$disableEditMessage = other.getDisableEditMessage();
            if (this$disableEditMessage == null) {
               if (other$disableEditMessage != null) {
                  return false;
               }
            } else if (!this$disableEditMessage.equals(other$disableEditMessage)) {
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

            label74: {
               Object this$score = this.getScore();
               Object other$score = other.getScore();
               if (this$score == null) {
                  if (other$score == null) {
                     break label74;
                  }
               } else if (this$score.equals(other$score)) {
                  break label74;
               }

               return false;
            }

            label67: {
               Object this$force = this.getForce();
               Object other$force = other.getForce();
               if (this$force == null) {
                  if (other$force == null) {
                     break label67;
                  }
               } else if (this$force.equals(other$force)) {
                  break label67;
               }

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
      return other instanceof SetGameScore;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
      Object $disableEditMessage = this.getDisableEditMessage();
      result = result * 59 + ($disableEditMessage == null ? 43 : $disableEditMessage.hashCode());
      Object $userId = this.getUserId();
      result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $score = this.getScore();
      result = result * 59 + ($score == null ? 43 : $score.hashCode());
      Object $force = this.getForce();
      result = result * 59 + ($force == null ? 43 : $force.hashCode());
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

   public Boolean getDisableEditMessage() {
      return this.disableEditMessage;
   }

   @NonNull
   public Long getUserId() {
      return this.userId;
   }

   @NonNull
   public Integer getScore() {
      return this.score;
   }

   public Boolean getForce() {
      return this.force;
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

   @JsonProperty("disable_edit_message")
   public void setDisableEditMessage(Boolean disableEditMessage) {
      this.disableEditMessage = disableEditMessage;
   }

   @JsonProperty("user_id")
   public void setUserId(@NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
      }
   }

   @JsonProperty("score")
   public void setScore(@NonNull Integer score) {
      if (score == null) {
         throw new NullPointerException("score is marked non-null but is null");
      } else {
         this.score = score;
      }
   }

   @JsonProperty("force")
   public void setForce(Boolean force) {
      this.force = force;
   }

   public String toString() {
      return "SetGameScore(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ", inlineMessageId=" + this.getInlineMessageId() + ", disableEditMessage=" + this.getDisableEditMessage() + ", userId=" + this.getUserId() + ", score=" + this.getScore() + ", force=" + this.getForce() + ")";
   }

   public SetGameScore() {
   }

   public SetGameScore(@NonNull Long userId, @NonNull Integer score) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else if (score == null) {
         throw new NullPointerException("score is marked non-null but is null");
      } else {
         this.userId = userId;
         this.score = score;
      }
   }

   public SetGameScore(String chatId, Integer messageId, String inlineMessageId, Boolean disableEditMessage, @NonNull Long userId, @NonNull Integer score, Boolean force) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else if (score == null) {
         throw new NullPointerException("score is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.messageId = messageId;
         this.inlineMessageId = inlineMessageId;
         this.disableEditMessage = disableEditMessage;
         this.userId = userId;
         this.score = score;
         this.force = force;
      }
   }

   public static class SetGameScoreBuilder {
      private String chatId;
      private Integer messageId;
      private String inlineMessageId;
      private Boolean disableEditMessage;
      private Long userId;
      private Integer score;
      private Boolean force;

      SetGameScoreBuilder() {
      }

      @JsonProperty("chat_id")
      public SetGameScore.SetGameScoreBuilder chatId(String chatId) {
         this.chatId = chatId;
         return this;
      }

      @JsonProperty("message_id")
      public SetGameScore.SetGameScoreBuilder messageId(Integer messageId) {
         this.messageId = messageId;
         return this;
      }

      @JsonProperty("inline_message_id")
      public SetGameScore.SetGameScoreBuilder inlineMessageId(String inlineMessageId) {
         this.inlineMessageId = inlineMessageId;
         return this;
      }

      @JsonProperty("disable_edit_message")
      public SetGameScore.SetGameScoreBuilder disableEditMessage(Boolean disableEditMessage) {
         this.disableEditMessage = disableEditMessage;
         return this;
      }

      @JsonProperty("user_id")
      public SetGameScore.SetGameScoreBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      @JsonProperty("score")
      public SetGameScore.SetGameScoreBuilder score(@NonNull Integer score) {
         if (score == null) {
            throw new NullPointerException("score is marked non-null but is null");
         } else {
            this.score = score;
            return this;
         }
      }

      @JsonProperty("force")
      public SetGameScore.SetGameScoreBuilder force(Boolean force) {
         this.force = force;
         return this;
      }

      public SetGameScore build() {
         return new SetGameScore(this.chatId, this.messageId, this.inlineMessageId, this.disableEditMessage, this.userId, this.score, this.force);
      }

      public String toString() {
         return "SetGameScore.SetGameScoreBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ", inlineMessageId=" + this.inlineMessageId + ", disableEditMessage=" + this.disableEditMessage + ", userId=" + this.userId + ", score=" + this.score + ", force=" + this.force + ")";
      }
   }
}
