package org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultCachedSticker implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String STICKER_FILE_ID_FIELD = "sticker_file_id";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   @JsonProperty("type")
   private final String type = "sticker";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("sticker_file_id")
   @NonNull
   private String stickerFileId;
   @JsonProperty("input_message_content")
   private InputMessageContent inputMessageContent;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.stickerFileId != null && !this.stickerFileId.isEmpty()) {
            if (this.inputMessageContent != null) {
               this.inputMessageContent.validate();
            }

            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         } else {
            throw new TelegramApiValidationException("StickerFileId parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultCachedSticker.InlineQueryResultCachedStickerBuilder builder() {
      return new InlineQueryResultCachedSticker.InlineQueryResultCachedStickerBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultCachedSticker)) {
         return false;
      } else {
         InlineQueryResultCachedSticker other = (InlineQueryResultCachedSticker)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label71: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label71;
                  }
               } else if (this$type.equals(other$type)) {
                  break label71;
               }

               return false;
            }

            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
               return false;
            }

            label57: {
               Object this$stickerFileId = this.getStickerFileId();
               Object other$stickerFileId = other.getStickerFileId();
               if (this$stickerFileId == null) {
                  if (other$stickerFileId == null) {
                     break label57;
                  }
               } else if (this$stickerFileId.equals(other$stickerFileId)) {
                  break label57;
               }

               return false;
            }

            Object this$inputMessageContent = this.getInputMessageContent();
            Object other$inputMessageContent = other.getInputMessageContent();
            if (this$inputMessageContent == null) {
               if (other$inputMessageContent != null) {
                  return false;
               }
            } else if (!this$inputMessageContent.equals(other$inputMessageContent)) {
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
      return other instanceof InlineQueryResultCachedSticker;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $type = this.getType();
      int result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $stickerFileId = this.getStickerFileId();
      result = result * 59 + ($stickerFileId == null ? 43 : $stickerFileId.hashCode());
      Object $inputMessageContent = this.getInputMessageContent();
      result = result * 59 + ($inputMessageContent == null ? 43 : $inputMessageContent.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      return result;
   }

   public String getType() {
      Objects.requireNonNull(this);
      return "sticker";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getStickerFileId() {
      return this.stickerFileId;
   }

   public InputMessageContent getInputMessageContent() {
      return this.inputMessageContent;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
   }

   @JsonProperty("id")
   public void setId(@NonNull String id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
      }
   }

   @JsonProperty("sticker_file_id")
   public void setStickerFileId(@NonNull String stickerFileId) {
      if (stickerFileId == null) {
         throw new NullPointerException("stickerFileId is marked non-null but is null");
      } else {
         this.stickerFileId = stickerFileId;
      }
   }

   @JsonProperty("input_message_content")
   public void setInputMessageContent(InputMessageContent inputMessageContent) {
      this.inputMessageContent = inputMessageContent;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   public String toString() {
      return "InlineQueryResultCachedSticker(type=" + this.getType() + ", id=" + this.getId() + ", stickerFileId=" + this.getStickerFileId() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ")";
   }

   public InlineQueryResultCachedSticker(@NonNull String id, @NonNull String stickerFileId) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (stickerFileId == null) {
         throw new NullPointerException("stickerFileId is marked non-null but is null");
      } else {
         this.id = id;
         this.stickerFileId = stickerFileId;
      }
   }

   public InlineQueryResultCachedSticker() {
   }

   public InlineQueryResultCachedSticker(@NonNull String id, @NonNull String stickerFileId, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (stickerFileId == null) {
         throw new NullPointerException("stickerFileId is marked non-null but is null");
      } else {
         this.id = id;
         this.stickerFileId = stickerFileId;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
      }
   }

   public static class InlineQueryResultCachedStickerBuilder {
      private String id;
      private String stickerFileId;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;

      InlineQueryResultCachedStickerBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultCachedSticker.InlineQueryResultCachedStickerBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("sticker_file_id")
      public InlineQueryResultCachedSticker.InlineQueryResultCachedStickerBuilder stickerFileId(@NonNull String stickerFileId) {
         if (stickerFileId == null) {
            throw new NullPointerException("stickerFileId is marked non-null but is null");
         } else {
            this.stickerFileId = stickerFileId;
            return this;
         }
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultCachedSticker.InlineQueryResultCachedStickerBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultCachedSticker.InlineQueryResultCachedStickerBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public InlineQueryResultCachedSticker build() {
         return new InlineQueryResultCachedSticker(this.id, this.stickerFileId, this.inputMessageContent, this.replyMarkup);
      }

      public String toString() {
         return "InlineQueryResultCachedSticker.InlineQueryResultCachedStickerBuilder(id=" + this.id + ", stickerFileId=" + this.stickerFileId + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ")";
      }
   }
}
