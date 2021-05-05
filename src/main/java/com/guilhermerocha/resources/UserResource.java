package com.guilhermerocha.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermerocha.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User user1 = new User(1L, "Maria", "maria@bol.com");
		User user2 = new User(2L, "Bob", "Bob@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(user1, user2));
		
		return ResponseEntity.ok().body(list);
	}
}
