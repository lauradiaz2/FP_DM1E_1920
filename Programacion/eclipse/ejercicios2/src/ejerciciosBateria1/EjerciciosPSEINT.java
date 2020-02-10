package ejerciciosBateria1;

import java.util.Scanner;

public class EjerciciosPSEINT 
{
	//Ejercicio1
	
		void MostrarEjer1(Scanner input)
		{
			
			int lado1;
			int altura1;
			int lado2;
			int altura2;
			double area1;
			double area2;
			
			System.out.print("Ejercicio 1");
			System.out.print("Dime la altura y la base de 2 triangulos");
			lado1 = input.nextInt();
			altura1 = input.nextInt();
			lado2 = input.nextInt();
			altura2 = input.nextInt();
			area1 = lado1 * altura1 / 2;
			area2 = lado2 * altura2 / 2;
			if (area1 > area2)
			{
				System.out.println("El área del primer triangulo es mayor que la del segundo");
			}
			else
			{
				System.out.println("El area del primer triangulo es menor que la del segundo");
			}
			System.out.println("Hemos terminado de calcular suma");
		}
	
	//Ejercicio2

		void MostrarEjer2(Scanner input)
		{
			int horas;
			int tarifa;
			double salario;
			double salario1;
			System.out.print("Ejercicio 2");
			System.out.print("Dime las horas que has trabajado y el salario por hora");
			horas = input.nextInt();
			tarifa = input.nextInt();
			if (horas < 40)
			{
				salario = (horas * tarifa);
				System.out.print("Tu salario por "+horas+" trabajadas es de "+salario+" euros");
			}
			else
			{
				salario1 = ((horas - 40) * (tarifa + tarifa * 0.5) + 40 * tarifa );
				System.out.print("Tu salario por "+horas+" trabajadas es de "+salario1+" euros");
			}
		}
	
	//Ejercicio3
	
		void MostrarEjer3(Scanner input)
		{
			int num1;
			int num2;
			int extra;
			System.out.print("Ejercicio 3");
			System.out.print("Dime dos números");
			num1 = input.nextInt();
			num2 = input.nextInt();
			extra = num2;
			num2 = num1;
			num1 = extra;
			System.out.print("El primer numero es "+num1+" y el segundo numero es "+num2);
		}
	
	//Ejercicio4
	
		void MostrarEjer4(Scanner input)
		{
			int num1;
			int num2;
			int num3;
			System.out.print("Ejercicio 4");
			System.out.print("Dime 3 números");
			num1 = input.nextInt();
			num2 = input.nextInt();
			num3 = input.nextInt();
			
			if (num1 > num2 && num1 > num3)
			{
				if (num2 > num3)
				{
					System.out.print(num1+" es el numero más grande");
					System.out.print(num3+" es el numero más pequeño");
				}
				else
				{
					System.out.print(num1+" es el numero más grande");
					System.out.print(num2+" es el numero más pequeño");
				}
			}
			else
			{
				if (num2 > num1 && num2 > num3)
				{
					if (num1 > num3)
					{
						System.out.print(num2+" es el numero más grande");
						System.out.print(num3+" es el numero más pequeño");
					}
					else
					{
						System.out.print(num2+" es el numero más grande");
						System.out.print(num1+" es el numero más pequeño");
					}
				}
				else
				{
					if (num1 < num2)
					{
					System.out.print(num3+" es el numero más grande");
					System.out.print(num1+" es el numero más pequeño");
					}
					else
					{
						System.out.print(num3+" es el numero más grande");
						System.out.print(num2+" es el numero más pequeño");
					}
				}
			}
		
		}
	
	//Ejercicio5
	
