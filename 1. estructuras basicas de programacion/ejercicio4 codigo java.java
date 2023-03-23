/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIO4.java."

import java.io.*;

public class ejercicio4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double d;
		String tiempo;
		// programa: fundamentos de programacion//
		// nombre del archivo: ejercicio4//
		// descripcion: programa que captura el tiempo tardado para obtener la velocidad FinAlgoritmo//
		// autor: juan sebastian rodriguez castaño//
		// fecha: 2/22/23//
		// version: 1.0//
		// un cuerpo posee una velocidad inicial de 12m/s y una aceleracion de 2 m/s2 cuanto tiempo tardara en adquirir un velocidad dee 144km/h2//
		System.out.println(" digite la velocidad inicial en m/s");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println(" digite la aceleracion en m/s2");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("digite la velocidad final en m/s");
		c = Double.parseDouble(bufEntrada.readLine());
		d = (b-a)/(c);
		System.out.println("tiempo tardado en adquirir los 40 m/s"+tiempo);
	}


}

