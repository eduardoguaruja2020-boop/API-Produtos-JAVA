package com.eduardolima.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdutosapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosapiApplication.class, args);
	}

}
// Esse é o arquivo principal, é ele que eu executo pra deixar o servidor aberto na rede e poder fazer as requisições pelo Postman