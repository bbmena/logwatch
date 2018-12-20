package com.proserv.logwatch.service;

import com.proserv.logwatch.model.Alert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    private static final Logger logger = LoggerFactory.getLogger(AlertService.class);

    public void SendAlert(Alert alert) {
        logger.info("Alert Received: " + alert.getAlertText());
    }
}
