package com.proserv.logwatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Alert implements Serializable {

    private String alertText;

    public Alert() {
    }

    public String getAlertText() {
        return alertText;
    }
    public void setAlertText(String alertText) {
        this.alertText = alertText;
    }
}