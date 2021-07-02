package org.telegram.telegrambots.meta.api.objects.media;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InputMediaVideo extends InputMedia {
   private static final String TYPE = "video";
   public static final String WIDTH_FIELD = "width";
   public static final String HEIGHT_FIELD = "height";
   public static final String DURATION_FIELD = "duration";
   public static final String SUPPORTSSTREAMING_FIELD = "supports_streaming";
   public static final String THUMB_FIELD = "thumb";
   @JsonProperty("width")
   private Integer width;
   @JsonProperty("height")
   private Integer height;
   @JsonProperty("duration")
   private Integer duration;
   @JsonProperty("supports_streaming")
   private Boolean supportsStreaming;
   @JsonProperty("thumb")
   private InputFile thumb;

   public InputMediaVideo() {
   }

   public InputMediaVideo(@NonNull String media) {
      super(media);
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      }
   }

   public InputMediaVideo(@NonNull String media, String caption, String parseMode, List<MessageEntity> entities, boolean isNewMedia, String mediaName, File newMediaFile, InputStream newMediaStream, Integer width, Integer height, Integer duration, Boolean supportsStreaming, InputFile thumb) {
      super(media, caption, parseMode, entities, isNewMedia, mediaName, newMediaFile, newMediaStream);
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      } else {
         this.width = width;
         this.height = height;
         this.duration = duration;
         this.supportsStreaming = supportsStreaming;
         this.thumb = thumb;
      }
   }

   public String getType() {
      return "video";
   }

   public void validate() throws TelegramApiValidationException {
      super.validate();
   }

   public static InputMediaVideo.InputMediaVideoBuilder builder() {
      return new InputMediaVideo.InputMediaVideoBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputMediaVideo)) {
         return false;
      } else {
         InputMediaVideo other = (InputMediaVideo)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (!super.equals(o)) {
            return false;
         } else {
            label73: {
               Object this$width = this.getWidth();
               Object other$width = other.getWidth();
               if (this$width == null) {
                  if (other$width == null) {
                     break label73;
                  }
               } else if (this$width.equals(other$width)) {
                  break label73;
               }

               return false;
            }

            Object this$height = this.getHeight();
            Object other$height = other.getHeight();
            if (this$height == null) {
               if (other$height != null) {
                  return false;
               }
            } else if (!this$height.equals(other$height)) {
               return false;
            }

            label59: {
               Object this$duration = this.getDuration();
               Object other$duration = other.getDuration();
               if (this$duration == null) {
                  if (other$duration == null) {
                     break label59;
                  }
               } else if (this$duration.equals(other$duration)) {
                  break label59;
               }

               return false;
            }

            Object this$supportsStreaming = this.getSupportsStreaming();
            Object other$supportsStreaming = other.getSupportsStreaming();
            if (this$supportsStreaming == null) {
               if (other$supportsStreaming != null) {
                  return false;
               }
            } else if (!this$supportsStreaming.equals(other$supportsStreaming)) {
               return false;
            }

            Object this$thumb = this.getThumb();
            Object other$thumb = other.getThumb();
            if (this$thumb == null) {
               if (other$thumb != null) {
                  return false;
               }
            } else if (!this$thumb.equals(other$thumb)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InputMediaVideo;
   }

   public int hashCode() {
      int PRIME = true;
      int result = super.hashCode();
      Object $width = this.getWidth();
      result = result * 59 + ($width == null ? 43 : $width.hashCode());
      Object $height = this.getHeight();
      result = result * 59 + ($height == null ? 43 : $height.hashCode());
      Object $duration = this.getDuration();
      result = result * 59 + ($duration == null ? 43 : $duration.hashCode());
      Object $supportsStreaming = this.getSupportsStreaming();
      result = result * 59 + ($supportsStreaming == null ? 43 : $supportsStreaming.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      return result;
   }

   public Integer getWidth() {
      return this.width;
   }

   public Integer getHeight() {
      return this.height;
   }

   public Integer getDuration() {
      return this.duration;
   }

   public Boolean getSupportsStreaming() {
      return this.supportsStreaming;
   }

   public InputFile getThumb() {
      return this.thumb;
   }

   @JsonProperty("width")
   public void setWidth(Integer width) {
      this.width = width;
   }

   @JsonProperty("height")
   public void setHeight(Integer height) {
      this.height = height;
   }

   @JsonProperty("duration")
   public void setDuration(Integer duration) {
      this.duration = duration;
   }

   @JsonProperty("supports_streaming")
   public void setSupportsStreaming(Boolean supportsStreaming) {
      this.supportsStreaming = supportsStreaming;
   }

   @JsonProperty("thumb")
   public void setThumb(InputFile thumb) {
      this.thumb = thumb;
   }

   public String toString() {
      return "InputMediaVideo(width=" + this.getWidth() + ", height=" + this.getHeight() + ", duration=" + this.getDuration() + ", supportsStreaming=" + this.getSupportsStreaming() + ", thumb=" + this.getThumb() + ")";
   }

   public static class InputMediaVideoBuilder {
      private String media;
      private String caption;
      private String parseMode;
      private List<MessageEntity> entities;
      private boolean isNewMedia;
      private String mediaName;
      private File newMediaFile;
      private InputStream newMediaStream;
      private Integer width;
      private Integer height;
      private Integer duration;
      private Boolean supportsStreaming;
      private InputFile thumb;

      InputMediaVideoBuilder() {
      }

      public InputMediaVideo.InputMediaVideoBuilder media(@NonNull String media) {
         if (media == null) {
            throw new NullPointerException("media is marked non-null but is null");
         } else {
            this.media = media;
            return this;
         }
      }

      public InputMediaVideo.InputMediaVideoBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder entities(List<MessageEntity> entities) {
         this.entities = entities;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder isNewMedia(boolean isNewMedia) {
         this.isNewMedia = isNewMedia;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder mediaName(String mediaName) {
         this.mediaName = mediaName;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder newMediaFile(File newMediaFile) {
         this.newMediaFile = newMediaFile;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder newMediaStream(InputStream newMediaStream) {
         this.newMediaStream = newMediaStream;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder width(Integer width) {
         this.width = width;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder height(Integer height) {
         this.height = height;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder duration(Integer duration) {
         this.duration = duration;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder supportsStreaming(Boolean supportsStreaming) {
         this.supportsStreaming = supportsStreaming;
         return this;
      }

      public InputMediaVideo.InputMediaVideoBuilder thumb(InputFile thumb) {
         this.thumb = thumb;
         return this;
      }

      public InputMediaVideo build() {
         return new InputMediaVideo(this.media, this.caption, this.parseMode, this.entities, this.isNewMedia, this.mediaName, this.newMediaFile, this.newMediaStream, this.width, this.height, this.duration, this.supportsStreaming, this.thumb);
      }

      public String toString() {
         return "InputMediaVideo.InputMediaVideoBuilder(media=" + this.media + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", entities=" + this.entities + ", isNewMedia=" + this.isNewMedia + ", mediaName=" + this.mediaName + ", newMediaFile=" + this.newMediaFile + ", newMediaStream=" + this.newMediaStream + ", width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", supportsStreaming=" + this.supportsStreaming + ", thumb=" + this.thumb + ")";
      }
   }
}
