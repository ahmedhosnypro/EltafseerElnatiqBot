package org.telegram.telegrambots.meta.api.methods.updates;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetUpdates extends BotApiMethod<ArrayList<Update>> {
   public static final String PATH = "getupdates";
   private static final String OFFSET_FIELD = "offset";
   private static final String LIMIT_FIELD = "limit";
   private static final String TIMEOUT_FIELD = "timeout";
   private static final String ALLOWEDUPDATES_FIELD = "allowed_updates";
   @JsonProperty("offset")
   private Integer offset;
   @JsonProperty("limit")
   private Integer limit;
   @JsonProperty("timeout")
   private Integer timeout;
   @JsonProperty("allowed_updates")
   private List<String> allowedUpdates;

   public String getMethod() {
      return "getupdates";
   }

   public ArrayList<Update> deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<ArrayList<Update>> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<ArrayList<Update>>>() {
         });
         if (result.getOk()) {
            return (ArrayList)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error getting updates", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
   }

   public static GetUpdates.GetUpdatesBuilder builder() {
      return new GetUpdates.GetUpdatesBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetUpdates)) {
         return false;
      } else {
         GetUpdates other = (GetUpdates)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$offset = this.getOffset();
               Object other$offset = other.getOffset();
               if (this$offset == null) {
                  if (other$offset == null) {
                     break label59;
                  }
               } else if (this$offset.equals(other$offset)) {
                  break label59;
               }

               return false;
            }

            Object this$limit = this.getLimit();
            Object other$limit = other.getLimit();
            if (this$limit == null) {
               if (other$limit != null) {
                  return false;
               }
            } else if (!this$limit.equals(other$limit)) {
               return false;
            }

            Object this$timeout = this.getTimeout();
            Object other$timeout = other.getTimeout();
            if (this$timeout == null) {
               if (other$timeout != null) {
                  return false;
               }
            } else if (!this$timeout.equals(other$timeout)) {
               return false;
            }

            Object this$allowedUpdates = this.getAllowedUpdates();
            Object other$allowedUpdates = other.getAllowedUpdates();
            if (this$allowedUpdates == null) {
               if (other$allowedUpdates != null) {
                  return false;
               }
            } else if (!this$allowedUpdates.equals(other$allowedUpdates)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetUpdates;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $offset = this.getOffset();
      int result = result * 59 + ($offset == null ? 43 : $offset.hashCode());
      Object $limit = this.getLimit();
      result = result * 59 + ($limit == null ? 43 : $limit.hashCode());
      Object $timeout = this.getTimeout();
      result = result * 59 + ($timeout == null ? 43 : $timeout.hashCode());
      Object $allowedUpdates = this.getAllowedUpdates();
      result = result * 59 + ($allowedUpdates == null ? 43 : $allowedUpdates.hashCode());
      return result;
   }

   public Integer getOffset() {
      return this.offset;
   }

   public Integer getLimit() {
      return this.limit;
   }

   public Integer getTimeout() {
      return this.timeout;
   }

   public List<String> getAllowedUpdates() {
      return this.allowedUpdates;
   }

   @JsonProperty("offset")
   public void setOffset(Integer offset) {
      this.offset = offset;
   }

   @JsonProperty("limit")
   public void setLimit(Integer limit) {
      this.limit = limit;
   }

   @JsonProperty("timeout")
   public void setTimeout(Integer timeout) {
      this.timeout = timeout;
   }

   @JsonProperty("allowed_updates")
   public void setAllowedUpdates(List<String> allowedUpdates) {
      this.allowedUpdates = allowedUpdates;
   }

   public String toString() {
      return "GetUpdates(offset=" + this.getOffset() + ", limit=" + this.getLimit() + ", timeout=" + this.getTimeout() + ", allowedUpdates=" + this.getAllowedUpdates() + ")";
   }

   public GetUpdates() {
   }

   public GetUpdates(Integer offset, Integer limit, Integer timeout, List<String> allowedUpdates) {
      this.offset = offset;
      this.limit = limit;
      this.timeout = timeout;
      this.allowedUpdates = allowedUpdates;
   }

   public static class GetUpdatesBuilder {
      private Integer offset;
      private Integer limit;
      private Integer timeout;
      private ArrayList<String> allowedUpdates;

      GetUpdatesBuilder() {
      }

      @JsonProperty("offset")
      public GetUpdates.GetUpdatesBuilder offset(Integer offset) {
         this.offset = offset;
         return this;
      }

      @JsonProperty("limit")
      public GetUpdates.GetUpdatesBuilder limit(Integer limit) {
         this.limit = limit;
         return this;
      }

      @JsonProperty("timeout")
      public GetUpdates.GetUpdatesBuilder timeout(Integer timeout) {
         this.timeout = timeout;
         return this;
      }

      public GetUpdates.GetUpdatesBuilder allowedUpdate(String allowedUpdate) {
         if (this.allowedUpdates == null) {
            this.allowedUpdates = new ArrayList();
         }

         this.allowedUpdates.add(allowedUpdate);
         return this;
      }

      @JsonProperty("allowed_updates")
      public GetUpdates.GetUpdatesBuilder allowedUpdates(Collection<? extends String> allowedUpdates) {
         if (allowedUpdates == null) {
            throw new NullPointerException("allowedUpdates cannot be null");
         } else {
            if (this.allowedUpdates == null) {
               this.allowedUpdates = new ArrayList();
            }

            this.allowedUpdates.addAll(allowedUpdates);
            return this;
         }
      }

      public GetUpdates.GetUpdatesBuilder clearAllowedUpdates() {
         if (this.allowedUpdates != null) {
            this.allowedUpdates.clear();
         }

         return this;
      }

      public GetUpdates build() {
         List allowedUpdates;
         switch(this.allowedUpdates == null ? 0 : this.allowedUpdates.size()) {
         case 0:
            allowedUpdates = Collections.emptyList();
            break;
         case 1:
            allowedUpdates = Collections.singletonList((String)this.allowedUpdates.get(0));
            break;
         default:
            allowedUpdates = Collections.unmodifiableList(new ArrayList(this.allowedUpdates));
         }

         return new GetUpdates(this.offset, this.limit, this.timeout, allowedUpdates);
      }

      public String toString() {
         return "GetUpdates.GetUpdatesBuilder(offset=" + this.offset + ", limit=" + this.limit + ", timeout=" + this.timeout + ", allowedUpdates=" + this.allowedUpdates + ")";
      }
   }
}
