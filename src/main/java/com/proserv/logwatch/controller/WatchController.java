package com.proserv.logwatch.controller;

import com.proserv.logwatch.model.Watch;
import com.proserv.logwatch.service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WatchController {

    @Autowired private WatchService watchService;

    @RequestMapping(path = "/watch", method = RequestMethod.POST)
    public Watch addWatch(@RequestBody Watch watch){
        return watchService.saveWatch(watch);
    }
}
