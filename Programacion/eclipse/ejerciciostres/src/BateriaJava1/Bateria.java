package BateriaJava1;

import java.util.Scanner;

public class Bateria 
{
	
	//Ejercicio1
	
		void sumanum(Scanner input)
		{
			int suma=0;
			int y=1;
			int x;
			while (y<=10)
			{
				System.out.println(y+". Dime un número");
				x = input.nextInt();
				suma +=x; 
				y++;
			}
			System.out.println("La suma de los 10 números introducidos es "+suma);
		}
	
	//Ejercicio2
	
		void sumanumn(Scanner input)
		{
			int suma=0;
			int y;
			int c=1;
			int x;
			System.out.println("Cuantos numeros quieres sumar?");
			y=input.nextInt();
			while (y>0)
			{
				System.out.println(c+". Dime un número");
				x = input.nextInt();
				suma +=x; 
				y--;
				c++;
			}
			System.out.println("La suma de los 10 números introducidos es "+suma);
		}
	
	//Ejercicio3
		
		public String bisiesto(String año)
		{
			int a = Integer.parseInt(año);
			String bisiesto;
			if (a%100==0)
			{
				if(a%400==0)
				{
					System.out.println(a+" es bisiesto.");
				}
				else
				{
					System.out.println("No es bisiesto");
				}
			}
			else
			{
				if(a%4==0)
				{
					System.out.println(a+" es bisiesto.");
				}
				else
				{
					System.out.println("No es bisiesto.");
				}
			}
			bisiesto = String.valueOf(a);
			return bisiesto;
		}
		
	//Ejercicio4
		
		public String bisiesto(String conv, String cantidad)
		{
			int cant = Integer.parseInt(cantidad);
			double result=0;
			double pulgadas = (double)1/12;
			double yard;
			double cm;
			double metros;
//			1 pie = 12 pulgadas
//			1 pulgada = 2,54 cm
//			1 yarda = 0.94 metros
			switch(conv)
			{
			case "1":
			{
				result=(double)cant*3.7854;
				System.out.println(cantidad+" galones en litros son "+result);
			}
			break;
			case "2":
			{
				result=(double)cant*12;
				System.out.println(cantidad+" pies en pulgadas son "+result);
			}
			break;
			case "3":
			{
				result=(double)cant*12;
				System.out.println(cantidad+" pies en yardas son "+result);
			}
			break;
			}
			return conv;
		}
		
		
		
	
}
