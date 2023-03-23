/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROBLMA_PAG_133.java."

import java.io.*;

public class problma_pag_133 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int numdos;
		int nummay;
		String numtres;
		int numuno;
		int v_numdos;
		int v_nummay;
		int v_numtres;
		int v_numuno;
		// leer dos numeros e informar cual es el mayor
		// version 1.0
		// desarrollado por:Mateo Arias
		// fecha:27/02/23
		// area definicion de variables
		// inicializar variables
		v_numuno = 0;
		v_numdos = 0;
		v_numtres = 0;
		v_nummay = 0;
		// entradas
		System.out.println("digite el numero 1");
		v_numuno = Integer.parseInt(bufEntrada.readLine());
		System.out.println("digite el numero 2");
		v_numdos = Integer.parseInt(bufEntrada.readLine());
		System.out.println("digite el numero 3");
		v_numtres = Integer.parseInt(bufEntrada.readLine());
		// procesos
		if (v_numuno!=v_numdos) {
			if (v_numdos<numuno) {
				v_nummay = v_numuno;
				if (v_numdos!=v_numtres) {
					if (v_numtres<numdos) {
						v_nummay = numtres;
					}
				}
			} else {
				v_nummay = v_numdos;
			}
			System.out.println("el numero mayor es:"+v_nummay);
		} else {
			System.out.println("no hay numero mayor los dos son iguales");
		}
	}


}

