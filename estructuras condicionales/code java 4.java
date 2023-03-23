/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROBLEMA_PAG_120.java."

import java.io.*;

public class problema_pag_120 {

	public static void main(String args[]) {
		double i;
		int multiplicacion;
		System.out.println("Calcular el producto de los primeros n numeros natuarles");
		// Declaración de variables
		// Inicializar la variable multiplicacion en cero
		multiplicacion = 0;
		// Ciclo para multiplicar los primeros n números natuarles
		for (i=1;i<=9;i++) {
			multiplicacion = multiplicacion*i;
		}
		// area de salida
		System.out.println("La multilicacion de los primeros n numeros natuarles es: "+multiplicacion);
	}


}

