package br.com.uol.selecao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.uol.selecao.dominio.Cliente;


/**
 * Extende JpaRepository e herda por sua vez os métodos relativos à persistência
 * e consulta de dados no banco.
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
