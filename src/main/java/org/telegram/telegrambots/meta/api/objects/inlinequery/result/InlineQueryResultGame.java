package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class InlineQueryResultGame implements InlineQueryResult {
   private static final String TYPE_FIELD = "type";
   private static final String ID_FIELD = "id";
   private static final String GAMESHORTNAME_FIELD = "game_short_name";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   @JsonProperty("type")
   private final String type = "game";
   @JsonProperty("id")
   @NonNull
   private String id;
   @JsonProperty("game_short_name")
   @NonNull
   private String gameShortName;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;

   public void validate() throws TelegramApiValidationException {
      if (this.id != null && !this.id.isEmpty()) {
         if (this.gameShortName != null && !this.gameShortName.isEmpty()) {
            if (this.replyMarkup != null) {
               this.replyMarkup.validate();
            }

         } else {
            throw new TelegramApiValidationException("GameShortName parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ID parameter can't be empty", this);
      }
   }

   public static InlineQueryResultGame.InlineQueryResultGameBuilder builder() {
      return new InlineQueryResultGame.InlineQueryResultGameBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InlineQueryResultGame)) {
         return false;
      } else {
         InlineQueryResultGame other = (InlineQueryResultGame)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label59;
                  }
               } else if (this$type.equals(other$type)) {
                  break label59;
               }

               return false;
            }

            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
               return false;
            }

            Object this$gameShortName = this.getGameShortName();
            Object other$gameShortName = other.getGameShortName();
            if (this$gameShortName == null) {
               if (other$gameShortName != null) {
                  return false;
               }
            } else if (!this$gameShortName.equals(other$gameShortName)) {
               return false;
            }

            Object this$replyMarkup = this.getReplyMarkup();
            Object other$replyMarkup = other.getReplyMarkup();
            if (this$replyMarkup == null) {
               if (other$replyMarkup != null) {
                  return false;
               }
            } else if (!this$replyMarkup.equals(other$replyMarkup)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InlineQueryResultGame;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $type = this.getType();
      int result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $gameShortName = this.getGameShortName();
      result = result * 59 + ($gameShortName == null ? 43 : $gameShortName.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      return result;
   }

   public String getType() {
      Objects.requireNonNull(this);
      return "game";
   }

   @NonNull
   public String getId() {
      return this.id;
   }

   @NonNull
   public String getGameShortName() {
      return this.gameShortName;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
   }

   @JsonProperty("id")
   public void setId(@NonNull String id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
      }
   }

   @JsonProperty("game_short_name")
   public void setGameShortName(@NonNull String gameShortName) {
      if (gameShortName == null) {
         throw new NullPointerException("gameShortName is marked non-null but is null");
      } else {
         this.gameShortName = gameShortName;
      }
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   public String toString() {
      return "InlineQueryResultGame(type=" + this.getType() + ", id=" + this.getId() + ", gameShortName=" + this.getGameShortName() + ", replyMarkup=" + this.getReplyMarkup() + ")";
   }

   public InlineQueryResultGame(@NonNull String id, @NonNull String gameShortName) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (gameShortName == null) {
         throw new NullPointerException("gameShortName is marked non-null but is null");
      } else {
         this.id = id;
         this.gameShortName = gameShortName;
      }
   }

   public InlineQueryResultGame() {
   }

   public InlineQueryResultGame(@NonNull String id, @NonNull String gameShortName, InlineKeyboardMarkup replyMarkup) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (gameShortName == null) {
         throw new NullPointerException("gameShortName is marked non-null but is null");
      } else {
         this.id = id;
         this.gameShortName = gameShortName;
         this.replyMarkup = replyMarkup;
      }
   }

   public static class InlineQueryResultGameBuilder {
      private String id;
      private String gameShortName;
      private InlineKeyboardMarkup replyMarkup;

      InlineQueryResultGameBuilder() {
      }

      @JsonProperty("id")
      public InlineQueryResultGame.InlineQueryResultGameBuilder id(@NonNull String id) {
         if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
         } else {
            this.id = id;
            return this;
         }
      }

      @JsonProperty("game_short_name")
      public InlineQueryResultGame.InlineQueryResultGameBuilder gameShortName(@NonNull String gameShortName) {
         if (gameShortName == null) {
            throw new NullPointerException("gameShortName is marked non-null but is null");
         } else {
            this.gameShortName = gameShortName;
            return this;
         }
      }

      @JsonProperty("reply_markup")
      public InlineQueryResultGame.InlineQueryResultGameBuilder replyMarkup(InlineKeyboardMarkup replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      public InlineQueryResultGame build() {
         return new InlineQueryResultGame(this.id, this.gameShortName, this.replyMarkup);
      }

      public String toString() {
         return "InlineQueryResultGame.InlineQueryResultGameBuilder(id=" + this.id + ", gameShortName=" + this.gameShortName + ", replyMarkup=" + this.replyMarkup + ")";
      }
   }
}
