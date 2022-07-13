package com.bootcamp.sistemabancario.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document("operationtype")
public class OperationType {
	@Id
	private ObjectId id;
	private String name;
	private Double comission;
	private String limit;
	private String code;
	private Product product;
}
