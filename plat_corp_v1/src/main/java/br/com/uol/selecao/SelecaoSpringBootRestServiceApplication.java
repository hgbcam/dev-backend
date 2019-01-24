package br.com.uol.selecao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Classe principal, usada somente com o propósito de
 * instanciar a aplicação, que utiliza uma versão embutida do Tomcat na porta padrão 8080
 * e banco H2 em memória. Configurações através  do arquivo: resources/application.properties
 */
@SpringBootApplication
public class SelecaoSpringBootRestServiceApplication{

	public static void main(String[] args) {
		SpringApplication.run(SelecaoSpringBootRestServiceApplication.class, args);
	}
}
