package com.example.locationproducer.controller;

import com.example.locationproducer.service.KafkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> produce(){
        String location = "Dhanbad";
        this.kafkaService.update(location);

        return new ResponseEntity<>(location, HttpStatus.OK);
    }
}
