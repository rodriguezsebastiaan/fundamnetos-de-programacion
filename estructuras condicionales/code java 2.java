/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROBLEMA_PAG_122.java."

import java.io.*;
import java.math.*;

public class problema_pag_122 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double disc;
		double raizdisc;
		String raiz_cuadradadisc;
		double x1;
		double x2;
		// Pedimos los valores de los coeficientes
		System.out.println("Ingresa el valor de A:");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresa el valor de B:");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresa el valor de C:");
		c = Double.parseDouble(bufEntrada.readLine());
		// Calculamos el discriminante
		disc = Math.pow(b,2)-4*a*c;
		// Verificamos si la ecuación tiene solución
		if (disc<0) {
			System.out.println("La ecuación no tiene solución.");
		} else {
			// Calculamos las raíces
			raizdisc = raiz_cuadradadisc;
			x1 = (-b+raizdisc)/(2*a);
			x2 = (-b-raizdisc)/(2*a);
			// Mostramos las raíces
			System.out.println("Las raíces son:");
			System.out.println("x1 ="+x1);
			System.out.println("x2 ="+x2);
		}
	}


}

