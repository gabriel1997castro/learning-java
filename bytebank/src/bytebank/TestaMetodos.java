package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
//		Conta segundaConta = primeiraConta;
		
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta " + primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta " + primeiraConta.saldo);
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		System.out.println("Depositando 600 na primeira");
		primeiraConta.deposita(600);
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Transferindo 100 para a segunda conta");
//		primeiraConta.transfere(100, segundaConta);
		if(primeiraConta.transfere(100, segundaConta)) {
			System.out.println("Primeira conta tem " + primeiraConta.saldo);
			System.out.println("Segunda conta tem " + segundaConta.saldo);
		}
		// Como pode ser visto primeiraConta e segundaConta não são objetos
		// mas sim referências.
	}
}
