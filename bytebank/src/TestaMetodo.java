public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		if (sucessoTransferencia){
		System.out.println("transfer�ncia realizada com sucesso.");
		}else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaMarcela.saldo);
		
		//contaDoPaulo.titular("Paulo Silveira");
		
	}
}
