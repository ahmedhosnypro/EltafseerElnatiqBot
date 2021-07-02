package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaAnimation;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaAudio;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaDocument;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendMediaGroup extends PartialBotApiMethod<ArrayList<Message>> {
   public static final String PATH = "sendMediaGroup";
   public static final String CHATID_FIELD = "chat_id";
   public static final String MEDIA_FIELD = "media";
   public static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   public static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   public static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("media")
   @NonNull
   private List<InputMedia> medias;
   @JsonProperty("reply_to_message_id")
   private Integer replyToMessageId;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;
   @JsonProperty("allow_sending_without_reply")
   private Boolean allowSendingWithoutReply;

   public void enableNotification() {
      this.disableNotification = false;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public ArrayList<Message> deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<ArrayList<Message>> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<ArrayList<Message>>>() {
         });
         if (result.getOk()) {
            return (ArrayList)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending media group", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.medias != null && !this.medias.isEmpty()) {
            if (this.medias.size() >= 2 && this.medias.size() <= 10) {
               Iterator var1 = this.medias.iterator();

               while(var1.hasNext()) {
                  InputMedia inputMedia = (InputMedia)var1.next();
                  if (inputMedia == null) {
                     throw new TelegramApiValidationException("Media parameter can not be empty", this);
                  }

                  if (inputMedia instanceof InputMediaAnimation) {
                     throw new TelegramApiValidationException("Media parameter can not be an Animation", this);
                  }

                  inputMedia.validate();
               }

               if (this.medias.stream().anyMatch((x) -> {
                  return x instanceof InputMediaAudio;
               })) {
                  if (!this.medias.stream().allMatch((x) -> {
                     return x instanceof InputMediaAudio;
                  })) {
                     throw new TelegramApiValidationException("Media parameter containing Audio can not have other types", this);
                  }
               } else if (this.medias.stream().anyMatch((x) -> {
                  return x instanceof InputMediaDocument;
               }) && !this.medias.stream().allMatch((x) -> {
                  return x instanceof InputMediaDocument;
               })) {
                  throw new TelegramApiValidationException("Media parameter containing Document can not have other types", this);
               }

            } else {
               throw new TelegramApiValidationException("Number of media should be between 2 and 10", this);
            }
         } else {
            throw new TelegramApiValidationException("Media parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendMediaGroup.SendMediaGroupBuilder builder() {
      return new SendMediaGroup.SendMediaGroupBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendMediaGroup)) {
         return false;
      } else {
         SendMediaGroup other = (SendMediaGroup)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label71: {
               Object this$replyToMessageId = this.getReplyToMessageId();
               Object other$replyToMessageId = other.getReplyToMessageId();
               if (this$replyToMessageId == null) {
                  if (other$replyToMessageId == null) {
                     break label71;
                  }
               } else if (this$replyToMessageId.equals(other$replyToMessageId)) {
                  break label71;
               }

               return false;
            }

            Object this$disableNotification = this.getDisableNotification();
            Object other$disableNotification = other.getDisableNotification();
            if (this$disableNotification == null) {
               if (other$disableNotification != null) {
                  return false;
               }
            } else if (!this$disableNotification.equals(other$disableNotification)) {
               return false;
            }

            label57: {
               Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
               Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
               if (this$allowSendingWithoutReply == null) {
                  if (other$allowSendingWithoutReply == null) {
                     break label57;
                  }
               } else if (this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
                  break label57;
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

            Object this$medias = this.getMedias();
            Object other$medias = other.getMedias();
            if (this$medias == null) {
               if (other$medias == null) {
                  return true;
               }
            } else if (this$medias.equals(other$medias)) {
               return true;
            }

            return false;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SendMediaGroup;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $replyToMessageId = this.getReplyToMessageId();
      int result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $medias = this.getMedias();
      result = result * 59 + ($medias == null ? 43 : $medias.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public List<InputMedia> getMedias() {
      return this.medias;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("media")
   public void setMedias(@NonNull List<InputMedia> medias) {
      if (medias == null) {
         throw new NullPointerException("medias is marked non-null but is null");
      } else {
         this.medias = medias;
      }
   }

   @JsonProperty("reply_to_message_id")
   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   @JsonProperty("disable_notification")
   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   @JsonProperty("allow_sending_without_reply")
   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   public String toString() {
      return "SendMediaGroup(chatId=" + this.getChatId() + ", medias=" + this.getMedias() + ", replyToMessageId=" + this.getReplyToMessageId() + ", disableNotification=" + this.getDisableNotification() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendMediaGroup(@NonNull String chatId, @NonNull List<InputMedia> medias) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (medias == null) {
         throw new NullPointerException("medias is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.medias = medias;
      }
   }

   public SendMediaGroup() {
   }

   public SendMediaGroup(@NonNull String chatId, @NonNull List<InputMedia> medias, Integer replyToMessageId, Boolean disableNotification, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (medias == null) {
         throw new NullPointerException("medias is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.medias = medias;
         this.replyToMessageId = replyToMessageId;
         this.disableNotification = disableNotification;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendMediaGroupBuilder {
      private String chatId;
      private List<InputMedia> medias;
      private Integer replyToMessageId;
      private Boolean disableNotification;
      private Boolean allowSendingWithoutReply;

      SendMediaGroupBuilder() {
      }

      @JsonProperty("chat_id")
      public SendMediaGroup.SendMediaGroupBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("media")
      public SendMediaGroup.SendMediaGroupBuilder medias(@NonNull List<InputMedia> medias) {
         if (medias == null) {
            throw new NullPointerException("medias is marked non-null but is null");
         } else {
            this.medias = medias;
            return this;
         }
      }

      @JsonProperty("reply_to_message_id")
      public SendMediaGroup.SendMediaGroupBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      @JsonProperty("disable_notification")
      public SendMediaGroup.SendMediaGroupBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      @JsonProperty("allow_sending_without_reply")
      public SendMediaGroup.SendMediaGroupBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendMediaGroup build() {
         return new SendMediaGroup(this.chatId, this.medias, this.replyToMessageId, this.disableNotification, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendMediaGroup.SendMediaGroupBuilder(chatId=" + this.chatId + ", medias=" + this.medias + ", replyToMessageId=" + this.replyToMessageId + ", disableNotification=" + this.disableNotification + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
