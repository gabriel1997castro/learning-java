package bytebank;

public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = primeiraConta;
		
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta " + primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta " + primeiraConta.saldo);
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		System.out.println(primeiraConta);
		
		// Como pode ser visto primeiraConta e segundaConta não são objetos
		// mas sim referências.
	}
}
