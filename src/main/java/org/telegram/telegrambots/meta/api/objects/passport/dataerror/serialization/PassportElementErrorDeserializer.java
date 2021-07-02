package org.telegram.telegrambots.meta.api.objects.passport.dataerror.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementError;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorDataField;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorFile;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorFiles;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorFrontSide;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorReverseSide;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorSelfie;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorTranslationFile;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorTranslationFiles;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.PassportElementErrorUnspecified;

public class PassportElementErrorDeserializer extends StdDeserializer<PassportElementError> {
   private final ObjectMapper objectMapper;

   public PassportElementErrorDeserializer() {
      this((Class)null);
   }

   private PassportElementErrorDeserializer(Class<?> vc) {
      super(vc);
      this.objectMapper = new ObjectMapper();
   }

   public PassportElementError deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
      JsonNode node = (JsonNode)jsonParser.getCodec().readTree(jsonParser);
      String var4 = node.get("source").asText();
      byte var5 = -1;
      switch(var4.hashCode()) {
      case -1684946358:
         if (var4.equals("translation_file")) {
            var5 = 6;
         }
         break;
      case -1626174665:
         if (var4.equals("unspecified")) {
            var5 = 8;
         }
         break;
      case -906020504:
         if (var4.equals("selfie")) {
            var5 = 3;
         }
         break;
      case -693729431:
         if (var4.equals("translation_files")) {
            var5 = 7;
         }
         break;
      case -324064851:
         if (var4.equals("front_side")) {
            var5 = 1;
         }
         break;
      case -72564588:
         if (var4.equals("reverse_side")) {
            var5 = 2;
         }
         break;
      case 3076010:
         if (var4.equals("data")) {
            var5 = 0;
         }
         break;
      case 3143036:
         if (var4.equals("file")) {
            var5 = 4;
         }
         break;
      case 97434231:
         if (var4.equals("files")) {
            var5 = 5;
         }
      }

      switch(var5) {
      case 0:
         return (PassportElementError)this.objectMapper.readValue(node.toString(), new TypeReference<PassportElementErrorDataField>() {
         });
      case 1:
         return (PassportElementError)this.objectMapper.readValue(node.toString(), new TypeReference<PassportElementErrorFrontSide>() {
         });
      case 2:
         return (PassportElementError)this.objectMapper.readValue(node.toString(), new TypeReference<PassportElementErrorReverseSide>() {
         });
      case 3:
         return (PassportElementError)this.objectMapper.readValue(node.toString(), new TypeReference<PassportElementErrorSelfie>() {
         });
      case 4:
         return (PassportElementError)this.objectMapper.readValue(node.toString(), new TypeReference<PassportElementErrorFile>() {
         });
      case 5:
         return (PassportElementError)this.objectMapper.readValue(node.toString(), new TypeReference<PassportElementErrorFiles>() {
         });
      case 6:
         return (PassportElementError)this.objectMapper.readValue(node.toString(), new TypeReference<PassportElementErrorTranslationFile>() {
         });
      case 7:
         return (PassportElementError)this.objectMapper.readValue(node.toString(), new TypeReference<PassportElementErrorTranslationFiles>() {
         });
      case 8:
         return (PassportElementError)this.objectMapper.readValue(node.toString(), new TypeReference<PassportElementErrorUnspecified>() {
         });
      default:
         return null;
      }
   }
}
