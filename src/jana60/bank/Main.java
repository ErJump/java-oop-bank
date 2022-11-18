package jana60.bank;

public class Main {
	public static void main(String[] args) {
		
		Conto c1 = new Conto(1234, "Giampiero Fedeli");
		
		System.out.println(c1);
		System.out.println("--------------");
		
		c1.addMoney(20);
		c1.setNomeProprietario("Gino Pino");
		System.out.println(c1);
		System.out.println("--------------");
		
		c1.getMoney(20);
		System.out.println(c1.getSaldo() + "$");
		c1.getMoney(10);

		//aggiungo un conto e testo le funzionalità
		Conto c2 = new Conto(5678, "Giovanni Rossi");
		c2.addMoney(100);
		System.out.println(c2);
		System.out.println("--------------");
		c2.getMoney(50);
		System.out.println("saldo c2: " + c1.getSaldo() + "$");
		System.out.println("--------------");
		c2.getMoney(100);		
	}
}
