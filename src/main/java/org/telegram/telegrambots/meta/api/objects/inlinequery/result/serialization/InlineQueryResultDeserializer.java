package org.telegram.telegrambots.meta.api.objects.inlinequery.result.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultArticle;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultAudio;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultContact;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultDocument;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultGame;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultGif;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultLocation;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultMpeg4Gif;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultPhoto;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultVenue;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultVideo;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultVoice;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached.InlineQueryResultCachedAudio;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached.InlineQueryResultCachedDocument;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached.InlineQueryResultCachedGif;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached.InlineQueryResultCachedMpeg4Gif;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached.InlineQueryResultCachedPhoto;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached.InlineQueryResultCachedSticker;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached.InlineQueryResultCachedVideo;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.cached.InlineQueryResultCachedVoice;

public class InlineQueryResultDeserializer extends StdDeserializer<InlineQueryResult> {
   private final ObjectMapper objectMapper;

   public InlineQueryResultDeserializer() {
      this((Class)null);
   }

   private InlineQueryResultDeserializer(Class<?> vc) {
      super(vc);
      this.objectMapper = new ObjectMapper();
   }

   public InlineQueryResult deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
      JsonNode node = (JsonNode)jsonParser.getCodec().readTree(jsonParser);
      String var4 = node.get("type").asText();
      byte var5 = -1;
      switch(var4.hashCode()) {
      case -1890252483:
         if (var4.equals("sticker")) {
            var5 = 12;
         }
         break;
      case -732377866:
         if (var4.equals("article")) {
            var5 = 0;
         }
         break;
      case 102340:
         if (var4.equals("gif")) {
            var5 = 5;
         }
         break;
      case 3165170:
         if (var4.equals("game")) {
            var5 = 4;
         }
         break;
      case 93166550:
         if (var4.equals("audio")) {
            var5 = 1;
         }
         break;
      case 106642994:
         if (var4.equals("photo")) {
            var5 = 8;
         }
         break;
      case 112093807:
         if (var4.equals("venue")) {
            var5 = 9;
         }
         break;
      case 112202875:
         if (var4.equals("video")) {
            var5 = 10;
         }
         break;
      case 112386354:
         if (var4.equals("voice")) {
            var5 = 11;
         }
         break;
      case 625537748:
         if (var4.equals("mpeg4_gif")) {
            var5 = 7;
         }
         break;
      case 861720859:
         if (var4.equals("document")) {
            var5 = 3;
         }
         break;
      case 951526432:
         if (var4.equals("contact")) {
            var5 = 2;
         }
         break;
      case 1901043637:
         if (var4.equals("location")) {
            var5 = 6;
         }
      }

      switch(var5) {
      case 0:
         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultArticle>() {
         });
      case 1:
         if (node.has("audio_url")) {
            return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultAudio>() {
            });
         }

         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultCachedAudio>() {
         });
      case 2:
         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultContact>() {
         });
      case 3:
         if (node.has("document_url")) {
            return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultDocument>() {
            });
         }

         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultCachedDocument>() {
         });
      case 4:
         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultGame>() {
         });
      case 5:
         if (node.has("gif_url")) {
            return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultGif>() {
            });
         }

         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultCachedGif>() {
         });
      case 6:
         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultLocation>() {
         });
      case 7:
         if (node.has("mpeg4_url")) {
            return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultMpeg4Gif>() {
            });
         }

         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultCachedMpeg4Gif>() {
         });
      case 8:
         if (node.has("photo_url")) {
            return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultPhoto>() {
            });
         }

         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultCachedPhoto>() {
         });
      case 9:
         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultVenue>() {
         });
      case 10:
         if (node.has("video_url")) {
            return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultVideo>() {
            });
         }

         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultCachedVideo>() {
         });
      case 11:
         if (node.has("voice_url")) {
            return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultVoice>() {
            });
         }

         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultCachedVoice>() {
         });
      case 12:
         return (InlineQueryResult)this.objectMapper.readValue(node.toString(), new TypeReference<InlineQueryResultCachedSticker>() {
         });
      default:
         return null;
      }
   }
}
