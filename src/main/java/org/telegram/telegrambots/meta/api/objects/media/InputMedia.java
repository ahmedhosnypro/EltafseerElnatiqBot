package org.telegram.telegrambots.meta.api.objects.media;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.media.serialization.InputMediaDeserializer;
import org.telegram.telegrambots.meta.api.objects.media.serialization.InputMediaSerializer;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonSerialize(
   using = InputMediaSerializer.class
)
@JsonDeserialize(
   using = InputMediaDeserializer.class
)
public abstract class InputMedia implements Validable, BotApiObject {
   public static final String TYPE_FIELD = "type";
   public static final String MEDIA_FIELD = "media";
   public static final String CAPTION_FIELD = "caption";
   public static final String PARSEMODE_FIELD = "parse_mode";
   public static final String ENTITIES_FIELD = "entities";
   @JsonProperty("media")
   @NonNull
   private String media;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("entities")
   private List<MessageEntity> entities;
   @JsonIgnore
   private boolean isNewMedia;
   @JsonIgnore
   private String mediaName;
   @JsonIgnore
   private File newMediaFile;
   @JsonIgnore
   private InputStream newMediaStream;

   @JsonIgnore
   public boolean isNewMedia() {
      return this.isNewMedia;
   }

   public void setMedia(String media) {
      this.media = media;
      this.isNewMedia = false;
   }

   public void setMedia(File mediaFile, String fileName) {
      this.newMediaFile = mediaFile;
      this.isNewMedia = true;
      this.mediaName = fileName;
      this.media = "attach://" + fileName;
   }

   public void setMedia(InputStream mediaStream, String fileName) {
      this.newMediaStream = mediaStream;
      this.isNewMedia = true;
      this.mediaName = fileName;
      this.media = "attach://" + fileName;
   }

   public void validate() throws TelegramApiValidationException {
      if (this.isNewMedia) {
         if (this.mediaName == null || this.mediaName.isEmpty()) {
            throw new TelegramApiValidationException("Media name can't be empty", this);
         }

         if (this.newMediaFile == null && this.newMediaStream == null) {
            throw new TelegramApiValidationException("Media can't be empty", this);
         }
      } else if (this.media == null || this.media.isEmpty()) {
         throw new TelegramApiValidationException("Media can't be empty", this);
      }

      if (this.parseMode != null && this.entities != null && !this.entities.isEmpty()) {
         throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
      }
   }

   @JsonProperty("type")
   public abstract String getType();

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputMedia)) {
         return false;
      } else {
         InputMedia other = (InputMedia)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.isNewMedia() != other.isNewMedia()) {
            return false;
         } else {
            label97: {
               Object this$media = this.getMedia();
               Object other$media = other.getMedia();
               if (this$media == null) {
                  if (other$media == null) {
                     break label97;
                  }
               } else if (this$media.equals(other$media)) {
                  break label97;
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

            Object this$parseMode = this.getParseMode();
            Object other$parseMode = other.getParseMode();
            if (this$parseMode == null) {
               if (other$parseMode != null) {
                  return false;
               }
            } else if (!this$parseMode.equals(other$parseMode)) {
               return false;
            }

            label76: {
               Object this$entities = this.getEntities();
               Object other$entities = other.getEntities();
               if (this$entities == null) {
                  if (other$entities == null) {
                     break label76;
                  }
               } else if (this$entities.equals(other$entities)) {
                  break label76;
               }

               return false;
            }

            Object this$mediaName = this.getMediaName();
            Object other$mediaName = other.getMediaName();
            if (this$mediaName == null) {
               if (other$mediaName != null) {
                  return false;
               }
            } else if (!this$mediaName.equals(other$mediaName)) {
               return false;
            }

            Object this$newMediaFile = this.getNewMediaFile();
            Object other$newMediaFile = other.getNewMediaFile();
            if (this$newMediaFile == null) {
               if (other$newMediaFile != null) {
                  return false;
               }
            } else if (!this$newMediaFile.equals(other$newMediaFile)) {
               return false;
            }

            Object this$newMediaStream = this.getNewMediaStream();
            Object other$newMediaStream = other.getNewMediaStream();
            if (this$newMediaStream == null) {
               if (other$newMediaStream != null) {
                  return false;
               }
            } else if (!this$newMediaStream.equals(other$newMediaStream)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InputMedia;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      int result = result * 59 + (this.isNewMedia() ? 79 : 97);
      Object $media = this.getMedia();
      result = result * 59 + ($media == null ? 43 : $media.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $entities = this.getEntities();
      result = result * 59 + ($entities == null ? 43 : $entities.hashCode());
      Object $mediaName = this.getMediaName();
      result = result * 59 + ($mediaName == null ? 43 : $mediaName.hashCode());
      Object $newMediaFile = this.getNewMediaFile();
      result = result * 59 + ($newMediaFile == null ? 43 : $newMediaFile.hashCode());
      Object $newMediaStream = this.getNewMediaStream();
      result = result * 59 + ($newMediaStream == null ? 43 : $newMediaStream.hashCode());
      return result;
   }

   @NonNull
   public String getMedia() {
      return this.media;
   }

   public String getCaption() {
      return this.caption;
   }

   public String getParseMode() {
      return this.parseMode;
   }

   public List<MessageEntity> getEntities() {
      return this.entities;
   }

   public String getMediaName() {
      return this.mediaName;
   }

   public File getNewMediaFile() {
      return this.newMediaFile;
   }

   public InputStream getNewMediaStream() {
      return this.newMediaStream;
   }

   @JsonProperty("caption")
   public void setCaption(String caption) {
      this.caption = caption;
   }

   @JsonProperty("parse_mode")
   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   @JsonProperty("entities")
   public void setEntities(List<MessageEntity> entities) {
      this.entities = entities;
   }

   @JsonIgnore
   public void setNewMedia(boolean isNewMedia) {
      this.isNewMedia = isNewMedia;
   }

   @JsonIgnore
   public void setMediaName(String mediaName) {
      this.mediaName = mediaName;
   }

   @JsonIgnore
   public void setNewMediaFile(File newMediaFile) {
      this.newMediaFile = newMediaFile;
   }

   @JsonIgnore
   public void setNewMediaStream(InputStream newMediaStream) {
      this.newMediaStream = newMediaStream;
   }

   public String toString() {
      return "InputMedia(media=" + this.getMedia() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", entities=" + this.getEntities() + ", isNewMedia=" + this.isNewMedia() + ", mediaName=" + this.getMediaName() + ", newMediaFile=" + this.getNewMediaFile() + ", newMediaStream=" + this.getNewMediaStream() + ")";
   }

   public InputMedia(@NonNull String media) {
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      } else {
         this.media = media;
      }
   }

   public InputMedia() {
   }

   public InputMedia(@NonNull String media, String caption, String parseMode, List<MessageEntity> entities, boolean isNewMedia, String mediaName, File newMediaFile, InputStream newMediaStream) {
      if (media == null) {
         throw new NullPointerException("media is marked non-null but is null");
      } else {
         this.media = media;
         this.caption = caption;
         this.parseMode = parseMode;
         this.entities = entities;
         this.isNewMedia = isNewMedia;
         this.mediaName = mediaName;
         this.newMediaFile = newMediaFile;
         this.newMediaStream = newMediaStream;
      }
   }
}
