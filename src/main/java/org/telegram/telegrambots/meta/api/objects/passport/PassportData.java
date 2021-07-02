package org.telegram.telegrambots.meta.api.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class PassportData implements BotApiObject {
   private static final String DATA_FIELD = "data";
   private static final String CREDENTIALS_FIELD = "credentials";
   @JsonProperty("data")
   private List<EncryptedPassportElement> data;
   @JsonProperty("credentials")
   private EncryptedCredentials credentials;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PassportData)) {
         return false;
      } else {
         PassportData other = (PassportData)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$data = this.getData();
            Object other$data = other.getData();
            if (this$data == null) {
               if (other$data != null) {
                  return false;
               }
            } else if (!this$data.equals(other$data)) {
               return false;
            }

            Object this$credentials = this.getCredentials();
            Object other$credentials = other.getCredentials();
            if (this$credentials == null) {
               if (other$credentials != null) {
                  return false;
               }
            } else if (!this$credentials.equals(other$credentials)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PassportData;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $data = this.getData();
      int result = result * 59 + ($data == null ? 43 : $data.hashCode());
      Object $credentials = this.getCredentials();
      result = result * 59 + ($credentials == null ? 43 : $credentials.hashCode());
      return result;
   }

   public List<EncryptedPassportElement> getData() {
      return this.data;
   }

   public EncryptedCredentials getCredentials() {
      return this.credentials;
   }

   @JsonProperty("data")
   public void setData(List<EncryptedPassportElement> data) {
      this.data = data;
   }

   @JsonProperty("credentials")
   public void setCredentials(EncryptedCredentials credentials) {
      this.credentials = credentials;
   }

   public String toString() {
      return "PassportData(data=" + this.getData() + ", credentials=" + this.getCredentials() + ")";
   }

   public PassportData() {
   }

   public PassportData(List<EncryptedPassportElement> data, EncryptedCredentials credentials) {
      this.data = data;
      this.credentials = credentials;
   }
}
