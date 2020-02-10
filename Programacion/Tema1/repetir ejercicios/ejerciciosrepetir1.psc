Algoritmo repetir1
	Definir n1 Como Entero
	Definir n2 Como Entero
	Escribir "Dime 2 numeros"
	Leer n1,n2
	primos(n1,n2)
	
FinAlgoritmo

SubProceso primos(n1,n2)
	//{
	Definir divisor Como Entero
	Definir divisores Como Entero
	
	
	Repetir
		divisores<-0
		divisor<-1
		Repetir
			Si n1%divisor = 0 Entonces
				divisores<- divisores +1
			FinSi
			divisor <- divisor +1
		Hasta Que divisor>n1
		Si divisores=2 Entonces
			Escribir n1
		FinSi
		n1 <- n1+1
	Hasta Que n1>n2
	//}
FinSubProceso
