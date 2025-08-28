package com.example.locationproducer.service;

import com.example.locationproducer.constants.LocationConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);


    public boolean update(String location){
        this.kafkaTemplate.send(LocationConst.TOPIC_NAME, location);
        logger.info("Produced location: " + location);
        return true;
    }
}
