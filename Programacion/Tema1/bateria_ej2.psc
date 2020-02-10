Algoritmo dos
	Definir horas Como Entero
	Definir sueldo Como Entero
	Escribir "¿Cuántas horas trabajas a la semana?"
	Leer horas
	Escribir "¿Cuánto cobras la hora?"
	Leer sueldo
	Si horas>40
		Escribir "Cobrarás esta semana " (horas - 40) * (sueldo * 0.5 + sueldo) + (40 * sueldo) " euros."
	SiNo
		Escribir "Cobraras esta semana " horas * sueldo
	FinSi
FinAlgoritmo
