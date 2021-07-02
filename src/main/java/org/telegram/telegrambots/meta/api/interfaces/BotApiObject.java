package org.telegram.telegrambots.meta.api.interfaces;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
@JsonInclude(Include.NON_NULL)
public interface BotApiObject extends Serializable {
}
