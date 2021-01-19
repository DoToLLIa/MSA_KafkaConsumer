package ru.neoflex.msa.training.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.neoflex.msa.training.kafkaconsumer.BankAccount;

@Component
public class KafkaConsumerController {
    @KafkaListener(topics = "bankAccountTopic")
    public void msgListener(BankAccount bankAccount) {
        System.out.println(bankAccount);
    }
}
