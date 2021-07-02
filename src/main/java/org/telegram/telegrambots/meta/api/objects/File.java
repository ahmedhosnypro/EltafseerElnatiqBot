package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.security.InvalidParameterException;
import java.text.MessageFormat;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class File implements BotApiObject {
   private static final String FILEID_FIELD = "file_id";
   private static final String FILEUNIQUEID_FIELD = "file_unique_id";
   private static final String FILE_SIZE_FIELD = "file_size";
   private static final String FILE_PATH_FIELD = "file_path";
   @JsonProperty("file_id")
   private String fileId;
   @JsonProperty("file_unique_id")
   private String fileUniqueId;
   @JsonProperty("file_size")
   private Integer fileSize;
   @JsonProperty("file_path")
   private String filePath;

   public String getFileUrl(String botToken) {
      return getFileUrl(botToken, this.filePath);
   }

   public static String getFileUrl(String botToken, String filePath) {
      if (botToken != null && !botToken.isEmpty()) {
         return MessageFormat.format("https://api.telegram.org/file/bot{0}/{1}", botToken, filePath);
      } else {
         throw new InvalidParameterException("Bot token can't be empty");
      }
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof File)) {
         return false;
      } else {
         File other = (File)o;
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
      return other instanceof File;
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

   @JsonProperty("file_size")
   public void setFileSize(Integer fileSize) {
      this.fileSize = fileSize;
   }

   @JsonProperty("file_path")
   public void setFilePath(String filePath) {
      this.filePath = filePath;
   }

   public String toString() {
      return "File(fileId=" + this.getFileId() + ", fileUniqueId=" + this.getFileUniqueId() + ", fileSize=" + this.getFileSize() + ", filePath=" + this.getFilePath() + ")";
   }

   public File() {
   }

   public File(String fileId, String fileUniqueId, Integer fileSize, String filePath) {
      this.fileId = fileId;
      this.fileUniqueId = fileUniqueId;
      this.fileSize = fileSize;
      this.filePath = filePath;
   }
}
