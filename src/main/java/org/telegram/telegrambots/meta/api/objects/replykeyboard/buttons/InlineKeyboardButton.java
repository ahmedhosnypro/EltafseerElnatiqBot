package org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.api.objects.LoginUrl;
import org.telegram.telegrambots.meta.api.objects.games.CallbackGame;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class InlineKeyboardButton implements Validable, BotApiObject {
   private static final String TEXT_FIELD = "text";
   private static final String URL_FIELD = "url";
   private static final String CALLBACK_DATA_FIELD = "callback_data";
   private static final String CALLBACK_GAME_FIELD = "callback_game";
   private static final String SWITCH_INLINE_QUERY_FIELD = "switch_inline_query";
   private static final String SWITCH_INLINE_QUERY_CURRENT_CHAT_FIELD = "switch_inline_query_current_chat";
   private static final String PAY_FIELD = "pay";
   private static final String LOGIN_URL_FIELD = "login_url";
   @JsonProperty("text")
   @NonNull
   private String text;
   @JsonProperty("url")
   private String url;
   @JsonProperty("callback_data")
   private String callbackData;
   @JsonProperty("callback_game")
   private CallbackGame callbackGame;
   @JsonProperty("switch_inline_query")
   private String switchInlineQuery;
   @JsonProperty("switch_inline_query_current_chat")
   private String switchInlineQueryCurrentChat;
   @JsonProperty("pay")
   private Boolean pay;
   @JsonProperty("login_url")
   private LoginUrl loginUrl;

   public void validate() throws TelegramApiValidationException {
      if (this.text != null && !this.text.isEmpty()) {
         if (this.loginUrl != null) {
            this.loginUrl.validate();
         }

      } else {
         throw new TelegramApiValidationException("Text parameter can't be empty", this);
      }
   }

   public static InlineKeyboardButton.InlineKeyboardButtonBuilder builder() {
      return new InlineKeyboardButton.InlineKeyboardButtonBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineKeyboardButton)) {
         return false;
      } else {
         InlineKeyboardButton other = (InlineKeyboardButton)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label107: {
               Object this$pay = this.getPay();
               Object other$pay = other.getPay();
               if (this$pay == null) {
                  if (other$pay == null) {
                     break label107;
                  }
               } else if (this$pay.equals(other$pay)) {
                  break label107;
               }

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

            Object this$url = this.getUrl();
            Object other$url = other.getUrl();
            if (this$url == null) {
               if (other$url != null) {
                  return false;
               }
            } else if (!this$url.equals(other$url)) {
               return false;
            }

            label86: {
               Object this$callbackData = this.getCallbackData();
               Object other$callbackData = other.getCallbackData();
               if (this$callbackData == null) {
                  if (other$callbackData == null) {
                     break label86;
                  }
               } else if (this$callbackData.equals(other$callbackData)) {
                  break label86;
               }

               return false;
            }

            label79: {
               Object this$callbackGame = this.getCallbackGame();
               Object other$callbackGame = other.getCallbackGame();
               if (this$callbackGame == null) {
                  if (other$callbackGame == null) {
                     break label79;
                  }
               } else if (this$callbackGame.equals(other$callbackGame)) {
                  break label79;
               }

               return false;
            }

            label72: {
               Object this$switchInlineQuery = this.getSwitchInlineQuery();
               Object other$switchInlineQuery = other.getSwitchInlineQuery();
               if (this$switchInlineQuery == null) {
                  if (other$switchInlineQuery == null) {
                     break label72;
                  }
               } else if (this$switchInlineQuery.equals(other$switchInlineQuery)) {
                  break label72;
               }

               return false;
            }

            Object this$switchInlineQueryCurrentChat = this.getSwitchInlineQueryCurrentChat();
            Object other$switchInlineQueryCurrentChat = other.getSwitchInlineQueryCurrentChat();
            if (this$switchInlineQueryCurrentChat == null) {
               if (other$switchInlineQueryCurrentChat != null) {
                  return false;
               }
            } else if (!this$switchInlineQueryCurrentChat.equals(other$switchInlineQueryCurrentChat)) {
               return false;
            }

            Object this$loginUrl = this.getLoginUrl();
            Object other$loginUrl = other.getLoginUrl();
            if (this$loginUrl == null) {
               if (other$loginUrl != null) {
                  return false;
               }
            } else if (!this$loginUrl.equals(other$loginUrl)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InlineKeyboardButton;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $pay = this.getPay();
      int result = result * 59 + ($pay == null ? 43 : $pay.hashCode());
      Object $text = this.getText();
      result = result * 59 + ($text == null ? 43 : $text.hashCode());
      Object $url = this.getUrl();
      result = result * 59 + ($url == null ? 43 : $url.hashCode());
      Object $callbackData = this.getCallbackData();
      result = result * 59 + ($callbackData == null ? 43 : $callbackData.hashCode());
      Object $callbackGame = this.getCallbackGame();
      result = result * 59 + ($callbackGame == null ? 43 : $callbackGame.hashCode());
      Object $switchInlineQuery = this.getSwitchInlineQuery();
      result = result * 59 + ($switchInlineQuery == null ? 43 : $switchInlineQuery.hashCode());
      Object $switchInlineQueryCurrentChat = this.getSwitchInlineQueryCurrentChat();
      result = result * 59 + ($switchInlineQueryCurrentChat == null ? 43 : $switchInlineQueryCurrentChat.hashCode());
      Object $loginUrl = this.getLoginUrl();
      result = result * 59 + ($loginUrl == null ? 43 : $loginUrl.hashCode());
      return result;
   }

   @NonNull
   public String getText() {
      return this.text;
   }

   public String getUrl() {
      return this.url;
   }

   public String getCallbackData() {
      return this.callbackData;
   }

   public CallbackGame getCallbackGame() {
      return this.callbackGame;
   }

   public String getSwitchInlineQuery() {
      return this.switchInlineQuery;
   }

   public String getSwitchInlineQueryCurrentChat() {
      return this.switchInlineQueryCurrentChat;
   }

   public Boolean getPay() {
      return this.pay;
   }

   public LoginUrl getLoginUrl() {
      return this.loginUrl;
   }

   @JsonProperty("text")
   public void setText(@NonNull String text) {
      if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.text = text;
      }
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("callback_data")
   public void setCallbackData(String callbackData) {
      this.callbackData = callbackData;
   }

   @JsonProperty("callback_game")
   public void setCallbackGame(CallbackGame callbackGame) {
      this.callbackGame = callbackGame;
   }

   @JsonProperty("switch_inline_query")
   public void setSwitchInlineQuery(String switchInlineQuery) {
      this.switchInlineQuery = switchInlineQuery;
   }

   @JsonProperty("switch_inline_query_current_chat")
   public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
      this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
   }

   @JsonProperty("pay")
   public void setPay(Boolean pay) {
      this.pay = pay;
   }

   @JsonProperty("login_url")
   public void setLoginUrl(LoginUrl loginUrl) {
      this.loginUrl = loginUrl;
   }

   public String toString() {
      return "InlineKeyboardButton(text=" + this.getText() + ", url=" + this.getUrl() + ", callbackData=" + this.getCallbackData() + ", callbackGame=" + this.getCallbackGame() + ", switchInlineQuery=" + this.getSwitchInlineQuery() + ", switchInlineQueryCurrentChat=" + this.getSwitchInlineQueryCurrentChat() + ", pay=" + this.getPay() + ", loginUrl=" + this.getLoginUrl() + ")";
   }

   public InlineKeyboardButton() {
   }

   public InlineKeyboardButton(@NonNull String text) {
      if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.text = text;
      }
   }

   public InlineKeyboardButton(@NonNull String text, String url, String callbackData, CallbackGame callbackGame, String switchInlineQuery, String switchInlineQueryCurrentChat, Boolean pay, LoginUrl loginUrl) {
      if (text == null) {
         throw new NullPointerException("text is marked non-null but is null");
      } else {
         this.text = text;
         this.url = url;
         this.callbackData = callbackData;
         this.callbackGame = callbackGame;
         this.switchInlineQuery = switchInlineQuery;
         this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
         this.pay = pay;
         this.loginUrl = loginUrl;
      }
   }

   public static class InlineKeyboardButtonBuilder {
      private String text;
      private String url;
      private String callbackData;
      private CallbackGame callbackGame;
      private String switchInlineQuery;
      private String switchInlineQueryCurrentChat;
      private Boolean pay;
      private LoginUrl loginUrl;

      InlineKeyboardButtonBuilder() {
      }

      @JsonProperty("text")
      public InlineKeyboardButton.InlineKeyboardButtonBuilder text(@NonNull String text) {
         if (text == null) {
            throw new NullPointerException("text is marked non-null but is null");
         } else {
            this.text = text;
            return this;
         }
      }

      @JsonProperty("url")
      public InlineKeyboardButton.InlineKeyboardButtonBuilder url(String url) {
         this.url = url;
         return this;
      }

      @JsonProperty("callback_data")
      public InlineKeyboardButton.InlineKeyboardButtonBuilder callbackData(String callbackData) {
         this.callbackData = callbackData;
         return this;
      }

      @JsonProperty("callback_game")
      public InlineKeyboardButton.InlineKeyboardButtonBuilder callbackGame(CallbackGame callbackGame) {
         this.callbackGame = callbackGame;
         return this;
      }

      @JsonProperty("switch_inline_query")
      public InlineKeyboardButton.InlineKeyboardButtonBuilder switchInlineQuery(String switchInlineQuery) {
         this.switchInlineQuery = switchInlineQuery;
         return this;
      }

      @JsonProperty("switch_inline_query_current_chat")
      public InlineKeyboardButton.InlineKeyboardButtonBuilder switchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
         this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
         return this;
      }

      @JsonProperty("pay")
      public InlineKeyboardButton.InlineKeyboardButtonBuilder pay(Boolean pay) {
         this.pay = pay;
         return this;
      }

      @JsonProperty("login_url")
      public InlineKeyboardButton.InlineKeyboardButtonBuilder loginUrl(LoginUrl loginUrl) {
         this.loginUrl = loginUrl;
         return this;
      }

      public InlineKeyboardButton build() {
         return new InlineKeyboardButton(this.text, this.url, this.callbackData, this.callbackGame, this.switchInlineQuery, this.switchInlineQueryCurrentChat, this.pay, this.loginUrl);
      }

      public String toString() {
         return "InlineKeyboardButton.InlineKeyboardButtonBuilder(text=" + this.text + ", url=" + this.url + ", callbackData=" + this.callbackData + ", callbackGame=" + this.callbackGame + ", switchInlineQuery=" + this.switchInlineQuery + ", switchInlineQueryCurrentChat=" + this.switchInlineQueryCurrentChat + ", pay=" + this.pay + ", loginUrl=" + this.loginUrl + ")";
      }
   }
}
