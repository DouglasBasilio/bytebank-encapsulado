public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // static � da classe, no caso class Conta
	
	// constructor
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas � " + Conta.total);		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando a conta " + this.numero);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Opera��o realizada com sucesso");
			return true;
		} else {
			System.out.println("Saldo insuficiente para esta opera��o");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);

			System.out.println("Transfer�ncia realizada com sucesso");
			return true;
		} else {
			System.out.println("Saldo insuficiente para esta opera��o");
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode valor <= 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	// preciso falar que o m�todo � da Classe atrav�s do static
	public static int getTotal() {
		return Conta.total;
	}
}