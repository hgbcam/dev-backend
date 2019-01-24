package br.com.uol.selecao.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Representa o histórico de inserção de um cliente,
 * armazenando temparaturas máxima e mínima da cidade de onde foi
 * requisitada a inserção do mesmo.
 * @author Hugo Barros Camboim
 * */
@Entity
public class InsercaoClienteHistorico {
	
	@Id
	@GeneratedValue
	private Long insercaoClienteHistoricoId;
	
	private String Cidade;
	
	private Float tempMax;
	
	private Float tempMin;
	
	public InsercaoClienteHistorico(){
		super();
	}
	
	
	public InsercaoClienteHistorico(Long insercaoClienteHistoricoId,
			String cidade, Float tempMax, Float tempMin) {
		super();
		this.insercaoClienteHistoricoId = insercaoClienteHistoricoId;
		Cidade = cidade;
		this.tempMax = tempMax;
		this.tempMin = tempMin;
	}



	public Long getInsercaoClienteHistoricoId() {
		return insercaoClienteHistoricoId;
	}

	public void setInsercaoClienteHistoricoId(Long insercaoClienteHistoricoId) {
		this.insercaoClienteHistoricoId = insercaoClienteHistoricoId;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public Float getTempMax() {
		return tempMax;
	}

	public void setTempMax(Float tempMax) {
		this.tempMax = tempMax;
	}

	public Float getTempMin() {
		return tempMin;
	}

	public void setTempMin(Float tempMin) {
		this.tempMin = tempMin;
	}
	
}
