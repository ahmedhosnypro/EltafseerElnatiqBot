package com.eltafseer;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class EltafseerElnatiqBot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            long chat_id = update.getMessage().getChatId();
            String message_text = update.getMessage().getText();
            CommandProcessor commander = new CommandProcessor();
            commander.processCommand(message_text, chat_id);
        }
        else if (update.hasCallbackQuery()) {
            // Set variables
            String call_data = update.getCallbackQuery().getData();
            long message_id = update.getCallbackQuery().getMessage().getMessageId();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();
            CallBack callBack = new CallBack();
            callBack.callBack(call_data, message_id, chat_id);
        }
    }

    @Override
    public String getBotUsername() {
        return "EltafseerElnatiqBot";
    }

    @Override
    public String getBotToken() {
        return "1855840023:AAFrQ0LVt9CFtPsLTTCLlyJOiodys29WVWI";
    }
}