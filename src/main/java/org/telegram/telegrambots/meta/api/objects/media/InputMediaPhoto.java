package org.telegram.telegrambots.meta.api.objects.media;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InputMediaPhoto extends InputMedia {
   private static final String TYPE = "photo";

   public InputMediaPhoto() {
   }

   public InputMediaPhoto(@NonNull String media) {
      super(media);
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      }
   }

   public InputMediaPhoto(@NonNull String media, String caption, String parseMode, List<MessageEntity> entities, boolean isNewMedia, String mediaName, File newMediaFile, InputStream newMediaStream) {
      super(media, caption, parseMode, entities, isNewMedia, mediaName, newMediaFile, newMediaStream);
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      }
   }

   public String getType() {
      return "photo";
   }

   public void validate() throws TelegramApiValidationException {
      super.validate();
   }

   public static InputMediaPhoto.InputMediaPhotoBuilder builder() {
      return new InputMediaPhoto.InputMediaPhotoBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputMediaPhoto)) {
         return false;
      } else {
         InputMediaPhoto other = (InputMediaPhoto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            return super.equals(o);
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InputMediaPhoto;
   }

   public int hashCode() {
      int result = super.hashCode();
      return result;
   }

   public String toString() {
      return "InputMediaPhoto()";
   }

   public static class InputMediaPhotoBuilder {
      private String media;
      private String caption;
      private String parseMode;
      private List<MessageEntity> entities;
      private boolean isNewMedia;
      private String mediaName;
      private File newMediaFile;
      private InputStream newMediaStream;

      InputMediaPhotoBuilder() {
      }

      public InputMediaPhoto.InputMediaPhotoBuilder media(@NonNull String media) {
         if (media == null) {
            throw new NullPointerException("media is marked non-null but is null");
         } else {
            this.media = media;
            return this;
         }
      }

      public InputMediaPhoto.InputMediaPhotoBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public InputMediaPhoto.InputMediaPhotoBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InputMediaPhoto.InputMediaPhotoBuilder entities(List<MessageEntity> entities) {
         this.entities = entities;
         return this;
      }

      public InputMediaPhoto.InputMediaPhotoBuilder isNewMedia(boolean isNewMedia) {
         this.isNewMedia = isNewMedia;
         return this;
      }

      public InputMediaPhoto.InputMediaPhotoBuilder mediaName(String mediaName) {
         this.mediaName = mediaName;
         return this;
      }

      public InputMediaPhoto.InputMediaPhotoBuilder newMediaFile(File newMediaFile) {
         this.newMediaFile = newMediaFile;
         return this;
      }

      public InputMediaPhoto.InputMediaPhotoBuilder newMediaStream(InputStream newMediaStream) {
         this.newMediaStream = newMediaStream;
         return this;
      }

      public InputMediaPhoto build() {
         return new InputMediaPhoto(this.media, this.caption, this.parseMode, this.entities, this.isNewMedia, this.mediaName, this.newMediaFile, this.newMediaStream);
      }

      public String toString() {
         return "InputMediaPhoto.InputMediaPhotoBuilder(media=" + this.media + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", entities=" + this.entities + ", isNewMedia=" + this.isNewMedia + ", mediaName=" + this.mediaName + ", newMediaFile=" + this.newMediaFile + ", newMediaStream=" + this.newMediaStream + ")";
      }
   }
}
