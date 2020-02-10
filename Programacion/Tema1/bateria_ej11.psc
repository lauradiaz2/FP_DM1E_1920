Algoritmo once
	Definir turno Como Caracter
	Definir horas Como Entero
	Definir dia Como Caracter
	Escribir "¿En qué turno trabajas?"
	Leer turno
	Escribir "¿Es festivo o no festivo?"
	Leer dia
	Escribir "¿Cuántas horas has trabajado ese día?"
	Leer horas
	Si dia='no festivo'
		Si turno='diurno'
			Escribir "Cobrarás hoy " horas * 10 "euros."
		SiNo
			Escribir "Cobrarás hoy " horas * 13.5 "euros."
		FinSi
	SiNo
		Si turno='diurno'
			Escribir "Cobrarás hoy " (10 + (10*0.1)) * horas "euros."
		SiNo
			Escribir "Cobrarás hoy " (13 + (13*0.15)) * horas "euros."
		FinSi
	FinSi
	
	
FinAlgoritmo
