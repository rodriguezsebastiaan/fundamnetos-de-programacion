Algoritmo sin_titulo
	// descripcion : programa que lee dos numeros e impre el mayor//
	// desarollado por : juan sebastian rodriguez castaño//
	// version: 1.0//
	// ultima actualizacion 29/02/23//
	// area de definicion de variables 
	Definir num1,num2 Como Entero
	// inicializar variables//
	num1 <- 0
	num2 <- 0
	// entrada de datos//
	Escribir 'digite un numero'
	Leer num1
	Escribir 'digite otro numero'
	Leer num2
	// procesos//
	Si num1>num2 Entonces
		Escribir 'el numero uno es el mayor :',num1
	FinSi
	Si num1=num2 Entonces
		Escribir 'los dos numeros son iguales:',num1
	FinSi
	Si num1<num2 Entonces
		Escribir 'el numero mayor es dos:',num2
	FinSi
FinAlgoritmo
