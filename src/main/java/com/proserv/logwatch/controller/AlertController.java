package com.proserv.logwatch.controller;

import com.proserv.logwatch.model.Alert;
import com.proserv.logwatch.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertController {

    @Autowired private AlertService alertService;

    @RequestMapping(path = "/alert", method = RequestMethod.POST)
    public void sendAlert(@RequestBody Alert alert){
        alertService.SendAlert(alert);
    }
}
