
Algoritmo dieciseis
	Definir dia Como Entero
	Definir mes Como Entero
	Definir a�o Como Entero
	Escribir "Que dia es"
	Leer dia
	Escribir "Que mes es"
	Leer mes
	Escribir "Que a�o es"
	Leer a�o
	Si dia>=1 && dia<=30 Entonces
		Si a�o>0 Entonces
			Si mes=1 Entonces
				Escribir dia " de enero de " a�o
			SiNo
				Si mes=2 Entonces
					Escribir dia " de febrero de " a�o
				SiNo
					Si mes=3 Entonces
						Escribir dia " de marzo de " a�o
					SiNo
						Si mes=4 Entonces
							Escribir dia " de abril de " a�o
						SiNo
							Si mes=5 Entonces
								Escribir dia " de mayo de " a�o
							SiNo
								Si mes=6 Entonces
									Escribir dia " de junio de " a�o
								SiNo
									Si mes=7 Entonces
										Escribir dia " de julio de " a�o
									SiNo
										Si mes=8 Entonces
											Escribir dia " de agosto de " a�o
										SiNo
											Si mes=9 Entonces
												Escribir dia " de septiembre de " a�o
											SiNo
												Si mes=10 Entonces
													Escribir dia " de octubre de " a�o
												SiNo
													Si mes=11 Entonces
														Escribir dia " de noviembre de " a�o
													SiNo
														Si mes=12 Entonces
															Escribir dia " de diciembre de " a�o
														SiNo
															Escribir "Fecha no v�lida"
														FinSi
													FinSi
												FinSi
											FinSi
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi	
					FinSi
				FinSi
			FinSi
		SiNo
			Escribir "Fecha no v�lida"
		FinSi
	SiNo
		Escribir "Fecha no v�lida"
	FinSi
	FinAlgoritmo
