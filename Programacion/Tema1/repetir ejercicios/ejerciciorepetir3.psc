Algoritmo repetir3
	mayor_menor(n)
	
FinAlgoritmo

SubProceso mayor_menor(n)
	Definir n2 Como Entero
	Definir min Como Entero
	Definir max Como Entero
	Repetir
		Escribir "Dime un n�mero"
		Leer n2
		Si n2<min Entonces
			min<-n2
		SiNo
			max<-n2
		FinSi
	Hasta Que n<0 o n2<0
	Escribir "El m�ximo es " max " y el m�nimo es " min
FinSubProceso
	