package org.telegram.telegrambots.meta.api.objects.media.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaAnimation;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaAudio;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaDocument;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaVideo;

public class InputMediaDeserializer extends StdDeserializer<InputMedia> {
   private final ObjectMapper objectMapper;

   public InputMediaDeserializer() {
      this((Class)null);
   }

   public InputMediaDeserializer(Class<?> vc) {
      super(vc);
      this.objectMapper = new ObjectMapper();
   }

   public InputMedia deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
      JsonNode node = (JsonNode)jsonParser.getCodec().readTree(jsonParser);
      String var4 = node.get("type").asText();
      byte var5 = -1;
      switch(var4.hashCode()) {
      case 93166550:
         if (var4.equals("audio")) {
            var5 = 3;
         }
         break;
      case 106642994:
         if (var4.equals("photo")) {
            var5 = 0;
         }
         break;
      case 112202875:
         if (var4.equals("video")) {
            var5 = 1;
         }
         break;
      case 861720859:
         if (var4.equals("document")) {
            var5 = 4;
         }
         break;
      case 1118509956:
         if (var4.equals("animation")) {
            var5 = 2;
         }
      }

      switch(var5) {
      case 0:
         return (InputMedia)this.objectMapper.readValue(node.toString(), new TypeReference<InputMediaPhoto>() {
         });
      case 1:
         return (InputMedia)this.objectMapper.readValue(node.toString(), new TypeReference<InputMediaVideo>() {
         });
      case 2:
         return (InputMedia)this.objectMapper.readValue(node.toString(), new TypeReference<InputMediaAnimation>() {
         });
      case 3:
         return (InputMedia)this.objectMapper.readValue(node.toString(), new TypeReference<InputMediaAudio>() {
         });
      case 4:
         return (InputMedia)this.objectMapper.readValue(node.toString(), new TypeReference<InputMediaDocument>() {
         });
      default:
         return null;
      }
   }
}
