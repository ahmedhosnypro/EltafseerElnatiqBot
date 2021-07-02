package org.telegram.telegrambots.meta.api.objects.inlinequery;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.Location;
import org.telegram.telegrambots.meta.api.objects.User;

public class ChosenInlineQuery implements BotApiObject {
   private static final String RESULTID_FIELD = "result_id";
   private static final String FROM_FIELD = "from";
   private static final String LOCATION_FIELD = "location";
   private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
   private static final String QUERY_FIELD = "query";
   @JsonProperty("result_id")
   @NonNull
   private String resultId;
   @JsonProperty("from")
   @NonNull
   private User from;
   @JsonProperty("location")
   private Location location;
   @JsonProperty("inline_message_id")
   private String inlineMessageId;
   @JsonProperty("query")
   @NonNull
   private String query;

   public static ChosenInlineQuery.ChosenInlineQueryBuilder builder() {
      return new ChosenInlineQuery.ChosenInlineQueryBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ChosenInlineQuery)) {
         return false;
      } else {
         ChosenInlineQuery other = (ChosenInlineQuery)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label71: {
               Object this$resultId = this.getResultId();
               Object other$resultId = other.getResultId();
               if (this$resultId == null) {
                  if (other$resultId == null) {
                     break label71;
                  }
               } else if (this$resultId.equals(other$resultId)) {
                  break label71;
               }

               return false;
            }

            Object this$from = this.getFrom();
            Object other$from = other.getFrom();
            if (this$from == null) {
               if (other$from != null) {
                  return false;
               }
            } else if (!this$from.equals(other$from)) {
               return false;
            }

            label57: {
               Object this$location = this.getLocation();
               Object other$location = other.getLocation();
               if (this$location == null) {
                  if (other$location == null) {
                     break label57;
                  }
               } else if (this$location.equals(other$location)) {
                  break label57;
               }

               return false;
            }

            Object this$inlineMessageId = this.getInlineMessageId();
            Object other$inlineMessageId = other.getInlineMessageId();
            if (this$inlineMessageId == null) {
               if (other$inlineMessageId != null) {
                  return false;
               }
            } else if (!this$inlineMessageId.equals(other$inlineMessageId)) {
               return false;
            }

            Object this$query = this.getQuery();
            Object other$query = other.getQuery();
            if (this$query == null) {
               if (other$query == null) {
                  return true;
               }
            } else if (this$query.equals(other$query)) {
               return true;
            }

            return false;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ChosenInlineQuery;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $resultId = this.getResultId();
      int result = result * 59 + ($resultId == null ? 43 : $resultId.hashCode());
      Object $from = this.getFrom();
      result = result * 59 + ($from == null ? 43 : $from.hashCode());
      Object $location = this.getLocation();
      result = result * 59 + ($location == null ? 43 : $location.hashCode());
      Object $inlineMessageId = this.getInlineMessageId();
      result = result * 59 + ($inlineMessageId == null ? 43 : $inlineMessageId.hashCode());
      Object $query = this.getQuery();
      result = result * 59 + ($query == null ? 43 : $query.hashCode());
      return result;
   }

   @NonNull
   public String getResultId() {
      return this.resultId;
   }

   @NonNull
   public User getFrom() {
      return this.from;
   }

   public Location getLocation() {
      return this.location;
   }

   public String getInlineMessageId() {
      return this.inlineMessageId;
   }

   @NonNull
   public String getQuery() {
      return this.query;
   }

   @JsonProperty("result_id")
   public void setResultId(@NonNull String resultId) {
      if (resultId == null) {
         throw new NullPointerException("resultId is marked non-null but is null");
      } else {
         this.resultId = resultId;
      }
   }

   @JsonProperty("from")
   public void setFrom(@NonNull User from) {
      if (from == null) {
         throw new NullPointerException("from is marked non-null but is null");
      } else {
         this.from = from;
      }
   }

   @JsonProperty("location")
   public void setLocation(Location location) {
      this.location = location;
   }

   @JsonProperty("inline_message_id")
   public void setInlineMessageId(String inlineMessageId) {
      this.inlineMessageId = inlineMessageId;
   }

   @JsonProperty("query")
   public void setQuery(@NonNull String query) {
      if (query == null) {
         throw new NullPointerException("query is marked non-null but is null");
      } else {
         this.query = query;
      }
   }

   public String toString() {
      return "ChosenInlineQuery(resultId=" + this.getResultId() + ", from=" + this.getFrom() + ", location=" + this.getLocation() + ", inlineMessageId=" + this.getInlineMessageId() + ", query=" + this.getQuery() + ")";
   }

   public ChosenInlineQuery(@NonNull String resultId, @NonNull User from, @NonNull String query) {
      if (resultId == null) {
         throw new NullPointerException("resultId is marked non-null but is null");
      } else if (from == null) {
         throw new NullPointerException("from is marked non-null but is null");
      } else if (query == null) {
         throw new NullPointerException("query is marked non-null but is null");
      } else {
         this.resultId = resultId;
         this.from = from;
         this.query = query;
      }
   }

   public ChosenInlineQuery() {
   }

   public ChosenInlineQuery(@NonNull String resultId, @NonNull User from, Location location, String inlineMessageId, @NonNull String query) {
      if (resultId == null) {
         throw new NullPointerException("resultId is marked non-null but is null");
      } else if (from == null) {
         throw new NullPointerException("from is marked non-null but is null");
      } else if (query == null) {
         throw new NullPointerException("query is marked non-null but is null");
      } else {
         this.resultId = resultId;
         this.from = from;
         this.location = location;
         this.inlineMessageId = inlineMessageId;
         this.query = query;
      }
   }

   public static class ChosenInlineQueryBuilder {
      private String resultId;
      private User from;
      private Location location;
      private String inlineMessageId;
      private String query;

      ChosenInlineQueryBuilder() {
      }

      @JsonProperty("result_id")
      public ChosenInlineQuery.ChosenInlineQueryBuilder resultId(@NonNull String resultId) {
         if (resultId == null) {
            throw new NullPointerException("resultId is marked non-null but is null");
         } else {
            this.resultId = resultId;
            return this;
         }
      }

      @JsonProperty("from")
      public ChosenInlineQuery.ChosenInlineQueryBuilder from(@NonNull User from) {
         if (from == null) {
            throw new NullPointerException("from is marked non-null but is null");
         } else {
            this.from = from;
            return this;
         }
      }

      @JsonProperty("location")
      public ChosenInlineQuery.ChosenInlineQueryBuilder location(Location location) {
         this.location = location;
         return this;
      }

      @JsonProperty("inline_message_id")
      public ChosenInlineQuery.ChosenInlineQueryBuilder inlineMessageId(String inlineMessageId) {
         this.inlineMessageId = inlineMessageId;
         return this;
      }

      @JsonProperty("query")
      public ChosenInlineQuery.ChosenInlineQueryBuilder query(@NonNull String query) {
         if (query == null) {
            throw new NullPointerException("query is marked non-null but is null");
         } else {
            this.query = query;
            return this;
         }
      }

      public ChosenInlineQuery build() {
         return new ChosenInlineQuery(this.resultId, this.from, this.location, this.inlineMessageId, this.query);
      }

      public String toString() {
         return "ChosenInlineQuery.ChosenInlineQueryBuilder(resultId=" + this.resultId + ", from=" + this.from + ", location=" + this.location + ", inlineMessageId=" + this.inlineMessageId + ", query=" + this.query + ")";
      }
   }
}
