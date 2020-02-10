package ejerciciosUtils;

import java.util.Random;

import java.util.Scanner;

public class EjerciciosUtils 
{

	//EjercicioUtils1
	
			public String cadena(String cad, String letra)
			{
				char caracter = letra.charAt(0);
				int repes=0;
				String repes1;
				for (int i = 0; i < cad.length(); i++) 
				{
					char aux = cad.charAt(i);
					if (aux==caracter)
					{
						repes++;
					}
				}
				repes1 = String.valueOf(repes);
				System.out.print("La letra se repite "+repes1);
				return repes1;
			}
			
	//EjercicioUtils2
			
		public String letnumesp(String cad)
		{
			int letras=0;
			int num=0;
			int espacios=0;
			char a;
			char b;
			int l;
			int n;
			for (int i = 0; i < cad.length(); i++) 
			{
				a='a';
				b='0';
				l=0;
				n=0;
				char extra = cad.charAt(i);
				
				while (a<='z')
				{
				if(extra==a && l!=1)
				{
					letras++;
					l++;
				}
				a++;
				}
				while(b>='0' && b<='9')
				{
				if(extra==b && n!=1)
				{
					num++;
					n++;
				}
				b++;
				}
				if (extra==' ')
				{
					espacios++;
				}
			}
			System.out.println("Hay "+letras+" letras, "+num+" numeros y "+espacios+" espacios");
			return cad;
		}
			
		//EjercicioUtils3
			
			public String invert(String cadenita)
			{
				String result = "";
				int i = cadenita.length()-1;
				while (i>=0)
				{
					char a = cadenita.charAt(i);
					result= result + a;
					i--;
				}
					System.out.println(result);
				return result;
			}
			
		//EjercicioUtils4
			
			public String piramide(String b, String h)
			{
				int result;
				String result1="";
				int base = Integer.parseInt(b);
				int altura = Integer.parseInt(h);
				result = ((base * 10) * altura)/3; 
				System.out.println("El volumen de la piramide es "+result+"cm³");
				result1 = Integer.toString(result);
				return result1;
			}
			
		//EjercicioUtils5
			
			public String randomnum(String numerito, Scanner input)
			{
				Random rand = new Random();
				int num1 = Integer.parseInt(numerito);
				int r;
				int x =6;
				r= rand.nextInt(100);
				System.out.println(r);
				while (num1 != r && x>0)
				{
					if (num1>r)
					{
						System.out.println("Te has pasado");
						System.out.println("Te quedan "+x+" oportunidades");
						System.out.println("Dime otro número");
						num1 = input.nextInt();
					}
					else
					{
						System.out.println("Te quedaste corto");
						System.out.println("Te quedan "+x+" oportunidades");
						System.out.println("Dime otro número");
						num1 = input.nextInt();
					}
					x--;
				}
				if (num1==r)
				{
					System.out.println("El número COINCIDE");
				}
				
				return numerito;
			}
			
		//EjercicioUtils6
			
			public String mayuscad(String cad1, String cad2)
			{
				String result="";
		
				if (cad1.contains(cad2))
				{
					int a=0;
					int index = 0;
					do
					{
						index = cad1.indexOf(cad2, index)+1;
						++a;
					}
					while(index > 0 && index+cad2.length() < cad1.length());
					System.out.println(cad1+"\n"+cad2+" se repite "+a+" veces.");
				}
				else
				{
					System.out.println(cad1+"\n No hay coincidencias");
				}
				
				
				
				return result;
			}
			
		//EjercicioUtils7
			
			public String espejo(String cadenita)
			{
				String cad2 = cadenita;
				for (int i = cadenita.length()-2; i >= 0; i--) 
				{
					char aux = cadenita.charAt(i);
					cad2 += aux;
				}
				System.out.println(cad2);
				return cadenita;
			}
			
		//EjercicioUtils8
			
			public double coseno(double x)
			{
				
				while (x>=0)
				{
					double coseno1= Math.toRadians(x);
					System.out.println("El coseno de "+x+" es "+Math.cos(coseno1));
					x=x-5;
				}
				return x;
			}
			
		//EjercicioUtils9
			
			public double raizcuad(double x, double y)
			{
				double result= x + 4 * Math.pow(y, 3);
				System.out.println("La raiz cuadrada de x + 4*y³ es "+Math.sqrt(result));
				return result;
			}
			
		//EjercicioUtils10
			
			public double raizcub(double x, double y)
			{
				double result;
				result= x*y;
				double a = (double)1/3;
				result = Math.pow(result, a);
				System.out.println("La raiz cúbica de "+x*y+" es "+result);
				return result;
				
			}
			
		//EjercicioUtils11
			
			public String noespacios(String cad)
			{
				String result= new String();
				for (int i = 0;i<cad.length();i++)
				{
					char a = cad.charAt(i);
					if (a!=' ')
					{
						result+=a;
					}
				}
				System.out.println(result);
				return result;
			}
			
		//EjercicioUtils12
			
			public String hipotenusa(String cat1, String cat2)
			{
				double result;
				String resul;
				int x = Integer.parseInt(cat1);
				int y = Integer.parseInt(cat2);
				result= Math.pow(x,2)+Math.pow(y,2);
				System.out.println("La hipotenusa mide "+result);
				resul = String.valueOf(result);
				return resul;
			}
			
		//EjercicioUtils13
			
