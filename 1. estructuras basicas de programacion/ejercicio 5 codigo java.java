/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double bf;
		double fe;
		double i_total;
		double i_totales_diurno;
		double i_totales_nocturno;
		double rf;
		double sp;
		double s_diurno;
		double s_nocturno;
		// programa: fundamentos de programacion//
		// nombre del archivo: ejercicio 5//
		// descripcion: programa que acepte al escribir tres numeros enteros e imprima el mayo de ellos FinAlgoritmo//
		// autor: juan sebastian rodriguez castaño//
		// fecha: 2/26/23//
		// version: 1.0//
		System.out.println("s_diurno");
		s_diurno = Double.parseDouble(bufEntrada.readLine());
		System.out.println("s_nocturno");
		s_nocturno = Double.parseDouble(bufEntrada.readLine());
		System.out.println("sp");
		sp = Double.parseDouble(bufEntrada.readLine());
		System.out.println("bf");
		bf = Double.parseDouble(bufEntrada.readLine());
		System.out.println("rf");
		rf = Double.parseDouble(bufEntrada.readLine());
		System.out.println("fe");
		fe = Double.parseDouble(bufEntrada.readLine());
		System.out.println("i_totales_diurno");
		i_totales_diurno = Double.parseDouble(bufEntrada.readLine());
		System.out.println("i_totales_nocturno");
		i_totales_nocturno = Double.parseDouble(bufEntrada.readLine());
		s_diurno = i_totales_diurno-sp-bf-rf-fe;
		s_nocturno = i_totales_nocturno-sp-bf-rf-fe+40*14000000/100;
		System.out.println("salario diurno es:"+s_diurno);
		System.out.println("salario nocturno es"+s_nocturno);
	}


}

