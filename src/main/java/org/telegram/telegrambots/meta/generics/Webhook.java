package org.telegram.telegrambots.meta.generics;

import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public interface Webhook {
   void startServer() throws TelegramApiException;

   void registerWebhook(WebhookBot var1);

   void setInternalUrl(String var1);

   void setKeyStore(String var1, String var2) throws TelegramApiException;
}
