package com.bootcamp.sistemabancario.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("client")
public class Client{

	@Id
	private String id;
	private String name;
	private String lastName;
	private String documentNumber;
	private String phoneNumber;
	private String businessName;
	private ClientType clientType;
	private DocumentType documentType;
}
