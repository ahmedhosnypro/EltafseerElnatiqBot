package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class AnswerCallbackQuery extends BotApiMethod<Boolean> {
   public static final String PATH = "answercallbackquery";
   private static final String CALLBACKQUERYID_FIELD = "callback_query_id";
   private static final String TEXT_FIELD = "text";
   private static final String SHOWALERT_FIELD = "show_alert";
   private static final String URL_FIELD = "url";
   private static final String CACHETIME_FIELD = "cache_time";
   @JsonProperty("callback_query_id")
   @NonNull
   private String callbackQueryId;
   @JsonProperty("text")
   private String text;
   @JsonProperty("show_alert")
   private Boolean showAlert;
   @JsonProperty("url")
   private String url;
   @JsonProperty("cache_time")
   private Integer cacheTime;

   public String getMethod() {
      return "answercallbackquery";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error answering callback query", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.callbackQueryId == null) {
         throw new TelegramApiValidationException("CallbackQueryId can't be null", this);
      }
   }

   public static AnswerCallbackQuery.AnswerCallbackQueryBuilder builder() {
      return new AnswerCallbackQuery.AnswerCallbackQueryBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AnswerCallbackQuery)) {
         return false;
      } else {
         AnswerCallbackQuery other = (AnswerCallbackQuery)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label71: {
               Object this$showAlert = this.getShowAlert();
               Object other$showAlert = other.getShowAlert();
               if (this$showAlert == null) {
                  if (other$showAlert == null) {
                     break label71;
                  }
               } else if (this$showAlert.equals(other$showAlert)) {
                  break label71;
               }

               return false;
            }

            Object this$cacheTime = this.getCacheTime();
            Object other$cacheTime = other.getCacheTime();
            if (this$cacheTime == null) {
               if (other$cacheTime != null) {
                  return false;
               }
            } else if (!this$cacheTime.equals(other$cacheTime)) {
               return false;
            }

            label57: {
               Object this$callbackQueryId = this.getCallbackQueryId();
               Object other$callbackQueryId = other.getCallbackQueryId();
               if (this$callbackQueryId == null) {
                  if (other$callbackQueryId == null) {
                     break label57;
                  }
               } else if (this$callbackQueryId.equals(other$callbackQueryId)) {
                  break label57;
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
               if (other$url == null) {
                  return true;
               }
            } else if (this$url.equals(other$url)) {
               return true;
            }

            return false;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof AnswerCallbackQuery;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $showAlert = this.getShowAlert();
      int result = result * 59 + ($showAlert == null ? 43 : $showAlert.hashCode());
      Object $cacheTime = this.getCacheTime();
      result = result * 59 + ($cacheTime == null ? 43 : $cacheTime.hashCode());
      Object $callbackQueryId = this.getCallbackQueryId();
      result = result * 59 + ($callbackQueryId == null ? 43 : $callbackQueryId.hashCode());
      Object $text = this.getText();
      result = result * 59 + ($text == null ? 43 : $text.hashCode());
      Object $url = this.getUrl();
      result = result * 59 + ($url == null ? 43 : $url.hashCode());
      return result;
   }

   @NonNull
   public String getCallbackQueryId() {
      return this.callbackQueryId;
   }

   public String getText() {
      return this.text;
   }

   public Boolean getShowAlert() {
      return this.showAlert;
   }

   public String getUrl() {
      return this.url;
   }

   public Integer getCacheTime() {
      return this.cacheTime;
   }

   @JsonProperty("callback_query_id")
   public void setCallbackQueryId(@NonNull String callbackQueryId) {
      if (callbackQueryId == null) {
         throw new NullPointerException("callbackQueryId is marked non-null but is null");
      } else {
         this.callbackQueryId = callbackQueryId;
      }
   }

   @JsonProperty("text")
   public void setText(String text) {
      this.text = text;
   }

   @JsonProperty("show_alert")
   public void setShowAlert(Boolean showAlert) {
      this.showAlert = showAlert;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("cache_time")
   public void setCacheTime(Integer cacheTime) {
      this.cacheTime = cacheTime;
   }

   public String toString() {
      return "AnswerCallbackQuery(callbackQueryId=" + this.getCallbackQueryId() + ", text=" + this.getText() + ", showAlert=" + this.getShowAlert() + ", url=" + this.getUrl() + ", cacheTime=" + this.getCacheTime() + ")";
   }

   public AnswerCallbackQuery() {
   }

   public AnswerCallbackQuery(@NonNull String callbackQueryId) {
      if (callbackQueryId == null) {
         throw new NullPointerException("callbackQueryId is marked non-null but is null");
      } else {
         this.callbackQueryId = callbackQueryId;
      }
   }

   public AnswerCallbackQuery(@NonNull String callbackQueryId, String text, Boolean showAlert, String url, Integer cacheTime) {
      if (callbackQueryId == null) {
         throw new NullPointerException("callbackQueryId is marked non-null but is null");
      } else {
         this.callbackQueryId = callbackQueryId;
         this.text = text;
         this.showAlert = showAlert;
         this.url = url;
         this.cacheTime = cacheTime;
      }
   }

   public static class AnswerCallbackQueryBuilder {
      private String callbackQueryId;
      private String text;
      private Boolean showAlert;
      private String url;
      private Integer cacheTime;

      AnswerCallbackQueryBuilder() {
      }

      @JsonProperty("callback_query_id")
      public AnswerCallbackQuery.AnswerCallbackQueryBuilder callbackQueryId(@NonNull String callbackQueryId) {
         if (callbackQueryId == null) {
            throw new NullPointerException("callbackQueryId is marked non-null but is null");
         } else {
            this.callbackQueryId = callbackQueryId;
            return this;
         }
      }

      @JsonProperty("text")
      public AnswerCallbackQuery.AnswerCallbackQueryBuilder text(String text) {
         this.text = text;
         return this;
      }

      @JsonProperty("show_alert")
      public AnswerCallbackQuery.AnswerCallbackQueryBuilder showAlert(Boolean showAlert) {
         this.showAlert = showAlert;
         return this;
      }

      @JsonProperty("url")
      public AnswerCallbackQuery.AnswerCallbackQueryBuilder url(String url) {
         this.url = url;
         return this;
      }

      @JsonProperty("cache_time")
      public AnswerCallbackQuery.AnswerCallbackQueryBuilder cacheTime(Integer cacheTime) {
         this.cacheTime = cacheTime;
         return this;
      }

      public AnswerCallbackQuery build() {
         return new AnswerCallbackQuery(this.callbackQueryId, this.text, this.showAlert, this.url, this.cacheTime);
      }

      public String toString() {
         return "AnswerCallbackQuery.AnswerCallbackQueryBuilder(callbackQueryId=" + this.callbackQueryId + ", text=" + this.text + ", showAlert=" + this.showAlert + ", url=" + this.url + ", cacheTime=" + this.cacheTime + ")";
      }
   }
}
