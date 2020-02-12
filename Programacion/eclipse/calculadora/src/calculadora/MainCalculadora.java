package calculadora;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainCalculadora 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Operaciones oper = new Operaciones();
		String operacion1 = JOptionPane.showInputDialog("Introduce la operación");
		String operacion2="";
		String x="0";
		while(!operacion2.contentEquals("FIN"))
		{
			JOptionPane.showMessageDialog(null, "Solución: "+oper.opWhatEver(operacion1,x));
			if(x.contentEquals("0"))
			{
				//System.out.println(oper.opWhatEver(operacion1,x));
				operacion2=JOptionPane.showInputDialog("Siguiente operación");
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
