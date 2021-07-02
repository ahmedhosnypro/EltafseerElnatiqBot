package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.inlinequery.ChosenInlineQuery;
import org.telegram.telegrambots.meta.api.objects.inlinequery.InlineQuery;
import org.telegram.telegrambots.meta.api.objects.payments.PreCheckoutQuery;
import org.telegram.telegrambots.meta.api.objects.payments.ShippingQuery;
import org.telegram.telegrambots.meta.api.objects.polls.Poll;
import org.telegram.telegrambots.meta.api.objects.polls.PollAnswer;

public class Update implements BotApiObject {
   private static final String UPDATEID_FIELD = "update_id";
   private static final String MESSAGE_FIELD = "message";
   private static final String INLINEQUERY_FIELD = "inline_query";
   private static final String CHOSENINLINEQUERY_FIELD = "chosen_inline_result";
   private static final String CALLBACKQUERY_FIELD = "callback_query";
   private static final String EDITEDMESSAGE_FIELD = "edited_message";
   private static final String CHANNELPOST_FIELD = "channel_post";
   private static final String EDITEDCHANNELPOST_FIELD = "edited_channel_post";
   private static final String SHIPPING_QUERY_FIELD = "shipping_query";
   private static final String PRE_CHECKOUT_QUERY_FIELD = "pre_checkout_query";
   private static final String POLL_FIELD = "poll";
   private static final String POLLANSWER_FIELD = "poll_answer";
   private static final String MYCHATMEMBER_FIELD = "my_chat_member";
   private static final String CHATMEMBER_FIELD = "chat_member";
   @JsonProperty("update_id")
   private Integer updateId;
   @JsonProperty("message")
   private Message message;
   @JsonProperty("inline_query")
   private InlineQuery inlineQuery;
   @JsonProperty("chosen_inline_result")
   private ChosenInlineQuery chosenInlineQuery;
   @JsonProperty("callback_query")
   private CallbackQuery callbackQuery;
   @JsonProperty("edited_message")
   private Message editedMessage;
   @JsonProperty("channel_post")
   private Message channelPost;
   @JsonProperty("edited_channel_post")
   private Message editedChannelPost;
   @JsonProperty("shipping_query")
   private ShippingQuery shippingQuery;
   @JsonProperty("pre_checkout_query")
   private PreCheckoutQuery preCheckoutQuery;
   @JsonProperty("poll")
   private Poll poll;
   @JsonProperty("poll_answer")
   private PollAnswer pollAnswer;
   @JsonProperty("my_chat_member")
   private ChatMemberUpdated myChatMember;
   @JsonProperty("chat_member")
   private ChatMemberUpdated chatMember;

   public boolean hasMessage() {
      return this.message != null;
   }

   public boolean hasInlineQuery() {
      return this.inlineQuery != null;
   }

   public boolean hasChosenInlineQuery() {
      return this.chosenInlineQuery != null;
   }

   public boolean hasCallbackQuery() {
      return this.callbackQuery != null;
   }

   public boolean hasEditedMessage() {
      return this.editedMessage != null;
   }

   public boolean hasChannelPost() {
      return this.channelPost != null;
   }

   public boolean hasEditedChannelPost() {
      return this.editedChannelPost != null;
   }

   public boolean hasShippingQuery() {
      return this.shippingQuery != null;
   }

   public boolean hasPreCheckoutQuery() {
      return this.preCheckoutQuery != null;
   }

   public boolean hasPoll() {
      return this.poll != null;
   }

   public boolean hasPollAnswer() {
      return this.pollAnswer != null;
   }

   public boolean hasMyChatMember() {
      return this.myChatMember != null;
   }

