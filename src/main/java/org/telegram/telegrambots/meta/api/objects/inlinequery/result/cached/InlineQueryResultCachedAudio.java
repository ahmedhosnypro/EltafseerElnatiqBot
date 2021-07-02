package org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultCachedAudio implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String AUDIO_FILE_ID_FIELD = "audio_file_id";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String CAPTION_FIELD = "caption";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("type")
   private final String type = "audio";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("audio_file_id")
   @NonNull
   private String audioFileId;
   @JsonProperty("input_message_content")
   private InputMessageContent inputMessageContent;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.audioFileId != null && !this.audioFileId.isEmpty()) {
            if (this.parseMode != null && this.captionEntities != null && !this.captionEntities.isEmpty()) {
               throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
            } else {
               if (this.inputMessageContent != null) {
                  this.inputMessageContent.validate();
               }

               if (this.replyMarkup != null) {
                  this.replyMarkup.validate();
               }

            }
         } else {
            throw new TelegramApiValidationException("AudioFileId parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder builder() {
      return new InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultCachedAudio)) {
         return false;
      } else {
         InlineQueryResultCachedAudio other = (InlineQueryResultCachedAudio)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label107: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label107;
                  }
               } else if (this$type.equals(other$type)) {
                  break label107;
               }

               return false;
            }

            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
               return false;
            }

            Object this$audioFileId = this.getAudioFileId();
            Object other$audioFileId = other.getAudioFileId();
            if (this$audioFileId == null) {
               if (other$audioFileId != null) {
                  return false;
               }
            } else if (!this$audioFileId.equals(other$audioFileId)) {
               return false;
            }

            label86: {
               Object this$inputMessageContent = this.getInputMessageContent();
               Object other$inputMessageContent = other.getInputMessageContent();
               if (this$inputMessageContent == null) {
                  if (other$inputMessageContent == null) {
                     break label86;
                  }
               } else if (this$inputMessageContent.equals(other$inputMessageContent)) {
                  break label86;
               }

               return false;
            }

            label79: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label79;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label79;
               }

               return false;
            }

            label72: {
               Object this$caption = this.getCaption();
               Object other$caption = other.getCaption();
               if (this$caption == null) {
                  if (other$caption == null) {
                     break label72;
                  }
               } else if (this$caption.equals(other$caption)) {
                  break label72;
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
      return other instanceof InlineQueryResultCachedAudio;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $type = this.getType();
      int result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $audioFileId = this.getAudioFileId();
      result = result * 59 + ($audioFileId == null ? 43 : $audioFileId.hashCode());
      Object $inputMessageContent = this.getInputMessageContent();
      result = result * 59 + ($inputMessageContent == null ? 43 : $inputMessageContent.hashCode());
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

   public String getType() {
      Objects.requireNonNull(this);
      return "audio";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getAudioFileId() {
      return this.audioFileId;
   }

   public InputMessageContent getInputMessageContent() {
      return this.inputMessageContent;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
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

   @JsonProperty("id")
   public void setId(@NonNull String id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
      }
   }

   @JsonProperty("audio_file_id")
   public void setAudioFileId(@NonNull String audioFileId) {
      if (audioFileId == null) {
         throw new NullPointerException("audioFileId is marked non-null but is null");
      } else {
         this.audioFileId = audioFileId;
      }
   }

   @JsonProperty("input_message_content")
   public void setInputMessageContent(InputMessageContent inputMessageContent) {
      this.inputMessageContent = inputMessageContent;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("caption")
   public void setCaption(String caption) {
      this.caption = caption;
   }

   @JsonProperty("parse_mode")
   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   @JsonProperty("caption_entities")
   public void setCaptionEntities(List<MessageEntity> captionEntities) {
      this.captionEntities = captionEntities;
   }

   public String toString() {
      return "InlineQueryResultCachedAudio(type=" + this.getType() + ", id=" + this.getId() + ", audioFileId=" + this.getAudioFileId() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultCachedAudio(@NonNull String id, @NonNull String audioFileId) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (audioFileId == null) {
         throw new NullPointerException("audioFileId is marked non-null but is null");
      } else {
         this.id = id;
         this.audioFileId = audioFileId;
      }
   }

   public InlineQueryResultCachedAudio() {
   }

   public InlineQueryResultCachedAudio(@NonNull String id, @NonNull String audioFileId, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, String caption, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (audioFileId == null) {
         throw new NullPointerException("audioFileId is marked non-null but is null");
      } else {
         this.id = id;
         this.audioFileId = audioFileId;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.caption = caption;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultCachedAudioBuilder {
      private String id;
      private String audioFileId;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private String caption;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultCachedAudioBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("audio_file_id")
      public InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder audioFileId(@NonNull String audioFileId) {
         if (audioFileId == null) {
            throw new NullPointerException("audioFileId is marked non-null but is null");
         } else {
            this.audioFileId = audioFileId;
            return this;
         }
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultCachedAudio build() {
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

         return new InlineQueryResultCachedAudio(this.id, this.audioFileId, this.inputMessageContent, this.replyMarkup, this.caption, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultCachedAudio.InlineQueryResultCachedAudioBuilder(id=" + this.id + ", audioFileId=" + this.audioFileId + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
