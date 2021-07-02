package org.telegram.telegrambots.meta.api.methods.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class DeleteStickerFromSet extends BotApiMethod<Boolean> {
   private static final String PATH = "deleteStickerFromSet";
   private static final String STICKER_FIELD = "sticker";
   @JsonProperty("sticker")
   @NonNull
   private String sticker;

   public String getMethod() {
      return "deleteStickerFromSet";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error deleting sticker from set", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.sticker == null || this.sticker.isEmpty()) {
         throw new TelegramApiValidationException("sticker can't be null", this);
      }
   }

   public static DeleteStickerFromSet.DeleteStickerFromSetBuilder builder() {
      return new DeleteStickerFromSet.DeleteStickerFromSetBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeleteStickerFromSet)) {
         return false;
      } else {
         DeleteStickerFromSet other = (DeleteStickerFromSet)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$sticker = this.getSticker();
            Object other$sticker = other.getSticker();
            if (this$sticker == null) {
               if (other$sticker != null) {
                  return false;
               }
            } else if (!this$sticker.equals(other$sticker)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof DeleteStickerFromSet;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $sticker = this.getSticker();
      int result = result * 59 + ($sticker == null ? 43 : $sticker.hashCode());
      return result;
   }

   @NonNull
   public String getSticker() {
      return this.sticker;
   }

   @JsonProperty("sticker")
   public void setSticker(@NonNull String sticker) {
      if (sticker == null) {
         throw new NullPointerException("sticker is marked non-null but is null");
      } else {
         this.sticker = sticker;
      }
   }

   public String toString() {
      return "DeleteStickerFromSet(sticker=" + this.getSticker() + ")";
   }

   public DeleteStickerFromSet() {
   }

   public DeleteStickerFromSet(@NonNull String sticker) {
      if (sticker == null) {
         throw new NullPointerException("sticker is marked non-null but is null");
      } else {
         this.sticker = sticker;
      }
   }

   public static class DeleteStickerFromSetBuilder {
      private String sticker;

      DeleteStickerFromSetBuilder() {
      }

      @JsonProperty("sticker")
      public DeleteStickerFromSet.DeleteStickerFromSetBuilder sticker(@NonNull String sticker) {
         if (sticker == null) {
            throw new NullPointerException("sticker is marked non-null but is null");
         } else {
            this.sticker = sticker;
            return this;
         }
      }

      public DeleteStickerFromSet build() {
         return new DeleteStickerFromSet(this.sticker);
      }

      public String toString() {
         return "DeleteStickerFromSet.DeleteStickerFromSetBuilder(sticker=" + this.sticker + ")";
      }
   }
}
