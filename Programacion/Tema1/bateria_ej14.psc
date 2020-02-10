Algoritmo catorce
	Definir a Como Entero
	Definir b Como Entero
	Escribir "Dime dos numeros"
	Leer a
	Leer b
	Si a>0 && b>0 Entonces
		Escribir "Los dos numeros son positivos"
	SiNo
		Si a<0 && b>0 Entonces
			Escribir "El segundo numero es positivo"
		SiNo
			Si a>0 && b<0 Entonces
				Escribir "El primer numero es positivo"
			SiNo
				Escribir "Los dos son negativos"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
