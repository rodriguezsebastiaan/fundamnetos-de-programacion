Algoritmo sin_titulo
	// descripcion:
	// enunciado: calculo de la nomina de un empleado
	//desarrollaado por juan sebastian rodriguez castaño
	//version:1.0
	//fecha : 6/03/2023
	//area de declaracion de variables
	definir v_nomEmp Como Caracter
	definir v_horSemTra Como Entero
	definir v_valhor Como Entero
	definir v_valHorExt Como Entero
	definir v_valImp como real 
	definir v_sueBas Como Real
	definir v_suePag como real 
	definir v_valHorNor como entero
	// area de inicializacion de variable 
	v_nomEmp= "";
	v_horSemTra=0;
	v_valhor =0;
	v_valHorExt=0;
	v_valImp=0.0;
	v_sueBas=0.0;
	v_suePag =0.0;
	v_valHorNor=0.0;
	//area de lecturas
	escribir "digite nombre del empleado:";
	leer v_nomEmp
	escribir"digite horas trabajadas semanales";
	leer v_horSemTra
	escribir "digite el valor hora trabajada:";
	leer v_valhor
	//area de procesos
	si v_horSemTra<35 Entonces
		v_sueBas=v_horSemTra*v_valHor
	SiNo
		v_sueBas=35*v_valHor+(v_horSemTra-35)*v_valHor*1.5
				
	FinSi
	
	si v_sueBas>=300.000 y v_sueBas <= 400.000 Entonces
		v_valImp=v_sueBas*0.20;
	SiNo
		si v_sueBas <= 400.000 Entonces
			v_valImp=v_sueBas*0.30
		FinSi
		
	FinSi
FinAlgoritmo
