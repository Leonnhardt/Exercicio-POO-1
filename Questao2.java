public class Questao2 {
	public static void main (String [] args) {
		int numero = 0;
		int soma;

		for (int x = 0; x <= 1000; x++ ) {
		soma = numero;
		numero += x;
		System.out.println("Numero atual:"+x + "Soma:"+soma);
		}
	}
}	
