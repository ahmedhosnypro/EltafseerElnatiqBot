package org.telegram.telegrambots.meta.api.objects.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;

public class StickerSet implements BotApiObject {
   private static final String NAME_FIELD = "name";
   private static final String TITLE_FIELD = "title";
   private static final String CONTAINSMASKS_FIELD = "contains_masks";
   private static final String STICKERS_FIELD = "stickers";
   private static final String ISANIMATED_FIELD = "is_animated";
   private static final String THUMB_FIELD = "thumb";
   @JsonProperty("name")
   private String name;
   @JsonProperty("title")
   private String title;
   @JsonProperty("contains_masks")
   private Boolean containsMasks;
   @JsonProperty("stickers")
   private List<Sticker> stickers;
   @JsonProperty("is_animated")
   private Boolean isAnimated;
   @JsonProperty("thumb")
   private PhotoSize thumb;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof StickerSet)) {
         return false;
      } else {
         StickerSet other = (StickerSet)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$containsMasks = this.getContainsMasks();
            Object other$containsMasks = other.getContainsMasks();
            if (this$containsMasks == null) {
               if (other$containsMasks != null) {
                  return false;
               }
            } else if (!this$containsMasks.equals(other$containsMasks)) {
               return false;
            }

            Object this$isAnimated = this.getIsAnimated();
            Object other$isAnimated = other.getIsAnimated();
            if (this$isAnimated == null) {
               if (other$isAnimated != null) {
                  return false;
               }
            } else if (!this$isAnimated.equals(other$isAnimated)) {
               return false;
            }

            Object this$name = this.getName();
            Object other$name = other.getName();
            if (this$name == null) {
               if (other$name != null) {
                  return false;
               }
            } else if (!this$name.equals(other$name)) {
               return false;
            }

            label62: {
               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title == null) {
                     break label62;
                  }
               } else if (this$title.equals(other$title)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$stickers = this.getStickers();
               Object other$stickers = other.getStickers();
               if (this$stickers == null) {
                  if (other$stickers == null) {
                     break label55;
                  }
               } else if (this$stickers.equals(other$stickers)) {
                  break label55;
               }

               return false;
            }

            Object this$thumb = this.getThumb();
            Object other$thumb = other.getThumb();
            if (this$thumb == null) {
               if (other$thumb != null) {
                  return false;
               }
            } else if (!this$thumb.equals(other$thumb)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof StickerSet;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $containsMasks = this.getContainsMasks();
      int result = result * 59 + ($containsMasks == null ? 43 : $containsMasks.hashCode());
      Object $isAnimated = this.getIsAnimated();
      result = result * 59 + ($isAnimated == null ? 43 : $isAnimated.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $title = this.getTitle();
      result = result * 59 + ($title == null ? 43 : $title.hashCode());
      Object $stickers = this.getStickers();
      result = result * 59 + ($stickers == null ? 43 : $stickers.hashCode());
      Object $thumb = this.getThumb();
      result = result * 59 + ($thumb == null ? 43 : $thumb.hashCode());
      return result;
   }

   public String getName() {
      return this.name;
   }

   public String getTitle() {
      return this.title;
   }

   public Boolean getContainsMasks() {
      return this.containsMasks;
   }

   public List<Sticker> getStickers() {
      return this.stickers;
   }

   public Boolean getIsAnimated() {
      return this.isAnimated;
   }

   public PhotoSize getThumb() {
      return this.thumb;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("contains_masks")
   public void setContainsMasks(Boolean containsMasks) {
      this.containsMasks = containsMasks;
   }

   @JsonProperty("stickers")
   public void setStickers(List<Sticker> stickers) {
      this.stickers = stickers;
   }

   @JsonProperty("is_animated")
   public void setIsAnimated(Boolean isAnimated) {
      this.isAnimated = isAnimated;
   }

   @JsonProperty("thumb")
   public void setThumb(PhotoSize thumb) {
      this.thumb = thumb;
   }

   public String toString() {
      return "StickerSet(name=" + this.getName() + ", title=" + this.getTitle() + ", containsMasks=" + this.getContainsMasks() + ", stickers=" + this.getStickers() + ", isAnimated=" + this.getIsAnimated() + ", thumb=" + this.getThumb() + ")";
   }

   public StickerSet() {
   }

   public StickerSet(String name, String title, Boolean containsMasks, List<Sticker> stickers, Boolean isAnimated, PhotoSize thumb) {
      this.name = name;
      this.title = title;
      this.containsMasks = containsMasks;
      this.stickers = stickers;
      this.isAnimated = isAnimated;
      this.thumb = thumb;
   }
}
