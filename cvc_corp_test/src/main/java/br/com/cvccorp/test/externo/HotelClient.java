package br.com.cvccorp.test.externo;

import java.util.List;

import br.com.cvccorp.test.dto.Hotel;

/** Interface para o cliente da API de Hoteis a ser consumida.
 * 
 * @author Hugo Barros
 */
public interface HotelClient {

		/** Recupera lista de hotéis através do código de cidade passado como parâmetro.*/
		List<Hotel> buscarHoteis(int idCidade);
		
		/** Busca detalhes de apenas um hotel*/
		Hotel buscarHotel(int idHotel);
		
}
