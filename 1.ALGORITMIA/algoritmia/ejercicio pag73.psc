Algoritmo sin_titulo
	// programa: fundamentos de programacion//
	// nombre del archivo: problema pag 73//
	// descripcion: programa que calcula el salirio bruto y neto FinAlgoritmo//
	// autor: juan sebastian rodriguez castaño//
	// fecha: 2/22/23//
	// version: 1.0//
	// Luis trabaja 6 dias a la semana y las horas laborales diarias es de 8 horas diurnas cada hora vale 5mil y el dia 40mil y en las horas nocturas el recargo es de 1.750 la hora y las 8 horas nocturas es de 14mil su salrio bruto es de 1.328.000 y se le descuenta el 8 MOD  de salud y pension//
	Definir a,b,c,d,e,f,g,h Como Real
	Escribir 'valor de hora trabajada diaen '
	Leer a
	Escribir ' valor horas trabajadas noche '
	Leer b
	Escribir 'porcentaje de impuestos a pagar '
	Leer c
	Escribir 'numero de horas trabajas dias '
	Leer d
	Escribir 'numero de horas trabajas noche'
	Leer e
	Escribir 'porcentaje incremento horas noche en 0.35%'
	Leer f
	g <- (d)*(a)+((f*b/100)+b)*(e)
	h <- (g)-(c*g)/100
FinAlgoritmo
