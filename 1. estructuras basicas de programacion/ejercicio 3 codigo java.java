/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIO3.java."

import java.io.*;

public class ejercicio3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double aceleracion;
		double b;
		double c;
		double c2;
		double d;
		double e;
		// programa: fundamentos de programacion
		// nombre del archivo: ejercicio 3//
		// descripscion: programa que captura la aceleracion espacio recorrido antes de alcanzar su velocidad regular
		// autor: juan sebastian rodriguez castaño//
		// fecha:2/22/23//
		// version:1.0//
		// una locomotora necesita 10s para alcanzar su velocidad normal que es 25m/s suponiendo que su movimiento es uniformente acelerado  que aceleracion se le ha comunicado y que espacio ha recorrido antes de alcanzar su velocidad regular//
		System.out.println("velocidad inicial en m/s");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("velocidad final en m/s");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("tiempo de cambio de velocidad nicial y final");
		c = Double.parseDouble(bufEntrada.readLine());
		d = (b-a)/c;
		e = (a)*(c)+1/2*aceleracion*c2;
	}


}

