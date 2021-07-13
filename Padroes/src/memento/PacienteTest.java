package memento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PacienteTest {
	
    @Test
    void deveRetornarPessoa1() {
		Pessoa pessoa = new Pessoa();
		Paciente paciente = new Paciente();
		pessoa.setNome("Pessoa1");
		paciente.add(pessoa.salvarMemento());
        assertEquals("Pessoa1", pessoa.getNome()); 
    }
	
	
    @Test
    void deveRetornarPessoa2() {
		Pessoa pessoa = new Pessoa();
		Paciente paciente = new Paciente();
		pessoa.setNome("Pessoa1");
		pessoa.setNome("Pessoa2");
		paciente.add(pessoa.salvarMemento());
        assertEquals("Pessoa2", pessoa.getNome()); 
    }
	
	
    @Test
    void deveRetornarPessoa3() {
		Pessoa pessoa = new Pessoa();
		Paciente paciente = new Paciente();
		pessoa.setNome("Pessoa1");
		pessoa.setNome("Pessoa2");
		paciente.add(pessoa.salvarMemento());
		pessoa.setNome("Pessoa3");
		paciente.add(pessoa.salvarMemento());
        assertEquals("Pessoa3", pessoa.getNome()); 
    }
	

}
