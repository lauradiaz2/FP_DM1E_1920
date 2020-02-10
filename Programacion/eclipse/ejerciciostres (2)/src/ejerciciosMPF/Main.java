package ejerciciosMPF;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		EjerciciosMPF ej1 = new EjerciciosMPF();
		System.out.println("MPF ?");
		String num = input.nextLine();
		switch (num)
		{
		case "1":
		{
			double a,b;
			System.out.println("Dime 2 numeros");
			a = input.nextDouble();
			b = input.nextDouble();
			//EjercicioMPF1
			System.out.println("La suma de "+a+" "+b+ "es = "+ej1.suma1(a,b));
		}
		break;
		case "2":
		{
			//EjercicioMPF2
			int c;
			System.out.println("Dime 1 numero");
			c = input.nextInt();
			ej1.numPrimo(c);
		}
		break;
		case "3":
		{	//EjercicioMPF3
			
			 System.out.println("Dime un número (FACTORIAL)"); 
			 int num1 = input.nextInt();
			 System.out.println("El factorial de "+num1+" es "+ej1.factoriales(num1));
		}	 
		break;
		case "4":
		{	//EjercicioMPF4
			  int x; 
			  int b; 
			  System.out.println("Dime un número"); 
			  x = input.nextInt();
			  System.out.println("Dime el numero que quieres mostrar"); 
			  b = input.nextInt(); 
			  ej1.posicion(x,b);
		}
		break;
		case "5":
		{
			//EjercicioMPF5
			  int num6; 
			  System.out.println("Dime un número"); 
			  num6 = input.nextInt();
			  ej1.vuelta(num6);
		}
		break;
		case "6":
		{
			 //EjercicioMPF6
			  int n; 
			  System.out.println("Dime un número (pasar a Binario)"); 
			  n = input.nextInt(); 
			  ej1.bin_dec(n);
		}
		break;
		case "7":
		{
			//EjercicioMPF7
				int nu;
				System.out.println("Dime un número (pasar a OCTAL)");
				nu = input.nextInt();
				ej1.oct_dec(nu);
		}
		break;
		case "8":
		{
			//EjercicioMPF8
				int num2;
				System.out.println("Dime un número (pasar a Hexadecimal)");
				num2 = input.nextInt();
				ej1.hex_dec(num2);
		}
		break;
		case "9":
			//EjercicioMPF9
				int nume;
				System.out.println("Dime un número (primos anteriores a éste)");
				nume = input.nextInt();
				ej1.primosAnteriores(nume);
		break;
		case "10":
			//EjercicioMPF10
			int numer;
			System.out.println("Dime un número (factoriales de 0 a este numero)");
			numer = input.nextInt();
			ej1.factoriales2(numer);
		break;
		case "11":
			//EjercicioMPF11
			
			String numeri;
			String numerit;
			String numerito;
			System.out.println("Dime un número");
			numeri = input.nextLine();
			System.out.println("Operacion a realizar");
			numerit = input.nextLine();
			System.out.println("Dime un número");
			numerito = input.nextLine();
			ej1.calc(numeri,numerit,numerito);
		break;
		case "12":
			//EjercicioMPF12
			
			String conv;
			String opcion;
			System.out.println("Dime un numero(hex,oct,bin)");
			conv = input.nextLine();
			System.out.println("¿A que lo quieres convertir? Binario, octal o hexadecimal");
			opcion = input.nextLine();
			ej1.conversion(conv,opcion);
		break;
			
		}
		input.close();
	}
}
