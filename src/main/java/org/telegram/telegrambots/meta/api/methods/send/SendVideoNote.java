package org.telegram.telegrambots.meta.api.methods.send;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendVideoNote extends PartialBotApiMethod<Message> {
   public static final String PATH = "sendvideonote";
   public static final String CHATID_FIELD = "chat_id";
   public static final String VIDEONOTE_FIELD = "video_note";
   public static final String DURATION_FIELD = "duration";
   public static final String LENGTH_FIELD = "length";
   public static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   public static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   public static final String REPLYMARKUP_FIELD = "reply_markup";
   public static final String THUMB_FIELD = "thumb";
   public static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @NonNull
   private String chatId;
   @NonNull
   private InputFile videoNote;
   private Integer duration;
   private Integer length;
   private Boolean disableNotification;
   private Integer replyToMessageId;
   private ReplyKeyboard replyMarkup;
   private InputFile thumb;
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
            throw new TelegramApiRequestException("Error sending video note", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.videoNote == null) {
            throw new TelegramApiValidationException("VideoNote parameter can't be empty", this);
         } else {
            this.videoNote.validate();
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

   public static SendVideoNote.SendVideoNoteBuilder builder() {
      return new SendVideoNote.SendVideoNoteBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendVideoNote)) {
         return false;
      } else {
         SendVideoNote other = (SendVideoNote)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label119: {
               Object this$duration = this.getDuration();
               Object other$duration = other.getDuration();
               if (this$duration == null) {
                  if (other$duration == null) {
                     break label119;
                  }
               } else if (this$duration.equals(other$duration)) {
                  break label119;
               }

               return false;
            }

            Object this$length = this.getLength();
            Object other$length = other.getLength();
            if (this$length == null) {
               if (other$length != null) {
                  return false;
               }
            } else if (!this$length.equals(other$length)) {
               return false;
            }

            label105: {
               Object this$disableNotification = this.getDisableNotification();
               Object other$disableNotification = other.getDisableNotification();
               if (this$disableNotification == null) {
                  if (other$disableNotification == null) {
                     break label105;
                  }
               } else if (this$disableNotification.equals(other$disableNotification)) {
                  break label105;
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

            label91: {
               Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
               Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
               if (this$allowSendingWithoutReply == null) {
                  if (other$allowSendingWithoutReply == null) {
                     break label91;
                  }
               } else if (this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
                  break label91;
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

            label77: {
               Object this$videoNote = this.getVideoNote();
               Object other$videoNote = other.getVideoNote();
               if (this$videoNote == null) {
                  if (other$videoNote == null) {
                     break label77;
                  }
               } else if (this$videoNote.equals(other$videoNote)) {
                  break label77;
               }

               return false;
            }

            label70: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label70;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label70;
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SendVideoNote;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $duration = this.getDuration();
      int result = result * 59 + ($duration == null ? 43 : $duration.hashCode());
      Object $length = this.getLength();
      result = result * 59 + ($length == null ? 43 : $length.hashCode());
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $videoNote = this.getVideoNote();
      result = result * 59 + ($videoNote == null ? 43 : $videoNote.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public InputFile getVideoNote() {
      return this.videoNote;
   }

   public Integer getDuration() {
      return this.duration;
   }

   public Integer getLength() {
      return this.length;
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

   public InputFile getThumb() {
      return this.thumb;
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

   public void setVideoNote(@NonNull InputFile videoNote) {
      if (videoNote == null) {
         throw new NullPointerException("videoNote is marked non-null but is null");
      } else {
         this.videoNote = videoNote;
      }
   }

   public void setDuration(Integer duration) {
      this.duration = duration;
   }

   public void setLength(Integer length) {
      this.length = length;
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

   public void setThumb(InputFile thumb) {
      this.thumb = thumb;
   }

   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   public String toString() {
      return "SendVideoNote(chatId=" + this.getChatId() + ", videoNote=" + this.getVideoNote() + ", duration=" + this.getDuration() + ", length=" + this.getLength() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", thumb=" + this.getThumb() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendVideoNote(@NonNull String chatId, @NonNull InputFile videoNote) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (videoNote == null) {
         throw new NullPointerException("videoNote is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.videoNote = videoNote;
      }
   }

   public SendVideoNote() {
   }

   public SendVideoNote(@NonNull String chatId, @NonNull InputFile videoNote, Integer duration, Integer length, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, InputFile thumb, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (videoNote == null) {
         throw new NullPointerException("videoNote is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.videoNote = videoNote;
         this.duration = duration;
         this.length = length;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.thumb = thumb;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendVideoNoteBuilder {
      private String chatId;
      private InputFile videoNote;
      private Integer duration;
      private Integer length;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private InputFile thumb;
      private Boolean allowSendingWithoutReply;

      SendVideoNoteBuilder() {
      }

      public SendVideoNote.SendVideoNoteBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public SendVideoNote.SendVideoNoteBuilder videoNote(@NonNull InputFile videoNote) {
         if (videoNote == null) {
            throw new NullPointerException("videoNote is marked non-null but is null");
         } else {
            this.videoNote = videoNote;
            return this;
         }
      }

      public SendVideoNote.SendVideoNoteBuilder duration(Integer duration) {
         this.duration = duration;
         return this;
      }

      public SendVideoNote.SendVideoNoteBuilder length(Integer length) {
         this.length = length;
         return this;
      }

      public SendVideoNote.SendVideoNoteBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      public SendVideoNote.SendVideoNoteBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      public SendVideoNote.SendVideoNoteBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public SendVideoNote.SendVideoNoteBuilder thumb(InputFile thumb) {
         this.thumb = thumb;
         return this;
      }

      public SendVideoNote.SendVideoNoteBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendVideoNote build() {
         return new SendVideoNote(this.chatId, this.videoNote, this.duration, this.length, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.thumb, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendVideoNote.SendVideoNoteBuilder(chatId=" + this.chatId + ", videoNote=" + this.videoNote + ", duration=" + this.duration + ", length=" + this.length + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", thumb=" + this.thumb + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
