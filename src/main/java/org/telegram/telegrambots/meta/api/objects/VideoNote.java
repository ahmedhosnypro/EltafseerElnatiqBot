package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class VideoNote implements BotApiObject {
   private static final String FILEID_FIELD = "file_id";
   private static final String FILEUNIQUEID_FIELD = "file_unique_id";
   private static final String LENGTH_FIELD = "length";
   private static final String DURATION_FIELD = "duration";
   private static final String THUMB_FIELD = "thumb";
   private static final String FILESIZE_FIELD = "file_size";
   @JsonProperty("file_id")
   private String fileId;
   @JsonProperty("file_unique_id")
   private String fileUniqueId;
   @JsonProperty("length")
   private Integer length;
   @JsonProperty("duration")
   private Integer duration;
   @JsonProperty("thumb")
   private PhotoSize thumb;
   @JsonProperty("file_size")
   private Integer fileSize;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof VideoNote)) {
         return false;
      } else {
         VideoNote other = (VideoNote)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$length = this.getLength();
            Object other$length = other.getLength();
            if (this$length == null) {
               if (other$length != null) {
                  return false;
               }
            } else if (!this$length.equals(other$length)) {
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

            Object this$fileSize = this.getFileSize();
            Object other$fileSize = other.getFileSize();
            if (this$fileSize == null) {
               if (other$fileSize != null) {
                  return false;
               }
            } else if (!this$fileSize.equals(other$fileSize)) {
               return false;
            }

            label62: {
               Object this$fileId = this.getFileId();
               Object other$fileId = other.getFileId();
               if (this$fileId == null) {
                  if (other$fileId == null) {
                     break label62;
                  }
               } else if (this$fileId.equals(other$fileId)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$fileUniqueId = this.getFileUniqueId();
               Object other$fileUniqueId = other.getFileUniqueId();
               if (this$fileUniqueId == null) {
                  if (other$fileUniqueId == null) {
                     break label55;
                  }
               } else if (this$fileUniqueId.equals(other$fileUniqueId)) {
                  break label55;
               }

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
      return other instanceof VideoNote;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $length = this.getLength();
      int result = result * 59 + ($length == null ? 43 : $length.hashCode());
      Object $duration = this.getDuration();
      result = result * 59 + ($duration == null ? 43 : $duration.hashCode());
      Object $fileSize = this.getFileSize();
      result = result * 59 + ($fileSize == null ? 43 : $fileSize.hashCode());
      Object $fileId = this.getFileId();
      result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());
      Object $fileUniqueId = this.getFileUniqueId();
      result = result * 59 + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      return result;
   }

   public String getFileId() {
      return this.fileId;
   }

   public String getFileUniqueId() {
      return this.fileUniqueId;
   }

   public Integer getLength() {
      return this.length;
   }

   public Integer getDuration() {
      return this.duration;
   }

   public PhotoSize getThumb() {
      return this.thumb;
   }

   public Integer getFileSize() {
      return this.fileSize;
   }

   @JsonProperty("file_id")
   public void setFileId(String fileId) {
      this.fileId = fileId;
   }

   @JsonProperty("file_unique_id")
   public void setFileUniqueId(String fileUniqueId) {
      this.fileUniqueId = fileUniqueId;
   }

   @JsonProperty("length")
   public void setLength(Integer length) {
      this.length = length;
   }

   @JsonProperty("duration")
   public void setDuration(Integer duration) {
      this.duration = duration;
   }

   @JsonProperty("thumb")
   public void setThumb(PhotoSize thumb) {
      this.thumb = thumb;
   }

   @JsonProperty("file_size")
   public void setFileSize(Integer fileSize) {
      this.fileSize = fileSize;
   }

   public String toString() {
      return "VideoNote(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", length=" + this.getLength() + ", duration=" + this.getDuration() + ", thumb=" + this.getThumb() + ", fileSize=" + this.getFileSize() + ")";
   }

   public VideoNote() {
   }

   public VideoNote(String fileId, String fileUniqueId, Integer length, Integer duration, PhotoSize thumb, Integer fileSize) {
      this.fileId = fileId;
      this.fileUniqueId = fileUniqueId;
      this.length = length;
      this.duration = duration;
      this.thumb = thumb;
      this.fileSize = fileSize;
   }
}
