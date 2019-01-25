package br.com.cvccorp.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.cvccorp.test.dto.Hotel;
import br.com.cvccorp.test.externo.ConsumoAPIHotels;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
    	ConsumoAPIHotels api = new ConsumoAPIHotels();
    	
        for(Hotel h: api.buscarHoteis(ConsumoAPIHotels.COD_PORTO_SEGURO))
        	log.info(h.toString());
    }

}
