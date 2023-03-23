/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROBLEMA_PAG_142.java."

import java.io.*;

public class problema_pag_142 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double ano;
		double año;
		double dia;
		String fecha;
		double mes;
		// nombre del archivo: problema pag 142
		// descripcion: programa que calcula el dia de la semana 
		// desarrollador: Mateo Arias valencia
		// fecha: 3/6/23
		// version: 1.0
		System.out.print("INTRODUCE UNA FECHA (DD/MM/AAAA)....");
		fecha = bufEntrada.readLine();
		System.out.println("diga el año");
		ano = Double.parseDouble(bufEntrada.readLine());
		System.out.println("diga el mes");
		mes = Double.parseDouble(bufEntrada.readLine());
		System.out.println("diga el dia ");
		dia = Double.parseDouble(bufEntrada.readLine());
		switch (dia%7) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves ");
			break;
		case 5:
			System.out.println("viernes ");
			break;
		case 6:
			System.out.println("sabado");
			break;
		case 0:
			System.out.println("domingo");
			break;
		}
	}


}

