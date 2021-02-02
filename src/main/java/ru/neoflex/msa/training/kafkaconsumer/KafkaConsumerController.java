package ru.neoflex.msa.training.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.neoflex.msa.training.cassandrakeyspace.BankAccountModel;
import ru.neoflex.msa.training.cassandrakeyspace.CassandraConnection;
import ru.neoflex.msa.training.kafkaproducer.BankAccount;

@Component
public class KafkaConsumerController {
    @KafkaListener(topics = "bankAccountTopic")
    public void msgListener(BankAccount bankAccount) {
        System.out.println(bankAccount.getUuid() + " " + bankAccount.toString());
        CassandraConnection cassandraConnection = new CassandraConnection();
        cassandraConnection.insertBankAccount(transformBankAccount(bankAccount));
        cassandraConnection.closeSession();
    }

    private BankAccountModel transformBankAccount(BankAccount bankAccount) {
        return new BankAccountModel(
                bankAccount.getUuid().toString(),
                bankAccount.getFirstName(),
                bankAccount.getLastName(),
                bankAccount.getPatronymic(),
                bankAccount.getAccountNumber()
        );
    }
}
