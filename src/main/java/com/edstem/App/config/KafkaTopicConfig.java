package com.edstem.App.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("javaguides")
                .build();
    }

    @Bean
    public NewTopic javaguidesJsonTopic(){
        return TopicBuilder.name("javaguides_json")
                .build();
    }

    @Bean
    public NewTopic javaNewJsonTopic(){
        return TopicBuilder.name("java_new_json")
                .build();
    }
}
