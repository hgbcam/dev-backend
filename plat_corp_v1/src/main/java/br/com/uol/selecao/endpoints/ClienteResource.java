package br.com.uol.selecao.endpoints;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.uol.selecao.dominio.Cliente;
import br.com.uol.selecao.dto.IpVigilanteDTO;
import br.com.uol.selecao.dto.Response;
import br.com.uol.selecao.repository.ClienteNotFoundException;
import br.com.uol.selecao.repository.ClienteRepository;
import br.com.uol.selecao.util.WebUtil;

/**
 * Implementa os métodos que irão tratar os Requests, 
 * definidos como requisitos para aplicação.
 * 
 * @author Hugo Barros Camboim 
 */
@RestController
public class ClienteResource {

	/**
	 * Cria vínculo com a calsse {@link ClienteRepository}, que herda 
	 * os métodos de consulta e alteração do banco de dados.
	 * 
	 */
	@Autowired
	private ClienteRepository clienteRepository;

	/**
	 * Lista todos os Clientes, armazenados no banco de dados. 
	 */
	@GetMapping("/clientes")
	public List<Cliente> retrieveAllClientes() {
		return clienteRepository.findAll();
	}

	/**
	 * Busca um cliente por id e o retorna, caso não o encontre será
	 * lançada uma exceção {@link ClienteNotFoundException}.
	 *  
	 *  @param id o id de cliente a ser buscado
	 */
	@GetMapping("/clientes/{id}")
	public Cliente retrieveCliente(@PathVariable long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);

		if (!cliente.isPresent())
			throw new ClienteNotFoundException("id-" + id);

		return cliente.get();
	}

	/**
	 * Simplesmente apaga um cliente do banco por id.
	 * 
	 * @param o id o cliente a ser excluído.
	 */
	@DeleteMapping("/clientes/{id}")
	public void deleteCliente(@PathVariable long id) {		
		clienteRepository.deleteById(id);
	}

	/**
	 * Insere um cliente no banco através dos dados no formato JSON 
	 * contidos na requisição.
	 * Ex.:
	 * POST: http://localhost:8080/clientes/
	 * {
	 *	"name": "Tom2",
     *	"idade": "25"
	 * }
	 *  
	 *  @param cliente o Cliente formado através dos dados JSON enviados pela requisição.
	 */
	@PostMapping("/clientes")
	public ResponseEntity<Object> createCliente(@RequestBody Cliente cliente) {
		Cliente savedCliente= clienteRepository.save(cliente);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedCliente.getId()).toUri();			

		return ResponseEntity.created(location).build();

	}
	
	/**
	 * Atualiza um cliente no banco de acordo com os dados passados e 
	 * o id referenciado no parametro. 
	 * 
	 * @param Cliente o objeto do cliente a ser atualizado
	 * @param id o id do cliente a ser atualizado.
	 * 
	 * Ex.: 
	 * PUT: http://localhost:8080/clientes/1000
	 * {
	 *	"name": "Tom2",
     *	"idade": "25"
	 * }
	 * 
	 */
	@PutMapping("/clientes/{id}")
	public ResponseEntity<Object> updateCliente(@RequestBody Cliente cliente, @PathVariable long id) {

		Optional<Cliente> clienteOptional = clienteRepository.findById(id);

		if (!clienteOptional.isPresent())
			return ResponseEntity.notFound().build();

		cliente.setId(id);
		
		clienteRepository.save(cliente);

		return ResponseEntity.noContent().build();
	}
}
