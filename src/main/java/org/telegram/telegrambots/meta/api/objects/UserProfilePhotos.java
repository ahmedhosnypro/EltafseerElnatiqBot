package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class UserProfilePhotos implements BotApiObject {
   private static final String TOTALCOUNT_FIELD = "total_count";
   private static final String PHOTOS_FIELD = "photos";
   @JsonProperty("total_count")
   private Integer totalCount;
   @JsonProperty("photos")
   private List<List<PhotoSize>> photos;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UserProfilePhotos)) {
         return false;
      } else {
         UserProfilePhotos other = (UserProfilePhotos)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$totalCount = this.getTotalCount();
            Object other$totalCount = other.getTotalCount();
            if (this$totalCount == null) {
               if (other$totalCount != null) {
                  return false;
               }
            } else if (!this$totalCount.equals(other$totalCount)) {
               return false;
            }

            Object this$photos = this.getPhotos();
            Object other$photos = other.getPhotos();
            if (this$photos == null) {
               if (other$photos != null) {
                  return false;
               }
            } else if (!this$photos.equals(other$photos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UserProfilePhotos;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $totalCount = this.getTotalCount();
      int result = result * 59 + ($totalCount == null ? 43 : $totalCount.hashCode());
      Object $photos = this.getPhotos();
      result = result * 59 + ($photos == null ? 43 : $photos.hashCode());
      return result;
   }

   public Integer getTotalCount() {
      return this.totalCount;
   }

   public List<List<PhotoSize>> getPhotos() {
      return this.photos;
   }

   @JsonProperty("total_count")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("photos")
   public void setPhotos(List<List<PhotoSize>> photos) {
      this.photos = photos;
   }

   public String toString() {
      return "UserProfilePhotos(totalCount=" + this.getTotalCount() + ", photos=" + this.getPhotos() + ")";
   }

   public UserProfilePhotos() {
   }

   public UserProfilePhotos(Integer totalCount, List<List<PhotoSize>> photos) {
      this.totalCount = totalCount;
      this.photos = photos;
   }
}
