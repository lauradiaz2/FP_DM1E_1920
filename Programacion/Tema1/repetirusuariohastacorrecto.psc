Algoritmo uno
	Definir user Como Caracter;
	Definir pass Como Entero;
	Repetir;
	Escribir "�Cu�l es el usuario?";
	Leer user;
	Escribir "�Cu�l es la contrase�a?";
	Leer pass;
	Si user='admin' && pass=123456 Entonces;
		Escribir "Login correcto";
	SiNo
		Escribir "El usuario o la contrase�a es incorrecta";
	FinSi;
	Hasta Que user='admin' && pass=123456;
FinAlgoritmo
