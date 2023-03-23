/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJEMPLO_29_PAG_75.java."

import java.io.*;

public class ejemplo_29_pag_75 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double horas;
		String nombre;
		double precio;
		double salario;
		// declaracion de varaiables
		// area definicion de variables
		System.out.println("CALCULO DE SALARIOS");
		// area de entradas
		System.out.println("Introduzca el nombre del empleado:");
		nombre = bufEntrada.readLine();
		System.out.println("Introduzca las horas trabajadas por semana:");
		horas = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Introduzca el precio por hora:");
		precio = Double.parseDouble(bufEntrada.readLine());
		// area de procesos
		if (horas<=40) {
			salario = horas*precio;
			System.out.println("El salario mensual de "+nombre+" es de: "+salario);
		} else {
			salario = (40*precio)+((horas-40)*precio*1.5);
			// area de salidas
			System.out.println("El salario mensual de "+nombre+" es de: "+salario);
			System.out.println("----------------------");
		}
	}


}

