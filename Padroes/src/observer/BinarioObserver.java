package observer;

public class BinarioObserver extends Observer {
	
	public BinarioObserver(Decimal decimal) {
		this.decimal = decimal;
		this.decimal.registrarObservers(this);
	}

	@Override
	public void atualizar() {
		System.out.println("Numero em Binario: " + Integer.toBinaryString(decimal.getNumero()));
	}

}
