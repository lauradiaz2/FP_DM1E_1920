package calculadora;

import java.util.Scanner;

import javax.swing.JOptionPane;

import operaciones.Division;
import operaciones.Multiplicacion;
import operaciones.Operaciones;
import operaciones.Resta;
import operaciones.Suma;

public class MainCalculadora 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Objetos de cada tipo de operacion.
		double op1,op2,result;
		int cod;
		Suma s = new Suma(cod,op1,op2,result);
		Resta r = new Resta(cod,op1,op2,result);
		Division d = new Division(cod,op1,op2,result);
		Multiplicacion m = new Multiplicacion(cod,op1,op2,result);
		Inputs introval = new Inputs();
		String finCalc="";
		//Pido datos: los 2 numeros y el tipo de operacion que quiero.
		introval.pedirOp1();
		while(!finCalc.contentEquals("FIN"))
		{
			introval.pedirCod();
			if(introval.getCod()!=4)
			{
				introval.pedirOp2();
			}
			switch (introval.getCod())
			{
			case 0:
				s.setOp1(introval.getOp1());
				s.setCod(introval.getCod());
				s.setOp2(introval.getOp2());
			break;
			case 1:
				r.setOp1(introval.getOp1());
				r.setCod(introval.getCod());
				r.setOp2(introval.getOp2());
			break;
			case 2:
				m.setOp1(introval.getOp1());
				m.setCod(introval.getCod());
				m.setOp2(introval.getOp2());
			break;
			case 3:
				if()
				{
					d.setOp1(introval.getOp1());
					d.setCod(introval.getCod());
					d.setOp2(introval.getOp2());
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No puedo operar.");
				}
			break;
			case 4:
				JOptionPane.showMessageDialog(null,"Reiniciando valores.");
				introval.pedirOp1();
				
			break;
			case 5:
				finCalc="FIN";
			break;
			}
			if(introval.getCod()==5)
			{
				JOptionPane.showMessageDialog(null, "FIN");
			}
			else if (introval.getCod()!=4)
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
