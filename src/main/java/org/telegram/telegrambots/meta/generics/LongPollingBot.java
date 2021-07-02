package org.telegram.telegrambots.meta.generics;

import java.util.List;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public interface LongPollingBot extends TelegramBot {
   void onUpdateReceived(Update var1);

   default void onUpdatesReceived(List<Update> updates) {
      updates.forEach(this::onUpdateReceived);
   }

   BotOptions getOptions();

   void clearWebhook() throws TelegramApiRequestException;

   default void onClosing() {
   }
}
