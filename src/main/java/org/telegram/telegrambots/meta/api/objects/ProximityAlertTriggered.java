package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public class ProximityAlertTriggered implements BotApiObject {
   private static final String TRAVELER_FIELD = "traveler";
   private static final String WATCHER_FIELD = "watcher";
   private static final String DISTANCE_FIELD = "distance";
   @JsonProperty("traveler")
   private User traveler;
   @JsonProperty("watcher")
   private User watcher;
   @JsonProperty("distance")
   private Integer distance;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ProximityAlertTriggered)) {
         return false;
      } else {
         ProximityAlertTriggered other = (ProximityAlertTriggered)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$distance = this.getDistance();
               Object other$distance = other.getDistance();
               if (this$distance == null) {
                  if (other$distance == null) {
                     break label47;
                  }
               } else if (this$distance.equals(other$distance)) {
                  break label47;
               }

               return false;
            }

            Object this$traveler = this.getTraveler();
            Object other$traveler = other.getTraveler();
            if (this$traveler == null) {
               if (other$traveler != null) {
                  return false;
               }
            } else if (!this$traveler.equals(other$traveler)) {
               return false;
            }

            Object this$watcher = this.getWatcher();
            Object other$watcher = other.getWatcher();
            if (this$watcher == null) {
               if (other$watcher != null) {
                  return false;
               }
            } else if (!this$watcher.equals(other$watcher)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ProximityAlertTriggered;
   }

   public int hashCode() {
      int PRIME = true;
      int result = 1;
      Object $distance = this.getDistance();
      int result = result * 59 + ($distance == null ? 43 : $distance.hashCode());
      Object $traveler = this.getTraveler();
      result = result * 59 + ($traveler == null ? 43 : $traveler.hashCode());
      Object $watcher = this.getWatcher();
      result = result * 59 + ($watcher == null ? 43 : $watcher.hashCode());
      return result;
   }

   public User getTraveler() {
      return this.traveler;
   }

   public User getWatcher() {
      return this.watcher;
   }

   public Integer getDistance() {
      return this.distance;
   }

   @JsonProperty("traveler")
   public void setTraveler(User traveler) {
      this.traveler = traveler;
   }

   @JsonProperty("watcher")
   public void setWatcher(User watcher) {
      this.watcher = watcher;
   }

   @JsonProperty("distance")
   public void setDistance(Integer distance) {
      this.distance = distance;
   }

   public String toString() {
      return "ProximityAlertTriggered(traveler=" + this.getTraveler() + ", watcher=" + this.getWatcher() + ", distance=" + this.getDistance() + ")";
   }

   public ProximityAlertTriggered() {
   }

   public ProximityAlertTriggered(User traveler, User watcher, Integer distance) {
      this.traveler = traveler;
      this.watcher = watcher;
      this.distance = distance;
   }
}
