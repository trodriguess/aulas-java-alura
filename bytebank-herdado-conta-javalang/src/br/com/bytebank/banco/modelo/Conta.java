package br.com.bytebank.banco.modelo;


/**
 * Classe que representa a moldura de uma conta no Bytebank.
 * 
 * 
 * @author Thais Rodrigues
 * @version 1.0
 */


public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agência e número.
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas abertas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Estou criando uma conta " + this.numero);

	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a zero.");
			return;
		}
		this.agencia = agencia;
	}

	public abstract void deposita(double valor);
	
	/**
	 * Valor que precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {

		if (valor > this.saldo) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor a sacar: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor ou igual a zero.");
			return;
		}
		this.numero = numero;

	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	@Override
	public String toString() { 
		return "Número: " + this.numero + " Agência: " + this.agencia;
	}
}
