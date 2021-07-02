package org.telegram.telegrambots.meta.api.objects.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;

public class Game implements BotApiObject {
   private static final String TITLE_FIELD = "title";
   private static final String DESCRIPTION_FIELD = "description";
   private static final String PHOTO_FIELD = "photo";
   private static final String ANIMATION_FIELD = "animation";
   private static final String TEXT_FIELD = "text";
   private static final String TEXTENTITIES_FIELD = "text_entities";
   @JsonProperty("title")
   @NonNull
   private String title;
   @JsonProperty("description")
   @NonNull
   private String description;
   @JsonProperty("photo")
   @NonNull
   private List<PhotoSize> photo;
   @JsonProperty("text")
   private String text;
   @JsonProperty("text_entities")
   private List<MessageEntity> entities;
   @JsonProperty("animation")
   private Animation animation;

   public boolean hasEntities() {
      return this.entities != null && !this.entities.isEmpty();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Game)) {
         return false;
      } else {
         Game other = (Game)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$title = this.getTitle();
            Object other$title = other.getTitle();
            if (this$title == null) {
               if (other$title != null) {
                  return false;
               }
            } else if (!this$title.equals(other$title)) {
               return false;
            }

            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
               if (other$description != null) {
                  return false;
               }
            } else if (!this$description.equals(other$description)) {
               return false;
            }

            Object this$photo = this.getPhoto();
            Object other$photo = other.getPhoto();
            if (this$photo == null) {
               if (other$photo != null) {
                  return false;
               }
            } else if (!this$photo.equals(other$photo)) {
               return false;
            }

            label62: {
               Object this$text = this.getText();
               Object other$text = other.getText();
               if (this$text == null) {
                  if (other$text == null) {
                     break label62;
                  }
               } else if (this$text.equals(other$text)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$entities = this.getEntities();
               Object other$entities = other.getEntities();
               if (this$entities == null) {
                  if (other$entities == null) {
                     break label55;
                  }
               } else if (this$entities.equals(other$entities)) {
                  break label55;
               }

               return false;
            }

            Object this$animation = this.getAnimation();
            Object other$animation = other.getAnimation();
            if (this$animation == null) {
               if (other$animation != null) {
                  return false;
               }
            } else if (!this$animation.equals(other$animation)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Game;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $title = this.getTitle();
      int result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $photo = this.getPhoto();
      result = result * 59 + ($photo == null ? 43 : $photo.hashCode());
      Object $text = this.getText();
      result = result * 59 + ($text == null ? 43 : $text.hashCode());
      Object $entities = this.getEntities();
      result = result * 59 + ($entities == null ? 43 : $entities.hashCode());
      Object $animation = this.getAnimation();
      result = result * 59 + ($animation == null ? 43 : $animation.hashCode());
      return result;
   }

   @NonNull
   public String getTitle() {
      return this.title;
   }

   @NonNull
   public String getDescription() {
      return this.description;
   }

   @NonNull
   public List<PhotoSize> getPhoto() {
      return this.photo;
   }

   public String getText() {
      return this.text;
   }

   public List<MessageEntity> getEntities() {
      return this.entities;
   }

   public Animation getAnimation() {
      return this.animation;
   }

   @JsonProperty("title")
   public void setTitle(@NonNull String title) {
      if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else {
         this.title = title;
      }
   }

   @JsonProperty("description")
   public void setDescription(@NonNull String description) {
      if (description == null) {
         throw new NullPointerException("description is marked non-null but is null");
      } else {
         this.description = description;
      }
   }

   @JsonProperty("photo")
   public void setPhoto(@NonNull List<PhotoSize> photo) {
      if (photo == null) {
         throw new NullPointerException("photo is marked non-null but is null");
      } else {
         this.photo = photo;
      }
   }

   @JsonProperty("text")
   public void setText(String text) {
      this.text = text;
   }

   @JsonProperty("text_entities")
   public void setEntities(List<MessageEntity> entities) {
      this.entities = entities;
   }

   @JsonProperty("animation")
   public void setAnimation(Animation animation) {
      this.animation = animation;
   }

   public String toString() {
      return "Game(title=" + this.getTitle() + ", description=" + this.getDescription() + ", photo=" + this.getPhoto() + ", text=" + this.getText() + ", entities=" + this.getEntities() + ", animation=" + this.getAnimation() + ")";
   }

   public Game(@NonNull String title, @NonNull String description, @NonNull List<PhotoSize> photo) {
      if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (description == null) {
         throw new NullPointerException("description is marked non-null but is null");
      } else if (photo == null) {
         throw new NullPointerException("photo is marked non-null but is null");
      } else {
         this.title = title;
         this.description = description;
         this.photo = photo;
      }
   }

   public Game() {
   }

   public Game(@NonNull String title, @NonNull String description, @NonNull List<PhotoSize> photo, String text, List<MessageEntity> entities, Animation animation) {
      if (title == null) {
         throw new NullPointerException("title is marked non-null but is null");
      } else if (description == null) {
         throw new NullPointerException("description is marked non-null but is null");
      } else if (photo == null) {
         throw new NullPointerException("photo is marked non-null but is null");
      } else {
         this.title = title;
         this.description = description;
         this.photo = photo;
         this.text = text;
         this.entities = entities;
         this.animation = animation;
      }
   }
}
