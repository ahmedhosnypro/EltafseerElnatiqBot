package org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InputTextMessageContent implements InputMessageContent {
   private static final String MESSAGETEXT_FIELD = "message_text";
   private static final String PARSEMODE_FIELD = "parse_mode";
   private static final String DISABLEWEBPAGEPREVIEW_FIELD = "disable_web_page_preview";
   private static final String ENTITIES_FIELD = "entities";
   @JsonProperty("message_text")
   @NonNull
   private String messageText;
   @JsonProperty("parse_mode")
   private String parseMode;
   @JsonProperty("disable_web_page_preview")
   private Boolean disableWebPagePreview;
   @JsonProperty("entities")
   private List<MessageEntity> entities;

   public void validate() throws TelegramApiValidationException {
      if (this.messageText != null && !this.messageText.isEmpty()) {
         if (this.parseMode != null && this.entities != null && !this.entities.isEmpty()) {
            throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
         }
      } else {
         throw new TelegramApiValidationException("MessageText parameter can't be empty", this);
      }
   }

   public static InputTextMessageContent.InputTextMessageContentBuilder builder() {
      return new InputTextMessageContent.InputTextMessageContentBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InputTextMessageContent)) {
         return false;
      } else {
         InputTextMessageContent other = (InputTextMessageContent)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$disableWebPagePreview = this.getDisableWebPagePreview();
               Object other$disableWebPagePreview = other.getDisableWebPagePreview();
               if (this$disableWebPagePreview == null) {
                  if (other$disableWebPagePreview == null) {
                     break label59;
                  }
               } else if (this$disableWebPagePreview.equals(other$disableWebPagePreview)) {
                  break label59;
               }

               return false;
            }

            Object this$messageText = this.getMessageText();
            Object other$messageText = other.getMessageText();
            if (this$messageText == null) {
               if (other$messageText != null) {
                  return false;
               }
            } else if (!this$messageText.equals(other$messageText)) {
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

            Object this$entities = this.getEntities();
            Object other$entities = other.getEntities();
            if (this$entities == null) {
               if (other$entities != null) {
                  return false;
               }
            } else if (!this$entities.equals(other$entities)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InputTextMessageContent;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $disableWebPagePreview = this.getDisableWebPagePreview();
      int result = result * 59 + ($disableWebPagePreview == null ? 43 : $disableWebPagePreview.hashCode());
      Object $messageText = this.getMessageText();
      result = result * 59 + ($messageText == null ? 43 : $messageText.hashCode());
      Object $parseMode = this.getParseMode();
      result = result * 59 + ($parseMode == null ? 43 : $parseMode.hashCode());
      Object $entities = this.getEntities();
      result = result * 59 + ($entities == null ? 43 : $entities.hashCode());
      return result;
   }

   @NonNull
   public String getMessageText() {
      return this.messageText;
   }

   public String getParseMode() {
      return this.parseMode;
   }

   public Boolean getDisableWebPagePreview() {
      return this.disableWebPagePreview;
   }

   public List<MessageEntity> getEntities() {
      return this.entities;
   }

   @JsonProperty("message_text")
   public void setMessageText(@NonNull String messageText) {
      if (messageText == null) {
         throw new NullPointerException("messageText is marked non-null but is null");
      } else {
         this.messageText = messageText;
      }
   }

   @JsonProperty("parse_mode")
   public void setParseMode(String parseMode) {
      this.parseMode = parseMode;
   }

   @JsonProperty("disable_web_page_preview")
   public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
      this.disableWebPagePreview = disableWebPagePreview;
   }

   @JsonProperty("entities")
   public void setEntities(List<MessageEntity> entities) {
      this.entities = entities;
   }

   public String toString() {
      return "InputTextMessageContent(messageText=" + this.getMessageText() + ", parseMode=" + this.getParseMode() + ", disableWebPagePreview=" + this.getDisableWebPagePreview() + ", entities=" + this.getEntities() + ")";
   }

   public InputTextMessageContent(@NonNull String messageText) {
      if (messageText == null) {
         throw new NullPointerException("messageText is marked non-null but is null");
      } else {
         this.messageText = messageText;
      }
   }

   public InputTextMessageContent() {
   }

   public InputTextMessageContent(@NonNull String messageText, String parseMode, Boolean disableWebPagePreview, List<MessageEntity> entities) {
      if (messageText == null) {
         throw new NullPointerException("messageText is marked non-null but is null");
      } else {
         this.messageText = messageText;
         this.parseMode = parseMode;
         this.disableWebPagePreview = disableWebPagePreview;
         this.entities = entities;
      }
   }

   public static class InputTextMessageContentBuilder {
      private String messageText;
      private String parseMode;
      private Boolean disableWebPagePreview;
      private List<MessageEntity> entities;

      InputTextMessageContentBuilder() {
      }

      @JsonProperty("message_text")
      public InputTextMessageContent.InputTextMessageContentBuilder messageText(@NonNull String messageText) {
         if (messageText == null) {
            throw new NullPointerException("messageText is marked non-null but is null");
         } else {
            this.messageText = messageText;
            return this;
         }
      }

      @JsonProperty("parse_mode")
      public InputTextMessageContent.InputTextMessageContentBuilder parseMode(String parseMode) {
         this.parseMode = parseMode;
         return this;
      }

      @JsonProperty("disable_web_page_preview")
      public InputTextMessageContent.InputTextMessageContentBuilder disableWebPagePreview(Boolean disableWebPagePreview) {
         this.disableWebPagePreview = disableWebPagePreview;
         return this;
      }

      @JsonProperty("entities")
      public InputTextMessageContent.InputTextMessageContentBuilder entities(List<MessageEntity> entities) {
         this.entities = entities;
         return this;
      }

      public InputTextMessageContent build() {
         return new InputTextMessageContent(this.messageText, this.parseMode, this.disableWebPagePreview, this.entities);
      }

      public String toString() {
         return "InputTextMessageContent.InputTextMessageContentBuilder(messageText=" + this.messageText + ", parseMode=" + this.parseMode + ", disableWebPagePreview=" + this.disableWebPagePreview + ", entities=" + this.entities + ")";
      }
   }
}
