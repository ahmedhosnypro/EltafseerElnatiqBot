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
public class InlineQueryResultVoice implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String VOICEURL_FIELD = "voice_url";
   private static final String TITLE_FIELD = "title";
   private static final String VOICE_DURATION_FIELD = "voice_duration";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String CAPTION_FIELD = "caption";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String CAPTION_ENTITIES_FIELD = "caption_entities";
   @JsonProperty("type")
   private final String type = "voice";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("voice_url")
   @NonNull
   private String voiceUrl;
   @JsonProperty("title")
   @NonNull
   private String title;
   @JsonProperty("voice_duration")
   private Integer voiceDuration;
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
         if (this.voiceUrl != null && !this.voiceUrl.isEmpty()) {
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
            throw new TelegramApiValidationException("VoiceUrl parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultVoice.InlineQueryResultVoiceBuilder builder() {
      return new InlineQueryResultVoice.InlineQueryResultVoiceBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultVoice)) {
         return false;
      } else {
         InlineQueryResultVoice other = (InlineQueryResultVoice)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$voiceDuration = this.getVoiceDuration();
            Object other$voiceDuration = other.getVoiceDuration();
            if (this$voiceDuration == null) {
               if (other$voiceDuration != null) {
                  return false;
               }
            } else if (!this$voiceDuration.equals(other$voiceDuration)) {
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

            label110: {
               Object this$voiceUrl = this.getVoiceUrl();
               Object other$voiceUrl = other.getVoiceUrl();
               if (this$voiceUrl == null) {
                  if (other$voiceUrl == null) {
                     break label110;
                  }
               } else if (this$voiceUrl.equals(other$voiceUrl)) {
                  break label110;
               }

               return false;
            }

            label103: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label103;
                  }
               } else if (this$title.equals(other$title)) {
                  break label103;
               }

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
      return other instanceof InlineQueryResultVoice;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $voiceDuration = this.getVoiceDuration();
      int result = result * 59 + ($voiceDuration == null ? 43 : $voiceDuration.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $voiceUrl = this.getVoiceUrl();
      result = result * 59 + ($voiceUrl == null ? 43 : $voiceUrl.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
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
      return "voice";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getVoiceUrl() {
      return this.voiceUrl;
   }

   @NonNull
   public String getTitle() {
      return this.title;
   }

   public Integer getVoiceDuration() {
      return this.voiceDuration;
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

   @JsonProperty("voice_url")
   public void setVoiceUrl(@NonNull String voiceUrl) {
      if (voiceUrl == null) {
         throw new NullPointerException("voiceUrl is marked non-null but is null");
      } else {
         this.voiceUrl = voiceUrl;
      }
   }

   @JsonProperty("title")
   public void setTitle(@NonNull String title) {
      if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.title = title;
      }
   }

   @JsonProperty("voice_duration")
   public void setVoiceDuration(Integer voiceDuration) {
      this.voiceDuration = voiceDuration;
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
      return "InlineQueryResultVoice(type=" + this.getType() + ", id=" + this.getId() + ", voiceUrl=" + this.getVoiceUrl() + ", title=" + this.getTitle() + ", voiceDuration=" + this.getVoiceDuration() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultVoice(@NonNull String id, @NonNull String voiceUrl, @NonNull String title) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (voiceUrl == null) {
         throw new NullPointerException("voiceUrl is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.id = id;
         this.voiceUrl = voiceUrl;
         this.title = title;
      }
   }

   public InlineQueryResultVoice() {
   }

   public InlineQueryResultVoice(@NonNull String id, @NonNull String voiceUrl, @NonNull String title, Integer voiceDuration, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, String caption, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (voiceUrl == null) {
         throw new NullPointerException("voiceUrl is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.id = id;
         this.voiceUrl = voiceUrl;
         this.title = title;
         this.voiceDuration = voiceDuration;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.caption = caption;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultVoiceBuilder {
      private String id;
      private String voiceUrl;
      private String title;
      private Integer voiceDuration;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private String caption;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultVoiceBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("voice_url")
      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder voiceUrl(@NonNull String voiceUrl) {
         if (voiceUrl == null) {
            throw new NullPointerException("voiceUrl is marked non-null but is null");
         } else {
            this.voiceUrl = voiceUrl;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      @JsonProperty("voice_duration")
      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder voiceDuration(Integer voiceDuration) {
         this.voiceDuration = voiceDuration;
         return this;
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultVoice.InlineQueryResultVoiceBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultVoice build() {
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

         return new InlineQueryResultVoice(this.id, this.voiceUrl, this.title, this.voiceDuration, this.inputMessageContent, this.replyMarkup, this.caption, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultVoice.InlineQueryResultVoiceBuilder(id=" + this.id + ", voiceUrl=" + this.voiceUrl + ", title=" + this.title + ", voiceDuration=" + this.voiceDuration + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
