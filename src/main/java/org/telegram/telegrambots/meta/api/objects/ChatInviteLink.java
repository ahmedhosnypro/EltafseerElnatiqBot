package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class ChatInviteLink implements BotApiObject {
   private static final String INVITELINK_FIELD = "invite_link";
   private static final String CREATOR_FIELD = "creator";
   private static final String ISPRIMARY_FIELD = "is_primary";
   private static final String ISREVOKED_FIELD = "is_revoked";
   private static final String EXPIREDATE_FIELD = "expire_date";
   private static final String MEMBERLIMIT_FIELD = "member_limit";
   @JsonProperty("invite_link")
   private String inviteLink;
   @JsonProperty("creator")
   private User creator;
   @JsonProperty("is_primary")
   private Boolean isPrimary;
   @JsonProperty("is_revoked")
   private Boolean isRevoked;
   @JsonProperty("expire_date")
   private Integer expireDate;
   @JsonProperty("member_limit")
   private Integer memberLimit;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ChatInviteLink)) {
         return false;
      } else {
         ChatInviteLink other = (ChatInviteLink)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$isPrimary = this.getIsPrimary();
            Object other$isPrimary = other.getIsPrimary();
            if (this$isPrimary == null) {
               if (other$isPrimary != null) {
                  return false;
               }
            } else if (!this$isPrimary.equals(other$isPrimary)) {
               return false;
            }

            Object this$isRevoked = this.getIsRevoked();
            Object other$isRevoked = other.getIsRevoked();
            if (this$isRevoked == null) {
               if (other$isRevoked != null) {
                  return false;
               }
            } else if (!this$isRevoked.equals(other$isRevoked)) {
               return false;
            }

            Object this$expireDate = this.getExpireDate();
            Object other$expireDate = other.getExpireDate();
            if (this$expireDate == null) {
               if (other$expireDate != null) {
                  return false;
               }
            } else if (!this$expireDate.equals(other$expireDate)) {
               return false;
            }

            label62: {
               Object this$memberLimit = this.getMemberLimit();
               Object other$memberLimit = other.getMemberLimit();
               if (this$memberLimit == null) {
                  if (other$memberLimit == null) {
                     break label62;
                  }
               } else if (this$memberLimit.equals(other$memberLimit)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$inviteLink = this.getInviteLink();
               Object other$inviteLink = other.getInviteLink();
               if (this$inviteLink == null) {
                  if (other$inviteLink == null) {
                     break label55;
                  }
               } else if (this$inviteLink.equals(other$inviteLink)) {
                  break label55;
               }

               return false;
            }

            Object this$creator = this.getCreator();
            Object other$creator = other.getCreator();
            if (this$creator == null) {
               if (other$creator != null) {
                  return false;
               }
            } else if (!this$creator.equals(other$creator)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ChatInviteLink;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $isPrimary = this.getIsPrimary();
      int result = result * 59 + ($isPrimary == null ? 43 : $isPrimary.hashCode());
      Object $isRevoked = this.getIsRevoked();
      result = result * 59 + ($isRevoked == null ? 43 : $isRevoked.hashCode());
      Object $expireDate = this.getExpireDate();
      result = result * 59 + ($expireDate == null ? 43 : $expireDate.hashCode());
      Object $memberLimit = this.getMemberLimit();
      result = result * 59 + ($memberLimit == null ? 43 : $memberLimit.hashCode());
      Object $inviteLink = this.getInviteLink();
      result = result * 59 + ($inviteLink == null ? 43 : $inviteLink.hashCode());
      Object $creator = this.getCreator();
      result = result * 59 + ($creator == null ? 43 : $creator.hashCode());
      return result;
   }

   public String getInviteLink() {
      return this.inviteLink;
   }

   public User getCreator() {
      return this.creator;
   }

   public Boolean getIsPrimary() {
      return this.isPrimary;
   }

   public Boolean getIsRevoked() {
      return this.isRevoked;
   }

   public Integer getExpireDate() {
      return this.expireDate;
   }

   public Integer getMemberLimit() {
      return this.memberLimit;
   }

   @JsonProperty("invite_link")
   public void setInviteLink(String inviteLink) {
      this.inviteLink = inviteLink;
   }

   @JsonProperty("creator")
   public void setCreator(User creator) {
      this.creator = creator;
   }

   @JsonProperty("is_primary")
   public void setIsPrimary(Boolean isPrimary) {
      this.isPrimary = isPrimary;
   }

   @JsonProperty("is_revoked")
   public void setIsRevoked(Boolean isRevoked) {
      this.isRevoked = isRevoked;
   }

   @JsonProperty("expire_date")
   public void setExpireDate(Integer expireDate) {
      this.expireDate = expireDate;
   }

   @JsonProperty("member_limit")
   public void setMemberLimit(Integer memberLimit) {
      this.memberLimit = memberLimit;
   }

   public String toString() {
      return "ChatInviteLink(inviteLink=" + this.getInviteLink() + ", creator=" + this.getCreator() + ", isPrimary=" + this.getIsPrimary() + ", isRevoked=" + this.getIsRevoked() + ", expireDate=" + this.getExpireDate() + ", memberLimit=" + this.getMemberLimit() + ")";
   }

   public ChatInviteLink() {
   }

   public ChatInviteLink(String inviteLink, User creator, Boolean isPrimary, Boolean isRevoked, Integer expireDate, Integer memberLimit) {
      this.inviteLink = inviteLink;
      this.creator = creator;
      this.isPrimary = isPrimary;
      this.isRevoked = isRevoked;
      this.expireDate = expireDate;
      this.memberLimit = memberLimit;
   }
}
