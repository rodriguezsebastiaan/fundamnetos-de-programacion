/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIO1.java."

import java.io.*;

public class ejercicio1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double d;
		// programa: fundamentos de programacion//
		// nombre del archivo: ejercicio1//
		// descripcion: programa que captura la aceleracion FinAlgoritmo//
		// autor: juan sebastian rodriguez castaño//
		// fecha: 2/22/23//
		// version: 1.0//
		// un camion circula por una carretera a 20m/s en 5 segundos su velocidad pasa ser de de 25m/s //
		System.out.println(" digite la velocidad inicial en m/s");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println(" tiempo tardado en adquirir 25m/s");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("digite la velocidad final en m/s");
		c = Double.parseDouble(bufEntrada.readLine());
		d = (c-a)/(b);
		System.out.println("el resultado de aceleraccion es: "+d);
	}


}

