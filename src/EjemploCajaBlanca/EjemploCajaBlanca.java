package EjemploCajaBlanca;

import java.util.Scanner;
/**
 * Código de ejemplo de un ejercicio de caja blanca, donde se comprueba si un número es perfecto
 * 
 * @author Daniel Rubio
 * @version 1.0
 *
 */
public class EjemploCajaBlanca {
	/**
	 * 
	 * @hidden
	 */
	public static void main(String[] args) {
		//Creo la variable entrada para capturar el número tecleado por el ususario
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un número mayor que 0:  ");
		int num = entrada.nextInt();
		System.out.print(CompruebaNumeroPerfecto(num));
	}
	/**
	 * El metodo CompruebaNumeroPerfecto comprueba la si la suma de sus divisores es igual a el mismo
	 * @param num Variable de tipo entero que representa el numero a comprobar si es perfecto o no
	 * @return Cadena de texto donde se indica si el numero introducido es perfecto o no
	 */
	public static String CompruebaNumeroPerfecto(int num) {
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
