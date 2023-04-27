Algoritmo sin_titulo
	// programa: fundamentos de programacion//
	// nombre del archivo: problema pag 74//
	// descripcion: programa que calcular la medida de una serie de numeros positivos FinAlgoritmo//
	// autor: juan sebastian rodriguez castaño//
	// fecha: 2/26/23//
	// version: 1.0//
	// calcular la medida de una serie de numeros positivos sopiniendo que los datos se leen desde un terminal//
	Definir n,c,suma Como Entero
	Escribir 'escribir un numero n = 0 '
	Leer n
	Si n>0 Entonces
		c <- 0
		suma <- 0
	FinSi
	Mientras c<n Hacer
		c <- c+1
		suma <- suma+n
	FinMientras
	Escribir 'escribir el total de numeros positivos es: ',c
	Leer c
	Escribir ' el promedio de los numeros es:',suma/c
FinAlgoritmo
