package org.telegram.telegrambots.meta.api.methods.updatingmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.io.Serializable;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class EditMessageReplyMarkup extends BotApiMethod<Serializable> {
   public static final String PATH = "editmessagereplymarkup";
   private static final String CHATID_FIELD = "chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   @JsonProperty("chat_id")
   private String chatId;
   @JsonProperty("message_id")
   private Integer messageId;
   @JsonProperty("inline_message_id")
   private String inlineMessageId;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;

   public String getMethod() {
      return "editmessagereplymarkup";
   }

   public Serializable deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Serializable)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error editing message reply markup", result);
         }
      } catch (IOException var5) {
         try {
            ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
            });
            if (result.getOk()) {
               return (Serializable)result.getResult();
            } else {
               throw new TelegramApiRequestException("Error editing message reply markup", result);
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

      if (this.replyMarkup != null) {
         this.replyMarkup.validate();
      }

   }

   public static EditMessageReplyMarkup.EditMessageReplyMarkupBuilder builder() {
      return new EditMessageReplyMarkup.EditMessageReplyMarkupBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EditMessageReplyMarkup)) {
         return false;
      } else {
         EditMessageReplyMarkup other = (EditMessageReplyMarkup)o;
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
      return other instanceof EditMessageReplyMarkup;
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

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   public String toString() {
      return "EditMessageReplyMarkup(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ", inlineMessageId=" + this.getInlineMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ")";
   }

   public EditMessageReplyMarkup() {
   }

   public EditMessageReplyMarkup(String chatId, Integer messageId, String inlineMessageId, InlineKeyboardMarkup replyMarkup) {
      this.chatId = chatId;
      this.messageId = messageId;
      this.inlineMessageId = inlineMessageId;
      this.replyMarkup = replyMarkup;
   }

   public static class EditMessageReplyMarkupBuilder {
      private String chatId;
      private Integer messageId;
      private String inlineMessageId;
      private InlineKeyboardMarkup replyMarkup;

      EditMessageReplyMarkupBuilder() {
      }

      @JsonProperty("chat_id")
      public EditMessageReplyMarkup.EditMessageReplyMarkupBuilder chatId(String chatId) {
         this.chatId = chatId;
         return this;
      }

      @JsonProperty("message_id")
      public EditMessageReplyMarkup.EditMessageReplyMarkupBuilder messageId(Integer messageId) {
         this.messageId = messageId;
         return this;
      }

      @JsonProperty("inline_message_id")
      public EditMessageReplyMarkup.EditMessageReplyMarkupBuilder inlineMessageId(String inlineMessageId) {
         this.inlineMessageId = inlineMessageId;
         return this;
      }

      @JsonProperty("reply_markup")
      public EditMessageReplyMarkup.EditMessageReplyMarkupBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public EditMessageReplyMarkup build() {
         return new EditMessageReplyMarkup(this.chatId, this.messageId, this.inlineMessageId, this.replyMarkup);
      }

      public String toString() {
         return "EditMessageReplyMarkup.EditMessageReplyMarkupBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ", inlineMessageId=" + this.inlineMessageId + ", replyMarkup=" + this.replyMarkup + ")";
      }
   }
}
