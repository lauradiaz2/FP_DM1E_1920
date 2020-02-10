Algoritmo binario
	Definir n Como Entero
	//Escribir "Dime un numero para pasarlo a binario"
	//Leer n
	bin(5)
FinAlgoritmo

SubProceso bin(n)
	Repetir
		n2<-n%2
		n<-n/2
		x<-n2
		Escribir x
		//n<-(n/2)
		//Escribir n2
	Hasta Que n=0
	
FinSubProceso
	