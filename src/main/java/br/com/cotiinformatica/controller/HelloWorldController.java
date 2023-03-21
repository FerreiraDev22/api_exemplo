package br.com.cotiinformatica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Hello World!")
@RestController
public class HelloWorldController {

	@ApiOperation("ENDPOINT para teste de mensagem.")
	@GetMapping("/api/helloworld")
	public String getMensagem() {
		return "Olá, eu sou uma API!";
	}

}



