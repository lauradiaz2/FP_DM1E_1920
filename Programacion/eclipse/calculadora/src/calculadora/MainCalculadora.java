package calculadora;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainCalculadora 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		operaciones.Operaciones oper = new operaciones.Operaciones();
		//Objetos de cada tipo de operacion.
		operaciones.Suma s = new operaciones.Suma();
		operaciones.Resta r = new operaciones.Resta();
		operaciones.Division d = new operaciones.Division();
		operaciones.Multiplicacion m = new operaciones.Multiplicacion();
		Inputs introval = new Inputs();
		String finCalc="";
		int contador=0;
		String cont = String.valueOf(contador);
		//Pido datos: los 2 numeros y el tipo de operacion que quiero.
		introval.setOp1(cont);
		contador=1;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
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
				s.sum();
			break;
			case "-":
				r.resta();
			break;
			case "*":
				m.mult();
			break;
			case "/":
				if(introval.getOp1()!="0")
				{
					d.div();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No puedo operar.");
				}
			break;
			case "r":
				JOptionPane.showMessageDialog(null,"Reiniciando valores.");
				contador=0;
				cont = String.valueOf(contador);
				introval.setOp1(cont);
				contador=1;
			break;
			case "c":
				finCalc="FIN";
			break;
			}
			if(introval.getCod()=="c")
			{
				JOptionPane.showMessageDialog(null, "FIN");
			}
			else if (introval.getCod()=="r")
			{
				JOptionPane.showMessageDialog(null, introval.getOp1()+" "+introval.getCod()+" "+
						introval.getOp2()+" = "+oper.getResult());
						introval.setOp1(oper.getResult());
			}
		}
		input.close();
	}
}
