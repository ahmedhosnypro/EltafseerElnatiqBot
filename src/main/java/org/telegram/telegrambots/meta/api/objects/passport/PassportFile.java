package org.telegram.telegrambots.meta.api.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class PassportFile implements BotApiObject {
   private static final String FILEID_FIELD = "file_id";
   private static final String FILEUNIQUEID_FIELD = "file_unique_id";
   private static final String FILESIZE_FIELD = "file_size";
   private static final String FILEDATE_FIELD = "file_date";
   @JsonProperty("file_id")
   private String fileId;
   @JsonProperty("file_unique_id")
   private String fileUniqueId;
   @JsonProperty("file_size")
   private Integer fileSize;
   @JsonProperty("file_date")
   private Integer fileDate;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PassportFile)) {
         return false;
      } else {
         PassportFile other = (PassportFile)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$fileSize = this.getFileSize();
               Object other$fileSize = other.getFileSize();
               if (this$fileSize == null) {
                  if (other$fileSize == null) {
                     break label59;
                  }
               } else if (this$fileSize.equals(other$fileSize)) {
                  break label59;
               }

               return false;
            }

            Object this$fileDate = this.getFileDate();
            Object other$fileDate = other.getFileDate();
            if (this$fileDate == null) {
               if (other$fileDate != null) {
                  return false;
               }
            } else if (!this$fileDate.equals(other$fileDate)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PassportFile;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $fileSize = this.getFileSize();
      int result = result * 59 + ($fileSize == null ? 43 : $fileSize.hashCode());
      Object $fileDate = this.getFileDate();
      result = result * 59 + ($fileDate == null ? 43 : $fileDate.hashCode());
      Object $fileId = this.getFileId();
      result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());
      Object $fileUniqueId = this.getFileUniqueId();
      result = result * 59 + ($fileUniqueId == null ? 43 : $fileUniqueId.hashCode());
      return result;
   }

   public String getFileId() {
      return this.fileId;
   }

   public String getFileUniqueId() {
      return this.fileUniqueId;
   }

   public Integer getFileSize() {
      return this.fileSize;
   }

   public Integer getFileDate() {
      return this.fileDate;
   }

   @JsonProperty("file_id")
   public void setFileId(String fileId) {
      this.fileId = fileId;
   }

   @JsonProperty("file_unique_id")
   public void setFileUniqueId(String fileUniqueId) {
      this.fileUniqueId = fileUniqueId;
   }

   @JsonProperty("file_size")
   public void setFileSize(Integer fileSize) {
      this.fileSize = fileSize;
   }

   @JsonProperty("file_date")
   public void setFileDate(Integer fileDate) {
      this.fileDate = fileDate;
   }

   public String toString() {
      return "PassportFile(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", fileSize=" + this.getFileSize() + ", fileDate=" + this.getFileDate() + ")";
   }

   public PassportFile() {
   }

   public PassportFile(String fileId, String fileUniqueId, Integer fileSize, Integer fileDate) {
      this.fileId = fileId;
      this.fileUniqueId = fileUniqueId;
      this.fileSize = fileSize;
      this.fileDate = fileDate;
   }
}
