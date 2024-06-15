package com.example.profile.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StandResponse<T> {
    private boolean isSuccess = true;
    @JsonProperty
    private T result;

    @JsonIgnore
    private ErrorInfo error;

    private String errMsg;

    public StandResponse() {
    }

    public StandResponse(T result) {
        this.result = result;
    }

    public StandResponse(boolean isSuccess, T result) {
        this.isSuccess = isSuccess;
        this.result = result;
        this.errMsg = "";
    }

    public StandResponse(Exception exception) {
        this.errMsg = exception.getMessage();
        this.isSuccess = false;
        this.error = new ErrorInfo(exception);
    }

    public StandResponse(Exception exception, T result) {
        this.isSuccess = false;
        this.errMsg = exception.getMessage();
        this.error = new ErrorInfo(exception);
        this.result = result;
    }
}
