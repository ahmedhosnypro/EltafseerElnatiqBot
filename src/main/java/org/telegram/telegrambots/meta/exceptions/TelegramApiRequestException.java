package org.telegram.telegrambots.meta.exceptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.api.objects.ApiResponse;
import org.telegram.telegrambots.meta.api.objects.ResponseParameters;

public class TelegramApiRequestException extends TelegramApiException {
   private static final Logger log = LoggerFactory.getLogger(TelegramApiRequestException.class);
   private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
   private static final String ERRORDESCRIPTIONFIELD = "description";
   private static final String ERRORCODEFIELD = "error_code";
   private static final String PARAMETERSFIELD = "parameters";
   private String apiResponse = null;
   private Integer errorCode = 0;
   private ResponseParameters parameters;

   public TelegramApiRequestException(String message) {
      super(message);
   }

   public TelegramApiRequestException(String message, JSONObject object) {
      super(message);
      this.apiResponse = object.getString("description");
      this.errorCode = object.getInt("error_code");
      if (object.has("parameters")) {
         try {
            this.parameters = (ResponseParameters)OBJECT_MAPPER.readValue(object.getJSONObject("parameters").toString(), ResponseParameters.class);
         } catch (IOException var4) {
            log.error(var4.getLocalizedMessage(), var4);
         }
      }

   }

   public TelegramApiRequestException(String message, ApiResponse response) {
      super(message);
      this.apiResponse = response.getErrorDescription();
      this.errorCode = response.getErrorCode();
      this.parameters = response.getParameters();
   }

   public TelegramApiRequestException(String message, Throwable cause) {
      super(message, cause);
   }

   public String getApiResponse() {
      return this.apiResponse;
   }

   public Integer getErrorCode() {
      return this.errorCode;
   }

   public ResponseParameters getParameters() {
      return this.parameters;
   }

   public String getMessage() {
      if (this.apiResponse == null) {
         return super.getMessage();
      } else {
         return this.errorCode == null ? super.getMessage() + ": " + this.apiResponse : super.getMessage() + ": [" + this.errorCode + "] " + this.apiResponse;
      }
   }

   public String toString() {
      return this.getMessage();
   }
}
