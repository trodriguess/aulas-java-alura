//Contrato Autentic�vel:
//quem assina esse contrato precisa implementar
//m�todo setSenha
//M�todo autentica

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
