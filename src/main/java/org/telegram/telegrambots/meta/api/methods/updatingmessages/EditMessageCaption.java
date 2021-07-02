package org.telegram.telegrambots.meta.api.methods.updatingmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class EditMessageCaption extends BotApiMethod<Serializable> {
   public static final String PATH = "editmessagecaption";
   private static final String CHATID_FIELD = "chat_id";
   private static final String MESSAGEID_FIELD = "message_id";
   private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
   private static final String CAPTION_FIELD = "caption";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("chat_id")
   private String chatId;
   @JsonProperty("message_id")
   private Integer messageId;
   @JsonProperty("inline_message_id")
   private String inlineMessageId;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;

   public String getMethod() {
      return "editmessagecaption";
   }

   public Serializable deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Serializable)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error editing message caption", result);
         }
      } catch (IOException var5) {
         try {
            ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
            });
            if (result.getOk()) {
               return (Serializable)result.getResult();
            } else {
               throw new TelegramApiRequestException("Error editing message caption", result);
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

      if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
         throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
      } else {
         if (this.replyMarkup != null) {
            this.replyMarkup.validate();
         }

      }
   }

   public static EditMessageCaption.EditMessageCaptionBuilder builder() {
      return new EditMessageCaption.EditMessageCaptionBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EditMessageCaption)) {
         return false;
      } else {
         EditMessageCaption other = (EditMessageCaption)o;
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

            label74: {
               Object this$caption = this.getCaption();
               Object other$caption = other.getCaption();
               if (this$caption == null) {
                  if (other$caption == null) {
                     break label74;
                  }
               } else if (this$caption.equals(other$caption)) {
                  break label74;
               }

               return false;
            }

            label67: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label67;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label67;
               }

               return false;
            }

            Object this$parseMode = this.getParseMode();
            Object other$parseMode = other.getParseMode();
            if (this$parseMode == null) {
               if (other$parseMode != null) {
                  return false;
               }
            } else if (!this$parseMode.equals(other$parseMode)) {
               return false;
            }

            Object this$captionEntities = this.getCaptionEntities();
            Object other$captionEntities = other.getCaptionEntities();
            if (this$captionEntities == null) {
               if (other$captionEntities != null) {
                  return false;
               }
            } else if (!this$captionEntities.equals(other$captionEntities)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof EditMessageCaption;
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
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $captionEntities = this.getCaptionEntities();
      result = result * 59 + ($captionEntities == null ? 43 : $captionEntities.hashCode());
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

   public String getCaption() {
      return this.caption;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
   }

   public String getParseMode() {
      return this.parseMode;
   }

   public List<MessageEntity> getCaptionEntities() {
      return this.captionEntities;
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

   @JsonProperty("caption")
   public void setCaption(String caption) {
      this.caption = caption;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("parse_mode")
   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   @JsonProperty("caption_entities")
   public void setCaptionEntities(List<MessageEntity> captionEntities) {
      this.captionEntities = captionEntities;
   }

   public String toString() {
      return "EditMessageCaption(chatId=" + this.getChatId() + ", messageId=" + this.getMessageId() + ", inlineMessageId=" + this.getInlineMessageId() + ", caption=" + this.getCaption() + ", replyMarkup=" + this.getReplyMarkup() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public EditMessageCaption() {
   }

   public EditMessageCaption(String chatId, Integer messageId, String inlineMessageId, String caption, InlineKeyboardMarkup replyMarkup, String parseMode, List<MessageEntity> captionEntities) {
      this.chatId = chatId;
      this.messageId = messageId;
      this.inlineMessageId = inlineMessageId;
      this.caption = caption;
      this.replyMarkup = replyMarkup;
      this.parseMode = parseMode;
      this.captionEntities = captionEntities;
   }

   public static class EditMessageCaptionBuilder {
      private String chatId;
      private Integer messageId;
      private String inlineMessageId;
      private String caption;
      private InlineKeyboardMarkup replyMarkup;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      EditMessageCaptionBuilder() {
      }

      @JsonProperty("chat_id")
      public EditMessageCaption.EditMessageCaptionBuilder chatId(String chatId) {
         this.chatId = chatId;
         return this;
      }

      @JsonProperty("message_id")
      public EditMessageCaption.EditMessageCaptionBuilder messageId(Integer messageId) {
         this.messageId = messageId;
         return this;
      }

      @JsonProperty("inline_message_id")
      public EditMessageCaption.EditMessageCaptionBuilder inlineMessageId(String inlineMessageId) {
         this.inlineMessageId = inlineMessageId;
         return this;
      }

      @JsonProperty("caption")
      public EditMessageCaption.EditMessageCaptionBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("reply_markup")
      public EditMessageCaption.EditMessageCaptionBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("parse_mode")
      public EditMessageCaption.EditMessageCaptionBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public EditMessageCaption.EditMessageCaptionBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public EditMessageCaption.EditMessageCaptionBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
         if (captionEntities == null) {
            throw new NullPointerException("captionEntities cannot be null");
         } else {
            if (this.captionEntities == null) {
               this.captionEntities = new ArrayList();
            }

            this.captionEntities.addAll(captionEntities);
            return this;
         }
      }

      public EditMessageCaption.EditMessageCaptionBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public EditMessageCaption build() {
         List captionEntities;
         switch(this.captionEntities == null ? 0 : this.captionEntities.size()) {
         case 0:
            captionEntities = Collections.emptyList();
            break;
         case 1:
            captionEntities = Collections.singletonList((MessageEntity)this.captionEntities.get(0));
            break;
         default:
            captionEntities = Collections.unmodifiableList(new ArrayList(this.captionEntities));
         }

         return new EditMessageCaption(this.chatId, this.messageId, this.inlineMessageId, this.caption, this.replyMarkup, this.parseMode, captionEntities);
      }

      public String toString() {
         return "EditMessageCaption.EditMessageCaptionBuilder(chatId=" + this.chatId + ", messageId=" + this.messageId + ", inlineMessageId=" + this.inlineMessageId + ", caption=" + this.caption + ", replyMarkup=" + this.replyMarkup + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
