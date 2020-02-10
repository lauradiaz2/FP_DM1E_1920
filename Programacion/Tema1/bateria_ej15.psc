Algoritmo quince
	Definir titulo Como Caracter
	Definir nota Como entero
	Escribir "Para acceder necesitas bachillerato o prueba de acceso"
	Leer titulo
	Si titulo='prueba de acceso' Entonces
		Escribir "Cual fue tu nota en la prueba de acceso"
		Leer nota
		Si nota>=5 Entonces
			Escribir "Si puedes acceder al grado superior"
		SiNo
			Escribir "No conseguiste la puntuacion minima"
		FinSi
	Sino
		Si titulo='bachillerato' Entonces
			Escribir "Puedes acceder a grado superior"
		SiNo
			Escribir "Para acceder a grado superior necesitas bachillerato o realizar la prueba de acceso"
		FinSi
	FinSi
	
FinAlgoritmo
