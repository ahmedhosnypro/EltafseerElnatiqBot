package org.telegram.telegrambots.meta.updateshandlers;

import java.io.Serializable;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public interface SentCallback<T extends Serializable> {
   void onResult(BotApiMethod<T> var1, T var2);

   void onError(BotApiMethod<T> var1, TelegramApiRequestException var2);

   void onException(BotApiMethod<T> var1, Exception var2);
}
