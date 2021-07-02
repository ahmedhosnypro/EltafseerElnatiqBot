package org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultCachedMpeg4Gif implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String MPEG4_FILE_ID_FIELD = "mpeg4_file_id";
   private static final String TITLE_FIELD = "title";
   private static final String CAPTION_FIELD = "caption";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("type")
   private final String type = "mpeg4_gif";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("mpeg4_file_id")
   @NonNull
   private String mpeg4FileId;
   @JsonProperty("title")
   private String title;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("input_message_content")
   private InputMessageContent inputMessageContent;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.mpeg4FileId != null && !this.mpeg4FileId.isEmpty()) {
            if (this.inputMessageContent != null) {
               this.inputMessageContent.validate();
            }

            if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
               throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
            } else {
               if (this.replyMarkup != null) {
                  this.replyMarkup.validate();
               }

            }
         } else {
            throw new TelegramApiValidationException("Mpeg4FileId parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder builder() {
      return new InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultCachedMpeg4Gif)) {
         return false;
      } else {
         InlineQueryResultCachedMpeg4Gif other = (InlineQueryResultCachedMpeg4Gif)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label119: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label119;
                  }
               } else if (this$type.equals(other$type)) {
                  break label119;
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

            label105: {
               Object this$mpeg4FileId = this.getMpeg4FileId();
               Object other$mpeg4FileId = other.getMpeg4FileId();
               if (this$mpeg4FileId == null) {
                  if (other$mpeg4FileId == null) {
                     break label105;
                  }
               } else if (this$mpeg4FileId.equals(other$mpeg4FileId)) {
                  break label105;
               }

               return false;
            }

            Object this$title = this.getTitle();
            Object other$title = other.getTitle();
            if (this$title == null) {
               if (other$title != null) {
                  return false;
               }
            } else if (!this$title.equals(other$title)) {
               return false;
            }

            label91: {
               Object this$caption = this.getCaption();
               Object other$caption = other.getCaption();
               if (this$caption == null) {
                  if (other$caption == null) {
                     break label91;
                  }
               } else if (this$caption.equals(other$caption)) {
                  break label91;
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

            label77: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label77;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label77;
               }

               return false;
            }

            label70: {
               Object this$parseMode = this.getParseMode();
               Object other$parseMode = other.getParseMode();
               if (this$parseMode == null) {
                  if (other$parseMode == null) {
                     break label70;
                  }
               } else if (this$parseMode.equals(other$parseMode)) {
                  break label70;
               }

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
      return other instanceof InlineQueryResultCachedMpeg4Gif;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $type = this.getType();
      int result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $mpeg4FileId = this.getMpeg4FileId();
      result = result * 59 + ($mpeg4FileId == null ? 43 : $mpeg4FileId.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $inputMessageContent = this.getInputMessageContent();
      result = result * 59 + ($inputMessageContent == null ? 43 : $inputMessageContent.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $captionEntities = this.getCaptionEntities();
      result = result * 59 + ($captionEntities == null ? 43 : $captionEntities.hashCode());
      return result;
   }

   public String getType() {
      Objects.requireNonNull(this);
      return "mpeg4_gif";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getMpeg4FileId() {
      return this.mpeg4FileId;
   }

   public String getTitle() {
      return this.title;
   }

   public String getCaption() {
      return this.caption;
   }

   public InputMessageContent getInputMessageContent() {
      return this.inputMessageContent;
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

   @JsonProperty("id")
   public void setId(@NonNull String id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
      }
   }

   @JsonProperty("mpeg4_file_id")
   public void setMpeg4FileId(@NonNull String mpeg4FileId) {
      if (mpeg4FileId == null) {
         throw new NullPointerException("mpeg4FileId is marked non-null but is null");
      } else {
         this.mpeg4FileId = mpeg4FileId;
      }
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("caption")
   public void setCaption(String caption) {
      this.caption = caption;
   }

   @JsonProperty("input_message_content")
   public void setInputMessageContent(InputMessageContent inputMessageContent) {
      this.inputMessageContent = inputMessageContent;
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
      return "InlineQueryResultCachedMpeg4Gif(type=" + this.getType() + ", id=" + this.getId() + ", mpeg4FileId=" + this.getMpeg4FileId() + ", title=" + this.getTitle() + ", caption=" + this.getCaption() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultCachedMpeg4Gif(@NonNull String id, @NonNull String mpeg4FileId) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (mpeg4FileId == null) {
         throw new NullPointerException("mpeg4FileId is marked non-null but is null");
      } else {
         this.id = id;
         this.mpeg4FileId = mpeg4FileId;
      }
   }

   public InlineQueryResultCachedMpeg4Gif() {
   }

   public InlineQueryResultCachedMpeg4Gif(@NonNull String id, @NonNull String mpeg4FileId, String title, String caption, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (mpeg4FileId == null) {
         throw new NullPointerException("mpeg4FileId is marked non-null but is null");
      } else {
         this.id = id;
         this.mpeg4FileId = mpeg4FileId;
         this.title = title;
         this.caption = caption;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultCachedMpeg4GifBuilder {
      private String id;
      private String mpeg4FileId;
      private String title;
      private String caption;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultCachedMpeg4GifBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("mpeg4_file_id")
      public InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder mpeg4FileId(@NonNull String mpeg4FileId) {
         if (mpeg4FileId == null) {
            throw new NullPointerException("mpeg4FileId is marked non-null but is null");
         } else {
            this.mpeg4FileId = mpeg4FileId;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder title(String title) {
         this.title = title;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultCachedMpeg4Gif build() {
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

         return new InlineQueryResultCachedMpeg4Gif(this.id, this.mpeg4FileId, this.title, this.caption, this.inputMessageContent, this.replyMarkup, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultCachedMpeg4Gif.InlineQueryResultCachedMpeg4GifBuilder(id=" + this.id + ", mpeg4FileId=" + this.mpeg4FileId + ", title=" + this.title + ", caption=" + this.caption + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
