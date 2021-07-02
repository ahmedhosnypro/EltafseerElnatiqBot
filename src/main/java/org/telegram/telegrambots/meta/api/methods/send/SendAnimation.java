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

public class SendAnimation extends PartialBotApiMethod<Message> {
   public static final String PATH = "sendAnimation";
   public static final String CHATID_FIELD = "chat_id";
   public static final String ANIMATION_FIELD = "animation";
   public static final String DURATION_FIELD = "duration";
   public static final String WIDTH_FIELD = "width";
   public static final String HEIGHT_FIELD = "height";
   public static final String CAPTION_FIELD = "caption";
   public static final String PARSEMODE_FIELD = "parse_mode";
   public static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   public static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   public static final String REPLYMARKUP_FIELD = "reply_markup";
   public static final String THUMB_FIELD = "thumb";
   public static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   public static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @NonNull
   private String chatId;
   @NonNull
   private InputFile animation;
   private Integer duration;
   private String caption;
   private Integer width;
   private Integer height;
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
            throw new TelegramApiRequestException("Error sending animation", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.animation == null) {
            throw new TelegramApiValidationException("Animation parameter can't be empty", this);
         } else if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
            throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
         } else {
            this.animation.validate();
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

            if (this.thumb != null) {
               this.thumb.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendAnimation.SendAnimationBuilder builder() {
      return new SendAnimation.SendAnimationBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendAnimation)) {
         return false;
      } else {
         SendAnimation other = (SendAnimation)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label167: {
               Object this$duration = this.getDuration();
               Object other$duration = other.getDuration();
               if (this$duration == null) {
                  if (other$duration == null) {
                     break label167;
                  }
               } else if (this$duration.equals(other$duration)) {
                  break label167;
               }

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

            label153: {
               Object this$height = this.getHeight();
               Object other$height = other.getHeight();
               if (this$height == null) {
                  if (other$height == null) {
                     break label153;
                  }
               } else if (this$height.equals(other$height)) {
                  break label153;
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

            label139: {
               Object this$replyToMessageId = this.getReplyToMessageId();
               Object other$replyToMessageId = other.getReplyToMessageId();
               if (this$replyToMessageId == null) {
                  if (other$replyToMessageId == null) {
                     break label139;
                  }
               } else if (this$replyToMessageId.equals(other$replyToMessageId)) {
                  break label139;
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

            label125: {
               Object this$chatId = this.getChatId();
               Object other$chatId = other.getChatId();
               if (this$chatId == null) {
                  if (other$chatId == null) {
                     break label125;
                  }
               } else if (this$chatId.equals(other$chatId)) {
                  break label125;
               }

               return false;
            }

            label118: {
               Object this$animation = this.getAnimation();
               Object other$animation = other.getAnimation();
               if (this$animation == null) {
                  if (other$animation == null) {
                     break label118;
                  }
               } else if (this$animation.equals(other$animation)) {
                  break label118;
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

            label104: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label104;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
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
      return other instanceof SendAnimation;
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
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $animation = this.getAnimation();
      result = result * 59 + ($animation == null ? 43 : $animation.hashCode());
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
   public InputFile getAnimation() {
      return this.animation;
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

   public void setAnimation(@NonNull InputFile animation) {
      if (animation == null) {
         throw new NullPointerException("animation is marked non-null but is null");
      } else {
         this.animation = animation;
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
      return "SendAnimation(chatId=" + this.getChatId() + ", animation=" + this.getAnimation() + ", duration=" + this.getDuration() + ", caption=" + this.getCaption() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", parseMode=" + this.getParseMode() + ", thumb=" + this.getThumb() + ", captionEntities=" + this.getCaptionEntities() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendAnimation(@NonNull String chatId, @NonNull InputFile animation) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (animation == null) {
         throw new NullPointerException("animation is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.animation = animation;
      }
   }

   public SendAnimation() {
   }

   public SendAnimation(@NonNull String chatId, @NonNull InputFile animation, Integer duration, String caption, Integer width, Integer height, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, String parseMode, InputFile thumb, List<MessageEntity> captionEntities, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (animation == null) {
         throw new NullPointerException("animation is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.animation = animation;
         this.duration = duration;
         this.caption = caption;
         this.width = width;
         this.height = height;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.parseMode = parseMode;
         this.thumb = thumb;
         this.captionEntities = captionEntities;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendAnimationBuilder {
      private String chatId;
      private InputFile animation;
      private Integer duration;
      private String caption;
      private Integer width;
      private Integer height;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private String parseMode;
      private InputFile thumb;
      private ArrayList<MessageEntity> captionEntities;
      private Boolean allowSendingWithoutReply;

      SendAnimationBuilder() {
      }

      public SendAnimation.SendAnimationBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      public SendAnimation.SendAnimationBuilder animation(@NonNull InputFile animation) {
         if (animation == null) {
            throw new NullPointerException("animation is marked non-null but is null");
         } else {
            this.animation = animation;
            return this;
         }
      }

      public SendAnimation.SendAnimationBuilder duration(Integer duration) {
         this.duration = duration;
         return this;
      }

      public SendAnimation.SendAnimationBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public SendAnimation.SendAnimationBuilder width(Integer width) {
         this.width = width;
         return this;
      }

      public SendAnimation.SendAnimationBuilder height(Integer height) {
         this.height = height;
         return this;
      }

      public SendAnimation.SendAnimationBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      public SendAnimation.SendAnimationBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      public SendAnimation.SendAnimationBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public SendAnimation.SendAnimationBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public SendAnimation.SendAnimationBuilder thumb(InputFile thumb) {
         this.thumb = thumb;
         return this;
      }

      public SendAnimation.SendAnimationBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      public SendAnimation.SendAnimationBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public SendAnimation.SendAnimationBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public SendAnimation.SendAnimationBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendAnimation build() {
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

         return new SendAnimation(this.chatId, this.animation, this.duration, this.caption, this.width, this.height, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.parseMode, this.thumb, captionEntities, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendAnimation.SendAnimationBuilder(chatId=" + this.chatId + ", animation=" + this.animation + ", duration=" + this.duration + ", caption=" + this.caption + ", width=" + this.width + ", height=" + this.height + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", parseMode=" + this.parseMode + ", thumb=" + this.thumb + ", captionEntities=" + this.captionEntities + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
