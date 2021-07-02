package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetFile extends BotApiMethod<File> {
   public static final String PATH = "getFile";
   private static final String FILEID_FIELD = "file_id";
   @JsonProperty("file_id")
   @NonNull
   private String fileId;

   public void validate() throws TelegramApiValidationException {
      if (this.fileId == null) {
         throw new TelegramApiValidationException("FileId can't be empty", this);
      }
   }

   public String getMethod() {
      return "getFile";
   }

   public File deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<File> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<File>>() {
         });
         if (result.getOk()) {
            return (File)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error getting file", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public static GetFile.GetFileBuilder builder() {
      return new GetFile.GetFileBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetFile)) {
         return false;
      } else {
         GetFile other = (GetFile)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$fileId = this.getFileId();
            Object other$fileId = other.getFileId();
            if (this$fileId == null) {
               if (other$fileId != null) {
                  return false;
               }
            } else if (!this$fileId.equals(other$fileId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetFile;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $fileId = this.getFileId();
      int result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());
      return result;
   }

   @NonNull
   public String getFileId() {
      return this.fileId;
   }

   @JsonProperty("file_id")
   public void setFileId(@NonNull String fileId) {
      if (fileId == null) {
         throw new NullPointerException("fileId is marked non-null but is null");
      } else {
         this.fileId = fileId;
      }
   }

   public String toString() {
      return "GetFile(fileId=" + this.getFileId() + ")";
   }

   public GetFile() {
   }

   public GetFile(@NonNull String fileId) {
      if (fileId == null) {
         throw new NullPointerException("fileId is marked non-null but is null");
      } else {
         this.fileId = fileId;
      }
   }

   public static class GetFileBuilder {
      private String fileId;

      GetFileBuilder() {
      }

      @JsonProperty("file_id")
      public GetFile.GetFileBuilder fileId(@NonNull String fileId) {
         if (fileId == null) {
            throw new NullPointerException("fileId is marked non-null but is null");
         } else {
            this.fileId = fileId;
            return this;
         }
      }

      public GetFile build() {
         return new GetFile(this.fileId);
      }

      public String toString() {
         return "GetFile.GetFileBuilder(fileId=" + this.fileId + ")";
      }
   }
}
