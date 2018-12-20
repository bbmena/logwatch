package com.proserv.logwatch.model;

import java.util.Set;

public class WatchTransportList {

    private Set<WatchTransport> watches;

    public WatchTransportList() {
    }

    public Set<WatchTransport> getWatches() {
        return watches;
    }
    public void setWatches(Set<WatchTransport> watches) {
        this.watches = watches;
    }
}
