package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.Serializable;
import org.telegram.telegrambots.meta.api.interfaces.Validable;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public abstract class PartialBotApiMethod<T extends Serializable> implements Validable {
   @JsonIgnore
   protected static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

   public abstract T deserializeResponse(String var1) throws TelegramApiRequestException;
}
