package com.global.service;

import org.springframework.stereotype.Service;

import com.global.Repository.RoleRepo;
import com.global.entity.Roles;

import lombok.RequiredArgsConstructor;

import java.util.List; 


@Service
@RequiredArgsConstructor
public class RoleService {
	
	
	private final RoleRepo roleRepo ;
	
	
	
/////get tous les roles
	public List<Roles>  findAll(){
	
	               return roleRepo.findAll();
	           
       }

	
	
	////get role par id 
	public Roles findById (Long id) {
		    
		return roleRepo.findById(id).orElse(null);
	}
	
	
	
	
	

}
