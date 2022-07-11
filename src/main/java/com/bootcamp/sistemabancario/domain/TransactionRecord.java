package com.bootcamp.sistemabancario.domain;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document("transactionRecord")
public class TransactionRecord {
	@Id
	private ObjectId id;
	private Double amount;
	private Integer share;
	private Date payDate;
	private Client client;
	private Product product;
	private AccountType accountType;
	private OperationType operationType;
	private Representation representantion;
}
