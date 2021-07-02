package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

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
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultGif implements InlineQueryResult {
   private static final List<String> VALIDTHUMBTYPES = Collections.unmodifiableList(Arrays.asList("image/jpeg", "image/gif", "video/mp4"));
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String GIFURL_FIELD = "gif_url";
   private static final String GIFWIDTH_FIELD = "gif_width";
   private static final String GIFHEIGHT_FIELD = "gif_height";
   private static final String THUMBURL_FIELD = "thumb_url";
   private static final String THUMBMIMETYPE_FIELD = "thumb_mime_type";
   private static final String TITLE_FIELD = "title";
   private static final String CAPTION_FIELD = "caption";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String GIF_DURATION_FIELD = "gif_duration";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("type")
   private final String type = "gif";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("gif_url")
   @NonNull
   private String gifUrl;
   @JsonProperty("gif_width")
   private Integer gifWidth;
   @JsonProperty("gif_height")
   private Integer gifHeight;
   @JsonProperty("thumb_url")
   private String thumbUrl;
   @JsonProperty("thumb_mime_type")
   private String thumbUrlType;
   @JsonProperty("title")
   private String title;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("input_message_content")
   private InputMessageContent inputMessageContent;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("gif_duration")
   private Integer gifDuration;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.gifUrl != null && !this.gifUrl.isEmpty()) {
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
            throw new TelegramApiValidationException("GifUrl parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultGif.InlineQueryResultGifBuilder builder() {
      return new InlineQueryResultGif.InlineQueryResultGifBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultGif)) {
         return false;
      } else {
         InlineQueryResultGif other = (InlineQueryResultGif)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$gifWidth = this.getGifWidth();
            Object other$gifWidth = other.getGifWidth();
            if (this$gifWidth == null) {
               if (other$gifWidth != null) {
                  return false;
               }
            } else if (!this$gifWidth.equals(other$gifWidth)) {
               return false;
            }

            Object this$gifHeight = this.getGifHeight();
            Object other$gifHeight = other.getGifHeight();
            if (this$gifHeight == null) {
               if (other$gifHeight != null) {
                  return false;
               }
            } else if (!this$gifHeight.equals(other$gifHeight)) {
               return false;
            }

            Object this$gifDuration = this.getGifDuration();
            Object other$gifDuration = other.getGifDuration();
            if (this$gifDuration == null) {
               if (other$gifDuration != null) {
                  return false;
               }
            } else if (!this$gifDuration.equals(other$gifDuration)) {
               return false;
            }

            label158: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label158;
                  }
               } else if (this$type.equals(other$type)) {
                  break label158;
               }

               return false;
            }

            label151: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label151;
                  }
               } else if (this$id.equals(other$id)) {
                  break label151;
               }

               return false;
            }

            Object this$gifUrl = this.getGifUrl();
            Object other$gifUrl = other.getGifUrl();
            if (this$gifUrl == null) {
               if (other$gifUrl != null) {
                  return false;
               }
            } else if (!this$gifUrl.equals(other$gifUrl)) {
               return false;
            }

            label137: {
               Object this$thumbUrl = this.getThumbUrl();
               Object other$thumbUrl = other.getThumbUrl();
               if (this$thumbUrl == null) {
                  if (other$thumbUrl == null) {
                     break label137;
                  }
               } else if (this$thumbUrl.equals(other$thumbUrl)) {
                  break label137;
               }

               return false;
            }

            label130: {
               Object this$thumbUrlType = this.getThumbUrlType();
               Object other$thumbUrlType = other.getThumbUrlType();
               if (this$thumbUrlType == null) {
                  if (other$thumbUrlType == null) {
                     break label130;
                  }
               } else if (this$thumbUrlType.equals(other$thumbUrlType)) {
                  break label130;
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

            Object this$caption = this.getCaption();
            Object other$caption = other.getCaption();
            if (this$caption == null) {
               if (other$caption != null) {
                  return false;
               }
            } else if (!this$caption.equals(other$caption)) {
               return false;
            }

            label109: {
               Object this$inputMessageContent = this.getInputMessageContent();
               Object other$inputMessageContent = other.getInputMessageContent();
               if (this$inputMessageContent == null) {
                  if (other$inputMessageContent == null) {
                     break label109;
                  }
               } else if (this$inputMessageContent.equals(other$inputMessageContent)) {
                  break label109;
               }

               return false;
            }

            label102: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label102;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label102;
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
      return other instanceof InlineQueryResultGif;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $gifWidth = this.getGifWidth();
      int result = result * 59 + ($gifWidth == null ? 43 : $gifWidth.hashCode());
      Object $gifHeight = this.getGifHeight();
      result = result * 59 + ($gifHeight == null ? 43 : $gifHeight.hashCode());
      Object $gifDuration = this.getGifDuration();
      result = result * 59 + ($gifDuration == null ? 43 : $gifDuration.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $gifUrl = this.getGifUrl();
      result = result * 59 + ($gifUrl == null ? 43 : $gifUrl.hashCode());
      Object $thumbUrl = this.getThumbUrl();
      result = result * 59 + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
      Object $thumbUrlType = this.getThumbUrlType();
      result = result * 59 + ($thumbUrlType == null ? 43 : $thumbUrlType.hashCode());
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
      return "gif";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getGifUrl() {
      return this.gifUrl;
   }

   public Integer getGifWidth() {
      return this.gifWidth;
   }

   public Integer getGifHeight() {
      return this.gifHeight;
   }

   public String getThumbUrl() {
      return this.thumbUrl;
   }

   public String getThumbUrlType() {
      return this.thumbUrlType;
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

   public Integer getGifDuration() {
      return this.gifDuration;
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

   @JsonProperty("gif_url")
   public void setGifUrl(@NonNull String gifUrl) {
      if (gifUrl == null) {
         throw new NullPointerException("gifUrl is marked non-null but is null");
      } else {
         this.gifUrl = gifUrl;
      }
   }

   @JsonProperty("gif_width")
   public void setGifWidth(Integer gifWidth) {
      this.gifWidth = gifWidth;
   }

   @JsonProperty("gif_height")
   public void setGifHeight(Integer gifHeight) {
      this.gifHeight = gifHeight;
   }

   @JsonProperty("thumb_url")
   public void setThumbUrl(String thumbUrl) {
      this.thumbUrl = thumbUrl;
   }

   @JsonProperty("thumb_mime_type")
   public void setThumbUrlType(String thumbUrlType) {
      this.thumbUrlType = thumbUrlType;
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

   @JsonProperty("gif_duration")
   public void setGifDuration(Integer gifDuration) {
      this.gifDuration = gifDuration;
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
      return "InlineQueryResultGif(type=" + this.getType() + ", id=" + this.getId() + ", gifUrl=" + this.getGifUrl() + ", gifWidth=" + this.getGifWidth() + ", gifHeight=" + this.getGifHeight() + ", thumbUrl=" + this.getThumbUrl() + ", thumbUrlType=" + this.getThumbUrlType() + ", title=" + this.getTitle() + ", caption=" + this.getCaption() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", gifDuration=" + this.getGifDuration() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultGif(@NonNull String id, @NonNull String gifUrl) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (gifUrl == null) {
         throw new NullPointerException("gifUrl is marked non-null but is null");
      } else {
         this.id = id;
         this.gifUrl = gifUrl;
      }
   }

   public InlineQueryResultGif() {
   }

   public InlineQueryResultGif(@NonNull String id, @NonNull String gifUrl, Integer gifWidth, Integer gifHeight, String thumbUrl, String thumbUrlType, String title, String caption, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, Integer gifDuration, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (gifUrl == null) {
         throw new NullPointerException("gifUrl is marked non-null but is null");
      } else {
         this.id = id;
         this.gifUrl = gifUrl;
         this.gifWidth = gifWidth;
         this.gifHeight = gifHeight;
         this.thumbUrl = thumbUrl;
         this.thumbUrlType = thumbUrlType;
         this.title = title;
         this.caption = caption;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.gifDuration = gifDuration;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultGifBuilder {
      private String id;
      private String gifUrl;
      private Integer gifWidth;
      private Integer gifHeight;
      private String thumbUrl;
      private String thumbUrlType;
      private String title;
      private String caption;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private Integer gifDuration;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultGifBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultGif.InlineQueryResultGifBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("gif_url")
      public InlineQueryResultGif.InlineQueryResultGifBuilder gifUrl(@NonNull String gifUrl) {
         if (gifUrl == null) {
            throw new NullPointerException("gifUrl is marked non-null but is null");
         } else {
            this.gifUrl = gifUrl;
            return this;
         }
      }

      @JsonProperty("gif_width")
      public InlineQueryResultGif.InlineQueryResultGifBuilder gifWidth(Integer gifWidth) {
         this.gifWidth = gifWidth;
         return this;
      }

      @JsonProperty("gif_height")
      public InlineQueryResultGif.InlineQueryResultGifBuilder gifHeight(Integer gifHeight) {
         this.gifHeight = gifHeight;
         return this;
      }

      @JsonProperty("thumb_url")
      public InlineQueryResultGif.InlineQueryResultGifBuilder thumbUrl(String thumbUrl) {
         this.thumbUrl = thumbUrl;
         return this;
      }

      @JsonProperty("thumb_mime_type")
      public InlineQueryResultGif.InlineQueryResultGifBuilder thumbUrlType(String thumbUrlType) {
         this.thumbUrlType = thumbUrlType;
         return this;
      }

      @JsonProperty("title")
      public InlineQueryResultGif.InlineQueryResultGifBuilder title(String title) {
         this.title = title;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultGif.InlineQueryResultGifBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultGif.InlineQueryResultGifBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultGif.InlineQueryResultGifBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("gif_duration")
      public InlineQueryResultGif.InlineQueryResultGifBuilder gifDuration(Integer gifDuration) {
         this.gifDuration = gifDuration;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultGif.InlineQueryResultGifBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultGif.InlineQueryResultGifBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultGif.InlineQueryResultGifBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultGif.InlineQueryResultGifBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultGif build() {
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

         return new InlineQueryResultGif(this.id, this.gifUrl, this.gifWidth, this.gifHeight, this.thumbUrl, this.thumbUrlType, this.title, this.caption, this.inputMessageContent, this.replyMarkup, this.gifDuration, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultGif.InlineQueryResultGifBuilder(id=" + this.id + ", gifUrl=" + this.gifUrl + ", gifWidth=" + this.gifWidth + ", gifHeight=" + this.gifHeight + ", thumbUrl=" + this.thumbUrl + ", thumbUrlType=" + this.thumbUrlType + ", title=" + this.title + ", caption=" + this.caption + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", gifDuration=" + this.gifDuration + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
