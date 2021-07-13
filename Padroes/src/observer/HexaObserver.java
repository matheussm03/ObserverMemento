package observer;

public class HexaObserver extends Observer {
	
	public HexaObserver(Decimal decimal) {
		this.decimal = decimal;
		this.decimal.registrarObservers(this);
	}

	@Override
	public void atualizar() {
		System.out.println("Numero em Hexadecimal: " + Integer.toHexString(decimal.getNumero()));
	}

}
