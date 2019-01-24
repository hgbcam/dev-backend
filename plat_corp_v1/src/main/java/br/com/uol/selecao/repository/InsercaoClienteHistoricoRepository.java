package br.com.uol.selecao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.uol.selecao.dominio.InsercaoClienteHistorico;

@Repository
public interface InsercaoClienteHistoricoRepository extends JpaRepository<InsercaoClienteHistorico, Long>{

}
