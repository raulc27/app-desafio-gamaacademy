package Test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.desafio.model.Cliente;
import com.desafio.service.ClienteService;


public class ClienteTest {

	//validar se existe o login: Excpetion
	//A logica precisa estar no clienteService;
	
	private ClienteService service = new ClienteService();
	
	@Test
	public void criarUsuarioTest() {
		String login = "gso";
		Cliente cliente = service.criarCliente(login);
		assertNotNull(cliente);
	}
	
	@Test
	public void loginAcima20CaracteresException() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			String login = "josemariadoamaralsilva";
			Cliente cliente = service.criarCliente(login);
		}, null);
	}
	
}
