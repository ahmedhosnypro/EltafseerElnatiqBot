package org.telegram.telegrambots.meta.api.objects.polls;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;

public class Poll implements BotApiObject {
   private static final String ID_FIELD = "id";
   private static final String QUESTION_FIELD = "question";
   private static final String OPTIONS_FIELD = "options";
   private static final String TOTALVOTERCOUNT_FIELD = "total_voter_count";
   private static final String ISCLOSED_FIELD = "is_closed";
   private static final String ISANONYMOUS_FIELD = "is_anonymous";
   private static final String TYPE_FIELD = "type";
   private static final String ALLOWSMULTIPLEANSWERS_FIELD = "allows_multiple_answers";
   private static final String CORRECTOPTIONID_FIELD = "correct_option_id";
   private static final String OPENPERIOD_FIELD = "open_period";
   private static final String CLOSEDATE_FIELD = "close_date";
   private static final String EXPLANATION_FIELD = "explanation";
   private static final String EXPLANATIONENTITIES_FIELD = "explanation_entities";
   @JsonProperty("id")
   private String id;
   @JsonProperty("question")
   private String question;
   @JsonProperty("options")
   private List<PollOption> options;
   @JsonProperty("total_voter_count")
   private Integer totalVoterCount;
   @JsonProperty("is_closed")
   private Boolean isClosed;
   @JsonProperty("is_anonymous")
   private Boolean isAnonymous;
   @JsonProperty("type")
   private String type;
   @JsonProperty("allows_multiple_answers")
   private Boolean allowMultipleAnswers;
   @JsonProperty("correct_option_id")
   private Integer correctOptionId;
   @JsonProperty("open_period")
   private Integer openPeriod;
   @JsonProperty("close_date")
   private Integer closeDate;
   @JsonProperty("explanation")
   private String explanation;
   @JsonProperty("explanation_entities")
   private List<MessageEntity> explanationEntities;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Poll)) {
         return false;
      } else {
         Poll other = (Poll)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label167: {
               Object this$totalVoterCount = this.getTotalVoterCount();
               Object other$totalVoterCount = other.getTotalVoterCount();
               if (this$totalVoterCount == null) {
                  if (other$totalVoterCount == null) {
                     break label167;
                  }
               } else if (this$totalVoterCount.equals(other$totalVoterCount)) {
                  break label167;
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

            label153: {
               Object this$isAnonymous = this.getIsAnonymous();
               Object other$isAnonymous = other.getIsAnonymous();
               if (this$isAnonymous == null) {
                  if (other$isAnonymous == null) {
                     break label153;
                  }
               } else if (this$isAnonymous.equals(other$isAnonymous)) {
                  break label153;
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

            label139: {
               Object this$correctOptionId = this.getCorrectOptionId();
               Object other$correctOptionId = other.getCorrectOptionId();
               if (this$correctOptionId == null) {
                  if (other$correctOptionId == null) {
                     break label139;
                  }
               } else if (this$correctOptionId.equals(other$correctOptionId)) {
                  break label139;
               }

               return false;
            }

            Object this$openPeriod = this.getOpenPeriod();
            Object other$openPeriod = other.getOpenPeriod();
            if (this$openPeriod == null) {
               if (other$openPeriod != null) {
                  return false;
               }
            } else if (!this$openPeriod.equals(other$openPeriod)) {
               return false;
            }

            label125: {
               Object this$closeDate = this.getCloseDate();
               Object other$closeDate = other.getCloseDate();
               if (this$closeDate == null) {
                  if (other$closeDate == null) {
                     break label125;
                  }
               } else if (this$closeDate.equals(other$closeDate)) {
                  break label125;
               }

               return false;
            }

            label118: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label118;
                  }
               } else if (this$id.equals(other$id)) {
                  break label118;
               }

               return false;
            }

            Object this$question = this.getQuestion();
            Object other$question = other.getQuestion();
            if (this$question == null) {
               if (other$question != null) {
                  return false;
               }
            } else if (!this$question.equals(other$question)) {
               return false;
            }

            label104: {
               Object this$options = this.getOptions();
               Object other$options = other.getOptions();
               if (this$options == null) {
                  if (other$options == null) {
                     break label104;
                  }
               } else if (this$options.equals(other$options)) {
                  break label104;
               }

               return false;
            }

            label97: {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type == null) {
                     break label97;
                  }
               } else if (this$type.equals(other$type)) {
                  break label97;
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
      return other instanceof Poll;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $totalVoterCount = this.getTotalVoterCount();
      int result = result * 59 + ($totalVoterCount == null ? 43 : $totalVoterCount.hashCode());
      Object $isClosed = this.getIsClosed();
      result = result * 59 + ($isClosed == null ? 43 : $isClosed.hashCode());
      Object $isAnonymous = this.getIsAnonymous();
      result = result * 59 + ($isAnonymous == null ? 43 : $isAnonymous.hashCode());
      Object $allowMultipleAnswers = this.getAllowMultipleAnswers();
      result = result * 59 + ($allowMultipleAnswers == null ? 43 : $allowMultipleAnswers.hashCode());
      Object $correctOptionId = this.getCorrectOptionId();
      result = result * 59 + ($correctOptionId == null ? 43 : $correctOptionId.hashCode());
      Object $openPeriod = this.getOpenPeriod();
      result = result * 59 + ($openPeriod == null ? 43 : $openPeriod.hashCode());
      Object $closeDate = this.getCloseDate();
      result = result * 59 + ($closeDate == null ? 43 : $closeDate.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $question = this.getQuestion();
      result = result * 59 + ($question == null ? 43 : $question.hashCode());
      Object $options = this.getOptions();
      result = result * 59 + ($options == null ? 43 : $options.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $explanation = this.getExplanation();
      result = result * 59 + ($explanation == null ? 43 : $explanation.hashCode());
      Object $explanationEntities = this.getExplanationEntities();
      result = result * 59 + ($explanationEntities == null ? 43 : $explanationEntities.hashCode());
      return result;
   }

   public String getId() {
      return this.id;
   }

   public String getQuestion() {
      return this.question;
   }

   public List<PollOption> getOptions() {
      return this.options;
   }

   public Integer getTotalVoterCount() {
      return this.totalVoterCount;
   }

   public Boolean getIsClosed() {
      return this.isClosed;
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

   public Integer getOpenPeriod() {
      return this.openPeriod;
   }

   public Integer getCloseDate() {
      return this.closeDate;
   }

   public String getExplanation() {
      return this.explanation;
   }

   public List<MessageEntity> getExplanationEntities() {
      return this.explanationEntities;
   }

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("question")
   public void setQuestion(String question) {
      this.question = question;
   }

   @JsonProperty("options")
   public void setOptions(List<PollOption> options) {
      this.options = options;
   }

   @JsonProperty("total_voter_count")
   public void setTotalVoterCount(Integer totalVoterCount) {
      this.totalVoterCount = totalVoterCount;
   }

   @JsonProperty("is_closed")
   public void setIsClosed(Boolean isClosed) {
      this.isClosed = isClosed;
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

   @JsonProperty("explanation_entities")
   public void setExplanationEntities(List<MessageEntity> explanationEntities) {
      this.explanationEntities = explanationEntities;
   }

   public String toString() {
      return "Poll(id=" + this.getId() + ", question=" + this.getQuestion() + ", options=" + this.getOptions() + ", totalVoterCount=" + this.getTotalVoterCount() + ", isClosed=" + this.getIsClosed() + ", isAnonymous=" + this.getIsAnonymous() + ", type=" + this.getType() + ", allowMultipleAnswers=" + this.getAllowMultipleAnswers() + ", correctOptionId=" + this.getCorrectOptionId() + ", openPeriod=" + this.getOpenPeriod() + ", closeDate=" + this.getCloseDate() + ", explanation=" + this.getExplanation() + ", explanationEntities=" + this.getExplanationEntities() + ")";
   }

   public Poll() {
   }

   public Poll(String id, String question, List<PollOption> options, Integer totalVoterCount, Boolean isClosed, Boolean isAnonymous, String type, Boolean allowMultipleAnswers, Integer correctOptionId, Integer openPeriod, Integer closeDate, String explanation, List<MessageEntity> explanationEntities) {
      this.id = id;
      this.question = question;
      this.options = options;
      this.totalVoterCount = totalVoterCount;
      this.isClosed = isClosed;
      this.isAnonymous = isAnonymous;
      this.type = type;
      this.allowMultipleAnswers = allowMultipleAnswers;
      this.correctOptionId = correctOptionId;
      this.openPeriod = openPeriod;
      this.closeDate = closeDate;
      this.explanation = explanation;
      this.explanationEntities = explanationEntities;
   }
}
