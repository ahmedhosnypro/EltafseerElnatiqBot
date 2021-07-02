package org.telegram.telegrambots.meta.api.objects.replykeyboard;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.serialization.KeyboardDeserializer;

@JsonDeserialize(
   using = KeyboardDeserializer.class
)
public interface ReplyKeyboard extends BotApiObject, Validable {
}
