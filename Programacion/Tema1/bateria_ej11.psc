Algoritmo once
	Definir turno Como Caracter
	Definir horas Como Entero
	Definir dia Como Caracter
	Escribir "�En qu� turno trabajas?"
	Leer turno
	Escribir "�Es festivo o no festivo?"
	Leer dia
	Escribir "�Cu�ntas horas has trabajado ese d�a?"
	Leer horas
	Si dia='no festivo'
		Si turno='diurno'
			Escribir "Cobrar�s hoy " horas * 10 "euros."
		SiNo
			Escribir "Cobrar�s hoy " horas * 13.5 "euros."
		FinSi
	SiNo
		Si turno='diurno'
			Escribir "Cobrar�s hoy " (10 + (10*0.1)) * horas "euros."
		SiNo
			Escribir "Cobrar�s hoy " (13 + (13*0.15)) * horas "euros."
		FinSi
	FinSi
	
	
FinAlgoritmo
