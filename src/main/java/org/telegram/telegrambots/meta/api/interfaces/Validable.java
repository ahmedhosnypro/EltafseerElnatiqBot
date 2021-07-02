package org.telegram.telegrambots.meta.api.interfaces;

import org.telegram.telegrambots.meta.exceptions.TelegramApiValidationException;

public interface Validable {
   void validate() throws TelegramApiValidationException;
}
