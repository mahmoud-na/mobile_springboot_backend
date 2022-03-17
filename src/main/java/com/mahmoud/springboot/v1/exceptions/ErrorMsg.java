package com.mahmoud.springboot.v1.exceptions;

import java.util.Date;

public class ErrorMsg {
    private String message;
    private String status;
    private String uri;
    private Date timestamp;

    public ErrorMsg() {
        this.timestamp = new Date();
    }

    public ErrorMsg(String message, String status, String uri) {
        this();
        this.message = message;
        this.status = status;
        this.uri = uri;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
