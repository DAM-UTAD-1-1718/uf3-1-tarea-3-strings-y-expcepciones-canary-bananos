package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	String cadena;
	char caracter;

	public Ejercicio2() {
		Scanner sc = new Scanner(System.in);
		cadena = sc.nextLine();
	}

	public String Ortografia() {
		for (int i = 0; i < cadena.length() - 1; i++) {
			if (i == 0)
				Character.toUpperCase(cadena.charAt(i));
			else if (cadena.charAt(i) == '.' && cadena.charAt(i + 1) == ' ')
				Character.toUpperCase(cadena.charAt(i + 2));
		}
		return cadena;
	}
}
