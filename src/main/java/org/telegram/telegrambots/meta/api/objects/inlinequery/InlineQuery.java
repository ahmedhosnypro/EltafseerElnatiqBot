package org.telegram.telegrambots.meta.api.objects.inlinequery;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.Location;
import org.telegram.telegrambots.meta.api.objects.User;

public class InlineQuery implements BotApiObject {
   private static final String ID_FIELD = "id";
   private static final String FROM_FIELD = "from";
   private static final String LOCATION_FIELD = "location";
   private static final String QUERY_FIELD = "query";
   private static final String OFFSET_FIELD = "offset";
   private static final String CHATTYPE_FIELD = "chat_type";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("from")
   @NonNull
   private User from;
   @JsonProperty("location")
   private Location location;
   @JsonProperty("query")
   @NonNull
   private String query;
   @JsonProperty("offset")
   @NonNull
   private String offset;
   @JsonProperty("chat_type")
   private String chatType;

   public static InlineQuery.InlineQueryBuilder builder() {
      return new InlineQuery.InlineQueryBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQuery)) {
         return false;
      } else {
         InlineQuery other = (InlineQuery)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
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

            Object this$location = this.getLocation();
            Object other$location = other.getLocation();
            if (this$location == null) {
               if (other$location != null) {
                  return false;
               }
            } else if (!this$location.equals(other$location)) {
               return false;
            }

            label62: {
               Object this$query = this.getQuery();
               Object other$query = other.getQuery();
               if (this$query == null) {
                  if (other$query == null) {
                     break label62;
                  }
               } else if (this$query.equals(other$query)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$offset = this.getOffset();
               Object other$offset = other.getOffset();
               if (this$offset == null) {
                  if (other$offset == null) {
                     break label55;
                  }
               } else if (this$offset.equals(other$offset)) {
                  break label55;
               }

               return false;
            }

            Object this$chatType = this.getChatType();
            Object other$chatType = other.getChatType();
            if (this$chatType == null) {
               if (other$chatType != null) {
                  return false;
               }
            } else if (!this$chatType.equals(other$chatType)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InlineQuery;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      int result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $from = this.getFrom();
      result = result * 59 + ($from == null ? 43 : $from.hashCode());
      Object $location = this.getLocation();
      result = result * 59 + ($location == null ? 43 : $location.hashCode());
      Object $query = this.getQuery();
      result = result * 59 + ($query == null ? 43 : $query.hashCode());
      Object $offset = this.getOffset();
      result = result * 59 + ($offset == null ? 43 : $offset.hashCode());
      Object $chatType = this.getChatType();
      result = result * 59 + ($chatType == null ? 43 : $chatType.hashCode());
      return result;
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public User getFrom() {
      return this.from;
   }

   public Location getLocation() {
      return this.location;
   }

   @NonNull
   public String getQuery() {
      return this.query;
   }

   @NonNull
   public String getOffset() {
      return this.offset;
   }

   public String getChatType() {
      return this.chatType;
   }

   @JsonProperty("id")
   public void setId(@NonNull String id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
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

   @JsonProperty("query")
   public void setQuery(@NonNull String query) {
      if (query == null) {
         throw new NullPointerException("query is marked non-null but is null");
      } else {
         this.query = query;
      }
   }

   @JsonProperty("offset")
   public void setOffset(@NonNull String offset) {
      if (offset == null) {
         throw new NullPointerException("offset is marked non-null but is null");
      } else {
         this.offset = offset;
      }
   }

   @JsonProperty("chat_type")
   public void setChatType(String chatType) {
      this.chatType = chatType;
   }

   public String toString() {
      return "InlineQuery(id=" + this.getId() + ", from=" + this.getFrom() + ", location=" + this.getLocation() + ", query=" + this.getQuery() + ", offset=" + this.getOffset() + ", chatType=" + this.getChatType() + ")";
   }

   public InlineQuery(@NonNull String id, @NonNull User from, @NonNull String query, @NonNull String offset) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (from == null) {
         throw new NullPointerException("from is marked non-null but is null");
      } else if (query == null) {
         throw new NullPointerException("query is marked non-null but is null");
      } else if (offset == null) {
         throw new NullPointerException("offset is marked non-null but is null");
      } else {
         this.id = id;
         this.from = from;
         this.query = query;
         this.offset = offset;
      }
   }

   public InlineQuery() {
   }

   public InlineQuery(@NonNull String id, @NonNull User from, Location location, @NonNull String query, @NonNull String offset, String chatType) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (from == null) {
         throw new NullPointerException("from is marked non-null but is null");
      } else if (query == null) {
         throw new NullPointerException("query is marked non-null but is null");
      } else if (offset == null) {
         throw new NullPointerException("offset is marked non-null but is null");
      } else {
         this.id = id;
         this.from = from;
         this.location = location;
         this.query = query;
         this.offset = offset;
         this.chatType = chatType;
      }
   }

   public static class InlineQueryBuilder {
      private String id;
      private User from;
      private Location location;
      private String query;
      private String offset;
      private String chatType;

      InlineQueryBuilder() {
      }

      @JsonProperty("id")
      public InlineQuery.InlineQueryBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("from")
      public InlineQuery.InlineQueryBuilder from(@NonNull User from) {
         if (from == null) {
            throw new NullPointerException("from is marked non-null but is null");
         } else {
            this.from = from;
            return this;
         }
      }

      @JsonProperty("location")
      public InlineQuery.InlineQueryBuilder location(Location location) {
         this.location = location;
         return this;
      }

      @JsonProperty("query")
      public InlineQuery.InlineQueryBuilder query(@NonNull String query) {
         if (query == null) {
            throw new NullPointerException("query is marked non-null but is null");
         } else {
            this.query = query;
            return this;
         }
      }

      @JsonProperty("offset")
      public InlineQuery.InlineQueryBuilder offset(@NonNull String offset) {
         if (offset == null) {
            throw new NullPointerException("offset is marked non-null but is null");
         } else {
            this.offset = offset;
            return this;
         }
      }

      @JsonProperty("chat_type")
      public InlineQuery.InlineQueryBuilder chatType(String chatType) {
         this.chatType = chatType;
         return this;
      }

      public InlineQuery build() {
         return new InlineQuery(this.id, this.from, this.location, this.query, this.offset, this.chatType);
      }

      public String toString() {
         return "InlineQuery.InlineQueryBuilder(id=" + this.id + ", from=" + this.from + ", location=" + this.location + ", query=" + this.query + ", offset=" + this.offset + ", chatType=" + this.chatType + ")";
      }
   }
}
