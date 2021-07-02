package org.telegram.telegrambots.meta.api.objects.commands;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class BotCommand implements BotApiObject, Validable {
   private static final String COMMAND_FIELD = "command";
   private static final String DESCRIPTION_FIELD = "description";
   @JsonProperty("command")
   @NonNull
   private String command;
   @JsonProperty("description")
   @NonNull
   private String description;

   public void validate() throws TelegramApiValidationException {
      if (this.command != null && !this.command.isEmpty()) {
         if (this.description == null || this.description.isEmpty()) {
            throw new TelegramApiValidationException("Description parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("Command parameter can't be empty", this);
      }
   }

   public static BotCommand.BotCommandBuilder builder() {
      return new BotCommand.BotCommandBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BotCommand)) {
         return false;
      } else {
         BotCommand other = (BotCommand)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$command = this.getCommand();
            Object other$command = other.getCommand();
            if (this$command == null) {
               if (other$command != null) {
                  return false;
               }
            } else if (!this$command.equals(other$command)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BotCommand;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $command = this.getCommand();
      int result = result * 59 + ($command == null ? 43 : $command.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      return result;
   }

   @NonNull
   public String getCommand() {
      return this.command;
   }

   @NonNull
   public String getDescription() {
      return this.description;
   }

   @JsonProperty("command")
   public void setCommand(@NonNull String command) {
      if (command == null) {
         throw new NullPointerException("command is marked non-null but is null");
      } else {
         this.command = command;
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

   public String toString() {
      return "BotCommand(command=" + this.getCommand() + ", description=" + this.getDescription() + ")";
   }

   public BotCommand() {
   }

   public BotCommand(@NonNull String command, @NonNull String description) {
      if (command == null) {
         throw new NullPointerException("command is marked non-null but is null");
      } else if (description == null) {
         throw new NullPointerException("description is marked non-null but is null");
      } else {
         this.command = command;
         this.description = description;
      }
   }

   public static class BotCommandBuilder {
      private String command;
      private String description;

      BotCommandBuilder() {
      }

      @JsonProperty("command")
      public BotCommand.BotCommandBuilder command(@NonNull String command) {
         if (command == null) {
            throw new NullPointerException("command is marked non-null but is null");
         } else {
            this.command = command;
            return this;
         }
      }

      @JsonProperty("description")
      public BotCommand.BotCommandBuilder description(@NonNull String description) {
         if (description == null) {
            throw new NullPointerException("description is marked non-null but is null");
         } else {
            this.description = description;
            return this;
         }
      }

      public BotCommand build() {
         return new BotCommand(this.command, this.description);
      }

      public String toString() {
         return "BotCommand.BotCommandBuilder(command=" + this.command + ", description=" + this.description + ")";
      }
   }
}
