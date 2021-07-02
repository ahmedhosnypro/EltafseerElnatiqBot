package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendVoice extends PartialBotApiMethod<Message> {
   public static final String PATH = "sendvoice";
   public static final String CHATID_FIELD = "chat_id";
   public static final String VOICE_FIELD = "voice";
   public static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   public static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   public static final String REPLYMARKUP_FIELD = "reply_markup";
   public static final String DURATION_FIELD = "duration";
   public static final String CAPTION_FIELD = "caption";
   public static final String PARSEMODE_FIELD = "parse_mode";
   public static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   public static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @NonNull
   private String chatId;
   @NonNull
   private InputFile voice;
   private Boolean disableNotification;
   private Integer replyToMessageId;
   private ReplyKeyboard replyMarkup;
   private Integer duration;
   private String caption;
   private String parseMode;
   private List<MessageEntity> captionEntities;
   private Boolean allowSendingWithoutReply;

   public void enableNotification() {
      this.disableNotification = false;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending voice", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.voice == null) {
            throw new TelegramApiValidationException("Voice parameter can't be empty", this);
         } else if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
            throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
         } else {
            this.voice.validate();
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendVoice.SendVoiceBuilder builder() {
      return new SendVoice.SendVoiceBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendVoice)) {
         return false;
      } else {
         SendVoice other = (SendVoice)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$disableNotification = this.getDisableNotification();
            Object other$disableNotification = other.getDisableNotification();
            if (this$disableNotification == null) {
               if (other$disableNotification != null) {
                  return false;
               }
            } else if (!this$disableNotification.equals(other$disableNotification)) {
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

            Object this$duration = this.getDuration();
            Object other$duration = other.getDuration();
            if (this$duration == null) {
               if (other$duration != null) {
                  return false;
               }
            } else if (!this$duration.equals(other$duration)) {
               return false;
            }

            label110: {
               Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
               Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
               if (this$allowSendingWithoutReply == null) {
                  if (other$allowSendingWithoutReply == null) {
                     break label110;
                  }
               } else if (this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
                  break label110;
               }

               return false;
            }

            label103: {
               Object this$chatId = this.getChatId();
               Object other$chatId = other.getChatId();
               if (this$chatId == null) {
                  if (other$chatId == null) {
                     break label103;
                  }
               } else if (this$chatId.equals(other$chatId)) {
                  break label103;
               }

               return false;
            }

            Object this$voice = this.getVoice();
            Object other$voice = other.getVoice();
            if (this$voice == null) {
               if (other$voice != null) {
                  return false;
               }
            } else if (!this$voice.equals(other$voice)) {
               return false;
            }

            label89: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label89;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label89;
               }

               return false;
            }

            label82: {
               Object this$caption = this.getCaption();
               Object other$caption = other.getCaption();
               if (this$caption == null) {
                  if (other$caption == null) {
                     break label82;
                  }
               } else if (this$caption.equals(other$caption)) {
                  break label82;
               }

               return false;
            }

            Object this$parseMode = this.getParseMode();
            Object other$parseMode = other.getParseMode();
            if (this$parseMode == null) {
               if (other$parseMode != null) {
                  return false;
               }
            } else if (!this$parseMode.equals(other$parseMode)) {
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
      return other instanceof SendVoice;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $disableNotification = this.getDisableNotification();
      int result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $duration = this.getDuration();
      result = result * 59 + ($duration == null ? 43 : $duration.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $voice = this.getVoice();
      result = result * 59 + ($voice == null ? 43 : $voice.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
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
   public InputFile getVoice() {
      return this.voice;
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

   public Integer getDuration() {
      return this.duration;
   }

   public String getCaption() {
      return this.caption;
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

   public void setVoice(@NonNull InputFile voice) {
      if (voice == null) {
         throw new NullPointerException("voice is marked non-null but is null");
      } else {
         this.voice = voice;
      }
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

   public void setDuration(Integer duration) {
      this.duration = duration;
   }

   public void setCaption(String caption) {
      this.caption = caption;
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
      return "SendVoice(chatId=" + this.getChatId() + ", voice=" + this.getVoice() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", duration=" + this.getDuration() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendVoice(@NonNull String chatId, @NonNull InputFile voice) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (voice == null) {
         throw new NullPointerException("voice is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.voice = voice;
      }
   }

   public SendVoice() {
   }

   public SendVoice(@NonNull String chatId, @NonNull InputFile voice, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, Integer duration, String caption, String parseMode, List<MessageEntity> captionEntities, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (voice == null) {
         throw new NullPointerException("voice is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.voice = voice;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.duration = duration;
         this.caption = caption;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendVoiceBuilder {
      private String chatId;
      private InputFile voice;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private Integer duration;
      private String caption;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;
      private Boolean allowSendingWithoutReply;

      SendVoiceBuilder() {
      }

      public SendVoice.SendVoiceBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public SendVoice.SendVoiceBuilder voice(@NonNull InputFile voice) {
         if (voice == null) {
            throw new NullPointerException("voice is marked non-null but is null");
         } else {
            this.voice = voice;
            return this;
         }
      }

      public SendVoice.SendVoiceBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      public SendVoice.SendVoiceBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      public SendVoice.SendVoiceBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public SendVoice.SendVoiceBuilder duration(Integer duration) {
         this.duration = duration;
         return this;
      }

      public SendVoice.SendVoiceBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public SendVoice.SendVoiceBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public SendVoice.SendVoiceBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      public SendVoice.SendVoiceBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public SendVoice.SendVoiceBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public SendVoice.SendVoiceBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendVoice build() {
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

         return new SendVoice(this.chatId, this.voice, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.duration, this.caption, this.parseMode, captionEntities, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendVoice.SendVoiceBuilder(chatId=" + this.chatId + ", voice=" + this.voice + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", duration=" + this.duration + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
