Algoritmo sin_titulo
	// programa: fundamentos de programacion//
	// nombre del archivo: problema pag 75//
	// descripcion: programa que calcular la suma de los numeros pares FinAlgoritmo//
	// autor: juan sebastian rodriguez castaño//
	// fecha: 2/26/23//
	// version: 1.0//
	// suma de los numeros pares comprendidos entre 2 y 100//
	Definir i,suma Como Entero
	suma <- 0
	Para i<-2 Hasta 100 Hacer
		Si i MOD 2==0 Entonces
			suma <- suma+1
		FinSi
	FinPara
	Escribir 'la suma de los numeros pares es:',suma
FinAlgoritmo
