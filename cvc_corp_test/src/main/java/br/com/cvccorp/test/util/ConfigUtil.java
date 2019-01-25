package br.com.cvccorp.test.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Classe utilitária para acesso às configurações atribuidas ao projeto.
 * 
 * 
 *  @author Hugo Barros camboim
 */
@Configuration
public class ConfigUtil {

    @Autowired
    private Environment env;

    /** Busca determinado valor de uma configuração atrvés da chave.
     * 
     * @param pPropertyKey a chave a ser buscada 
     */
    public String getProperty(String pPropertyKey) {
        return env.getProperty(pPropertyKey);
    }
} 