/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int v_horsemtra;
		String v_nomemp;
		double v_suebase;
		double v_suepag;
		int v_valhor;
		int v_valhorext;
		int v_valhornor;
		double v_valimp;
		// DESCRIPCION
		// enunciado: calcula de la nomina de un empleado
		// desarrollado por: Mateo Arias
		// version: 1.0
		// fecha:06/03/23
		// AREA DE DECLARACION DE VARIABLES
		// AREA DE INICIALIZACION DE VARIABLES
		v_nomemp = "";
		v_horsemtra = 0;
		v_valhorext = 0;
		v_valimp = 0.0;
		v_suebase = 0.0;
		v_suepag = 0.0;
		v_valhornor = 0;
		// AREA DE LECTURAS
		System.out.println("digite nombre del empleado:");
		v_nomemp = bufEntrada.readLine();
		System.out.println("Digite las horas trabajadas semanales:");
		v_horsemtra = Integer.parseInt(bufEntrada.readLine());
		System.out.println("digite el valor de la hora trabajada:");
		v_valhor = Integer.parseInt(bufEntrada.readLine());
		// AREA DE PROCESOS
		if (v_horsemtra<35) {
			v_suebase = v_horsemtra*v_valhor;
		} else {
			v_suebase = 35*v_valhor+(v_horsemtra-35)*v_valhor*1.5;
		}
		if (v_suebase>=300000 && v_suebase<=400000) {
			v_valimp = v_suebase*0.20;
		} else {
			if (v_suebase>400000) {
				v_valimp = v_suebase*0.30;
			}
		}
	}


}

