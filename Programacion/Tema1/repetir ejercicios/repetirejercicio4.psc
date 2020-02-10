Algoritmo repetir4
	Definir n Como Entero
	//Escribir "Dime un número de 4 cifras"
	//Leer n
	Escribir "Dime un numero de 4 cifras"
	Leer n
	numeron(n)
FinAlgoritmo

SubProceso numeron(n)
	Definir v Como Entero
	v<-0
	b<-1000
	Repetir
		n2<-n%10
		//Escribir n2
		n<-(n/10) -(n2/10)
		resultado<-resultado+n2*b
		//Escribir "Esto es a " resultado
		v<-v+1
		b<-b/10
	Hasta Que v=4
	Escribir "Esto es a " resultado
FinSubProceso
