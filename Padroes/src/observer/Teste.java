
package observer;

public class Teste {

	public static void main(String[] args) {
		Decimal decimal = new Decimal();
		new BinarioObserver(decimal);
		new OctalObserver(decimal);
		new HexaObserver(decimal);
		
		
		
		System.out.println("Primeiro numero decimal: 9");
		decimal.setNumero(9);
		System.out.println();
		System.out.println("Segundo numero decimal: 15");
		decimal.setNumero(15);
	}

}
