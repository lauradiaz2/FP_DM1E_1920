Algoritmo ads
	Definir n Como Entero
	Definir min Como Entero
	Definir max Como Entero
	Definir x Como Entero
	min<-n
	max<-n
	Escribir "Dime un numero"
	Leer n
	i<-0
	x<-0
	Mientras n!=0 Hacer
		Si n<=min Entonces
			min<-n
		SiNo
			max<-n
		FinSi
		Escribir "Dime un numero"
		Leer n
		i<-i+1
		x<-x+n
	Fin Mientras
	Escribir "La media aritmetica es " x / i
	Escribir "Maximo " max
	Escribir "Minimo " min
FinAlgoritmo
