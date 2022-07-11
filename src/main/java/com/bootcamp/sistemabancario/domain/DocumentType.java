package com.bootcamp.sistemabancario.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("documentType")
public class DocumentType{
	@Id
	private ObjectId id;
	private String name;
	
}
