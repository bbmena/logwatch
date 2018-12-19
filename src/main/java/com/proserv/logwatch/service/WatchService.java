package com.proserv.logwatch.service;

import com.proserv.logwatch.model.Watch;
import com.proserv.logwatch.repository.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchService {

    @Autowired private WatchRepository watchRepository;

    public List<Watch> getAllWatches() {
        return watchRepository.findAll();
    }

    public void deleteWatchByName(String name) {
        watchRepository.deleteByName(name);
    }

    public Watch saveWatch(Watch watch) {
//        watch.
        return watchRepository.save(watch);
    }

}
