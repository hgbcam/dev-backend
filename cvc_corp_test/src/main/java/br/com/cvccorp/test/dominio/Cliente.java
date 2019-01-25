package br.com.cvccorp.test.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Representa um cliente de acordo com o modelo de domínio definido.
 * @author Hugo Barros 
 */
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	/**
	 * Id do cliente - chave primária, gerada automaticamente pela sequence padrão do 
	 * hibernate - hibernate_sequence 
	 */
	private Long id;
	
	/**
	 * Nome completo do cliente
	 * Ex.: João da Silva Fagundes 
	 */
	private String nome;
	
	/**
	 * Idade do Cliente. 
	 */
	private int idade;
	
	/**
	 * Contrutor Padrão. 
	 */
	public Cliente() {
		super();
	}

	/**
	 * Construtor com campos da classe. 
	 */
	public Cliente(Long id, String nome, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	/**
	 * @return  o id do Cliente.
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * Altera o id do cliente.
	 * @param id - o id a ser atribuido ao cliente.
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return o nome do cliente. 
	 */
	public String getName() {
		return nome;
	}
	
	/**
	 * Altera o nome do cliente.
	 * @param o nome do cliente a ser alterado. 
	 */
	public void setName(String name) {
		this.nome = name;
	}
	
	/**
	 * @return a idade do cliente 
	 */
	public int getIdade() {
		return idade;
	}
	
	/**
	 * Altera a idade do cliente.
	 * @param a idade a ser alterada. 
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
		
}
