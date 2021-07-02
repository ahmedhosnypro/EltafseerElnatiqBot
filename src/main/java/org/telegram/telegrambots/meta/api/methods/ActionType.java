package org.telegram.telegrambots.meta.api.methods;

public enum ActionType {
   TYPING("typing"),
   RECORDVIDEO("record_video"),
   RECORDVIDEONOTE("record_video_note"),
   /** @deprecated */
   @Deprecated
   RECORDAUDIO("record_audio"),
   RECORDVOICE("record_voice"),
   UPLOADPHOTO("upload_photo"),
   UPLOADVIDEO("upload_video"),
   UPLOADVIDEONOTE("upload_video_note"),
   /** @deprecated */
   @Deprecated
   UPLOADAUDIO("upload_audio"),
   UPLOADVOICE("upload_voice"),
   UPLOADDOCUMENT("upload_document"),
   FINDLOCATION("find_location");

   private final String text;

   private ActionType(String text) {
      this.text = text;
   }

   public String toString() {
      return this.text;
   }

   public static ActionType get(String text) {
      if (text == null) {
         return null;
      } else {
         byte var2 = -1;
         switch(text.hashCode()) {
         case -2125976984:
            if (text.equals("record_audio")) {
               var2 = 3;
            }
            break;
         case -2106940659:
            if (text.equals("record_video")) {
               var2 = 1;
            }
            break;
         case -2106757180:
            if (text.equals("record_voice")) {
               var2 = 4;
            }
            break;
         case -1499064780:
            if (text.equals("upload_video_note")) {
               var2 = 7;
            }
            break;
         case -1361983464:
            if (text.equals("upload_audio")) {
               var2 = 8;
            }
            break;
         case -1348507020:
            if (text.equals("upload_photo")) {
               var2 = 5;
            }
            break;
         case -1342947139:
            if (text.equals("upload_video")) {
               var2 = 6;
            }
            break;
         case -1342763660:
            if (text.equals("upload_voice")) {
               var2 = 9;
            }
            break;
         case -1319066140:
            if (text.equals("record_video_note")) {
               var2 = 2;
            }
            break;
         case -858798729:
            if (text.equals("typing")) {
               var2 = 0;
            }
            break;
         case -407427687:
            if (text.equals("upload_document")) {
               var2 = 10;
            }
            break;
         case 230374267:
            if (text.equals("find_location")) {
               var2 = 11;
            }
         }

         switch(var2) {
         case 0:
            return TYPING;
         case 1:
            return RECORDVIDEO;
         case 2:
            return RECORDVIDEONOTE;
         case 3:
         case 4:
            return RECORDVOICE;
         case 5:
            return UPLOADPHOTO;
         case 6:
            return UPLOADVIDEO;
         case 7:
            return UPLOADVIDEONOTE;
         case 8:
         case 9:
            return UPLOADVOICE;
         case 10:
            return UPLOADDOCUMENT;
         case 11:
            return FINDLOCATION;
         default:
            return null;
         }
      }
   }
}
