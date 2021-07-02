package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class ResponseParameters implements BotApiObject {
   private static final String MIGRATETOCHATID_FIELD = "migrate_to_chat_id";
   private static final String RETRYAFTER_FIELD = "retry_after";
   @JsonProperty("migrate_to_chat_id")
   private Long migrateToChatId;
   @JsonProperty("retry_after")
   private Integer retryAfter;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ResponseParameters)) {
         return false;
      } else {
         ResponseParameters other = (ResponseParameters)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$migrateToChatId = this.getMigrateToChatId();
            Object other$migrateToChatId = other.getMigrateToChatId();
            if (this$migrateToChatId == null) {
               if (other$migrateToChatId != null) {
                  return false;
               }
            } else if (!this$migrateToChatId.equals(other$migrateToChatId)) {
               return false;
            }

            Object this$retryAfter = this.getRetryAfter();
            Object other$retryAfter = other.getRetryAfter();
            if (this$retryAfter == null) {
               if (other$retryAfter != null) {
                  return false;
               }
            } else if (!this$retryAfter.equals(other$retryAfter)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ResponseParameters;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $migrateToChatId = this.getMigrateToChatId();
      int result = result * 59 + ($migrateToChatId == null ? 43 : $migrateToChatId.hashCode());
      Object $retryAfter = this.getRetryAfter();
      result = result * 59 + ($retryAfter == null ? 43 : $retryAfter.hashCode());
      return result;
   }

   public Long getMigrateToChatId() {
      return this.migrateToChatId;
   }

   public Integer getRetryAfter() {
      return this.retryAfter;
   }

   @JsonProperty("migrate_to_chat_id")
   public void setMigrateToChatId(Long migrateToChatId) {
      this.migrateToChatId = migrateToChatId;
   }

   @JsonProperty("retry_after")
   public void setRetryAfter(Integer retryAfter) {
      this.retryAfter = retryAfter;
   }

   public String toString() {
      return "ResponseParameters(migrateToChatId=" + this.getMigrateToChatId() + ", retryAfter=" + this.getRetryAfter() + ")";
   }

   public ResponseParameters() {
   }

   public ResponseParameters(Long migrateToChatId, Integer retryAfter) {
      this.migrateToChatId = migrateToChatId;
      this.retryAfter = retryAfter;
   }
}
