package com.global.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name ="roles")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Roles {

	private Long id ;
	private String name ;
	
	
	
	
	
}
