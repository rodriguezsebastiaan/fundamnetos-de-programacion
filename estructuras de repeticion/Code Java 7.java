/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROBLEMA_PAG_147.java."

import java.io.*;
import java.math.*;

public class problema_pag_147 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double disc;
		double parteimaginaria;
		double partereal;
		double r;
		double x1;
		double x2;
		// nombre del archivo: problema pag 147
		// descripcion: programa que calcular la ecuacion de segundo grado FinAlgoritmo
		// autor:  Mateo Arias Valencia
		// fecha: 2/28/23
		// version: 1.0
		System.out.println("este programa resuelve ecuaciones de segundo grado");
		// entrada de datos 
		System.out.println("Ax^2 + bx + c");
		System.out.print("introduzca el valor de a:");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println(a+"x^2 + -bx + c");
		System.out.println("----------------------");
		System.out.print("ingrese el valor de b:");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println(a+"x^2"+b+"x+c");
		System.out.println("-----------------------");
		System.out.print("ingrese valor de c: ");
		c = Double.parseDouble(bufEntrada.readLine());
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println(a+"x^2"+b+"x"+"+"+c);
		System.out.println("--------------------------");
		// proceso
		disc = (Math.pow(b,2))-4*(a*c);
		if (disc>0) {
			x1 = ((-b)+Math.sqrt(disc))/(2*a);
			x2 = ((-b)-Math.sqrt(disc))/(2*a);
			// salida 
			System.out.println("raiz 1:"+x1);
			System.out.println("raiz 2:"+x2);
		} else {
			if (disc<0) {
				partereal = (-b)/(2*a);
				parteimaginaria = Math.sqrt(Math.abs(disc))/(2*a);
				System.out.println("raiz 1:"+partereal+"+"+parteimaginaria+"i");
				System.out.println("raiz 1:"+partereal+"-"+parteimaginaria+"i");
			} else {
				disc = 0;
				r = (-b)/(2*a);
				// salida de datos 
				System.out.println("la raiz es igual a:"+r);
			}
			System.out.println("discriminante="+disc);
		}
	}


}

