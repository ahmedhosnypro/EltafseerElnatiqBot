package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendPhoto extends PartialBotApiMethod<Message> {
   public static final String PATH = "sendphoto";
   public static final String CHATID_FIELD = "chat_id";
   public static final String PHOTO_FIELD = "photo";
   public static final String CAPTION_FIELD = "caption";
   public static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   public static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   public static final String REPLYMARKUP_FIELD = "reply_markup";
   public static final String PARSEMODE_FIELD = "parse_mode";
   public static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   public static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @NonNull
   private String chatId;
   @NonNull
   private InputFile photo;
   private String caption;
   private Boolean disableNotification;
   private Integer replyToMessageId;
   private ReplyKeyboard replyMarkup;
   private String parseMode;
   private List<MessageEntity> captionEntities;
   private Boolean allowSendingWithoutReply;

   public void enableNotification() {
      this.disableNotification = false;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public void setPhoto(InputFile photo) {
      Objects.requireNonNull(photo, "photo cannot be null!");
      this.photo = photo;
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending photo", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.photo == null) {
            throw new TelegramApiValidationException("Photo parameter can't be empty", this);
         } else if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
            throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
         } else {
            this.photo.validate();
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendPhoto.SendPhotoBuilder builder() {
      return new SendPhoto.SendPhotoBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendPhoto)) {
         return false;
      } else {
         SendPhoto other = (SendPhoto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label119: {
               Object this$disableNotification = this.getDisableNotification();
               Object other$disableNotification = other.getDisableNotification();
               if (this$disableNotification == null) {
                  if (other$disableNotification == null) {
                     break label119;
                  }
               } else if (this$disableNotification.equals(other$disableNotification)) {
                  break label119;
               }

               return false;
            }

            Object this$replyToMessageId = this.getReplyToMessageId();
            Object other$replyToMessageId = other.getReplyToMessageId();
            if (this$replyToMessageId == null) {
               if (other$replyToMessageId != null) {
                  return false;
               }
            } else if (!this$replyToMessageId.equals(other$replyToMessageId)) {
               return false;
            }

            label105: {
               Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
               Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
               if (this$allowSendingWithoutReply == null) {
                  if (other$allowSendingWithoutReply == null) {
                     break label105;
                  }
               } else if (this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
                  break label105;
               }

               return false;
            }

            Object this$chatId = this.getChatId();
            Object other$chatId = other.getChatId();
            if (this$chatId == null) {
               if (other$chatId != null) {
                  return false;
               }
            } else if (!this$chatId.equals(other$chatId)) {
               return false;
            }

            label91: {
               Object this$photo = this.getPhoto();
               Object other$photo = other.getPhoto();
               if (this$photo == null) {
                  if (other$photo == null) {
                     break label91;
                  }
               } else if (this$photo.equals(other$photo)) {
                  break label91;
               }

               return false;
            }

            Object this$caption = this.getCaption();
            Object other$caption = other.getCaption();
            if (this$caption == null) {
               if (other$caption != null) {
                  return false;
               }
            } else if (!this$caption.equals(other$caption)) {
               return false;
            }

            label77: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label77;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label77;
               }

               return false;
            }

            label70: {
               Object this$parseMode = this.getParseMode();
               Object other$parseMode = other.getParseMode();
               if (this$parseMode == null) {
                  if (other$parseMode == null) {
                     break label70;
                  }
               } else if (this$parseMode.equals(other$parseMode)) {
                  break label70;
               }

               return false;
            }

            Object this$captionEntities = this.getCaptionEntities();
            Object other$captionEntities = other.getCaptionEntities();
            if (this$captionEntities == null) {
               if (other$captionEntities != null) {
                  return false;
               }
            } else if (!this$captionEntities.equals(other$captionEntities)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SendPhoto;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $disableNotification = this.getDisableNotification();
      int result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $photo = this.getPhoto();
      result = result * 59 + ($photo == null ? 43 : $photo.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $captionEntities = this.getCaptionEntities();
      result = result * 59 + ($captionEntities == null ? 43 : $captionEntities.hashCode());
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

   public String getCaption() {
      return this.caption;
   }

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public ReplyKeyboard getReplyMarkup() {
      return this.replyMarkup;
   }

   public String getParseMode() {
      return this.parseMode;
   }

   public List<MessageEntity> getCaptionEntities() {
      return this.captionEntities;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
   }

   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   public void setCaption(String caption) {
      this.caption = caption;
   }

   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   public void setReplyMarkup(ReplyKeyboard replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   public void setCaptionEntities(List<MessageEntity> captionEntities) {
      this.captionEntities = captionEntities;
   }

   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   public String toString() {
      return "SendPhoto(chatId=" + this.getChatId() + ", photo=" + this.getPhoto() + ", caption=" + this.getCaption() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendPhoto(@NonNull String chatId, @NonNull InputFile photo) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (photo == null) {
         throw new NullPointerException("photo is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.photo = photo;
      }
   }

   public SendPhoto() {
   }

   public SendPhoto(@NonNull String chatId, @NonNull InputFile photo, String caption, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, String parseMode, List<MessageEntity> captionEntities, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (photo == null) {
         throw new NullPointerException("photo is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.photo = photo;
         this.caption = caption;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendPhotoBuilder {
      private String chatId;
      private InputFile photo;
      private String caption;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;
      private Boolean allowSendingWithoutReply;

      SendPhotoBuilder() {
      }

      public SendPhoto.SendPhotoBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public SendPhoto.SendPhotoBuilder photo(@NonNull InputFile photo) {
         if (photo == null) {
            throw new NullPointerException("photo is marked non-null but is null");
         } else {
            this.photo = photo;
            return this;
         }
      }

      public SendPhoto.SendPhotoBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public SendPhoto.SendPhotoBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      public SendPhoto.SendPhotoBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      public SendPhoto.SendPhotoBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public SendPhoto.SendPhotoBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public SendPhoto.SendPhotoBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      public SendPhoto.SendPhotoBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
         if (captionEntities == null) {
            throw new NullPointerException("captionEntities cannot be null");
         } else {
            if (this.captionEntities == null) {
               this.captionEntities = new ArrayList();
            }

            this.captionEntities.addAll(captionEntities);
            return this;
         }
      }

      public SendPhoto.SendPhotoBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public SendPhoto.SendPhotoBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendPhoto build() {
         List captionEntities;
         switch(this.captionEntities == null ? 0 : this.captionEntities.size()) {
         case 0:
            captionEntities = Collections.emptyList();
            break;
         case 1:
            captionEntities = Collections.singletonList((MessageEntity)this.captionEntities.get(0));
            break;
         default:
            captionEntities = Collections.unmodifiableList(new ArrayList(this.captionEntities));
         }

         return new SendPhoto(this.chatId, this.photo, this.caption, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.parseMode, captionEntities, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendPhoto.SendPhotoBuilder(chatId=" + this.chatId + ", photo=" + this.photo + ", caption=" + this.caption + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
