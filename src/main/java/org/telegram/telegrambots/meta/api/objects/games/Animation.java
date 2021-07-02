package org.telegram.telegrambots.meta.api.objects.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;

public class Animation implements BotApiObject {
   private static final String FILEID_FIELD = "file_id";
   private static final String FILEUNIQUEID_FIELD = "file_unique_id";
   private static final String WIDTH_FIELD = "width";
   private static final String HEIGHT_FIELD = "height";
   private static final String DURATION_FIELD = "duration";
   private static final String THUMB_FIELD = "thumb";
   private static final String FILENAME_FIELD = "file_name";
   private static final String MIMETYPE_FIELD = "mime_type";
   private static final String FILESIZE_FIELD = "file_size";
   @JsonProperty("file_id")
   @NonNull
   private String fileId;
   @JsonProperty("file_unique_id")
   @NonNull
   private String fileUniqueId;
   @JsonProperty("width")
   @NonNull
   private Integer width;
   @JsonProperty("height")
   @NonNull
   private Integer height;
   @JsonProperty("duration")
   @NonNull
   private Integer duration;
   @JsonProperty("thumb")
   private PhotoSize thumb;
   @JsonProperty("file_name")
   private String fileName;
   @JsonProperty("mime_type")
   private String mimetype;
   @JsonProperty("file_size")
   private Integer fileSize;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Animation)) {
         return false;
      } else {
         Animation other = (Animation)o;
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
               Object this$fileName = this.getFileName();
               Object other$fileName = other.getFileName();
               if (this$fileName == null) {
                  if (other$fileName == null) {
                     break label70;
                  }
               } else if (this$fileName.equals(other$fileName)) {
                  break label70;
               }

               return false;
            }

            Object this$mimetype = this.getMimetype();
            Object other$mimetype = other.getMimetype();
            if (this$mimetype == null) {
               if (other$mimetype != null) {
                  return false;
               }
            } else if (!this$mimetype.equals(other$mimetype)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Animation;
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
      Object $fileName = this.getFileName();
      result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
      Object $mimetype = this.getMimetype();
      result = result * 59 + ($mimetype == null ? 43 : $mimetype.hashCode());
      return result;
   }

   @NonNull
   public String getFileId() {
      return this.fileId;
   }

   @NonNull
   public String getFileUniqueId() {
      return this.fileUniqueId;
   }

   @NonNull
   public Integer getWidth() {
      return this.width;
   }

   @NonNull
   public Integer getHeight() {
      return this.height;
   }

   @NonNull
   public Integer getDuration() {
      return this.duration;
   }

   public PhotoSize getThumb() {
      return this.thumb;
   }

   public String getFileName() {
      return this.fileName;
   }

   public String getMimetype() {
      return this.mimetype;
   }

   public Integer getFileSize() {
      return this.fileSize;
   }

   @JsonProperty("file_id")
   public void setFileId(@NonNull String fileId) {
      if (fileId == null) {
         throw new NullPointerException("fileId is marked non-null but is null");
      } else {
         this.fileId = fileId;
      }
   }

   @JsonProperty("file_unique_id")
   public void setFileUniqueId(@NonNull String fileUniqueId) {
      if (fileUniqueId == null) {
         throw new NullPointerException("fileUniqueId is marked non-null but is null");
      } else {
         this.fileUniqueId = fileUniqueId;
      }
   }

   @JsonProperty("width")
   public void setWidth(@NonNull Integer width) {
      if (width == null) {
         throw new NullPointerException("width is marked non-null but is null");
      } else {
         this.width = width;
      }
   }

   @JsonProperty("height")
   public void setHeight(@NonNull Integer height) {
      if (height == null) {
         throw new NullPointerException("height is marked non-null but is null");
      } else {
         this.height = height;
      }
   }

   @JsonProperty("duration")
   public void setDuration(@NonNull Integer duration) {
      if (duration == null) {
         throw new NullPointerException("duration is marked non-null but is null");
      } else {
         this.duration = duration;
      }
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
   public void setMimetype(String mimetype) {
      this.mimetype = mimetype;
   }

   @JsonProperty("file_size")
   public void setFileSize(Integer fileSize) {
      this.fileSize = fileSize;
   }

   public String toString() {
      return "Animation(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", duration=" + this.getDuration() + ", thumb=" + this.getThumb() + ", fileName=" + this.getFileName() + ", mimetype=" + this.getMimetype() + ", fileSize=" + this.getFileSize() + ")";
   }

   public Animation(@NonNull String fileId, @NonNull String fileUniqueId, @NonNull Integer width, @NonNull Integer height, @NonNull Integer duration) {
      if (fileId == null) {
         throw new NullPointerException("fileId is marked non-null but is null");
      } else if (fileUniqueId == null) {
         throw new NullPointerException("fileUniqueId is marked non-null but is null");
      } else if (width == null) {
         throw new NullPointerException("width is marked non-null but is null");
      } else if (height == null) {
         throw new NullPointerException("height is marked non-null but is null");
      } else if (duration == null) {
         throw new NullPointerException("duration is marked non-null but is null");
      } else {
         this.fileId = fileId;
         this.fileUniqueId = fileUniqueId;
         this.width = width;
         this.height = height;
         this.duration = duration;
      }
   }

   public Animation() {
   }

   public Animation(@NonNull String fileId, @NonNull String fileUniqueId, @NonNull Integer width, @NonNull Integer height, @NonNull Integer duration, PhotoSize thumb, String fileName, String mimetype, Integer fileSize) {
      if (fileId == null) {
         throw new NullPointerException("fileId is marked non-null but is null");
      } else if (fileUniqueId == null) {
         throw new NullPointerException("fileUniqueId is marked non-null but is null");
      } else if (width == null) {
         throw new NullPointerException("width is marked non-null but is null");
      } else if (height == null) {
         throw new NullPointerException("height is marked non-null but is null");
      } else if (duration == null) {
         throw new NullPointerException("duration is marked non-null but is null");
      } else {
         this.fileId = fileId;
         this.fileUniqueId = fileUniqueId;
         this.width = width;
         this.height = height;
         this.duration = duration;
         this.thumb = thumb;
         this.fileName = fileName;
         this.mimetype = mimetype;
         this.fileSize = fileSize;
      }
   }
}