		void MostrarEjer5(Scanner input)
		{
			int num1;
			int num2;
			int num3;
			double producto;
			double suma;
			System.out.print("Dime 3 números");
			num1 = input.nextInt();
			num2 = input.nextInt();
			num3 = input.nextInt();
			
			if (num1<0)
			{
				producto = num1 * num2 * num3;
				System.out.print("Producto de los 3 números es "+producto);
			}
			else
			{
				suma = num1 + num2 + num3;
				System.out.print("La suma de los 3 números = "+suma);
			}
		}
		
	//Ejercicio6
		
		void MostrarEjer6(Scanner input)
		{
			int num1;
			double raiz;
			double cuadrado;
			System.out.print("Dime un número\n");
			num1 = input.nextInt();
			if (num1 <= 0)
			{
				System.out.print("ERROR\n");
			}
			else
			{
				cuadrado = num1 * num1;
				raiz = Math.sqrt(num1);
				System.out.print("La raiz de "+num1+" es "+raiz+" y el cuadrado del mismo es "+cuadrado+"\n");
			}
		}
		
	//Ejercicio7
		
		void MostrarEjer7(Scanner input)
		{
			int ninios;
			int ninias;
			int colegio;
			double porcentaje1;
			double porcentaje2;
			System.out.print("¿Cuántas niñas hay?\n");
			ninias = input.nextInt();
			System.out.print("¿Cuántas niños hay?\n");
			ninios = input.nextInt();
			colegio = ninios + ninias;
			porcentaje1 = (ninias*100)/colegio;
			porcentaje2 = 100-porcentaje1;
			System.out.print("Hay "+porcentaje1+"% de niñas y "+porcentaje2+"% de niños\n");
		}
	
	//Ejercicio8
		
		void MostrarEjer8(Scanner input)
		{
			String mes;
			int precio;
			double descuento;
			System.out.print("�En qu� mes compro la prenda?\n");
			mes = input.nextLine();
			System.out.print("�Cu�nto le cost� la prenda?\n");
			precio = input.nextInt();
			if (mes.contentEquals("octubre"))
			{
				descuento = precio - (0.15* precio);
				System.out.print("La prenda tenia un 15% de descuento, le costó "+descuento+"€\n");
			}
			else
			{
				System.out.print("La prenda le costó "+precio+"€\n");
			}
		}
		
	//Ejercicio9
		
		void MostrarEjer9(Scanner input)
			{
				int num1;
				int cuadrado;
				num1 = 1;
				while (num1 < 10)
				{
					cuadrado = num1 * num1;
					System.out.print("El cuadrado de "+num1+" es "+(cuadrado)+"\n");
					num1++;
				}
			}
		
	//Ejercicio10
		
		void MostrarEjer10(Scanner input)
		{
			int asig1;
			int asig2;
			int asig3;
			int asig4;
			int asig5;
			int asig6;
			double media;
			int matricula;
			double precio;
			double precio2;
			matricula = 400; //sin IVA
			System.out.print("Dime tus notas\n");
			System.out.print("Programación\n");
			asig1 = input.nextInt();
			System.out.print("FOL\n");
			asig2 = input.nextInt();
			System.out.print("Bases de datos\n");
			asig3 = input.nextInt();
			System.out.print("Lenguajes de marcas\n");
			asig4 = input.nextInt();
			System.out.print("Entornos de desarrollo\n");
			asig5 = input.nextInt();
			System.out.print("Sistemas informaticos\n");
			asig6 = input.nextInt();
			media = (asig1 + asig2 + asig3 + asig4 + asig5 + asig6)/6;
			if (media>=4)
			{
				precio = matricula - 0.3 * matricula;
				System.out.print("Enhorabuena, tu nota media es mayor o igual a 4\nPagarás un 30% menos de matricula y se te quedará en \n"+precio+"€");
			}
			else
			{
				precio2 = matricula + 0.1 * matricula;
				System.out.print("Lo siento, tu nota media es menor a 4 \nPagarás la matricula más el iva del 10% "+precio2+"€");
			}
		}

	//Ejercicio11
		
