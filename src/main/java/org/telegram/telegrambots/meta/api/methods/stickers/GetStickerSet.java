package org.telegram.telegrambots.meta.api.methods.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.stickers.StickerSet;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetStickerSet extends BotApiMethod<StickerSet> {
   private static final String PATH = "getStickerSet";
   private static final String NAME_FIELD = "name";
   @JsonProperty("name")
   @NonNull
   private String name;

   public String getMethod() {
      return "getStickerSet";
   }

   public StickerSet deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<StickerSet> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<StickerSet>>() {
         });
         if (result.getOk()) {
            return (StickerSet)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error getting sticker set", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.name == null || this.name.isEmpty()) {
         throw new TelegramApiValidationException("Name can't be null", this);
      }
   }

   public static GetStickerSet.GetStickerSetBuilder builder() {
      return new GetStickerSet.GetStickerSetBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetStickerSet)) {
         return false;
      } else {
         GetStickerSet other = (GetStickerSet)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$name = this.getName();
            Object other$name = other.getName();
            if (this$name == null) {
               if (other$name != null) {
                  return false;
               }
            } else if (!this$name.equals(other$name)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetStickerSet;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $name = this.getName();
      int result = result * 59 + ($name == null ? 43 : $name.hashCode());
      return result;
   }

   @NonNull
   public String getName() {
      return this.name;
   }

   @JsonProperty("name")
   public void setName(@NonNull String name) {
      if (name == null) {
         throw new NullPointerException("name is marked non-null but is null");
      } else {
         this.name = name;
      }
   }

   public String toString() {
      return "GetStickerSet(name=" + this.getName() + ")";
   }

   public GetStickerSet() {
   }

   public GetStickerSet(@NonNull String name) {
      if (name == null) {
         throw new NullPointerException("name is marked non-null but is null");
      } else {
         this.name = name;
      }
   }

   public static class GetStickerSetBuilder {
      private String name;

      GetStickerSetBuilder() {
      }

      @JsonProperty("name")
      public GetStickerSet.GetStickerSetBuilder name(@NonNull String name) {
         if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
         } else {
            this.name = name;
            return this;
         }
      }

      public GetStickerSet build() {
         return new GetStickerSet(this.name);
      }

      public String toString() {
         return "GetStickerSet.GetStickerSetBuilder(name=" + this.name + ")";
      }
   }
}
