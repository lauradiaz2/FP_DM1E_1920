Algoritmo asd
	Definir a Como Entero
	Definir n Como Entero
	Escribir "Multiplos de 2 o de 3"
	Leer a
	n<-1
	Si a=2 Entonces 
		Mientras a>=1 && a<=100 Hacer
		Si a%2=0 Entonces
			Escribir a " es multiplo de 2"
		FinSi
		a<-a+1
		Fin Mientras
	SiNo
		Si a=3 Entonces
			Mientras a>=1 && a<=100 Hacer
				Si a%3=0 Entonces
					Escribir a " es múltiplo de 3"
				FinSi
				a<-a+1
			FinMientras
		FinSi
	FinSi
FinAlgoritmo
