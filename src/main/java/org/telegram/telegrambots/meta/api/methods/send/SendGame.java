package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendGame extends BotApiMethod<Message> {
   public static final String PATH = "sendGame";
   private static final String CHATID_FIELD = "chat_id";
   private static final String GAMESHORTNAME_FIELD = "game_short_name";
   private static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   private static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   private static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("game_short_name")
   @NonNull
   private String gameShortName;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;
   @JsonProperty("reply_to_message_id")
   private Integer replyToMessageId;
   @JsonProperty("reply_markup")
   private ReplyKeyboard replyMarkup;
   @JsonProperty("allow_sending_without_reply")
   private Boolean allowSendingWithoutReply;

   public void enableNotification() {
      this.disableNotification = null;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public String getMethod() {
      return "sendGame";
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending game", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.gameShortName != null && !this.gameShortName.isEmpty()) {
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         } else {
            throw new TelegramApiValidationException("GameShortName parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendGame.SendGameBuilder builder() {
      return new SendGame.SendGameBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendGame)) {
         return false;
      } else {
         SendGame other = (SendGame)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$disableNotification = this.getDisableNotification();
            Object other$disableNotification = other.getDisableNotification();
            if (this$disableNotification == null) {
               if (other$disableNotification != null) {
                  return false;
               }
            } else if (!this$disableNotification.equals(other$disableNotification)) {
               return false;
            }

            Object this$replyToMessageId = this.getReplyToMessageId();
            Object other$replyToMessageId = other.getReplyToMessageId();
            if (this$replyToMessageId == null) {
               if (other$replyToMessageId != null) {
                  return false;
               }
            } else if (!this$replyToMessageId.equals(other$replyToMessageId)) {
               return false;
            }

            Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
            Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
            if (this$allowSendingWithoutReply == null) {
               if (other$allowSendingWithoutReply != null) {
                  return false;
               }
            } else if (!this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
               return false;
            }

            label62: {
               Object this$chatId = this.getChatId();
               Object other$chatId = other.getChatId();
               if (this$chatId == null) {
                  if (other$chatId == null) {
                     break label62;
                  }
               } else if (this$chatId.equals(other$chatId)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$gameShortName = this.getGameShortName();
               Object other$gameShortName = other.getGameShortName();
               if (this$gameShortName == null) {
                  if (other$gameShortName == null) {
                     break label55;
                  }
               } else if (this$gameShortName.equals(other$gameShortName)) {
                  break label55;
               }

               return false;
            }

            Object this$replyMarkup = this.getReplyMarkup();
            Object other$replyMarkup = other.getReplyMarkup();
            if (this$replyMarkup == null) {
               if (other$replyMarkup != null) {
                  return false;
               }
            } else if (!this$replyMarkup.equals(other$replyMarkup)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SendGame;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $disableNotification = this.getDisableNotification();
      int result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $gameShortName = this.getGameShortName();
      result = result * 59 + ($gameShortName == null ? 43 : $gameShortName.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public String getGameShortName() {
      return this.gameShortName;
   }

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public ReplyKeyboard getReplyMarkup() {
      return this.replyMarkup;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("game_short_name")
   public void setGameShortName(@NonNull String gameShortName) {
      if (gameShortName == null) {
         throw new NullPointerException("gameShortName is marked non-null but is null");
      } else {
         this.gameShortName = gameShortName;
      }
   }

   @JsonProperty("disable_notification")
   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   @JsonProperty("reply_to_message_id")
   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(ReplyKeyboard replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("allow_sending_without_reply")
   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   public String toString() {
      return "SendGame(chatId=" + this.getChatId() + ", gameShortName=" + this.getGameShortName() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendGame(@NonNull String chatId, @NonNull String gameShortName) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (gameShortName == null) {
         throw new NullPointerException("gameShortName is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.gameShortName = gameShortName;
      }
   }

   public SendGame() {
   }

   public SendGame(@NonNull String chatId, @NonNull String gameShortName, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (gameShortName == null) {
         throw new NullPointerException("gameShortName is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.gameShortName = gameShortName;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendGameBuilder {
      private String chatId;
      private String gameShortName;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private Boolean allowSendingWithoutReply;

      SendGameBuilder() {
      }

      @JsonProperty("chat_id")
      public SendGame.SendGameBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("game_short_name")
      public SendGame.SendGameBuilder gameShortName(@NonNull String gameShortName) {
         if (gameShortName == null) {
            throw new NullPointerException("gameShortName is marked non-null but is null");
         } else {
            this.gameShortName = gameShortName;
            return this;
         }
      }

      @JsonProperty("disable_notification")
      public SendGame.SendGameBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      @JsonProperty("reply_to_message_id")
      public SendGame.SendGameBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      @JsonProperty("reply_markup")
      public SendGame.SendGameBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("allow_sending_without_reply")
      public SendGame.SendGameBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendGame build() {
         return new SendGame(this.chatId, this.gameShortName, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendGame.SendGameBuilder(chatId=" + this.chatId + ", gameShortName=" + this.gameShortName + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
