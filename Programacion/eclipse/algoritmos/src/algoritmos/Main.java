package algoritmos;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Arrays");
		String tipo = input.nextLine();
		switch (tipo)
		{
			case "1":
				algoritmos.seleccion(input);
			break;
			case "2":
				algoritmos.insercion();
			break;
			case "3":
				algoritmos.burbuja();
			break;
		}
		
		input.close();
	}

}
