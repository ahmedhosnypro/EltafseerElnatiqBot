package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class ChatPhoto implements BotApiObject {
   private static final String SMALLFILEID_FIELD = "small_file_id";
   private static final String SMALLFILEUNIQUEID_FIELD = "small_file_unique_id";
   private static final String BIGFILEID_FIELD = "big_file_id";
   private static final String BIGFILEUNIQUEID_FIELD = "big_file_unique_id";
   @JsonProperty("small_file_id")
   private String smallFileId;
   @JsonProperty("small_file_unique_id")
   private String smallFileUniqueId;
   @JsonProperty("big_file_id")
   private String bigFileId;
   @JsonProperty("big_file_unique_id")
   private String bigFileUniqueId;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ChatPhoto)) {
         return false;
      } else {
         ChatPhoto other = (ChatPhoto)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$smallFileId = this.getSmallFileId();
               Object other$smallFileId = other.getSmallFileId();
               if (this$smallFileId == null) {
                  if (other$smallFileId == null) {
                     break label59;
                  }
               } else if (this$smallFileId.equals(other$smallFileId)) {
                  break label59;
               }

               return false;
            }

            Object this$smallFileUniqueId = this.getSmallFileUniqueId();
            Object other$smallFileUniqueId = other.getSmallFileUniqueId();
            if (this$smallFileUniqueId == null) {
               if (other$smallFileUniqueId != null) {
                  return false;
               }
            } else if (!this$smallFileUniqueId.equals(other$smallFileUniqueId)) {
               return false;
            }

            Object this$bigFileId = this.getBigFileId();
            Object other$bigFileId = other.getBigFileId();
            if (this$bigFileId == null) {
               if (other$bigFileId != null) {
                  return false;
               }
            } else if (!this$bigFileId.equals(other$bigFileId)) {
               return false;
            }

            Object this$bigFileUniqueId = this.getBigFileUniqueId();
            Object other$bigFileUniqueId = other.getBigFileUniqueId();
            if (this$bigFileUniqueId == null) {
               if (other$bigFileUniqueId != null) {
                  return false;
               }
            } else if (!this$bigFileUniqueId.equals(other$bigFileUniqueId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ChatPhoto;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $smallFileId = this.getSmallFileId();
      int result = result * 59 + ($smallFileId == null ? 43 : $smallFileId.hashCode());
      Object $smallFileUniqueId = this.getSmallFileUniqueId();
      result = result * 59 + ($smallFileUniqueId == null ? 43 : $smallFileUniqueId.hashCode());
      Object $bigFileId = this.getBigFileId();
      result = result * 59 + ($bigFileId == null ? 43 : $bigFileId.hashCode());
      Object $bigFileUniqueId = this.getBigFileUniqueId();
      result = result * 59 + ($bigFileUniqueId == null ? 43 : $bigFileUniqueId.hashCode());
      return result;
   }

   public String getSmallFileId() {
      return this.smallFileId;
   }

   public String getSmallFileUniqueId() {
      return this.smallFileUniqueId;
   }

   public String getBigFileId() {
      return this.bigFileId;
   }

   public String getBigFileUniqueId() {
      return this.bigFileUniqueId;
   }

   @JsonProperty("small_file_id")
   public void setSmallFileId(String smallFileId) {
      this.smallFileId = smallFileId;
   }

   @JsonProperty("small_file_unique_id")
   public void setSmallFileUniqueId(String smallFileUniqueId) {
      this.smallFileUniqueId = smallFileUniqueId;
   }

   @JsonProperty("big_file_id")
   public void setBigFileId(String bigFileId) {
      this.bigFileId = bigFileId;
   }

   @JsonProperty("big_file_unique_id")
   public void setBigFileUniqueId(String bigFileUniqueId) {
      this.bigFileUniqueId = bigFileUniqueId;
   }

   public String toString() {
      return "ChatPhoto(smallFileId=" + this.getSmallFileId() + ", smallFileUniqueId=" + this.getSmallFileUniqueId() + ", bigFileId=" + this.getBigFileId() + ", bigFileUniqueId=" + this.getBigFileUniqueId() + ")";
   }

   public ChatPhoto() {
   }

   public ChatPhoto(String smallFileId, String smallFileUniqueId, String bigFileId, String bigFileUniqueId) {
      this.smallFileId = smallFileId;
      this.smallFileUniqueId = smallFileUniqueId;
      this.bigFileId = bigFileId;
      this.bigFileUniqueId = bigFileUniqueId;
   }
}
