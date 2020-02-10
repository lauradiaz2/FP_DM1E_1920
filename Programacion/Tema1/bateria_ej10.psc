Algoritmo diez
	Definir preciomatric Como Entero
	Definir mat1 Como Entero
	Definir mat2 Como Entero
	Definir mat3 Como Entero
	Definir mat4 Como Entero
	Definir mat5 Como Entero
	Definir mat6 Como Entero
	Definir media Como Real
	preciomatric<-400 
	Escribir "Dime la nota de las 6 asignaturas cursadas"
	Leer mat1,mat2,mat3,mat4,mat5,mat6
	media<-(mat1+mat2+mat3+mat4+mat5+mat6) / 6
	Si media >=4 Entonces
		Escribir "Al obtener una media de 4 o más pagarás " preciomatric - (preciomatric* 0.3) " euros de matricula."
	SiNo
		Escribir "Al obtener una media menor a 4 pagarás " preciomatric + (preciomatric*0.1) " euros de matricula."
	FinSi
FinAlgoritmo