		void MostrarEjer11(Scanner input)
		{
			String turno;
			double nocturno;
			int diurno;
			String festivo;
			int horas;
			nocturno = 13.5; //tarifa en nocturno
			diurno = 10; //tarifa en diurno
			System.out.print("¿En qué turno trabajas?\n ");
			turno = input.nextLine();
			System.out.print("¿Es festivo? si o no\n ");
			festivo = input.nextLine();
			System.out.print("¿Cuántas horas?\n ");
			horas = input.nextInt();
			//13\n
			//horas = 13
			//buffer = \n
			//cadena = \n
			//buffer = vacio
			if (turno.contentEquals("diurno")&&(festivo.contentEquals("si")))
			{
				System.out.print("Siendo festivo y de turno diurno, cobrarás "+((diurno + 0.1 * diurno)*horas)+"€");
			}
			else
			{
				if (turno.contentEquals("diurno")&&(festivo.contentEquals("no")))
				{
				System.out.print("Siendo no festivo y trabajando en el turno diurno, cobrarás "+(diurno*horas)+"€");
				}
				else
					if (turno.contentEquals("nocturno")&&(festivo.contentEquals("si")))
					{
						System.out.print("Siendo turno nocturno y festivo, cobrarás "+((nocturno + 0.15 * nocturno)* horas)+"€");
					}
					else
					{
						System.out.print("Siendo turno nocturno y no festivo, cobrarás "+(nocturno*horas));
					}
				}
			
		}

	//Ejercicio12
		
		void MostrarEjer12(Scanner input)
		{
			int num1;
			System.out.print("Dime un número\n ");
			num1 = input.nextInt();
			if (num1 != 0 && num1%2 == 0)
			{
				System.out.print("Este numero es par\n ");
			}
			else
			{
				if (num1%2 != 0)
				{
					System.out.print("Este numero es impar\n ");
				}
				else
				{
					System.out.print("Este numero no es par ni impar\n ");
				}
			}
		}
		
	//Ejercicio13
		
		void MostrarEjer13(Scanner input)
		{
			int num1;
			int num2;
			double division;
			System.out.print("Dime dos números\n ");
			num1 = input.nextInt();
			num2 = input.nextInt();
			if (num2 != 0)
			{
				division = (double)num1/num2;
				System.out.print("División de ambos numeros es igual a "+division);
			}
			else
			{
				System.out.print("ERROR, el segundo numero dado es 0\n ");
			}
		}
		
	//Ejercicio14
		
		void MostrarEjer14(Scanner input)
		{
			int num1;
			int num2;
			System.out.print("Dime dos números\n ");
			num1 = input.nextInt();
			num2 = input.nextInt();
			if (num1 > 0)
			{
				if (num2 > 0)
				{
					System.out.print("Los dos números son positivos\n ");
				}
				else
				{
					System.out.print("El segundo numero es negativo\n ");
				}
			}
			else
			{
				if (num2 < 0)
				{
					System.out.print("Los dos numeros son negativos\n ");
				}
				else
				{
					System.out.print("El primer numero es negativo\n ");
				}
			}
		}
		
	//Ejericcio15
		
		void MostrarEjer15(Scanner input)
		{
			String titulo;
			System.out.print("¿Qué titulo tienes?\n ");
			titulo = input.nextLine();
			if (titulo.contentEquals("bachiller") || titulo.contentEquals("prueba de acceso"))
			{
				System.out.print("Puedes acceder al grado superior\n ");
			}
			else
			{
					System.out.print("Necesitas realizar la prueba de acceso o el titulo de bachillerato\n ");
			}
		}
		
	//Ejercicio16
		
