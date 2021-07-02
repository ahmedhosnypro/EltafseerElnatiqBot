package org.telegram.telegrambots.meta.api.methods.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetStickerPositionInSet extends BotApiMethod<Boolean> {
   private static final String PATH = "setStickerPositionInSet";
   private static final String STICKER_FIELD = "sticker";
   private static final String POSITION_FIELD = "position";
   @JsonProperty("sticker")
   @NonNull
   private String sticker;
   @JsonProperty("position")
   @NonNull
   private Integer position;

   public String getMethod() {
      return "setStickerPositionInSet";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error setting sticker position in set", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.sticker != null && !this.sticker.isEmpty()) {
         if (this.position == null || this.position < 0) {
            throw new TelegramApiValidationException("position can't be null", this);
         }
      } else {
         throw new TelegramApiValidationException("sticker can't be null", this);
      }
   }

   public static SetStickerPositionInSet.SetStickerPositionInSetBuilder builder() {
      return new SetStickerPositionInSet.SetStickerPositionInSetBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetStickerPositionInSet)) {
         return false;
      } else {
         SetStickerPositionInSet other = (SetStickerPositionInSet)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$position = this.getPosition();
            Object other$position = other.getPosition();
            if (this$position == null) {
               if (other$position != null) {
                  return false;
               }
            } else if (!this$position.equals(other$position)) {
               return false;
            }

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
      return other instanceof SetStickerPositionInSet;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $position = this.getPosition();
      int result = result * 59 + ($position == null ? 43 : $position.hashCode());
      Object $sticker = this.getSticker();
      result = result * 59 + ($sticker == null ? 43 : $sticker.hashCode());
      return result;
   }

   @NonNull
   public String getSticker() {
      return this.sticker;
   }

   @NonNull
   public Integer getPosition() {
      return this.position;
   }

   @JsonProperty("sticker")
   public void setSticker(@NonNull String sticker) {
      if (sticker == null) {
         throw new NullPointerException("sticker is marked non-null but is null");
      } else {
         this.sticker = sticker;
      }
   }

   @JsonProperty("position")
   public void setPosition(@NonNull Integer position) {
      if (position == null) {
         throw new NullPointerException("position is marked non-null but is null");
      } else {
         this.position = position;
      }
   }

   public String toString() {
      return "SetStickerPositionInSet(sticker=" + this.getSticker() + ", position=" + this.getPosition() + ")";
   }

   public SetStickerPositionInSet() {
   }

   public SetStickerPositionInSet(@NonNull String sticker, @NonNull Integer position) {
      if (sticker == null) {
         throw new NullPointerException("sticker is marked non-null but is null");
      } else if (position == null) {
         throw new NullPointerException("position is marked non-null but is null");
      } else {
         this.sticker = sticker;
         this.position = position;
      }
   }

   public static class SetStickerPositionInSetBuilder {
      private String sticker;
      private Integer position;

      SetStickerPositionInSetBuilder() {
      }

      @JsonProperty("sticker")
      public SetStickerPositionInSet.SetStickerPositionInSetBuilder sticker(@NonNull String sticker) {
         if (sticker == null) {
            throw new NullPointerException("sticker is marked non-null but is null");
         } else {
            this.sticker = sticker;
            return this;
         }
      }

      @JsonProperty("position")
      public SetStickerPositionInSet.SetStickerPositionInSetBuilder position(@NonNull Integer position) {
         if (position == null) {
            throw new NullPointerException("position is marked non-null but is null");
         } else {
            this.position = position;
            return this;
         }
      }

      public SetStickerPositionInSet build() {
         return new SetStickerPositionInSet(this.sticker, this.position);
      }

      public String toString() {
         return "SetStickerPositionInSet.SetStickerPositionInSetBuilder(sticker=" + this.sticker + ", position=" + this.position + ")";
      }
   }
}
