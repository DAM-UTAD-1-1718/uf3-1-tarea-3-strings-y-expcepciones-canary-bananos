package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	/*
	 * Realiza un método que reciba una cadena de caracteres (con letras y
	 * números) y devuelva la suma de todos los dígitos incluidos en la cadena. •
	 * Ejemplo de entrada: asd4fsadf6asdf7asljg • Ejemplo de salida: La suma de los
	 * números es 17
	 */
	String cadena;
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int e = 0;
	int f = 0;
	int g = 0;
	int h = 0;
	int i = 0;
	int j = 0;
	int suma = 0;

	public ejercicio1() {
		Scanner scan = new Scanner(System.in);
		cadena = scan.nextLine();

	}

	public int Recorrer() {
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 49) {
				a = 1;
			}
			if (cadena.charAt(i) == 50) {
				b = 2;
			}

			if (cadena.charAt(i) == 51) {
				c = 3;
			}
			if (cadena.charAt(i) == 52) {
				d = 4;
			}
			if (cadena.charAt(i) == 53) {
				e = 5;
			}
			if (cadena.charAt(i) == 54) {
				f = 6;
			}

			if (cadena.charAt(i) == 55) {
				g = 7;
			}
			if (cadena.charAt(i) == 56) {
				h = 8;
			}
			if (cadena.charAt(i) == 57) {
				i = 9;
			}
			if (cadena.charAt(i) == 48) {
				j = 0;
			}

			// if(Character.isDigit(cadena.charAt(i))) {
			// char b = cadena.charAt(i);
			// a=Integer.parseInt(b);
			//
			// }
		}
		suma = a + b + c + d + e + f + g + h + i + j;
		return suma;
	}
}