		void MostrarEjer16(Scanner input)
		{
			int dia;
			int mes;
			int anio;
			System.out.print("Qué día es\n ");
			dia = input.nextInt();
			System.out.print("Qué mes es\n ");
			mes = input.nextInt();
			System.out.print("Qué año es\n ");
			anio = input.nextInt();
			if (dia <= 30 && dia>=1)
			{
				if (anio > 0)
				{
					if (mes == 1)
					{
						System.out.print(dia + " de enero del "+anio);
					}
					else
					{
						if (mes == 2)
						{
							System.out.print(dia + " de febrero del "+anio);
						}
						else
						{
							if (mes == 3)
							{
								System.out.print(dia + " de marzo del "+anio);
							}
							else
							{
								if (mes == 4)
								{
									System.out.print(dia + " de abril del "+anio);
								}
								else
								{
									if (mes==5)
									{
										System.out.print(dia + " de mayo del "+anio);
									}
									else
									{
										if (mes==6)
										{
											System.out.print(dia + " de junio del "+anio);
										}
										else
										{
											if (mes==7)
											{
												System.out.print(dia + " de julio del "+anio);
											}
											else
											{
												if (mes == 8)
												{
													System.out.print(dia + " de agosto del "+anio);
												}
												else
												{
													if (mes==9)
													{
														System.out.print(dia + " de septiembre del "+anio);
													}
													else
													{
														if (mes==10)
														{
															System.out.print(dia + " de octubre del "+anio);
														}
														else
														{
															if (mes==11)
															{
																System.out.print(dia + " de noviembre del "+anio);
															}
															else
															{
																if (mes==12)
																{
																	System.out.print(dia + " de diciembre del "+anio);
																}
																else
																{
																	System.out.print("La fecha introducida es err�nea");
																}
															}
														}
													}
												}
											}
										}
									}
								}
								
							}
						}
					}
				}
				else
				{
					System.out.print("La fecha introducida es errónea");
				}
			}
			else
			{
				System.out.print("La fecha introducida es errónea");
			}
		}
		
	//Ejercicio17
		
		void MostrarEjer17(Scanner input)
		{
			String nombre;
			int practica;
			int teoria;
			int problemas;
			double resultado;
			do
			{
				System.out.print("Nombre: ");
				nombre = input.nextLine();
				System.out.print("Practica: ");
				practica = input.nextInt();
				System.out.print("Teoria: ");
				teoria = input.nextInt();
				System.out.print("Problemas: ");
				problemas = input.nextInt();
				resultado = (double)practica*0.1 + teoria*0.4 + problemas*0.5;
				if (practica >= 0 && practica <= 10 && teoria >= 0 && teoria <= 10 && problemas >= 0 && problemas <= 10)
				{
					System.out.print(nombre+" tu nota final es un: "+resultado);
				}
				else
				{
					System.out.print("Las notas introducidas no son válidas");
				}
			}
			while (nombre.contentEquals(null));
		}
		
	//Ejercicio18
		
		void MostrarEjer18(Scanner input)
		{
			int num1;
			int x;
			int cuadrado;
			System.out.print("Dime un número");
			num1 = input.nextInt();
			x=0;
			while (x<10)
			{
				cuadrado = num1*num1;
				System.out.print("El cuadrado de "+num1+" es "+cuadrado+"\n");
				++x;
				++num1;
			}
		}
		
	//Ejercicio19
		
		void MostrarEjer19(Scanner input)
		{
			int num1;
			int result;
			System.out.print("Dime un número");
			num1 = input.nextInt();
			if (num1%2 != 0)
			{
				result = (num1 + 1) + num1 + 3 + num1 + 5 + num1 + 7 + num1 + 9;
				System.out.print("La suma de los 5 numeros es "+result);
			}
			else
			{
				result = num1 + num1 + 2 + num1 + 4 + num1 + 6 + num1 + 8;
				System.out.print("La suma de los 5 numeros es "+result);
			}
			
		}
		
		
	//Ejercicio20
		
