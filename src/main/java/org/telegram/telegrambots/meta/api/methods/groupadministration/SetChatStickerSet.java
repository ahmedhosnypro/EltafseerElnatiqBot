package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetChatStickerSet extends BotApiMethod<Boolean> {
   public static final String PATH = "setChatStickerSet";
   private static final String CHATID_FIELD = "chat_id";
   private static final String STICKERSETNAME_FIELD = "sticker_set_name";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("sticker_set_name")
   @NonNull
   private String stickerSetName;

   public String getMethod() {
      return "setChatStickerSet";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error setting chat sticker set", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.stickerSetName == null || this.stickerSetName.isEmpty()) {
            throw new TelegramApiValidationException("StickerSetName can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static SetChatStickerSet.SetChatStickerSetBuilder builder() {
      return new SetChatStickerSet.SetChatStickerSetBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetChatStickerSet)) {
         return false;
      } else {
         SetChatStickerSet other = (SetChatStickerSet)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$chatId = this.getChatId();
            Object other$chatId = other.getChatId();
            if (this$chatId == null) {
               if (other$chatId != null) {
                  return false;
               }
            } else if (!this$chatId.equals(other$chatId)) {
               return false;
            }

            Object this$stickerSetName = this.getStickerSetName();
            Object other$stickerSetName = other.getStickerSetName();
            if (this$stickerSetName == null) {
               if (other$stickerSetName != null) {
                  return false;
               }
            } else if (!this$stickerSetName.equals(other$stickerSetName)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetChatStickerSet;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $chatId = this.getChatId();
      int result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $stickerSetName = this.getStickerSetName();
      result = result * 59 + ($stickerSetName == null ? 43 : $stickerSetName.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public String getStickerSetName() {
      return this.stickerSetName;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("sticker_set_name")
   public void setStickerSetName(@NonNull String stickerSetName) {
      if (stickerSetName == null) {
         throw new NullPointerException("stickerSetName is marked non-null but is null");
      } else {
         this.stickerSetName = stickerSetName;
      }
   }

   public String toString() {
      return "SetChatStickerSet(chatId=" + this.getChatId() + ", stickerSetName=" + this.getStickerSetName() + ")";
   }

   public SetChatStickerSet() {
   }

   public SetChatStickerSet(@NonNull String chatId, @NonNull String stickerSetName) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (stickerSetName == null) {
         throw new NullPointerException("stickerSetName is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.stickerSetName = stickerSetName;
      }
   }

   public static class SetChatStickerSetBuilder {
      private String chatId;
      private String stickerSetName;

      SetChatStickerSetBuilder() {
      }

      @JsonProperty("chat_id")
      public SetChatStickerSet.SetChatStickerSetBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("sticker_set_name")
      public SetChatStickerSet.SetChatStickerSetBuilder stickerSetName(@NonNull String stickerSetName) {
         if (stickerSetName == null) {
            throw new NullPointerException("stickerSetName is marked non-null but is null");
         } else {
            this.stickerSetName = stickerSetName;
            return this;
         }
      }

      public SetChatStickerSet build() {
         return new SetChatStickerSet(this.chatId, this.stickerSetName);
      }

      public String toString() {
         return "SetChatStickerSet.SetChatStickerSetBuilder(chatId=" + this.chatId + ", stickerSetName=" + this.stickerSetName + ")";
      }
   }
}
