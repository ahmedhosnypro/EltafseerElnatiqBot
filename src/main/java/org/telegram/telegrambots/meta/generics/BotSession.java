package org.telegram.telegrambots.meta.generics;

public interface BotSession {
   void setOptions(BotOptions var1);

   void setToken(String var1);

   void setCallback(LongPollingBot var1);

   void start();

   void stop();

   boolean isRunning();
}
