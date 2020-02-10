Algoritmo repetir2
	Definir num1 Como Entero
	Escribir "¿Qué tabla de multiplicar quieres?"
	Leer num1
	tabla_multiplicar(num1)
	
FinAlgoritmo

SubProceso tabla_multiplicar(num1)
	n<-1
	Repetir
		Escribir num1 "*" n "=" num1 * n
		n<-n+1
	Hasta Que n>=11
	
FinSubProceso
