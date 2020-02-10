Algoritmo PrimerAlgoritmo
	Definir num3 Como Entero;
	Definir min Como Entero;
	Definir precio Como Entero;
	Definir iva Como Entero;
	Escribir "Dime un numero";
	Leer num3;
	Escribir "El cuadrado de " num3 " es " num3^2;
	
	Escribir "El numero anterior de " num3 " es " num3 - 1 " y el numero posterior de " num3 " es " num3 + 1;
	
	Escribir "De horas a minutos y segundos, 6 horas son " (6 * 60) " minutos y " (6 * 60)*60 " segundos." ;
	
	Escribir "¿Cuantos min ha estado dando vueltas el spinner?";
	Leer min;
	Escribir "Si en 1 min da 60 vueltas a una velocidad cte, en " min " minutos da " min * 60 " vueltas.";
	
	Escribir "Dime el precio del producto";
	Leer precio;
	Escribir "Dime el tipo de IVA 4%, 16% o 21%";	
	Leer iva;
	Escribir "El precio con el " iva "% de IVA sería " precio * iva /100 + precio;
FinAlgoritmo
