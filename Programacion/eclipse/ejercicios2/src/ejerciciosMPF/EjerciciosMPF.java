package ejerciciosMPF;

public class EjerciciosMPF 
{
	
	//EjerciciosMPF1
	
			public double suma1(double a, double b)
			{
				
				//System.out.println("La suma es "+(a+b));
				return a+b;
				
			}
			
		//EjerciciosMPF2
			
			public void numPrimo(int a)
			{
				int x = 0;
				int b;
//				do
//				{
//					if (a%b==0)
//					{
//						++x;
//					}
//					++b;
//				}
//				while (x <=2 && b<=a);
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
				}//no probamos con n, llegamos a n-1
				
//				if (x==2)
//				{
//					System.out.println(a+" es un número primo");
//				}
//				else
//				{
//					System.out.println(a+" no es un numero primo");
//				}
					System.out.println(a+((x==2)?" es un número primo":" no es un numero primo"));

			}
			
		//EjercicioMPF3
			
			public int factoriales(int num1) 
			{
				int factorial;
				int x;
				x = num1;
				factorial = 1;
				while (num1>=x && x>0)
				{
					factorial = factorial * x;
					--x;
				}
				return factorial;
			}
			
		//EjercicioMPF4
			
			public void posicion(int num1, int posi)
			{
				int result = 0;
				int x=0;
				while (result!=posi && num1>0)
				{
					result = num1%10;
					num1 = num1/10 - ((num1%10)/10);
					++x;
				}
				if (result==posi)
				{
					System.out.println("El numero pedido está en la posición"+x);
				}
				else
				{
					System.out.println(-1);
				}
			}
			
		//EjercicioMPF5
			
			public int vuelta(int numerito)
			{
				int x;
				int result;
				result = 0;
				while (numerito>0)
				{
					x=numerito%10;
					result = result * 10 + x;
					numerito = numerito/10 - ((numerito%10)/10);
				}
				System.out.println("El numero al revés es "+result);
				return result;
			}
			
		//EjercicioMPF6
			
			public double bin_dec(int numerito2)
			{
				int bin;
				int b;
				bin = 0;
				b=1;
				while (numerito2>0)
				{
					bin = bin + ((numerito2%2 )*b);
					numerito2 = numerito2/2;
					b=b*10;
				}
				System.out.println("El numero en binario es "+bin);
				return bin;
			}
			
		//EjercicioMPF7
			
			public double oct_dec(int numerito2)
			{
				int oct;
				int b;
				oct = 0;
				b=1;
				while (numerito2>0)
				{
					oct = oct + ((numerito2%8 )*b);
					numerito2 = numerito2/8;
					b=b*10;
				}
				System.out.println("El numero en octal es "+oct);
				return oct;
			}
			
		//EjercicioMPF8
			
			public double hex_dec(int numerito2)
			{
				int result;
				String hex = "El numero en hexadecimal es: "; 
				String aux = "";
				result = 0;
				while (numerito2>0)
				{
					result = numerito2%16;
					if (result>=10 && result<=15)
					{
						switch (result)
						{
						case 10:
							aux = "A" + aux;
						break;
						case 11:
							aux = "B"+ aux;
						break;
						case 12:
							aux = "C"+ aux;
						break;
						case 13:
							aux = "D"+ aux;
						break;
						case 14:
							aux = "E"+ aux;
						break;
						case 15:
							aux = "F"+ aux;
						break;
						}
					}
					else
					{
						aux = numerito2%16 + aux;
					}
					numerito2 = numerito2/16;
				}
				System.out.println(hex+aux);
				return result;
			}
			
		//EjercicioMPF9
			
			public void primosAnteriores(int numerito)
			{
				int x;
				int b;
				int m = 2;
				while (m<=numerito)
				{
					x=0;
					b=1;
					while (b<=m)
					{
						if (m%b==0)
						{
							++x;
							++b;
						}
						else
						{
							++b;
						}
					}
					if (x==2)
					{
						System.out.println(m+" Es primo");
					}
					++m;
				}
			}
			
		//EjercicioMPF10
			
			public void factoriales2(int numerito)
			{
				int m;
				int x;
				int result;
				m=1;
				while(m<=numerito)
				{
					x=1;
					result=m;
					while(x<m)
					{
						result= result *x;
						x++;
					}
					System.out.println("Factorial de "+m+" es "+result);
					m++;
				}
			}
			
		//EjercicioMPF11
			
			public String calc(String num1, String operando, String num2)
			{
				int result;
				//A la hora de definir una variable, tenemos varias fases:
				//1ª Definición
				// int a;
				//2ª Inicialización
				// a = 0; ¡Ojo! Podemos hacerlo en un solo paso int a = 0;
				//3ª "Utilización"
				// System.out.println(a*a);
				String result1 = "";
				//String result1 = new String();
				int num3 = Integer.parseInt(num1);
				int num4 = Integer.parseInt(num2);
				switch (operando) 
				{
					case "+":
						result=num3+num4;
						result1=Integer.toString(result);
						System.out.println(result1);
					break;
					case "-":
						result=num3-num4;
						result1=Integer.toString(result);
						System.out.println(result1);
					break;
					case "*":
						result=num3*num4;
						result1=Integer.toString(result);
						System.out.println(result1);
					break;
					case "/":
						result=num3/num4;
						result1=Integer.toString(result);
						System.out.println(result1);
					break;
					default:
						System.out.println("Ese operando no vale");
					break;
				}
				return result1;
			}
			
		//EjercicioMPF12
			
			public String conversion(String num1, String opcion)
			{
				int valor=0;
				String valor1="";
				int b;
				int num = Integer.parseInt(num1);
				switch (opcion) 
				{
					case "binario":
						b=1;
						while (num>0)
						{
							valor = valor + ((num%2)*b);
							num = num/2;
							b=b*10;
						}
						valor1=Integer.toString(valor);
						System.out.println("El numero en binario es "+valor1);
					break;
					case "octal":
						b=1;
						while (num>0)
						{
							valor = valor + ((num%8 )*b);
							num = num/8;
							b=b*10;
						}
						valor1=Integer.toString(valor);
						System.out.println("El numero en octal es "+valor1);
					break;
					case "hexadecimal":
						String hex = "El numero en hexadecimal es: "; 
						String aux = "";
						valor = 0;
						while (num>0)
						{
							valor = num%16;
							if (valor>=10 && valor<=15)
							{
								switch (valor)
								{
								case 10:
									aux = "A" + aux;
								break;
								case 11:
									aux = "B"+ aux;
								break;
								case 12:
									aux = "C"+ aux;
								break;
								case 13:
									aux = "D"+ aux;
								break;
								case 14:
									aux = "E"+ aux;
								break;
								case 15:
									aux = "F"+ aux;
								break;
								}
							}
							else
							{
								aux = num%16 + aux;
							}
							num = num/16;
						}
						System.out.println(hex+aux);
					break;
					default:
						System.out.println("No puedo convertir el numero");
					break;
				}
				return valor1;
			}
}
