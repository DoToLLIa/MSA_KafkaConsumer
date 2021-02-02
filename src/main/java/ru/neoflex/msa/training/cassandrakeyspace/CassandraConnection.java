package ru.neoflex.msa.training.cassandrakeyspace;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;

public class CassandraConnection {
    private final CqlSession cqlSession = CqlSession.builder().build();
    private final CassandraOperations template = new CassandraTemplate(cqlSession);

    public void closeSession() {
        cqlSession.close();
    }

    public BankAccountModel insertBankAccount(BankAccountModel bankAccount) {
        return template.insert(bankAccount);
    }

    public CqlSession getCqlSession() {
        return cqlSession;
    }

    public CassandraOperations getTemplate() {
        return template;
    }
}
