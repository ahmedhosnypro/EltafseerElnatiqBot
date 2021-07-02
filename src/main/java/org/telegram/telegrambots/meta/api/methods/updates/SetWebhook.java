package org.telegram.telegrambots.meta.api.methods.updates;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetWebhook extends BotApiMethod<Boolean> {
   public static final String PATH = "setWebhook";
   public static final String URL_FIELD = "url";
   public static final String CERTIFICATE_FIELD = "certificate";
   public static final String MAXCONNECTIONS_FIELD = "max_connections";
   public static final String ALLOWEDUPDATES_FIELD = "allowed_updates";
   public static final String IPADDRESS_FIELD = "ip_address";
   public static final String DROPPENDINGUPDATES_FIELD = "drop_pending_updates";
   @JsonProperty("url")
   @NonNull
   private String url;
   @JsonProperty("certificate")
   private InputFile certificate;
   @JsonProperty("max_connections")
   private Integer maxConnections;
   @JsonProperty("allowed_updates")
   private List<String> allowedUpdates;
   @JsonProperty("ip_address")
   private String ipAddress;
   @JsonProperty("drop_pending_updates")
   private Boolean dropPendingUpdates;

   public String getMethod() {
      return "setWebhook";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error setting webhook", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.url != null && !this.url.isEmpty()) {
         if (this.certificate != null && !this.certificate.isNew()) {
            throw new TelegramApiValidationException("Certificate parameter must be a new file to upload", this);
         }
      } else {
         throw new TelegramApiValidationException("URL parameter can't be empty", this);
      }
   }

   public static SetWebhook.SetWebhookBuilder builder() {
      return new SetWebhook.SetWebhookBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetWebhook)) {
         return false;
      } else {
         SetWebhook other = (SetWebhook)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$maxConnections = this.getMaxConnections();
            Object other$maxConnections = other.getMaxConnections();
            if (this$maxConnections == null) {
               if (other$maxConnections != null) {
                  return false;
               }
            } else if (!this$maxConnections.equals(other$maxConnections)) {
               return false;
            }

            Object this$dropPendingUpdates = this.getDropPendingUpdates();
            Object other$dropPendingUpdates = other.getDropPendingUpdates();
            if (this$dropPendingUpdates == null) {
               if (other$dropPendingUpdates != null) {
                  return false;
               }
            } else if (!this$dropPendingUpdates.equals(other$dropPendingUpdates)) {
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

            label62: {
               Object this$certificate = this.getCertificate();
               Object other$certificate = other.getCertificate();
               if (this$certificate == null) {
                  if (other$certificate == null) {
                     break label62;
                  }
               } else if (this$certificate.equals(other$certificate)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$allowedUpdates = this.getAllowedUpdates();
               Object other$allowedUpdates = other.getAllowedUpdates();
               if (this$allowedUpdates == null) {
                  if (other$allowedUpdates == null) {
                     break label55;
                  }
               } else if (this$allowedUpdates.equals(other$allowedUpdates)) {
                  break label55;
               }

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
      return other instanceof SetWebhook;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $maxConnections = this.getMaxConnections();
      int result = result * 59 + ($maxConnections == null ? 43 : $maxConnections.hashCode());
      Object $dropPendingUpdates = this.getDropPendingUpdates();
      result = result * 59 + ($dropPendingUpdates == null ? 43 : $dropPendingUpdates.hashCode());
      Object $url = this.getUrl();
      result = result * 59 + ($url == null ? 43 : $url.hashCode());
      Object $certificate = this.getCertificate();
      result = result * 59 + ($certificate == null ? 43 : $certificate.hashCode());
      Object $allowedUpdates = this.getAllowedUpdates();
      result = result * 59 + ($allowedUpdates == null ? 43 : $allowedUpdates.hashCode());
      Object $ipAddress = this.getIpAddress();
      result = result * 59 + ($ipAddress == null ? 43 : $ipAddress.hashCode());
      return result;
   }

   @NonNull
   public String getUrl() {
      return this.url;
   }

   public InputFile getCertificate() {
      return this.certificate;
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

   public Boolean getDropPendingUpdates() {
      return this.dropPendingUpdates;
   }

   @JsonProperty("url")
   public void setUrl(@NonNull String url) {
      if (url == null) {
         throw new NullPointerException("url is marked non-null but is null");
      } else {
         this.url = url;
      }
   }

   @JsonProperty("certificate")
   public void setCertificate(InputFile certificate) {
      this.certificate = certificate;
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

   @JsonProperty("drop_pending_updates")
   public void setDropPendingUpdates(Boolean dropPendingUpdates) {
      this.dropPendingUpdates = dropPendingUpdates;
   }

   public String toString() {
      return "SetWebhook(url=" + this.getUrl() + ", certificate=" + this.getCertificate() + ", maxConnections=" + this.getMaxConnections() + ", allowedUpdates=" + this.getAllowedUpdates() + ", ipAddress=" + this.getIpAddress() + ", dropPendingUpdates=" + this.getDropPendingUpdates() + ")";
   }

   public SetWebhook(@NonNull String url) {
      if (url == null) {
         throw new NullPointerException("url is marked non-null but is null");
      } else {
         this.url = url;
      }
   }

   public SetWebhook() {
   }

   public SetWebhook(@NonNull String url, InputFile certificate, Integer maxConnections, List<String> allowedUpdates, String ipAddress, Boolean dropPendingUpdates) {
      if (url == null) {
         throw new NullPointerException("url is marked non-null but is null");
      } else {
         this.url = url;
         this.certificate = certificate;
         this.maxConnections = maxConnections;
         this.allowedUpdates = allowedUpdates;
         this.ipAddress = ipAddress;
         this.dropPendingUpdates = dropPendingUpdates;
      }
   }

   public static class SetWebhookBuilder {
      private String url;
      private InputFile certificate;
      private Integer maxConnections;
      private ArrayList<String> allowedUpdates;
      private String ipAddress;
      private Boolean dropPendingUpdates;

      SetWebhookBuilder() {
      }

      @JsonProperty("url")
      public SetWebhook.SetWebhookBuilder url(@NonNull String url) {
         if (url == null) {
            throw new NullPointerException("url is marked non-null but is null");
         } else {
            this.url = url;
            return this;
         }
      }

      @JsonProperty("certificate")
      public SetWebhook.SetWebhookBuilder certificate(InputFile certificate) {
         this.certificate = certificate;
         return this;
      }

      @JsonProperty("max_connections")
      public SetWebhook.SetWebhookBuilder maxConnections(Integer maxConnections) {
         this.maxConnections = maxConnections;
         return this;
      }

      public SetWebhook.SetWebhookBuilder allowedUpdate(String allowedUpdate) {
         if (this.allowedUpdates == null) {
            this.allowedUpdates = new ArrayList();
         }

         this.allowedUpdates.add(allowedUpdate);
         return this;
      }

      @JsonProperty("allowed_updates")
      public SetWebhook.SetWebhookBuilder allowedUpdates(Collection<? extends String> allowedUpdates) {
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

      public SetWebhook.SetWebhookBuilder clearAllowedUpdates() {
         if (this.allowedUpdates != null) {
            this.allowedUpdates.clear();
         }

         return this;
      }

      @JsonProperty("ip_address")
      public SetWebhook.SetWebhookBuilder ipAddress(String ipAddress) {
         this.ipAddress = ipAddress;
         return this;
      }

      @JsonProperty("drop_pending_updates")
      public SetWebhook.SetWebhookBuilder dropPendingUpdates(Boolean dropPendingUpdates) {
         this.dropPendingUpdates = dropPendingUpdates;
         return this;
      }

      public SetWebhook build() {
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

         return new SetWebhook(this.url, this.certificate, this.maxConnections, allowedUpdates, this.ipAddress, this.dropPendingUpdates);
      }

      public String toString() {
         return "SetWebhook.SetWebhookBuilder(url=" + this.url + ", certificate=" + this.certificate + ", maxConnections=" + this.maxConnections + ", allowedUpdates=" + this.allowedUpdates + ", ipAddress=" + this.ipAddress + ", dropPendingUpdates=" + this.dropPendingUpdates + ")";
      }
   }
}
