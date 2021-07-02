package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultArticle implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String TITLE_FIELD = "title";
   private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String URL_FIELD = "url";
   private static final String HIDEURL_FIELD = "hide_url";
   private static final String DESCRIPTION_FIELD = "description";
   private static final String THUMBURL_FIELD = "thumb_url";
   private static final String THUMBWIDTH_FIELD = "thumb_width";
   private static final String THUMBHEIGHT_FIELD = "thumb_height";
   @JsonProperty("type")
   private final String type = "article";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("title")
   @NonNull
   private String title;
   @JsonProperty("input_message_content")
   @NonNull
   private InputMessageContent inputMessageContent;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("url")
   private String url;
   @JsonProperty("hide_url")
   private Boolean hideUrl;
   @JsonProperty("description")
   private String description;
   @JsonProperty("thumb_url")
   private String thumbUrl;
   @JsonProperty("thumb_width")
   private Integer thumbWidth;
   @JsonProperty("thumb_height")
   private Integer thumbHeight;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.title != null && !this.title.isEmpty()) {
            if (this.inputMessageContent == null) {
               throw new TelegramApiValidationException("InputMessageContent parameter can't be null", this);
            } else {
               this.inputMessageContent.validate();
               if (this.replyMarkup != null) {
                  this.replyMarkup.validate();
               }

            }
         } else {
            throw new TelegramApiValidationException("Title parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultArticle.InlineQueryResultArticleBuilder builder() {
      return new InlineQueryResultArticle.InlineQueryResultArticleBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultArticle)) {
         return false;
      } else {
         InlineQueryResultArticle other = (InlineQueryResultArticle)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label143: {
               Object this$hideUrl = this.getHideUrl();
               Object other$hideUrl = other.getHideUrl();
               if (this$hideUrl == null) {
                  if (other$hideUrl == null) {
                     break label143;
                  }
               } else if (this$hideUrl.equals(other$hideUrl)) {
                  break label143;
               }

               return false;
            }

            Object this$thumbWidth = this.getThumbWidth();
            Object other$thumbWidth = other.getThumbWidth();
            if (this$thumbWidth == null) {
               if (other$thumbWidth != null) {
                  return false;
               }
            } else if (!this$thumbWidth.equals(other$thumbWidth)) {
               return false;
            }

            Object this$thumbHeight = this.getThumbHeight();
            Object other$thumbHeight = other.getThumbHeight();
            if (this$thumbHeight == null) {
               if (other$thumbHeight != null) {
                  return false;
               }
            } else if (!this$thumbHeight.equals(other$thumbHeight)) {
               return false;
            }

            label122: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label122;
                  }
               } else if (this$type.equals(other$type)) {
                  break label122;
               }

               return false;
            }

            label115: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label115;
                  }
               } else if (this$id.equals(other$id)) {
                  break label115;
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
               Object this$url = this.getUrl();
               Object other$url = other.getUrl();
               if (this$url == null) {
                  if (other$url == null) {
                     break label87;
                  }
               } else if (this$url.equals(other$url)) {
                  break label87;
               }

               return false;
            }

            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
               if (other$description != null) {
                  return false;
               }
            } else if (!this$description.equals(other$description)) {
               return false;
            }

            Object this$thumbUrl = this.getThumbUrl();
            Object other$thumbUrl = other.getThumbUrl();
            if (this$thumbUrl == null) {
               if (other$thumbUrl != null) {
                  return false;
               }
            } else if (!this$thumbUrl.equals(other$thumbUrl)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InlineQueryResultArticle;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $hideUrl = this.getHideUrl();
      int result = result * 59 + ($hideUrl == null ? 43 : $hideUrl.hashCode());
      Object $thumbWidth = this.getThumbWidth();
      result = result * 59 + ($thumbWidth == null ? 43 : $thumbWidth.hashCode());
      Object $thumbHeight = this.getThumbHeight();
      result = result * 59 + ($thumbHeight == null ? 43 : $thumbHeight.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $inputMessageContent = this.getInputMessageContent();
      result = result * 59 + ($inputMessageContent == null ? 43 : $inputMessageContent.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $url = this.getUrl();
      result = result * 59 + ($url == null ? 43 : $url.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $thumbUrl = this.getThumbUrl();
      result = result * 59 + ($thumbUrl == null ? 43 : $thumbUrl.hashCode());
      return result;
   }

   public String getType() {
      Objects.requireNonNull(this);
      return "article";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getTitle() {
      return this.title;
   }

   @NonNull
   public InputMessageContent getInputMessageContent() {
      return this.inputMessageContent;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
   }

   public String getUrl() {
      return this.url;
   }

   public Boolean getHideUrl() {
      return this.hideUrl;
   }

   public String getDescription() {
      return this.description;
   }

   public String getThumbUrl() {
      return this.thumbUrl;
   }

   public Integer getThumbWidth() {
      return this.thumbWidth;
   }

   public Integer getThumbHeight() {
      return this.thumbHeight;
   }

   @JsonProperty("id")
   public void setId(@NonNull String id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
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
   public void setInputMessageContent(@NonNull InputMessageContent inputMessageContent) {
      if (inputMessageContent == null) {
         throw new NullPointerException("inputMessageContent is marked non-null but is null");
      } else {
         this.inputMessageContent = inputMessageContent;
      }
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("hide_url")
   public void setHideUrl(Boolean hideUrl) {
      this.hideUrl = hideUrl;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("thumb_url")
   public void setThumbUrl(String thumbUrl) {
      this.thumbUrl = thumbUrl;
   }

   @JsonProperty("thumb_width")
   public void setThumbWidth(Integer thumbWidth) {
      this.thumbWidth = thumbWidth;
   }

   @JsonProperty("thumb_height")
   public void setThumbHeight(Integer thumbHeight) {
      this.thumbHeight = thumbHeight;
   }

   public String toString() {
      return "InlineQueryResultArticle(type=" + this.getType() + ", id=" + this.getId() + ", title=" + this.getTitle() + ", inputMessageContent=" + this.getInputMessageContent() + ", replyMarkup=" + this.getReplyMarkup() + ", url=" + this.getUrl() + ", hideUrl=" + this.getHideUrl() + ", description=" + this.getDescription() + ", thumbUrl=" + this.getThumbUrl() + ", thumbWidth=" + this.getThumbWidth() + ", thumbHeight=" + this.getThumbHeight() + ")";
   }

   public InlineQueryResultArticle(@NonNull String id, @NonNull String title, @NonNull InputMessageContent inputMessageContent) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (inputMessageContent == null) {
         throw new NullPointerException("inputMessageContent is marked non-null but is null");
      } else {
         this.id = id;
         this.title = title;
         this.inputMessageContent = inputMessageContent;
      }
   }

   public InlineQueryResultArticle() {
   }

   public InlineQueryResultArticle(@NonNull String id, @NonNull String title, @NonNull InputMessageContent inputMessageContent, InlineKeyboardMarkup replyMarkup, String url, Boolean hideUrl, String description, String thumbUrl, Integer thumbWidth, Integer thumbHeight) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (inputMessageContent == null) {
         throw new NullPointerException("inputMessageContent is marked non-null but is null");
      } else {
         this.id = id;
         this.title = title;
         this.inputMessageContent = inputMessageContent;
         this.replyMarkup = replyMarkup;
         this.url = url;
         this.hideUrl = hideUrl;
         this.description = description;
         this.thumbUrl = thumbUrl;
         this.thumbWidth = thumbWidth;
         this.thumbHeight = thumbHeight;
      }
   }

   public static class InlineQueryResultArticleBuilder {
      private String id;
      private String title;
      private InputMessageContent inputMessageContent;
      private InlineKeyboardMarkup replyMarkup;
      private String url;
      private Boolean hideUrl;
      private String description;
      private String thumbUrl;
      private Integer thumbWidth;
      private Integer thumbHeight;

      InlineQueryResultArticleBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultArticle.InlineQueryResultArticleBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("title")
      public InlineQueryResultArticle.InlineQueryResultArticleBuilder title(@NonNull String title) {
         if (title == null) {
            throw new NullPointerException("title is marked non-null but is null");
         } else {
            this.title = title;
            return this;
         }
      }

      @JsonProperty("input_message_content")
      public InlineQueryResultArticle.InlineQueryResultArticleBuilder inputMessageContent(@NonNull InputMessageContent inputMessageContent) {
         if (inputMessageContent == null) {
            throw new NullPointerException("inputMessageContent is marked non-null but is null");
         } else {
            this.inputMessageContent = inputMessageContent;
            return this;
         }
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultArticle.InlineQueryResultArticleBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("url")
      public InlineQueryResultArticle.InlineQueryResultArticleBuilder url(String url) {
         this.url = url;
         return this;
      }

      @JsonProperty("hide_url")
      public InlineQueryResultArticle.InlineQueryResultArticleBuilder hideUrl(Boolean hideUrl) {
         this.hideUrl = hideUrl;
         return this;
      }

      @JsonProperty("description")
      public InlineQueryResultArticle.InlineQueryResultArticleBuilder description(String description) {
         this.description = description;
         return this;
      }

      @JsonProperty("thumb_url")
      public InlineQueryResultArticle.InlineQueryResultArticleBuilder thumbUrl(String thumbUrl) {
         this.thumbUrl = thumbUrl;
         return this;
      }

      @JsonProperty("thumb_width")
      public InlineQueryResultArticle.InlineQueryResultArticleBuilder thumbWidth(Integer thumbWidth) {
         this.thumbWidth = thumbWidth;
         return this;
      }

      @JsonProperty("thumb_height")
      public InlineQueryResultArticle.InlineQueryResultArticleBuilder thumbHeight(Integer thumbHeight) {
         this.thumbHeight = thumbHeight;
         return this;
      }

      public InlineQueryResultArticle build() {
         return new InlineQueryResultArticle(this.id, this.title, this.inputMessageContent, this.replyMarkup, this.url, this.hideUrl, this.description, this.thumbUrl, this.thumbWidth, this.thumbHeight);
      }

      public String toString() {
         return "InlineQueryResultArticle.InlineQueryResultArticleBuilder(id=" + this.id + ", title=" + this.title + ", inputMessageContent=" + this.inputMessageContent + ", replyMarkup=" + this.replyMarkup + ", url=" + this.url + ", hideUrl=" + this.hideUrl + ", description=" + this.description + ", thumbUrl=" + this.thumbUrl + ", thumbWidth=" + this.thumbWidth + ", thumbHeight=" + this.thumbHeight + ")";
      }
   }
}
