Algoritmo ocho
	Definir mes Como Caracter
	Definir precio Como Entero
	Escribir "¿En qué mes compraste el producto?"
	Leer mes
	Escribir "¿Cuánto costó el producto?"
	Leer precio
	Si mes='octubre' o mes='Octubre' Entonces
		Escribir "Deberá pagar " precio-(precio*0.15) " euros"
	SiNo
		Escribir "Deberá pagar " precio " euros"
	FinSi
FinAlgoritmo
