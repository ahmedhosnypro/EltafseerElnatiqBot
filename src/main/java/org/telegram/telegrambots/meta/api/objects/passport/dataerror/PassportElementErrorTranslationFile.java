package org.telegram.telegrambots.meta.api.objects.passport.dataerror;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class PassportElementErrorTranslationFile implements PassportElementError {
   private static final String SOURCE_FIELD = "source";
   private static final String TYPE_FIELD = "type";
   private static final String FILEHASH_FIELD = "file_hash";
   private static final String MESSAGE_FIELD = "message";
   @JsonProperty("source")
   private final String source = "translation_file";
   @JsonProperty("type")
   @NonNull
   private String type;
   @JsonProperty("file_hash")
   @NonNull
   private String fileHash;
   @JsonProperty("message")
   @NonNull
   private String message;

   public void validate() throws TelegramApiValidationException {
      if (this.fileHash != null && !this.fileHash.isEmpty()) {
         if (this.message != null && !this.message.isEmpty()) {
            if (this.type == null || this.type.isEmpty()) {
               throw new TelegramApiValidationException("Type parameter can't be empty", this);
            }
         } else {
            throw new TelegramApiValidationException("Message parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("File hash parameter can't be empty", this);
      }
   }

   public static PassportElementErrorTranslationFile.PassportElementErrorTranslationFileBuilder builder() {
      return new PassportElementErrorTranslationFile.PassportElementErrorTranslationFileBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PassportElementErrorTranslationFile)) {
         return false;
      } else {
         PassportElementErrorTranslationFile other = (PassportElementErrorTranslationFile)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$source = this.getSource();
               Object other$source = other.getSource();
               if (this$source == null) {
                  if (other$source == null) {
                     break label59;
                  }
               } else if (this$source.equals(other$source)) {
                  break label59;
               }

               return false;
            }

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            Object this$fileHash = this.getFileHash();
            Object other$fileHash = other.getFileHash();
            if (this$fileHash == null) {
               if (other$fileHash != null) {
                  return false;
               }
            } else if (!this$fileHash.equals(other$fileHash)) {
               return false;
            }

            Object this$message = this.getMessage();
            Object other$message = other.getMessage();
            if (this$message == null) {
               if (other$message != null) {
                  return false;
               }
            } else if (!this$message.equals(other$message)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PassportElementErrorTranslationFile;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $source = this.getSource();
      int result = result * 59 + ($source == null ? 43 : $source.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $fileHash = this.getFileHash();
      result = result * 59 + ($fileHash == null ? 43 : $fileHash.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      return result;
   }

   public String getSource() {
      Objects.requireNonNull(this);
      return "translation_file";
   }

   @NonNull
   public String getType() {
      return this.type;
   }

   @NonNull
   public String getFileHash() {
      return this.fileHash;
   }

   @NonNull
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("type")
   public void setType(@NonNull String type) {
      if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else {
         this.type = type;
      }
   }

   @JsonProperty("file_hash")
   public void setFileHash(@NonNull String fileHash) {
      if (fileHash == null) {
         throw new NullPointerException("fileHash is marked non-null but is null");
      } else {
         this.fileHash = fileHash;
      }
   }

   @JsonProperty("message")
   public void setMessage(@NonNull String message) {
      if (message == null) {
         throw new NullPointerException("message is marked non-null but is null");
      } else {
         this.message = message;
      }
   }

   public String toString() {
      return "PassportElementErrorTranslationFile(source=" + this.getSource() + ", type=" + this.getType() + ", fileHash=" + this.getFileHash() + ", message=" + this.getMessage() + ")";
   }

   public PassportElementErrorTranslationFile() {
   }

   public PassportElementErrorTranslationFile(@NonNull String type, @NonNull String fileHash, @NonNull String message) {
      if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else if (fileHash == null) {
         throw new NullPointerException("fileHash is marked non-null but is null");
      } else if (message == null) {
         throw new NullPointerException("message is marked non-null but is null");
      } else {
         this.type = type;
         this.fileHash = fileHash;
         this.message = message;
      }
   }

   public static class PassportElementErrorTranslationFileBuilder {
      private String type;
      private String fileHash;
      private String message;

      PassportElementErrorTranslationFileBuilder() {
      }

      @JsonProperty("type")
      public PassportElementErrorTranslationFile.PassportElementErrorTranslationFileBuilder type(@NonNull String type) {
         if (type == null) {
            throw new NullPointerException("type is marked non-null but is null");
         } else {
            this.type = type;
            return this;
         }
      }

      @JsonProperty("file_hash")
      public PassportElementErrorTranslationFile.PassportElementErrorTranslationFileBuilder fileHash(@NonNull String fileHash) {
         if (fileHash == null) {
            throw new NullPointerException("fileHash is marked non-null but is null");
         } else {
            this.fileHash = fileHash;
            return this;
         }
      }

      @JsonProperty("message")
      public PassportElementErrorTranslationFile.PassportElementErrorTranslationFileBuilder message(@NonNull String message) {
         if (message == null) {
            throw new NullPointerException("message is marked non-null but is null");
         } else {
            this.message = message;
            return this;
         }
      }

      public PassportElementErrorTranslationFile build() {
         return new PassportElementErrorTranslationFile(this.type, this.fileHash, this.message);
      }

      public String toString() {
         return "PassportElementErrorTranslationFile.PassportElementErrorTranslationFileBuilder(type=" + this.type + ", fileHash=" + this.fileHash + ", message=" + this.message + ")";
      }
   }
}
