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
		
		boolean res1 = c1.getMoney(20);
		System.out.println("risultato prelievo: " + res1);
		System.out.println(c1.getSaldo() + "$");
		System.out.println("--------------");
		boolean res2 = c1.getMoney(10);
		System.out.println("risultato prelievo: " + res2);
		System.out.println("--------------");

		Conto c2 = new Conto(5678, "Giovanni Rossi");
		c2.addMoney(100);  
		System.out.println(c2);
		System.out.println("--------------");
		boolean res3 = c2.getMoney(50);
		System.out.println("risultato prelievo: " + res3);

		System.out.println("saldo c2: " + c2.getSaldo() + "$");
		System.out.println("--------------");
		boolean res4 = c2.getMoney(100);
		System.out.println("risultato prelievo: " + res4);

	}
}
