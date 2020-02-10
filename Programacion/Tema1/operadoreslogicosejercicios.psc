Algoritmo Primeralgoritmo
	Definir a Como Entero;
	Definir b Como Entero;
	Definir c Como Entero;
	//hacer una ecuacion cuando a sea distinto de 0
	Escribir "Dime 3 números";
	Leer a;
	Leer b;
	Leer c;
	Si a!=0 && (b^2 >= 4*a*c) Entonces;
		Escribir "x=" (-b + RC(b^2) - 4 * a * c ) / (2 * a);
		Escribir "x=" (-b - RC(b^2) - 4 * a * c ) / (2 * a);
	FinSi;
	
	//clave de acceso, reconozca al usuario User=admin Pass=123456
	Definir user Como Caracter;
	Definir pass Como Caracter;
	Escribir "¿Cuál es el usuario?";
	Leer user;
	Escribir "¿Cuál es la contraseña?";
	Leer pass;
	Si user='admin' && pass='123456' Entonces ;
		Escribir "Login correcto";
	SiNo;
		Escribir "El usuario o la contraseña es incorrecta";
	FinSi;
	
	//el servicio militar solo lo hacen los hombres mayores o iguales a 18 años y menores a 25 años
	Definir edad Como entero;
	Escribir "¿Qué edad tienes?";
	Leer edad;
	Si edad>=18 && edad<25 Entonces;
		Escribir "Puedes realizar el servicio militar";
	SiNo;
		Escribir "Tu no estás entre las edades comprendidas";
	FinSi;
FinAlgoritmo
