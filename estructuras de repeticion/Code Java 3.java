/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROBLEMA_PAG_137.java."

import java.io.*;

public class problema_pag_137 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double area;
		double b;
		double h;
		// programa: fundamentos de programacion
		// nombre del archivo: problema pag 137
		// descripcion: programa que calcula el  area de un triangulo gradoFinAlgoritmo
		// autor: Mateo Arias Valencia
		// fecha: 2/28/23
		// version: 1.0
		// declaracion de variables
		// inicializacion de variables
		b = 0.0;
		h = 0.0;
		// area de entradas
		System.out.println("cual es la longitud de la base del triangulo ");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("cual es la longitud de la altura ");
		h = Double.parseDouble(bufEntrada.readLine());
		// area de procesos
		area = (b*h)/2;
		System.out.println("el resultado de la suma es: "+area);
	}


}

