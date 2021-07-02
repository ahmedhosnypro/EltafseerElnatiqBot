package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class CallbackQuery implements BotApiObject {
   private static final String ID_FIELD = "id";
   private static final String FROM_FIELD = "from";
   private static final String MESSAGE_FIELD = "message";
   private static final String INLINE_MESSAGE_ID_FIELD = "inline_message_id";
   private static final String DATA_FIELD = "data";
   private static final String GAMESHORTNAME_FIELD = "game_short_name";
   private static final String CHAT_INSTANCE_FIELD = "chat_instance";
   @JsonProperty("id")
   private String id;
   @JsonProperty("from")
   private User from;
   @JsonProperty("message")
   private Message message;
   @JsonProperty("inline_message_id")
   private String inlineMessageId;
   @JsonProperty("data")
   private String data;
   @JsonProperty("game_short_name")
   private String gameShortName;
   @JsonProperty("chat_instance")
   private String chatInstance;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CallbackQuery)) {
         return false;
      } else {
         CallbackQuery other = (CallbackQuery)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label95: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label95;
                  }
               } else if (this$id.equals(other$id)) {
                  break label95;
               }

               return false;
            }

            Object this$from = this.getFrom();
            Object other$from = other.getFrom();
            if (this$from == null) {
               if (other$from != null) {
                  return false;
               }
            } else if (!this$from.equals(other$from)) {
               return false;
            }

            Object this$message = this.getMessage();
            Object other$message = other.getMessage();
            if (this$message == null) {
               if (other$message != null) {
                  return false;
               }
            } else if (!this$message.equals(other$message)) {
               return false;
            }

            label74: {
               Object this$inlineMessageId = this.getInlineMessageId();
               Object other$inlineMessageId = other.getInlineMessageId();
               if (this$inlineMessageId == null) {
                  if (other$inlineMessageId == null) {
                     break label74;
                  }
               } else if (this$inlineMessageId.equals(other$inlineMessageId)) {
                  break label74;
               }

               return false;
            }

            label67: {
               Object this$data = this.getData();
               Object other$data = other.getData();
               if (this$data == null) {
                  if (other$data == null) {
                     break label67;
                  }
               } else if (this$data.equals(other$data)) {
                  break label67;
               }

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

            Object this$chatInstance = this.getChatInstance();
            Object other$chatInstance = other.getChatInstance();
            if (this$chatInstance == null) {
               if (other$chatInstance != null) {
                  return false;
               }
            } else if (!this$chatInstance.equals(other$chatInstance)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CallbackQuery;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      int result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $from = this.getFrom();
      result = result * 59 + ($from == null ? 43 : $from.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      Object $inlineMessageId = this.getInlineMessageId();
      result = result * 59 + ($inlineMessageId == null ? 43 : $inlineMessageId.hashCode());
      Object $data = this.getData();
      result = result * 59 + ($data == null ? 43 : $data.hashCode());
      Object $gameShortName = this.getGameShortName();
      result = result * 59 + ($gameShortName == null ? 43 : $gameShortName.hashCode());
      Object $chatInstance = this.getChatInstance();
      result = result * 59 + ($chatInstance == null ? 43 : $chatInstance.hashCode());
      return result;
   }

   public String getId() {
      return this.id;
   }

   public User getFrom() {
      return this.from;
   }

   public Message getMessage() {
      return this.message;
   }

   public String getInlineMessageId() {
      return this.inlineMessageId;
   }

   public String getData() {
      return this.data;
   }

   public String getGameShortName() {
      return this.gameShortName;
   }

   public String getChatInstance() {
      return this.chatInstance;
   }

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("from")
   public void setFrom(User from) {
      this.from = from;
   }

   @JsonProperty("message")
   public void setMessage(Message message) {
      this.message = message;
   }

   @JsonProperty("inline_message_id")
   public void setInlineMessageId(String inlineMessageId) {
      this.inlineMessageId = inlineMessageId;
   }

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("game_short_name")
   public void setGameShortName(String gameShortName) {
      this.gameShortName = gameShortName;
   }

   @JsonProperty("chat_instance")
   public void setChatInstance(String chatInstance) {
      this.chatInstance = chatInstance;
   }

   public String toString() {
      return "CallbackQuery(id=" + this.getId() + ", from=" + this.getFrom() + ", message=" + this.getMessage() + ", inlineMessageId=" + this.getInlineMessageId() + ", data=" + this.getData() + ", gameShortName=" + this.getGameShortName() + ", chatInstance=" + this.getChatInstance() + ")";
   }

   public CallbackQuery() {
   }

   public CallbackQuery(String id, User from, Message message, String inlineMessageId, String data, String gameShortName, String chatInstance) {
      this.id = id;
      this.from = from;
      this.message = message;
      this.inlineMessageId = inlineMessageId;
      this.data = data;
      this.gameShortName = gameShortName;
      this.chatInstance = chatInstance;
   }
}
