Algoritmo segun5
	Definir area Como Caracter
	Escribir "Que area quieres calcular? (trapecio, tri�ngulo, cuadrado, rect�ngulo o c�rculo)"
	Leer area
	calc_area(area)
FinAlgoritmo

SubProceso calc_area(area)
	//{
	Definir r Como Entero
	Definir b Como Entero
	Definir h como entero
	Definir l Como Entero
	
	Segun area Hacer
		"trapecio":
			Escribir "Dime la base mayor y la menor"
			Leer b,h
			Escribir "El area del trapecio es " (b + h) / 2
		"triangulo":
			Escribir "Dime la base y la altura del triangulo"
			Leer b,h
			Escribir "El area del triangulo es " (b * h) / 2
		"cuadrado":
			Escribir "Dime el lado del cuadrado"
			Leer l
			Escribir "El area del cuadrado es " l*l
		"rectangulo":
			Escribir "Dime la base y la altura del rect�ngulo"
			Leer b, h
			Escribir "El area del rect�ngulo es " b * h
		"circulo":
			Escribir "Dime el radio del circulo"
			Leer r
			Escribir "El �rea del c�culo es " 3.14 * (r^2)
		De Otro Modo:
			Escribir "No conozco esa figura"
	Fin Segun
	//}
FinSubProceso
