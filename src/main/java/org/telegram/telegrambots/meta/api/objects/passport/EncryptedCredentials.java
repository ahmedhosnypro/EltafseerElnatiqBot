package org.telegram.telegrambots.meta.api.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class EncryptedCredentials implements BotApiObject {
   private static final String DATA_FIELD = "data";
   private static final String HASH_FIELD = "hash";
   private static final String SECRET_FIELD = "secret";
   @JsonProperty("data")
   private String data;
   @JsonProperty("hash")
   private String hash;
   @JsonProperty("secret")
   private String secret;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EncryptedCredentials)) {
         return false;
      } else {
         EncryptedCredentials other = (EncryptedCredentials)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$data = this.getData();
               Object other$data = other.getData();
               if (this$data == null) {
                  if (other$data == null) {
                     break label47;
                  }
               } else if (this$data.equals(other$data)) {
                  break label47;
               }

               return false;
            }

            Object this$hash = this.getHash();
            Object other$hash = other.getHash();
            if (this$hash == null) {
               if (other$hash != null) {
                  return false;
               }
            } else if (!this$hash.equals(other$hash)) {
               return false;
            }

            Object this$secret = this.getSecret();
            Object other$secret = other.getSecret();
            if (this$secret == null) {
               if (other$secret != null) {
                  return false;
               }
            } else if (!this$secret.equals(other$secret)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof EncryptedCredentials;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $data = this.getData();
      int result = result * 59 + ($data == null ? 43 : $data.hashCode());
      Object $hash = this.getHash();
      result = result * 59 + ($hash == null ? 43 : $hash.hashCode());
      Object $secret = this.getSecret();
      result = result * 59 + ($secret == null ? 43 : $secret.hashCode());
      return result;
   }

   public String getData() {
      return this.data;
   }

   public String getHash() {
      return this.hash;
   }

   public String getSecret() {
      return this.secret;
   }

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("hash")
   public void setHash(String hash) {
      this.hash = hash;
   }

   @JsonProperty("secret")
   public void setSecret(String secret) {
      this.secret = secret;
   }

   public String toString() {
      return "EncryptedCredentials(data=" + this.getData() + ", hash=" + this.getHash() + ", secret=" + this.getSecret() + ")";
   }

   public EncryptedCredentials() {
   }

   public EncryptedCredentials(String data, String hash, String secret) {
      this.data = data;
      this.hash = hash;
      this.secret = secret;
   }
}
