package ru.neoflex.msa.training.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerController {
    @KafkaListener(topics = "bankAccountTopic")
    public void msgListener(String bankAccount) {
        System.out.println(bankAccount);
    }
}
