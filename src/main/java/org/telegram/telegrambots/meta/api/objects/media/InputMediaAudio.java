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
public class InputMediaAudio extends InputMedia {
   private static final String TYPE = "audio";
   public static final String DURATION_FIELD = "duration";
   public static final String PERFORMER_FIELD = "performer";
   public static final String TITLE_FIELD = "title";
   public static final String THUMB_FIELD = "thumb";
   @JsonProperty("duration")
   private Integer duration;
   @JsonProperty("performer")
   private String performer;
   @JsonProperty("title")
   private String title;
   private InputFile thumb;

   public InputMediaAudio() {
   }

   public InputMediaAudio(@NonNull String media) {
      super(media);
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      }
   }

   public InputMediaAudio(@NonNull String media, String caption, String parseMode, List<MessageEntity> entities, boolean isNewMedia, String mediaName, File newMediaFile, InputStream newMediaStream, Integer duration, String performer, String title, InputFile thumb) {
      super(media, caption, parseMode, entities, isNewMedia, mediaName, newMediaFile, newMediaStream);
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      } else {
         this.duration = duration;
         this.performer = performer;
         this.title = title;
         this.thumb = thumb;
      }
   }

   public String getType() {
      return "audio";
   }

   public void validate() throws TelegramApiValidationException {
      super.validate();
   }

   public static InputMediaAudio.InputMediaAudioBuilder builder() {
      return new InputMediaAudio.InputMediaAudioBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputMediaAudio)) {
         return false;
      } else {
         InputMediaAudio other = (InputMediaAudio)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (!super.equals(o)) {
            return false;
         } else {
            label61: {
               Object this$duration = this.getDuration();
               Object other$duration = other.getDuration();
               if (this$duration == null) {
                  if (other$duration == null) {
                     break label61;
                  }
               } else if (this$duration.equals(other$duration)) {
                  break label61;
               }

               return false;
            }

            label54: {
               Object this$performer = this.getPerformer();
               Object other$performer = other.getPerformer();
               if (this$performer == null) {
                  if (other$performer == null) {
                     break label54;
                  }
               } else if (this$performer.equals(other$performer)) {
                  break label54;
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
      return other instanceof InputMediaAudio;
   }

   public int hashCode() {
      int PRIME = true;
      int result = super.hashCode();
      Object $duration = this.getDuration();
      result = result * 59 + ($duration == null ? 43 : $duration.hashCode());
      Object $performer = this.getPerformer();
      result = result * 59 + ($performer == null ? 43 : $performer.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      return result;
   }

   public Integer getDuration() {
      return this.duration;
   }

   public String getPerformer() {
      return this.performer;
   }

   public String getTitle() {
      return this.title;
   }

   public InputFile getThumb() {
      return this.thumb;
   }

   @JsonProperty("duration")
   public void setDuration(Integer duration) {
      this.duration = duration;
   }

   @JsonProperty("performer")
   public void setPerformer(String performer) {
      this.performer = performer;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   public void setThumb(InputFile thumb) {
      this.thumb = thumb;
   }

   public String toString() {
      return "InputMediaAudio(duration=" + this.getDuration() + ", performer=" + this.getPerformer() + ", title=" + this.getTitle() + ", thumb=" + this.getThumb() + ")";
   }

   public static class InputMediaAudioBuilder {
      private String media;
      private String caption;
      private String parseMode;
      private List<MessageEntity> entities;
      private boolean isNewMedia;
      private String mediaName;
      private File newMediaFile;
      private InputStream newMediaStream;
      private Integer duration;
      private String performer;
      private String title;
      private InputFile thumb;

      InputMediaAudioBuilder() {
      }

      public InputMediaAudio.InputMediaAudioBuilder media(@NonNull String media) {
         if (media == null) {
            throw new NullPointerException("media is marked non-null but is null");
         } else {
            this.media = media;
            return this;
         }
      }

      public InputMediaAudio.InputMediaAudioBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public InputMediaAudio.InputMediaAudioBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InputMediaAudio.InputMediaAudioBuilder entities(List<MessageEntity> entities) {
         this.entities = entities;
         return this;
      }

      public InputMediaAudio.InputMediaAudioBuilder isNewMedia(boolean isNewMedia) {
         this.isNewMedia = isNewMedia;
         return this;
      }

      public InputMediaAudio.InputMediaAudioBuilder mediaName(String mediaName) {
         this.mediaName = mediaName;
         return this;
      }

      public InputMediaAudio.InputMediaAudioBuilder newMediaFile(File newMediaFile) {
         this.newMediaFile = newMediaFile;
         return this;
      }

      public InputMediaAudio.InputMediaAudioBuilder newMediaStream(InputStream newMediaStream) {
         this.newMediaStream = newMediaStream;
         return this;
      }

      public InputMediaAudio.InputMediaAudioBuilder duration(Integer duration) {
         this.duration = duration;
         return this;
      }

      public InputMediaAudio.InputMediaAudioBuilder performer(String performer) {
         this.performer = performer;
         return this;
      }

      public InputMediaAudio.InputMediaAudioBuilder title(String title) {
         this.title = title;
         return this;
      }

      public InputMediaAudio.InputMediaAudioBuilder thumb(InputFile thumb) {
         this.thumb = thumb;
         return this;
      }

      public InputMediaAudio build() {
         return new InputMediaAudio(this.media, this.caption, this.parseMode, this.entities, this.isNewMedia, this.mediaName, this.newMediaFile, this.newMediaStream, this.duration, this.performer, this.title, this.thumb);
      }

      public String toString() {
         return "InputMediaAudio.InputMediaAudioBuilder(media=" + this.media + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", entities=" + this.entities + ", isNewMedia=" + this.isNewMedia + ", mediaName=" + this.mediaName + ", newMediaFile=" + this.newMediaFile + ", newMediaStream=" + this.newMediaStream + ", duration=" + this.duration + ", performer=" + this.performer + ", title=" + this.title + ", thumb=" + this.thumb + ")";
      }
   }
}
