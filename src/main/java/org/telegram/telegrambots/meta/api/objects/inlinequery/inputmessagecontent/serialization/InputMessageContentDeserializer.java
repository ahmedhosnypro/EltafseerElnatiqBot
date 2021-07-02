package org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputContactMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputInvoiceMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputLocationMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputTextMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputVenueMessageContent;

public class InputMessageContentDeserializer extends StdDeserializer<InputMessageContent> {
   private final ObjectMapper objectMapper;

   public InputMessageContentDeserializer() {
      this((Class)null);
   }

   private InputMessageContentDeserializer(Class<?> vc) {
      super(vc);
      this.objectMapper = new ObjectMapper();
   }

   public InputMessageContent deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
      JsonNode node = (JsonNode)jsonParser.getCodec().readTree(jsonParser);
      if (node.has("message_text")) {
         return (InputMessageContent)this.objectMapper.readValue(node.toString(), new TypeReference<InputTextMessageContent>() {
         });
      } else if (node.has("address")) {
         return (InputMessageContent)this.objectMapper.readValue(node.toString(), new TypeReference<InputVenueMessageContent>() {
         });
      } else if (node.has("latitude")) {
         return (InputMessageContent)this.objectMapper.readValue(node.toString(), new TypeReference<InputLocationMessageContent>() {
         });
      } else if (node.has("phone_number")) {
         return (InputMessageContent)this.objectMapper.readValue(node.toString(), new TypeReference<InputContactMessageContent>() {
         });
      } else {
         return node.has("provider_token") ? (InputMessageContent)this.objectMapper.readValue(node.toString(), new TypeReference<InputInvoiceMessageContent>() {
         }) : null;
      }
   }
}
