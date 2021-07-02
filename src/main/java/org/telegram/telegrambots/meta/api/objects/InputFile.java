package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonSerialize(
   using = InputFileSerializer.class,
   as = String.class
)
public class InputFile implements Validable, BotApiObject {
   private String attachName;
   @JsonIgnore
   private String mediaName;
   @JsonIgnore
   private java.io.File newMediaFile;
   @JsonIgnore
   private InputStream newMediaStream;
   @JsonIgnore
   private boolean isNew;

   public InputFile(String attachName) {
      this();
      this.setMedia(attachName);
   }

   public InputFile(java.io.File mediaFile) {
      this();
      this.setMedia(mediaFile, mediaFile.getName());
   }

   public InputFile(java.io.File mediaFile, String fileName) {
      this();
      this.setMedia(mediaFile, fileName);
   }

   public InputFile(InputStream mediaStream, String fileName) {
      this();
      this.setMedia(mediaStream, fileName);
   }

   public InputFile setMedia(java.io.File mediaFile, String fileName) {
      this.newMediaFile = mediaFile;
      this.mediaName = fileName;
      this.attachName = "attach://" + fileName;
      this.isNew = true;
      return this;
   }

   public InputFile setMedia(java.io.File mediaFile) {
      this.newMediaFile = mediaFile;
      this.mediaName = mediaFile.getName();
      this.attachName = "attach://" + mediaFile.getName();
      this.isNew = true;
      return this;
   }

   public InputFile setMedia(InputStream mediaStream, String fileName) {
      this.newMediaStream = mediaStream;
      this.mediaName = fileName;
      this.attachName = "attach://" + fileName;
      this.isNew = true;
      return this;
   }

   public InputFile setMedia(String attachName) {
      this.attachName = attachName;
      this.isNew = false;
      return this;
   }

   public String getAttachName() {
      return this.attachName;
   }

   public String getMediaName() {
      return this.mediaName;
   }

   public java.io.File getNewMediaFile() {
      return this.newMediaFile;
   }

   public InputStream getNewMediaStream() {
      return this.newMediaStream;
   }

   public boolean isNew() {
      return this.isNew;
   }

   public void validate() throws TelegramApiValidationException {
      if (this.isNew) {
         if (this.mediaName == null || this.mediaName.isEmpty()) {
            throw new TelegramApiValidationException("Media name can't be empty", this);
         }

         if (this.newMediaFile == null && this.newMediaStream == null) {
            throw new TelegramApiValidationException("Media can't be empty", this);
         }
      } else if (this.attachName == null || this.attachName.isEmpty()) {
         throw new TelegramApiValidationException("File_id can't be empty", this);
      }

   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputFile)) {
         return false;
      } else {
         InputFile other = (InputFile)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.isNew() != other.isNew()) {
            return false;
         } else {
            label61: {
               Object this$attachName = this.getAttachName();
               Object other$attachName = other.getAttachName();
               if (this$attachName == null) {
                  if (other$attachName == null) {
                     break label61;
                  }
               } else if (this$attachName.equals(other$attachName)) {
                  break label61;
               }

               return false;
            }

            label54: {
               Object this$mediaName = this.getMediaName();
               Object other$mediaName = other.getMediaName();
               if (this$mediaName == null) {
                  if (other$mediaName == null) {
                     break label54;
                  }
               } else if (this$mediaName.equals(other$mediaName)) {
                  break label54;
               }

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
      return other instanceof InputFile;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      int result = result * 59 + (this.isNew() ? 79 : 97);
      Object $attachName = this.getAttachName();
      result = result * 59 + ($attachName == null ? 43 : $attachName.hashCode());
      Object $mediaName = this.getMediaName();
      result = result * 59 + ($mediaName == null ? 43 : $mediaName.hashCode());
      Object $newMediaFile = this.getNewMediaFile();
      result = result * 59 + ($newMediaFile == null ? 43 : $newMediaFile.hashCode());
      Object $newMediaStream = this.getNewMediaStream();
      result = result * 59 + ($newMediaStream == null ? 43 : $newMediaStream.hashCode());
      return result;
   }

   public String toString() {
      return "InputFile(attachName=" + this.getAttachName() + ", mediaName=" + this.getMediaName() + ", newMediaFile=" + this.getNewMediaFile() + ", newMediaStream=" + this.getNewMediaStream() + ", isNew=" + this.isNew() + ")";
   }

   public InputFile() {
   }

   public InputFile(String attachName, String mediaName, java.io.File newMediaFile, InputStream newMediaStream, boolean isNew) {
      this.attachName = attachName;
      this.mediaName = mediaName;
      this.newMediaFile = newMediaFile;
      this.newMediaStream = newMediaStream;
      this.isNew = isNew;
   }
}
