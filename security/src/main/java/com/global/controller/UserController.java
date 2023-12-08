package com.global.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.global.service.UserService;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/api/v/user")
@RequiredArgsConstructor
public class UserController {

	
	private final UserService userService ;
	
	@GetMapping("")
	public ResponseEntity<?>  findAll(){
		
		return  ResponseEntity.ok(userService.findAll()) ;
		
	}
	
	
	
	@GetMapping("/{id}")
    public ResponseEntity<?>  findById(@PathVariable Long id){
		
		return  ResponseEntity.ok(userService.findById(id)) ;
		
	}
	
	
	
	
}
