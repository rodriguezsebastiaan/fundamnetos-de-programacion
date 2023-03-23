/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIO2.java."

import java.io.*;

public class ejercicio2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double d;
		// programa: fundamentos de programacion//
		// nombre del archivo: ejercicio4//
		// descripcion: programa que captura la aceleracion FinAlgoritmo//
		// autor: juan sebastian rodriguez castaño//
		// fecha: 2/22/23//
		// version: 1.0//
		// un formula 1 que parte de del reposo alcanza 216km/H en 10s calcular la aceleracion//
		System.out.println(" digite la velocidad inicial en km/h");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println(" tiempo tardado en adquirir 216km/h");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("digite la velocidad final en km/h");
		c = Double.parseDouble(bufEntrada.readLine());
		d = (c-a)/(b);
	}


}

