package org.telegram.telegrambots.meta.api.objects.replykeyboard.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ForceReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;

public class KeyboardDeserializer extends StdDeserializer<ReplyKeyboard> {
   private final ObjectMapper objectMapper;

   public KeyboardDeserializer() {
      this((Class)null);
   }

   private KeyboardDeserializer(Class<?> vc) {
      super(vc);
      this.objectMapper = new ObjectMapper();
   }

   public ReplyKeyboard deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
      JsonNode node = (JsonNode)jsonParser.getCodec().readTree(jsonParser);
      if (node.has("force_reply")) {
         return (ReplyKeyboard)this.objectMapper.readValue(node.toString(), new TypeReference<ForceReplyKeyboard>() {
         });
      } else if (node.has("keyboard")) {
         return (ReplyKeyboard)this.objectMapper.readValue(node.toString(), new TypeReference<ReplyKeyboardMarkup>() {
         });
      } else if (node.has("inline_keyboard")) {
         return (ReplyKeyboard)this.objectMapper.readValue(node.toString(), new TypeReference<InlineKeyboardMarkup>() {
         });
      } else {
         return node.has("remove_keyboard") ? (ReplyKeyboard)this.objectMapper.readValue(node.toString(), new TypeReference<ReplyKeyboardRemove>() {
         }) : null;
      }
   }
}
