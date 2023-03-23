Algoritmo ejemplo_29_pag_75
	// declaracion de varaiables
	Definir nombre Como Caracter
	Definir horas,precio,salario Como Real
	// area definicion de variables
	Escribir 'CALCULO DE SALARIOS'
	// area de entradas
	Escribir 'Introduzca el nombre del empleado:'
	Leer nombre
	Escribir 'Introduzca las horas trabajadas por semana:'
	Leer horas
	Escribir 'Introduzca el precio por hora:'
	Leer precio
	// area de procesos
	Si horas<=40 Entonces
		salario <- horas*precio
		Escribir 'El salario mensual de ',nombre,' es de: ',salario
	SiNo
		salario <- (40*precio)+((horas-40)*precio*1.5)
		// area de salidas
		Escribir 'El salario mensual de ',nombre,' es de: ',salario
		Escribir '----------------------'
	FinSi
FinAlgoritmo
