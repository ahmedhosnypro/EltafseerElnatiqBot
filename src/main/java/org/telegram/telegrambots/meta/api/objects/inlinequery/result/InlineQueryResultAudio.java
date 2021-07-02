package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

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
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultAudio implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String AUDIOURL_FIELD = "audio_url";
   private static final String TITLE_FIELD = "title";
   private static final String PERFORMER_FIELD = "performer";
   private static final String AUDIO_DURATION_FIELD = "audio_duration";
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
   @JsonProperty("audio_url")
   @NonNull
   private String audioUrl;
   @JsonProperty("title")
   private String title;
   @JsonProperty("performer")
   private String performer;
   @JsonProperty("audio_duration")
   private Integer audioDuration;
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
         if (this.audioUrl != null && !this.audioUrl.isEmpty()) {
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
            throw new TelegramApiValidationException("AudioUrl parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultAudio.InlineQueryResultAudioBuilder builder() {
      return new InlineQueryResultAudio.InlineQueryResultAudioBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultAudio)) {
         return false;
      } else {
         InlineQueryResultAudio other = (InlineQueryResultAudio)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label143: {
               Object this$audioDuration = this.getAudioDuration();
               Object other$audioDuration = other.getAudioDuration();
               if (this$audioDuration == null) {
                  if (other$audioDuration == null) {
                     break label143;
                  }
               } else if (this$audioDuration.equals(other$audioDuration)) {
                  break label143;
               }

               return false;
            }

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
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

            label122: {
               Object this$audioUrl = this.getAudioUrl();
               Object other$audioUrl = other.getAudioUrl();
               if (this$audioUrl == null) {
                  if (other$audioUrl == null) {
                     break label122;
                  }
               } else if (this$audioUrl.equals(other$audioUrl)) {
                  break label122;
               }

               return false;
            }

            label115: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label115;
                  }
               } else if (this$title.equals(other$title)) {
                  break label115;
               }

               return false;
            }

            Object this$performer = this.getPerformer();
            Object other$performer = other.getPerformer();
            if (this$performer == null) {
               if (other$performer != null) {
                  return false;
               }
            } else if (!this$performer.equals(other$performer)) {
               return false;
            }

            Object this$inputMessageContent = this.getInputMessageContent();
            Object other$inputMessageContent = other.getInputMessageContent();
            if (this$inputMessageContent == null) {
               if (other$inputMessageContent != null) {
                  return false;
               }
            } else if (!this$inputMessageContent.equals(other$inputMessageContent)) {
               return false;
            }

            label94: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label94;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label94;
               }

               return false;
            }

            label87: {
               Object this$caption = this.getCaption();
               Object other$caption = other.getCaption();
               if (this$caption == null) {
                  if (other$caption == null) {
                     break label87;
                  }
               } else if (this$caption.equals(other$caption)) {
                  break label87;
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
      return other instanceof InlineQueryResultAudio;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $audioDuration = this.getAudioDuration();
      int result = result * 59 + ($audioDuration == null ? 43 : $audioDuration.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $audioUrl = this.getAudioUrl();
      result = result * 59 + ($audioUrl == null ? 43 : $audioUrl.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $performer = this.getPerformer();
      result = result * 59 + ($performer == null ? 43 : $performer.hashCode());
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
   public String getAudioUrl() {
      return this.audioUrl;
   }

   public String getTitle() {
      return this.title;
   }

   public String getPerformer() {
      return this.performer;
   }

   public Integer getAudioDuration() {
      return this.audioDuration;
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

   @JsonProperty("audio_url")
   public void setAudioUrl(@NonNull String audioUrl) {
      if (audioUrl == null) {
         throw new NullPointerException("audioUrl is marked non-null but is null");
      } else {
         this.audioUrl = audioUrl;
      }
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("performer")
   public void setPerformer(String performer) {
      this.performer = performer;
   }

   @JsonProperty("audio_duration")
   public void setAudioDuration(Integer audioDuration) {
      this.audioDuration = audioDuration;
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
      return "InlineQueryResultAudio(type=" + this.getType() + ", id=" + this.getId() + ", audioUrl=" + this.getAudioUrl() + ", title=" + this.getTitle() + ", performer=" + this.getPerformer() + ", audioDuration=" + this.getAudioDuration() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultAudio(@NonNull String id, @NonNull String audioUrl) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (audioUrl == null) {
         throw new NullPointerException("audioUrl is marked non-null but is null");
      } else {
         this.id = id;
         this.audioUrl = audioUrl;
      }
   }

   public InlineQueryResultAudio() {
   }

   public InlineQueryResultAudio(@NonNull String id, @NonNull String audioUrl, String title, String performer, Integer audioDuration, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, String caption, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (audioUrl == null) {
         throw new NullPointerException("audioUrl is marked non-null but is null");
      } else {
         this.id = id;
         this.audioUrl = audioUrl;
         this.title = title;
         this.performer = performer;
         this.audioDuration = audioDuration;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.caption = caption;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultAudioBuilder {
      private String id;
      private String audioUrl;
      private String title;
      private String performer;
      private Integer audioDuration;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private String caption;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultAudioBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultAudio.InlineQueryResultAudioBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("audio_url")
      public InlineQueryResultAudio.InlineQueryResultAudioBuilder audioUrl(@NonNull String audioUrl) {
         if (audioUrl == null) {
            throw new NullPointerException("audioUrl is marked non-null but is null");
         } else {
            this.audioUrl = audioUrl;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultAudio.InlineQueryResultAudioBuilder title(String title) {
         this.title = title;
         return this;
      }

      @JsonProperty("performer")
      public InlineQueryResultAudio.InlineQueryResultAudioBuilder performer(String performer) {
         this.performer = performer;
         return this;
      }

      @JsonProperty("audio_duration")
      public InlineQueryResultAudio.InlineQueryResultAudioBuilder audioDuration(Integer audioDuration) {
         this.audioDuration = audioDuration;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultAudio.InlineQueryResultAudioBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultAudio.InlineQueryResultAudioBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultAudio.InlineQueryResultAudioBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultAudio.InlineQueryResultAudioBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultAudio.InlineQueryResultAudioBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultAudio.InlineQueryResultAudioBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultAudio.InlineQueryResultAudioBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultAudio build() {
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

         return new InlineQueryResultAudio(this.id, this.audioUrl, this.title, this.performer, this.audioDuration, this.inputMessageContent, this.replyMarkup, this.caption, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultAudio.InlineQueryResultAudioBuilder(id=" + this.id + ", audioUrl=" + this.audioUrl + ", title=" + this.title + ", performer=" + this.performer + ", audioDuration=" + this.audioDuration + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
