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

public class SendVideo extends PartialBotApiMethod<Message> {
   public static final String PATH = "sendvideo";
   public static final String CHATID_FIELD = "chat_id";
   public static final String VIDEO_FIELD = "video";
   public static final String DURATION_FIELD = "duration";
   public static final String CAPTION_FIELD = "caption";
   public static final String WIDTH_FIELD = "width";
   public static final String HEIGHT_FIELD = "height";
   public static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   public static final String SUPPORTSSTREAMING_FIELD = "supports_streaming";
   public static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   public static final String REPLYMARKUP_FIELD = "reply_markup";
   public static final String PARSEMODE_FIELD = "parse_mode";
   public static final String THUMB_FIELD = "thumb";
   public static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   public static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @NonNull
   private String chatId;
   @NonNull
   private InputFile video;
   private Integer duration;
   private String caption;
   private Integer width;
   private Integer height;
   private Boolean supportsStreaming;
   private Boolean disableNotification;
   private Integer replyToMessageId;
   private ReplyKeyboard replyMarkup;
   private String parseMode;
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
            throw new TelegramApiRequestException("Error sending video", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.video == null) {
            throw new TelegramApiValidationException("Video parameter can't be empty", this);
         } else if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
            throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
         } else {
            this.video.validate();
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

   public static SendVideo.SendVideoBuilder builder() {
      return new SendVideo.SendVideoBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendVideo)) {
         return false;
      } else {
         SendVideo other = (SendVideo)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$duration = this.getDuration();
            Object other$duration = other.getDuration();
            if (this$duration == null) {
               if (other$duration != null) {
                  return false;
               }
            } else if (!this$duration.equals(other$duration)) {
               return false;
            }

            Object this$width = this.getWidth();
            Object other$width = other.getWidth();
            if (this$width == null) {
               if (other$width != null) {
                  return false;
               }
            } else if (!this$width.equals(other$width)) {
               return false;
            }

            Object this$height = this.getHeight();
            Object other$height = other.getHeight();
            if (this$height == null) {
               if (other$height != null) {
                  return false;
               }
            } else if (!this$height.equals(other$height)) {
               return false;
            }

            label158: {
               Object this$supportsStreaming = this.getSupportsStreaming();
               Object other$supportsStreaming = other.getSupportsStreaming();
               if (this$supportsStreaming == null) {
                  if (other$supportsStreaming == null) {
                     break label158;
                  }
               } else if (this$supportsStreaming.equals(other$supportsStreaming)) {
                  break label158;
               }

               return false;
            }

            label151: {
               Object this$disableNotification = this.getDisableNotification();
               Object other$disableNotification = other.getDisableNotification();
               if (this$disableNotification == null) {
                  if (other$disableNotification == null) {
                     break label151;
                  }
               } else if (this$disableNotification.equals(other$disableNotification)) {
                  break label151;
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

            label137: {
               Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
               Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
               if (this$allowSendingWithoutReply == null) {
                  if (other$allowSendingWithoutReply == null) {
                     break label137;
                  }
               } else if (this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
                  break label137;
               }

               return false;
            }

            label130: {
               Object this$chatId = this.getChatId();
               Object other$chatId = other.getChatId();
               if (this$chatId == null) {
                  if (other$chatId == null) {
                     break label130;
                  }
               } else if (this$chatId.equals(other$chatId)) {
                  break label130;
               }

               return false;
            }

            Object this$video = this.getVideo();
            Object other$video = other.getVideo();
            if (this$video == null) {
               if (other$video != null) {
                  return false;
               }
            } else if (!this$video.equals(other$video)) {
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

            label109: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label109;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label109;
               }

               return false;
            }

            label102: {
               Object this$parseMode = this.getParseMode();
               Object other$parseMode = other.getParseMode();
               if (this$parseMode == null) {
                  if (other$parseMode == null) {
                     break label102;
                  }
               } else if (this$parseMode.equals(other$parseMode)) {
                  break label102;
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
      return other instanceof SendVideo;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $duration = this.getDuration();
      int result = result * 59 + ($duration == null ? 43 : $duration.hashCode());
      Object $width = this.getWidth();
      result = result * 59 + ($width == null ? 43 : $width.hashCode());
      Object $height = this.getHeight();
      result = result * 59 + ($height == null ? 43 : $height.hashCode());
      Object $supportsStreaming = this.getSupportsStreaming();
      result = result * 59 + ($supportsStreaming == null ? 43 : $supportsStreaming.hashCode());
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $video = this.getVideo();
      result = result * 59 + ($video == null ? 43 : $video.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
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
   public InputFile getVideo() {
      return this.video;
   }

   public Integer getDuration() {
      return this.duration;
   }

   public String getCaption() {
      return this.caption;
   }

   public Integer getWidth() {
      return this.width;
   }

   public Integer getHeight() {
      return this.height;
   }

   public Boolean getSupportsStreaming() {
      return this.supportsStreaming;
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

   public void setVideo(@NonNull InputFile video) {
      if (video == null) {
         throw new NullPointerException("video is marked non-null but is null");
      } else {
         this.video = video;
      }
   }

   public void setDuration(Integer duration) {
      this.duration = duration;
   }

   public void setCaption(String caption) {
      this.caption = caption;
   }

   public void setWidth(Integer width) {
      this.width = width;
   }

   public void setHeight(Integer height) {
      this.height = height;
   }

   public void setSupportsStreaming(Boolean supportsStreaming) {
      this.supportsStreaming = supportsStreaming;
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
      return "SendVideo(chatId=" + this.getChatId() + ", video=" + this.getVideo() + ", duration=" + this.getDuration() + ", caption=" + this.getCaption() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", supportsStreaming=" + this.getSupportsStreaming() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", parseMode=" + this.getParseMode() + ", thumb=" + this.getThumb() + ", captionEntities=" + this.getCaptionEntities() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendVideo(@NonNull String chatId, @NonNull InputFile video) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (video == null) {
         throw new NullPointerException("video is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.video = video;
      }
   }

   public SendVideo() {
   }

   public SendVideo(@NonNull String chatId, @NonNull InputFile video, Integer duration, String caption, Integer width, Integer height, Boolean supportsStreaming, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, String parseMode, InputFile thumb, List<MessageEntity> captionEntities, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (video == null) {
         throw new NullPointerException("video is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.video = video;
         this.duration = duration;
         this.caption = caption;
         this.width = width;
         this.height = height;
         this.supportsStreaming = supportsStreaming;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.parseMode = parseMode;
         this.thumb = thumb;
         this.captionEntities = captionEntities;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendVideoBuilder {
      private String chatId;
      private InputFile video;
      private Integer duration;
      private String caption;
      private Integer width;
      private Integer height;
      private Boolean supportsStreaming;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private String parseMode;
      private InputFile thumb;
      private ArrayList<MessageEntity> captionEntities;
      private Boolean allowSendingWithoutReply;

      SendVideoBuilder() {
      }

      public SendVideo.SendVideoBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public SendVideo.SendVideoBuilder video(@NonNull InputFile video) {
         if (video == null) {
            throw new NullPointerException("video is marked non-null but is null");
         } else {
            this.video = video;
            return this;
         }
      }

      public SendVideo.SendVideoBuilder duration(Integer duration) {
         this.duration = duration;
         return this;
      }

      public SendVideo.SendVideoBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public SendVideo.SendVideoBuilder width(Integer width) {
         this.width = width;
         return this;
      }

      public SendVideo.SendVideoBuilder height(Integer height) {
         this.height = height;
         return this;
      }

      public SendVideo.SendVideoBuilder supportsStreaming(Boolean supportsStreaming) {
         this.supportsStreaming = supportsStreaming;
         return this;
      }

      public SendVideo.SendVideoBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      public SendVideo.SendVideoBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      public SendVideo.SendVideoBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public SendVideo.SendVideoBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public SendVideo.SendVideoBuilder thumb(InputFile thumb) {
         this.thumb = thumb;
         return this;
      }

      public SendVideo.SendVideoBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      public SendVideo.SendVideoBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public SendVideo.SendVideoBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public SendVideo.SendVideoBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendVideo build() {
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

         return new SendVideo(this.chatId, this.video, this.duration, this.caption, this.width, this.height, this.supportsStreaming, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.parseMode, this.thumb, captionEntities, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendVideo.SendVideoBuilder(chatId=" + this.chatId + ", video=" + this.video + ", duration=" + this.duration + ", caption=" + this.caption + ", width=" + this.width + ", height=" + this.height + ", supportsStreaming=" + this.supportsStreaming + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", parseMode=" + this.parseMode + ", thumb=" + this.thumb + ", captionEntities=" + this.captionEntities + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
