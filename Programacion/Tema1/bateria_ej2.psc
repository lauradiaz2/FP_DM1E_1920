Algoritmo dos
	Definir horas Como Entero
	Definir sueldo Como Entero
	Escribir "�Cu�ntas horas trabajas a la semana?"
	Leer horas
	Escribir "�Cu�nto cobras la hora?"
	Leer sueldo
	Si horas>40
		Escribir "Cobrar�s esta semana " (horas - 40) * (sueldo * 0.5 + sueldo) + (40 * sueldo) " euros."
	SiNo
		Escribir "Cobraras esta semana " horas * sueldo
	FinSi
FinAlgoritmo