			public String cambiocadena(String cadena)
			{
				String fullcad=new String();
				String cad2=new String();
				String cad1=new String();
				String fullcad2=new String();
				int y =0;
				for (int i = 0; i <=cadena.length()-1;i++)
				{
					
					char a = cadena.charAt(i);
					if (a!=' ' && y<1)
					{
						cad1= cad1+a;
					}
					else
					{
						fullcad = fullcad+a;
						y++;
					}
				}
				y=0;
				for (int u = fullcad.length()-1 ; u >=0 ; u--)
				{
					char f = fullcad.charAt(u);
					if (f!=' ' && y<1 )
					{
						cad2= f+cad2;
					}
					else
					{
						fullcad2 = f+fullcad2;
						y++;
					}
				}
				System.out.println(cad2+fullcad2+cad1);
				return cadena;
			}
			
		//Ejercicio14
			
			public String volsupesfera(String radio)
			{
				int rad = Integer.parseInt(radio);
				double result=(4/3)*Math.PI*Math.pow(rad,3);
				double result2 = 4*Math.PI*Math.pow(rad,2);
				String volumen = String.valueOf(result);
				String superficie = String.valueOf(result2);
				System.out.println("El volumen de la esfera es de "+volumen+" y la superficie de "+superficie);
				return volumen;
			}
			
		//Ejercicio15
			
			public String letradni(String numdni)
			{
				int result;
				int numero = Integer.parseInt(numdni);
				if(numdni.length()<=8)
				{
					result = numero%23;
					String res = String.valueOf(result);
					switch (res)
					{
					case "0":
					{
						System.out.println("La letra que le corresponde es T su dni será "+numdni+"T");
					}
					break;
					case "1":
					{
						System.out.println("La letra que le corresponde es V su dni será "+numdni+"V");
					}
					break;
					case "2":
					{
						System.out.println("La letra que le corresponde es W su dni será "+numdni+"W");
					}
					break;
					case "3":
					{
						System.out.println("La letra que le corresponde es A su dni será "+numdni+"A");
					}
					break;
					case "4":
					{
						System.out.println("La letra que le corresponde es G su dni será "+numdni+"G");
					}
					break;
					case "5":
					{
						System.out.println("La letra que le corresponde es M su dni será "+numdni+"M");
					}
					break;
					case "6":
					{
						System.out.println("La letra que le corresponde es Y su dni será "+numdni+"Y");
					}
					break;
					case "7":
					{
						System.out.println("La letra que le corresponde es F su dni será "+numdni+"F");
					}
					break;
					case "8":
					{
						System.out.println("La letra que le corresponde es P su dni será "+numdni+"P");
					}
					break;
					case "9":
					{
						System.out.println("La letra que le corresponde es D su dni será "+numdni+"D");
					}
					break;
					case "10":
					{
						System.out.println("La letra que le corresponde es X su dni será "+numdni+"X");
					}
					break;
					case "11":
					{
						System.out.println("La letra que le corresponde es B su dni será "+numdni+"B");
					}
					break;
					case "12":
					{
						System.out.println("La letra que le corresponde es N su dni será "+numdni+"N");
					}
					break;
					case "13":
					{
						System.out.println("La letra que le corresponde es J su dni será "+numdni+"J");
					}
					break;
					case "14":
					{
						System.out.println("La letra que le corresponde es Z su dni será "+numdni+"Z");
					}
					break;
					case "15":
					{
						System.out.println("La letra que le corresponde es S su dni será "+numdni+"S");
					}
					break;
					case "16":
					{
						System.out.println("La letra que le corresponde es Q su dni será "+numdni+"Q");
					}
					break;
					case "17":
					{
						System.out.println("La letra que le corresponde es V su dni será "+numdni+"V");
					}
					break;
					case "18":
					{
						System.out.println("La letra que le corresponde es H su dni será "+numdni+"H");
					}
					break;
					case "19":
					{
						System.out.println("La letra que le corresponde es L su dni será "+numdni+"L");
					}
					break;
					case "20":
					{
						System.out.println("La letra que le corresponde es C su dni será "+numdni+"C");
					}
					break;
					case "21":
					{
						System.out.println("La letra que le corresponde es K su dni será "+numdni+"K");
					}
					break;
					case "22":
					{
						System.out.println("La letra que le corresponde es E su dni será "+numdni+"E");
					}
					break;
					default:
					break;
					}
				}
				else
				{
					System.out.println("Ha introducido mal su dni.");
				}
				return numdni;
			}

		//Ejercicio16
			
			public String dados(String nombre)
			{
				Random rand = new Random();
				int r;
				int r2;
				r= rand.nextInt(6);
				r2= rand.nextInt(6);
				System.out.println(r+", "+r2);
				return nombre;
			}
			
		//Ejercicio17
			
			public String sectorCircular(String rad, String arc, String ang)
			{
				double area;
				double angulo = Double.parseDouble(ang);
				double anguloRad = Math.toRadians(angulo);
				double areaGrad;
				double areaRad;
				double perimetro;
				double arco = Double.parseDouble(arc);
				double radio = Double.parseDouble(rad);
				area = (arco*radio)/2;
				perimetro = (2*radio)+arco;
				areaGrad = Math.PI*Math.pow(radio, 2)*angulo/360;
				areaRad = Math.pow(radio, 2)*anguloRad/2;
				System.out.println("El perímetro del sector es "+perimetro);
				System.out.println("El area con arco es "+area);
				System.out.println("El area en angulos es "+areaGrad);
				System.out.println("El area en radianes es "+areaRad);
				return rad;
			}
			
			
}
