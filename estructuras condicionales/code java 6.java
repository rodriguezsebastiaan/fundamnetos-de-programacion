/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROBLEMA_PAG_118.java."

import java.io.*;

public class problema_pag_118 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double costo;
		double duracion;
		System.out.println("CALCULO DE COSTO DE LLAMADA");
		System.out.println("Introduzca la duracion de la llamada en minutos:");
		duracion = Double.parseDouble(bufEntrada.readLine());
		if (duracion<=3) {
			costo = 0.10;
		} else {
			costo = 0.10+((duracion-3)*0.05);
		}
		System.out.println("El costo de la llamada es de: "+costo+" euros.");
	}


}

