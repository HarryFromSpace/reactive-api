package com.nagpal.product.reactiveapi.entity;

import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document
@Data
@Getter
@Setter
public class Product {
	private String id;
	private String name;
	private String cost;
	
}
