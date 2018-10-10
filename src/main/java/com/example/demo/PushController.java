package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.stream.Collectors;

@Controller("/api/v1/one-time-token")
public class PushController {

	Logger logger = LoggerFactory.getLogger(PushController.class);

	@PostMapping("/push/verify")
	public ResponseEntity verifyPush(HttpServletRequest request) throws IOException{
		logger.info(request.getReader().lines().collect(Collectors.joining(System.lineSeparator())));
		return ResponseEntity.ok().build();
	}
}
