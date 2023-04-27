Algoritmo sin_titulo
	//programa: fundamentos de programacion//
	//nombre del archivo: problema pag 122//
	//descripcion: programa que disñe un algoritmo oara resolver una ecuacion de segundo grado FinAlgoritmo//
	//autor: juan sebastian rodriguez castaño//
	// fecha: 2/26/23//
	//version: 1.0//
	// ecuacion de segundo grado Ax2+bx+c=0//
	definir a,b,c,xuno,xdos como reales
	// pedir los datos de entrada 
	escribir "ingrese a";
	leer a
	escribir "ingrese b";
	leer b
	escribir "ingrese c";
	leer c
	//proceso, aplicar la formula
	xuno = (-b + raiz((b^2)-(4*a*c)))/2*a;
	xdos = (-b - raiz((b^2)-(4*a*c)))/2*a;
	//mostrar la salida
	escribir "x1 es igual a",xuno;
	escribir "x2 es igual a ", xdos;
FinAlgoritmo
