Algoritmo sin_titulo
	// programa: fundamentos de programacion//
	// nombre del archivo: ejercicio 5//
	// descripcion: programa que acepte al escribir tres numeros enteros e imprima el mayo de ellos FinAlgoritmo//
	// autor: juan sebastian rodriguez castaño//
	// fecha: 2/26/23//
	// version: 1.0//
	Definir s_diurno,s_nocturno,sp,bf,rf,fe,i_total Como Real
	Escribir 's_diurno'
	Leer s_diurno
	Escribir 's_nocturno'
	Leer s_nocturno
	Escribir 'sp'
	Leer sp
	Escribir 'bf'
	Leer bf
	Escribir 'rf'
	Leer rf
	Escribir 'fe'
	Leer fe
	Escribir 'i_totales_diurno'
	Leer i_totales_diurno
	Escribir 'i_totales_nocturno'
	Leer i_totales_nocturno
	s_diurno <- i_totales_diurno-sp-bf-rf-fe
	s_nocturno <- i_totales_nocturno-sp-bf-rf-fe+40*14000000/100
	Escribir 'salario diurno es:',s_diurno
	Escribir 'salario nocturno es',s_nocturno
FinAlgoritmo
