package com.global.entity;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name ="users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {

	private Long id ;
	private String fullName ;
	private String userName ;
	private String password ;
	
	@ManyToMany
	@JoinTable(
			   name="user_role"  ,
	           joinColumns= @JoinColumn(name ="user_id") ,
		       inverseJoinColumns =@JoinColumn(name ="role_id") 
			   )
	private Set<Roles> roles = new HashSet<>();
	
	
	
}
