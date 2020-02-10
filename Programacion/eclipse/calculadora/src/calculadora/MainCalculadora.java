package calculadora;

import java.util.Scanner;

public class MainCalculadora 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Operaciones oper = new Operaciones();
		System.out.println("CALCULADORA: ");
		System.out.print("Operación: ");
		String operacion1,operacion2="";
		String x="0";
		operacion1=input.nextLine();
		while(!operacion2.contentEquals("FIN"))
		{
			System.out.println(oper.opWhatEver(operacion1,x));
			if(x.contentEquals("0"))
			{
				System.out.println(oper.opWhatEver(operacion1,x));
				System.out.println("Si no quieres operar mas escribe: FIN");
				operacion2=input.nextLine();
				operacion1=oper.opWhatEver(operacion1,x)+operacion2;
			}
			else
			{
				operacion2="FIN";
			}
			
		}
		
		
		
		input.close();
	}
}