   public boolean hasChatMember() {
      return this.chatMember != null;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Update)) {
         return false;
      } else {
         Update other = (Update)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$updateId = this.getUpdateId();
            Object other$updateId = other.getUpdateId();
            if (this$updateId == null) {
               if (other$updateId != null) {
                  return false;
               }
            } else if (!this$updateId.equals(other$updateId)) {
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

            Object this$inlineQuery = this.getInlineQuery();
            Object other$inlineQuery = other.getInlineQuery();
            if (this$inlineQuery == null) {
               if (other$inlineQuery != null) {
                  return false;
               }
            } else if (!this$inlineQuery.equals(other$inlineQuery)) {
               return false;
            }

            label158: {
               Object this$chosenInlineQuery = this.getChosenInlineQuery();
               Object other$chosenInlineQuery = other.getChosenInlineQuery();
               if (this$chosenInlineQuery == null) {
                  if (other$chosenInlineQuery == null) {
                     break label158;
                  }
               } else if (this$chosenInlineQuery.equals(other$chosenInlineQuery)) {
                  break label158;
               }

               return false;
            }

            label151: {
               Object this$callbackQuery = this.getCallbackQuery();
               Object other$callbackQuery = other.getCallbackQuery();
               if (this$callbackQuery == null) {
                  if (other$callbackQuery == null) {
                     break label151;
                  }
               } else if (this$callbackQuery.equals(other$callbackQuery)) {
                  break label151;
               }

               return false;
            }

            Object this$editedMessage = this.getEditedMessage();
            Object other$editedMessage = other.getEditedMessage();
            if (this$editedMessage == null) {
               if (other$editedMessage != null) {
                  return false;
               }
            } else if (!this$editedMessage.equals(other$editedMessage)) {
               return false;
            }

            label137: {
               Object this$channelPost = this.getChannelPost();
               Object other$channelPost = other.getChannelPost();
               if (this$channelPost == null) {
                  if (other$channelPost == null) {
                     break label137;
                  }
               } else if (this$channelPost.equals(other$channelPost)) {
                  break label137;
               }

               return false;
            }

            label130: {
               Object this$editedChannelPost = this.getEditedChannelPost();
               Object other$editedChannelPost = other.getEditedChannelPost();
               if (this$editedChannelPost == null) {
                  if (other$editedChannelPost == null) {
                     break label130;
                  }
               } else if (this$editedChannelPost.equals(other$editedChannelPost)) {
                  break label130;
               }

               return false;
            }

            Object this$shippingQuery = this.getShippingQuery();
            Object other$shippingQuery = other.getShippingQuery();
            if (this$shippingQuery == null) {
               if (other$shippingQuery != null) {
                  return false;
               }
            } else if (!this$shippingQuery.equals(other$shippingQuery)) {
               return false;
            }

            Object this$preCheckoutQuery = this.getPreCheckoutQuery();
            Object other$preCheckoutQuery = other.getPreCheckoutQuery();
            if (this$preCheckoutQuery == null) {
               if (other$preCheckoutQuery != null) {
                  return false;
               }
            } else if (!this$preCheckoutQuery.equals(other$preCheckoutQuery)) {
               return false;
            }

            label109: {
               Object this$poll = this.getPoll();
               Object other$poll = other.getPoll();
               if (this$poll == null) {
                  if (other$poll == null) {
                     break label109;
                  }
               } else if (this$poll.equals(other$poll)) {
                  break label109;
               }

               return false;
            }

            label102: {
               Object this$pollAnswer = this.getPollAnswer();
               Object other$pollAnswer = other.getPollAnswer();
               if (this$pollAnswer == null) {
                  if (other$pollAnswer == null) {
                     break label102;
                  }
               } else if (this$pollAnswer.equals(other$pollAnswer)) {
                  break label102;
               }

               return false;
            }

            Object this$myChatMember = this.getMyChatMember();
            Object other$myChatMember = other.getMyChatMember();
            if (this$myChatMember == null) {
               if (other$myChatMember != null) {
                  return false;
               }
            } else if (!this$myChatMember.equals(other$myChatMember)) {
               return false;
            }

            Object this$chatMember = this.getChatMember();
            Object other$chatMember = other.getChatMember();
            if (this$chatMember == null) {
               if (other$chatMember != null) {
                  return false;
               }
            } else if (!this$chatMember.equals(other$chatMember)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Update;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $updateId = this.getUpdateId();
      int result = result * 59 + ($updateId == null ? 43 : $updateId.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      Object $inlineQuery = this.getInlineQuery();
      result = result * 59 + ($inlineQuery == null ? 43 : $inlineQuery.hashCode());
      Object $chosenInlineQuery = this.getChosenInlineQuery();
      result = result * 59 + ($chosenInlineQuery == null ? 43 : $chosenInlineQuery.hashCode());
      Object $callbackQuery = this.getCallbackQuery();
      result = result * 59 + ($callbackQuery == null ? 43 : $callbackQuery.hashCode());
      Object $editedMessage = this.getEditedMessage();
      result = result * 59 + ($editedMessage == null ? 43 : $editedMessage.hashCode());
      Object $channelPost = this.getChannelPost();
      result = result * 59 + ($channelPost == null ? 43 : $channelPost.hashCode());
      Object $editedChannelPost = this.getEditedChannelPost();
      result = result * 59 + ($editedChannelPost == null ? 43 : $editedChannelPost.hashCode());
      Object $shippingQuery = this.getShippingQuery();
      result = result * 59 + ($shippingQuery == null ? 43 : $shippingQuery.hashCode());
      Object $preCheckoutQuery = this.getPreCheckoutQuery();
      result = result * 59 + ($preCheckoutQuery == null ? 43 : $preCheckoutQuery.hashCode());
      Object $poll = this.getPoll();
      result = result * 59 + ($poll == null ? 43 : $poll.hashCode());
      Object $pollAnswer = this.getPollAnswer();
      result = result * 59 + ($pollAnswer == null ? 43 : $pollAnswer.hashCode());
      Object $myChatMember = this.getMyChatMember();
      result = result * 59 + ($myChatMember == null ? 43 : $myChatMember.hashCode());
      Object $chatMember = this.getChatMember();
      result = result * 59 + ($chatMember == null ? 43 : $chatMember.hashCode());
      return result;
   }

   public Integer getUpdateId() {
      return this.updateId;
   }

   public Message getMessage() {
      return this.message;
   }

   public InlineQuery getInlineQuery() {
      return this.inlineQuery;
   }

   public ChosenInlineQuery getChosenInlineQuery() {
      return this.chosenInlineQuery;
   }

   public CallbackQuery getCallbackQuery() {
      return this.callbackQuery;
   }

   public Message getEditedMessage() {
      return this.editedMessage;
   }

   public Message getChannelPost() {
      return this.channelPost;
   }

   public Message getEditedChannelPost() {
      return this.editedChannelPost;
   }

   public ShippingQuery getShippingQuery() {
      return this.shippingQuery;
   }

   public PreCheckoutQuery getPreCheckoutQuery() {
      return this.preCheckoutQuery;
   }

   public Poll getPoll() {
      return this.poll;
   }

   public PollAnswer getPollAnswer() {
      return this.pollAnswer;
   }

   public ChatMemberUpdated getMyChatMember() {
      return this.myChatMember;
   }

   public ChatMemberUpdated getChatMember() {
      return this.chatMember;
   }

   @JsonProperty("update_id")
   public void setUpdateId(Integer updateId) {
      this.updateId = updateId;
   }

   @JsonProperty("message")
   public void setMessage(Message message) {
      this.message = message;
   }

   @JsonProperty("inline_query")
   public void setInlineQuery(InlineQuery inlineQuery) {
      this.inlineQuery = inlineQuery;
   }

   @JsonProperty("chosen_inline_result")
   public void setChosenInlineQuery(ChosenInlineQuery chosenInlineQuery) {
      this.chosenInlineQuery = chosenInlineQuery;
   }

   @JsonProperty("callback_query")
   public void setCallbackQuery(CallbackQuery callbackQuery) {
      this.callbackQuery = callbackQuery;
   }

   @JsonProperty("edited_message")
   public void setEditedMessage(Message editedMessage) {
      this.editedMessage = editedMessage;
   }

   @JsonProperty("channel_post")
   public void setChannelPost(Message channelPost) {
      this.channelPost = channelPost;
   }

   @JsonProperty("edited_channel_post")
   public void setEditedChannelPost(Message editedChannelPost) {
      this.editedChannelPost = editedChannelPost;
   }

   @JsonProperty("shipping_query")
   public void setShippingQuery(ShippingQuery shippingQuery) {
      this.shippingQuery = shippingQuery;
   }

   @JsonProperty("pre_checkout_query")
   public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
      this.preCheckoutQuery = preCheckoutQuery;
   }

   @JsonProperty("poll")
   public void setPoll(Poll poll) {
      this.poll = poll;
   }

   @JsonProperty("poll_answer")
   public void setPollAnswer(PollAnswer pollAnswer) {
      this.pollAnswer = pollAnswer;
   }

   @JsonProperty("my_chat_member")
   public void setMyChatMember(ChatMemberUpdated myChatMember) {
      this.myChatMember = myChatMember;
   }

   @JsonProperty("chat_member")
   public void setChatMember(ChatMemberUpdated chatMember) {
      this.chatMember = chatMember;
   }

   public String toString() {
      return "Update(updateId=" + this.getUpdateId() + ", message=" + this.getMessage() + ", inlineQuery=" + this.getInlineQuery() + ", chosenInlineQuery=" + this.getChosenInlineQuery() + ", callbackQuery=" + this.getCallbackQuery() + ", editedMessage=" + this.getEditedMessage() + ", channelPost=" + this.getChannelPost() + ", editedChannelPost=" + this.getEditedChannelPost() + ", shippingQuery=" + this.getShippingQuery() + ", preCheckoutQuery=" + this.getPreCheckoutQuery() + ", poll=" + this.getPoll() + ", pollAnswer=" + this.getPollAnswer() + ", myChatMember=" + this.getMyChatMember() + ", chatMember=" + this.getChatMember() + ")";
   }

   public Update() {
   }

   public Update(Integer updateId, Message message, InlineQuery inlineQuery, ChosenInlineQuery chosenInlineQuery, CallbackQuery callbackQuery, Message editedMessage, Message channelPost, Message editedChannelPost, ShippingQuery shippingQuery, PreCheckoutQuery preCheckoutQuery, Poll poll, PollAnswer pollAnswer, ChatMemberUpdated myChatMember, ChatMemberUpdated chatMember) {
      this.updateId = updateId;
      this.message = message;
      this.inlineQuery = inlineQuery;
      this.chosenInlineQuery = chosenInlineQuery;
      this.callbackQuery = callbackQuery;
      this.editedMessage = editedMessage;
      this.channelPost = channelPost;
      this.editedChannelPost = editedChannelPost;
      this.shippingQuery = shippingQuery;
      this.preCheckoutQuery = preCheckoutQuery;
      this.poll = poll;
      this.pollAnswer = pollAnswer;
      this.myChatMember = myChatMember;
      this.chatMember = chatMember;
   }
}
