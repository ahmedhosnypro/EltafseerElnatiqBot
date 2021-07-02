package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class LoginUrl implements Validable, BotApiObject {
   private static final String URL_FIELD = "url";
   private static final String FORWARD_TEXT_FIELD = "forward_text";
   private static final String BOT_USERNAME_FIELD = "bot_username";
   private static final String REQUEST_WRITE_ACCESS_FIELD = "request_write_access";
   @JsonProperty("url")
   @NonNull
   private String url;
   @JsonProperty("forward_text")
   private String forwardText;
   @JsonProperty("bot_username")
   private String botUsername;
   @JsonProperty("request_write_access")
   private Boolean requestWriteAccess;

   public void validate() throws TelegramApiValidationException {
      if (this.url == null || this.url.isEmpty()) {
         throw new TelegramApiValidationException("Url parameter can't be empty", this);
      }
   }

   public static LoginUrl.LoginUrlBuilder builder() {
      return new LoginUrl.LoginUrlBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof LoginUrl)) {
         return false;
      } else {
         LoginUrl other = (LoginUrl)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$requestWriteAccess = this.getRequestWriteAccess();
               Object other$requestWriteAccess = other.getRequestWriteAccess();
               if (this$requestWriteAccess == null) {
                  if (other$requestWriteAccess == null) {
                     break label59;
                  }
               } else if (this$requestWriteAccess.equals(other$requestWriteAccess)) {
                  break label59;
               }

               return false;
            }

            Object this$url = this.getUrl();
            Object other$url = other.getUrl();
            if (this$url == null) {
               if (other$url != null) {
                  return false;
               }
            } else if (!this$url.equals(other$url)) {
               return false;
            }

            Object this$forwardText = this.getForwardText();
            Object other$forwardText = other.getForwardText();
            if (this$forwardText == null) {
               if (other$forwardText != null) {
                  return false;
               }
            } else if (!this$forwardText.equals(other$forwardText)) {
               return false;
            }

            Object this$botUsername = this.getBotUsername();
            Object other$botUsername = other.getBotUsername();
            if (this$botUsername == null) {
               if (other$botUsername != null) {
                  return false;
               }
            } else if (!this$botUsername.equals(other$botUsername)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof LoginUrl;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $requestWriteAccess = this.getRequestWriteAccess();
      int result = result * 59 + ($requestWriteAccess == null ? 43 : $requestWriteAccess.hashCode());
      Object $url = this.getUrl();
      result = result * 59 + ($url == null ? 43 : $url.hashCode());
      Object $forwardText = this.getForwardText();
      result = result * 59 + ($forwardText == null ? 43 : $forwardText.hashCode());
      Object $botUsername = this.getBotUsername();
      result = result * 59 + ($botUsername == null ? 43 : $botUsername.hashCode());
      return result;
   }

   @NonNull
   public String getUrl() {
      return this.url;
   }

   public String getForwardText() {
      return this.forwardText;
   }

   public String getBotUsername() {
      return this.botUsername;
   }

   public Boolean getRequestWriteAccess() {
      return this.requestWriteAccess;
   }

   @JsonProperty("url")
   public void setUrl(@NonNull String url) {
      if (url == null) {
         throw new NullPointerException("url is marked non-null but is null");
      } else {
         this.url = url;
      }
   }

   @JsonProperty("forward_text")
   public void setForwardText(String forwardText) {
      this.forwardText = forwardText;
   }

   @JsonProperty("bot_username")
   public void setBotUsername(String botUsername) {
      this.botUsername = botUsername;
   }

   @JsonProperty("request_write_access")
   public void setRequestWriteAccess(Boolean requestWriteAccess) {
      this.requestWriteAccess = requestWriteAccess;
   }

   public String toString() {
      return "LoginUrl(url=" + this.getUrl() + ", forwardText=" + this.getForwardText() + ", botUsername=" + this.getBotUsername() + ", requestWriteAccess=" + this.getRequestWriteAccess() + ")";
   }

   public LoginUrl() {
   }

   public LoginUrl(@NonNull String url) {
      if (url == null) {
         throw new NullPointerException("url is marked non-null but is null");
      } else {
         this.url = url;
      }
   }

   public LoginUrl(@NonNull String url, String forwardText, String botUsername, Boolean requestWriteAccess) {
      if (url == null) {
         throw new NullPointerException("url is marked non-null but is null");
      } else {
         this.url = url;
         this.forwardText = forwardText;
         this.botUsername = botUsername;
         this.requestWriteAccess = requestWriteAccess;
      }
   }

   public static class LoginUrlBuilder {
      private String url;
      private String forwardText;
      private String botUsername;
      private Boolean requestWriteAccess;

      LoginUrlBuilder() {
      }

      @JsonProperty("url")
      public LoginUrl.LoginUrlBuilder url(@NonNull String url) {
         if (url == null) {
            throw new NullPointerException("url is marked non-null but is null");
         } else {
            this.url = url;
            return this;
         }
      }

      @JsonProperty("forward_text")
      public LoginUrl.LoginUrlBuilder forwardText(String forwardText) {
         this.forwardText = forwardText;
         return this;
      }

      @JsonProperty("bot_username")
      public LoginUrl.LoginUrlBuilder botUsername(String botUsername) {
         this.botUsername = botUsername;
         return this;
      }

      @JsonProperty("request_write_access")
      public LoginUrl.LoginUrlBuilder requestWriteAccess(Boolean requestWriteAccess) {
         this.requestWriteAccess = requestWriteAccess;
         return this;
      }

      public LoginUrl build() {
         return new LoginUrl(this.url, this.forwardText, this.botUsername, this.requestWriteAccess);
      }

      public String toString() {
         return "LoginUrl.LoginUrlBuilder(url=" + this.url + ", forwardText=" + this.forwardText + ", botUsername=" + this.botUsername + ", requestWriteAccess=" + this.requestWriteAccess + ")";
      }
   }
}
