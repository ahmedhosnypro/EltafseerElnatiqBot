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
public class InputMediaAnimation extends InputMedia {
   private static final String TYPE = "animation";
   public static final String WIDTH_FIELD = "width";
   public static final String HEIGHT_FIELD = "height";
   public static final String DURATION_FIELD = "duration";
   public static final String THUMB_FIELD = "thumb";
   @JsonProperty("width")
   private Integer width;
   @JsonProperty("height")
   private Integer height;
   @JsonProperty("duration")
   private Integer duration;
   private InputFile thumb;

   public InputMediaAnimation() {
   }

   public InputMediaAnimation(@NonNull String media) {
      super(media);
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      }
   }

   public InputMediaAnimation(@NonNull String media, String caption, String parseMode, List<MessageEntity> entities, boolean isNewMedia, String mediaName, File newMediaFile, InputStream newMediaStream, Integer width, Integer height, Integer duration, InputFile thumb) {
      super(media, caption, parseMode, entities, isNewMedia, mediaName, newMediaFile, newMediaStream);
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      } else {
         this.width = width;
         this.height = height;
         this.duration = duration;
         this.thumb = thumb;
      }
   }

   public String getType() {
      return "animation";
   }

   public void validate() throws TelegramApiValidationException {
      super.validate();
   }

   public static InputMediaAnimation.InputMediaAnimationBuilder builder() {
      return new InputMediaAnimation.InputMediaAnimationBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputMediaAnimation)) {
         return false;
      } else {
         InputMediaAnimation other = (InputMediaAnimation)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (!super.equals(o)) {
            return false;
         } else {
            label61: {
               Object this$width = this.getWidth();
               Object other$width = other.getWidth();
               if (this$width == null) {
                  if (other$width == null) {
                     break label61;
                  }
               } else if (this$width.equals(other$width)) {
                  break label61;
               }

               return false;
            }

            label54: {
               Object this$height = this.getHeight();
               Object other$height = other.getHeight();
               if (this$height == null) {
                  if (other$height == null) {
                     break label54;
                  }
               } else if (this$height.equals(other$height)) {
                  break label54;
               }

               return false;
            }

            Object this$duration = this.getDuration();
            Object other$duration = other.getDuration();
            if (this$duration == null) {
               if (other$duration != null) {
                  return false;
               }
            } else if (!this$duration.equals(other$duration)) {
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
      return other instanceof InputMediaAnimation;
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

   public void setThumb(InputFile thumb) {
      this.thumb = thumb;
   }

   public String toString() {
      return "InputMediaAnimation(width=" + this.getWidth() + ", height=" + this.getHeight() + ", duration=" + this.getDuration() + ", thumb=" + this.getThumb() + ")";
   }

   public static class InputMediaAnimationBuilder {
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
      private InputFile thumb;

      InputMediaAnimationBuilder() {
      }

      public InputMediaAnimation.InputMediaAnimationBuilder media(@NonNull String media) {
         if (media == null) {
            throw new NullPointerException("media is marked non-null but is null");
         } else {
            this.media = media;
            return this;
         }
      }

      public InputMediaAnimation.InputMediaAnimationBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public InputMediaAnimation.InputMediaAnimationBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InputMediaAnimation.InputMediaAnimationBuilder entities(List<MessageEntity> entities) {
         this.entities = entities;
         return this;
      }

      public InputMediaAnimation.InputMediaAnimationBuilder isNewMedia(boolean isNewMedia) {
         this.isNewMedia = isNewMedia;
         return this;
      }

      public InputMediaAnimation.InputMediaAnimationBuilder mediaName(String mediaName) {
         this.mediaName = mediaName;
         return this;
      }

      public InputMediaAnimation.InputMediaAnimationBuilder newMediaFile(File newMediaFile) {
         this.newMediaFile = newMediaFile;
         return this;
      }

      public InputMediaAnimation.InputMediaAnimationBuilder newMediaStream(InputStream newMediaStream) {
         this.newMediaStream = newMediaStream;
         return this;
      }

      public InputMediaAnimation.InputMediaAnimationBuilder width(Integer width) {
         this.width = width;
         return this;
      }

      public InputMediaAnimation.InputMediaAnimationBuilder height(Integer height) {
         this.height = height;
         return this;
      }

      public InputMediaAnimation.InputMediaAnimationBuilder duration(Integer duration) {
         this.duration = duration;
         return this;
      }

      public InputMediaAnimation.InputMediaAnimationBuilder thumb(InputFile thumb) {
         this.thumb = thumb;
         return this;
      }

      public InputMediaAnimation build() {
         return new InputMediaAnimation(this.media, this.caption, this.parseMode, this.entities, this.isNewMedia, this.mediaName, this.newMediaFile, this.newMediaStream, this.width, this.height, this.duration, this.thumb);
      }

      public String toString() {
         return "InputMediaAnimation.InputMediaAnimationBuilder(media=" + this.media + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", entities=" + this.entities + ", isNewMedia=" + this.isNewMedia + ", mediaName=" + this.mediaName + ", newMediaFile=" + this.newMediaFile + ", newMediaStream=" + this.newMediaStream + ", width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", thumb=" + this.thumb + ")";
      }
   }
}
