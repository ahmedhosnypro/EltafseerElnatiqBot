package com.eltafseer;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CommandProcessor extends EltafseerElnatiqBot {
    void processCommand(String message_text, long chat_id) {
        if (message_text.startsWith("s")) {
            Command command = Command.start;
            try {
                command = Command.valueOf(message_text.toLowerCase().replaceAll("/", ""));
            } catch (IllegalArgumentException ignored) {
            }
            switch (command) {
                case start -> start(chat_id);
            }
        } else if (message_text.equals("قائمة السور")) {
            select(chat_id);
        } else {
            showSurahContentMenu(message_text, chat_id);
        }
    }

    void start(long chat_id) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chat_id));
        message.setText("التفسير الناطق لفضيلة الشيخ وحيد بالي");
        message.setReplyMarkup(Menu.menu());

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    void select(long chat_id) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chat_id));
        message.setText("اختر سورة لعرض تفسيرها");
//        message.setReplyMarkup(markupInline());
        message.setReplyMarkup(Menu.surahMenu());
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    void showSurahContentMenu(String message_text, long chat_id) {
        try {
            surahNameArabic surahNameArabic = com.eltafseer.surahNameArabic.valueOf(message_text);
            SurahNumberArabic surah = surahNameArabic.getSurahNumberArabic();
            String[] surahTafseer = surah.getContent();

            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
            List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
            LinkedList<InlineKeyboardButton> rowInline = new LinkedList<>();
            String high = "جودة عالية 1080p";
            String medium = "جودة متوسطة 720p";
            String low = "جودة منخفضة 360p";

            if (surahTafseer.length == 3) {
                InlineKeyboardButton highButton = new InlineKeyboardButton();
                highButton.setText(high);
                highButton.setCallbackData("high " + surah);

                InlineKeyboardButton mediumButton = new InlineKeyboardButton();
                mediumButton.setText(medium);
                mediumButton.setCallbackData("medium " + surah);

                InlineKeyboardButton lowButton = new InlineKeyboardButton();
                lowButton.setText(low);
                lowButton.setCallbackData("low " + surah);

                rowInline.addFirst(highButton);
                rowInline.addFirst(mediumButton);
                rowInline.addFirst(lowButton);
                rowsInline.add(rowInline);
                markupInline.setKeyboard(rowsInline);
            } else if (surahTafseer.length == 2) {
                InlineKeyboardButton mediumButton = new InlineKeyboardButton();
                mediumButton.setText(medium);
                mediumButton.setCallbackData("medium " + surah);

                InlineKeyboardButton lowButton = new InlineKeyboardButton();
                lowButton.setText(low);
                lowButton.setCallbackData("low " + surah);

                rowInline.addFirst(mediumButton);
                rowInline.addFirst(lowButton);
                rowsInline.add(rowInline);
                markupInline.setKeyboard(rowsInline);
            }
            String answer = "التفسير الناطق لفضيلة الشيخ وحيد بالي\n" +
                    "سورة " +
                    surah.getName() +
                    " \uD83C\uDF3F\uD83C\uDF3F" +
                    "\n" +
                    "\uD83D\uDC4C اختر الجودة المناسبة لك \uD83D\uDC4C";



            SendMessage send = new SendMessage();
            send.setChatId(String.valueOf(chat_id));
            send.setText(answer);

            send.setReplyMarkup(markupInline);
            try {
                execute(send);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        } catch (IllegalArgumentException e) {
            start(chat_id);
        }

    }
}
