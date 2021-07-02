package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class Dice implements BotApiObject {
   private static final String VALUE_FIELD = "value";
   private static final String EMOJI_FIELD = "emoji";
   @JsonProperty("value")
   private Integer value;
   @JsonProperty("emoji")
   private String emoji;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Dice)) {
         return false;
      } else {
         Dice other = (Dice)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$value = this.getValue();
            Object other$value = other.getValue();
            if (this$value == null) {
               if (other$value != null) {
                  return false;
               }
            } else if (!this$value.equals(other$value)) {
               return false;
            }

            Object this$emoji = this.getEmoji();
            Object other$emoji = other.getEmoji();
            if (this$emoji == null) {
               if (other$emoji != null) {
                  return false;
               }
            } else if (!this$emoji.equals(other$emoji)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Dice;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $value = this.getValue();
      int result = result * 59 + ($value == null ? 43 : $value.hashCode());
      Object $emoji = this.getEmoji();
      result = result * 59 + ($emoji == null ? 43 : $emoji.hashCode());
      return result;
   }

   public Integer getValue() {
      return this.value;
   }

   public String getEmoji() {
      return this.emoji;
   }

   @JsonProperty("value")
   public void setValue(Integer value) {
      this.value = value;
   }

   @JsonProperty("emoji")
   public void setEmoji(String emoji) {
      this.emoji = emoji;
   }

   public String toString() {
      return "Dice(value=" + this.getValue() + ", emoji=" + this.getEmoji() + ")";
   }

   public Dice() {
   }

   public Dice(Integer value, String emoji) {
      this.value = value;
      this.emoji = emoji;
   }
}
