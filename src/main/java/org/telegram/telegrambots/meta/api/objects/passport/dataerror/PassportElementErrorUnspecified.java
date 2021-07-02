package org.telegram.telegrambots.meta.api.objects.passport.dataerror;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class PassportElementErrorUnspecified implements PassportElementError {
   private static final String SOURCE_FIELD = "source";
   private static final String TYPE_FIELD = "type";
   private static final String ELEMENTHASH_FIELD = "element_hash";
   private static final String MESSAGE_FIELD = "message";
   @JsonProperty("source")
   private final String source = "unspecified";
   @JsonProperty("type")
   @NonNull
   private String type;
   @JsonProperty("element_hash")
   @NonNull
   private String elementHash;
   @JsonProperty("message")
   @NonNull
   private String message;

   public void validate() throws TelegramApiValidationException {
      if (this.elementHash != null && !this.elementHash.isEmpty()) {
         if (this.message != null && !this.message.isEmpty()) {
            if (this.type == null || this.type.isEmpty()) {
               throw new TelegramApiValidationException("Type parameter can't be empty", this);
            }
         } else {
            throw new TelegramApiValidationException("Message parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("Element hash parameter can't be empty", this);
      }
   }

   public static PassportElementErrorUnspecified.PassportElementErrorUnspecifiedBuilder builder() {
      return new PassportElementErrorUnspecified.PassportElementErrorUnspecifiedBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PassportElementErrorUnspecified)) {
         return false;
      } else {
         PassportElementErrorUnspecified other = (PassportElementErrorUnspecified)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$source = this.getSource();
               Object other$source = other.getSource();
               if (this$source == null) {
                  if (other$source == null) {
                     break label59;
                  }
               } else if (this$source.equals(other$source)) {
                  break label59;
               }

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

            Object this$elementHash = this.getElementHash();
            Object other$elementHash = other.getElementHash();
            if (this$elementHash == null) {
               if (other$elementHash != null) {
                  return false;
               }
            } else if (!this$elementHash.equals(other$elementHash)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PassportElementErrorUnspecified;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $source = this.getSource();
      int result = result * 59 + ($source == null ? 43 : $source.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $elementHash = this.getElementHash();
      result = result * 59 + ($elementHash == null ? 43 : $elementHash.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      return result;
   }

   public String getSource() {
      Objects.requireNonNull(this);
      return "unspecified";
   }

   @NonNull
   public String getType() {
      return this.type;
   }

   @NonNull
   public String getElementHash() {
      return this.elementHash;
   }

   @NonNull
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("type")
   public void setType(@NonNull String type) {
      if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else {
         this.type = type;
      }
   }

   @JsonProperty("element_hash")
   public void setElementHash(@NonNull String elementHash) {
      if (elementHash == null) {
         throw new NullPointerException("elementHash is marked non-null but is null");
      } else {
         this.elementHash = elementHash;
      }
   }

   @JsonProperty("message")
   public void setMessage(@NonNull String message) {
      if (message == null) {
         throw new NullPointerException("message is marked non-null but is null");
      } else {
         this.message = message;
      }
   }

   public String toString() {
      return "PassportElementErrorUnspecified(source=" + this.getSource() + ", type=" + this.getType() + ", elementHash=" + this.getElementHash() + ", message=" + this.getMessage() + ")";
   }

   public PassportElementErrorUnspecified() {
   }

   public PassportElementErrorUnspecified(@NonNull String type, @NonNull String elementHash, @NonNull String message) {
      if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else if (elementHash == null) {
         throw new NullPointerException("elementHash is marked non-null but is null");
      } else if (message == null) {
         throw new NullPointerException("message is marked non-null but is null");
      } else {
         this.type = type;
         this.elementHash = elementHash;
         this.message = message;
      }
   }

   public static class PassportElementErrorUnspecifiedBuilder {
      private String type;
      private String elementHash;
      private String message;

      PassportElementErrorUnspecifiedBuilder() {
      }

      @JsonProperty("type")
      public PassportElementErrorUnspecified.PassportElementErrorUnspecifiedBuilder type(@NonNull String type) {
         if (type == null) {
            throw new NullPointerException("type is marked non-null but is null");
         } else {
            this.type = type;
            return this;
         }
      }

      @JsonProperty("element_hash")
      public PassportElementErrorUnspecified.PassportElementErrorUnspecifiedBuilder elementHash(@NonNull String elementHash) {
         if (elementHash == null) {
            throw new NullPointerException("elementHash is marked non-null but is null");
         } else {
            this.elementHash = elementHash;
            return this;
         }
      }

      @JsonProperty("message")
      public PassportElementErrorUnspecified.PassportElementErrorUnspecifiedBuilder message(@NonNull String message) {
         if (message == null) {
            throw new NullPointerException("message is marked non-null but is null");
         } else {
            this.message = message;
            return this;
         }
      }

      public PassportElementErrorUnspecified build() {
         return new PassportElementErrorUnspecified(this.type, this.elementHash, this.message);
      }

      public String toString() {
         return "PassportElementErrorUnspecified.PassportElementErrorUnspecifiedBuilder(type=" + this.type + ", elementHash=" + this.elementHash + ", message=" + this.message + ")";
      }
   }
}
