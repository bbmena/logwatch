package com.proserv.logwatch.service;

import com.proserv.logwatch.model.Watch;
import com.proserv.logwatch.model.WatchTransport;
import com.proserv.logwatch.repository.WatchRepository;
import com.proserv.logwatch.transform.WatchTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class WatchService {

    @Autowired private WatchRepository watchRepository;
    @Autowired private WatchTransform watchTransform;

    @Value("${spark.consumer.url}") String consumerRoot;

    public List<Watch> getAllWatches() {
        return watchRepository.findAll();
    }

    public void deleteWatchByName(String name) {
        watchRepository.deleteByName(name);
        // TODO needs to communicate deletion to Spark
    }

    public Watch saveWatch(Watch watch) {
        Watch savedWatch = watchRepository.save(watch);

        // notify Spark that a new watch has been added
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(consumerRoot + "/watch", watchTransform.transformWatch(savedWatch), WatchTransport.class);

        return savedWatch;
    }

}
