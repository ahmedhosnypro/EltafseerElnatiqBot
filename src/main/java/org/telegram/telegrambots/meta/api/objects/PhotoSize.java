package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class PhotoSize implements BotApiObject {
   private static final String FILEID_FIELD = "file_id";
   private static final String FILEUNIQUEID_FIELD = "file_unique_id";
   private static final String WIDTH_FIELD = "width";
   private static final String HEIGHT_FIELD = "height";
   private static final String FILESIZE_FIELD = "file_size";
   private static final String FILEPATH_FIELD = "file_path";
   @JsonProperty("file_id")
   private String fileId;
   @JsonProperty("file_unique_id")
   private String fileUniqueId;
   @JsonProperty("width")
   private Integer width;
   @JsonProperty("height")
   private Integer height;
   @JsonProperty("file_size")
   private Integer fileSize;
   @JsonProperty("file_path")
   private String filePath;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PhotoSize)) {
         return false;
      } else {
         PhotoSize other = (PhotoSize)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$width = this.getWidth();
            Object other$width = other.getWidth();
            if (this$width == null) {
               if (other$width != null) {
                  return false;
               }
            } else if (!this$width.equals(other$width)) {
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

            Object this$filePath = this.getFilePath();
            Object other$filePath = other.getFilePath();
            if (this$filePath == null) {
               if (other$filePath != null) {
                  return false;
               }
            } else if (!this$filePath.equals(other$filePath)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PhotoSize;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $width = this.getWidth();
      int result = result * 59 + ($width == null ? 43 : $width.hashCode());
      Object $height = this.getHeight();
      result = result * 59 + ($height == null ? 43 : $height.hashCode());
      Object $fileSize = this.getFileSize();
      result = result * 59 + ($fileSize == null ? 43 : $fileSize.hashCode());
      Object $fileId = this.getFileId();
      result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());
      Object $fileUniqueId = this.getFileUniqueId();
      result = result * 59 + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
      Object $filePath = this.getFilePath();
      result = result * 59 + ($filePath == null ? 43 : $filePath.hashCode());
      return result;
   }

   public String getFileId() {
      return this.fileId;
   }

   public String getFileUniqueId() {
      return this.fileUniqueId;
   }

   public Integer getWidth() {
      return this.width;
   }

   public Integer getHeight() {
      return this.height;
   }

   public Integer getFileSize() {
      return this.fileSize;
   }

   public String getFilePath() {
      return this.filePath;
   }

   @JsonProperty("file_id")
   public void setFileId(String fileId) {
      this.fileId = fileId;
   }

   @JsonProperty("file_unique_id")
   public void setFileUniqueId(String fileUniqueId) {
      this.fileUniqueId = fileUniqueId;
   }

   @JsonProperty("width")
   public void setWidth(Integer width) {
      this.width = width;
   }

   @JsonProperty("height")
   public void setHeight(Integer height) {
      this.height = height;
   }

   @JsonProperty("file_size")
   public void setFileSize(Integer fileSize) {
      this.fileSize = fileSize;
   }

   @JsonProperty("file_path")
   public void setFilePath(String filePath) {
      this.filePath = filePath;
   }

   public String toString() {
      return "PhotoSize(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", fileSize=" + this.getFileSize() + ", filePath=" + this.getFilePath() + ")";
   }

   public PhotoSize() {
   }

   public PhotoSize(String fileId, String fileUniqueId, Integer width, Integer height, Integer fileSize, String filePath) {
      this.fileId = fileId;
      this.fileUniqueId = fileUniqueId;
      this.width = width;
      this.height = height;
      this.fileSize = fileSize;
      this.filePath = filePath;
   }
}
