package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendSticker extends PartialBotApiMethod<Message> {
   public static final String PATH = "sendsticker";
   public static final String CHATID_FIELD = "chat_id";
   public static final String STICKER_FIELD = "sticker";
   public static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   public static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   public static final String REPLYMARKUP_FIELD = "reply_markup";
   public static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @NonNull
   private String chatId;
   @NonNull
   private InputFile sticker;
   private Boolean disableNotification;
   private Integer replyToMessageId;
   private ReplyKeyboard replyMarkup;
   private Boolean allowSendingWithoutReply;

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public void enableNotification() {
      this.disableNotification = false;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending sticker", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.sticker == null) {
            throw new TelegramApiValidationException("Sticker parameter can't be empty", this);
         } else {
            this.sticker.validate();
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendSticker.SendStickerBuilder builder() {
      return new SendSticker.SendStickerBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendSticker)) {
         return false;
      } else {
         SendSticker other = (SendSticker)o;
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
               Object this$sticker = this.getSticker();
               Object other$sticker = other.getSticker();
               if (this$sticker == null) {
                  if (other$sticker == null) {
                     break label55;
                  }
               } else if (this$sticker.equals(other$sticker)) {
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
      return other instanceof SendSticker;
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
      Object $sticker = this.getSticker();
      result = result * 59 + ($sticker == null ? 43 : $sticker.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public InputFile getSticker() {
      return this.sticker;
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

   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public void setSticker(@NonNull InputFile sticker) {
      if (sticker == null) {
         throw new NullPointerException("sticker is marked non-null but is null");
      } else {
         this.sticker = sticker;
      }
   }

   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   public void setReplyMarkup(ReplyKeyboard replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   public String toString() {
      return "SendSticker(chatId=" + this.getChatId() + ", sticker=" + this.getSticker() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendSticker(@NonNull String chatId, @NonNull InputFile sticker) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (sticker == null) {
         throw new NullPointerException("sticker is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.sticker = sticker;
      }
   }

   public SendSticker() {
   }

   public SendSticker(@NonNull String chatId, @NonNull InputFile sticker, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (sticker == null) {
         throw new NullPointerException("sticker is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.sticker = sticker;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendStickerBuilder {
      private String chatId;
      private InputFile sticker;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private Boolean allowSendingWithoutReply;

      SendStickerBuilder() {
      }

      public SendSticker.SendStickerBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public SendSticker.SendStickerBuilder sticker(@NonNull InputFile sticker) {
         if (sticker == null) {
            throw new NullPointerException("sticker is marked non-null but is null");
         } else {
            this.sticker = sticker;
            return this;
         }
      }

      public SendSticker.SendStickerBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      public SendSticker.SendStickerBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      public SendSticker.SendStickerBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public SendSticker.SendStickerBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendSticker build() {
         return new SendSticker(this.chatId, this.sticker, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendSticker.SendStickerBuilder(chatId=" + this.chatId + ", sticker=" + this.sticker + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
