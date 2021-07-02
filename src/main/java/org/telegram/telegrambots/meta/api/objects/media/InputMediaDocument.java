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
public class InputMediaDocument extends InputMedia {
   private static final String TYPE = "document";
   public static final String THUMB_FIELD = "thumb";
   public static final String DISABLECONTENTTYPEDETECTION_FIELD = "disable_content_type_detection";
   private InputFile thumb;
   @JsonProperty("disable_content_type_detection")
   private Boolean disableContentTypeDetection;

   public InputMediaDocument() {
   }

   public InputMediaDocument(@NonNull String media) {
      super(media);
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      }
   }

   public InputMediaDocument(@NonNull String media, String caption, String parseMode, List<MessageEntity> entities, boolean isNewMedia, String mediaName, File newMediaFile, InputStream newMediaStream, InputFile thumb, Boolean disableContentTypeDetection) {
      super(media, caption, parseMode, entities, isNewMedia, mediaName, newMediaFile, newMediaStream);
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      } else {
         this.thumb = thumb;
         this.disableContentTypeDetection = disableContentTypeDetection;
      }
   }

   public String getType() {
      return "document";
   }

   public void validate() throws TelegramApiValidationException {
      super.validate();
   }

   public static InputMediaDocument.InputMediaDocumentBuilder builder() {
      return new InputMediaDocument.InputMediaDocumentBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputMediaDocument)) {
         return false;
      } else {
         InputMediaDocument other = (InputMediaDocument)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (!super.equals(o)) {
            return false;
         } else {
            Object this$disableContentTypeDetection = this.getDisableContentTypeDetection();
            Object other$disableContentTypeDetection = other.getDisableContentTypeDetection();
            if (this$disableContentTypeDetection == null) {
               if (other$disableContentTypeDetection != null) {
                  return false;
               }
            } else if (!this$disableContentTypeDetection.equals(other$disableContentTypeDetection)) {
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
      return other instanceof InputMediaDocument;
   }

   public int hashCode() {
      int PRIME = true;
      int result = super.hashCode();
      Object $disableContentTypeDetection = this.getDisableContentTypeDetection();
      result = result * 59 + ($disableContentTypeDetection == null ? 43 : $disableContentTypeDetection.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      return result;
   }

   public InputFile getThumb() {
      return this.thumb;
   }

   public Boolean getDisableContentTypeDetection() {
      return this.disableContentTypeDetection;
   }

   public void setThumb(InputFile thumb) {
      this.thumb = thumb;
   }

   @JsonProperty("disable_content_type_detection")
   public void setDisableContentTypeDetection(Boolean disableContentTypeDetection) {
      this.disableContentTypeDetection = disableContentTypeDetection;
   }

   public String toString() {
      return "InputMediaDocument(thumb=" + this.getThumb() + ", disableContentTypeDetection=" + this.getDisableContentTypeDetection() + ")";
   }

   public static class InputMediaDocumentBuilder {
      private String media;
      private String caption;
      private String parseMode;
      private List<MessageEntity> entities;
      private boolean isNewMedia;
      private String mediaName;
      private File newMediaFile;
      private InputStream newMediaStream;
      private InputFile thumb;
      private Boolean disableContentTypeDetection;

      InputMediaDocumentBuilder() {
      }

      public InputMediaDocument.InputMediaDocumentBuilder media(@NonNull String media) {
         if (media == null) {
            throw new NullPointerException("media is marked non-null but is null");
         } else {
            this.media = media;
            return this;
         }
      }

      public InputMediaDocument.InputMediaDocumentBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public InputMediaDocument.InputMediaDocumentBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InputMediaDocument.InputMediaDocumentBuilder entities(List<MessageEntity> entities) {
         this.entities = entities;
         return this;
      }

      public InputMediaDocument.InputMediaDocumentBuilder isNewMedia(boolean isNewMedia) {
         this.isNewMedia = isNewMedia;
         return this;
      }

      public InputMediaDocument.InputMediaDocumentBuilder mediaName(String mediaName) {
         this.mediaName = mediaName;
         return this;
      }

      public InputMediaDocument.InputMediaDocumentBuilder newMediaFile(File newMediaFile) {
         this.newMediaFile = newMediaFile;
         return this;
      }

      public InputMediaDocument.InputMediaDocumentBuilder newMediaStream(InputStream newMediaStream) {
         this.newMediaStream = newMediaStream;
         return this;
      }

      public InputMediaDocument.InputMediaDocumentBuilder thumb(InputFile thumb) {
         this.thumb = thumb;
         return this;
      }

      public InputMediaDocument.InputMediaDocumentBuilder disableContentTypeDetection(Boolean disableContentTypeDetection) {
         this.disableContentTypeDetection = disableContentTypeDetection;
         return this;
      }

      public InputMediaDocument build() {
         return new InputMediaDocument(this.media, this.caption, this.parseMode, this.entities, this.isNewMedia, this.mediaName, this.newMediaFile, this.newMediaStream, this.thumb, this.disableContentTypeDetection);
      }

      public String toString() {
         return "InputMediaDocument.InputMediaDocumentBuilder(media=" + this.media + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", entities=" + this.entities + ", isNewMedia=" + this.isNewMedia + ", mediaName=" + this.mediaName + ", newMediaFile=" + this.newMediaFile + ", newMediaStream=" + this.newMediaStream + ", thumb=" + this.thumb + ", disableContentTypeDetection=" + this.disableContentTypeDetection + ")";
      }
   }
}
