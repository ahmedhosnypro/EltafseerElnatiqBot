package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.games.Animation;
import org.telegram.telegrambots.meta.api.objects.games.Game;
import org.telegram.telegrambots.meta.api.objects.passport.PassportData;
import org.telegram.telegrambots.meta.api.objects.payments.Invoice;
import org.telegram.telegrambots.meta.api.objects.payments.SuccessfulPayment;
import org.telegram.telegrambots.meta.api.objects.polls.Poll;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.stickers.Sticker;
import org.telegram.telegrambots.meta.api.objects.voicechat.VoiceChatEnded;
import org.telegram.telegrambots.meta.api.objects.voicechat.VoiceChatParticipantsInvited;
import org.telegram.telegrambots.meta.api.objects.voicechat.VoiceChatScheduled;
import org.telegram.telegrambots.meta.api.objects.voicechat.VoiceChatStarted;

public class Message implements BotApiObject {
   private static final String MESSAGEID_FIELD = "message_id";
   private static final String FROM_FIELD = "from";
   private static final String DATE_FIELD = "date";
   private static final String CHAT_FIELD = "chat";
   private static final String FORWARDFROM_FIELD = "forward_from";
   private static final String FORWARDFROMCHAT_FIELD = "forward_from_chat";
   private static final String FORWARDDATE_FIELD = "forward_date";
   private static final String TEXT_FIELD = "text";
   private static final String ENTITIES_FIELD = "entities";
   private static final String CAPTIONENTITIES_FIELD = "caption_entities";
   private static final String AUDIO_FIELD = "audio";
   private static final String DOCUMENT_FIELD = "document";
   private static final String PHOTO_FIELD = "photo";
   private static final String STICKER_FIELD = "sticker";
   private static final String VIDEO_FIELD = "video";
   private static final String CONTACT_FIELD = "contact";
   private static final String LOCATION_FIELD = "location";
   private static final String VENUE_FIELD = "venue";
   private static final String ANIMATION_FIELD = "animation";
   private static final String PINNED_MESSAGE_FIELD = "pinned_message";
   private static final String NEWCHATMEMBERS_FIELD = "new_chat_members";
   private static final String LEFTCHATMEMBER_FIELD = "left_chat_member";
   private static final String NEWCHATTITLE_FIELD = "new_chat_title";
   private static final String NEWCHATPHOTO_FIELD = "new_chat_photo";
   private static final String DELETECHATPHOTO_FIELD = "delete_chat_photo";
   private static final String GROUPCHATCREATED_FIELD = "group_chat_created";
   private static final String REPLYTOMESSAGE_FIELD = "reply_to_message";
   private static final String VOICE_FIELD = "voice";
   private static final String CAPTION_FIELD = "caption";
   private static final String SUPERGROUPCREATED_FIELD = "supergroup_chat_created";
   private static final String CHANNELCHATCREATED_FIELD = "channel_chat_created";
   private static final String MIGRATETOCHAT_FIELD = "migrate_to_chat_id";
   private static final String MIGRATEFROMCHAT_FIELD = "migrate_from_chat_id";
   private static final String EDITDATE_FIELD = "edit_date";
   private static final String GAME_FIELD = "game";
   private static final String FORWARDFROMMESSAGEID_FIELD = "forward_from_message_id";
   private static final String INVOICE_FIELD = "invoice";
   private static final String SUCCESSFUL_PAYMENT_FIELD = "successful_payment";
   private static final String VIDEO_NOTE_FIELD = "video_note";
   private static final String AUTHORSIGNATURE_FIELD = "author_signature";
   private static final String FORWARDSIGNATURE_FIELD = "forward_signature";
   private static final String MEDIAGROUPID_FIELD = "media_group_id";
   private static final String CONNECTEDWEBSITE_FIELD = "connected_website";
   private static final String PASSPORTDATA_FIELD = "passport_data";
   private static final String FORWARDSENDERNAME_FIELD = "forward_sender_name";
   private static final String POLL_FIELD = "poll";
   private static final String REPLY_MARKUP_FIELD = "reply_markup";
   private static final String DICE_FIELD = "dice";
   private static final String VIABOT_FIELD = "via_bot";
   private static final String SENDERCHAT_FIELD = "sender_chat";
   private static final String PROXIMITYALERTTRIGGERED_FIELD = "proximity_alert_triggered";
   private static final String MESSAGEAUTODELETETIMERCHANGED_FIELD = "message_auto_delete_timer_changed";
   private static final String VOICECHATSTARTED_FIELD = "voice_chat_started";
   private static final String VOICECHATENDED_FIELD = "voice_chat_ended";
   private static final String VOICECHATPARTICIPANTSINVITED_FIELD = "voice_chat_participants_invited";
   private static final String VOICECHATSCHEDULED_FIELD = "voice_chat_scheduled";
   @JsonProperty("message_id")
   private Integer messageId;
   @JsonProperty("from")
   private User from;
   @JsonProperty("date")
   private Integer date;
   @JsonProperty("chat")
   private Chat chat;
   @JsonProperty("forward_from")
   private User forwardFrom;
   @JsonProperty("forward_from_chat")
   private Chat forwardFromChat;
   @JsonProperty("forward_date")
   private Integer forwardDate;
   @JsonProperty("text")
   private String text;
   @JsonProperty("entities")
   private List<MessageEntity> entities;
   @JsonProperty("caption_entities")
   private List<MessageEntity> captionEntities;
   @JsonProperty("audio")
   private Audio audio;
   @JsonProperty("document")
   private Document document;
   @JsonProperty("photo")
   private List<PhotoSize> photo;
   @JsonProperty("sticker")
   private Sticker sticker;
   @JsonProperty("video")
   private Video video;
   @JsonProperty("contact")
   private Contact contact;
   @JsonProperty("location")
   private Location location;
   @JsonProperty("venue")
   private Venue venue;
   @JsonProperty("animation")
   private Animation animation;
   @JsonProperty("pinned_message")
   private Message pinnedMessage;
   @JsonProperty("new_chat_members")
   private List<User> newChatMembers;
   @JsonProperty("left_chat_member")
   private User leftChatMember;
   @JsonProperty("new_chat_title")
   private String newChatTitle;
   @JsonProperty("new_chat_photo")
   private List<PhotoSize> newChatPhoto;
   @JsonProperty("delete_chat_photo")
   private Boolean deleteChatPhoto;
   @JsonProperty("group_chat_created")
   private Boolean groupchatCreated;
   @JsonProperty("reply_to_message")
   private Message replyToMessage;
   @JsonProperty("voice")
   private Voice voice;
   @JsonProperty("caption")
   private String caption;
   @JsonProperty("supergroup_chat_created")
   private Boolean superGroupCreated;
   @JsonProperty("channel_chat_created")
   private Boolean channelChatCreated;
   @JsonProperty("migrate_to_chat_id")
   private Long migrateToChatId;
   @JsonProperty("migrate_from_chat_id")
   private Long migrateFromChatId;
   @JsonProperty("edit_date")
   private Integer editDate;
   @JsonProperty("game")
   private Game game;
   @JsonProperty("forward_from_message_id")
   private Integer forwardFromMessageId;
   @JsonProperty("invoice")
   private Invoice invoice;
   @JsonProperty("successful_payment")
   private SuccessfulPayment successfulPayment;
   @JsonProperty("video_note")
   private VideoNote videoNote;
   @JsonProperty("author_signature")
   private String authorSignature;
   @JsonProperty("forward_signature")
   private String forwardSignature;
   @JsonProperty("media_group_id")
   private String mediaGroupId;
   @JsonProperty("connected_website")
   private String connectedWebsite;
   @JsonProperty("passport_data")
   private PassportData passportData;
   @JsonProperty("forward_sender_name")
   private String forwardSenderName;
   @JsonProperty("poll")
   private Poll poll;
   @JsonProperty("reply_markup")
   private InlineKeyboardMarkup replyMarkup;
   @JsonProperty("dice")
   private Dice dice;
   @JsonProperty("via_bot")
   private User viaBot;
   @JsonProperty("sender_chat")
   private Chat senderChat;
   @JsonProperty("proximity_alert_triggered")
   private ProximityAlertTriggered proximityAlertTriggered;
   @JsonProperty("message_auto_delete_timer_changed")
   private MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;
   @JsonProperty("voice_chat_started")
   private VoiceChatStarted voiceChatStarted;
   @JsonProperty("voice_chat_ended")
   private VoiceChatEnded voiceChatEnded;
   @JsonProperty("voice_chat_participants_invited")
   private VoiceChatParticipantsInvited voiceChatParticipantsInvited;
   @JsonProperty("voice_chat_scheduled")
   private VoiceChatScheduled voiceChatScheduled;

