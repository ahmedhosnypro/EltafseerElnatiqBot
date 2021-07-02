package org.telegram.telegrambots.meta.api.methods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
@JsonInclude(Include.NON_NULL)
public abstract class BotApiMethod<T extends Serializable> extends PartialBotApiMethod<T> {
   protected static final String METHOD_FIELD = "method";

   @JsonProperty("method")
   public abstract String getMethod();
}
