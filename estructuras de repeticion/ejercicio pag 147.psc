Algoritmo sin_titulo
	// programa: fundamentos de programacion//
	// nombre del archivo: problema pag 147//
	// descripcion: programa que calcular la ecuacion de segundo grado FinAlgoritmo//
	// autor: juan sebastian rodriguez castaño//
	// fecha: 2/28/23//
	// version: 1.0//
	Escribir 'este programa resuelve ecuaciones de segundo grado'
	Definir a,b,c,x1,x2,disc Como Real
	// entrada de datos 
	Escribir 'Ax^2 + bx + c'
	Escribir 'introduzca el valor de a:' Sin Saltar
	Leer a
	Borrar Pantalla
	Escribir a,'x^2 + -bx + c'
	Escribir '----------------------'
	Escribir 'ingrese el valor de b:' Sin Saltar
	Leer b
	Borrar Pantalla
	Escribir a,'x^2',b,'x+c'
	Escribir '-----------------------'
	Escribir 'ingrese valor de c: ' Sin Saltar
	Leer c
	Borrar Pantalla
	Escribir a,'x^2',b,'x','+',c
	Escribir '--------------------------'
	// proceso
	disc <- (b^2)-4*(a*c)
	Si disc>0 Entonces
		x1 <- ((-b)+rc(disc))/(2*a)
		x2 <- ((-b)-rc(disc))/(2*a)
		// salida 
		Escribir 'raiz 1:',x1
		Escribir 'raiz 2:',x2
	SiNo
		Si disc<0 Entonces
			partereal <- (-b)/(2*a)
			parteimaginaria <- rc(abs(disc))/(2*a)
			Escribir 'raiz 1:',partereal,'+',parteimaginaria,'i'
			Escribir 'raiz 1:',partereal,'-',parteimaginaria,'i'
		SiNo
			disc <- 0
			r <- (-b)/(2*a)
			// salida de datos 
			Escribir 'la raiz es igual a:',r
		FinSi
		Escribir 'discriminante=',disc
	FinSi
FinAlgoritmo
