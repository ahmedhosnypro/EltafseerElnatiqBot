package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class Video implements BotApiObject {
   private static final String FILEID_FIELD = "file_id";
   private static final String FILEUNIQUEID_FIELD = "file_unique_id";
   private static final String WIDTH_FIELD = "width";
   private static final String HEIGHT_FIELD = "height";
   private static final String DURATION_FIELD = "duration";
   private static final String THUMB_FIELD = "thumb";
   private static final String MIMETYPE_FIELD = "mime_type";
   private static final String FILESIZE_FIELD = "file_size";
   private static final String FILENAME_FIELD = "file_name";
   @JsonProperty("file_id")
   private String fileId;
   @JsonProperty("file_unique_id")
   private String fileUniqueId;
   @JsonProperty("width")
   private Integer width;
   @JsonProperty("height")
   private Integer height;
   @JsonProperty("duration")
   private Integer duration;
   @JsonProperty("thumb")
   private PhotoSize thumb;
   @JsonProperty("mime_type")
   private String mimeType;
   @JsonProperty("file_size")
   private Integer fileSize;
   @JsonProperty("file_name")
   private String fileName;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Video)) {
         return false;
      } else {
         Video other = (Video)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label119: {
               Object this$width = this.getWidth();
               Object other$width = other.getWidth();
               if (this$width == null) {
                  if (other$width == null) {
                     break label119;
                  }
               } else if (this$width.equals(other$width)) {
                  break label119;
               }

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

            label105: {
               Object this$duration = this.getDuration();
               Object other$duration = other.getDuration();
               if (this$duration == null) {
                  if (other$duration == null) {
                     break label105;
                  }
               } else if (this$duration.equals(other$duration)) {
                  break label105;
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

            label91: {
               Object this$fileId = this.getFileId();
               Object other$fileId = other.getFileId();
               if (this$fileId == null) {
                  if (other$fileId == null) {
                     break label91;
                  }
               } else if (this$fileId.equals(other$fileId)) {
                  break label91;
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

            label77: {
               Object this$thumb = this.getThumb();
               Object other$thumb = other.getThumb();
               if (this$thumb == null) {
                  if (other$thumb == null) {
                     break label77;
                  }
               } else if (this$thumb.equals(other$thumb)) {
                  break label77;
               }

               return false;
            }

            label70: {
               Object this$mimeType = this.getMimeType();
               Object other$mimeType = other.getMimeType();
               if (this$mimeType == null) {
                  if (other$mimeType == null) {
                     break label70;
                  }
               } else if (this$mimeType.equals(other$mimeType)) {
                  break label70;
               }

               return false;
            }

            Object this$fileName = this.getFileName();
            Object other$fileName = other.getFileName();
            if (this$fileName == null) {
               if (other$fileName != null) {
                  return false;
               }
            } else if (!this$fileName.equals(other$fileName)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Video;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $width = this.getWidth();
      int result = result * 59 + ($width == null ? 43 : $width.hashCode());
      Object $height = this.getHeight();
      result = result * 59 + ($height == null ? 43 : $height.hashCode());
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
      Object $mimeType = this.getMimeType();
      result = result * 59 + ($mimeType == null ? 43 : $mimeType.hashCode());
      Object $fileName = this.getFileName();
      result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
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

   public Integer getDuration() {
      return this.duration;
   }

   public PhotoSize getThumb() {
      return this.thumb;
   }

   public String getMimeType() {
      return this.mimeType;
   }

   public Integer getFileSize() {
      return this.fileSize;
   }

   public String getFileName() {
      return this.fileName;
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

   @JsonProperty("duration")
   public void setDuration(Integer duration) {
      this.duration = duration;
   }

   @JsonProperty("thumb")
   public void setThumb(PhotoSize thumb) {
      this.thumb = thumb;
   }

   @JsonProperty("mime_type")
   public void setMimeType(String mimeType) {
      this.mimeType = mimeType;
   }

   @JsonProperty("file_size")
   public void setFileSize(Integer fileSize) {
      this.fileSize = fileSize;
   }

   @JsonProperty("file_name")
   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   public String toString() {
      return "Video(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", duration=" + this.getDuration() + ", thumb=" + this.getThumb() + ", mimeType=" + this.getMimeType() + ", fileSize=" + this.getFileSize() + ", fileName=" + this.getFileName() + ")";
   }

   public Video() {
   }

   public Video(String fileId, String fileUniqueId, Integer width, Integer height, Integer duration, PhotoSize thumb, String mimeType, Integer fileSize, String fileName) {
      this.fileId = fileId;
      this.fileUniqueId = fileUniqueId;
      this.width = width;
      this.height = height;
      this.duration = duration;
      this.thumb = thumb;
      this.mimeType = mimeType;
      this.fileSize = fileSize;
      this.fileName = fileName;
   }
}
