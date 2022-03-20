package com.ssd.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	private int id;
	private String name;
	private String add;
	
	private Pancard pan;
	private Long mobileNo;
	

}
