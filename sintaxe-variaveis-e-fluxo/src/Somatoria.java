
public class Somatoria {
	public static void main(String[] args) {
		int contador = 0;
		int somatoria = 0;
		
		while(contador <= 10) {
			somatoria += contador;
			contador++;
		}
		System.out.println(somatoria);
	}
}
