package memento;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

	private List<Memento> listaMementos = new ArrayList<>();
	
	public void add(Memento memento) {
		listaMementos.add(memento);
	}
	
	public Memento get(int indice) {
		return listaMementos.get(indice);
	}
	
}
