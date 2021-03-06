package ru.neoflex.msa.training.kafkaconsumer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.msa.training.cassandrakeyspace.BankAccountModel;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface CassandraRepository extends org.springframework.data.cassandra.repository.CassandraRepository<BankAccountModel, String> {
    //Optional<BankAccountModel> createBankAccount(String id);
}
