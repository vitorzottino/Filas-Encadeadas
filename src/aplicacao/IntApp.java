package aplicacao;

import java.util.Scanner;

import filas.FilaInt;

public class IntApp {

	public static void main(String[] args) {

		FilaInt fila = new FilaInt();
		Scanner input = new Scanner(System.in);
		int valor;

		do {
			System.out.println("Num Positivo / Num Negativo: ");
			valor = input.nextInt();

			if (valor > 0)
				fila.enqueue(valor);

		} while (valor >= 0);
		
		input.close();

		do {
			System.out.println(fila.dequeue());
			

		} while (!fila.isEmpty());

	}

}
