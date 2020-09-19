
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());

		Cliente douglas = new Cliente();
		// conta.titular = douglas;
		douglas.setNome("Douglas Basilio");

		conta.setTitular(douglas);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(douglas);
		System.out.println(conta.getTitular());
		
	}
}
