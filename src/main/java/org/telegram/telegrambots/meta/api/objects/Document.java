package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class Document implements BotApiObject {
   private static final String FILEID_FIELD = "file_id";
   private static final String FILEUNIQUEID_FIELD = "file_unique_id";
   private static final String THUMB_FIELD = "thumb";
   private static final String FILENAME_FIELD = "file_name";
   private static final String MIMETYPE_FIELD = "mime_type";
   private static final String FILESIZE_FIELD = "file_size";
   @JsonProperty("file_id")
   private String fileId;
   @JsonProperty("file_unique_id")
   private String fileUniqueId;
   @JsonProperty("thumb")
   private PhotoSize thumb;
   @JsonProperty("file_name")
   private String fileName;
   @JsonProperty("mime_type")
   private String mimeType;
   @JsonProperty("file_size")
   private Integer fileSize;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Document)) {
         return false;
      } else {
         Document other = (Document)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$fileSize = this.getFileSize();
            Object other$fileSize = other.getFileSize();
            if (this$fileSize == null) {
               if (other$fileSize != null) {
                  return false;
               }
            } else if (!this$fileSize.equals(other$fileSize)) {
               return false;
            }

            Object this$fileId = this.getFileId();
            Object other$fileId = other.getFileId();
            if (this$fileId == null) {
               if (other$fileId != null) {
                  return false;
               }
            } else if (!this$fileId.equals(other$fileId)) {
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

            label62: {
               Object this$thumb = this.getThumb();
               Object other$thumb = other.getThumb();
               if (this$thumb == null) {
                  if (other$thumb == null) {
                     break label62;
                  }
               } else if (this$thumb.equals(other$thumb)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$fileName = this.getFileName();
               Object other$fileName = other.getFileName();
               if (this$fileName == null) {
                  if (other$fileName == null) {
                     break label55;
                  }
               } else if (this$fileName.equals(other$fileName)) {
                  break label55;
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Document;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $fileSize = this.getFileSize();
      int result = result * 59 + ($fileSize == null ? 43 : $fileSize.hashCode());
      Object $fileId = this.getFileId();
      result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());
      Object $fileUniqueId = this.getFileUniqueId();
      result = result * 59 + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      Object $fileName = this.getFileName();
      result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
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

   public PhotoSize getThumb() {
      return this.thumb;
   }

   public String getFileName() {
      return this.fileName;
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

   @JsonProperty("thumb")
   public void setThumb(PhotoSize thumb) {
      this.thumb = thumb;
   }

   @JsonProperty("file_name")
   public void setFileName(String fileName) {
      this.fileName = fileName;
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
      return "Document(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", thumb=" + this.getThumb() + ", fileName=" + this.getFileName() + ", mimeType=" + this.getMimeType() + ", fileSize=" + this.getFileSize() + ")";
   }

   public Document() {
   }

   public Document(String fileId, String fileUniqueId, PhotoSize thumb, String fileName, String mimeType, Integer fileSize) {
      this.fileId = fileId;
      this.fileUniqueId = fileUniqueId;
      this.thumb = thumb;
      this.fileName = fileName;
      this.mimeType = mimeType;
      this.fileSize = fileSize;
   }
}
