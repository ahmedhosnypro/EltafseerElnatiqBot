package org.telegram.telegrambots.meta.api.objects.media.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.Iterator;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaAnimation;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaAudio;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaDocument;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaVideo;

public class InputMediaSerializer extends JsonSerializer<InputMedia> {
   public void serialize(InputMedia value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
      gen.writeStartObject();
      gen.writeStringField("media", value.getMedia());
      gen.writeStringField("type", value.getType());
      if (value.getCaption() != null) {
         gen.writeStringField("caption", value.getCaption());
      }

      if (value.getParseMode() != null) {
         gen.writeStringField("parse_mode", value.getParseMode());
      }

      if (value.getEntities() != null) {
         gen.writeArrayFieldStart("entities");
         Iterator var4 = value.getEntities().iterator();

         while(var4.hasNext()) {
            MessageEntity entity = (MessageEntity)var4.next();
            gen.writeObject(entity);
         }

         gen.writeEndArray();
      }

      if (value instanceof InputMediaAudio) {
         InputMediaAudio audio = (InputMediaAudio)value;
         if (audio.getThumb() != null) {
            gen.writeStringField("thumb", audio.getThumb().getAttachName());
         }

         if (audio.getDuration() != null) {
            gen.writeNumberField("duration", audio.getDuration());
         }

         if (audio.getPerformer() != null) {
            gen.writeStringField("performer", audio.getPerformer());
         }

         if (audio.getTitle() != null) {
            gen.writeStringField("title", audio.getTitle());
         }
      } else if (value instanceof InputMediaAnimation) {
         InputMediaAnimation animation = (InputMediaAnimation)value;
         if (animation.getThumb() != null) {
            gen.writeStringField("thumb", animation.getThumb().getAttachName());
         }

         if (animation.getDuration() != null) {
            gen.writeNumberField("duration", animation.getDuration());
         }

         if (animation.getHeight() != null) {
            gen.writeNumberField("height", animation.getHeight());
         }

         if (animation.getWidth() != null) {
            gen.writeNumberField("width", animation.getWidth());
         }
      } else if (value instanceof InputMediaDocument) {
         InputMediaDocument document = (InputMediaDocument)value;
         if (document.getThumb() != null) {
            gen.writeStringField("thumb", document.getThumb().getAttachName());
         }
      } else if (value instanceof InputMediaVideo) {
         InputMediaVideo video = (InputMediaVideo)value;
         if (video.getThumb() != null) {
            gen.writeStringField("thumb", video.getThumb().getAttachName());
         }

         if (video.getDuration() != null) {
            gen.writeNumberField("duration", video.getDuration());
         }

         if (video.getHeight() != null) {
            gen.writeNumberField("height", video.getHeight());
         }

         if (video.getWidth() != null) {
            gen.writeNumberField("width", video.getWidth());
         }

         if (video.getSupportsStreaming() != null) {
            gen.writeBooleanField("supports_streaming", video.getSupportsStreaming());
         }
      }

      gen.writeEndObject();
   }

   public void serializeWithType(InputMedia value, JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer) throws IOException {
      this.serialize(value, gen, serializers);
   }
}
