Algoritmo sin_titulo
	// leer 2 numeros e informar cual es el mayo//
	// version: 1.0//
	// desarrollado por : juan sebastian rodriguez//
	// 27/2/23 //
	// area de definicion //
	Definir v_numUno Como Entero
	Definir v_numdos Como Entero
	Definir v_numMay Como Entero
	// inicializar variable
	v_numUno <- 0
	v_numdos <- 0
	v_numMay <- 0
	// entradas
	Escribir 'digite el numero 1'
	Leer v_numUno
	Escribir 'digite numero 2'
	Leer v_numdos
	// Proceso 
	Si v_numUno<>v_numdos Entonces
		Si v_numUno>v_numdos Entonces
			v_numMay <- v_numUno
		SiNo
			v_numMay <- v_numdos
		FinSi
		Escribir ' el numero mayor es:',v_numMay
	SiNo
		Escribir 'no hay numero mayor los dos soniguales'
	FinSi
FinAlgoritmo
