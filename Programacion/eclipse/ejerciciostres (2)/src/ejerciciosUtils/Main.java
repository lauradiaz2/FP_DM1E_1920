package ejerciciosUtils;

import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		EjerciciosUtils ej1 = new EjerciciosUtils();
		System.out.println("Utils");
		String n = input.nextLine();
		switch (n)
		{
		case "1":
		{
			String cad;
			String letra;
			System.out.println("Escribe una cadena");
			cad = input.nextLine();
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
			double x;
			double y;
			System.out.println("Dime 2 números");
			x = input.nextDouble();
			y = input.nextDouble();
			ej1.raizcuad(x,y);
		}
		break;
		case "10":
		{
			double x;
			double y;
			System.out.println("Dime 2 números");
			x = input.nextDouble();
			y = input.nextDouble();
			ej1.raizcub(x,y);
		}
		break;
		case "11":
		{
			String cad;
			System.out.println("Escribe una cadena");
			input.nextLine();
			cad = input.nextLine();//Pedimos una cadena con \n, smart girl ;)
			ej1.noespacios(cad);
		}
		break;
		case "12":
		{
			String x;
			String y;
			System.out.println("Dime 2 numeros");
			x = input.nextLine();
			y = input.nextLine();
			ej1.hipotenusa(x,y);
		}
		break;
		case "13":
		{
			String cad;
			System.out.println("Dime una cadena");
			cad = input.nextLine();
			ej1.cambiocadena(cad);
		}
		break;
		case "14":
		{
			String radio;
			System.out.println("Dime el radio de la esfera(volumen y superficie)");
			radio = input.nextLine();
			ej1.volsupesfera(radio);
		}
		break;
		case "15":
		{
			String numdni;
			System.out.println("Dime el número de tu dni (sin la letra)");
			numdni = input.nextLine();
			ej1.letradni(numdni);
		}
		break;
		case "16":
		{
			String nombre;
			System.out.println("Dime tu nombre");
			nombre = input.nextLine();
			ej1.dados(nombre);
		}
		break;
		case "17":
		{
			String radio;
			String arco;
			String angulo;
			System.out.println("Dime el radio de la circunferencia");
			radio = input.nextLine();
			System.out.println("Dime el arco de la circunferencia");
			arco =input.nextLine();
			System.out.println("Dime el ángulo del sector");
			angulo = input.nextLine();
			ej1.sectorCircular(radio,arco,angulo);
		}
		break;
		default:
			System.out.println("No existe ese ejercicio");
		break;
		}
		input.close();
	}
}
