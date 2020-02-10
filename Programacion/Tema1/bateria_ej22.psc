Algoritmo asd
	Definir clave Como Caracter
	Definir n Como Entero
	n<-0
	Mientras clave!='eureka'&& n<=3 Hacer
		Si n<3 Entonces
			Escribir "Cual es la clave"
			Leer clave
			
		SiNo
			Escribir "3 intentos agotados"
		FinSi
		n<-n+1
	Fin Mientras
	Si clave="eureka" Entonces
		Escribir "Clave correcta"
	FinSi
	//Escribir "Has realizado 3 intentos"
FinAlgoritmo
