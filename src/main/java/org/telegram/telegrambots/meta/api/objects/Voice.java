package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class Voice implements BotApiObject {
   private static final String FILEID_FIELD = "file_id";
   private static final String FILEUNIQUEID_FIELD = "file_unique_id";
   private static final String DURATION_FIELD = "duration";
   private static final String MIMETYPE_FIELD = "mime_type";
   private static final String FILESIZE_FIELD = "file_size";
   @JsonProperty("file_id")
   private String fileId;
   @JsonProperty("file_unique_id")
   private String fileUniqueId;
   @JsonProperty("duration")
   private Integer duration;
   @JsonProperty("mime_type")
   private String mimeType;
   @JsonProperty("file_size")
   private Integer fileSize;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Voice)) {
         return false;
      } else {
         Voice other = (Voice)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label71: {
               Object this$duration = this.getDuration();
               Object other$duration = other.getDuration();
               if (this$duration == null) {
                  if (other$duration == null) {
                     break label71;
                  }
               } else if (this$duration.equals(other$duration)) {
                  break label71;
               }

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

            label57: {
               Object this$fileId = this.getFileId();
               Object other$fileId = other.getFileId();
               if (this$fileId == null) {
                  if (other$fileId == null) {
                     break label57;
                  }
               } else if (this$fileId.equals(other$fileId)) {
                  break label57;
               }

               return false;
            }

            Object this$fileUniqueId = this.getFileUniqueId();
            Object other$fileUniqueId = other.getFileUniqueId();
            if (this$fileUniqueId == null) {
               if (other$fileUniqueId != null) {
                  return false;
               }
            } else if (!this$fileUniqueId.equals(other$fileUniqueId)) {
               return false;
            }

            Object this$mimeType = this.getMimeType();
            Object other$mimeType = other.getMimeType();
            if (this$mimeType == null) {
               if (other$mimeType == null) {
                  return true;
               }
            } else if (this$mimeType.equals(other$mimeType)) {
               return true;
            }

            return false;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Voice;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $duration = this.getDuration();
      int result = result * 59 + ($duration == null ? 43 : $duration.hashCode());
      Object $fileSize = this.getFileSize();
      result = result * 59 + ($fileSize == null ? 43 : $fileSize.hashCode());
      Object $fileId = this.getFileId();
      result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());
      Object $fileUniqueId = this.getFileUniqueId();
      result = result * 59 + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
      Object $mimeType = this.getMimeType();
      result = result * 59 + ($mimeType == null ? 43 : $mimeType.hashCode());
      return result;
   }

   public String getFileId() {
      return this.fileId;
   }

   public String getFileUniqueId() {
      return this.fileUniqueId;
   }

   public Integer getDuration() {
      return this.duration;
   }

   public String getMimeType() {
      return this.mimeType;
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

   @JsonProperty("duration")
   public void setDuration(Integer duration) {
      this.duration = duration;
   }

   @JsonProperty("mime_type")
   public void setMimeType(String mimeType) {
      this.mimeType = mimeType;
   }

   @JsonProperty("file_size")
   public void setFileSize(Integer fileSize) {
      this.fileSize = fileSize;
   }

   public String toString() {
      return "Voice(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", duration=" + this.getDuration() + ", mimeType=" + this.getMimeType() + ", fileSize=" + this.getFileSize() + ")";
   }

   public Voice() {
   }

   public Voice(String fileId, String fileUniqueId, Integer duration, String mimeType, Integer fileSize) {
      this.fileId = fileId;
      this.fileUniqueId = fileUniqueId;
      this.duration = duration;
      this.mimeType = mimeType;
      this.fileSize = fileSize;
   }
}
