package Test;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


import org.junit.jupiter.api.Test;

import com.desafio.model.Cliente;
import com.desafio.repository.ClienteRepository;

public class LoginTest {

	ClienteRepository repository = new ClienteRepository();
	//testando com senha válida
	
	@Test
	public void loginExistenteTest() {
		String login = "gso";
		Cliente cliente = repository.buscar(login);
		assertNotNull(cliente);
	}
	
	@Test
	public void loginNaoExistenteTest() {
		String login = "osg";
		Cliente cliente = repository.buscar(login);
		assertNull(cliente);
	}
	
	
}
