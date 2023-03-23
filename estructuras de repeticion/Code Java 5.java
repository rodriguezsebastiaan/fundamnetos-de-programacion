/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIO_5.java."

import java.io.*;

public class ejercicio_5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int d1;
		int dia;
		String dia1;
		// descripcion: progrma que pregunta que dia de la semana fue el dia 1 del mes y clacula el dia segun la fecha
		// desarrollaodr: Mateo Arias
		// version: 1.0
		// fecha: 4/03/23
		// declaracion de variables
		// entrada de datos
		System.out.println(("el dia 1 del mes fue (l, m, x, j, v, s, d: "));
		dia1 = bufEntrada.readLine();
		switch (dia1) {
		case "1":
			d1 = 0;
			break;
		case "m":
			d1 = 1;
			break;
		case "x":
			d1 = 2;
			break;
		case "j":
			d1 = 3;
			break;
		case "v":
			d1 = 4;
			break;
		case "s":
			d1 = 5;
			break;
		case "d":
			d1 = 6;
			// SiNo
			d1 = -40;
			break;
		}
		// salida de datos
		System.out.println(("diga el dia"));
		dia = Integer.parseInt(bufEntrada.readLine());
		dia = dia+d1;
		switch (dia%7) {
		case 1:
			System.out.println(("lunes"));
			break;
		case 2:
			System.out.println(("martes"));
			break;
		case 3:
			System.out.println(("miercoles"));
			break;
		case 4:
			System.out.println(("jueves"));
			break;
		case 5:
			System.out.println(("viernes"));
			break;
		case 6:
			System.out.println(("sabado"));
			break;
		case 0:
			System.out.println(("domingo"));
			break;
		}
	}


}

