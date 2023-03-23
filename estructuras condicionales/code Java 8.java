/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJEMPLO_28_PAG_75.java."

import java.io.*;

public class ejemplo_28_pag_75 {

	public static void main(String args[]) {
		int i;
		int suma;
		// DECLARACION DE VARIABLES
		// inicializacion de varaiables
		suma = 0;
		for (i=2;i<=100;i+=2) {
			// area de procesos 
			suma = suma+i;
		}
		// area de salidas
		System.out.println("La suma de los numeros pares entre 2 y 100 es: "+suma);
	}


}

