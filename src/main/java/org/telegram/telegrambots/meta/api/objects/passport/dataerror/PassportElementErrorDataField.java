package org.telegram.telegrambots.meta.api.objects.passport.dataerror;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import lombok.NonNull;
import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

@JsonDeserialize
public class PassportElementErrorDataField implements PassportElementError {
   private static final String SOURCE_FIELD = "source";
   private static final String TYPE_FIELD = "type";
   private static final String FIELDNAME_FIELD = "field_name";
   private static final String DATAHASH_FIELD = "data_hash";
   private static final String MESSAGE_FIELD = "message";
   @JsonProperty("source")
   @NonNull
   private final String source = "data";
   @JsonProperty("type")
   @NonNull
   private String type;
   @JsonProperty("field_name")
   @NonNull
   private String fieldName;
   @JsonProperty("data_hash")
   @NonNull
   private String dataHash;
   @JsonProperty("message")
   @NonNull
   private String message;

   public void validate() throws TelegramApiValidationException {
      if (this.fieldName != null && !this.fieldName.isEmpty()) {
         if (this.dataHash != null && !this.dataHash.isEmpty()) {
            if (this.message != null && !this.message.isEmpty()) {
               if (this.type == null || this.type.isEmpty()) {
                  throw new TelegramApiValidationException("Type parameter can't be empty", this);
               }
            } else {
               throw new TelegramApiValidationException("Message parameter can't be empty", this);
            }
         } else {
            throw new TelegramApiValidationException("Data hash parameter can't be empty", this);
         }
      } else {
         throw new TelegramApiValidationException("Field Name parameter can't be empty", this);
      }
   }

   public static PassportElementErrorDataField.PassportElementErrorDataFieldBuilder builder() {
      return new PassportElementErrorDataField.PassportElementErrorDataFieldBuilder();
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PassportElementErrorDataField)) {
         return false;
      } else {
         PassportElementErrorDataField other = (PassportElementErrorDataField)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label71: {
               Object this$source = this.getSource();
               Object other$source = other.getSource();
               if (this$source == null) {
                  if (other$source == null) {
                     break label71;
                  }
               } else if (this$source.equals(other$source)) {
                  break label71;
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

            label57: {
               Object this$fieldName = this.getFieldName();
               Object other$fieldName = other.getFieldName();
               if (this$fieldName == null) {
                  if (other$fieldName == null) {
                     break label57;
                  }
               } else if (this$fieldName.equals(other$fieldName)) {
                  break label57;
               }

               return false;
            }

            Object this$dataHash = this.getDataHash();
            Object other$dataHash = other.getDataHash();
            if (this$dataHash == null) {
               if (other$dataHash != null) {
                  return false;
               }
            } else if (!this$dataHash.equals(other$dataHash)) {
               return false;
            }

            Object this$message = this.getMessage();
            Object other$message = other.getMessage();
            if (this$message == null) {
               if (other$message == null) {
                  return true;
               }
            } else if (this$message.equals(other$message)) {
               return true;
            }

            return false;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PassportElementErrorDataField;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $source = this.getSource();
      int result = result * 59 + ($source == null ? 43 : $source.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $fieldName = this.getFieldName();
      result = result * 59 + ($fieldName == null ? 43 : $fieldName.hashCode());
      Object $dataHash = this.getDataHash();
      result = result * 59 + ($dataHash == null ? 43 : $dataHash.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      return result;
   }

   @NonNull
   public String getSource() {
      Objects.requireNonNull(this);
      return "data";
   }

   @NonNull
   public String getType() {
      return this.type;
   }

   @NonNull
   public String getFieldName() {
      return this.fieldName;
   }

   @NonNull
   public String getDataHash() {
      return this.dataHash;
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

   @JsonProperty("field_name")
   public void setFieldName(@NonNull String fieldName) {
      if (fieldName == null) {
         throw new NullPointerException("fieldName is marked non-null but is null");
      } else {
         this.fieldName = fieldName;
      }
   }

   @JsonProperty("data_hash")
   public void setDataHash(@NonNull String dataHash) {
      if (dataHash == null) {
         throw new NullPointerException("dataHash is marked non-null but is null");
      } else {
         this.dataHash = dataHash;
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
      return "PassportElementErrorDataField(source=" + this.getSource() + ", type=" + this.getType() + ", fieldName=" + this.getFieldName() + ", dataHash=" + this.getDataHash() + ", message=" + this.getMessage() + ")";
   }

   public PassportElementErrorDataField() {
   }

   public PassportElementErrorDataField(@NonNull String type, @NonNull String fieldName, @NonNull String dataHash, @NonNull String message) {
      if (type == null) {
         throw new NullPointerException("type is marked non-null but is null");
      } else if (fieldName == null) {
         throw new NullPointerException("fieldName is marked non-null but is null");
      } else if (dataHash == null) {
         throw new NullPointerException("dataHash is marked non-null but is null");
      } else if (message == null) {
         throw new NullPointerException("message is marked non-null but is null");
      } else {
         this.type = type;
         this.fieldName = fieldName;
         this.dataHash = dataHash;
         this.message = message;
      }
   }

   public static class PassportElementErrorDataFieldBuilder {
      private String type;
      private String fieldName;
      private String dataHash;
      private String message;

      PassportElementErrorDataFieldBuilder() {
      }

      @JsonProperty("type")
      public PassportElementErrorDataField.PassportElementErrorDataFieldBuilder type(@NonNull String type) {
         if (type == null) {
            throw new NullPointerException("type is marked non-null but is null");
         } else {
            this.type = type;
            return this;
         }
      }

      @JsonProperty("field_name")
      public PassportElementErrorDataField.PassportElementErrorDataFieldBuilder fieldName(@NonNull String fieldName) {
         if (fieldName == null) {
            throw new NullPointerException("fieldName is marked non-null but is null");
         } else {
            this.fieldName = fieldName;
            return this;
         }
      }

      @JsonProperty("data_hash")
      public PassportElementErrorDataField.PassportElementErrorDataFieldBuilder dataHash(@NonNull String dataHash) {
         if (dataHash == null) {
            throw new NullPointerException("dataHash is marked non-null but is null");
         } else {
            this.dataHash = dataHash;
            return this;
         }
      }

      @JsonProperty("message")
      public PassportElementErrorDataField.PassportElementErrorDataFieldBuilder message(@NonNull String message) {
         if (message == null) {
            throw new NullPointerException("message is marked non-null but is null");
         } else {
            this.message = message;
            return this;
         }
      }

      public PassportElementErrorDataField build() {
         return new PassportElementErrorDataField(this.type, this.fieldName, this.dataHash, this.message);
      }

      public String toString() {
         return "PassportElementErrorDataField.PassportElementErrorDataFieldBuilder(type=" + this.type + ", fieldName=" + this.fieldName + ", dataHash=" + this.dataHash + ", message=" + this.message + ")";
      }
   }
}
