package org.telegram.telegrambots.meta.api.methods.commands;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public class SetMyCommands extends BotApiMethod<Boolean> {
   public static final String PATH = "setMyCommands";
   private static final String COMMANDS_FIELD = "commands";
   @JsonProperty("commands")
   @NonNull
   private List<BotCommand> commands;

   public String getMethod() {
      return "setMyCommands";
   }

   public Boolean deserializeResponse(String answer) throws TelegramApiRequestException {
      try {
         ApiResponse<Boolean> result = (ApiResponse)OBJECT_MAPPER.readValue(answer, new TypeReference<ApiResponse<Boolean>>() {
         });
         if (result.getOk()) {
            return (Boolean)result.getResult();
         } else {
            throw new TelegramApiRequestException("Error sending commands", result);
         }
      } catch (IOException var3) {
         throw new TelegramApiRequestException("Unable to deserialize response", var3);
      }
   }

   public void validate() throws TelegramApiValidationException {
      if (this.commands == null) {
         throw new TelegramApiValidationException("Commands parameter can't be empty", this);
      } else if (this.commands.size() > 100) {
         throw new TelegramApiValidationException("No more than 100 commands are allowed", this);
      } else {
         Iterator var1 = this.commands.iterator();

         while(var1.hasNext()) {
            BotCommand command = (BotCommand)var1.next();
            command.validate();
         }

      }
   }

   public static SetMyCommands.SetMyCommandsBuilder builder() {
      return new SetMyCommands.SetMyCommandsBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetMyCommands)) {
         return false;
      } else {
         SetMyCommands other = (SetMyCommands)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$commands = this.getCommands();
            Object other$commands = other.getCommands();
            if (this$commands == null) {
               if (other$commands != null) {
                  return false;
               }
            } else if (!this$commands.equals(other$commands)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetMyCommands;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $commands = this.getCommands();
      int result = result * 59 + ($commands == null ? 43 : $commands.hashCode());
      return result;
   }

   @NonNull
   public List<BotCommand> getCommands() {
      return this.commands;
   }

   @JsonProperty("commands")
   public void setCommands(@NonNull List<BotCommand> commands) {
      if (commands == null) {
         throw new NullPointerException("commands is marked non-null but is null");
      } else {
         this.commands = commands;
      }
   }

   public String toString() {
      return "SetMyCommands(commands=" + this.getCommands() + ")";
   }

   public SetMyCommands() {
   }

   public SetMyCommands(@NonNull List<BotCommand> commands) {
      if (commands == null) {
         throw new NullPointerException("commands is marked non-null but is null");
      } else {
         this.commands = commands;
      }
   }

   public static class SetMyCommandsBuilder {
      private ArrayList<BotCommand> commands;

      SetMyCommandsBuilder() {
      }

      public SetMyCommands.SetMyCommandsBuilder command(BotCommand command) {
         if (this.commands == null) {
            this.commands = new ArrayList();
         }

         this.commands.add(command);
         return this;
      }

      @JsonProperty("commands")
      public SetMyCommands.SetMyCommandsBuilder commands(Collection<? extends BotCommand> commands) {
         if (commands == null) {
            throw new NullPointerException("commands cannot be null");
         } else {
            if (this.commands == null) {
               this.commands = new ArrayList();
            }

            this.commands.addAll(commands);
            return this;
         }
      }

      public SetMyCommands.SetMyCommandsBuilder clearCommands() {
         if (this.commands != null) {
            this.commands.clear();
         }

         return this;
      }

      public SetMyCommands build() {
         List commands;
         switch(this.commands == null ? 0 : this.commands.size()) {
         case 0:
            commands = Collections.emptyList();
            break;
         case 1:
            commands = Collections.singletonList((BotCommand)this.commands.get(0));
            break;
         default:
            commands = Collections.unmodifiableList(new ArrayList(this.commands));
         }

         return new SetMyCommands(commands);
      }

      public String toString() {
         return "SetMyCommands.SetMyCommandsBuilder(commands=" + this.commands + ")";
      }
   }
}
