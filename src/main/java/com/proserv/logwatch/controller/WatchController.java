package com.proserv.logwatch.controller;

import com.proserv.logwatch.model.WatchTransportList;
import com.proserv.logwatch.model.Watch;
import com.proserv.logwatch.service.WatchService;
import com.proserv.logwatch.transform.WatchTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

@RestController
public class WatchController {

    @Autowired private WatchService watchService;
    @Autowired private WatchTransform watchTransform;

    @RequestMapping(path = "/watch", method = RequestMethod.POST)
    public Watch addWatch(@RequestBody Watch watch){
        return watchService.saveWatch(watch);
    }

    @RequestMapping(path = "/watch", method = RequestMethod.GET)
    public WatchTransportList getWatches(){
        WatchTransportList watchTransportList = new WatchTransportList();
        watchTransportList.setWatches(watchTransform.transformWatchSet(new HashSet<>(watchService.getAllWatches())));
        return watchTransportList;
    }
}
