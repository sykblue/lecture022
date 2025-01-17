package com.example.lecture022;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
	@GetMapping("hello-world")
	public ResponseEntity<String>HelloWorld(){
		return ResponseEntity.ok("Hello World");
	}
	
	@GetMapping("test-world")
	public ResponseEntity<String>TestWorld(){
		return ResponseEntity.ok("test World");
	}

	
	@GetMapping("han-world")
	public ResponseEntity<String>ham(){
		return ResponseEntity.ok("ham World");
	}

}
