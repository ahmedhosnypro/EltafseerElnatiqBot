package org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
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
public class InlineQueryResultCachedGif implements InlineQueryResult {
   private static final List<String> VALIDTHUMBTYPES = Collections.unmodifiableList(Arrays.asList("image/jpeg", "image/gif", "video/mp4"));
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String GIF_FILE_ID_FIELD = "gif_file_id";
   private static final String TITLE_FIELD = "title";
   private static final String CAPTION_FIELD = "caption";
   private static final String THUMBURL_FIELD = "thumb_url";
   private static final String THUMBMIMETYPE_FIELD = "thumb_mime_type";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("type")
   private final String type = "gif";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("gif_file_id")
   @NonNull
   private String gifFileId;
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
   @JsonProperty("thumb_url")
   private String thumbUrl;
   @JsonProperty("thumb_mime_type")
   private String thumbUrlType;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.gifFileId != null && !this.gifFileId.isEmpty()) {
            if (this.thumbUrlType != null && !VALIDTHUMBTYPES.contains(this.thumbUrlType)) {
               throw new TelegramApiValidationException("ThumbUrlType parameter must be one of “image/jpeg”, “image/gif”, or “video/mp4”", this);
            } else if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
               throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
            } else {
               if (this.inputMessageContent != null) {
                  this.inputMessageContent.validate();
               }

               if (this.replyMarkup != null) {
                  this.replyMarkup.validate();
               }

            }
         } else {
            throw new TelegramApiValidationException("GifFileId parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder builder() {
      return new InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultCachedGif)) {
         return false;
      } else {
         InlineQueryResultCachedGif other = (InlineQueryResultCachedGif)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label143: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label143;
                  }
               } else if (this$type.equals(other$type)) {
                  break label143;
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

            Object this$gifFileId = this.getGifFileId();
            Object other$gifFileId = other.getGifFileId();
            if (this$gifFileId == null) {
               if (other$gifFileId != null) {
                  return false;
               }
            } else if (!this$gifFileId.equals(other$gifFileId)) {
               return false;
            }

            label122: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label122;
                  }
               } else if (this$title.equals(other$title)) {
                  break label122;
               }

               return false;
            }

            label115: {
               Object this$caption = this.getCaption();
               Object other$caption = other.getCaption();
               if (this$caption == null) {
                  if (other$caption == null) {
                     break label115;
                  }
               } else if (this$caption.equals(other$caption)) {
                  break label115;
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
               if (other$replyMarkup != null) {
                  return false;
               }
            } else if (!this$replyMarkup.equals(other$replyMarkup)) {
               return false;
            }

            label94: {
               Object this$parseMode = this.getParseMode();
               Object other$parseMode = other.getParseMode();
               if (this$parseMode == null) {
                  if (other$parseMode == null) {
                     break label94;
                  }
               } else if (this$parseMode.equals(other$parseMode)) {
                  break label94;
               }

               return false;
            }

            label87: {
               Object this$thumbUrl = this.getThumbUrl();
               Object other$thumbUrl = other.getThumbUrl();
               if (this$thumbUrl == null) {
                  if (other$thumbUrl == null) {
                     break label87;
                  }
               } else if (this$thumbUrl.equals(other$thumbUrl)) {
                  break label87;
               }

               return false;
            }

            Object this$thumbUrlType = this.getThumbUrlType();
            Object other$thumbUrlType = other.getThumbUrlType();
            if (this$thumbUrlType == null) {
               if (other$thumbUrlType != null) {
                  return false;
               }
            } else if (!this$thumbUrlType.equals(other$thumbUrlType)) {
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
      return other instanceof InlineQueryResultCachedGif;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $type = this.getType();
      int result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $gifFileId = this.getGifFileId();
      result = result * 59 + ($gifFileId == null ? 43 : $gifFileId.hashCode());
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
      Object $thumbUrl = this.getThumbUrl();
      result = result * 59 + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
      Object $thumbUrlType = this.getThumbUrlType();
      result = result * 59 + ($thumbUrlType == null ? 43 : $thumbUrlType.hashCode());
      Object $captionEntities = this.getCaptionEntities();
      result = result * 59 + ($captionEntities == null ? 43 : $captionEntities.hashCode());
      return result;
   }

   public String getType() {
      Objects.requireNonNull(this);
      return "gif";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getGifFileId() {
      return this.gifFileId;
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

   public String getThumbUrl() {
      return this.thumbUrl;
   }

   public String getThumbUrlType() {
      return this.thumbUrlType;
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

   @JsonProperty("gif_file_id")
   public void setGifFileId(@NonNull String gifFileId) {
      if (gifFileId == null) {
         throw new NullPointerException("gifFileId is marked non-null but is null");
      } else {
         this.gifFileId = gifFileId;
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

   @JsonProperty("thumb_url")
   public void setThumbUrl(String thumbUrl) {
      this.thumbUrl = thumbUrl;
   }

   @JsonProperty("thumb_mime_type")
   public void setThumbUrlType(String thumbUrlType) {
      this.thumbUrlType = thumbUrlType;
   }

   @JsonProperty("caption_entities")
   public void setCaptionEntities(List<MessageEntity> captionEntities) {
      this.captionEntities = captionEntities;
   }

   public String toString() {
      return "InlineQueryResultCachedGif(type=" + this.getType() + ", id=" + this.getId() + ", gifFileId=" + this.getGifFileId() + ", title=" + this.getTitle() + ", caption=" + this.getCaption() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", parseMode=" + this.getParseMode() + ", thumbUrl=" + this.getThumbUrl() + ", thumbUrlType=" + this.getThumbUrlType() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultCachedGif(@NonNull String id, @NonNull String gifFileId) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (gifFileId == null) {
         throw new NullPointerException("gifFileId is marked non-null but is null");
      } else {
         this.id = id;
         this.gifFileId = gifFileId;
      }
   }

   public InlineQueryResultCachedGif() {
   }

   public InlineQueryResultCachedGif(@NonNull String id, @NonNull String gifFileId, String title, String caption, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, String parseMode, String thumbUrl, String thumbUrlType, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (gifFileId == null) {
         throw new NullPointerException("gifFileId is marked non-null but is null");
      } else {
         this.id = id;
         this.gifFileId = gifFileId;
         this.title = title;
         this.caption = caption;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.parseMode = parseMode;
         this.thumbUrl = thumbUrl;
         this.thumbUrlType = thumbUrlType;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultCachedGifBuilder {
      private String id;
      private String gifFileId;
      private String title;
      private String caption;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private String parseMode;
      private String thumbUrl;
      private String thumbUrlType;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultCachedGifBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("gif_file_id")
      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder gifFileId(@NonNull String gifFileId) {
         if (gifFileId == null) {
            throw new NullPointerException("gifFileId is marked non-null but is null");
         } else {
            this.gifFileId = gifFileId;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder title(String title) {
         this.title = title;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      @JsonProperty("thumb_url")
      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder thumbUrl(String thumbUrl) {
         this.thumbUrl = thumbUrl;
         return this;
      }

      @JsonProperty("thumb_mime_type")
      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder thumbUrlType(String thumbUrlType) {
         this.thumbUrlType = thumbUrlType;
         return this;
      }

      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultCachedGif build() {
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

         return new InlineQueryResultCachedGif(this.id, this.gifFileId, this.title, this.caption, this.inputMessageContent, this.replyMarkup, this.parseMode, this.thumbUrl, this.thumbUrlType, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultCachedGif.InlineQueryResultCachedGifBuilder(id=" + this.id + ", gifFileId=" + this.gifFileId + ", title=" + this.title + ", caption=" + this.caption + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", parseMode=" + this.parseMode + ", thumbUrl=" + this.thumbUrl + ", thumbUrlType=" + this.thumbUrlType + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
