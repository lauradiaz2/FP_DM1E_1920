Algoritmo Primeralgoritmo
	Definir n Como Entero;
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir lado1 Como Entero;
	Definir lado2 Como Entero;
	Definir n1 Como Entero;
	Definir n2 Como Entero;
	Definir l1 Como Entero;
	Definir l2 Como Entero;
	Definir l3 Como Entero;
	//numeros mayores que 10
	Escribir "Dime un numero";
	Leer n;
	Si n>10 Entonces;
		Escribir "Este numero es mayor que 10";
	FinSi;
	
	//el numero mas grande
	Escribir "Dime 2 numeros";
	Leer num1;
	Leer num2;
	Si num1>num2 Entonces;
		Escribir num1 " es mayor que " num2;
	SiNo
		Si num1<num2 Entonces;
			Escribir num2 " es mayor que " num1;
		SiNo
			Escribir num2 " es igual que " num1;
		FinSi;
	FinSi;
	//segun sus lados saber si es un cuadrado o rectangulo
	Leer lado1;
	Leer lado2;
	Si lado1=lado2 Entonces;
		Escribir "Es un cuadrado";
	SiNo;
		Escribir "Es un rectangulo";
	Fin Si;
	
	//numeros mayores, menores o iguales de 2 dados
	Escribir "Dime 2 numeros"
	Leer n1
	Leer n2
	Si n1>n2 Entonces
		Escribir n1 " es mayor que " n2
	SiNo
		Si n1=n2 Entonces
		Escribir n1 " es igual a " n2
		SiNo 
		Escribir n1 " es menor que " n2
		FinSi;
	FinSi
	
	//numero positivo, negativo, 0 es neutro
	Escribir "Dime un numero"
	Leer numero1
	Si numero1>0 Entonces
		Escribir "Es un numero positivo"
	SiNo
		Si numero1<0 Entonces
			Escribir "Es un numero negativo"
		SiNo
			Escribir "Es neutro"
		FinSi
	Fin Si
	//clasificacion de los triangulos segun sus lados isosceles, equilatero, escaleno
	Escribir "Dime los 3 lados del triangulo"
	Leer l1
	Leer l2
	Leer l3
	Si l1=l2 Entonces
		Si l1=l3 Entonces
			Escribir "El triangulo es equilatero"
		SiNo
			Escribir "El triangulo es isosceles"
		FinSi
	SiNo
		Si l2=l3 Entonces
			Escribir "El triangulo es isosceles"
		SiNo
			Escribir "El triangulo es escaleno"
		FinSi
	Fin Si
FinAlgoritmo
