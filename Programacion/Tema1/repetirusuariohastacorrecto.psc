Algoritmo uno
	Definir user Como Caracter;
	Definir pass Como Entero;
	Repetir;
	Escribir "¿Cuál es el usuario?";
	Leer user;
	Escribir "¿Cuál es la contraseña?";
	Leer pass;
	Si user='admin' && pass=123456 Entonces;
		Escribir "Login correcto";
	SiNo
		Escribir "El usuario o la contraseña es incorrecta";
	FinSi;
	Hasta Que user='admin' && pass=123456;
FinAlgoritmo
