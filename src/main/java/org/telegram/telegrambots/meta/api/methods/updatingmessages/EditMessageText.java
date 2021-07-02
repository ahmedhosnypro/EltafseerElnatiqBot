package org.telegram.telegrambots.meta.api.methods.updatingmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class EditMessageText extends BotApiMethod<Serializable> {
   public static final String PATH = "editmessagetext";
   private static final String CHATID_FIELD = "chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
   private static final String TEXT_FIELD = "text";
   private static final String PARSE_MODE_FIELD = "parse_mode";
   private static final String DISABLE_WEB_PREVIEW_FIELD = "disable_web_page_preview";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   private static final String ENTITIES_FIELD = "entities";
   @JsonProperty("chat_id")
   private String chatId;
   @JsonProperty("message_id")
   private Integer messageId;
   @JsonProperty("inline_message_id")
   private String inlineMessageId;
   @JsonProperty("text")
   @NonNull
   private String text;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("disable_web_page_preview")
   private Boolean disableWebPagePreview;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("entities")
   private List<MessageEntity> entities;

   public void disableWebPagePreview() {
      this.disableWebPagePreview = true;
   }

   public void enableWebPagePreview() {
      this.disableWebPagePreview = null;
   }

   public void enableMarkdown(boolean enable) {
      if (enable) {
         this.parseMode = "Markdown";
      } else {
         this.parseMode = null;
      }

   }

   public void enableHtml(boolean enable) {
      if (enable) {
         this.parseMode = "html";
      } else {
         this.parseMode = null;
      }

   }

   public String getMethod() {
      return "editmessagetext";
   }

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

      if (this.text != null && !this.text.isEmpty()) {
         if (this.parseMode != null && this.entities != null && !this.entities.isEmpty()) {
            throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
         } else {
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("Text parameter can't be empty", this);
      }
   }

   public static EditMessageText.EditMessageTextBuilder builder() {
      return new EditMessageText.EditMessageTextBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EditMessageText)) {
         return false;
      } else {
         EditMessageText other = (EditMessageText)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label107: {
               Object this$messageId = this.getMessageId();
               Object other$messageId = other.getMessageId();
               if (this$messageId == null) {
                  if (other$messageId == null) {
                     break label107;
                  }
               } else if (this$messageId.equals(other$messageId)) {
                  break label107;
               }

               return false;
            }

            Object this$disableWebPagePreview = this.getDisableWebPagePreview();
            Object other$disableWebPagePreview = other.getDisableWebPagePreview();
            if (this$disableWebPagePreview == null) {
               if (other$disableWebPagePreview != null) {
                  return false;
               }
            } else if (!this$disableWebPagePreview.equals(other$disableWebPagePreview)) {
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

            label86: {
               Object this$inlineMessageId = this.getInlineMessageId();
               Object other$inlineMessageId = other.getInlineMessageId();
               if (this$inlineMessageId == null) {
                  if (other$inlineMessageId == null) {
                     break label86;
                  }
               } else if (this$inlineMessageId.equals(other$inlineMessageId)) {
                  break label86;
               }

               return false;
            }

            label79: {
               Object this$text = this.getText();
               Object other$text = other.getText();
               if (this$text == null) {
                  if (other$text == null) {
                     break label79;
                  }
               } else if (this$text.equals(other$text)) {
                  break label79;
               }

               return false;
            }

            label72: {
               Object this$parseMode = this.getParseMode();
               Object other$parseMode = other.getParseMode();
               if (this$parseMode == null) {
                  if (other$parseMode == null) {
                     break label72;
                  }
               } else if (this$parseMode.equals(other$parseMode)) {
                  break label72;
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

            Object this$entities = this.getEntities();
            Object other$entities = other.getEntities();
            if (this$entities == null) {
               if (other$entities != null) {
                  return false;
               }
            } else if (!this$entities.equals(other$entities)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof EditMessageText;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
      Object $disableWebPagePreview = this.getDisableWebPagePreview();
      result = result * 59 + ($disableWebPagePreview == null ? 43 : $disableWebPagePreview.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $inlineMessageId = this.getInlineMessageId();
      result = result * 59 + ($inlineMessageId == null ? 43 : $inlineMessageId.hashCode());
      Object $text = this.getText();
      result = result * 59 + ($text == null ? 43 : $text.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $entities = this.getEntities();
      result = result * 59 + ($entities == null ? 43 : $entities.hashCode());
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
   public String getText() {
      return this.text;
   }

   public String getParseMode() {
      return this.parseMode;
   }

   public Boolean getDisableWebPagePreview() {
      return this.disableWebPagePreview;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
   }

   public List<MessageEntity> getEntities() {
      return this.entities;
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

   @JsonProperty("text")
   public void setText(@NonNull String text) {
      if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.text = text;
      }
   }

   @JsonProperty("parse_mode")
   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   @JsonProperty("disable_web_page_preview")
   public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
      this.disableWebPagePreview = disableWebPagePreview;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("entities")
   public void setEntities(List<MessageEntity> entities) {
      this.entities = entities;
   }

   public String toString() {
      return "EditMessageText(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ", inlineMessageId=" + this.getInlineMessageId() + ", text=" + this.getText() + ", parseMode=" + this.getParseMode() + ", disableWebPagePreview=" + this.getDisableWebPagePreview() + ", replyMarkup=" + this.getReplyMarkup() + ", entities=" + this.getEntities() + ")";
   }

   public EditMessageText(@NonNull String text) {
      if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.text = text;
      }
   }

   public EditMessageText() {
   }

   public EditMessageText(String chatId, Integer messageId, String inlineMessageId, @NonNull String text, String parseMode, Boolean disableWebPagePreview, InlineKeyboardMarkup replyMarkup, List<MessageEntity> entities) {
      if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.messageId = messageId;
         this.inlineMessageId = inlineMessageId;
         this.text = text;
         this.parseMode = parseMode;
         this.disableWebPagePreview = disableWebPagePreview;
         this.replyMarkup = replyMarkup;
         this.entities = entities;
      }
   }

   public static class EditMessageTextBuilder {
      private String chatId;
      private Integer messageId;
      private String inlineMessageId;
      private String text;
      private String parseMode;
      private Boolean disableWebPagePreview;
      private InlineKeyboardMarkup replyMarkup;
      private List<MessageEntity> entities;

      EditMessageTextBuilder() {
      }

      @JsonProperty("chat_id")
      public EditMessageText.EditMessageTextBuilder chatId(String chatId) {
         this.chatId = chatId;
         return this;
      }

      @JsonProperty("message_id")
      public EditMessageText.EditMessageTextBuilder messageId(Integer messageId) {
         this.messageId = messageId;
         return this;
      }

      @JsonProperty("inline_message_id")
      public EditMessageText.EditMessageTextBuilder inlineMessageId(String inlineMessageId) {
         this.inlineMessageId = inlineMessageId;
         return this;
      }

      @JsonProperty("text")
      public EditMessageText.EditMessageTextBuilder text(@NonNull String text) {
         if (text == null) {
            throw new NullPointerException("text is marked non-null but is null");
         } else {
            this.text = text;
            return this;
         }
      }

      @JsonProperty("parse_mode")
      public EditMessageText.EditMessageTextBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      @JsonProperty("disable_web_page_preview")
      public EditMessageText.EditMessageTextBuilder disableWebPagePreview(Boolean disableWebPagePreview) {
         this.disableWebPagePreview = disableWebPagePreview;
         return this;
      }

      @JsonProperty("reply_markup")
      public EditMessageText.EditMessageTextBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("entities")
      public EditMessageText.EditMessageTextBuilder entities(List<MessageEntity> entities) {
         this.entities = entities;
         return this;
      }

      public EditMessageText build() {
         return new EditMessageText(this.chatId, this.messageId, this.inlineMessageId, this.text, this.parseMode, this.disableWebPagePreview, this.replyMarkup, this.entities);
      }

      public String toString() {
         return "EditMessageText.EditMessageTextBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ", inlineMessageId=" + this.inlineMessageId + ", text=" + this.text + ", parseMode=" + this.parseMode + ", disableWebPagePreview=" + this.disableWebPagePreview + ", replyMarkup=" + this.replyMarkup + ", entities=" + this.entities + ")";
      }
   }
}
