package observer;

import java.util.ArrayList;
import java.util.List;

public class Decimal {
	
	private List<Observer> listaObservers = new ArrayList<>();
	private int numero;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
		notificarTodosObservers();
	}
	
	public void registrarObservers(Observer observer) {
		listaObservers.add(observer);
	}
	
	public void notificarTodosObservers() {
		for (Observer observer : listaObservers) {
			observer.atualizar();
		}
	}
	
}
