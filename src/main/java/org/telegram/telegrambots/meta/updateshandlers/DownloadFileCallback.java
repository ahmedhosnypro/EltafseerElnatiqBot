package org.telegram.telegrambots.meta.updateshandlers;

import java.io.File;

public interface DownloadFileCallback<T> {
   void onResult(T var1, File var2);

   void onException(T var1, Exception var2);
}
