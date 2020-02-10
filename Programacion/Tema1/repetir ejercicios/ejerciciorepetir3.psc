Algoritmo repetir3
	mayor_menor(n)
	
FinAlgoritmo

SubProceso mayor_menor(n)
	Definir n2 Como Entero
	Definir min Como Entero
	Definir max Como Entero
	Repetir
		Escribir "Dime un número"
		Leer n2
		Si n2<min Entonces
			min<-n2
		SiNo
			max<-n2
		FinSi
	Hasta Que n<0 o n2<0
	Escribir "El máximo es " max " y el mínimo es " min
FinSubProceso
	