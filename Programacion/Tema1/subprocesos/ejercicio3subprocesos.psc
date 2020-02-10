Algoritmo ejerciciossubprocesos
	Definir n Como Entero
	Leer n
	numerofactorial(n)
FinAlgoritmo

SubProceso numerofactorial(n)
	m=1
	Mientras n>0 hacer 
		m=m*n
		n=n-1
	FinMientras
	Escribir m
FinSubProceso
