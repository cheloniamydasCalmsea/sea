package com.bada.sea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String getJsonResponse() {
        // JSON 데이터 생성
        String jsonString = "{\"say\":\"hello\"}";
        String jsonString2 = "{\"say\":\"hello\"}";

        return jsonString;
    }
}
