package org.soujava.gradle.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@SpringBootApplication
@RestController
@RequestMapping("/calculator")
public class SpringBootExampleApplication {

	private Calculadora calculadora = new Calculadora();

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	@RequestMapping("/sum")
    public Map<String, Integer> greeting(@RequestParam(value="a") Integer a,
    	@RequestParam(value="b") Integer b) {

    	Integer total = calculadora.somar(a, b);

    	Map<String, Integer> resultado = new HashMap<>();

    	resultado.put("total", total);

    	return resultado;
    }
}
