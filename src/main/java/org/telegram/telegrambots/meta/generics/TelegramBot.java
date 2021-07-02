package org.telegram.telegrambots.meta.generics;

public interface TelegramBot {
   String getBotUsername();

   String getBotToken();

   default void onRegister() {
   }
}
