package com.rg.test.restchecker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rg.test.restchecker.dto.RequestDto;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestRestController {
	private String lastRequest;

	@RequestMapping("corp")
	public ResponseEntity<RequestDto> corp(@RequestBody RequestDto body) {
		log.info(body.toString());
		lastRequest = body.toString();
		return ResponseEntity.ok(body);
	}

	@RequestMapping("hitback")
	public ResponseEntity<String> hitBack(@RequestBody String body) {
		log.info(body);
		lastRequest = body;
		return ResponseEntity.ok(body);
	}

	@GetMapping("last")
	public ResponseEntity<String> getLastRequest() {
		log.info(lastRequest);
		return ResponseEntity.ok(lastRequest);
	}
}
