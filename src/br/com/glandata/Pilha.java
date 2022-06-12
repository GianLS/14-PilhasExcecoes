package br.com.glandata;

public class Pilha {

	public static void main(String[] args) {
		System.out.println("In�cio do M�todo Main!");

		try {
			metodo1(4);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Fim do M�todo Main!");
	}

	private static void metodo1(int x) throws Exception {
		System.out.println("In�cio do M�todo 1!");

		if (x < 5) {
			Exception exception = new Exception("O valor de X est� incorreto.");
			throw exception;
		}

		metodo2();

		System.out.println("Fim do M�todo 1!");
	}

	private static void metodo2() {
		System.out.println("In�cio do M�todo 2!");

		for (int i = 5; i >= 0; i--) {
			System.out.println("O valor de i �: " + i);
		}

		int dividendo = 4;
		int divisor = 0;

		String x = new String();
		x = "AB";

		try {
			x.charAt(1);
			System.out.println(dividendo / divisor);
		} catch (ArithmeticException e) {
			System.out.println("Erro aritim�tico capturado!");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Erro de Array Out of Bound!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro Gen�rico");
		}

		System.out.println("Fim do M�todo 2!");
	}
}
