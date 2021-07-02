package org.telegram.telegrambots.meta.api.objects.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonTypeInfo(
   use = Id.NONE
)
public class MaskPosition implements Validable, BotApiObject {
   private static final String POINT_FIELD = "point";
   private static final String XSHIFT_FIELD = "x_shift";
   private static final String YSHIFT_FIELD = "y_shift";
   private static final String SCALE_FIELD = "scale";
   @JsonProperty("point")
   @NonNull
   private String point;
   @JsonProperty("x_shift")
   @NonNull
   private Float xShift;
   @JsonProperty("y_shift")
   @NonNull
   private Float yShift;
   @JsonProperty("scale")
   @NonNull
   private Float scale;

   public void validate() throws TelegramApiValidationException {
      if (this.point != null && !this.point.isEmpty()) {
         if (this.xShift == null) {
            throw new TelegramApiValidationException("xShift can't be empty", this);
         } else if (this.yShift == null) {
            throw new TelegramApiValidationException("yShift can't be empty", this);
         } else if (this.scale == null) {
            throw new TelegramApiValidationException("scale can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("point can't be empty", this);
      }
   }

   public static MaskPosition.MaskPositionBuilder builder() {
      return new MaskPosition.MaskPositionBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof MaskPosition)) {
         return false;
      } else {
         MaskPosition other = (MaskPosition)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$xShift = this.getXShift();
               Object other$xShift = other.getXShift();
               if (this$xShift == null) {
                  if (other$xShift == null) {
                     break label59;
                  }
               } else if (this$xShift.equals(other$xShift)) {
                  break label59;
               }

               return false;
            }

            Object this$yShift = this.getYShift();
            Object other$yShift = other.getYShift();
            if (this$yShift == null) {
               if (other$yShift != null) {
                  return false;
               }
            } else if (!this$yShift.equals(other$yShift)) {
               return false;
            }

            Object this$scale = this.getScale();
            Object other$scale = other.getScale();
            if (this$scale == null) {
               if (other$scale != null) {
                  return false;
               }
            } else if (!this$scale.equals(other$scale)) {
               return false;
            }

            Object this$point = this.getPoint();
            Object other$point = other.getPoint();
            if (this$point == null) {
               if (other$point != null) {
                  return false;
               }
            } else if (!this$point.equals(other$point)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof MaskPosition;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $xShift = this.getXShift();
      int result = result * 59 + ($xShift == null ? 43 : $xShift.hashCode());
      Object $yShift = this.getYShift();
      result = result * 59 + ($yShift == null ? 43 : $yShift.hashCode());
      Object $scale = this.getScale();
      result = result * 59 + ($scale == null ? 43 : $scale.hashCode());
      Object $point = this.getPoint();
      result = result * 59 + ($point == null ? 43 : $point.hashCode());
      return result;
   }

   @NonNull
   public String getPoint() {
      return this.point;
   }

   @NonNull
   public Float getXShift() {
      return this.xShift;
   }

   @NonNull
   public Float getYShift() {
      return this.yShift;
   }

   @NonNull
   public Float getScale() {
      return this.scale;
   }

   @JsonProperty("point")
   public void setPoint(@NonNull String point) {
      if (point == null) {
         throw new NullPointerException("point is marked non-null but is null");
      } else {
         this.point = point;
      }
   }

   @JsonProperty("x_shift")
   public void setXShift(@NonNull Float xShift) {
      if (xShift == null) {
         throw new NullPointerException("xShift is marked non-null but is null");
      } else {
         this.xShift = xShift;
      }
   }

   @JsonProperty("y_shift")
   public void setYShift(@NonNull Float yShift) {
      if (yShift == null) {
         throw new NullPointerException("yShift is marked non-null but is null");
      } else {
         this.yShift = yShift;
      }
   }

   @JsonProperty("scale")
   public void setScale(@NonNull Float scale) {
      if (scale == null) {
         throw new NullPointerException("scale is marked non-null but is null");
      } else {
         this.scale = scale;
      }
   }

   public String toString() {
      return "MaskPosition(point=" + this.getPoint() + ", xShift=" + this.getXShift() + ", yShift=" + this.getYShift() + ", scale=" + this.getScale() + ")";
   }

   public MaskPosition() {
   }

   public MaskPosition(@NonNull String point, @NonNull Float xShift, @NonNull Float yShift, @NonNull Float scale) {
      if (point == null) {
         throw new NullPointerException("point is marked non-null but is null");
      } else if (xShift == null) {
         throw new NullPointerException("xShift is marked non-null but is null");
      } else if (yShift == null) {
         throw new NullPointerException("yShift is marked non-null but is null");
      } else if (scale == null) {
         throw new NullPointerException("scale is marked non-null but is null");
      } else {
         this.point = point;
         this.xShift = xShift;
         this.yShift = yShift;
         this.scale = scale;
      }
   }

   public static class MaskPositionBuilder {
      private String point;
      private Float xShift;
      private Float yShift;
      private Float scale;

      MaskPositionBuilder() {
      }

      @JsonProperty("point")
      public MaskPosition.MaskPositionBuilder point(@NonNull String point) {
         if (point == null) {
            throw new NullPointerException("point is marked non-null but is null");
         } else {
            this.point = point;
            return this;
         }
      }

      @JsonProperty("x_shift")
      public MaskPosition.MaskPositionBuilder xShift(@NonNull Float xShift) {
         if (xShift == null) {
            throw new NullPointerException("xShift is marked non-null but is null");
         } else {
            this.xShift = xShift;
            return this;
         }
      }

      @JsonProperty("y_shift")
      public MaskPosition.MaskPositionBuilder yShift(@NonNull Float yShift) {
         if (yShift == null) {
            throw new NullPointerException("yShift is marked non-null but is null");
         } else {
            this.yShift = yShift;
            return this;
         }
      }

      @JsonProperty("scale")
      public MaskPosition.MaskPositionBuilder scale(@NonNull Float scale) {
         if (scale == null) {
            throw new NullPointerException("scale is marked non-null but is null");
         } else {
            this.scale = scale;
            return this;
         }
      }

      public MaskPosition build() {
         return new MaskPosition(this.point, this.xShift, this.yShift, this.scale);
      }

      public String toString() {
         return "MaskPosition.MaskPositionBuilder(point=" + this.point + ", xShift=" + this.xShift + ", yShift=" + this.yShift + ", scale=" + this.scale + ")";
      }
   }
}
