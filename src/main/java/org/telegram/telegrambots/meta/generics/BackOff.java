package org.telegram.telegrambots.meta.generics;

public interface BackOff {
   void reset();

   long nextBackOffMillis();
}
