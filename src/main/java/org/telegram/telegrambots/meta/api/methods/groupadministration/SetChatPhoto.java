package org.telegram.telegrambots.meta.api.methods.groupadministration;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetChatPhoto extends PartialBotApiMethod<Boolean> {
   public static final String PATH = "setChatPhoto";
   public static final String CHATID_FIELD = "chat_id";
   public static final String PHOTO_FIELD = "photo";
   @NonNull
   private String chatId;
   @NonNull
   private InputFile photo;

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error setting chat photo", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.photo == null || !this.photo.isNew()) {
            throw new TelegramApiValidationException("Photo parameter is required and must be a new file to upload", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId can't be empty", this);
      }
   }

   public static SetChatPhoto.SetChatPhotoBuilder builder() {
      return new SetChatPhoto.SetChatPhotoBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetChatPhoto)) {
         return false;
      } else {
         SetChatPhoto other = (SetChatPhoto)o;
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

            Object this$photo = this.getPhoto();
            Object other$photo = other.getPhoto();
            if (this$photo == null) {
               if (other$photo != null) {
                  return false;
               }
            } else if (!this$photo.equals(other$photo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetChatPhoto;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $chatId = this.getChatId();
      int result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $photo = this.getPhoto();
      result = result * 59 + ($photo == null ? 43 : $photo.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public InputFile getPhoto() {
      return this.photo;
   }

   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public void setPhoto(@NonNull InputFile photo) {
      if (photo == null) {
         throw new NullPointerException("photo is marked non-null but is null");
      } else {
         this.photo = photo;
      }
   }

   public String toString() {
      return "SetChatPhoto(chatId=" + this.getChatId() + ", photo=" + this.getPhoto() + ")";
   }

   public SetChatPhoto() {
   }

   public SetChatPhoto(@NonNull String chatId, @NonNull InputFile photo) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (photo == null) {
         throw new NullPointerException("photo is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.photo = photo;
      }
   }

   public static class SetChatPhotoBuilder {
      private String chatId;
      private InputFile photo;

      SetChatPhotoBuilder() {
      }

      public SetChatPhoto.SetChatPhotoBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public SetChatPhoto.SetChatPhotoBuilder photo(@NonNull InputFile photo) {
         if (photo == null) {
            throw new NullPointerException("photo is marked non-null but is null");
         } else {
            this.photo = photo;
            return this;
         }
      }

      public SetChatPhoto build() {
         return new SetChatPhoto(this.chatId, this.photo);
      }

      public String toString() {
         return "SetChatPhoto.SetChatPhotoBuilder(chatId=" + this.chatId + ", photo=" + this.photo + ")";
      }
   }
}
