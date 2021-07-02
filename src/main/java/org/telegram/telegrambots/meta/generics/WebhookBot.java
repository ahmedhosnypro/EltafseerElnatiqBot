package org.telegram.telegrambots.meta.generics;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.updates.SetWebhook;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public interface WebhookBot extends TelegramBot {
   BotApiMethod<?> onWebhookUpdateReceived(Update var1);

   void setWebhook(SetWebhook var1) throws TelegramApiException;

   String getBotPath();
}
