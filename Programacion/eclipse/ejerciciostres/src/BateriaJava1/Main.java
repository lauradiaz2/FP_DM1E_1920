package BateriaJava1;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Bateria ej1 = new Bateria();
		System.out.println("Batería Java 1");
		String n = input.nextLine();
		switch (n)
		{
		case "1":
		{
			ej1.sumanum(input);
		}
		break;
		case "2":
		{
			ej1.sumanumn(input);
		}
		break;
		case "3":
		{
			String año;
			System.out.println("Dime un año y te diré si es bisiesto o no.");
			año = input.nextLine();
			ej1.bisiesto(año);
		}
		break;
		case "4":
		{
			String conv;
			String cant;
			System.out.println("Cantidad a convertir");
			cant = input.nextLine();
			System.out.println("Conversion de:\n1. Galones a litros\n2. Pies a pulgadas\n3. "
					+ "Pies a yardas\n4. Pies a cm"
					+ "\n5. Pies a metros");
			conv = input.nextLine();
			ej1.bisiesto(conv,cant);
		}
		break;
		default:
		break;
		}
		
		
		
		
		
		input.close();
	}
}
