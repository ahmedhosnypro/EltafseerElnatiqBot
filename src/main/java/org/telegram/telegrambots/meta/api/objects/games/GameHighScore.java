package org.telegram.telegrambots.meta.api.objects.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.User;

public class GameHighScore implements BotApiObject {
   private static final String POSITION_FIELD = "position";
   private static final String USER_FIELD = "user";
   private static final String SCORE_FIELD = "score";
   @JsonProperty("position")
   @NonNull
   private Integer position;
   @JsonProperty("user")
   @NonNull
   private User user;
   @JsonProperty("score")
   @NonNull
   private Integer score;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GameHighScore)) {
         return false;
      } else {
         GameHighScore other = (GameHighScore)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$position = this.getPosition();
               Object other$position = other.getPosition();
               if (this$position == null) {
                  if (other$position == null) {
                     break label47;
                  }
               } else if (this$position.equals(other$position)) {
                  break label47;
               }

               return false;
            }

            Object this$score = this.getScore();
            Object other$score = other.getScore();
            if (this$score == null) {
               if (other$score != null) {
                  return false;
               }
            } else if (!this$score.equals(other$score)) {
               return false;
            }

            Object this$user = this.getUser();
            Object other$user = other.getUser();
            if (this$user == null) {
               if (other$user != null) {
                  return false;
               }
            } else if (!this$user.equals(other$user)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GameHighScore;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $position = this.getPosition();
      int result = result * 59 + ($position == null ? 43 : $position.hashCode());
      Object $score = this.getScore();
      result = result * 59 + ($score == null ? 43 : $score.hashCode());
      Object $user = this.getUser();
      result = result * 59 + ($user == null ? 43 : $user.hashCode());
      return result;
   }

   @NonNull
   public Integer getPosition() {
      return this.position;
   }

   @NonNull
   public User getUser() {
      return this.user;
   }

   @NonNull
   public Integer getScore() {
      return this.score;
   }

   @JsonProperty("position")
   public void setPosition(@NonNull Integer position) {
      if (position == null) {
         throw new NullPointerException("position is marked non-null but is null");
      } else {
         this.position = position;
      }
   }

   @JsonProperty("user")
   public void setUser(@NonNull User user) {
      if (user == null) {
         throw new NullPointerException("user is marked non-null but is null");
      } else {
         this.user = user;
      }
   }

   @JsonProperty("score")
   public void setScore(@NonNull Integer score) {
      if (score == null) {
         throw new NullPointerException("score is marked non-null but is null");
      } else {
         this.score = score;
      }
   }

   public String toString() {
      return "GameHighScore(position=" + this.getPosition() + ", user=" + this.getUser() + ", score=" + this.getScore() + ")";
   }

   public GameHighScore() {
   }

   public GameHighScore(@NonNull Integer position, @NonNull User user, @NonNull Integer score) {
      if (position == null) {
         throw new NullPointerException("position is marked non-null but is null");
      } else if (user == null) {
         throw new NullPointerException("user is marked non-null but is null");
      } else if (score == null) {
         throw new NullPointerException("score is marked non-null but is null");
      } else {
         this.position = position;
         this.user = user;
         this.score = score;
      }
   }
}
