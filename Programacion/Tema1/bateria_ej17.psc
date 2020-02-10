Algoritmo diecisiete
	Definir nombre Como Caracter
	Definir practica Como Entero
	Definir problemas Como Entero
	Definir teoria Como Entero
	Escribir "Cuál es tu nombre"
	Leer nombre
	Escribir "Dime tu nota en la parte de practica, practica y la de problemas"
	Leer practica,problemas,teoria
	Si practica>=0 && problemas>=0 && teoria>=0 && practica<=10 && problemas<=10 && teoria<=10 Entonces
		Escribir nombre ", tu nota es " ((practica * 0.1) + (teoria * 0.4) + (problemas*0.5))
	SiNo
		Escribir "ERROR. Las notas deben estar comprendidas entre 0 y 10"
	FinSi
	
FinAlgoritmo
