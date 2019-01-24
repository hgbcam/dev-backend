package br.com.uol.selecao.repository;

/**
 * Representa uma exceção a ser lançada quando um cliente requisitado 
 * não é encontrado no bancos.
 * 
 * @author Hugo Barros Camboim
 */
public class ClienteNotFoundException extends RuntimeException {

	public ClienteNotFoundException(String exception) {
		super(exception);
	}

}
