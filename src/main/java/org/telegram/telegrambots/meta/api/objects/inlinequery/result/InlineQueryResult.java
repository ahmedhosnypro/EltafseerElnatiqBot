package org.telegram.telegrambots.meta.api.objects.inlinequery.result;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.serialization.InlineQueryResultDeserializer;

@JsonDeserialize(
   using = InlineQueryResultDeserializer.class
)
public interface InlineQueryResult extends Validable, BotApiObject {
}
