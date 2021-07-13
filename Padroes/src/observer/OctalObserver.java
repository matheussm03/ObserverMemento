package observer;

public class OctalObserver extends Observer {
	
	public OctalObserver(Decimal poDecimal) {
		this.decimal = poDecimal;
		this.decimal.registrarObservers(this);
	}

	@Override
	public void atualizar() {
		System.out.println("Numero em Octal: " + Integer.toOctalString(decimal.getNumero()));
	}

}
