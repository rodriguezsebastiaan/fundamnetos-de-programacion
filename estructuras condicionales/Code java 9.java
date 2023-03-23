/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROBLEMA_PAG_74.java."

import java.io.*;

public class problema_pag_74 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int contador;
		double media;
		double numero;
		double suma;
		// Declaración de variables
		// Inicialización de variables
		suma = 0;
		contador = 0;
		// Entrada de datos
		System.out.println("Ingrese una serie de números positivos. Ingrese 0 para terminar.");
		numero = Double.parseDouble(bufEntrada.readLine());
		// Procesamiento de datos
		while (numero!=0) {
			if (numero>0) {
				suma = suma+numero;
				contador = contador+1;
			}
			numero = Double.parseDouble(bufEntrada.readLine());
		}
		// Cálculo de la media
		if (contador>0) {
			media = suma/contador;
			System.out.println("La media de la serie de números positivos es: "+media);
		} else {
			System.out.println("No se ingresaron números positivos.");
		}
	}


}

