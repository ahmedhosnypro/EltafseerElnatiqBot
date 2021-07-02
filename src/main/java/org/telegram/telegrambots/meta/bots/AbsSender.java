package org.telegram.telegrambots.meta.bots;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.GetMe;
import org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendAnimation;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMediaGroup;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.methods.send.SendVideoNote;
import org.telegram.telegrambots.meta.api.methods.send.SendVoice;
import org.telegram.telegrambots.meta.api.methods.stickers.AddStickerToSet;
import org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet;
import org.telegram.telegrambots.meta.api.methods.stickers.SetStickerSetThumb;
import org.telegram.telegrambots.meta.api.methods.stickers.UploadStickerFile;
import org.telegram.telegrambots.meta.api.methods.updates.GetWebhookInfo;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.WebhookInfo;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.updateshandlers.SentCallback;

public abstract class AbsSender {
   protected AbsSender() {
   }

   public <T extends Serializable, Method extends BotApiMethod<T>, Callback extends SentCallback<T>> void executeAsync(Method method, Callback callback) throws TelegramApiException {
      if (method == null) {
         throw new TelegramApiException("Parameter method can not be null");
      } else if (callback == null) {
         throw new TelegramApiException("Parameter callback can not be null");
      } else {
         this.sendApiMethodAsync(method, callback);
      }
   }

   public <T extends Serializable, Method extends BotApiMethod<T>> CompletableFuture<T> executeAsync(Method method) throws TelegramApiException {
      if (method == null) {
         throw new TelegramApiException("Parameter method can not be null");
      } else {
         return this.sendApiMethodAsync(method);
      }
   }

   public <T extends Serializable, Method extends BotApiMethod<T>> T execute(Method method) throws TelegramApiException {
      if (method == null) {
         throw new TelegramApiException("Parameter method can not be null");
      } else {
         return this.sendApiMethod(method);
      }
   }

   public final User getMe() throws TelegramApiException {
      return (User)this.sendApiMethod(new GetMe());
   }

   public final WebhookInfo getWebhookInfo() throws TelegramApiException {
      GetWebhookInfo getWebhookInfo = new GetWebhookInfo();
      return (WebhookInfo)this.sendApiMethod(getWebhookInfo);
   }

   public final CompletableFuture<User> getMeAsync() {
      return this.sendApiMethodAsync(new GetMe());
   }

   public final CompletableFuture<WebhookInfo> getWebhookInfoAsync() {
      return this.sendApiMethodAsync(new GetWebhookInfo());
   }

   public final void getMeAsync(SentCallback<User> sentCallback) throws TelegramApiException {
      if (sentCallback == null) {
         throw new TelegramApiException("Parameter sentCallback can not be null");
      } else {
         this.sendApiMethodAsync(new GetMe(), sentCallback);
      }
   }

   public final void getWebhookInfoAsync(SentCallback<WebhookInfo> sentCallback) throws TelegramApiException {
      if (sentCallback == null) {
         throw new TelegramApiException("Parameter sentCallback can not be null");
      } else {
         this.sendApiMethodAsync(new GetWebhookInfo(), sentCallback);
      }
   }

   public abstract Message execute(SendDocument var1) throws TelegramApiException;

   public abstract Message execute(SendPhoto var1) throws TelegramApiException;

   public abstract Message execute(SendVideo var1) throws TelegramApiException;

   public abstract Message execute(SendVideoNote var1) throws TelegramApiException;

   public abstract Message execute(SendSticker var1) throws TelegramApiException;

   public abstract Message execute(SendAudio var1) throws TelegramApiException;

   public abstract Message execute(SendVoice var1) throws TelegramApiException;

   public abstract List<Message> execute(SendMediaGroup var1) throws TelegramApiException;

   public abstract Boolean execute(SetChatPhoto var1) throws TelegramApiException;

   public abstract Boolean execute(AddStickerToSet var1) throws TelegramApiException;

   public abstract Boolean execute(SetStickerSetThumb var1) throws TelegramApiException;

   public abstract Boolean execute(CreateNewStickerSet var1) throws TelegramApiException;

   public abstract File execute(UploadStickerFile var1) throws TelegramApiException;

   public abstract Serializable execute(EditMessageMedia var1) throws TelegramApiException;

   public abstract Message execute(SendAnimation var1) throws TelegramApiException;

   public abstract CompletableFuture<Message> executeAsync(SendDocument var1);

   public abstract CompletableFuture<Message> executeAsync(SendPhoto var1);

   public abstract CompletableFuture<Message> executeAsync(SendVideo var1);

   public abstract CompletableFuture<Message> executeAsync(SendVideoNote var1);

   public abstract CompletableFuture<Message> executeAsync(SendSticker var1);

   public abstract CompletableFuture<Message> executeAsync(SendAudio var1);

   public abstract CompletableFuture<Message> executeAsync(SendVoice var1);

   public abstract CompletableFuture<List<Message>> executeAsync(SendMediaGroup var1);

   public abstract CompletableFuture<Boolean> executeAsync(SetChatPhoto var1);

   public abstract CompletableFuture<Boolean> executeAsync(AddStickerToSet var1);

   public abstract CompletableFuture<Boolean> executeAsync(SetStickerSetThumb var1);

   public abstract CompletableFuture<Boolean> executeAsync(CreateNewStickerSet var1);

   public abstract CompletableFuture<File> executeAsync(UploadStickerFile var1);

   public abstract CompletableFuture<Serializable> executeAsync(EditMessageMedia var1);

   public abstract CompletableFuture<Message> executeAsync(SendAnimation var1);

   protected abstract <T extends Serializable, Method extends BotApiMethod<T>, Callback extends SentCallback<T>> void sendApiMethodAsync(Method var1, Callback var2);

   protected abstract <T extends Serializable, Method extends BotApiMethod<T>> CompletableFuture<T> sendApiMethodAsync(Method var1);

   protected abstract <T extends Serializable, Method extends BotApiMethod<T>> T sendApiMethod(Method var1) throws TelegramApiException;
}
