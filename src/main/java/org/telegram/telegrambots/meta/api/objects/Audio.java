package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class Audio implements BotApiObject {
   private static final String FILEID_FIELD = "file_id";
   private static final String FILEUNIQUEID_FIELD = "file_unique_id";
   private static final String DURATION_FIELD = "duration";
   private static final String MIMETYPE_FIELD = "mime_type";
   private static final String FILESIZE_FIELD = "file_size";
   private static final String TITLE_FIELD = "title";
   private static final String PERFORMER_FIELD = "performer";
   private static final String THUMB_FIELD = "thumb";
   private static final String FILENAME_FIELD = "file_name";
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
   @JsonProperty("title")
   private String title;
   @JsonProperty("performer")
   private String performer;
   @JsonProperty("thumb")
   private PhotoSize thumb;
   @JsonProperty("file_name")
   private String fileName;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Audio)) {
         return false;
      } else {
         Audio other = (Audio)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label119: {
               Object this$duration = this.getDuration();
               Object other$duration = other.getDuration();
               if (this$duration == null) {
                  if (other$duration == null) {
                     break label119;
                  }
               } else if (this$duration.equals(other$duration)) {
                  break label119;
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

            label105: {
               Object this$fileId = this.getFileId();
               Object other$fileId = other.getFileId();
               if (this$fileId == null) {
                  if (other$fileId == null) {
                     break label105;
                  }
               } else if (this$fileId.equals(other$fileId)) {
                  break label105;
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

            label91: {
               Object this$mimeType = this.getMimeType();
               Object other$mimeType = other.getMimeType();
               if (this$mimeType == null) {
                  if (other$mimeType == null) {
                     break label91;
                  }
               } else if (this$mimeType.equals(other$mimeType)) {
                  break label91;
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

            label77: {
               Object this$performer = this.getPerformer();
               Object other$performer = other.getPerformer();
               if (this$performer == null) {
                  if (other$performer == null) {
                     break label77;
                  }
               } else if (this$performer.equals(other$performer)) {
                  break label77;
               }

               return false;
            }

            label70: {
               Object this$thumb = this.getThumb();
               Object other$thumb = other.getThumb();
               if (this$thumb == null) {
                  if (other$thumb == null) {
                     break label70;
                  }
               } else if (this$thumb.equals(other$thumb)) {
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
      return other instanceof Audio;
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
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $performer = this.getPerformer();
      result = result * 59 + ($performer == null ? 43 : $performer.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
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

   public Integer getDuration() {
      return this.duration;
   }

   public String getMimeType() {
      return this.mimeType;
   }

   public Integer getFileSize() {
      return this.fileSize;
   }

   public String getTitle() {
      return this.title;
   }

   public String getPerformer() {
      return this.performer;
   }

   public PhotoSize getThumb() {
      return this.thumb;
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

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("performer")
   public void setPerformer(String performer) {
      this.performer = performer;
   }

   @JsonProperty("thumb")
   public void setThumb(PhotoSize thumb) {
      this.thumb = thumb;
   }

   @JsonProperty("file_name")
   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   public String toString() {
      return "Audio(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", duration=" + this.getDuration() + ", mimeType=" + this.getMimeType() + ", fileSize=" + this.getFileSize() + ", title=" + this.getTitle() + ", performer=" + this.getPerformer() + ", thumb=" + this.getThumb() + ", fileName=" + this.getFileName() + ")";
   }

   public Audio() {
   }

   public Audio(String fileId, String fileUniqueId, Integer duration, String mimeType, Integer fileSize, String title, String performer, PhotoSize thumb, String fileName) {
      this.fileId = fileId;
      this.fileUniqueId = fileUniqueId;
      this.duration = duration;
      this.mimeType = mimeType;
      this.fileSize = fileSize;
      this.title = title;
      this.performer = performer;
      this.thumb = thumb;
      this.fileName = fileName;
   }
}
