package ru.neoflex.msa.training.cassandrakeyspace;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface CassandraRepository extends CrudRepository<BankAccountModel, Serializable> {
    //Optional<BankAccountModel> createBankAccount(String id);
}
