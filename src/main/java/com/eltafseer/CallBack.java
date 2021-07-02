package com.eltafseer;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CallBack extends EltafseerElnatiqBot {
    void callBack(String call_data, long message_id, long chat_id) {
        if (call_data.startsWith("s")) {
            callBack_S(call_data, message_id, chat_id);
        } else {
            callBack_else(call_data, message_id, chat_id);
        }
    }

    void callBack_S(String call_data, long message_id, long chat_id) {
        SurahNumberArabic surah;
        try {
            surah = SurahNumberArabic.valueOf(call_data);

            String[] surahTafseer = surah.getContent();
            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
            List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
            LinkedList<InlineKeyboardButton> rowInline = new LinkedList<>();
            String high = "جودة عالية 1080p";
            String medium = "جودة متوسطة 720p";
            String low = "جودة منخفضة 360p";

            if (surahTafseer.length == 3) {
                InlineKeyboardButton highButton = new InlineKeyboardButton();
                highButton.setText("جودة عالية 1080p");
                highButton.setCallbackData("high " + surah);

                InlineKeyboardButton mediumButton = new InlineKeyboardButton();
                mediumButton.setText("جودة متوسطة 720p");
                mediumButton.setCallbackData("medium " + surah);

                InlineKeyboardButton lowButton = new InlineKeyboardButton();
                lowButton.setText("جودة منخفضة 360p");
                lowButton.setCallbackData("low " + surah);

                rowInline.addFirst(highButton);
                rowInline.addFirst(mediumButton);
                rowInline.addFirst(lowButton);
                rowsInline.add(rowInline);
                markupInline.setKeyboard(rowsInline);
            } else if (surahTafseer.length == 2) {
                InlineKeyboardButton mediumButton = new InlineKeyboardButton();
                mediumButton.setText("جودة متوسطة 720p");
                mediumButton.setCallbackData("medium " + surah);

                InlineKeyboardButton lowButton = new InlineKeyboardButton();
                lowButton.setText("جودة منخفضة 360p");
                lowButton.setCallbackData("low " + surah);

                rowInline.addFirst(mediumButton);
                rowInline.addFirst(lowButton);
                rowsInline.add(rowInline);
                markupInline.setKeyboard(rowsInline);
            }
            String answer = "التفسير الناطق لفضيلة الشيخ وحيد بالي\n" +
                    "سورة " + surah.getName();


            SendMessage send = new SendMessage();
            send.setChatId(String.valueOf(chat_id));
            send.setText(answer);

            send.setReplyMarkup(markupInline);
            try {
                execute(send);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        } catch (IllegalArgumentException ignored) {
        }
    }

    void callBack_else(String call_data, long message_id, long chat_id) {
        String[] data = call_data.split(" ");
        String quality = data[0];
        String surahName = data[1];


        SendMessage send = new SendMessage();
        send.setChatId(String.valueOf(chat_id));

        SurahNumberArabic surah;
        try {
            surah = SurahNumberArabic.valueOf(surahName);
            String[] surahTafseer = surah.getContent();
            if (surahTafseer.length == 3) {
                switch (quality) {
                    case "high" -> send.setText(surahTafseer[0]);
                    case "medium" -> send.setText(surahTafseer[1]);
                    case "low" -> send.setText(surahTafseer[2]);
                }
            } else if (surahTafseer.length == 2) {
                switch (quality) {
                    case "medium" -> send.setText(surahTafseer[0]);
                    case "low" -> send.setText(surahTafseer[1]);
                }
            }
            try {
                execute(send);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } catch (IllegalArgumentException ignored) {
        }
    }
}

/*
        String command = update.getMessage().getText();
        SendMessage send = new SendMessage();
        InlineKeyboardButton buttons = new InlineKeyboardButton();
        send.setText("اختر السورة " +
                "/elnbaa"
                + "\nselect command /start");
        switch (command) {
            case "/start":
                send.setText("hello");
                break;
            case "/elnbaa":
                send.setText("https://t.me/wahidbaly_tafseerNateq/37");
                send.setChatId(String.valueOf(update.getMessage().getChatId()));
                try {
                    execute(send);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

                send.setText("https://t.me/wahidbaly_tafseerNateq/41");
                try {
                    execute(send);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

                break;
            default:
                break;
        }


        send.setChatId(String.valueOf(update.getMessage().getChatId()));
        try {
            execute(send);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

 */