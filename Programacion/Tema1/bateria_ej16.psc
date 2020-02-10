
Algoritmo dieciseis
	Definir dia Como Entero
	Definir mes Como Entero
	Definir año Como Entero
	Escribir "Que dia es"
	Leer dia
	Escribir "Que mes es"
	Leer mes
	Escribir "Que año es"
	Leer año
	Si dia>=1 && dia<=30 Entonces
		Si año>0 Entonces
			Si mes=1 Entonces
				Escribir dia " de enero de " año
			SiNo
				Si mes=2 Entonces
					Escribir dia " de febrero de " año
				SiNo
					Si mes=3 Entonces
						Escribir dia " de marzo de " año
					SiNo
						Si mes=4 Entonces
							Escribir dia " de abril de " año
						SiNo
							Si mes=5 Entonces
								Escribir dia " de mayo de " año
							SiNo
								Si mes=6 Entonces
									Escribir dia " de junio de " año
								SiNo
									Si mes=7 Entonces
										Escribir dia " de julio de " año
									SiNo
										Si mes=8 Entonces
											Escribir dia " de agosto de " año
										SiNo
											Si mes=9 Entonces
												Escribir dia " de septiembre de " año
											SiNo
												Si mes=10 Entonces
													Escribir dia " de octubre de " año
												SiNo
													Si mes=11 Entonces
														Escribir dia " de noviembre de " año
													SiNo
														Si mes=12 Entonces
															Escribir dia " de diciembre de " año
														SiNo
															Escribir "Fecha no válida"
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
			Escribir "Fecha no válida"
		FinSi
	SiNo
		Escribir "Fecha no válida"
	FinSi
	FinAlgoritmo
