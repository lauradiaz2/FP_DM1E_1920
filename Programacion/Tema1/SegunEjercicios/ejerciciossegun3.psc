Algoritmo segun3
	Definir letra Como Caracter
	Escribir "Dime un numero en romano (1 letra)"
	Leer letra
	romanos(letra)
	
FinAlgoritmo

SubProceso romanos(letra)
	//{
	Segun letra Hacer
		
		"I":
			Escribir 1
		"II":
			Escribir 2
		"III":
			Escribir 3
		"IV":
			Escribir 4
		"V":
			Escribir 5
		"VI": 
			Escribir 6
		"VII":
			Escribir 7
		"VIII":
			Escribir 8
		"IX":
			Escribir 9
		"X":
			Escribir 10
		"L":
			Escribir 50
		"C":
			Escribir 100
		"D":
			Escribir 500
		"M": 
			Escribir 1000
		De Otro Modo:
			Escribir "No es un numero romano valido"
	Fin Segun
	
	//}
FinSubProceso
	