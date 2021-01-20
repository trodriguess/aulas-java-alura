//Contrato Autenticável:
//quem assina esse contrato precisa implementar
//método setSenha
//Método autentica

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
