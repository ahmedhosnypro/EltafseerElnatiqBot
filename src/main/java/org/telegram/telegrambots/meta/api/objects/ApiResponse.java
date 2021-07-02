package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
@JsonInclude(Include.NON_NULL)
public class ApiResponse<T> implements Serializable {
   private static final String OK_FIELD = "ok";
   private static final String ERROR_CODE_FIELD = "error_code";
   private static final String DESCRIPTION_CODE_FIELD = "description";
   private static final String PARAMETERS_FIELD = "parameters";
   private static final String RESULT_FIELD = "result";
   @JsonProperty("ok")
   private Boolean ok;
   @JsonProperty("error_code")
   private Integer errorCode;
   @JsonProperty("description")
   private String errorDescription;
   @JsonProperty("parameters")
   private ResponseParameters parameters;
   @JsonProperty("result")
   private T result;

   public Boolean getOk() {
      return this.ok;
   }

   public Integer getErrorCode() {
      return this.errorCode;
   }

   public String getErrorDescription() {
      return this.errorDescription;
   }

   public T getResult() {
      return this.result;
   }

   public ResponseParameters getParameters() {
      return this.parameters;
   }

   public String toString() {
      return this.ok ? "ApiResponse{ok=" + this.ok + ", result=" + this.result + '}' : "ApiResponse{ok=" + this.ok + ", errorCode=" + this.errorCode + ", errorDescription='" + this.errorDescription + '\'' + ", parameters='" + this.parameters + '\'' + '}';
   }
}
