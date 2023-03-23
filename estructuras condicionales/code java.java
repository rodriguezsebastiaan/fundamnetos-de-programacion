/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROBLEMA_PAG_123.java."

import java.io.*;

public class problema_pag_123 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int mayor;
		int num1;
		int num2;
		int num3;
		// declaracion de variables
		// area de entrada
		System.out.println("num1");
		num1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("num2");
		num2 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("num3");
		num3 = Integer.parseInt(bufEntrada.readLine());
		// area de procesos
		if (num1>num2 && num1>num3) {
			mayor = num1;
		}
		if (num2>num1 && num2>num3) {
			mayor = num2;
		}
		if (num3>num2 && num2>num1) {
			mayor = num3;
		}
		System.out.println("el numero mayor es:"+mayor);
	}


}

