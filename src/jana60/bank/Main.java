package jana60.bank;

public class Main {
	public static void main(String[] args) {
		
		Conto c1 = new Conto(1234, "Giampiero Fedeli");
		
		System.out.println(c1);
		System.out.println("--------------");
		c1.addMoney(20);
		c1.setNomeProprietario("Gino Pino");
		System.out.println(c1);
	}
}
