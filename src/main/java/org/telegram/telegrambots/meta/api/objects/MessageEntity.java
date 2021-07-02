package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class MessageEntity implements BotApiObject {
   private static final String TYPE_FIELD = "type";
   private static final String OFFSET_FIELD = "offset";
   private static final String LENGTH_FIELD = "length";
   private static final String URL_FIELD = "url";
   private static final String USER_FIELD = "user";
   private static final String LANGUAGE_FIELD = "language";
   @JsonProperty("type")
   @NonNull
   private String type;
   @JsonProperty("offset")
   @NonNull
   private Integer offset;
   @JsonProperty("length")
   @NonNull
   private Integer length;
   @JsonProperty("url")
   private String url;
   @JsonProperty("user")
   private User user;
   @JsonProperty("language")
   private String language;
   @JsonIgnore
   private String text;

   protected void computeText(String message) {
      if (message != null) {
         this.text = message.substring(this.offset, this.offset + this.length);
      }

   }

   public static MessageEntity.MessageEntityBuilder builder() {
      return new MessageEntity.MessageEntityBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof MessageEntity)) {
         return false;
      } else {
         MessageEntity other = (MessageEntity)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label95: {
               Object this$offset = this.getOffset();
               Object other$offset = other.getOffset();
               if (this$offset == null) {
                  if (other$offset == null) {
                     break label95;
                  }
               } else if (this$offset.equals(other$offset)) {
                  break label95;
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

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            label74: {
               Object this$url = this.getUrl();
               Object other$url = other.getUrl();
               if (this$url == null) {
                  if (other$url == null) {
                     break label74;
                  }
               } else if (this$url.equals(other$url)) {
                  break label74;
               }

               return false;
            }

            label67: {
               Object this$user = this.getUser();
               Object other$user = other.getUser();
               if (this$user == null) {
                  if (other$user == null) {
                     break label67;
                  }
               } else if (this$user.equals(other$user)) {
                  break label67;
               }

               return false;
            }

            Object this$language = this.getLanguage();
            Object other$language = other.getLanguage();
            if (this$language == null) {
               if (other$language != null) {
                  return false;
               }
            } else if (!this$language.equals(other$language)) {
               return false;
            }

            Object this$text = this.getText();
            Object other$text = other.getText();
            if (this$text == null) {
               if (other$text != null) {
                  return false;
               }
            } else if (!this$text.equals(other$text)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof MessageEntity;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $offset = this.getOffset();
      int result = result * 59 + ($offset == null ? 43 : $offset.hashCode());
      Object $length = this.getLength();
      result = result * 59 + ($length == null ? 43 : $length.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $url = this.getUrl();
      result = result * 59 + ($url == null ? 43 : $url.hashCode());
      Object $user = this.getUser();
      result = result * 59 + ($user == null ? 43 : $user.hashCode());
      Object $language = this.getLanguage();
      result = result * 59 + ($language == null ? 43 : $language.hashCode());
      Object $text = this.getText();
      result = result * 59 + ($text == null ? 43 : $text.hashCode());
      return result;
   }

   @NonNull
   public String getType() {
      return this.type;
   }

   @NonNull
   public Integer getOffset() {
      return this.offset;
   }

   @NonNull
   public Integer getLength() {
      return this.length;
   }

   public String getUrl() {
      return this.url;
   }

   public User getUser() {
      return this.user;
   }

   public String getLanguage() {
      return this.language;
   }

   public String getText() {
      return this.text;
   }

   @JsonProperty("type")
   public void setType(@NonNull String type) {
      if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else {
         this.type = type;
      }
   }

   @JsonProperty("offset")
   public void setOffset(@NonNull Integer offset) {
      if (offset == null) {
         throw new NullPointerException("offset is marked non-null but is null");
      } else {
         this.offset = offset;
      }
   }

   @JsonProperty("length")
   public void setLength(@NonNull Integer length) {
      if (length == null) {
         throw new NullPointerException("length is marked non-null but is null");
      } else {
         this.length = length;
      }
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("user")
   public void setUser(User user) {
      this.user = user;
   }

   @JsonProperty("language")
   public void setLanguage(String language) {
      this.language = language;
   }

   @JsonIgnore
   public void setText(String text) {
      this.text = text;
   }

   public String toString() {
      return "MessageEntity(type=" + this.getType() + ", offset=" + this.getOffset() + ", length=" + this.getLength() + ", url=" + this.getUrl() + ", user=" + this.getUser() + ", language=" + this.getLanguage() + ", text=" + this.getText() + ")";
   }

   public MessageEntity(@NonNull String type, @NonNull Integer offset, @NonNull Integer length) {
      if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else if (offset == null) {
         throw new NullPointerException("offset is marked non-null but is null");
      } else if (length == null) {
         throw new NullPointerException("length is marked non-null but is null");
      } else {
         this.type = type;
         this.offset = offset;
         this.length = length;
      }
   }

   public MessageEntity() {
   }

   public MessageEntity(@NonNull String type, @NonNull Integer offset, @NonNull Integer length, String url, User user, String language, String text) {
      if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else if (offset == null) {
         throw new NullPointerException("offset is marked non-null but is null");
      } else if (length == null) {
         throw new NullPointerException("length is marked non-null but is null");
      } else {
         this.type = type;
         this.offset = offset;
         this.length = length;
         this.url = url;
         this.user = user;
         this.language = language;
         this.text = text;
      }
   }

   public static class MessageEntityBuilder {
      private String type;
      private Integer offset;
      private Integer length;
      private String url;
      private User user;
      private String language;
      private String text;

      MessageEntityBuilder() {
      }

      @JsonProperty("type")
      public MessageEntity.MessageEntityBuilder type(@NonNull String type) {
         if (type == null) {
            throw new NullPointerException("type is marked non-null but is null");
         } else {
            this.type = type;
            return this;
         }
      }

      @JsonProperty("offset")
      public MessageEntity.MessageEntityBuilder offset(@NonNull Integer offset) {
         if (offset == null) {
            throw new NullPointerException("offset is marked non-null but is null");
         } else {
            this.offset = offset;
            return this;
         }
      }

      @JsonProperty("length")
      public MessageEntity.MessageEntityBuilder length(@NonNull Integer length) {
         if (length == null) {
            throw new NullPointerException("length is marked non-null but is null");
         } else {
            this.length = length;
            return this;
         }
      }

      @JsonProperty("url")
      public MessageEntity.MessageEntityBuilder url(String url) {
         this.url = url;
         return this;
      }

      @JsonProperty("user")
      public MessageEntity.MessageEntityBuilder user(User user) {
         this.user = user;
         return this;
      }

      @JsonProperty("language")
      public MessageEntity.MessageEntityBuilder language(String language) {
         this.language = language;
         return this;
      }

      @JsonIgnore
      public MessageEntity.MessageEntityBuilder text(String text) {
         this.text = text;
         return this;
      }

      public MessageEntity build() {
         return new MessageEntity(this.type, this.offset, this.length, this.url, this.user, this.language, this.text);
      }

      public String toString() {
         return "MessageEntity.MessageEntityBuilder(type=" + this.type + ", offset=" + this.offset + ", length=" + this.length + ", url=" + this.url + ", user=" + this.user + ", language=" + this.language + ", text=" + this.text + ")";
      }
   }
}
