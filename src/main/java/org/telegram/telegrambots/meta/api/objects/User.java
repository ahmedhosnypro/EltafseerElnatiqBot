package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class User implements BotApiObject {
   private static final String ID_FIELD = "id";
   private static final String FIRSTNAME_FIELD = "first_name";
   private static final String ISBOT_FIELD = "is_bot";
   private static final String LASTNAME_FIELD = "last_name";
   private static final String USERNAME_FIELD = "username";
   private static final String LANGUAGECODE_FIELD = "language_code";
   private static final String CANJOINGROUPS_FIELD = "can_join_groups";
   private static final String CANREADALLGROUPMESSAGES_FIELD = "can_read_all_group_messages";
   private static final String SUPPORTINLINEQUERIES_FIELD = "supports_inline_queries";
   @JsonProperty("id")
   @NonNull
   private Long id;
   @JsonProperty("first_name")
   @NonNull
   private String firstName;
   @JsonProperty("is_bot")
   @NonNull
   private Boolean isBot;
   @JsonProperty("last_name")
   private String lastName;
   @JsonProperty("username")
   private String userName;
   @JsonProperty("language_code")
   private String languageCode;
   @JsonProperty("can_join_groups")
   private Boolean canJoinGroups;
   @JsonProperty("can_read_all_group_messages")
   private Boolean canReadAllGroupMessages;
   @JsonProperty("supports_inline_queries")
   private Boolean supportInlineQueries;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof User)) {
         return false;
      } else {
         User other = (User)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label119: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label119;
                  }
               } else if (this$id.equals(other$id)) {
                  break label119;
               }

               return false;
            }

            Object this$isBot = this.getIsBot();
            Object other$isBot = other.getIsBot();
            if (this$isBot == null) {
               if (other$isBot != null) {
                  return false;
               }
            } else if (!this$isBot.equals(other$isBot)) {
               return false;
            }

            label105: {
               Object this$canJoinGroups = this.getCanJoinGroups();
               Object other$canJoinGroups = other.getCanJoinGroups();
               if (this$canJoinGroups == null) {
                  if (other$canJoinGroups == null) {
                     break label105;
                  }
               } else if (this$canJoinGroups.equals(other$canJoinGroups)) {
                  break label105;
               }

               return false;
            }

            Object this$canReadAllGroupMessages = this.getCanReadAllGroupMessages();
            Object other$canReadAllGroupMessages = other.getCanReadAllGroupMessages();
            if (this$canReadAllGroupMessages == null) {
               if (other$canReadAllGroupMessages != null) {
                  return false;
               }
            } else if (!this$canReadAllGroupMessages.equals(other$canReadAllGroupMessages)) {
               return false;
            }

            label91: {
               Object this$supportInlineQueries = this.getSupportInlineQueries();
               Object other$supportInlineQueries = other.getSupportInlineQueries();
               if (this$supportInlineQueries == null) {
                  if (other$supportInlineQueries == null) {
                     break label91;
                  }
               } else if (this$supportInlineQueries.equals(other$supportInlineQueries)) {
                  break label91;
               }

               return false;
            }

            Object this$firstName = this.getFirstName();
            Object other$firstName = other.getFirstName();
            if (this$firstName == null) {
               if (other$firstName != null) {
                  return false;
               }
            } else if (!this$firstName.equals(other$firstName)) {
               return false;
            }

            label77: {
               Object this$lastName = this.getLastName();
               Object other$lastName = other.getLastName();
               if (this$lastName == null) {
                  if (other$lastName == null) {
                     break label77;
                  }
               } else if (this$lastName.equals(other$lastName)) {
                  break label77;
               }

               return false;
            }

            label70: {
               Object this$userName = this.getUserName();
               Object other$userName = other.getUserName();
               if (this$userName == null) {
                  if (other$userName == null) {
                     break label70;
                  }
               } else if (this$userName.equals(other$userName)) {
                  break label70;
               }

               return false;
            }

            Object this$languageCode = this.getLanguageCode();
            Object other$languageCode = other.getLanguageCode();
            if (this$languageCode == null) {
               if (other$languageCode != null) {
                  return false;
               }
            } else if (!this$languageCode.equals(other$languageCode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof User;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      int result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $isBot = this.getIsBot();
      result = result * 59 + ($isBot == null ? 43 : $isBot.hashCode());
      Object $canJoinGroups = this.getCanJoinGroups();
      result = result * 59 + ($canJoinGroups == null ? 43 : $canJoinGroups.hashCode());
      Object $canReadAllGroupMessages = this.getCanReadAllGroupMessages();
      result = result * 59 + ($canReadAllGroupMessages == null ? 43 : $canReadAllGroupMessages.hashCode());
      Object $supportInlineQueries = this.getSupportInlineQueries();
      result = result * 59 + ($supportInlineQueries == null ? 43 : $supportInlineQueries.hashCode());
      Object $firstName = this.getFirstName();
      result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
      Object $lastName = this.getLastName();
      result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
      Object $userName = this.getUserName();
      result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
      Object $languageCode = this.getLanguageCode();
      result = result * 59 + ($languageCode == null ? 43 : $languageCode.hashCode());
      return result;
   }

   @NonNull
   public Long getId() {
      return this.id;
   }

   @NonNull
   public String getFirstName() {
      return this.firstName;
   }

   @NonNull
   public Boolean getIsBot() {
      return this.isBot;
   }

   public String getLastName() {
      return this.lastName;
   }

   public String getUserName() {
      return this.userName;
   }

   public String getLanguageCode() {
      return this.languageCode;
   }

   public Boolean getCanJoinGroups() {
      return this.canJoinGroups;
   }

   public Boolean getCanReadAllGroupMessages() {
      return this.canReadAllGroupMessages;
   }

   public Boolean getSupportInlineQueries() {
      return this.supportInlineQueries;
   }

   @JsonProperty("id")
   public void setId(@NonNull Long id) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else {
         this.id = id;
      }
   }

   @JsonProperty("first_name")
   public void setFirstName(@NonNull String firstName) {
      if (firstName == null) {
         throw new NullPointerException("firstName is marked non-null but is null");
      } else {
         this.firstName = firstName;
      }
   }

   @JsonProperty("is_bot")
   public void setIsBot(@NonNull Boolean isBot) {
      if (isBot == null) {
         throw new NullPointerException("isBot is marked non-null but is null");
      } else {
         this.isBot = isBot;
      }
   }

   @JsonProperty("last_name")
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   @JsonProperty("username")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("language_code")
   public void setLanguageCode(String languageCode) {
      this.languageCode = languageCode;
   }

   @JsonProperty("can_join_groups")
   public void setCanJoinGroups(Boolean canJoinGroups) {
      this.canJoinGroups = canJoinGroups;
   }

   @JsonProperty("can_read_all_group_messages")
   public void setCanReadAllGroupMessages(Boolean canReadAllGroupMessages) {
      this.canReadAllGroupMessages = canReadAllGroupMessages;
   }

   @JsonProperty("supports_inline_queries")
   public void setSupportInlineQueries(Boolean supportInlineQueries) {
      this.supportInlineQueries = supportInlineQueries;
   }

   public String toString() {
      return "User(id=" + this.getId() + ", firstName=" + this.getFirstName() + ", isBot=" + this.getIsBot() + ", lastName=" + this.getLastName() + ", userName=" + this.getUserName() + ", languageCode=" + this.getLanguageCode() + ", canJoinGroups=" + this.getCanJoinGroups() + ", canReadAllGroupMessages=" + this.getCanReadAllGroupMessages() + ", supportInlineQueries=" + this.getSupportInlineQueries() + ")";
   }

   public User() {
   }

   public User(@NonNull Long id, @NonNull String firstName, @NonNull Boolean isBot, String lastName, String userName, String languageCode, Boolean canJoinGroups, Boolean canReadAllGroupMessages, Boolean supportInlineQueries) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (firstName == null) {
         throw new NullPointerException("firstName is marked non-null but is null");
      } else if (isBot == null) {
         throw new NullPointerException("isBot is marked non-null but is null");
      } else {
         this.id = id;
         this.firstName = firstName;
         this.isBot = isBot;
         this.lastName = lastName;
         this.userName = userName;
         this.languageCode = languageCode;
         this.canJoinGroups = canJoinGroups;
         this.canReadAllGroupMessages = canReadAllGroupMessages;
         this.supportInlineQueries = supportInlineQueries;
      }
   }

   public User(@NonNull Long id, @NonNull String firstName, @NonNull Boolean isBot) {
      if (id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      } else if (firstName == null) {
         throw new NullPointerException("firstName is marked non-null but is null");
      } else if (isBot == null) {
         throw new NullPointerException("isBot is marked non-null but is null");
      } else {
         this.id = id;
         this.firstName = firstName;
         this.isBot = isBot;
      }
   }
}
