package com.bootcamp.sistemabancario.domain;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("account")
public class Account {
    @Id
    private ObjectId id;
    private Client client;
    private AccountType accountType;
    private String nroCuenta;
    private Double saldo;
    private Representation representation;
}