   public List<MessageEntity> getEntities() {
      if (this.entities != null) {
         this.entities.forEach((x) -> {
            x.computeText(this.text);
         });
      }

      return this.entities;
   }

   public List<MessageEntity> getCaptionEntities() {
      if (this.captionEntities != null) {
         this.captionEntities.forEach((x) -> {
            x.computeText(this.caption);
         });
      }

      return this.captionEntities;
   }

   @JsonIgnore
   public List<User> getNewChatMembers() {
      return (List)(this.newChatMembers == null ? new ArrayList() : this.newChatMembers);
   }

   @JsonIgnore
   public boolean hasSticker() {
      return this.sticker != null;
   }

   @JsonIgnore
   public boolean isGroupMessage() {
      return this.chat.isGroupChat();
   }

   @JsonIgnore
   public boolean isUserMessage() {
      return this.chat.isUserChat();
   }

   @JsonIgnore
   public boolean isChannelMessage() {
      return this.chat.isChannelChat();
   }

   @JsonIgnore
   public boolean isSuperGroupMessage() {
      return this.chat.isSuperGroupChat();
   }

   @JsonIgnore
   public Long getChatId() {
      return this.chat.getId();
   }

   @JsonIgnore
   public boolean hasText() {
      return this.text != null && !this.text.isEmpty();
   }

   @JsonIgnore
   public boolean isCommand() {
      if (this.hasText() && this.entities != null) {
         Iterator var1 = this.entities.iterator();

         while(var1.hasNext()) {
            MessageEntity entity = (MessageEntity)var1.next();
            if (entity != null && entity.getOffset() == 0 && "bot_command".equals(entity.getType())) {
               return true;
            }
         }
      }

      return false;
   }

   @JsonIgnore
   public boolean hasDocument() {
      return this.document != null;
   }

   @JsonIgnore
   public boolean hasVideo() {
      return this.video != null;
   }

   @JsonIgnore
   public boolean hasAudio() {
      return this.audio != null;
   }

   @JsonIgnore
   public boolean hasVoice() {
      return this.voice != null;
   }

   @JsonIgnore
   public boolean isReply() {
      return this.replyToMessage != null;
   }

   @JsonIgnore
   public boolean hasLocation() {
      return this.location != null;
   }

   @JsonIgnore
   private boolean hasGame() {
      return this.game != null;
   }

   @JsonIgnore
   public boolean hasEntities() {
      return this.entities != null && !this.entities.isEmpty();
   }

   @JsonIgnore
   public boolean hasPhoto() {
      return this.photo != null && !this.photo.isEmpty();
   }

   @JsonIgnore
   public boolean hasInvoice() {
      return this.invoice != null;
   }

   @JsonIgnore
   public boolean hasSuccessfulPayment() {
      return this.successfulPayment != null;
   }

   @JsonIgnore
   public boolean hasContact() {
      return this.contact != null;
   }

   @JsonIgnore
   public boolean hasVideoNote() {
      return this.videoNote != null;
   }

   @JsonIgnore
   public boolean hasPassportData() {
      return this.passportData != null;
   }

   @JsonIgnore
   public boolean hasAnimation() {
      return this.animation != null;
   }

   @JsonIgnore
   public boolean hasPoll() {
      return this.poll != null;
   }

   @JsonIgnore
   public boolean hasDice() {
      return this.dice != null;
   }

   @JsonIgnore
   public boolean hasViaBot() {
      return this.viaBot != null;
   }

   @JsonIgnore
   public boolean hasReplyMarkup() {
      return this.replyMarkup != null;
   }

   @JsonIgnore
   private boolean hasMessageAutoDeleteTimerChanged() {
      return this.messageAutoDeleteTimerChanged != null;
   }

   @JsonIgnore
   private boolean hasVoiceChatStarted() {
      return this.voiceChatStarted != null;
   }

   @JsonIgnore
   private boolean hasVoiceChatEnded() {
      return this.voiceChatEnded != null;
   }

   @JsonIgnore
   private boolean hasVoiceChatScheduled() {
      return this.voiceChatScheduled != null;
   }

