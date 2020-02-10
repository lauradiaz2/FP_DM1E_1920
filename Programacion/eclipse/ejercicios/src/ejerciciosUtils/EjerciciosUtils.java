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
				for (int i = 0; i < cad.length(); i++) 
				{
					char aux = cad.charAt(i);
					if (aux==caracter)
					{
						repes++;
					}
				}
				System.out.println("La letra se repite "+repes);
				return cad;
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
				for (int u = cadena.length()-1 ; u >=0 ; u--)
				{
					char f = cadena.charAt(u);
					if (f!=' ' && y<1 )
					{
						cad2= u+cad2;
					}
					else
					{
						fullcad2 = u+fullcad2;
						y++;
					}
				}
				System.out.println(cad2+cad1);
				return cadena;
			}
}
