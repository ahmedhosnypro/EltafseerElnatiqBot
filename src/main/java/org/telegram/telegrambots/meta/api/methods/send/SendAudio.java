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

public class SendAudio extends PartialBotApiMethod<Message> {
   public static final String PATH = "sendaudio";
   public static final String DURATION_FIELD = "duration";
   public static final String CHATID_FIELD = "chat_id";
   public static final String AUDIO_FIELD = "audio";
   public static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   public static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   public static final String REPLYMARKUP_FIELD = "reply_markup";
   public static final String PERFOMER_FIELD = "performer";
   public static final String TITLE_FIELD = "title";
   public static final String CAPTION_FIELD = "caption";
   public static final String PARSEMODE_FIELD = "parse_mode";
   public static final String THUMB_FIELD = "thumb";
   public static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   public static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @NonNull
   private String chatId;
   @NonNull
   private InputFile audio;
   private Integer replyToMessageId;
   private Boolean disableNotification;
   private ReplyKeyboard replyMarkup;
   private String performer;
   private String title;
   private String caption;
   private String parseMode;
   private Integer duration;
   private InputFile thumb;
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
            throw new TelegramApiRequestException("Error sending audio", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.audio == null) {
            throw new TelegramApiValidationException("Audio parameter can't be empty", this);
         } else if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
            throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
         } else {
            this.audio.validate();
            if (this.thumb != null) {
               this.thumb.validate();
            }

            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendAudio.SendAudioBuilder builder() {
      return new SendAudio.SendAudioBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendAudio)) {
         return false;
      } else {
         SendAudio other = (SendAudio)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label167: {
               Object this$replyToMessageId = this.getReplyToMessageId();
               Object other$replyToMessageId = other.getReplyToMessageId();
               if (this$replyToMessageId == null) {
                  if (other$replyToMessageId == null) {
                     break label167;
                  }
               } else if (this$replyToMessageId.equals(other$replyToMessageId)) {
                  break label167;
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

            label153: {
               Object this$duration = this.getDuration();
               Object other$duration = other.getDuration();
               if (this$duration == null) {
                  if (other$duration == null) {
                     break label153;
                  }
               } else if (this$duration.equals(other$duration)) {
                  break label153;
               }

               return false;
            }

            Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
            Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
            if (this$allowSendingWithoutReply == null) {
               if (other$allowSendingWithoutReply != null) {
                  return false;
               }
            } else if (!this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
               return false;
            }

            label139: {
               Object this$chatId = this.getChatId();
               Object other$chatId = other.getChatId();
               if (this$chatId == null) {
                  if (other$chatId == null) {
                     break label139;
                  }
               } else if (this$chatId.equals(other$chatId)) {
                  break label139;
               }

               return false;
            }

            Object this$audio = this.getAudio();
            Object other$audio = other.getAudio();
            if (this$audio == null) {
               if (other$audio != null) {
                  return false;
               }
            } else if (!this$audio.equals(other$audio)) {
               return false;
            }

            label125: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label125;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label125;
               }

               return false;
            }

            label118: {
               Object this$performer = this.getPerformer();
               Object other$performer = other.getPerformer();
               if (this$performer == null) {
                  if (other$performer == null) {
                     break label118;
                  }
               } else if (this$performer.equals(other$performer)) {
                  break label118;
               }

               return false;
            }

            Object this$title = this.getTitle();
            Object other$title = other.getTitle();
            if (this$title == null) {
               if (other$title != null) {
                  return false;
               }
            } else if (!this$title.equals(other$title)) {
               return false;
            }

            label104: {
               Object this$caption = this.getCaption();
               Object other$caption = other.getCaption();
               if (this$caption == null) {
                  if (other$caption == null) {
                     break label104;
                  }
               } else if (this$caption.equals(other$caption)) {
                  break label104;
               }

               return false;
            }

            label97: {
               Object this$parseMode = this.getParseMode();
               Object other$parseMode = other.getParseMode();
               if (this$parseMode == null) {
                  if (other$parseMode == null) {
                     break label97;
                  }
               } else if (this$parseMode.equals(other$parseMode)) {
                  break label97;
               }

               return false;
            }

            Object this$thumb = this.getThumb();
            Object other$thumb = other.getThumb();
            if (this$thumb == null) {
               if (other$thumb != null) {
                  return false;
               }
            } else if (!this$thumb.equals(other$thumb)) {
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
      return other instanceof SendAudio;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $replyToMessageId = this.getReplyToMessageId();
      int result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $duration = this.getDuration();
      result = result * 59 + ($duration == null ? 43 : $duration.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $audio = this.getAudio();
      result = result * 59 + ($audio == null ? 43 : $audio.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $performer = this.getPerformer();
      result = result * 59 + ($performer == null ? 43 : $performer.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      Object $captionEntities = this.getCaptionEntities();
      result = result * 59 + ($captionEntities == null ? 43 : $captionEntities.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public InputFile getAudio() {
      return this.audio;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public ReplyKeyboard getReplyMarkup() {
      return this.replyMarkup;
   }

   public String getPerformer() {
      return this.performer;
   }

   public String getTitle() {
      return this.title;
   }

   public String getCaption() {
      return this.caption;
   }

   public String getParseMode() {
      return this.parseMode;
   }

   public Integer getDuration() {
      return this.duration;
   }

   public InputFile getThumb() {
      return this.thumb;
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

   public void setAudio(@NonNull InputFile audio) {
      if (audio == null) {
         throw new NullPointerException("audio is marked non-null but is null");
      } else {
         this.audio = audio;
      }
   }

   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   public void setReplyMarkup(ReplyKeyboard replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   public void setPerformer(String performer) {
      this.performer = performer;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setCaption(String caption) {
      this.caption = caption;
   }

   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   public void setDuration(Integer duration) {
      this.duration = duration;
   }

   public void setThumb(InputFile thumb) {
      this.thumb = thumb;
   }

   public void setCaptionEntities(List<MessageEntity> captionEntities) {
      this.captionEntities = captionEntities;
   }

   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   public String toString() {
      return "SendAudio(chatId=" + this.getChatId() + ", audio=" + this.getAudio() + ", replyToMessageId=" + this.getReplyToMessageId() + ", disableNotification=" + this.getDisableNotification() + ", replyMarkup=" + this.getReplyMarkup() + ", performer=" + this.getPerformer() + ", title=" + this.getTitle() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", duration=" + this.getDuration() + ", thumb=" + this.getThumb() + ", captionEntities=" + this.getCaptionEntities() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendAudio(@NonNull String chatId, @NonNull InputFile audio) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (audio == null) {
         throw new NullPointerException("audio is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.audio = audio;
      }
   }

   public SendAudio() {
   }

   public SendAudio(@NonNull String chatId, @NonNull InputFile audio, Integer replyToMessageId, Boolean disableNotification, ReplyKeyboard replyMarkup, String performer, String title, String caption, String parseMode, Integer duration, InputFile thumb, List<MessageEntity> captionEntities, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (audio == null) {
         throw new NullPointerException("audio is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.audio = audio;
         this.replyToMessageId = replyToMessageId;
         this.disableNotification = disableNotification;
         this.replyMarkup = replyMarkup;
         this.performer = performer;
         this.title = title;
         this.caption = caption;
         this.parseMode = parseMode;
         this.duration = duration;
         this.thumb = thumb;
         this.captionEntities = captionEntities;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendAudioBuilder {
      private String chatId;
      private InputFile audio;
      private Integer replyToMessageId;
      private Boolean disableNotification;
      private ReplyKeyboard replyMarkup;
      private String performer;
      private String title;
      private String caption;
      private String parseMode;
      private Integer duration;
      private InputFile thumb;
      private ArrayList<MessageEntity> captionEntities;
      private Boolean allowSendingWithoutReply;

      SendAudioBuilder() {
      }

      public SendAudio.SendAudioBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public SendAudio.SendAudioBuilder audio(@NonNull InputFile audio) {
         if (audio == null) {
            throw new NullPointerException("audio is marked non-null but is null");
         } else {
            this.audio = audio;
            return this;
         }
      }

      public SendAudio.SendAudioBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      public SendAudio.SendAudioBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      public SendAudio.SendAudioBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public SendAudio.SendAudioBuilder performer(String performer) {
         this.performer = performer;
         return this;
      }

      public SendAudio.SendAudioBuilder title(String title) {
         this.title = title;
         return this;
      }

      public SendAudio.SendAudioBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public SendAudio.SendAudioBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public SendAudio.SendAudioBuilder duration(Integer duration) {
         this.duration = duration;
         return this;
      }

      public SendAudio.SendAudioBuilder thumb(InputFile thumb) {
         this.thumb = thumb;
         return this;
      }

      public SendAudio.SendAudioBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      public SendAudio.SendAudioBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public SendAudio.SendAudioBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public SendAudio.SendAudioBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendAudio build() {
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

         return new SendAudio(this.chatId, this.audio, this.replyToMessageId, this.disableNotification, this.replyMarkup, this.performer, this.title, this.caption, this.parseMode, this.duration, this.thumb, captionEntities, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendAudio.SendAudioBuilder(chatId=" + this.chatId + ", audio=" + this.audio + ", replyToMessageId=" + this.replyToMessageId + ", disableNotification=" + this.disableNotification + ", replyMarkup=" + this.replyMarkup + ", performer=" + this.performer + ", title=" + this.title + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", duration=" + this.duration + ", thumb=" + this.thumb + ", captionEntities=" + this.captionEntities + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
