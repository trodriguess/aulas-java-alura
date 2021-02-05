package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " ";
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		System.out.println(vazio.contains("Alu"));
		
//		int a = 3;
		String nome = "Alura"; //object literal
////		String outro = new String("Alura");
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
//		
//		char c = 'A';
//		char d = 'a';
//		
//		String ch = nome.replace(c, d);
//		System.out.println(ch);
//		
//		String outra = nome.replace("A", "a");
//		
//		String outro = nome.toLowerCase();
//		
//		System.out.println(nome.replace("A", "a"));
//		System.out.println(nome.toUpperCase());
//		System.out.println("--------------");
//		System.out.println(outra);
//		System.out.println(outro);
//		
		
	}

}
