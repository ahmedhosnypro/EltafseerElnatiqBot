package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.UserProfilePhotos;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class GetUserProfilePhotos extends BotApiMethod<UserProfilePhotos> {
   public static final String PATH = "getuserprofilephotos";
   private static final String USERID_FIELD = "user_id";
   private static final String OFFSET_FIELD = "offset";
   private static final String LIMIT_FIELD = "limit";
   @JsonProperty("user_id")
   @NonNull
   private Long userId;
   @JsonProperty("offset")
   private Integer offset;
   @JsonProperty("limit")
   private Integer limit;

   public String getMethod() {
      return "getuserprofilephotos";
   }

   public UserProfilePhotos deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<UserProfilePhotos> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<UserProfilePhotos>>() {
         });
         if (result.getOk()) {
            return (UserProfilePhotos)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error getting user profile photos", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.userId == null) {
         throw new TelegramApiValidationException("UserId parameter can't be empty", this);
      }
   }

   public static GetUserProfilePhotos.GetUserProfilePhotosBuilder builder() {
      return new GetUserProfilePhotos.GetUserProfilePhotosBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetUserProfilePhotos)) {
         return false;
      } else {
         GetUserProfilePhotos other = (GetUserProfilePhotos)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$userId = this.getUserId();
               Object other$userId = other.getUserId();
               if (this$userId == null) {
                  if (other$userId == null) {
                     break label47;
                  }
               } else if (this$userId.equals(other$userId)) {
                  break label47;
               }

               return false;
            }

            Object this$offset = this.getOffset();
            Object other$offset = other.getOffset();
            if (this$offset == null) {
               if (other$offset != null) {
                  return false;
               }
            } else if (!this$offset.equals(other$offset)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetUserProfilePhotos;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $userId = this.getUserId();
      int result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $offset = this.getOffset();
      result = result * 59 + ($offset == null ? 43 : $offset.hashCode());
      Object $limit = this.getLimit();
      result = result * 59 + ($limit == null ? 43 : $limit.hashCode());
      return result;
   }

   @NonNull
   public Long getUserId() {
      return this.userId;
   }

   public Integer getOffset() {
      return this.offset;
   }

   public Integer getLimit() {
      return this.limit;
   }

   @JsonProperty("user_id")
   public void setUserId(@NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
      }
   }

   @JsonProperty("offset")
   public void setOffset(Integer offset) {
      this.offset = offset;
   }

   @JsonProperty("limit")
   public void setLimit(Integer limit) {
      this.limit = limit;
   }

   public String toString() {
      return "GetUserProfilePhotos(userId=" + this.getUserId() + ", offset=" + this.getOffset() + ", limit=" + this.getLimit() + ")";
   }

   public GetUserProfilePhotos() {
   }

   public GetUserProfilePhotos(@NonNull Long userId) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
      }
   }

   public GetUserProfilePhotos(@NonNull Long userId, Integer offset, Integer limit) {
      if (userId == null) {
         throw new NullPointerException("userId is marked non-null but is null");
      } else {
         this.userId = userId;
         this.offset = offset;
         this.limit = limit;
      }
   }

   public static class GetUserProfilePhotosBuilder {
      private Long userId;
      private Integer offset;
      private Integer limit;

      GetUserProfilePhotosBuilder() {
      }

      @JsonProperty("user_id")
      public GetUserProfilePhotos.GetUserProfilePhotosBuilder userId(@NonNull Long userId) {
         if (userId == null) {
            throw new NullPointerException("userId is marked non-null but is null");
         } else {
            this.userId = userId;
            return this;
         }
      }

      @JsonProperty("offset")
      public GetUserProfilePhotos.GetUserProfilePhotosBuilder offset(Integer offset) {
         this.offset = offset;
         return this;
      }

      @JsonProperty("limit")
      public GetUserProfilePhotos.GetUserProfilePhotosBuilder limit(Integer limit) {
         this.limit = limit;
         return this;
      }

      public GetUserProfilePhotos build() {
         return new GetUserProfilePhotos(this.userId, this.offset, this.limit);
      }

      public String toString() {
         return "GetUserProfilePhotos.GetUserProfilePhotosBuilder(userId=" + this.userId + ", offset=" + this.offset + ", limit=" + this.limit + ")";
      }
   }
}
