package com.proserv.logwatch.model;

public class WatchTransport {

    private String name;
    private String watchText;

    public WatchTransport() {
    }

    public WatchTransport(String name, String watchText) {
        this.name = name;
        this.watchText = watchText;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getWatchText() {
        return watchText;
    }
    public void setWatchText(String watchText) {
        this.watchText = watchText;
    }
}
