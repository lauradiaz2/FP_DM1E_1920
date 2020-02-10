package ejerciciosUtils;

import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		EjerciciosUtils ej1 = new EjerciciosUtils();
		System.out.println("Bateria");
		String n = input.nextLine();
		switch (n)
		{
		case "1":
		{
			String cad;
			String letra;
			System.out.println("Escribe una cadena");
			cad = input.next();
			System.out.println("Que letra quieres saber que se repite");
			letra = input.nextLine();
			ej1.cadena(cad,letra);
		}
		break;
		
		case "2":
		{
			String cadenita; 
			System.out.println("Escribe una cadena"); 
		  	cadenita = input.nextLine(); 
		  	ej1.letnumesp(cadenita);
		}
		break;
		
		case "3":
		{
			String cade;
			System.out.println("Escribe una cadena(Cadena al reves)");
			cade = input.nextLine();
			ej1.invert(cade);
		}
		break;
		
		case "4":
		{
			String base;
			String altura;
			System.out.println("Dime la base de la piramide");
			base = input.nextLine();
			System.out.println("Dime la altura de la piramide");
			altura = input.next();
			ej1.piramide(base,altura);
		}
		break;
		
		case "5":
		{
			String num;
			System.out.println("Dime un numero del 1 al 100");
			num=input.nextLine();
			ej1.randomnum(num, input);
		}
		break;
		
		case "6":
		{
			String cad1;
			String cad2;
			System.out.println("Escribe 2 cadenas");
			cad1 = input.nextLine();
			cad2 = input.nextLine();
			ej1.mayuscad(cad1,cad2);
		}
		break;
		
		case "7":
		{
			String cad1;
			System.out.println("Dime una cadena");
			cad1 = input.nextLine();
			ej1.espejo(cad1);
		}
		break;
		
		case "8":
		{
			double x=90;
			ej1.coseno(x);
		}
		break;
		
		case "9":
		{
			String cad;
			cad = input.nextLine();
			ej1.cambiocadena(cad);
		}
		break;
		
		default:
			System.out.println("No existe ese ejercicio");
		break;
		}
	}
}