   @JsonIgnore
   private boolean hasVoiceChatParticipantsInvited() {
      return this.voiceChatParticipantsInvited != null;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Message)) {
         return false;
      } else {
         Message other = (Message)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label683: {
               Object this$messageId = this.getMessageId();
               Object other$messageId = other.getMessageId();
               if (this$messageId == null) {
                  if (other$messageId == null) {
                     break label683;
                  }
               } else if (this$messageId.equals(other$messageId)) {
                  break label683;
               }

               return false;
            }

            Object this$date = this.getDate();
            Object other$date = other.getDate();
            if (this$date == null) {
               if (other$date != null) {
                  return false;
               }
            } else if (!this$date.equals(other$date)) {
               return false;
            }

            Object this$forwardDate = this.getForwardDate();
            Object other$forwardDate = other.getForwardDate();
            if (this$forwardDate == null) {
               if (other$forwardDate != null) {
                  return false;
               }
            } else if (!this$forwardDate.equals(other$forwardDate)) {
               return false;
            }

            label662: {
               Object this$deleteChatPhoto = this.getDeleteChatPhoto();
               Object other$deleteChatPhoto = other.getDeleteChatPhoto();
               if (this$deleteChatPhoto == null) {
                  if (other$deleteChatPhoto == null) {
                     break label662;
                  }
               } else if (this$deleteChatPhoto.equals(other$deleteChatPhoto)) {
                  break label662;
               }

               return false;
            }

            label655: {
               Object this$groupchatCreated = this.getGroupchatCreated();
               Object other$groupchatCreated = other.getGroupchatCreated();
               if (this$groupchatCreated == null) {
                  if (other$groupchatCreated == null) {
                     break label655;
                  }
               } else if (this$groupchatCreated.equals(other$groupchatCreated)) {
                  break label655;
               }

               return false;
            }

            label648: {
               Object this$superGroupCreated = this.getSuperGroupCreated();
               Object other$superGroupCreated = other.getSuperGroupCreated();
               if (this$superGroupCreated == null) {
                  if (other$superGroupCreated == null) {
                     break label648;
                  }
               } else if (this$superGroupCreated.equals(other$superGroupCreated)) {
                  break label648;
               }

               return false;
            }

            Object this$channelChatCreated = this.getChannelChatCreated();
            Object other$channelChatCreated = other.getChannelChatCreated();
            if (this$channelChatCreated == null) {
               if (other$channelChatCreated != null) {
                  return false;
               }
            } else if (!this$channelChatCreated.equals(other$channelChatCreated)) {
               return false;
            }

            label634: {
               Object this$migrateToChatId = this.getMigrateToChatId();
               Object other$migrateToChatId = other.getMigrateToChatId();
               if (this$migrateToChatId == null) {
                  if (other$migrateToChatId == null) {
                     break label634;
                  }
               } else if (this$migrateToChatId.equals(other$migrateToChatId)) {
                  break label634;
               }

               return false;
            }

            Object this$migrateFromChatId = this.getMigrateFromChatId();
            Object other$migrateFromChatId = other.getMigrateFromChatId();
            if (this$migrateFromChatId == null) {
               if (other$migrateFromChatId != null) {
                  return false;
               }
            } else if (!this$migrateFromChatId.equals(other$migrateFromChatId)) {
               return false;
            }

            label620: {
               Object this$editDate = this.getEditDate();
               Object other$editDate = other.getEditDate();
               if (this$editDate == null) {
                  if (other$editDate == null) {
                     break label620;
                  }
               } else if (this$editDate.equals(other$editDate)) {
                  break label620;
               }

               return false;
            }

            Object this$forwardFromMessageId = this.getForwardFromMessageId();
            Object other$forwardFromMessageId = other.getForwardFromMessageId();
            if (this$forwardFromMessageId == null) {
               if (other$forwardFromMessageId != null) {
                  return false;
               }
            } else if (!this$forwardFromMessageId.equals(other$forwardFromMessageId)) {
               return false;
            }

            Object this$from = this.getFrom();
            Object other$from = other.getFrom();
            if (this$from == null) {
               if (other$from != null) {
                  return false;
               }
            } else if (!this$from.equals(other$from)) {
               return false;
            }

            label599: {
               Object this$chat = this.getChat();
               Object other$chat = other.getChat();
               if (this$chat == null) {
                  if (other$chat == null) {
                     break label599;
                  }
               } else if (this$chat.equals(other$chat)) {
                  break label599;
               }

               return false;
            }

            label592: {
               Object this$forwardFrom = this.getForwardFrom();
               Object other$forwardFrom = other.getForwardFrom();
               if (this$forwardFrom == null) {
                  if (other$forwardFrom == null) {
                     break label592;
                  }
               } else if (this$forwardFrom.equals(other$forwardFrom)) {
                  break label592;
               }

               return false;
            }

            Object this$forwardFromChat = this.getForwardFromChat();
            Object other$forwardFromChat = other.getForwardFromChat();
            if (this$forwardFromChat == null) {
               if (other$forwardFromChat != null) {
                  return false;
               }
            } else if (!this$forwardFromChat.equals(other$forwardFromChat)) {
               return false;
            }

            Object this$text = this.getText();
            Object other$text = other.getText();
            if (this$text == null) {
               if (other$text != null) {
                  return false;
               }
            } else if (!this$text.equals(other$text)) {
               return false;
            }

            label571: {
               Object this$entities = this.getEntities();
               Object other$entities = other.getEntities();
               if (this$entities == null) {
                  if (other$entities == null) {
                     break label571;
                  }
               } else if (this$entities.equals(other$entities)) {
                  break label571;
               }

               return false;
            }

            Object this$captionEntities = this.getCaptionEntities();
            Object other$captionEntities = other.getCaptionEntities();
            if (this$captionEntities == null) {
               if (other$captionEntities != null) {
                  return false;
               }
            } else if (!this$captionEntities.equals(other$captionEntities)) {
               return false;
            }

            Object this$audio = this.getAudio();
            Object other$audio = other.getAudio();
            if (this$audio == null) {
               if (other$audio != null) {
                  return false;
               }
            } else if (!this$audio.equals(other$audio)) {
               return false;
            }

            label550: {
               Object this$document = this.getDocument();
               Object other$document = other.getDocument();
               if (this$document == null) {
                  if (other$document == null) {
                     break label550;
                  }
               } else if (this$document.equals(other$document)) {
                  break label550;
               }

               return false;
            }

            label543: {
               Object this$photo = this.getPhoto();
               Object other$photo = other.getPhoto();
               if (this$photo == null) {
                  if (other$photo == null) {
                     break label543;
                  }
               } else if (this$photo.equals(other$photo)) {
                  break label543;
               }

               return false;
            }

            label536: {
               Object this$sticker = this.getSticker();
               Object other$sticker = other.getSticker();
               if (this$sticker == null) {
                  if (other$sticker == null) {
                     break label536;
                  }
               } else if (this$sticker.equals(other$sticker)) {
                  break label536;
               }

               return false;
            }

            Object this$video = this.getVideo();
            Object other$video = other.getVideo();
            if (this$video == null) {
               if (other$video != null) {
                  return false;
               }
            } else if (!this$video.equals(other$video)) {
               return false;
            }

            label522: {
               Object this$contact = this.getContact();
               Object other$contact = other.getContact();
               if (this$contact == null) {
                  if (other$contact == null) {
                     break label522;
                  }
               } else if (this$contact.equals(other$contact)) {
                  break label522;
               }

               return false;
            }

            Object this$location = this.getLocation();
            Object other$location = other.getLocation();
            if (this$location == null) {
               if (other$location != null) {
                  return false;
               }
            } else if (!this$location.equals(other$location)) {
               return false;
            }

            label508: {
               Object this$venue = this.getVenue();
               Object other$venue = other.getVenue();
               if (this$venue == null) {
                  if (other$venue == null) {
                     break label508;
                  }
               } else if (this$venue.equals(other$venue)) {
                  break label508;
               }

               return false;
            }

            Object this$animation = this.getAnimation();
            Object other$animation = other.getAnimation();
            if (this$animation == null) {
               if (other$animation != null) {
                  return false;
               }
            } else if (!this$animation.equals(other$animation)) {
               return false;
            }

            Object this$pinnedMessage = this.getPinnedMessage();
            Object other$pinnedMessage = other.getPinnedMessage();
            if (this$pinnedMessage == null) {
               if (other$pinnedMessage != null) {
                  return false;
               }
            } else if (!this$pinnedMessage.equals(other$pinnedMessage)) {
               return false;
            }

            label487: {
               Object this$newChatMembers = this.getNewChatMembers();
               Object other$newChatMembers = other.getNewChatMembers();
               if (this$newChatMembers == null) {
                  if (other$newChatMembers == null) {
                     break label487;
                  }
               } else if (this$newChatMembers.equals(other$newChatMembers)) {
                  break label487;
               }

               return false;
            }

            label480: {
               Object this$leftChatMember = this.getLeftChatMember();
               Object other$leftChatMember = other.getLeftChatMember();
               if (this$leftChatMember == null) {
                  if (other$leftChatMember == null) {
                     break label480;
                  }
               } else if (this$leftChatMember.equals(other$leftChatMember)) {
                  break label480;
               }

               return false;
            }

            Object this$newChatTitle = this.getNewChatTitle();
            Object other$newChatTitle = other.getNewChatTitle();
            if (this$newChatTitle == null) {
               if (other$newChatTitle != null) {
                  return false;
               }
            } else if (!this$newChatTitle.equals(other$newChatTitle)) {
               return false;
            }

            Object this$newChatPhoto = this.getNewChatPhoto();
            Object other$newChatPhoto = other.getNewChatPhoto();
            if (this$newChatPhoto == null) {
               if (other$newChatPhoto != null) {
                  return false;
               }
            } else if (!this$newChatPhoto.equals(other$newChatPhoto)) {
               return false;
            }

            label459: {
               Object this$replyToMessage = this.getReplyToMessage();
               Object other$replyToMessage = other.getReplyToMessage();
               if (this$replyToMessage == null) {
                  if (other$replyToMessage == null) {
                     break label459;
                  }
               } else if (this$replyToMessage.equals(other$replyToMessage)) {
                  break label459;
               }

               return false;
            }

            Object this$voice = this.getVoice();
            Object other$voice = other.getVoice();
            if (this$voice == null) {
               if (other$voice != null) {
                  return false;
               }
            } else if (!this$voice.equals(other$voice)) {
               return false;
            }

            Object this$caption = this.getCaption();
            Object other$caption = other.getCaption();
            if (this$caption == null) {
               if (other$caption != null) {
                  return false;
               }
            } else if (!this$caption.equals(other$caption)) {
               return false;
            }

            label438: {
               Object this$game = this.getGame();
               Object other$game = other.getGame();
               if (this$game == null) {
                  if (other$game == null) {
                     break label438;
                  }
               } else if (this$game.equals(other$game)) {
                  break label438;
               }

               return false;
            }

            label431: {
               Object this$invoice = this.getInvoice();
               Object other$invoice = other.getInvoice();
               if (this$invoice == null) {
                  if (other$invoice == null) {
                     break label431;
                  }
               } else if (this$invoice.equals(other$invoice)) {
                  break label431;
               }

               return false;
            }

            label424: {
               Object this$successfulPayment = this.getSuccessfulPayment();
               Object other$successfulPayment = other.getSuccessfulPayment();
               if (this$successfulPayment == null) {
                  if (other$successfulPayment == null) {
                     break label424;
                  }
               } else if (this$successfulPayment.equals(other$successfulPayment)) {
                  break label424;
               }

               return false;
            }

            Object this$videoNote = this.getVideoNote();
            Object other$videoNote = other.getVideoNote();
            if (this$videoNote == null) {
               if (other$videoNote != null) {
                  return false;
               }
            } else if (!this$videoNote.equals(other$videoNote)) {
               return false;
            }

            label410: {
               Object this$authorSignature = this.getAuthorSignature();
               Object other$authorSignature = other.getAuthorSignature();
               if (this$authorSignature == null) {
                  if (other$authorSignature == null) {
                     break label410;
                  }
               } else if (this$authorSignature.equals(other$authorSignature)) {
                  break label410;
               }

               return false;
            }

            Object this$forwardSignature = this.getForwardSignature();
            Object other$forwardSignature = other.getForwardSignature();
            if (this$forwardSignature == null) {
               if (other$forwardSignature != null) {
                  return false;
               }
            } else if (!this$forwardSignature.equals(other$forwardSignature)) {
               return false;
            }

            label396: {
               Object this$mediaGroupId = this.getMediaGroupId();
               Object other$mediaGroupId = other.getMediaGroupId();
               if (this$mediaGroupId == null) {
                  if (other$mediaGroupId == null) {
                     break label396;
                  }
               } else if (this$mediaGroupId.equals(other$mediaGroupId)) {
                  break label396;
               }

               return false;
            }

            Object this$connectedWebsite = this.getConnectedWebsite();
            Object other$connectedWebsite = other.getConnectedWebsite();
            if (this$connectedWebsite == null) {
               if (other$connectedWebsite != null) {
                  return false;
               }
            } else if (!this$connectedWebsite.equals(other$connectedWebsite)) {
               return false;
            }

            Object this$passportData = this.getPassportData();
            Object other$passportData = other.getPassportData();
            if (this$passportData == null) {
               if (other$passportData != null) {
                  return false;
               }
            } else if (!this$passportData.equals(other$passportData)) {
               return false;
            }

            label375: {
               Object this$forwardSenderName = this.getForwardSenderName();
               Object other$forwardSenderName = other.getForwardSenderName();
               if (this$forwardSenderName == null) {
                  if (other$forwardSenderName == null) {
                     break label375;
                  }
               } else if (this$forwardSenderName.equals(other$forwardSenderName)) {
                  break label375;
               }

               return false;
            }

            label368: {
               Object this$poll = this.getPoll();
               Object other$poll = other.getPoll();
               if (this$poll == null) {
                  if (other$poll == null) {
                     break label368;
                  }
               } else if (this$poll.equals(other$poll)) {
                  break label368;
               }

               return false;
            }

            Object this$replyMarkup = this.getReplyMarkup();
            Object other$replyMarkup = other.getReplyMarkup();
            if (this$replyMarkup == null) {
               if (other$replyMarkup != null) {
                  return false;
               }
            } else if (!this$replyMarkup.equals(other$replyMarkup)) {
               return false;
            }

            Object this$dice = this.getDice();
            Object other$dice = other.getDice();
            if (this$dice == null) {
               if (other$dice != null) {
                  return false;
               }
            } else if (!this$dice.equals(other$dice)) {
               return false;
            }

            label347: {
               Object this$viaBot = this.getViaBot();
               Object other$viaBot = other.getViaBot();
               if (this$viaBot == null) {
                  if (other$viaBot == null) {
                     break label347;
                  }
               } else if (this$viaBot.equals(other$viaBot)) {
                  break label347;
               }

               return false;
            }

            Object this$senderChat = this.getSenderChat();
            Object other$senderChat = other.getSenderChat();
            if (this$senderChat == null) {
               if (other$senderChat != null) {
                  return false;
               }
            } else if (!this$senderChat.equals(other$senderChat)) {
               return false;
            }

            Object this$proximityAlertTriggered = this.getProximityAlertTriggered();
            Object other$proximityAlertTriggered = other.getProximityAlertTriggered();
            if (this$proximityAlertTriggered == null) {
               if (other$proximityAlertTriggered != null) {
                  return false;
               }
            } else if (!this$proximityAlertTriggered.equals(other$proximityAlertTriggered)) {
               return false;
            }

            label326: {
               Object this$messageAutoDeleteTimerChanged = this.getMessageAutoDeleteTimerChanged();
               Object other$messageAutoDeleteTimerChanged = other.getMessageAutoDeleteTimerChanged();
               if (this$messageAutoDeleteTimerChanged == null) {
                  if (other$messageAutoDeleteTimerChanged == null) {
                     break label326;
                  }
               } else if (this$messageAutoDeleteTimerChanged.equals(other$messageAutoDeleteTimerChanged)) {
                  break label326;
               }

               return false;
            }

            label319: {
               Object this$voiceChatStarted = this.getVoiceChatStarted();
               Object other$voiceChatStarted = other.getVoiceChatStarted();
               if (this$voiceChatStarted == null) {
                  if (other$voiceChatStarted == null) {
                     break label319;
                  }
               } else if (this$voiceChatStarted.equals(other$voiceChatStarted)) {
                  break label319;
               }

               return false;
            }

            label312: {
               Object this$voiceChatEnded = this.getVoiceChatEnded();
               Object other$voiceChatEnded = other.getVoiceChatEnded();
               if (this$voiceChatEnded == null) {
                  if (other$voiceChatEnded == null) {
                     break label312;
                  }
               } else if (this$voiceChatEnded.equals(other$voiceChatEnded)) {
                  break label312;
               }

               return false;
            }

            Object this$voiceChatParticipantsInvited = this.getVoiceChatParticipantsInvited();
            Object other$voiceChatParticipantsInvited = other.getVoiceChatParticipantsInvited();
            if (this$voiceChatParticipantsInvited == null) {
               if (other$voiceChatParticipantsInvited != null) {
                  return false;
               }
            } else if (!this$voiceChatParticipantsInvited.equals(other$voiceChatParticipantsInvited)) {
               return false;
            }

            Object this$voiceChatScheduled = this.getVoiceChatScheduled();
            Object other$voiceChatScheduled = other.getVoiceChatScheduled();
            if (this$voiceChatScheduled == null) {
               if (other$voiceChatScheduled != null) {
                  return false;
               }
            } else if (!this$voiceChatScheduled.equals(other$voiceChatScheduled)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof Message;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $messageId = this.getMessageId();
      int result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
      Object $date = this.getDate();
      result = result * 59 + ($date == null ? 43 : $date.hashCode());
      Object $forwardDate = this.getForwardDate();
      result = result * 59 + ($forwardDate == null ? 43 : $forwardDate.hashCode());
      Object $deleteChatPhoto = this.getDeleteChatPhoto();
      result = result * 59 + ($deleteChatPhoto == null ? 43 : $deleteChatPhoto.hashCode());
      Object $groupchatCreated = this.getGroupchatCreated();
      result = result * 59 + ($groupchatCreated == null ? 43 : $groupchatCreated.hashCode());
      Object $superGroupCreated = this.getSuperGroupCreated();
      result = result * 59 + ($superGroupCreated == null ? 43 : $superGroupCreated.hashCode());
      Object $channelChatCreated = this.getChannelChatCreated();
      result = result * 59 + ($channelChatCreated == null ? 43 : $channelChatCreated.hashCode());
      Object $migrateToChatId = this.getMigrateToChatId();
      result = result * 59 + ($migrateToChatId == null ? 43 : $migrateToChatId.hashCode());
      Object $migrateFromChatId = this.getMigrateFromChatId();
      result = result * 59 + ($migrateFromChatId == null ? 43 : $migrateFromChatId.hashCode());
      Object $editDate = this.getEditDate();
      result = result * 59 + ($editDate == null ? 43 : $editDate.hashCode());
      Object $forwardFromMessageId = this.getForwardFromMessageId();
      result = result * 59 + ($forwardFromMessageId == null ? 43 : $forwardFromMessageId.hashCode());
      Object $from = this.getFrom();
      result = result * 59 + ($from == null ? 43 : $from.hashCode());
      Object $chat = this.getChat();
      result = result * 59 + ($chat == null ? 43 : $chat.hashCode());
      Object $forwardFrom = this.getForwardFrom();
      result = result * 59 + ($forwardFrom == null ? 43 : $forwardFrom.hashCode());
      Object $forwardFromChat = this.getForwardFromChat();
      result = result * 59 + ($forwardFromChat == null ? 43 : $forwardFromChat.hashCode());
      Object $text = this.getText();
      result = result * 59 + ($text == null ? 43 : $text.hashCode());
      Object $entities = this.getEntities();
      result = result * 59 + ($entities == null ? 43 : $entities.hashCode());
      Object $captionEntities = this.getCaptionEntities();
      result = result * 59 + ($captionEntities == null ? 43 : $captionEntities.hashCode());
      Object $audio = this.getAudio();
      result = result * 59 + ($audio == null ? 43 : $audio.hashCode());
      Object $document = this.getDocument();
      result = result * 59 + ($document == null ? 43 : $document.hashCode());
      Object $photo = this.getPhoto();
      result = result * 59 + ($photo == null ? 43 : $photo.hashCode());
      Object $sticker = this.getSticker();
      result = result * 59 + ($sticker == null ? 43 : $sticker.hashCode());
      Object $video = this.getVideo();
      result = result * 59 + ($video == null ? 43 : $video.hashCode());
      Object $contact = this.getContact();
      result = result * 59 + ($contact == null ? 43 : $contact.hashCode());
      Object $location = this.getLocation();
      result = result * 59 + ($location == null ? 43 : $location.hashCode());
      Object $venue = this.getVenue();
      result = result * 59 + ($venue == null ? 43 : $venue.hashCode());
      Object $animation = this.getAnimation();
      result = result * 59 + ($animation == null ? 43 : $animation.hashCode());
      Object $pinnedMessage = this.getPinnedMessage();
      result = result * 59 + ($pinnedMessage == null ? 43 : $pinnedMessage.hashCode());
      Object $newChatMembers = this.getNewChatMembers();
      result = result * 59 + ($newChatMembers == null ? 43 : $newChatMembers.hashCode());
      Object $leftChatMember = this.getLeftChatMember();
      result = result * 59 + ($leftChatMember == null ? 43 : $leftChatMember.hashCode());
      Object $newChatTitle = this.getNewChatTitle();
      result = result * 59 + ($newChatTitle == null ? 43 : $newChatTitle.hashCode());
      Object $newChatPhoto = this.getNewChatPhoto();
      result = result * 59 + ($newChatPhoto == null ? 43 : $newChatPhoto.hashCode());
      Object $replyToMessage = this.getReplyToMessage();
      result = result * 59 + ($replyToMessage == null ? 43 : $replyToMessage.hashCode());
      Object $voice = this.getVoice();
      result = result * 59 + ($voice == null ? 43 : $voice.hashCode());
      Object $caption = this.getCaption();
      result = result * 59 + ($caption == null ? 43 : $caption.hashCode());
      Object $game = this.getGame();
      result = result * 59 + ($game == null ? 43 : $game.hashCode());
      Object $invoice = this.getInvoice();
      result = result * 59 + ($invoice == null ? 43 : $invoice.hashCode());
      Object $successfulPayment = this.getSuccessfulPayment();
      result = result * 59 + ($successfulPayment == null ? 43 : $successfulPayment.hashCode());
      Object $videoNote = this.getVideoNote();
      result = result * 59 + ($videoNote == null ? 43 : $videoNote.hashCode());
      Object $authorSignature = this.getAuthorSignature();
      result = result * 59 + ($authorSignature == null ? 43 : $authorSignature.hashCode());
      Object $forwardSignature = this.getForwardSignature();
      result = result * 59 + ($forwardSignature == null ? 43 : $forwardSignature.hashCode());
      Object $mediaGroupId = this.getMediaGroupId();
      result = result * 59 + ($mediaGroupId == null ? 43 : $mediaGroupId.hashCode());
      Object $connectedWebsite = this.getConnectedWebsite();
      result = result * 59 + ($connectedWebsite == null ? 43 : $connectedWebsite.hashCode());
      Object $passportData = this.getPassportData();
      result = result * 59 + ($passportData == null ? 43 : $passportData.hashCode());
      Object $forwardSenderName = this.getForwardSenderName();
      result = result * 59 + ($forwardSenderName == null ? 43 : $forwardSenderName.hashCode());
      Object $poll = this.getPoll();
      result = result * 59 + ($poll == null ? 43 : $poll.hashCode());
      Object $replyMarkup = this.getReplyMarkup();
      result = result * 59 + ($replyMarkup == null ? 43 : $replyMarkup.hashCode());
      Object $dice = this.getDice();
      result = result * 59 + ($dice == null ? 43 : $dice.hashCode());
      Object $viaBot = this.getViaBot();
      result = result * 59 + ($viaBot == null ? 43 : $viaBot.hashCode());
      Object $senderChat = this.getSenderChat();
      result = result * 59 + ($senderChat == null ? 43 : $senderChat.hashCode());
      Object $proximityAlertTriggered = this.getProximityAlertTriggered();
      result = result * 59 + ($proximityAlertTriggered == null ? 43 : $proximityAlertTriggered.hashCode());
      Object $messageAutoDeleteTimerChanged = this.getMessageAutoDeleteTimerChanged();
      result = result * 59 + ($messageAutoDeleteTimerChanged == null ? 43 : $messageAutoDeleteTimerChanged.hashCode());
      Object $voiceChatStarted = this.getVoiceChatStarted();
      result = result * 59 + ($voiceChatStarted == null ? 43 : $voiceChatStarted.hashCode());
      Object $voiceChatEnded = this.getVoiceChatEnded();
      result = result * 59 + ($voiceChatEnded == null ? 43 : $voiceChatEnded.hashCode());
      Object $voiceChatParticipantsInvited = this.getVoiceChatParticipantsInvited();
      result = result * 59 + ($voiceChatParticipantsInvited == null ? 43 : $voiceChatParticipantsInvited.hashCode());
      Object $voiceChatScheduled = this.getVoiceChatScheduled();
      result = result * 59 + ($voiceChatScheduled == null ? 43 : $voiceChatScheduled.hashCode());
      return result;
   }

   public Integer getMessageId() {
      return this.messageId;
   }

   public User getFrom() {
      return this.from;
   }

   public Integer getDate() {
      return this.date;
   }

   public Chat getChat() {
      return this.chat;
   }

   public User getForwardFrom() {
      return this.forwardFrom;
   }

   public Chat getForwardFromChat() {
      return this.forwardFromChat;
   }

   public Integer getForwardDate() {
      return this.forwardDate;
   }

   public String getText() {
      return this.text;
   }

   public Audio getAudio() {
      return this.audio;
   }

   public Document getDocument() {
      return this.document;
   }

   public List<PhotoSize> getPhoto() {
      return this.photo;
   }

   public Sticker getSticker() {
      return this.sticker;
   }

   public Video getVideo() {
      return this.video;
   }

   public Contact getContact() {
      return this.contact;
   }

   public Location getLocation() {
      return this.location;
   }

   public Venue getVenue() {
      return this.venue;
   }

   public Animation getAnimation() {
      return this.animation;
   }

   public Message getPinnedMessage() {
      return this.pinnedMessage;
   }

   public User getLeftChatMember() {
      return this.leftChatMember;
   }

   public String getNewChatTitle() {
      return this.newChatTitle;
   }

   public List<PhotoSize> getNewChatPhoto() {
      return this.newChatPhoto;
   }

   public Boolean getDeleteChatPhoto() {
      return this.deleteChatPhoto;
   }

   public Boolean getGroupchatCreated() {
      return this.groupchatCreated;
   }

   public Message getReplyToMessage() {
      return this.replyToMessage;
   }

   public Voice getVoice() {
      return this.voice;
   }

   public String getCaption() {
      return this.caption;
   }

   public Boolean getSuperGroupCreated() {
      return this.superGroupCreated;
   }

   public Boolean getChannelChatCreated() {
      return this.channelChatCreated;
   }

   public Long getMigrateToChatId() {
      return this.migrateToChatId;
   }

   public Long getMigrateFromChatId() {
      return this.migrateFromChatId;
   }

   public Integer getEditDate() {
      return this.editDate;
   }

   public Game getGame() {
      return this.game;
   }

   public Integer getForwardFromMessageId() {
      return this.forwardFromMessageId;
   }

   public Invoice getInvoice() {
      return this.invoice;
   }

   public SuccessfulPayment getSuccessfulPayment() {
      return this.successfulPayment;
   }

   public VideoNote getVideoNote() {
      return this.videoNote;
   }

   public String getAuthorSignature() {
      return this.authorSignature;
   }

   public String getForwardSignature() {
      return this.forwardSignature;
   }

   public String getMediaGroupId() {
      return this.mediaGroupId;
   }

   public String getConnectedWebsite() {
      return this.connectedWebsite;
   }

   public PassportData getPassportData() {
      return this.passportData;
   }

   public String getForwardSenderName() {
      return this.forwardSenderName;
   }

   public Poll getPoll() {
      return this.poll;
   }

   public InlineKeyboardMarkup getReplyMarkup() {
      return this.replyMarkup;
   }

   public Dice getDice() {
      return this.dice;
   }

   public User getViaBot() {
      return this.viaBot;
   }

   public Chat getSenderChat() {
      return this.senderChat;
   }

   public ProximityAlertTriggered getProximityAlertTriggered() {
      return this.proximityAlertTriggered;
   }

   public MessageAutoDeleteTimerChanged getMessageAutoDeleteTimerChanged() {
      return this.messageAutoDeleteTimerChanged;
   }

   public VoiceChatStarted getVoiceChatStarted() {
      return this.voiceChatStarted;
   }

   public VoiceChatEnded getVoiceChatEnded() {
      return this.voiceChatEnded;
   }

   public VoiceChatParticipantsInvited getVoiceChatParticipantsInvited() {
      return this.voiceChatParticipantsInvited;
   }

   public VoiceChatScheduled getVoiceChatScheduled() {
      return this.voiceChatScheduled;
   }

   @JsonProperty("message_id")
   public void setMessageId(Integer messageId) {
      this.messageId = messageId;
   }

   @JsonProperty("from")
   public void setFrom(User from) {
      this.from = from;
   }

   @JsonProperty("date")
   public void setDate(Integer date) {
      this.date = date;
   }

   @JsonProperty("chat")
   public void setChat(Chat chat) {
      this.chat = chat;
   }

   @JsonProperty("forward_from")
   public void setForwardFrom(User forwardFrom) {
      this.forwardFrom = forwardFrom;
   }

   @JsonProperty("forward_from_chat")
   public void setForwardFromChat(Chat forwardFromChat) {
      this.forwardFromChat = forwardFromChat;
   }

   @JsonProperty("forward_date")
   public void setForwardDate(Integer forwardDate) {
      this.forwardDate = forwardDate;
   }

   @JsonProperty("text")
   public void setText(String text) {
      this.text = text;
   }

   @JsonProperty("entities")
   public void setEntities(List<MessageEntity> entities) {
      this.entities = entities;
   }

   @JsonProperty("caption_entities")
   public void setCaptionEntities(List<MessageEntity> captionEntities) {
      this.captionEntities = captionEntities;
   }

   @JsonProperty("audio")
   public void setAudio(Audio audio) {
      this.audio = audio;
   }

   @JsonProperty("document")
   public void setDocument(Document document) {
      this.document = document;
   }

   @JsonProperty("photo")
   public void setPhoto(List<PhotoSize> photo) {
      this.photo = photo;
   }

   @JsonProperty("sticker")
   public void setSticker(Sticker sticker) {
      this.sticker = sticker;
   }

   @JsonProperty("video")
   public void setVideo(Video video) {
      this.video = video;
   }

   @JsonProperty("contact")
   public void setContact(Contact contact) {
      this.contact = contact;
   }

   @JsonProperty("location")
   public void setLocation(Location location) {
      this.location = location;
   }

   @JsonProperty("venue")
   public void setVenue(Venue venue) {
      this.venue = venue;
   }

   @JsonProperty("animation")
   public void setAnimation(Animation animation) {
      this.animation = animation;
   }

   @JsonProperty("pinned_message")
   public void setPinnedMessage(Message pinnedMessage) {
      this.pinnedMessage = pinnedMessage;
   }

   @JsonProperty("new_chat_members")
   public void setNewChatMembers(List<User> newChatMembers) {
      this.newChatMembers = newChatMembers;
   }

   @JsonProperty("left_chat_member")
   public void setLeftChatMember(User leftChatMember) {
      this.leftChatMember = leftChatMember;
   }

   @JsonProperty("new_chat_title")
   public void setNewChatTitle(String newChatTitle) {
      this.newChatTitle = newChatTitle;
   }

   @JsonProperty("new_chat_photo")
   public void setNewChatPhoto(List<PhotoSize> newChatPhoto) {
      this.newChatPhoto = newChatPhoto;
   }

   @JsonProperty("delete_chat_photo")
   public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
      this.deleteChatPhoto = deleteChatPhoto;
   }

   @JsonProperty("group_chat_created")
   public void setGroupchatCreated(Boolean groupchatCreated) {
      this.groupchatCreated = groupchatCreated;
   }

   @JsonProperty("reply_to_message")
   public void setReplyToMessage(Message replyToMessage) {
      this.replyToMessage = replyToMessage;
   }

   @JsonProperty("voice")
   public void setVoice(Voice voice) {
      this.voice = voice;
   }

   @JsonProperty("caption")
   public void setCaption(String caption) {
      this.caption = caption;
   }

   @JsonProperty("supergroup_chat_created")
   public void setSuperGroupCreated(Boolean superGroupCreated) {
      this.superGroupCreated = superGroupCreated;
   }

   @JsonProperty("channel_chat_created")
   public void setChannelChatCreated(Boolean channelChatCreated) {
      this.channelChatCreated = channelChatCreated;
   }

   @JsonProperty("migrate_to_chat_id")
   public void setMigrateToChatId(Long migrateToChatId) {
      this.migrateToChatId = migrateToChatId;
   }

   @JsonProperty("migrate_from_chat_id")
   public void setMigrateFromChatId(Long migrateFromChatId) {
      this.migrateFromChatId = migrateFromChatId;
   }

   @JsonProperty("edit_date")
   public void setEditDate(Integer editDate) {
      this.editDate = editDate;
   }

   @JsonProperty("game")
   public void setGame(Game game) {
      this.game = game;
   }

   @JsonProperty("forward_from_message_id")
   public void setForwardFromMessageId(Integer forwardFromMessageId) {
      this.forwardFromMessageId = forwardFromMessageId;
   }

   @JsonProperty("invoice")
   public void setInvoice(Invoice invoice) {
      this.invoice = invoice;
   }

   @JsonProperty("successful_payment")
   public void setSuccessfulPayment(SuccessfulPayment successfulPayment) {
      this.successfulPayment = successfulPayment;
   }

   @JsonProperty("video_note")
   public void setVideoNote(VideoNote videoNote) {
      this.videoNote = videoNote;
   }

   @JsonProperty("author_signature")
   public void setAuthorSignature(String authorSignature) {
      this.authorSignature = authorSignature;
   }

   @JsonProperty("forward_signature")
   public void setForwardSignature(String forwardSignature) {
      this.forwardSignature = forwardSignature;
   }

   @JsonProperty("media_group_id")
   public void setMediaGroupId(String mediaGroupId) {
      this.mediaGroupId = mediaGroupId;
   }

   @JsonProperty("connected_website")
   public void setConnectedWebsite(String connectedWebsite) {
      this.connectedWebsite = connectedWebsite;
   }

   @JsonProperty("passport_data")
   public void setPassportData(PassportData passportData) {
      this.passportData = passportData;
   }

   @JsonProperty("forward_sender_name")
   public void setForwardSenderName(String forwardSenderName) {
      this.forwardSenderName = forwardSenderName;
   }

   @JsonProperty("poll")
   public void setPoll(Poll poll) {
      this.poll = poll;
   }

   @JsonProperty("reply_markup")
   public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      this.replyMarkup = replyMarkup;
   }

   @JsonProperty("dice")
   public void setDice(Dice dice) {
      this.dice = dice;
   }

   @JsonProperty("via_bot")
   public void setViaBot(User viaBot) {
      this.viaBot = viaBot;
   }

   @JsonProperty("sender_chat")
   public void setSenderChat(Chat senderChat) {
      this.senderChat = senderChat;
   }

   @JsonProperty("proximity_alert_triggered")
   public void setProximityAlertTriggered(ProximityAlertTriggered proximityAlertTriggered) {
      this.proximityAlertTriggered = proximityAlertTriggered;
   }

   @JsonProperty("message_auto_delete_timer_changed")
   public void setMessageAutoDeleteTimerChanged(MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged) {
      this.messageAutoDeleteTimerChanged = messageAutoDeleteTimerChanged;
   }

   @JsonProperty("voice_chat_started")
   public void setVoiceChatStarted(VoiceChatStarted voiceChatStarted) {
      this.voiceChatStarted = voiceChatStarted;
   }

   @JsonProperty("voice_chat_ended")
   public void setVoiceChatEnded(VoiceChatEnded voiceChatEnded) {
      this.voiceChatEnded = voiceChatEnded;
   }

   @JsonProperty("voice_chat_participants_invited")
   public void setVoiceChatParticipantsInvited(VoiceChatParticipantsInvited voiceChatParticipantsInvited) {
      this.voiceChatParticipantsInvited = voiceChatParticipantsInvited;
   }

   @JsonProperty("voice_chat_scheduled")
   public void setVoiceChatScheduled(VoiceChatScheduled voiceChatScheduled) {
      this.voiceChatScheduled = voiceChatScheduled;
   }

   public String toString() {
      return "Message(messageId=" + this.getMessageId() + ", from=" + this.getFrom() + ", date=" + this.getDate() + ", chat=" + this.getChat() + ", forwardFrom=" + this.getForwardFrom() + ", forwardFromChat=" + this.getForwardFromChat() + ", forwardDate=" + this.getForwardDate() + ", text=" + this.getText() + ", entities=" + this.getEntities() + ", captionEntities=" + this.getCaptionEntities() + ", audio=" + this.getAudio() + ", document=" + this.getDocument() + ", photo=" + this.getPhoto() + ", sticker=" + this.getSticker() + ", video=" + this.getVideo() + ", contact=" + this.getContact() + ", location=" + this.getLocation() + ", venue=" + this.getVenue() + ", animation=" + this.getAnimation() + ", pinnedMessage=" + this.getPinnedMessage() + ", newChatMembers=" + this.getNewChatMembers() + ", leftChatMember=" + this.getLeftChatMember() + ", newChatTitle=" + this.getNewChatTitle() + ", newChatPhoto=" + this.getNewChatPhoto() + ", deleteChatPhoto=" + this.getDeleteChatPhoto() + ", groupchatCreated=" + this.getGroupchatCreated() + ", replyToMessage=" + this.getReplyToMessage() + ", voice=" + this.getVoice() + ", caption=" + this.getCaption() + ", superGroupCreated=" + this.getSuperGroupCreated() + ", channelChatCreated=" + this.getChannelChatCreated() + ", migrateToChatId=" + this.getMigrateToChatId() + ", migrateFromChatId=" + this.getMigrateFromChatId() + ", editDate=" + this.getEditDate() + ", game=" + this.getGame() + ", forwardFromMessageId=" + this.getForwardFromMessageId() + ", invoice=" + this.getInvoice() + ", successfulPayment=" + this.getSuccessfulPayment() + ", videoNote=" + this.getVideoNote() + ", authorSignature=" + this.getAuthorSignature() + ", forwardSignature=" + this.getForwardSignature() + ", mediaGroupId=" + this.getMediaGroupId() + ", connectedWebsite=" + this.getConnectedWebsite() + ", passportData=" + this.getPassportData() + ", forwardSenderName=" + this.getForwardSenderName() + ", poll=" + this.getPoll() + ", replyMarkup=" + this.getReplyMarkup() + ", dice=" + this.getDice() + ", viaBot=" + this.getViaBot() + ", senderChat=" + this.getSenderChat() + ", proximityAlertTriggered=" + this.getProximityAlertTriggered() + ", messageAutoDeleteTimerChanged=" + this.getMessageAutoDeleteTimerChanged() + ", voiceChatStarted=" + this.getVoiceChatStarted() + ", voiceChatEnded=" + this.getVoiceChatEnded() + ", voiceChatParticipantsInvited=" + this.getVoiceChatParticipantsInvited() + ", voiceChatScheduled=" + this.getVoiceChatScheduled() + ")";
   }

   public Message() {
   }

   public Message(Integer messageId, User from, Integer date, Chat chat, User forwardFrom, Chat forwardFromChat, Integer forwardDate, String text, List<MessageEntity> entities, List<MessageEntity> captionEntities, Audio audio, Document document, List<PhotoSize> photo, Sticker sticker, Video video, Contact contact, Location location, Venue venue, Animation animation, Message pinnedMessage, List<User> newChatMembers, User leftChatMember, String newChatTitle, List<PhotoSize> newChatPhoto, Boolean deleteChatPhoto, Boolean groupchatCreated, Message replyToMessage, Voice voice, String caption, Boolean superGroupCreated, Boolean channelChatCreated, Long migrateToChatId, Long migrateFromChatId, Integer editDate, Game game, Integer forwardFromMessageId, Invoice invoice, SuccessfulPayment successfulPayment, VideoNote videoNote, String authorSignature, String forwardSignature, String mediaGroupId, String connectedWebsite, PassportData passportData, String forwardSenderName, Poll poll, InlineKeyboardMarkup replyMarkup, Dice dice, User viaBot, Chat senderChat, ProximityAlertTriggered proximityAlertTriggered, MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged, VoiceChatStarted voiceChatStarted, VoiceChatEnded voiceChatEnded, VoiceChatParticipantsInvited voiceChatParticipantsInvited, VoiceChatScheduled voiceChatScheduled) {
      this.messageId = messageId;
      this.from = from;
      this.date = date;
      this.chat = chat;
      this.forwardFrom = forwardFrom;
      this.forwardFromChat = forwardFromChat;
      this.forwardDate = forwardDate;
      this.text = text;
      this.entities = entities;
      this.captionEntities = captionEntities;
      this.audio = audio;
      this.document = document;
      this.photo = photo;
      this.sticker = sticker;
      this.video = video;
      this.contact = contact;
      this.location = location;
      this.venue = venue;
      this.animation = animation;
      this.pinnedMessage = pinnedMessage;
      this.newChatMembers = newChatMembers;
      this.leftChatMember = leftChatMember;
      this.newChatTitle = newChatTitle;
      this.newChatPhoto = newChatPhoto;
      this.deleteChatPhoto = deleteChatPhoto;
      this.groupchatCreated = groupchatCreated;
      this.replyToMessage = replyToMessage;
      this.voice = voice;
      this.caption = caption;
      this.superGroupCreated = superGroupCreated;
      this.channelChatCreated = channelChatCreated;
      this.migrateToChatId = migrateToChatId;
      this.migrateFromChatId = migrateFromChatId;
      this.editDate = editDate;
      this.game = game;
      this.forwardFromMessageId = forwardFromMessageId;
      this.invoice = invoice;
      this.successfulPayment = successfulPayment;
      this.videoNote = videoNote;
      this.authorSignature = authorSignature;
      this.forwardSignature = forwardSignature;
      this.mediaGroupId = mediaGroupId;
      this.connectedWebsite = connectedWebsite;
      this.passportData = passportData;
      this.forwardSenderName = forwardSenderName;
      this.poll = poll;
      this.replyMarkup = replyMarkup;
      this.dice = dice;
      this.viaBot = viaBot;
      this.senderChat = senderChat;
      this.proximityAlertTriggered = proximityAlertTriggered;
      this.messageAutoDeleteTimerChanged = messageAutoDeleteTimerChanged;
      this.voiceChatStarted = voiceChatStarted;
      this.voiceChatEnded = voiceChatEnded;
      this.voiceChatParticipantsInvited = voiceChatParticipantsInvited;
      this.voiceChatScheduled = voiceChatScheduled;
   }
}
