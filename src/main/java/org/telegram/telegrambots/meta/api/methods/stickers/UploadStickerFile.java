package org.telegram.telegrambots.meta.api.methods.stickers;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class UploadStickerFile extends PartialBotApiMethod<File> {
   public static final String PATH = "uploadStickerFile";
   public static final String USERID_FIELD = "user_id";
   public static final String PNGSTICKER_FIELD = "png_sticker";
   @NonNull
   private Long userId;
   @NonNull
   private InputFile pngSticker;

   public File deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<File> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<File>>() {
         });
         if (result.getOk()) {
            return (File)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error uploading sticker set", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.userId != null && this.userId > 0L) {
         if (this.pngSticker == null) {
            throw new TelegramApiValidationException("PngSticker parameter can't be empty", this);
         } else {
            this.pngSticker.validate();
         }
      } else {
         throw new TelegramApiValidationException("userId can't be empty", this);
      }
   }

   public static UploadStickerFile.UploadStickerFileBuilder builder() {
      return new UploadStickerFile.UploadStickerFileBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UploadStickerFile)) {
         return false;
      } else {
         UploadStickerFile other = (UploadStickerFile)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$userId = this.getUserId();
            Object other$userId = other.getUserId();
            if (this$userId == null) {
               if (other$userId != null) {
                  return false;
               }
            } else if (!this$userId.equals(other$userId)) {
               return false;
            }

            Object this$pngSticker = this.getPngSticker();
            Object other$pngSticker = other.getPngSticker();
            if (this$pngSticker == null) {
               if (other$pngSticker != null) {
                  return false;
               }
            } else if (!this$pngSticker.equals(other$pngSticker)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UploadStickerFile;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $pngSticker = this.getPngSticker();
      result = result * 59 + ($pngSticker == null ? 43 : $pngSticker.hashCode());
      return result;
   }

   @NonNull
   public Long getUserId() {
      return this.userId;
   }

   @NonNull
   public InputFile getPngSticker() {
      return this.pngSticker;
   }

   public void setUserId(@NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
      }
   }

   public void setPngSticker(@NonNull InputFile pngSticker) {
      if (pngSticker == null) {
         throw new NullPointerException("pngSticker is marked non-null but is null");
      } else {
         this.pngSticker = pngSticker;
      }
   }

   public String toString() {
      return "UploadStickerFile(userId=" + this.getUserId() + ", pngSticker=" + this.getPngSticker() + ")";
   }

   public UploadStickerFile() {
   }

   public UploadStickerFile(@NonNull Long userId, @NonNull InputFile pngSticker) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else if (pngSticker == null) {
         throw new NullPointerException("pngSticker is marked non-null but is null");
      } else {
         this.userId = userId;
         this.pngSticker = pngSticker;
      }
   }

   public static class UploadStickerFileBuilder {
      private Long userId;
      private InputFile pngSticker;

      UploadStickerFileBuilder() {
      }

      public UploadStickerFile.UploadStickerFileBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      public UploadStickerFile.UploadStickerFileBuilder pngSticker(@NonNull InputFile pngSticker) {
         if (pngSticker == null) {
            throw new NullPointerException("pngSticker is marked non-null but is null");
         } else {
            this.pngSticker = pngSticker;
            return this;
         }
      }

      public UploadStickerFile build() {
         return new UploadStickerFile(this.userId, this.pngSticker);
      }

      public String toString() {
         return "UploadStickerFile.UploadStickerFileBuilder(userId=" + this.userId + ", pngSticker=" + this.pngSticker + ")";
      }
   }
}
