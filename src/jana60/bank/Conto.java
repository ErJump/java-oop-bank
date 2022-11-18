package jana60.bank;

public class Conto {
	private int numeroConto;
	private String nomeProprietario;
	private int saldo;
	
	Conto(int numeroConto, String nomeProprietario ) {
		this.numeroConto = numeroConto;
		this.nomeProprietario = nomeProprietario;
		saldo = 0;
	}
	
	public int getNumeroConto() {
		return numeroConto;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public void addMoney(int money) {
		saldo += money;
	}
	
	@Override
	public String toString() {
		return "nome proprietario: " + getNomeProprietario() 
				+ "\nnumero conto: " + getNumeroConto() 
				+ "\nsaldo: " + getSaldo() + "$";
	}
}
