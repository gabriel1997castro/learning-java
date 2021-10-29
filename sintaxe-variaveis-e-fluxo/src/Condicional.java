
public class Condicional {
	public static void main(String[] args) {
		System.out.println("Testes condicionais");

		int idade = 20;
		int quantidadeDePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {

			if (quantidadeDePessoas >= 2)
				System.out.println("voce nao tem 18, mas pode entrar, pois está acompanhado");
			else
				System.out.println("Infelizmente você não pode entrar");
		}
	}
}
