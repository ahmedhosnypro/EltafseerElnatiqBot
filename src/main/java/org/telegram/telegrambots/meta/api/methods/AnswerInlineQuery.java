package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class AnswerInlineQuery extends BotApiMethod<Boolean> {
   public static final String PATH = "answerInlineQuery";
   private static final String INLINEQUERYID_FIELD = "inline_query_id";
   private static final String RESULTS_FIELD = "results";
   private static final String CACHETIME_FIELD = "cache_time";
   private static final String ISPERSONAL_FIELD = "is_personal";
   private static final String NEXTOFFSET_FIELD = "next_offset";
   private static final String SWITCH_PM_TEXT_FIELD = "switch_pm_text";
   private static final String SWITCH_PM_PARAMETER_FIELD = "switch_pm_parameter";
   @JsonProperty("inline_query_id")
   @NonNull
   private String inlineQueryId;
   @JsonProperty("results")
   @NonNull
   private List<InlineQueryResult> results;
   @JsonProperty("cache_time")
   private Integer cacheTime;
   @JsonProperty("is_personal")
   private Boolean isPersonal;
   @JsonProperty("next_offset")
   private String nextOffset;
   @JsonProperty("switch_pm_text")
   private String switchPmText;
   @JsonProperty("switch_pm_parameter")
   private String switchPmParameter;

   public void validate() throws TelegramApiValidationException {
      if (this.inlineQueryId != null && !this.inlineQueryId.isEmpty()) {
         if (this.results == null) {
            throw new TelegramApiValidationException("Results array can't be null", this);
         } else {
            if (this.switchPmText != null) {
               if (this.switchPmText.isEmpty()) {
                  throw new TelegramApiValidationException("SwitchPmText can't be empty", this);
               }

               if (this.switchPmParameter == null || this.switchPmParameter.isEmpty()) {
                  throw new TelegramApiValidationException("SwitchPmParameter can't be empty if switchPmText is present", this);
               }

               if (this.switchPmParameter.length() > 64) {
                  throw new TelegramApiValidationException("SwitchPmParameter can't be longer than 64 chars", this);
               }

               if (!Pattern.matches("[A-Za-z0-9_\\-]+", this.switchPmParameter.trim())) {
                  throw new TelegramApiValidationException("SwitchPmParameter only allows A-Z, a-z, 0-9, _ and - characters", this);
               }
            }

            Iterator var1 = this.results.iterator();

            while(var1.hasNext()) {
               InlineQueryResult result = (InlineQueryResult)var1.next();
               result.validate();
            }

         }
      } else {
         throw new TelegramApiValidationException("InlineQueryId can't be empty", this);
      }
   }

   public String getMethod() {
      return "answerInlineQuery";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error answering inline query", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public static AnswerInlineQuery.AnswerInlineQueryBuilder builder() {
      return new AnswerInlineQuery.AnswerInlineQueryBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AnswerInlineQuery)) {
         return false;
      } else {
         AnswerInlineQuery other = (AnswerInlineQuery)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label95: {
               Object this$cacheTime = this.getCacheTime();
               Object other$cacheTime = other.getCacheTime();
               if (this$cacheTime == null) {
                  if (other$cacheTime == null) {
                     break label95;
                  }
               } else if (this$cacheTime.equals(other$cacheTime)) {
                  break label95;
               }

               return false;
            }

            Object this$isPersonal = this.getIsPersonal();
            Object other$isPersonal = other.getIsPersonal();
            if (this$isPersonal == null) {
               if (other$isPersonal != null) {
                  return false;
               }
            } else if (!this$isPersonal.equals(other$isPersonal)) {
               return false;
            }

            Object this$inlineQueryId = this.getInlineQueryId();
            Object other$inlineQueryId = other.getInlineQueryId();
            if (this$inlineQueryId == null) {
               if (other$inlineQueryId != null) {
                  return false;
               }
            } else if (!this$inlineQueryId.equals(other$inlineQueryId)) {
               return false;
            }

            label74: {
               Object this$results = this.getResults();
               Object other$results = other.getResults();
               if (this$results == null) {
                  if (other$results == null) {
                     break label74;
                  }
               } else if (this$results.equals(other$results)) {
                  break label74;
               }

               return false;
            }

            label67: {
               Object this$nextOffset = this.getNextOffset();
               Object other$nextOffset = other.getNextOffset();
               if (this$nextOffset == null) {
                  if (other$nextOffset == null) {
                     break label67;
                  }
               } else if (this$nextOffset.equals(other$nextOffset)) {
                  break label67;
               }

               return false;
            }

            Object this$switchPmText = this.getSwitchPmText();
            Object other$switchPmText = other.getSwitchPmText();
            if (this$switchPmText == null) {
               if (other$switchPmText != null) {
                  return false;
               }
            } else if (!this$switchPmText.equals(other$switchPmText)) {
               return false;
            }

            Object this$switchPmParameter = this.getSwitchPmParameter();
            Object other$switchPmParameter = other.getSwitchPmParameter();
            if (this$switchPmParameter == null) {
               if (other$switchPmParameter != null) {
                  return false;
               }
            } else if (!this$switchPmParameter.equals(other$switchPmParameter)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof AnswerInlineQuery;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $cacheTime = this.getCacheTime();
      int result = result * 59 + ($cacheTime == null ? 43 : $cacheTime.hashCode());
      Object $isPersonal = this.getIsPersonal();
      result = result * 59 + ($isPersonal == null ? 43 : $isPersonal.hashCode());
      Object $inlineQueryId = this.getInlineQueryId();
      result = result * 59 + ($inlineQueryId == null ? 43 : $inlineQueryId.hashCode());
      Object $results = this.getResults();
      result = result * 59 + ($results == null ? 43 : $results.hashCode());
      Object $nextOffset = this.getNextOffset();
      result = result * 59 + ($nextOffset == null ? 43 : $nextOffset.hashCode());
      Object $switchPmText = this.getSwitchPmText();
      result = result * 59 + ($switchPmText == null ? 43 : $switchPmText.hashCode());
      Object $switchPmParameter = this.getSwitchPmParameter();
      result = result * 59 + ($switchPmParameter == null ? 43 : $switchPmParameter.hashCode());
      return result;
   }

   @NonNull
   public String getInlineQueryId() {
      return this.inlineQueryId;
   }

   @NonNull
   public List<InlineQueryResult> getResults() {
      return this.results;
   }

   public Integer getCacheTime() {
      return this.cacheTime;
   }

   public Boolean getIsPersonal() {
      return this.isPersonal;
   }

   public String getNextOffset() {
      return this.nextOffset;
   }

   public String getSwitchPmText() {
      return this.switchPmText;
   }

   public String getSwitchPmParameter() {
      return this.switchPmParameter;
   }

   @JsonProperty("inline_query_id")
   public void setInlineQueryId(@NonNull String inlineQueryId) {
      if (inlineQueryId == null) {
         throw new NullPointerException("inlineQueryId is marked non-null but is null");
      } else {
         this.inlineQueryId = inlineQueryId;
      }
   }

   @JsonProperty("results")
   public void setResults(@NonNull List<InlineQueryResult> results) {
      if (results == null) {
         throw new NullPointerException("results is marked non-null but is null");
      } else {
         this.results = results;
      }
   }

   @JsonProperty("cache_time")
   public void setCacheTime(Integer cacheTime) {
      this.cacheTime = cacheTime;
   }

   @JsonProperty("is_personal")
   public void setIsPersonal(Boolean isPersonal) {
      this.isPersonal = isPersonal;
   }

   @JsonProperty("next_offset")
   public void setNextOffset(String nextOffset) {
      this.nextOffset = nextOffset;
   }

   @JsonProperty("switch_pm_text")
   public void setSwitchPmText(String switchPmText) {
      this.switchPmText = switchPmText;
   }

   @JsonProperty("switch_pm_parameter")
   public void setSwitchPmParameter(String switchPmParameter) {
      this.switchPmParameter = switchPmParameter;
   }

   public String toString() {
      return "AnswerInlineQuery(inlineQueryId=" + this.getInlineQueryId() + ", results=" + this.getResults() + ", cacheTime=" + this.getCacheTime() + ", isPersonal=" + this.getIsPersonal() + ", nextOffset=" + this.getNextOffset() + ", switchPmText=" + this.getSwitchPmText() + ", switchPmParameter=" + this.getSwitchPmParameter() + ")";
   }

   public AnswerInlineQuery() {
   }

   public AnswerInlineQuery(@NonNull String inlineQueryId, @NonNull List<InlineQueryResult> results) {
      if (inlineQueryId == null) {
         throw new NullPointerException("inlineQueryId is marked non-null but is null");
      } else if (results == null) {
         throw new NullPointerException("results is marked non-null but is null");
      } else {
         this.inlineQueryId = inlineQueryId;
         this.results = results;
      }
   }

   public AnswerInlineQuery(@NonNull String inlineQueryId, @NonNull List<InlineQueryResult> results, Integer cacheTime, Boolean isPersonal, String nextOffset, String switchPmText, String switchPmParameter) {
      if (inlineQueryId == null) {
         throw new NullPointerException("inlineQueryId is marked non-null but is null");
      } else if (results == null) {
         throw new NullPointerException("results is marked non-null but is null");
      } else {
         this.inlineQueryId = inlineQueryId;
         this.results = results;
         this.cacheTime = cacheTime;
         this.isPersonal = isPersonal;
         this.nextOffset = nextOffset;
         this.switchPmText = switchPmText;
         this.switchPmParameter = switchPmParameter;
      }
   }

   public static class AnswerInlineQueryBuilder {
      private String inlineQueryId;
      private ArrayList<InlineQueryResult> results;
      private Integer cacheTime;
      private Boolean isPersonal;
      private String nextOffset;
      private String switchPmText;
      private String switchPmParameter;

      AnswerInlineQueryBuilder() {
      }

      @JsonProperty("inline_query_id")
      public AnswerInlineQuery.AnswerInlineQueryBuilder inlineQueryId(@NonNull String inlineQueryId) {
         if (inlineQueryId == null) {
            throw new NullPointerException("inlineQueryId is marked non-null but is null");
         } else {
            this.inlineQueryId = inlineQueryId;
            return this;
         }
      }

      public AnswerInlineQuery.AnswerInlineQueryBuilder result(InlineQueryResult result) {
         if (this.results == null) {
            this.results = new ArrayList();
         }

         this.results.add(result);
         return this;
      }

      @JsonProperty("results")
      public AnswerInlineQuery.AnswerInlineQueryBuilder results(Collection<? extends InlineQueryResult> results) {
         if (results == null) {
            throw new NullPointerException("results cannot be null");
         } else {
            if (this.results == null) {
               this.results = new ArrayList();
            }

            this.results.addAll(results);
            return this;
         }
      }

      public AnswerInlineQuery.AnswerInlineQueryBuilder clearResults() {
         if (this.results != null) {
            this.results.clear();
         }

         return this;
      }

      @JsonProperty("cache_time")
      public AnswerInlineQuery.AnswerInlineQueryBuilder cacheTime(Integer cacheTime) {
         this.cacheTime = cacheTime;
         return this;
      }

      @JsonProperty("is_personal")
      public AnswerInlineQuery.AnswerInlineQueryBuilder isPersonal(Boolean isPersonal) {
         this.isPersonal = isPersonal;
         return this;
      }

      @JsonProperty("next_offset")
      public AnswerInlineQuery.AnswerInlineQueryBuilder nextOffset(String nextOffset) {
         this.nextOffset = nextOffset;
         return this;
      }

      @JsonProperty("switch_pm_text")
      public AnswerInlineQuery.AnswerInlineQueryBuilder switchPmText(String switchPmText) {
         this.switchPmText = switchPmText;
         return this;
      }

      @JsonProperty("switch_pm_parameter")
      public AnswerInlineQuery.AnswerInlineQueryBuilder switchPmParameter(String switchPmParameter) {
         this.switchPmParameter = switchPmParameter;
         return this;
      }

      public AnswerInlineQuery build() {
         List results;
         switch(this.results == null ? 0 : this.results.size()) {
         case 0:
            results = Collections.emptyList();
            break;
         case 1:
            results = Collections.singletonList((InlineQueryResult)this.results.get(0));
            break;
         default:
            results = Collections.unmodifiableList(new ArrayList(this.results));
         }

         return new AnswerInlineQuery(this.inlineQueryId, results, this.cacheTime, this.isPersonal, this.nextOffset, this.switchPmText, this.switchPmParameter);
      }

      public String toString() {
         return "AnswerInlineQuery.AnswerInlineQueryBuilder(inlineQueryId=" + this.inlineQueryId + ", results=" + this.results + ", cacheTime=" + this.cacheTime + ", isPersonal=" + this.isPersonal + ", nextOffset=" + this.nextOffset + ", switchPmText=" + this.switchPmText + ", switchPmParameter=" + this.switchPmParameter + ")";
      }
   }
}