		void MostrarEjer20(Scanner input)
		{
			int num1;
			int x;
			int m;
			System.out.print("Dime un número");
			num1 = input.nextInt();
			x = 0;
			m = 1;
			while (x<10)
			{
				System.out.print(num1+"*"+m+"= "+num1*m+"\n");;
				++x;
				++m;
			}
		}
		
	//Ejercicio21
		
		void MostrarEjer21(Scanner input)
		{
			int num1;
			double media;
			int suma;
			int x;
			num1 = 0;
			media = 0;
			x = 0;
			suma = 0;
			while (num1>=0)
			{
			System.out.println("Dime un número");
			num1 = input.nextInt();
			suma = suma + num1;
			++x;
			}
			media = (double)suma / x;
			System.out.print("La media de todos los numeros es "+media);
		}
		
	//Ejercicio22
		
		void MostrarEjer22(Scanner input)
		{
			String clave;
			int x;
			System.out.println("Dime la clave");
			clave = input.nextLine();
			x=1;
			while (x<3 && !clave.contentEquals("eureka"))
			{
				System.out.println("Error");
				System.out.println("Dime la clave");
				clave = input.nextLine();
				++x;
			}
			if (x==3)
			{
			System.out.println("Agotaste los 3 intentos");
			}
			else
			{
				System.out.println("Clave correcta");
			}
			}
			
	//Ejercicio23
		
		void MostrarEjer23(Scanner input)
		{
			int num1;
			int media;
			int min;
			int max;
			int x;
			int resultmedia;
			x=0;
			min=0;
			max=0;
			media=0;
			num1=1;
			while (num1>0 || num1<0)
			{
				System.out.println("Dime un numero");
				num1 = input.nextInt();
				media = media + num1;
				if (num1<min)
				{
					min=num1;
				}
				else
				{
					if (num1>max)
					{
						max=num1;
					}
				}
				++x;
			}
			resultmedia= media/x;
			System.out.println("La media de todos los numeros es "+resultmedia);
			System.out.println(min+" es el numero más pequeño");
			System.out.println(max+" es el numero más grande");
		}
		
	//Ejercicio24
		
		void MostrarEjer24(Scanner input)
		{
			int num1;
			num1=1;
			while (num1>=1 && num1<=100)
			{
				System.out.println((num1%2==0 && num1%3==0)?num1+" es multiplo de 2 y de 3":(num1%2==0)?num1+" es multiplo de 2":(num1%3==0)?num1+" es multiplo de 3":num1+" No es multiplo de 2 ni de 3");
				++num1;
			}
			
		}
		
	//Ejercicio25
		
		void MostrarEjer25(Scanner input)
		{
			int n;
			int x;
			int f;
			int result;
			int k;
			System.out.println("Dime un numero");
			n = input.nextInt();
			x=1;
			f=1;
			k=0;
			result=0;
			while (n!=x)
			{
				result=k +f;
				k=f;
				f=result;
				++x;
			}
			System.out.println("La posición "+x+" de la serie de Fibonacci"+result);
		}
		
	//Ejercicio26
		
		void MostrarEjer26(Scanner input)
		{
			int n1;
			int n2;
			int x;
			int a;
			int result;
			System.out.println("Dime 2 numeros");
			n1 = input.nextInt();//este debe ser menor que el n2
			n2 = input.nextInt();
			x=n1;
			a=1;
			result=1;
			while (x<=n2)
			{
				while (a<=x)
				{
					result= result*a;
					++a;
				}
				System.out.println("El factorial de "+x+" es "+result);
				++x;
			}
		}
		
	//Ejercicio27
		
		void MostrarEjer27(Scanner input)
		{
			int x = 0;
			int b;
			int a;
			System.out.println("Dime un numero");
			a = input.nextInt();
			b = 2;// empezamos a dividir desde el 2 ya que el uno...
			x = 2;//va a tener 2 divisores el mismo y la unidad ¿verdad?
			while (x <=2 && b<a)
			{
				System.out.println(b);
				if (a%b==0)//nada más tenga otro divisor no es primo
				{
					++x;
				}
				else
				{
					++b;
				}
			}
			System.out.println(a+((x==2)?" es un número primo":" no es un numero primo"));
		}
		
