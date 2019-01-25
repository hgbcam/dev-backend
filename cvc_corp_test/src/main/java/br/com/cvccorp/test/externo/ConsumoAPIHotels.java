package br.com.cvccorp.test.externo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import br.com.cvccorp.test.util.ConfigUtil;
import br.com.uol.selecao.dto.Hotel;

/**
 * Classe para consumo da API disponibilizada para o teste.
 * 
 *  @author Hugo Barros Camboim
 */
@Repository
public class ConsumoAPIHotels {

	@Autowired
	private ConfigUtil configUtil;
	
	/** Códigos de cidade disponibilizados para o teste*/
	public static int CODIGOS_CIDADES_DISPONIVEIS[] = {1032,7110,9626};
	
	/** Código da cidade Porto Seguro para a busca de Hotéis*/
	public static int COD_PORTO_SEGURO = 1032;
	
	/** Código da cidade Rio de Janeiro para a busca de Hotéis*/
	public static int COD_RIO_JANEIRO = 7110;
	
	/** Código da cidade São Paulo para a busca de Hotéis*/
	public static int COD_SAO_PAULO = 9626;
	
	/** Busca Lista de Hoteis com base no código da cidade passsado como parâmetro.
	 * 
	 * @param codigoCidade o código da cidade a ser pequisado.
	 */
	public List<Hotel> buscarHoteis(long codigoCidade){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Hotel>> response = 
				restTemplate.exchange(
						configUtil.getProperty("cvccorp.url.hotels_cidade")+codigoCidade, 
						HttpMethod.GET, null, 
						new ParameterizedTypeReference<List<Hotel>>(){}
						);				
		List<Hotel> hoteis = response.getBody();
		
		return hoteis;
	}
	
	/** Busca detalhes do Hotel por código.
	 * 
	 * @param codigoCidade o código do hotel a ser pequisado.
	 */
	public Hotel buscarHotel(long idHotel){
		RestTemplate restTemplate = new RestTemplate();	
		
		ResponseEntity<Hotel> response = restTemplate.getForEntity(configUtil.getProperty("cvccorp.url.hotel")+idHotel, Hotel.class);
		
		return response.getBody();
	}
	
}
