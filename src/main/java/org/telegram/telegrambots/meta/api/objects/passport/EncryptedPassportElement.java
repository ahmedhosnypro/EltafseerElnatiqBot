package org.telegram.telegrambots.meta.api.objects.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class EncryptedPassportElement implements BotApiObject {
   private static final String TYPE_FIELD = "type";
   private static final String DATA_FIELD = "data";
   private static final String PHONENUMBER_FIELD = "phone_number";
   private static final String EMAIL_FIELD = "email";
   private static final String FILES_FIELD = "files";
   private static final String FRONTSIDE_FIELD = "front_side";
   private static final String REVERSESIDE_FIELD = "reverse_side";
   private static final String SELFIE_FIELD = "selfie";
   private static final String TRANSLATION_FIELD = "translation";
   private static final String HASH_FIELD = "hash";
   @JsonProperty("type")
   private String type;
   @JsonProperty("data")
   private String data;
   @JsonProperty("phone_number")
   private String phoneNumber;
   @JsonProperty("email")
   private String email;
   @JsonProperty("files")
   private List<PassportFile> files;
   @JsonProperty("front_side")
   private PassportFile frontSide;
   @JsonProperty("reverse_side")
   private PassportFile reverseSide;
   @JsonProperty("selfie")
   private PassportFile selfie;
   @JsonProperty("translation")
   private ArrayList<PassportFile> translations;
   @JsonProperty("hash")
   private String hash;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EncryptedPassportElement)) {
         return false;
      } else {
         EncryptedPassportElement other = (EncryptedPassportElement)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            Object this$data = this.getData();
            Object other$data = other.getData();
            if (this$data == null) {
               if (other$data != null) {
                  return false;
               }
            } else if (!this$data.equals(other$data)) {
               return false;
            }

            Object this$phoneNumber = this.getPhoneNumber();
            Object other$phoneNumber = other.getPhoneNumber();
            if (this$phoneNumber == null) {
               if (other$phoneNumber != null) {
                  return false;
               }
            } else if (!this$phoneNumber.equals(other$phoneNumber)) {
               return false;
            }

            label110: {
               Object this$email = this.getEmail();
               Object other$email = other.getEmail();
               if (this$email == null) {
                  if (other$email == null) {
                     break label110;
                  }
               } else if (this$email.equals(other$email)) {
                  break label110;
               }

               return false;
            }

            label103: {
               Object this$files = this.getFiles();
               Object other$files = other.getFiles();
               if (this$files == null) {
                  if (other$files == null) {
                     break label103;
                  }
               } else if (this$files.equals(other$files)) {
                  break label103;
               }

               return false;
            }

            Object this$frontSide = this.getFrontSide();
            Object other$frontSide = other.getFrontSide();
            if (this$frontSide == null) {
               if (other$frontSide != null) {
                  return false;
               }
            } else if (!this$frontSide.equals(other$frontSide)) {
               return false;
            }

            label89: {
               Object this$reverseSide = this.getReverseSide();
               Object other$reverseSide = other.getReverseSide();
               if (this$reverseSide == null) {
                  if (other$reverseSide == null) {
                     break label89;
                  }
               } else if (this$reverseSide.equals(other$reverseSide)) {
                  break label89;
               }

               return false;
            }

            label82: {
               Object this$selfie = this.getSelfie();
               Object other$selfie = other.getSelfie();
               if (this$selfie == null) {
                  if (other$selfie == null) {
                     break label82;
                  }
               } else if (this$selfie.equals(other$selfie)) {
                  break label82;
               }

               return false;
            }

            Object this$translations = this.getTranslations();
            Object other$translations = other.getTranslations();
            if (this$translations == null) {
               if (other$translations != null) {
                  return false;
               }
            } else if (!this$translations.equals(other$translations)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof EncryptedPassportElement;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $type = this.getType();
      int result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $data = this.getData();
      result = result * 59 + ($data == null ? 43 : $data.hashCode());
      Object $phoneNumber = this.getPhoneNumber();
      result = result * 59 + ($phoneNumber == null ? 43 : $phoneNumber.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      Object $files = this.getFiles();
      result = result * 59 + ($files == null ? 43 : $files.hashCode());
      Object $frontSide = this.getFrontSide();
      result = result * 59 + ($frontSide == null ? 43 : $frontSide.hashCode());
      Object $reverseSide = this.getReverseSide();
      result = result * 59 + ($reverseSide == null ? 43 : $reverseSide.hashCode());
      Object $selfie = this.getSelfie();
      result = result * 59 + ($selfie == null ? 43 : $selfie.hashCode());
      Object $translations = this.getTranslations();
      result = result * 59 + ($translations == null ? 43 : $translations.hashCode());
      Object $hash = this.getHash();
      result = result * 59 + ($hash == null ? 43 : $hash.hashCode());
      return result;
   }

   public String getType() {
      return this.type;
   }

   public String getData() {
      return this.data;
   }

   public String getPhoneNumber() {
      return this.phoneNumber;
   }

   public String getEmail() {
      return this.email;
   }

   public List<PassportFile> getFiles() {
      return this.files;
   }

   public PassportFile getFrontSide() {
      return this.frontSide;
   }

   public PassportFile getReverseSide() {
      return this.reverseSide;
   }

   public PassportFile getSelfie() {
      return this.selfie;
   }

   public ArrayList<PassportFile> getTranslations() {
      return this.translations;
   }

   public String getHash() {
      return this.hash;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("phone_number")
   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   @JsonProperty("email")
   public void setEmail(String email) {
      this.email = email;
   }

   @JsonProperty("files")
   public void setFiles(List<PassportFile> files) {
      this.files = files;
   }

   @JsonProperty("front_side")
   public void setFrontSide(PassportFile frontSide) {
      this.frontSide = frontSide;
   }

   @JsonProperty("reverse_side")
   public void setReverseSide(PassportFile reverseSide) {
      this.reverseSide = reverseSide;
   }

   @JsonProperty("selfie")
   public void setSelfie(PassportFile selfie) {
      this.selfie = selfie;
   }

   @JsonProperty("translation")
   public void setTranslations(ArrayList<PassportFile> translations) {
      this.translations = translations;
   }

   @JsonProperty("hash")
   public void setHash(String hash) {
      this.hash = hash;
   }

   public String toString() {
      return "EncryptedPassportElement(type=" + this.getType() + ", data=" + this.getData() + ", phoneNumber=" + this.getPhoneNumber() + ", email=" + this.getEmail() + ", files=" + this.getFiles() + ", frontSide=" + this.getFrontSide() + ", reverseSide=" + this.getReverseSide() + ", selfie=" + this.getSelfie() + ", translations=" + this.getTranslations() + ", hash=" + this.getHash() + ")";
   }

   public EncryptedPassportElement() {
   }

   public EncryptedPassportElement(String type, String data, String phoneNumber, String email, List<PassportFile> files, PassportFile frontSide, PassportFile reverseSide, PassportFile selfie, ArrayList<PassportFile> translations, String hash) {
      this.type = type;
      this.data = data;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.files = files;
      this.frontSide = frontSide;
      this.reverseSide = reverseSide;
      this.selfie = selfie;
      this.translations = translations;
      this.hash = hash;
   }
}
