package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class WebhookInfo implements BotApiObject {
   private static final String URL_FIELD = "url";
   private static final String HASCUSTOMCERTIFICATE_FIELD = "has_custom_certificate";
   private static final String PENDINGUPDATECOUNT_FIELD = "pending_update_count";
   private static final String MAXCONNECTIONS_FIELD = "max_connections";
   private static final String ALLOWEDUPDATES_FIELD = "allowed_updates";
   private static final String LASTERRORDATE_FIELD = "last_error_date";
   private static final String LASTERRORMESSAGE_FIELD = "last_error_message";
   private static final String IPADDRESS_FIELD = "ip_address";
   @JsonProperty("url")
   private String url;
   @JsonProperty("has_custom_certificate")
   private Boolean hasCustomCertificate;
   @JsonProperty("pending_update_count")
   private Integer pendingUpdatesCount;
   @JsonProperty("last_error_date")
   private Integer lastErrorDate;
   @JsonProperty("last_error_message")
   private String lastErrorMessage;
   @JsonProperty("max_connections")
   private Integer maxConnections;
   @JsonProperty("allowed_updates")
   private List<String> allowedUpdates;
   @JsonProperty("ip_address")
   private String ipAddress;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof WebhookInfo)) {
         return false;
      } else {
         WebhookInfo other = (WebhookInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label107: {
               Object this$hasCustomCertificate = this.getHasCustomCertificate();
               Object other$hasCustomCertificate = other.getHasCustomCertificate();
               if (this$hasCustomCertificate == null) {
                  if (other$hasCustomCertificate == null) {
                     break label107;
                  }
               } else if (this$hasCustomCertificate.equals(other$hasCustomCertificate)) {
                  break label107;
               }

               return false;
            }

            Object this$pendingUpdatesCount = this.getPendingUpdatesCount();
            Object other$pendingUpdatesCount = other.getPendingUpdatesCount();
            if (this$pendingUpdatesCount == null) {
               if (other$pendingUpdatesCount != null) {
                  return false;
               }
            } else if (!this$pendingUpdatesCount.equals(other$pendingUpdatesCount)) {
               return false;
            }

            Object this$lastErrorDate = this.getLastErrorDate();
            Object other$lastErrorDate = other.getLastErrorDate();
            if (this$lastErrorDate == null) {
               if (other$lastErrorDate != null) {
                  return false;
               }
            } else if (!this$lastErrorDate.equals(other$lastErrorDate)) {
               return false;
            }

            label86: {
               Object this$maxConnections = this.getMaxConnections();
               Object other$maxConnections = other.getMaxConnections();
               if (this$maxConnections == null) {
                  if (other$maxConnections == null) {
                     break label86;
                  }
               } else if (this$maxConnections.equals(other$maxConnections)) {
                  break label86;
               }

               return false;
            }

            label79: {
               Object this$url = this.getUrl();
               Object other$url = other.getUrl();
               if (this$url == null) {
                  if (other$url == null) {
                     break label79;
                  }
               } else if (this$url.equals(other$url)) {
                  break label79;
               }

               return false;
            }

            label72: {
               Object this$lastErrorMessage = this.getLastErrorMessage();
               Object other$lastErrorMessage = other.getLastErrorMessage();
               if (this$lastErrorMessage == null) {
                  if (other$lastErrorMessage == null) {
                     break label72;
                  }
               } else if (this$lastErrorMessage.equals(other$lastErrorMessage)) {
                  break label72;
               }

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

            Object this$ipAddress = this.getIpAddress();
            Object other$ipAddress = other.getIpAddress();
            if (this$ipAddress == null) {
               if (other$ipAddress != null) {
                  return false;
               }
            } else if (!this$ipAddress.equals(other$ipAddress)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof WebhookInfo;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $hasCustomCertificate = this.getHasCustomCertificate();
      int result = result * 59 + ($hasCustomCertificate == null ? 43 : $hasCustomCertificate.hashCode());
      Object $pendingUpdatesCount = this.getPendingUpdatesCount();
      result = result * 59 + ($pendingUpdatesCount == null ? 43 : $pendingUpdatesCount.hashCode());
      Object $lastErrorDate = this.getLastErrorDate();
      result = result * 59 + ($lastErrorDate == null ? 43 : $lastErrorDate.hashCode());
      Object $maxConnections = this.getMaxConnections();
      result = result * 59 + ($maxConnections == null ? 43 : $maxConnections.hashCode());
      Object $url = this.getUrl();
      result = result * 59 + ($url == null ? 43 : $url.hashCode());
      Object $lastErrorMessage = this.getLastErrorMessage();
      result = result * 59 + ($lastErrorMessage == null ? 43 : $lastErrorMessage.hashCode());
      Object $allowedUpdates = this.getAllowedUpdates();
      result = result * 59 + ($allowedUpdates == null ? 43 : $allowedUpdates.hashCode());
      Object $ipAddress = this.getIpAddress();
      result = result * 59 + ($ipAddress == null ? 43 : $ipAddress.hashCode());
      return result;
   }

   public String getUrl() {
      return this.url;
   }

   public Boolean getHasCustomCertificate() {
      return this.hasCustomCertificate;
   }

   public Integer getPendingUpdatesCount() {
      return this.pendingUpdatesCount;
   }

   public Integer getLastErrorDate() {
      return this.lastErrorDate;
   }

   public String getLastErrorMessage() {
      return this.lastErrorMessage;
   }

   public Integer getMaxConnections() {
      return this.maxConnections;
   }

   public List<String> getAllowedUpdates() {
      return this.allowedUpdates;
   }

   public String getIpAddress() {
      return this.ipAddress;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("has_custom_certificate")
   public void setHasCustomCertificate(Boolean hasCustomCertificate) {
      this.hasCustomCertificate = hasCustomCertificate;
   }

   @JsonProperty("pending_update_count")
   public void setPendingUpdatesCount(Integer pendingUpdatesCount) {
      this.pendingUpdatesCount = pendingUpdatesCount;
   }

   @JsonProperty("last_error_date")
   public void setLastErrorDate(Integer lastErrorDate) {
      this.lastErrorDate = lastErrorDate;
   }

   @JsonProperty("last_error_message")
   public void setLastErrorMessage(String lastErrorMessage) {
      this.lastErrorMessage = lastErrorMessage;
   }

   @JsonProperty("max_connections")
   public void setMaxConnections(Integer maxConnections) {
      this.maxConnections = maxConnections;
   }

   @JsonProperty("allowed_updates")
   public void setAllowedUpdates(List<String> allowedUpdates) {
      this.allowedUpdates = allowedUpdates;
   }

   @JsonProperty("ip_address")
   public void setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
   }

   public String toString() {
      return "WebhookInfo(url=" + this.getUrl() + ", hasCustomCertificate=" + this.getHasCustomCertificate() + ", pendingUpdatesCount=" + this.getPendingUpdatesCount() + ", lastErrorDate=" + this.getLastErrorDate() + ", lastErrorMessage=" + this.getLastErrorMessage() + ", maxConnections=" + this.getMaxConnections() + ", allowedUpdates=" + this.getAllowedUpdates() + ", ipAddress=" + this.getIpAddress() + ")";
   }

   public WebhookInfo() {
   }

   public WebhookInfo(String url, Boolean hasCustomCertificate, Integer pendingUpdatesCount, Integer lastErrorDate, String lastErrorMessage, Integer maxConnections, List<String> allowedUpdates, String ipAddress) {
      this.url = url;
      this.hasCustomCertificate = hasCustomCertificate;
      this.pendingUpdatesCount = pendingUpdatesCount;
      this.lastErrorDate = lastErrorDate;
      this.lastErrorMessage = lastErrorMessage;
      this.maxConnections = maxConnections;
      this.allowedUpdates = allowedUpdates;
      this.ipAddress = ipAddress;
   }
}
