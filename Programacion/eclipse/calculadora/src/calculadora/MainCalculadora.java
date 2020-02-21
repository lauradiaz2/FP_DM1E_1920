package calculadora;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainCalculadora 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Objetos de cada tipo de operacion.
		operaciones.Suma sumaa = new operaciones.Suma();
		operaciones.Resta r = new operaciones.Resta();
		operaciones.Division d = new operaciones.Division();
		operaciones.Multiplicacion m = new operaciones.Multiplicacion();
		Inputs introval = new Inputs();
		operaciones.Operaciones oper = new operaciones.Operaciones();
		String finCalc="";
		//Pido datos: los 2 numeros y el tipo de operacion que quiero.
		String cont;
		int contador=0;
		cont=String.valueOf(contador);
		introval.setOp1(cont);
		contador++;
		while(!finCalc.contentEquals("FIN"))
		{
			introval.setCod();
			if(introval.getCod()!="c" && introval.getCod()!="r")
			{
				introval.setOp2();
			}
			switch (introval.getCod())
			{
			case "+":
				sumaa.sum(introval.getOp1(),introval.getOp2());
			break;
			case "-":
				r.resta(introval.getOp1(),introval.getOp2());
			break;
			case "*":
				m.mult(introval.getOp1(),introval.getOp2());
			break;
			case "/":
				if(introval.getOp1()!="0")
				{
					d.div(introval.getOp1(),introval.getOp2());
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No puedo operar.");
				}
			break;
			case "r":
				JOptionPane.showMessageDialog(null,"Reiniciando valores.");
				contador=0;
				cont=String.valueOf(contador);
				introval.setOp1(cont);
				contador++;
			break;
			case "c":
				finCalc="FIN";
			break;
			}
			if(introval.getCod()=="c")
			{
				JOptionPane.showMessageDialog(null, "FIN");
			}
			else if (introval.getCod()!="r")
			{
				JOptionPane.showMessageDialog(null, introval.getOp1()+" "+introval.getCod()+" "+
						introval.getOp2()+" = "+oper.getResult());
				cont=String.valueOf(contador);
				introval.setOp1(cont);
			}
		}
		input.close();
	}
}
