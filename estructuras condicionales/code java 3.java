/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROBLEMA_PAG_73.java."

import java.io.*;

public class problema_pag_73 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int horastrabajadas;
		double impuesto;
		String nombre;
		double salariobruto;
		double salarioneto;
		// Declaración de variables
		// Entrada de datos
		System.out.println("Ingrese el nombre del trabajador: ");
		nombre = bufEntrada.readLine();
		System.out.println("Ingrese el número de horas trabajadas: ");
		horastrabajadas = Integer.parseInt(bufEntrada.readLine());
		// Cálculo del salario bruto
		salariobruto = horastrabajadas*10000;
		// Cálculo del impuesto a pagar
		impuesto = salariobruto*0.25;
		// Cálculo del salario neto
		salarioneto = salariobruto-impuesto;
		// Salida de datos
		System.out.println("El salario bruto de "+nombre+" es: "+salariobruto);
		System.out.println("El impuesto a pagar es: "+impuesto);
		System.out.println("El salario neto de "+nombre+" es: "+salarioneto);
	}


}

