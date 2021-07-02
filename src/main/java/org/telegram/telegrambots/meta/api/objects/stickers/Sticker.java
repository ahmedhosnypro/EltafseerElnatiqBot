package org.telegram.telegrambots.meta.api.objects.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;

public class Sticker implements BotApiObject {
   private static final String FILEID_FIELD = "file_id";
   private static final String FILEUNIQUEID_FIELD = "file_unique_id";
   private static final String WIDTH_FIELD = "width";
   private static final String HEIGHT_FIELD = "height";
   private static final String THUMB_FIELD = "thumb";
   private static final String FILESIZE_FIELD = "file_size";
   private static final String EMOJI_FIELD = "emoji";
   private static final String SETNAME_FIELD = "set_name";
   private static final String MASKPOSITON_FIELD = "mask_position";
   private static final String ISANIMATED_FIELD = "is_animated";
   @JsonProperty("file_id")
   private String fileId;
   @JsonProperty("file_unique_id")
   private String fileUniqueId;
   @JsonProperty("width")
   private Integer width;
   @JsonProperty("height")
   private Integer height;
   @JsonProperty("thumb")
   private PhotoSize thumb;
   @JsonProperty("file_size")
   private Integer fileSize;
   @JsonProperty("emoji")
   private String emoji;
   @JsonProperty("set_name")
   private String setName;
   @JsonProperty("mask_position")
   private MaskPosition maskPosition;
   @JsonProperty("is_animated")
   private Boolean isAnimated;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Sticker)) {
         return false;
      } else {
         Sticker other = (Sticker)o;
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

            label110: {
               Object this$isAnimated = this.getIsAnimated();
               Object other$isAnimated = other.getIsAnimated();
               if (this$isAnimated == null) {
                  if (other$isAnimated == null) {
                     break label110;
                  }
               } else if (this$isAnimated.equals(other$isAnimated)) {
                  break label110;
               }

               return false;
            }

            label103: {
               Object this$fileId = this.getFileId();
               Object other$fileId = other.getFileId();
               if (this$fileId == null) {
                  if (other$fileId == null) {
                     break label103;
                  }
               } else if (this$fileId.equals(other$fileId)) {
                  break label103;
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

            label89: {
               Object this$thumb = this.getThumb();
               Object other$thumb = other.getThumb();
               if (this$thumb == null) {
                  if (other$thumb == null) {
                     break label89;
                  }
               } else if (this$thumb.equals(other$thumb)) {
                  break label89;
               }

               return false;
            }

            label82: {
               Object this$emoji = this.getEmoji();
               Object other$emoji = other.getEmoji();
               if (this$emoji == null) {
                  if (other$emoji == null) {
                     break label82;
                  }
               } else if (this$emoji.equals(other$emoji)) {
                  break label82;
               }

               return false;
            }

            Object this$setName = this.getSetName();
            Object other$setName = other.getSetName();
            if (this$setName == null) {
               if (other$setName != null) {
                  return false;
               }
            } else if (!this$setName.equals(other$setName)) {
               return false;
            }

            Object this$maskPosition = this.getMaskPosition();
            Object other$maskPosition = other.getMaskPosition();
            if (this$maskPosition == null) {
               if (other$maskPosition != null) {
                  return false;
               }
            } else if (!this$maskPosition.equals(other$maskPosition)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Sticker;
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
      Object $isAnimated = this.getIsAnimated();
      result = result * 59 + ($isAnimated == null ? 43 : $isAnimated.hashCode());
      Object $fileId = this.getFileId();
      result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());
      Object $fileUniqueId = this.getFileUniqueId();
      result = result * 59 + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      Object $emoji = this.getEmoji();
      result = result * 59 + ($emoji == null ? 43 : $emoji.hashCode());
      Object $setName = this.getSetName();
      result = result * 59 + ($setName == null ? 43 : $setName.hashCode());
      Object $maskPosition = this.getMaskPosition();
      result = result * 59 + ($maskPosition == null ? 43 : $maskPosition.hashCode());
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

   public PhotoSize getThumb() {
      return this.thumb;
   }

   public Integer getFileSize() {
      return this.fileSize;
   }

   public String getEmoji() {
      return this.emoji;
   }

   public String getSetName() {
      return this.setName;
   }

   public MaskPosition getMaskPosition() {
      return this.maskPosition;
   }

   public Boolean getIsAnimated() {
      return this.isAnimated;
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

   @JsonProperty("thumb")
   public void setThumb(PhotoSize thumb) {
      this.thumb = thumb;
   }

   @JsonProperty("file_size")
   public void setFileSize(Integer fileSize) {
      this.fileSize = fileSize;
   }

   @JsonProperty("emoji")
   public void setEmoji(String emoji) {
      this.emoji = emoji;
   }

   @JsonProperty("set_name")
   public void setSetName(String setName) {
      this.setName = setName;
   }

   @JsonProperty("mask_position")
   public void setMaskPosition(MaskPosition maskPosition) {
      this.maskPosition = maskPosition;
   }

   @JsonProperty("is_animated")
   public void setIsAnimated(Boolean isAnimated) {
      this.isAnimated = isAnimated;
   }

   public String toString() {
      return "Sticker(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", thumb=" + this.getThumb() + ", fileSize=" + this.getFileSize() + ", emoji=" + this.getEmoji() + ", setName=" + this.getSetName() + ", maskPosition=" + this.getMaskPosition() + ", isAnimated=" + this.getIsAnimated() + ")";
   }

   public Sticker() {
   }

   public Sticker(String fileId, String fileUniqueId, Integer width, Integer height, PhotoSize thumb, Integer fileSize, String emoji, String setName, MaskPosition maskPosition, Boolean isAnimated) {
      this.fileId = fileId;
      this.fileUniqueId = fileUniqueId;
      this.width = width;
      this.height = height;
      this.thumb = thumb;
      this.fileSize = fileSize;
      this.emoji = emoji;
      this.setName = setName;
      this.maskPosition = maskPosition;
      this.isAnimated = isAnimated;
   }
}
