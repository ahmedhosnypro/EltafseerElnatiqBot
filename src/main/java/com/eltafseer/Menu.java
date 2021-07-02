package com.eltafseer;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Menu {
    static InlineKeyboardMarkup markupInline() {
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        LinkedList<InlineKeyboardButton> rowInline = new LinkedList<>();

        for (int i = 0; i < 37; i++) {
            if (rowInline.size() > 2) {
                // Set the keyboard to the markup
                rowsInline.add(rowInline);
                rowInline = new LinkedList<>();
            }
            int j = i + 78;
            InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
            String surahName = SurahNumberArabic.valueOf("s" + j).getName();
            inlineKeyboardButton.setText(j + "- " + surahName);
            inlineKeyboardButton.setCallbackData("s" + j);
            rowInline.addFirst(inlineKeyboardButton);
        }
        if (rowInline.size() < 2) {
            rowsInline.add(rowInline);
        }

        // Add it to the message
        markupInline.setKeyboard(rowsInline);

        return markupInline;
    }

    public static ReplyKeyboardMarkup menu() {
        KeyboardButton button = new KeyboardButton();
        button.setText("قائمة السور");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(button);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        keyboard.setKeyboard(keyboardRows);

        return keyboard;
    }

    public static ReplyKeyboardMarkup surahMenu() {

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        LinkedList<String> buttons = new LinkedList<>();

        for (int i = 0; i < 37; i++) {
            if (buttons.size() > 2) {
                KeyboardRow keyboardRow = new KeyboardRow();
                keyboardRow.addAll(buttons);
                keyboardRows.add(keyboardRow);
                buttons = new LinkedList<>();
            }
            int j = i + 78;
            String surahName = SurahNumberArabic.valueOf("s" + j).getName();
            buttons.addFirst(surahName);
        }
        if (buttons.size() < 2) {
            KeyboardRow keyboardRow = new KeyboardRow();
            keyboardRow.addAll(buttons);
            keyboardRows.add(keyboardRow);
        }

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        keyboard.setKeyboard(keyboardRows);

        return keyboard;
    }
}



//menu
/*
    public void onUpdateReceived(Update update) {

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            if (update.getMessage().getText().equals("/start")) {
                SendMessage message = new SendMessage(); // Create a message object object
                message.setChatId(String.valueOf(chat_id));
                message.setText(message_text);

                KeyboardButton button = new KeyboardButton();
                button.setText("ahmed");

                List<KeyboardButton> keyboardButtons = new ArrayList<>();
                keyboardButtons.add(button);

                KeyboardRow keyboardRow = new KeyboardRow();
                keyboardRow.add("ahmedhosny");
                List<KeyboardRow>  keyboardRows = new ArrayList<>();
                keyboardRows.add(keyboardRow);

                ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
                keyboard.setKeyboard(keyboardRows);

                message.setReplyMarkup(keyboard);
                try {
                    execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else {

            }
        } else if (update.hasCallbackQuery()) {
            // Set variables
            String call_data = update.getCallbackQuery().getData();
            long message_id = update.getCallbackQuery().getMessage().getMessageId();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals("ahmed")) {
                String answer = "Updated message text";
                EditMessageText new_message = new EditMessageText();

                new_message.setChatId(String.valueOf(chat_id));
                new_message.setMessageId(Math.toIntExact(message_id));
                new_message.setText(answer);
                try {
                    execute(new_message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }
     */

//Inline keyboards and editing message's text
/*
    public void onUpdateReceived(Update update) {

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
            if (update.getMessage().getText().equals("/start")) {
                SendMessage message = new SendMessage(); // Create a message object object
                message.setChatId(String.valueOf(chat_id));
                message.setText(message_text);

                InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
                List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
                List<InlineKeyboardButton> rowInline = new ArrayList<>();
                InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();

                inlineKeyboardButton.setText("Update message text");
                inlineKeyboardButton.setCallbackData("update_msg_text");
                rowInline.add(inlineKeyboardButton);

                // Set the keyboard to the markup
                rowsInline.add(rowInline);
                // Add it to the message
                markupInline.setKeyboard(rowsInline);
                message.setReplyMarkup(markupInline);

                try {
                    execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else {

            }
        } else if (update.hasCallbackQuery()) {
            // Set variables
            String call_data = update.getCallbackQuery().getData();
            long message_id = update.getCallbackQuery().getMessage().getMessageId();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals("update_msg_text")) {
                String answer = "Updated message text";
                EditMessageText new_message = new EditMessageText();

                new_message.setChatId(String.valueOf(chat_id));
                new_message.setMessageId(Math.toIntExact(message_id));
                new_message.setText(answer);
                try {
                    execute(new_message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }
*/