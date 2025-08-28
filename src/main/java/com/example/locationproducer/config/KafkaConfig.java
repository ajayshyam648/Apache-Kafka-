package com.example.locationproducer.config;

import com.example.locationproducer.constants.LocationConst;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(LocationConst.TOPIC_NAME)
                .partitions(2)
                .replicas(2)
                .build();
    }
}
