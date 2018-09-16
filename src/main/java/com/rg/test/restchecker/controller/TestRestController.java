package com.rg.test.restchecker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestRestController {
	@RequestMapping("hitback")
	public ResponseEntity<String> hitBack(@RequestBody String body) {
		log.info(body);
		return ResponseEntity.ok(body);
	}
}