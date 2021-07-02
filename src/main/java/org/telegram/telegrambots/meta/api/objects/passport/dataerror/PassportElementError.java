package org.telegram.telegrambots.meta.api.objects.passport.dataerror;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.api.objects.passport.dataerror.serialization.PassportElementErrorDeserializer;

@JsonDeserialize(
   using = PassportElementErrorDeserializer.class
)
public interface PassportElementError extends Validable, BotApiObject {
}
