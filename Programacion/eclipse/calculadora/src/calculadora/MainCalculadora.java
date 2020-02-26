package calculadora;

import java.util.Scanner;

import javax.swing.JOptionPane;

import operaciones.Division;
import operaciones.Multiplicacion;
import operaciones.Resta;
import operaciones.Suma;

public class MainCalculadora 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Objetos de cada tipo de operacion.
		double op1=0,op2=0,result=0;
		int cod=0;
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
			if(introval.getCod()!=4 && introval.getCod()!=5)
			{
				introval.pedirOp2();
			}
			switch (introval.getCod())
			{
			case 0:
				s.setOp1(introval.getOp1());
				s.setCod(introval.getCod());
				s.setOp2(introval.getOp2());
				s.sim();
				s.sum();
				JOptionPane.showMessageDialog(null, s.mostrarOper());
				introval.setOp1(s.getResult());
			break;
			case 1:
				r.setOp1(introval.getOp1());
				r.setCod(introval.getCod());
				r.setOp2(introval.getOp2());
				r.rest();
				JOptionPane.showMessageDialog(null, r.mostrarOper());
				introval.setOp1(r.getResult());
			break;
			case 2:
				m.setOp1(introval.getOp1());
				m.setCod(introval.getCod());
				m.setOp2(introval.getOp2());
				m.mult();
				JOptionPane.showMessageDialog(null, m.mostrarOper());
				introval.setOp1(m.getResult());
			break;
			case 3:
				if(introval.getOp1()!=0)
				{
					d.setOp1(introval.getOp1());
					d.setCod(introval.getCod());
					d.setOp2(introval.getOp2());
					d.div();
					JOptionPane.showMessageDialog(null, d.mostrarOper());
					introval.setOp1(d.getResult());
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
				JOptionPane.showMessageDialog(null, finCalc);
			break;
			}
		}
		input.close();
	}
}
