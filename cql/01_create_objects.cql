CREATE KEYSPACE bank_keyspace
  WITH REPLICATION = { 
   'class' : 'SimpleStrategy', 
   'replication_factor' : 1 
  };

CREATE TABLE bank_keyspace.bank_account (
   id uuid PRIMARY KEY,
   firstName text,
   lastName text,
   patronymic text,
   accountNumber int);