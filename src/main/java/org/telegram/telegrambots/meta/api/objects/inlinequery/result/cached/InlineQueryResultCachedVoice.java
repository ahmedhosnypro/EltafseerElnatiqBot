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
public class InlineQueryResultCachedVoice implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String VOICE_FILE_ID_FIELD = "voice_file_id";
   private static final String TITLE_FIELD = "title";
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
   @JsonProperty("voice_file_id")
   @NonNull
   private String voiceFileId;
   @JsonProperty("title")
   @NonNull
   private String title;
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
         if (this.voiceFileId != null && !this.voiceFileId.isEmpty()) {
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
            throw new TelegramApiValidationException("VoiceFileId parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder builder() {
      return new InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultCachedVoice)) {
         return false;
      } else {
         InlineQueryResultCachedVoice other = (InlineQueryResultCachedVoice)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label119: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label119;
                  }
               } else if (this$type.equals(other$type)) {
                  break label119;
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

            label105: {
               Object this$voiceFileId = this.getVoiceFileId();
               Object other$voiceFileId = other.getVoiceFileId();
               if (this$voiceFileId == null) {
                  if (other$voiceFileId == null) {
                     break label105;
                  }
               } else if (this$voiceFileId.equals(other$voiceFileId)) {
                  break label105;
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

            label91: {
               Object this$inputMessageContent = this.getInputMessageContent();
               Object other$inputMessageContent = other.getInputMessageContent();
               if (this$inputMessageContent == null) {
                  if (other$inputMessageContent == null) {
                     break label91;
                  }
               } else if (this$inputMessageContent.equals(other$inputMessageContent)) {
                  break label91;
               }

               return false;
            }

            Object this$replyMarkup = this.getReplyMarkup();
            Object other$replyMarkup = other.getReplyMarkup();
            if (this$replyMarkup == null) {
               if (other$replyMarkup != null) {
                  return false;
               }
            } else if (!this$replyMarkup.equals(other$replyMarkup)) {
               return false;
            }

            label77: {
               Object this$caption = this.getCaption();
               Object other$caption = other.getCaption();
               if (this$caption == null) {
                  if (other$caption == null) {
                     break label77;
                  }
               } else if (this$caption.equals(other$caption)) {
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
      return other instanceof InlineQueryResultCachedVoice;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $type = this.getType();
      int result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $voiceFileId = this.getVoiceFileId();
      result = result * 59 + ($voiceFileId == null ? 43 : $voiceFileId.hashCode());
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
   public String getVoiceFileId() {
      return this.voiceFileId;
   }

   @NonNull
   public String getTitle() {
      return this.title;
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

   @JsonProperty("voice_file_id")
   public void setVoiceFileId(@NonNull String voiceFileId) {
      if (voiceFileId == null) {
         throw new NullPointerException("voiceFileId is marked non-null but is null");
      } else {
         this.voiceFileId = voiceFileId;
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
      return "InlineQueryResultCachedVoice(type=" + this.getType() + ", id=" + this.getId() + ", voiceFileId=" + this.getVoiceFileId() + ", title=" + this.getTitle() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", caption=" + this.getCaption() + ", parseMode=" + this.getParseMode() + ", captionEntities=" + this.getCaptionEntities() + ")";
   }

   public InlineQueryResultCachedVoice(@NonNull String id, @NonNull String voiceFileId, @NonNull String title) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (voiceFileId == null) {
         throw new NullPointerException("voiceFileId is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.id = id;
         this.voiceFileId = voiceFileId;
         this.title = title;
      }
   }

   public InlineQueryResultCachedVoice() {
   }

   public InlineQueryResultCachedVoice(@NonNull String id, @NonNull String voiceFileId, @NonNull String title, InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, String caption, String parseMode, List<MessageEntity> captionEntities) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (voiceFileId == null) {
         throw new NullPointerException("voiceFileId is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.id = id;
         this.voiceFileId = voiceFileId;
         this.title = title;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.caption = caption;
         this.parseMode = parseMode;
         this.captionEntities = captionEntities;
      }
   }

   public static class InlineQueryResultCachedVoiceBuilder {
      private String id;
      private String voiceFileId;
      private String title;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private String caption;
      private String parseMode;
      private ArrayList<MessageEntity> captionEntities;

      InlineQueryResultCachedVoiceBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("voice_file_id")
      public InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder voiceFileId(@NonNull String voiceFileId) {
         if (voiceFileId == null) {
            throw new NullPointerException("voiceFileId is marked non-null but is null");
         } else {
            this.voiceFileId = voiceFileId;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder inputMessageContent(InputMessageContent inputMessageContent) {
         this.inputMessageContent = inputMessageContent;
         return this;
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("caption")
      public InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder caption(String caption) {
         this.caption = caption;
         return this;
      }

      @JsonProperty("parse_mode")
      public InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      public InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder captionEntity(MessageEntity captionEntity) {
         if (this.captionEntities == null) {
            this.captionEntities = new ArrayList();
         }

         this.captionEntities.add(captionEntity);
         return this;
      }

      @JsonProperty("caption_entities")
      public InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder captionEntities(Collection<? extends MessageEntity> captionEntities) {
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

      public InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder clearCaptionEntities() {
         if (this.captionEntities != null) {
            this.captionEntities.clear();
         }

         return this;
      }

      public InlineQueryResultCachedVoice build() {
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

         return new InlineQueryResultCachedVoice(this.id, this.voiceFileId, this.title, this.inputMessageContent, this.replyMarkup, this.caption, this.parseMode, captionEntities);
      }

      public String toString() {
         return "InlineQueryResultCachedVoice.InlineQueryResultCachedVoiceBuilder(id=" + this.id + ", voiceFileId=" + this.voiceFileId + ", title=" + this.title + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", caption=" + this.caption + ", parseMode=" + this.parseMode + ", captionEntities=" + this.captionEntities + ")";
      }
   }
}
