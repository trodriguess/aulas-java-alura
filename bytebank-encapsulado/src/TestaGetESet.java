
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 34558);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
	}
}
