package org.telegram.telegrambots.meta.api.methods.updatingmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.io.Serializable;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class EditMessageMedia extends PartialBotApiMethod<Serializable> {
   public static final String PATH = "editMessageMedia";
   public static final String CHATID_FIELD = "chat_id";
   public static final String MESSAGEID_FIELD = "message_id";
   public static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
   public static final String MEDIA_FIELD = "media";
   public static final String REPLYMARKUP_FIELD = "reply_markup";
   @JsonProperty("chat_id")
   private String chatId;
   @JsonProperty("message_id")
   private Integer messageId;
   @JsonProperty("inline_message_id")
   private String inlineMessageId;
   @JsonProperty("media")
   @NonNull
   private InputMedia media;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;

   public Serializable deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Serializable)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error editing message text", result);
         }
      } catch (IOException var5) {
         try {
            ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
            });
            if (result.getOk()) {
               return (Serializable)result.getResult();
            } else {
               throw new TelegramApiRequestException("Error editing message text", result);
            }
         } catch (IOException var4) {
            throw new TelegramApiRequestException("Unable to deserialize response", var5);
         }
      }
   }

   public void validate() throws TelegramApiValidationException {
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

      if (this.media == null) {
         throw new TelegramApiValidationException("Media parameter can't be empty", this);
      } else {
         this.media.validate();
         if (this.replyMarkup != null) {
            this.replyMarkup.validate();
         }

      }
   }

   public static EditMessageMedia.EditMessageMediaBuilder builder() {
      return new EditMessageMedia.EditMessageMediaBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EditMessageMedia)) {
         return false;
      } else {
         EditMessageMedia other = (EditMessageMedia)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label71: {
               Object this$messageId = this.getMessageId();
               Object other$messageId = other.getMessageId();
               if (this$messageId == null) {
                  if (other$messageId == null) {
                     break label71;
                  }
               } else if (this$messageId.equals(other$messageId)) {
                  break label71;
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

            label57: {
               Object this$inlineMessageId = this.getInlineMessageId();
               Object other$inlineMessageId = other.getInlineMessageId();
               if (this$inlineMessageId == null) {
                  if (other$inlineMessageId == null) {
                     break label57;
                  }
               } else if (this$inlineMessageId.equals(other$inlineMessageId)) {
                  break label57;
               }

               return false;
            }

            Object this$media = this.getMedia();
            Object other$media = other.getMedia();
            if (this$media == null) {
               if (other$media != null) {
                  return false;
               }
            } else if (!this$media.equals(other$media)) {
               return false;
            }

            Object this$replyMarkup = this.getReplyMarkup();
            Object other$replyMarkup = other.getReplyMarkup();
            if (this$replyMarkup == null) {
               if (other$replyMarkup == null) {
                  return true;
               }
            } else if (this$replyMarkup.equals(other$replyMarkup)) {
               return true;
            }

            return false;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof EditMessageMedia;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $inlineMessageId = this.getInlineMessageId();
      result = result * 59 + ($inlineMessageId == null ? 43 : $inlineMessageId.hashCode());
      Object $media = this.getMedia();
      result = result * 59 + ($media == null ? 43 : $media.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
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
   public InputMedia getMedia() {
      return this.media;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
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

   @JsonProperty("media")
   public void setMedia(@NonNull InputMedia media) {
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      } else {
         this.media = media;
      }
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   public String toString() {
      return "EditMessageMedia(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ", inlineMessageId=" + this.getInlineMessageId() + ", media=" + this.getMedia() + ", replyMarkup=" + this.getReplyMarkup() + ")";
   }

   public EditMessageMedia(@NonNull InputMedia media) {
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      } else {
         this.media = media;
      }
   }

   public EditMessageMedia() {
   }

   public EditMessageMedia(String chatId, Integer messageId, String inlineMessageId, @NonNull InputMedia media, InlineKeyboardMarkup replyMarkup) {
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.messageId = messageId;
         this.inlineMessageId = inlineMessageId;
         this.media = media;
         this.replyMarkup = replyMarkup;
      }
   }

   public static class EditMessageMediaBuilder {
      private String chatId;
      private Integer messageId;
      private String inlineMessageId;
      private InputMedia media;
      private InlineKeyboardMarkup replyMarkup;

      EditMessageMediaBuilder() {
      }

      @JsonProperty("chat_id")
      public EditMessageMedia.EditMessageMediaBuilder chatId(String chatId) {
         this.chatId = chatId;
         return this;
      }

      @JsonProperty("message_id")
      public EditMessageMedia.EditMessageMediaBuilder messageId(Integer messageId) {
         this.messageId = messageId;
         return this;
      }

      @JsonProperty("inline_message_id")
      public EditMessageMedia.EditMessageMediaBuilder inlineMessageId(String inlineMessageId) {
         this.inlineMessageId = inlineMessageId;
         return this;
      }

      @JsonProperty("media")
      public EditMessageMedia.EditMessageMediaBuilder media(@NonNull InputMedia media) {
         if (media == null) {
            throw new NullPointerException("media is marked non-null but is null");
         } else {
            this.media = media;
            return this;
         }
      }

      @JsonProperty("reply_markup")
      public EditMessageMedia.EditMessageMediaBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public EditMessageMedia build() {
         return new EditMessageMedia(this.chatId, this.messageId, this.inlineMessageId, this.media, this.replyMarkup);
      }

      public String toString() {
         return "EditMessageMedia.EditMessageMediaBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ", inlineMessageId=" + this.inlineMessageId + ", media=" + this.media + ", replyMarkup=" + this.replyMarkup + ")";
      }
   }
}