	//Ejercicio28
		
		void MostrarEjer28(Scanner input)
		{
			int dec;
			int c;
			int bin;
			int x;
			System.out.println("Dime un numero entre 0 y 15");
			dec = input.nextInt();
			bin = 0;
			c=1;
			x=1;
			if (dec<=15 && dec>=1)
			{
				while (x<=4)
				{
					bin = bin + dec%2 * c;
					dec = dec/2;
					c= c*10;
					++x;
				}
				System.out.println("El numero en binario es "+bin);
			}
			else
			{
				System.out.println("Error, el numero debe estar comprendido entre 1 y 15");
			}
			
		}
		
	//Ejercicio29
		
		void MostrarEjer29(Scanner input)
		{
			int n;
			int x;
			System.out.println("Dime un numero mayor que 0");
			n = input.nextInt();
			if (n>0)
			{
				x=0;
				while (n>0)
				{
					n=n/10;
					++x;
				}
				System.out.println("El numero dado tiene "+x+" cifras.");
			}
			else
			{
				System.out.println("Introduzca un numero mayor que 0 :D");
			}
		}
		
	//Ejercicio30
		
		void MostrarEjer30(Scanner input)
		{
			int lado;
			int x;
			int m;
			System.out.println("Dime un numero(CUADRADO**)");
			lado=input.nextInt();
			if (lado>0)
			{
				for (x=0;x<lado;x++)
				{
					if (x>=1 && x<=lado-2)
					{
						for (m=0;m<lado;m++)
						{
							if (m==0 || m==lado-1)
							{
							System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
						}
					}
					else
					{
						for (m=0;m<lado;m++)
						{
							System.out.print("*");
						}
					}
					System.out.print("\n");
				}
			}
			else
			{
				System.out.println("Introduzca un numero mayor que 0");
			}
		}
		
	//Ejercicio31
		
		void MostrarEjer31(Scanner input)
		{
			int altura;
			int x;
			int m;
			int n;
			int n2;
			int posicion;
			System.out.println("Dime la altura del triangulo que quieres.");
			altura = input.nextInt();
			n=1;
			n2=altura*2-1;
			if (altura>0)
			{
				for (x=0;x<altura;x++)
				{
					if (x==0)
					{
						for (m=0;m<(altura*2)-1;m++)
						{
							System.out.print("*");
						}
					}
					else
					{
						posicion=1;
						
						for (m=0;m<(altura*2)-1;m++)
						{
							if (posicion>n && posicion<n2)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
							
							posicion++;
						}
						n++;
						n2--;
					}
					
					System.out.print("\n");
				}
			}
			else
			{
				System.out.println("-1");
			}
		}
		
	//Ejercicio32y33
		
		void MostrarEjer32(Scanner input)
		{
			int num;
			int sumpares;
			int sumimpares;
			String pares = "Has introducido los siguientes números pares: ";
			String impares = "Has introducido los siguientes números impares: ";
			System.out.println("Dime un numero");
			num = input.nextInt();
			sumpares=0;
			sumimpares=0;
			while (num>0)
			{
				if (num%2==0)
				{
					//pares = pares + num + " ";
					pares += num + " ";
					System.out.println("Es par");
					sumpares=sumpares+num;
				}
				else
				{
					impares += num + " ";
					System.out.println("Es impar");
					sumimpares=sumimpares+num;
				}
				System.out.println("Dime un numero(PAR o IMPAR)");
				num= input.nextInt();
			}
			System.out.println(pares);
			System.out.println("La suma de los numeros pares es "+sumpares);
			System.out.println(impares);
			System.out.println("La suma de los numeros impares es "+sumimpares);
			
		}
		
	

	
		
}
