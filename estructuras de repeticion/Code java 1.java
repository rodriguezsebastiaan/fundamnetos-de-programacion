/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "ECUACION_DE_PRIMERGRADO.java."

import java.io.*;

public class ecuacion_de_primergrado {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double x;
		// descripcion:programa que lee una ecuacion lineal y la resuleve
		// version:1.0
		// desarrollado por:Mateo Arias
		// fecha:28/02/23
		// area de definicion de variables
		// area de entrada
		System.out.println("digite el valor de a");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("digite el valor de b");
		b = Double.parseDouble(bufEntrada.readLine());
		// area de Proceso 
		if (a!=0) {
			x = -1*b/a;
			System.out.println("la solucion de la ecuacion es:"+x);
			if (b==0) {
				// area de salidas
				System.out.println("la ecuacion no tiene solucion");
			}
		} else {
			System.out.println("solucion indeterminada");
		}
	}


}

