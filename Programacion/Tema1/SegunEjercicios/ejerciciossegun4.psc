Algoritmo segun4
	Definir operacion Como Caracter
	Definir n1 Como Entero
	Definir n2 Como Entero
	Escribir "Dime 2 numeros"
	Leer n1,n2
	Escribir "Ahora la operacion que quieras realizar"
	Leer operacion
	opera(operacion,n1,n2)
	
FinAlgoritmo

SubProceso opera(operacion,n1,n2)
	//{
	Segun operacion Hacer
		"+":
			Escribir n1 "+" n2 "=" n1+n2
		"-":
			Escribir n1 "-" n2 "=" n1-n2
		"*","x":
			Escribir n1 "*" n2 "=" n1*n2
		"/":
			Escribir n1 "/" n2 "=" n1/n2
		De Otro Modo:
			Escribir "No conozco la operacion"
	Fin Segun
	//}
FinSubProceso
