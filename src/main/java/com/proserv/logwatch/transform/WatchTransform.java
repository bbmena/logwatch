package com.proserv.logwatch.transform;

import com.proserv.logwatch.model.WatchTransport;
import com.proserv.logwatch.model.Watch;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class WatchTransform {

    public WatchTransport transformWatch(Watch watch) {
        return new WatchTransport(watch.getName(), watch.getWatchText());
    }

    public Set<WatchTransport> transformWatchSet(Set<Watch> watchSet) {
        Set<WatchTransport> watches = new HashSet<>();
        watchSet.forEach(watch -> watches.add(transformWatch(watch)));
        return watches;
    }
}
