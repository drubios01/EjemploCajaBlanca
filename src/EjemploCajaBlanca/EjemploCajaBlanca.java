package EjemploCajaBlanca;

import java.util.Scanner;

public class EjemploCajaBlanca {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un n�mero mayor que 0:  ");
		int num = entrada.nextInt();
		System.out.print(CompruebaNumeroPerfecto(num));
	}
	static String CompruebaNumeroPerfecto(int num) {
		int divisor = 1, sumadivisores = 0;
		String Cadena = "";
		while (divisor <= num / 2) {
			if (num % divisor == 0) {
				sumadivisores += divisor;
			}
			divisor++;
		}
		if (num == sumadivisores) {
			Cadena = "El número " + num + " es un número perfecto";

		} else {
			Cadena = "El número " + num + " no es un número perfecto";
		}
		return Cadena;
	}
}
