
public class Condicional {
	public static void main(String[] args) {
		System.out.println("Testes condicionais");

		int idade = 20;
		int quantidadeDePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {

			if (quantidadeDePessoas >= 2)
				System.out.println("voce nao tem 18, mas pode entrar, pois est� acompanhado");
			else
				System.out.println("Infelizmente voc� n�o pode entrar");
		}
	}
}
