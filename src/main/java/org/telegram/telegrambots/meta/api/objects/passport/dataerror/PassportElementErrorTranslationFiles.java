package org.telegram.telegrambots.meta.api.objects.passport.dataerror;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class PassportElementErrorTranslationFiles implements PassportElementError {
   private static final String SOURCE_FIELD = "source";
   private static final String TYPE_FIELD = "type";
   private static final String FILEHASHES_FIELD = "file_hashes";
   private static final String MESSAGE_FIELD = "message";
   @JsonProperty("source")
   private final String source = "translation_files";
   @JsonProperty("type")
   @NonNull
   private String type;
   @JsonProperty("file_hashes")
   @NonNull
   private List<String> fileHashes;
   @JsonProperty("message")
   @NonNull
   private String message;

   public void validate() throws TelegramApiValidationException {
      if (this.fileHashes != null && !this.fileHashes.isEmpty()) {
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

   public static PassportElementErrorTranslationFiles.PassportElementErrorTranslationFilesBuilder builder() {
      return new PassportElementErrorTranslationFiles.PassportElementErrorTranslationFilesBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PassportElementErrorTranslationFiles)) {
         return false;
      } else {
         PassportElementErrorTranslationFiles other = (PassportElementErrorTranslationFiles)o;
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

            Object this$fileHashes = this.getFileHashes();
            Object other$fileHashes = other.getFileHashes();
            if (this$fileHashes == null) {
               if (other$fileHashes != null) {
                  return false;
               }
            } else if (!this$fileHashes.equals(other$fileHashes)) {
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
      return other instanceof PassportElementErrorTranslationFiles;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $source = this.getSource();
      int result = result * 59 + ($source == null ? 43 : $source.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $fileHashes = this.getFileHashes();
      result = result * 59 + ($fileHashes == null ? 43 : $fileHashes.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      return result;
   }

   public String getSource() {
      Objects.requireNonNull(this);
      return "translation_files";
   }

   @NonNull
   public String getType() {
      return this.type;
   }

   @NonNull
   public List<String> getFileHashes() {
      return this.fileHashes;
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

   @JsonProperty("file_hashes")
   public void setFileHashes(@NonNull List<String> fileHashes) {
      if (fileHashes == null) {
         throw new NullPointerException("fileHashes is marked non-null but is null");
      } else {
         this.fileHashes = fileHashes;
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
      return "PassportElementErrorTranslationFiles(source=" + this.getSource() + ", type=" + this.getType() + ", fileHashes=" + this.getFileHashes() + ", message=" + this.getMessage() + ")";
   }

   public PassportElementErrorTranslationFiles() {
   }

   public PassportElementErrorTranslationFiles(@NonNull String type, @NonNull List<String> fileHashes, @NonNull String message) {
      if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else if (fileHashes == null) {
         throw new NullPointerException("fileHashes is marked non-null but is null");
      } else if (message == null) {
         throw new NullPointerException("message is marked non-null but is null");
      } else {
         this.type = type;
         this.fileHashes = fileHashes;
         this.message = message;
      }
   }

   public static class PassportElementErrorTranslationFilesBuilder {
      private String type;
      private ArrayList<String> fileHashes;
      private String message;

      PassportElementErrorTranslationFilesBuilder() {
      }

      @JsonProperty("type")
      public PassportElementErrorTranslationFiles.PassportElementErrorTranslationFilesBuilder type(@NonNull String type) {
         if (type == null) {
            throw new NullPointerException("type is marked non-null but is null");
         } else {
            this.type = type;
            return this;
         }
      }

      public PassportElementErrorTranslationFiles.PassportElementErrorTranslationFilesBuilder fileHash(String fileHash) {
         if (this.fileHashes == null) {
            this.fileHashes = new ArrayList();
         }

         this.fileHashes.add(fileHash);
         return this;
      }

      @JsonProperty("file_hashes")
      public PassportElementErrorTranslationFiles.PassportElementErrorTranslationFilesBuilder fileHashes(Collection<? extends String> fileHashes) {
         if (fileHashes == null) {
            throw new NullPointerException("fileHashes cannot be null");
         } else {
            if (this.fileHashes == null) {
               this.fileHashes = new ArrayList();
            }

            this.fileHashes.addAll(fileHashes);
            return this;
         }
      }

      public PassportElementErrorTranslationFiles.PassportElementErrorTranslationFilesBuilder clearFileHashes() {
         if (this.fileHashes != null) {
            this.fileHashes.clear();
         }

         return this;
      }

      @JsonProperty("message")
      public PassportElementErrorTranslationFiles.PassportElementErrorTranslationFilesBuilder message(@NonNull String message) {
         if (message == null) {
            throw new NullPointerException("message is marked non-null but is null");
         } else {
            this.message = message;
            return this;
         }
      }

      public PassportElementErrorTranslationFiles build() {
         List fileHashes;
         switch(this.fileHashes == null ? 0 : this.fileHashes.size()) {
         case 0:
            fileHashes = Collections.emptyList();
            break;
         case 1:
            fileHashes = Collections.singletonList((String)this.fileHashes.get(0));
            break;
         default:
            fileHashes = Collections.unmodifiableList(new ArrayList(this.fileHashes));
         }

         return new PassportElementErrorTranslationFiles(this.type, fileHashes, this.message);
      }

      public String toString() {
         return "PassportElementErrorTranslationFiles.PassportElementErrorTranslationFilesBuilder(type=" + this.type + ", fileHashes=" + this.fileHashes + ", message=" + this.message + ")";
      }
   }
}
