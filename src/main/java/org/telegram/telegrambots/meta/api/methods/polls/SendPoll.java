package org.telegram.telegrambots.meta.api.methods.polls;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SendPoll extends BotApiMethod<Message> {
   public static final String PATH = "sendPoll";
   private static final String CHATID_FIELD = "chat_id";
   private static final String QUESTION_FIELD = "question";
   private static final String OPTIONS_FIELD = "options";
   private static final String ISANONYMOUS_FIELD = "is_anonymous";
   private static final String TYPE_FIELD = "type";
   private static final String ALLOWMULTIPLEANSWERS_FIELD = "allows_multiple_answers";
   private static final String CORRECTOPTIONID_FIELD = "correct_option_id";
   private static final String ISCLOSED_FIELD = "is_closed";
   private static final String DISABLENOTIFICATION_FIELD = "disable_notification";
   private static final String REPLYTOMESSAGEID_FIELD = "reply_to_message_id";
   private static final String REPLYMARKUP_FIELD = "reply_markup";
   private static final String OPENPERIOD_FIELD = "open_period";
   private static final String CLOSEDATE_FIELD = "close_date";
   private static final String EXPLANATION_FIELD = "explanation";
   private static final String EXPLANATIONPARSEMODE_FIELD = "explanation_parse_mode";
   private static final String EXPLANATION_ENTITIES_FIELD = "explanation_entities";
   private static final String ALLOWSENDINGWITHOUTREPLY_FIELD = "allow_sending_without_reply";
   @JsonProperty("chat_id")
   @NonNull
   private String chatId;
   @JsonProperty("question")
   @NonNull
   private String question;
   @JsonProperty("options")
   @NonNull
   private List<String> options;
   @JsonProperty("is_anonymous")
   private Boolean isAnonymous;
   @JsonProperty("type")
   private String type;
   @JsonProperty("allows_multiple_answers")
   private Boolean allowMultipleAnswers;
   @JsonProperty("correct_option_id")
   private Integer correctOptionId;
   @JsonProperty("is_closed")
   private Boolean isClosed;
   @JsonProperty("disable_notification")
   private Boolean disableNotification;
   @JsonProperty("reply_to_message_id")
   private Integer replyToMessageId;
   @JsonProperty("reply_markup")
   @JsonDeserialize
   private ReplyKeyboard replyMarkup;
   @JsonProperty("open_period")
   private Integer openPeriod;
   @JsonProperty("close_date")
   private Integer closeDate;
   @JsonProperty("explanation")
   private String explanation;
   @JsonProperty("explanation_parse_mode")
   private String explanationParseMode;
   @JsonProperty("explanation_entities")
   private List<MessageEntity> explanationEntities;
   @JsonProperty("allow_sending_without_reply")
   private Boolean allowSendingWithoutReply;

   public void enableNotification() {
      this.disableNotification = null;
   }

   public void disableNotification() {
      this.disableNotification = true;
   }

   public String getMethod() {
      return "sendPoll";
   }

   public Message deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Message> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Message>>() {
         });
         if (result.getOk()) {
            return (Message)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending poll", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.chatId != null && !this.chatId.isEmpty()) {
         if (this.question != null && !this.question.isEmpty()) {
            if (this.options != null && this.options.size() >= 2 && this.options.size() <= 10) {
               if (this.openPeriod != null && this.closeDate != null) {
                  throw new TelegramApiValidationException("Only one of Open Period and Close Date are allowed", this);
               } else if (this.openPeriod == null || this.openPeriod >= 5 && this.openPeriod <= 600) {
                  if (this.explanation != null && this.explanation.length() > 200) {
                     throw new TelegramApiValidationException("Explanation can only have up to 200 characters", this);
                  } else if (this.options.parallelStream().anyMatch((x) -> {
                     return x.isEmpty() || x.length() > 100;
                  })) {
                     throw new TelegramApiValidationException("Options parameter values must be between 1 and 100 chars length", this);
                  } else if (this.explanationParseMode != null && this.explanationEntities != null && !this.explanationEntities.isEmpty()) {
                     throw new TelegramApiValidationException("Parse mode can't be enabled if Entities are provided", this);
                  } else {
                     if (this.replyMarkup != null) {
                        this.replyMarkup.validate();
                     }

                  }
               } else {
                  throw new TelegramApiValidationException("Open period can only be between 5 and 600", this);
               }
            } else {
               throw new TelegramApiValidationException("Options parameter must be between 2 and 10 item", this);
            }
         } else {
            throw new TelegramApiValidationException("Question parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("ChatId parameter can't be empty", this);
      }
   }

   public static SendPoll.SendPollBuilder builder() {
      return new SendPoll.SendPollBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SendPoll)) {
         return false;
      } else {
         SendPoll other = (SendPoll)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label215: {
               Object this$isAnonymous = this.getIsAnonymous();
               Object other$isAnonymous = other.getIsAnonymous();
               if (this$isAnonymous == null) {
                  if (other$isAnonymous == null) {
                     break label215;
                  }
               } else if (this$isAnonymous.equals(other$isAnonymous)) {
                  break label215;
               }

               return false;
            }

            Object this$allowMultipleAnswers = this.getAllowMultipleAnswers();
            Object other$allowMultipleAnswers = other.getAllowMultipleAnswers();
            if (this$allowMultipleAnswers == null) {
               if (other$allowMultipleAnswers != null) {
                  return false;
               }
            } else if (!this$allowMultipleAnswers.equals(other$allowMultipleAnswers)) {
               return false;
            }

            label201: {
               Object this$correctOptionId = this.getCorrectOptionId();
               Object other$correctOptionId = other.getCorrectOptionId();
               if (this$correctOptionId == null) {
                  if (other$correctOptionId == null) {
                     break label201;
                  }
               } else if (this$correctOptionId.equals(other$correctOptionId)) {
                  break label201;
               }

               return false;
            }

            Object this$isClosed = this.getIsClosed();
            Object other$isClosed = other.getIsClosed();
            if (this$isClosed == null) {
               if (other$isClosed != null) {
                  return false;
               }
            } else if (!this$isClosed.equals(other$isClosed)) {
               return false;
            }

            label187: {
               Object this$disableNotification = this.getDisableNotification();
               Object other$disableNotification = other.getDisableNotification();
               if (this$disableNotification == null) {
                  if (other$disableNotification == null) {
                     break label187;
                  }
               } else if (this$disableNotification.equals(other$disableNotification)) {
                  break label187;
               }

               return false;
            }

            Object this$replyToMessageId = this.getReplyToMessageId();
            Object other$replyToMessageId = other.getReplyToMessageId();
            if (this$replyToMessageId == null) {
               if (other$replyToMessageId != null) {
                  return false;
               }
            } else if (!this$replyToMessageId.equals(other$replyToMessageId)) {
               return false;
            }

            label173: {
               Object this$openPeriod = this.getOpenPeriod();
               Object other$openPeriod = other.getOpenPeriod();
               if (this$openPeriod == null) {
                  if (other$openPeriod == null) {
                     break label173;
                  }
               } else if (this$openPeriod.equals(other$openPeriod)) {
                  break label173;
               }

               return false;
            }

            label166: {
               Object this$closeDate = this.getCloseDate();
               Object other$closeDate = other.getCloseDate();
               if (this$closeDate == null) {
                  if (other$closeDate == null) {
                     break label166;
                  }
               } else if (this$closeDate.equals(other$closeDate)) {
                  break label166;
               }

               return false;
            }

            Object this$allowSendingWithoutReply = this.getAllowSendingWithoutReply();
            Object other$allowSendingWithoutReply = other.getAllowSendingWithoutReply();
            if (this$allowSendingWithoutReply == null) {
               if (other$allowSendingWithoutReply != null) {
                  return false;
               }
            } else if (!this$allowSendingWithoutReply.equals(other$allowSendingWithoutReply)) {
               return false;
            }

            label152: {
               Object this$chatId = this.getChatId();
               Object other$chatId = other.getChatId();
               if (this$chatId == null) {
                  if (other$chatId == null) {
                     break label152;
                  }
               } else if (this$chatId.equals(other$chatId)) {
                  break label152;
               }

               return false;
            }

            label145: {
               Object this$question = this.getQuestion();
               Object other$question = other.getQuestion();
               if (this$question == null) {
                  if (other$question == null) {
                     break label145;
                  }
               } else if (this$question.equals(other$question)) {
                  break label145;
               }

               return false;
            }

            Object this$options = this.getOptions();
            Object other$options = other.getOptions();
            if (this$options == null) {
               if (other$options != null) {
                  return false;
               }
            } else if (!this$options.equals(other$options)) {
               return false;
            }

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            label124: {
               Object this$replyMarkup = this.getReplyMarkup();
               Object other$replyMarkup = other.getReplyMarkup();
               if (this$replyMarkup == null) {
                  if (other$replyMarkup == null) {
                     break label124;
                  }
               } else if (this$replyMarkup.equals(other$replyMarkup)) {
                  break label124;
               }

               return false;
            }

            Object this$explanation = this.getExplanation();
            Object other$explanation = other.getExplanation();
            if (this$explanation == null) {
               if (other$explanation != null) {
                  return false;
               }
            } else if (!this$explanation.equals(other$explanation)) {
               return false;
            }

            Object this$explanationParseMode = this.getExplanationParseMode();
            Object other$explanationParseMode = other.getExplanationParseMode();
            if (this$explanationParseMode == null) {
               if (other$explanationParseMode != null) {
                  return false;
               }
            } else if (!this$explanationParseMode.equals(other$explanationParseMode)) {
               return false;
            }

            Object this$explanationEntities = this.getExplanationEntities();
            Object other$explanationEntities = other.getExplanationEntities();
            if (this$explanationEntities == null) {
               if (other$explanationEntities != null) {
                  return false;
               }
            } else if (!this$explanationEntities.equals(other$explanationEntities)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SendPoll;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $isAnonymous = this.getIsAnonymous();
      int result = result * 59 + ($isAnonymous == null ? 43 : $isAnonymous.hashCode());
      Object $allowMultipleAnswers = this.getAllowMultipleAnswers();
      result = result * 59 + ($allowMultipleAnswers == null ? 43 : $allowMultipleAnswers.hashCode());
      Object $correctOptionId = this.getCorrectOptionId();
      result = result * 59 + ($correctOptionId == null ? 43 : $correctOptionId.hashCode());
      Object $isClosed = this.getIsClosed();
      result = result * 59 + ($isClosed == null ? 43 : $isClosed.hashCode());
      Object $disableNotification = this.getDisableNotification();
      result = result * 59 + ($disableNotification == null ? 43 : $disableNotification.hashCode());
      Object $replyToMessageId = this.getReplyToMessageId();
      result = result * 59 + ($replyToMessageId == null ? 43 : $replyToMessageId.hashCode());
      Object $openPeriod = this.getOpenPeriod();
      result = result * 59 + ($openPeriod == null ? 43 : $openPeriod.hashCode());
      Object $closeDate = this.getCloseDate();
      result = result * 59 + ($closeDate == null ? 43 : $closeDate.hashCode());
      Object $allowSendingWithoutReply = this.getAllowSendingWithoutReply();
      result = result * 59 + ($allowSendingWithoutReply == null ? 43 : $allowSendingWithoutReply.hashCode());
      Object $chatId = this.getChatId();
      result = result * 59 + ($chatId == null ? 43 : $chatId.hashCode());
      Object $question = this.getQuestion();
      result = result * 59 + ($question == null ? 43 : $question.hashCode());
      Object $options = this.getOptions();
      result = result * 59 + ($options == null ? 43 : $options.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $explanation = this.getExplanation();
      result = result * 59 + ($explanation == null ? 43 : $explanation.hashCode());
      Object $explanationParseMode = this.getExplanationParseMode();
      result = result * 59 + ($explanationParseMode == null ? 43 : $explanationParseMode.hashCode());
      Object $explanationEntities = this.getExplanationEntities();
      result = result * 59 + ($explanationEntities == null ? 43 : $explanationEntities.hashCode());
      return result;
   }

   @NonNull
   public String getChatId() {
      return this.chatId;
   }

   @NonNull
   public String getQuestion() {
      return this.question;
   }

   @NonNull
   public List<String> getOptions() {
      return this.options;
   }

   public Boolean getIsAnonymous() {
      return this.isAnonymous;
   }

   public String getType() {
      return this.type;
   }

   public Boolean getAllowMultipleAnswers() {
      return this.allowMultipleAnswers;
   }

   public Integer getCorrectOptionId() {
      return this.correctOptionId;
   }

   public Boolean getIsClosed() {
      return this.isClosed;
   }

   public Boolean getDisableNotification() {
      return this.disableNotification;
   }

   public Integer getReplyToMessageId() {
      return this.replyToMessageId;
   }

   public ReplyKeyboard getReplyMarkup() {
      return this.replyMarkup;
   }

   public Integer getOpenPeriod() {
      return this.openPeriod;
   }

   public Integer getCloseDate() {
      return this.closeDate;
   }

   public String getExplanation() {
      return this.explanation;
   }

   public String getExplanationParseMode() {
      return this.explanationParseMode;
   }

   public List<MessageEntity> getExplanationEntities() {
      return this.explanationEntities;
   }

   public Boolean getAllowSendingWithoutReply() {
      return this.allowSendingWithoutReply;
   }

   @JsonProperty("chat_id")
   public void setChatId(@NonNull String chatId) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else {
         this.chatId = chatId;
      }
   }

   @JsonProperty("question")
   public void setQuestion(@NonNull String question) {
      if (question == null) {
         throw new NullPointerException("question is marked non-null but is null");
      } else {
         this.question = question;
      }
   }

   @JsonProperty("options")
   public void setOptions(@NonNull List<String> options) {
      if (options == null) {
         throw new NullPointerException("options is marked non-null but is null");
      } else {
         this.options = options;
      }
   }

   @JsonProperty("is_anonymous")
   public void setIsAnonymous(Boolean isAnonymous) {
      this.isAnonymous = isAnonymous;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty("allows_multiple_answers")
   public void setAllowMultipleAnswers(Boolean allowMultipleAnswers) {
      this.allowMultipleAnswers = allowMultipleAnswers;
   }

   @JsonProperty("correct_option_id")
   public void setCorrectOptionId(Integer correctOptionId) {
      this.correctOptionId = correctOptionId;
   }

   @JsonProperty("is_closed")
   public void setIsClosed(Boolean isClosed) {
      this.isClosed = isClosed;
   }

   @JsonProperty("disable_notification")
   public void setDisableNotification(Boolean disableNotification) {
      this.disableNotification = disableNotification;
   }

   @JsonProperty("reply_to_message_id")
   public void setReplyToMessageId(Integer replyToMessageId) {
      this.replyToMessageId = replyToMessageId;
   }

   @JsonProperty("reply_markup")
   @JsonDeserialize
   public void setReplyMarkup(ReplyKeyboard replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("open_period")
   public void setOpenPeriod(Integer openPeriod) {
      this.openPeriod = openPeriod;
   }

   @JsonProperty("close_date")
   public void setCloseDate(Integer closeDate) {
      this.closeDate = closeDate;
   }

   @JsonProperty("explanation")
   public void setExplanation(String explanation) {
      this.explanation = explanation;
   }

   @JsonProperty("explanation_parse_mode")
   public void setExplanationParseMode(String explanationParseMode) {
      this.explanationParseMode = explanationParseMode;
   }

   @JsonProperty("explanation_entities")
   public void setExplanationEntities(List<MessageEntity> explanationEntities) {
      this.explanationEntities = explanationEntities;
   }

   @JsonProperty("allow_sending_without_reply")
   public void setAllowSendingWithoutReply(Boolean allowSendingWithoutReply) {
      this.allowSendingWithoutReply = allowSendingWithoutReply;
   }

   public String toString() {
      return "SendPoll(chatId=" + this.getChatId() + ", question=" + this.getQuestion() + ", options=" + this.getOptions() + ", isAnonymous=" + this.getIsAnonymous() + ", type=" + this.getType() + ", allowMultipleAnswers=" + this.getAllowMultipleAnswers() + ", correctOptionId=" + this.getCorrectOptionId() + ", isClosed=" + this.getIsClosed() + ", disableNotification=" + this.getDisableNotification() + ", replyToMessageId=" + this.getReplyToMessageId() + ", replyMarkup=" + this.getReplyMarkup() + ", openPeriod=" + this.getOpenPeriod() + ", closeDate=" + this.getCloseDate() + ", explanation=" + this.getExplanation() + ", explanationParseMode=" + this.getExplanationParseMode() + ", explanationEntities=" + this.getExplanationEntities() + ", allowSendingWithoutReply=" + this.getAllowSendingWithoutReply() + ")";
   }

   public SendPoll(@NonNull String chatId, @NonNull String question, @NonNull List<String> options) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (question == null) {
         throw new NullPointerException("question is marked non-null but is null");
      } else if (options == null) {
         throw new NullPointerException("options is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.question = question;
         this.options = options;
      }
   }

   public SendPoll() {
   }

   public SendPoll(@NonNull String chatId, @NonNull String question, @NonNull List<String> options, Boolean isAnonymous, String type, Boolean allowMultipleAnswers, Integer correctOptionId, Boolean isClosed, Boolean disableNotification, Integer replyToMessageId, ReplyKeyboard replyMarkup, Integer openPeriod, Integer closeDate, String explanation, String explanationParseMode, List<MessageEntity> explanationEntities, Boolean allowSendingWithoutReply) {
      if (chatId == null) {
         throw new NullPointerException("chatId is marked non-null but is null");
      } else if (question == null) {
         throw new NullPointerException("question is marked non-null but is null");
      } else if (options == null) {
         throw new NullPointerException("options is marked non-null but is null");
      } else {
         this.chatId = chatId;
         this.question = question;
         this.options = options;
         this.isAnonymous = isAnonymous;
         this.type = type;
         this.allowMultipleAnswers = allowMultipleAnswers;
         this.correctOptionId = correctOptionId;
         this.isClosed = isClosed;
         this.disableNotification = disableNotification;
         this.replyToMessageId = replyToMessageId;
         this.replyMarkup = replyMarkup;
         this.openPeriod = openPeriod;
         this.closeDate = closeDate;
         this.explanation = explanation;
         this.explanationParseMode = explanationParseMode;
         this.explanationEntities = explanationEntities;
         this.allowSendingWithoutReply = allowSendingWithoutReply;
      }
   }

   public static class SendPollBuilder {
      private String chatId;
      private String question;
      private ArrayList<String> options;
      private Boolean isAnonymous;
      private String type;
      private Boolean allowMultipleAnswers;
      private Integer correctOptionId;
      private Boolean isClosed;
      private Boolean disableNotification;
      private Integer replyToMessageId;
      private ReplyKeyboard replyMarkup;
      private Integer openPeriod;
      private Integer closeDate;
      private String explanation;
      private String explanationParseMode;
      private ArrayList<MessageEntity> explanationEntities;
      private Boolean allowSendingWithoutReply;

      SendPollBuilder() {
      }

      @JsonProperty("chat_id")
      public SendPoll.SendPollBuilder chatId(@NonNull String chatId) {
         if (chatId == null) {
            throw new NullPointerException("chatId is marked non-null but is null");
         } else {
            this.chatId = chatId;
            return this;
         }
      }

      @JsonProperty("question")
      public SendPoll.SendPollBuilder question(@NonNull String question) {
         if (question == null) {
            throw new NullPointerException("question is marked non-null but is null");
         } else {
            this.question = question;
            return this;
         }
      }

      public SendPoll.SendPollBuilder option(String option) {
         if (this.options == null) {
            this.options = new ArrayList();
         }

         this.options.add(option);
         return this;
      }

      @JsonProperty("options")
      public SendPoll.SendPollBuilder options(Collection<? extends String> options) {
         if (options == null) {
            throw new NullPointerException("options cannot be null");
         } else {
            if (this.options == null) {
               this.options = new ArrayList();
            }

            this.options.addAll(options);
            return this;
         }
      }

      public SendPoll.SendPollBuilder clearOptions() {
         if (this.options != null) {
            this.options.clear();
         }

         return this;
      }

      @JsonProperty("is_anonymous")
      public SendPoll.SendPollBuilder isAnonymous(Boolean isAnonymous) {
         this.isAnonymous = isAnonymous;
         return this;
      }

      @JsonProperty("type")
      public SendPoll.SendPollBuilder type(String type) {
         this.type = type;
         return this;
      }

      @JsonProperty("allows_multiple_answers")
      public SendPoll.SendPollBuilder allowMultipleAnswers(Boolean allowMultipleAnswers) {
         this.allowMultipleAnswers = allowMultipleAnswers;
         return this;
      }

      @JsonProperty("correct_option_id")
      public SendPoll.SendPollBuilder correctOptionId(Integer correctOptionId) {
         this.correctOptionId = correctOptionId;
         return this;
      }

      @JsonProperty("is_closed")
      public SendPoll.SendPollBuilder isClosed(Boolean isClosed) {
         this.isClosed = isClosed;
         return this;
      }

      @JsonProperty("disable_notification")
      public SendPoll.SendPollBuilder disableNotification(Boolean disableNotification) {
         this.disableNotification = disableNotification;
         return this;
      }

      @JsonProperty("reply_to_message_id")
      public SendPoll.SendPollBuilder replyToMessageId(Integer replyToMessageId) {
         this.replyToMessageId = replyToMessageId;
         return this;
      }

      @JsonProperty("reply_markup")
      @JsonDeserialize
      public SendPoll.SendPollBuilder replyMarkup(ReplyKeyboard replyMarkup) {
         this.replyMarkup = replyMarkup;
         return this;
      }

      @JsonProperty("open_period")
      public SendPoll.SendPollBuilder openPeriod(Integer openPeriod) {
         this.openPeriod = openPeriod;
         return this;
      }

      @JsonProperty("close_date")
      public SendPoll.SendPollBuilder closeDate(Integer closeDate) {
         this.closeDate = closeDate;
         return this;
      }

      @JsonProperty("explanation")
      public SendPoll.SendPollBuilder explanation(String explanation) {
         this.explanation = explanation;
         return this;
      }

      @JsonProperty("explanation_parse_mode")
      public SendPoll.SendPollBuilder explanationParseMode(String explanationParseMode) {
         this.explanationParseMode = explanationParseMode;
         return this;
      }

      public SendPoll.SendPollBuilder explanationEntity(MessageEntity explanationEntity) {
         if (this.explanationEntities == null) {
            this.explanationEntities = new ArrayList();
         }

         this.explanationEntities.add(explanationEntity);
         return this;
      }

      @JsonProperty("explanation_entities")
      public SendPoll.SendPollBuilder explanationEntities(Collection<? extends MessageEntity> explanationEntities) {
         if (explanationEntities == null) {
            throw new NullPointerException("explanationEntities cannot be null");
         } else {
            if (this.explanationEntities == null) {
               this.explanationEntities = new ArrayList();
            }

            this.explanationEntities.addAll(explanationEntities);
            return this;
         }
      }

      public SendPoll.SendPollBuilder clearExplanationEntities() {
         if (this.explanationEntities != null) {
            this.explanationEntities.clear();
         }

         return this;
      }

      @JsonProperty("allow_sending_without_reply")
      public SendPoll.SendPollBuilder allowSendingWithoutReply(Boolean allowSendingWithoutReply) {
         this.allowSendingWithoutReply = allowSendingWithoutReply;
         return this;
      }

      public SendPoll build() {
         List options;
         switch(this.options == null ? 0 : this.options.size()) {
         case 0:
            options = Collections.emptyList();
            break;
         case 1:
            options = Collections.singletonList((String)this.options.get(0));
            break;
         default:
            options = Collections.unmodifiableList(new ArrayList(this.options));
         }

         List explanationEntities;
         switch(this.explanationEntities == null ? 0 : this.explanationEntities.size()) {
         case 0:
            explanationEntities = Collections.emptyList();
            break;
         case 1:
            explanationEntities = Collections.singletonList((MessageEntity)this.explanationEntities.get(0));
            break;
         default:
            explanationEntities = Collections.unmodifiableList(new ArrayList(this.explanationEntities));
         }

         return new SendPoll(this.chatId, this.question, options, this.isAnonymous, this.type, this.allowMultipleAnswers, this.correctOptionId, this.isClosed, this.disableNotification, this.replyToMessageId, this.replyMarkup, this.openPeriod, this.closeDate, this.explanation, this.explanationParseMode, explanationEntities, this.allowSendingWithoutReply);
      }

      public String toString() {
         return "SendPoll.SendPollBuilder(chatId=" + this.chatId + ", question=" + this.question + ", options=" + this.options + ", isAnonymous=" + this.isAnonymous + ", type=" + this.type + ", allowMultipleAnswers=" + this.allowMultipleAnswers + ", correctOptionId=" + this.correctOptionId + ", isClosed=" + this.isClosed + ", disableNotification=" + this.disableNotification + ", replyToMessageId=" + this.replyToMessageId + ", replyMarkup=" + this.replyMarkup + ", openPeriod=" + this.openPeriod + ", closeDate=" + this.closeDate + ", explanation=" + this.explanation + ", explanationParseMode=" + this.explanationParseMode + ", explanationEntities=" + this.explanationEntities + ", allowSendingWithoutReply=" + this.allowSendingWithoutReply + ")";
      }
   }
}
