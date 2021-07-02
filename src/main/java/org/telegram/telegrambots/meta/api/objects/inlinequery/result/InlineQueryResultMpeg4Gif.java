package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

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
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultMpeg4Gif implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String MPEG4URL_FIELD = "mpeg4_url";
   private static final String MPEG4WIDTH_FIELD = "mpeg4_width";
   private static final String MPEG4HEIGHT_FIELD = "mpeg4_height";
   private static final String THUMBURL_FIELD = "thumb_url";
   private static final String TITLE_FIELD = "title";
   private static final String CAPTION_FIELD = "caption";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String MPEG4_DURATION_FIELD = "mpeg4_duration";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("type")
   private final String type = "mpeg4_gif";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("mpeg4_url")
   @NonNull
   private String mpeg4Url;
   @JsonProperty("mpeg4_width")
   private Integer mpeg4Width;
   @JsonProperty("mpeg4_height")
   private Integer mpeg4Height;
   @JsonProperty("thumb_url")
   private String thumbUrl;
   @JsonProperty("title")
   private String title;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("input_message_content")
   private InputMessageContent inputMessageContent;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("mpeg4_duration")
   private Integer mpeg4Duration;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.mpeg4Url != null && !this.mpeg4Url.isEmpty()) {
            if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
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
            throw new TelegramApiValidationException("Mpeg4Url parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder builder() {
      return new InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultMpeg4Gif)) {
         return false;
      } else {
         InlineQueryResultMpeg4Gif other = (InlineQueryResultMpeg4Gif)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label167: {
               Object this$mpeg4Width = this.getMpeg4Width();
               Object other$mpeg4Width = other.getMpeg4Width();
               if (this$mpeg4Width == null) {
                  if (other$mpeg4Width == null) {
                     break label167;
                  }
               } else if (this$mpeg4Width.equals(other$mpeg4Width)) {
                  break label167;
               }

               return false;
            }

            Object this$mpeg4Height = this.getMpeg4Height();
            Object other$mpeg4Height = other.getMpeg4Height();
            if (this$mpeg4Height == null) {
               if (other$mpeg4Height != null) {
                  return false;
               }
            } else if (!this$mpeg4Height.equals(other$mpeg4Height)) {
               return false;
            }

            label153: {
               Object this$mpeg4Duration = this.getMpeg4Duration();
               Object other$mpeg4Duration = other.getMpeg4Duration();
               if (this$mpeg4Duration == null) {
                  if (other$mpeg4Duration == null) {
                     break label153;
                  }
               } else if (this$mpeg4Duration.equals(other$mpeg4Duration)) {
                  break label153;
               }

               return false;
            }

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            label139: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label139;
                  }
               } else if (this$id.equals(other$id)) {
                  break label139;
               }

               return false;
            }

            Object this$mpeg4Url = this.getMpeg4Url();
            Object other$mpeg4Url = other.getMpeg4Url();
            if (this$mpeg4Url == null) {
               if (other$mpeg4Url != null) {
                  return false;
               }
            } else if (!this$mpeg4Url.equals(other$mpeg4Url)) {
               return false;
            }

            label125: {
               Object this$thumbUrl = this.getThumbUrl();
               Object other$thumbUrl = other.getThumbUrl();
               if (this$thumbUrl == null) {
                  if (other$thumbUrl == null) {
                     break label125;
                  }
               } else if (this$thumbUrl.equals(other$thumbUrl)) {
                  break label125;
               }

               return false;
            }

            label118: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label118;
                  }
               } else if (this$title.equals(other$title)) {
                  break label118;
               }

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

            label104: {
               Object this$inputMessageContent = this.getInputMessageContent();
               Object other$inputMessageContent = other.getInputMessageContent();
               if (this$inputMessageContent == null) {
                  if (other$inputMessageContent == null) {
                     break label104;
                  }
               } else if (this$inputMessageContent.equals(other$inputMessageContent)) {
                  break label104;
               }

               return false;
            }

            label97: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label97;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label97;
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
      return other instanceof InlineQueryResultMpeg4Gif;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $mpeg4Width = this.getMpeg4Width();
      int result = result * 59 + ($mpeg4Width == null ? 43 : $mpeg4Width.hashCode());
      Object $mpeg4Height = this.getMpeg4Height();
      result = result * 59 + ($mpeg4Height == null ? 43 : $mpeg4Height.hashCode());
      Object $mpeg4Duration = this.getMpeg4Duration();
      result = result * 59 + ($mpeg4Duration == null ? 43 : $mpeg4Duration.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $mpeg4Url = this.getMpeg4Url();
      result = result * 59 + ($mpeg4Url == null ? 43 : $mpeg4Url.hashCode());
      Object $thumbUrl = this.getThumbUrl();
      result = result * 59 + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
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
   public String getMpeg4Url() {
      return this.mpeg4Url;
   }

   public Integer getMpeg4Width() {
      return this.mpeg4Width;
   }

   public Integer getMpeg4Height() {
      return this.mpeg4Height;
   }

   public String getThumbUrl() {
      return this.thumbUrl;
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

   public Integer getMpeg4Duration() {
      return this.mpeg4Duration;
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

   @JsonProperty("mpeg4_url")
   public void setMpeg4Url(@NonNull String mpeg4Url) {
      if (mpeg4Url == null) {
         throw new NullPointerException("mpeg4Url is marked non-null but is null");
      } else {
         this.mpeg4Url = mpeg4Url;
      }
   }

   @JsonProperty("mpeg4_width")
   public void setMpeg4Width(Integer mpeg4Width) {
      this.mpeg4Width = mpeg4Width;
   }

   @JsonProperty("mpeg4_height")
   public void setMpeg4Height(Integer mpeg4Height) {
      this.mpeg4Height = mpeg4Height;
   }

   @JsonProperty("thumb_url")
   public void setThumbUrl(String thumbUrl) {
      this.thumbUrl = thumbUrl;
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

   @JsonProperty("mpeg4_duration")
   public void setMpeg4Duration(Integer mpeg4Duration) {
      this.mpeg4Duration = mpeg4Duration;
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
      return "InlineQueryResultMpeg4Gif(type=" + this.getType() + ", id=" + this.getId() + ", mpeg4Url=" + this.getMpeg4Url() + ", mpeg4Width=" + this.getMpeg4Width() + ", mpeg4Height=" + this.getMpeg4Height() + ", thumbUrl=" + this.getThumbUrl() + ", title=" + this.getTitle() + ", caption=" + this.getCaption() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", mpeg4Duration=" + this.getMpeg4Duration() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultMpeg4Gif(@NonNull String id, @NonNull String mpeg4Url) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (mpeg4Url == null) {
         throw new NullPointerException("mpeg4Url is marked non-null but is null");
      } else {
         this.id = id;
         this.mpeg4Url = mpeg4Url;
      }
   }

   public InlineQueryResultMpeg4Gif() {
   }

   public InlineQueryResultMpeg4Gif(@NonNull String id, @NonNull String mpeg4Url, Integer mpeg4Width, Integer mpeg4Height, String thumbUrl, String title, String caption, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, Integer mpeg4Duration, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (mpeg4Url == null) {
         throw new NullPointerException("mpeg4Url is marked non-null but is null");
      } else {
         this.id = id;
         this.mpeg4Url = mpeg4Url;
         this.mpeg4Width = mpeg4Width;
         this.mpeg4Height = mpeg4Height;
         this.thumbUrl = thumbUrl;
         this.title = title;
         this.caption = caption;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.mpeg4Duration = mpeg4Duration;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultMpeg4GifBuilder {
      private String id;
      private String mpeg4Url;
      private Integer mpeg4Width;
      private Integer mpeg4Height;
      private String thumbUrl;
      private String title;
      private String caption;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private Integer mpeg4Duration;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultMpeg4GifBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("mpeg4_url")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder mpeg4Url(@NonNull String mpeg4Url) {
         if (mpeg4Url == null) {
            throw new NullPointerException("mpeg4Url is marked non-null but is null");
         } else {
            this.mpeg4Url = mpeg4Url;
            return this;
         }
      }

      @JsonProperty("mpeg4_width")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder mpeg4Width(Integer mpeg4Width) {
         this.mpeg4Width = mpeg4Width;
         return this;
      }

      @JsonProperty("mpeg4_height")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder mpeg4Height(Integer mpeg4Height) {
         this.mpeg4Height = mpeg4Height;
         return this;
      }

      @JsonProperty("thumb_url")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder thumbUrl(String thumbUrl) {
         this.thumbUrl = thumbUrl;
         return this;
      }

      @JsonProperty("title")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder title(String title) {
         this.title = title;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("mpeg4_duration")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder mpeg4Duration(Integer mpeg4Duration) {
         this.mpeg4Duration = mpeg4Duration;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultMpeg4Gif build() {
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

         return new InlineQueryResultMpeg4Gif(this.id, this.mpeg4Url, this.mpeg4Width, this.mpeg4Height, this.thumbUrl, this.title, this.caption, this.inputMessageContent, this.replyMarkup, this.mpeg4Duration, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultMpeg4Gif.InlineQueryResultMpeg4GifBuilder(id=" + this.id + ", mpeg4Url=" + this.mpeg4Url + ", mpeg4Width=" + this.mpeg4Width + ", mpeg4Height=" + this.mpeg4Height + ", thumbUrl=" + this.thumbUrl + ", title=" + this.title + ", caption=" + this.caption + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", mpeg4Duration=" + this.mpeg4Duration + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
