Algoritmo ocho
	Definir mes Como Caracter
	Definir precio Como Entero
	Escribir "�En qu� mes compraste el producto?"
	Leer mes
	Escribir "�Cu�nto cost� el producto?"
	Leer precio
	Si mes='octubre' o mes='Octubre' Entonces
		Escribir "Deber� pagar " precio-(precio*0.15) " euros"
	SiNo
		Escribir "Deber� pagar " precio " euros"
	FinSi
FinAlgoritmo
