package br.com.cvccorp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal, usada somente com o propósito de
 * instanciar a aplicação, que utiliza uma versão embutida do Tomcat na porta padrão 8080
 * configurações em: resources/application.properties
 */
@SpringBootApplication
public class CvcCorpTestApplication{

	public static void main(String[] args) {
		SpringApplication.run(CvcCorpTestApplication.class, args);
	}
}
