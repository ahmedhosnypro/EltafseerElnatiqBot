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
public class InlineQueryResultVideo implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String MIMETYPE_FIELD = "mime_type";
   private static final String VIDEOURL_FIELD = "video_url";
   private static final String VIDEOWIDTH_FIELD = "video_width";
   private static final String VIDEOHEIGHT_FIELD = "video_height";
   private static final String VIDEODURATION_FIELD = "video_duration";
   private static final String THUMBURL_FIELD = "thumb_url";
   private static final String TITLE_FIELD = "title";
   private static final String DESCRIPTION_FIELD = "description";
   private static final String CAPTION_FIELD = "caption";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("type")
   private final String type = "video";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("mime_type")
   @NonNull
   private String mimeType;
   @JsonProperty("video_url")
   @NonNull
   private String videoUrl;
   @JsonProperty("video_width")
   private Integer videoWidth;
   @JsonProperty("video_height")
   private Integer videoHeight;
   @JsonProperty("video_duration")
   private Integer videoDuration;
   @JsonProperty("thumb_url")
   private String thumbUrl;
   @JsonProperty("title")
   private String title;
   @JsonProperty("description")
   private String description;
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
         if (this.videoUrl != null && !this.videoUrl.isEmpty()) {
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
            throw new TelegramApiValidationException("VideoUrl parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultVideo.InlineQueryResultVideoBuilder builder() {
      return new InlineQueryResultVideo.InlineQueryResultVideoBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultVideo)) {
         return false;
      } else {
         InlineQueryResultVideo other = (InlineQueryResultVideo)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label191: {
               Object this$videoWidth = this.getVideoWidth();
               Object other$videoWidth = other.getVideoWidth();
               if (this$videoWidth == null) {
                  if (other$videoWidth == null) {
                     break label191;
                  }
               } else if (this$videoWidth.equals(other$videoWidth)) {
                  break label191;
               }

               return false;
            }

            Object this$videoHeight = this.getVideoHeight();
            Object other$videoHeight = other.getVideoHeight();
            if (this$videoHeight == null) {
               if (other$videoHeight != null) {
                  return false;
               }
            } else if (!this$videoHeight.equals(other$videoHeight)) {
               return false;
            }

            Object this$videoDuration = this.getVideoDuration();
            Object other$videoDuration = other.getVideoDuration();
            if (this$videoDuration == null) {
               if (other$videoDuration != null) {
                  return false;
               }
            } else if (!this$videoDuration.equals(other$videoDuration)) {
               return false;
            }

            label170: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label170;
                  }
               } else if (this$type.equals(other$type)) {
                  break label170;
               }

               return false;
            }

            label163: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label163;
                  }
               } else if (this$id.equals(other$id)) {
                  break label163;
               }

               return false;
            }

            Object this$mimeType = this.getMimeType();
            Object other$mimeType = other.getMimeType();
            if (this$mimeType == null) {
               if (other$mimeType != null) {
                  return false;
               }
            } else if (!this$mimeType.equals(other$mimeType)) {
               return false;
            }

            Object this$videoUrl = this.getVideoUrl();
            Object other$videoUrl = other.getVideoUrl();
            if (this$videoUrl == null) {
               if (other$videoUrl != null) {
                  return false;
               }
            } else if (!this$videoUrl.equals(other$videoUrl)) {
               return false;
            }

            label142: {
               Object this$thumbUrl = this.getThumbUrl();
               Object other$thumbUrl = other.getThumbUrl();
               if (this$thumbUrl == null) {
                  if (other$thumbUrl == null) {
                     break label142;
                  }
               } else if (this$thumbUrl.equals(other$thumbUrl)) {
                  break label142;
               }

               return false;
            }

            label135: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label135;
                  }
               } else if (this$title.equals(other$title)) {
                  break label135;
               }

               return false;
            }

            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
               if (other$description != null) {
                  return false;
               }
            } else if (!this$description.equals(other$description)) {
               return false;
            }

            label121: {
               Object this$caption = this.getCaption();
               Object other$caption = other.getCaption();
               if (this$caption == null) {
                  if (other$caption == null) {
                     break label121;
                  }
               } else if (this$caption.equals(other$caption)) {
                  break label121;
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

            label107: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label107;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label107;
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
      return other instanceof InlineQueryResultVideo;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $videoWidth = this.getVideoWidth();
      int result = result * 59 + ($videoWidth == null ? 43 : $videoWidth.hashCode());
      Object $videoHeight = this.getVideoHeight();
      result = result * 59 + ($videoHeight == null ? 43 : $videoHeight.hashCode());
      Object $videoDuration = this.getVideoDuration();
      result = result * 59 + ($videoDuration == null ? 43 : $videoDuration.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $mimeType = this.getMimeType();
      result = result * 59 + ($mimeType == null ? 43 : $mimeType.hashCode());
      Object $videoUrl = this.getVideoUrl();
      result = result * 59 + ($videoUrl == null ? 43 : $videoUrl.hashCode());
      Object $thumbUrl = this.getThumbUrl();
      result = result * 59 + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
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
      return "video";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getMimeType() {
      return this.mimeType;
   }

   @NonNull
   public String getVideoUrl() {
      return this.videoUrl;
   }

   public Integer getVideoWidth() {
      return this.videoWidth;
   }

   public Integer getVideoHeight() {
      return this.videoHeight;
   }

   public Integer getVideoDuration() {
      return this.videoDuration;
   }

   public String getThumbUrl() {
      return this.thumbUrl;
   }

   public String getTitle() {
      return this.title;
   }

   public String getDescription() {
      return this.description;
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

   @JsonProperty("mime_type")
   public void setMimeType(@NonNull String mimeType) {
      if (mimeType == null) {
         throw new NullPointerException("mimeType is marked non-null but is null");
      } else {
         this.mimeType = mimeType;
      }
   }

   @JsonProperty("video_url")
   public void setVideoUrl(@NonNull String videoUrl) {
      if (videoUrl == null) {
         throw new NullPointerException("videoUrl is marked non-null but is null");
      } else {
         this.videoUrl = videoUrl;
      }
   }

   @JsonProperty("video_width")
   public void setVideoWidth(Integer videoWidth) {
      this.videoWidth = videoWidth;
   }

   @JsonProperty("video_height")
   public void setVideoHeight(Integer videoHeight) {
      this.videoHeight = videoHeight;
   }

   @JsonProperty("video_duration")
   public void setVideoDuration(Integer videoDuration) {
      this.videoDuration = videoDuration;
   }

   @JsonProperty("thumb_url")
   public void setThumbUrl(String thumbUrl) {
      this.thumbUrl = thumbUrl;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
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
      return "InlineQueryResultVideo(type=" + this.getType() + ", id=" + this.getId() + ", mimeType=" + this.getMimeType() + ", videoUrl=" + this.getVideoUrl() + ", videoWidth=" + this.getVideoWidth() + ", videoHeight=" + this.getVideoHeight() + ", videoDuration=" + this.getVideoDuration() + ", thumbUrl=" + this.getThumbUrl() + ", title=" + this.getTitle() + ", description=" + this.getDescription() + ", caption=" + this.getCaption() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultVideo(@NonNull String id, @NonNull String mimeType, @NonNull String videoUrl) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (mimeType == null) {
         throw new NullPointerException("mimeType is marked non-null but is null");
      } else if (videoUrl == null) {
         throw new NullPointerException("videoUrl is marked non-null but is null");
      } else {
         this.id = id;
         this.mimeType = mimeType;
         this.videoUrl = videoUrl;
      }
   }

   public InlineQueryResultVideo() {
   }

   public InlineQueryResultVideo(@NonNull String id, @NonNull String mimeType, @NonNull String videoUrl, Integer videoWidth, Integer videoHeight, Integer videoDuration, String thumbUrl, String title, String description, String caption, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (mimeType == null) {
         throw new NullPointerException("mimeType is marked non-null but is null");
      } else if (videoUrl == null) {
         throw new NullPointerException("videoUrl is marked non-null but is null");
      } else {
         this.id = id;
         this.mimeType = mimeType;
         this.videoUrl = videoUrl;
         this.videoWidth = videoWidth;
         this.videoHeight = videoHeight;
         this.videoDuration = videoDuration;
         this.thumbUrl = thumbUrl;
         this.title = title;
         this.description = description;
         this.caption = caption;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultVideoBuilder {
      private String id;
      private String mimeType;
      private String videoUrl;
      private Integer videoWidth;
      private Integer videoHeight;
      private Integer videoDuration;
      private String thumbUrl;
      private String title;
      private String description;
      private String caption;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultVideoBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("mime_type")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder mimeType(@NonNull String mimeType) {
         if (mimeType == null) {
            throw new NullPointerException("mimeType is marked non-null but is null");
         } else {
            this.mimeType = mimeType;
            return this;
         }
      }

      @JsonProperty("video_url")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder videoUrl(@NonNull String videoUrl) {
         if (videoUrl == null) {
            throw new NullPointerException("videoUrl is marked non-null but is null");
         } else {
            this.videoUrl = videoUrl;
            return this;
         }
      }

      @JsonProperty("video_width")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder videoWidth(Integer videoWidth) {
         this.videoWidth = videoWidth;
         return this;
      }

      @JsonProperty("video_height")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder videoHeight(Integer videoHeight) {
         this.videoHeight = videoHeight;
         return this;
      }

      @JsonProperty("video_duration")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder videoDuration(Integer videoDuration) {
         this.videoDuration = videoDuration;
         return this;
      }

      @JsonProperty("thumb_url")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder thumbUrl(String thumbUrl) {
         this.thumbUrl = thumbUrl;
         return this;
      }

      @JsonProperty("title")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder title(String title) {
         this.title = title;
         return this;
      }

      @JsonProperty("description")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder description(String description) {
         this.description = description;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultVideo.InlineQueryResultVideoBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultVideo.InlineQueryResultVideoBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultVideo.InlineQueryResultVideoBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultVideo build() {
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

         return new InlineQueryResultVideo(this.id, this.mimeType, this.videoUrl, this.videoWidth, this.videoHeight, this.videoDuration, this.thumbUrl, this.title, this.description, this.caption, this.inputMessageContent, this.replyMarkup, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultVideo.InlineQueryResultVideoBuilder(id=" + this.id + ", mimeType=" + this.mimeType + ", videoUrl=" + this.videoUrl + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", videoDuration=" + this.videoDuration + ", thumbUrl=" + this.thumbUrl + ", title=" + this.title + ", description=" + this.description + ", caption=" + this.caption + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
