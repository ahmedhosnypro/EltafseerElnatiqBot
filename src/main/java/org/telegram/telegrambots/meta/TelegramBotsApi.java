package org.telegram.telegrambots.meta;

import com.google.common.base.Strings;
import java.lang.reflect.InvocationTargetException;
import org.telegram.telegrambots.meta.api.methods.updates.SetWebhook;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.BotSession;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.meta.generics.TelegramBot;
import org.telegram.telegrambots.meta.generics.Webhook;
import org.telegram.telegrambots.meta.generics.WebhookBot;

public class TelegramBotsApi {
   Class<? extends BotSession> botSessionClass;
   private boolean useWebhook;
   private Webhook webhook;

   public TelegramBotsApi(Class<? extends BotSession> botSessionClass) throws TelegramApiException {
      if (botSessionClass == null) {
         throw new TelegramApiException("Parameter botSessionClass can not be null or empty");
      } else {
         this.botSessionClass = botSessionClass;
      }
   }

   public TelegramBotsApi(Class<? extends BotSession> botSessionClass, Webhook webhook) throws TelegramApiException {
      if (botSessionClass == null) {
         throw new TelegramApiException("Parameter botSessionClass can not be null or empty");
      } else if (webhook == null) {
         throw new TelegramApiException("Parameter webhook can not be null or empty");
      } else {
         this.botSessionClass = botSessionClass;
         this.useWebhook = true;
         this.webhook = webhook;
         this.webhook.startServer();
      }
   }

   public BotSession registerBot(LongPollingBot bot) throws TelegramApiException {
      if (bot == null) {
         throw new TelegramApiException("Parameter bot can not be null");
      } else if (!this.validateBotUsernameAndToken(bot)) {
         throw new TelegramApiException("Bot token and username can't be empty");
      } else {
         bot.onRegister();
         bot.clearWebhook();

         BotSession session;
         try {
            session = (BotSession)this.botSessionClass.getConstructor().newInstance();
         } catch (IllegalAccessException | InvocationTargetException | InstantiationException | NoSuchMethodException var4) {
            throw new TelegramApiException(var4);
         }

         session.setToken(bot.getBotToken());
         session.setOptions(bot.getOptions());
         session.setCallback(bot);
         session.start();
         return session;
      }
   }

   public void registerBot(WebhookBot bot, SetWebhook setWebhook) throws TelegramApiException {
      if (setWebhook == null) {
         throw new TelegramApiException("Parameter setWebhook can not be null");
      } else {
         if (this.useWebhook) {
            if (this.webhook == null) {
               throw new TelegramApiException("This instance doesn't support Webhook bot, use correct constructor");
            }

            if (!this.validateBotUsernameAndToken(bot)) {
               throw new TelegramApiException("Bot token and username can't be empty");
            }

            bot.onRegister();
            this.webhook.registerWebhook(bot);
            bot.setWebhook(setWebhook);
         }

      }
   }

   private boolean validateBotUsernameAndToken(TelegramBot telegramBot) {
      return !Strings.isNullOrEmpty(telegramBot.getBotToken()) && !Strings.isNullOrEmpty(telegramBot.getBotUsername());
   }
}
