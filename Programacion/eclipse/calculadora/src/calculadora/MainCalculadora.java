package calculadora;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Operaciones.Division;
import Operaciones.Multiplicacion;
import Operaciones.Operaciones;
import Operaciones.Resta;
import Operaciones.Suma;

public class MainCalculadora 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Objetos de cada tipo de operacion.
		Suma s = new Suma();
		Resta r = new Resta();
		Division d = new Division();
		Multiplicacion m = new Multiplicacion();
		String finCalc="";
		//Pido datos: los 2 numeros y el tipo de operacion que quiero.
		Operaciones.setNumero1(JOptionPane.showInputDialog("Numero 1:"));
		while(!finCalc.contentEquals("FIN"))
		{
			int opcion = JOptionPane.showOptionDialog(null,
					"Qué operación quieres realizar", 
					"Operación a realizar", 
					JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.INFORMATION_MESSAGE,
					null,
					new Object [] {"Suma","Resta","Multiplicacion","Division","Reiniciar","Cancelar"},
					"seleccion 1");
			if(opcion!=4 && opcion!=5)
			{
				Operaciones.setNumero2(JOptionPane.showInputDialog("Numero 2:"));
			}
			switch (opcion)
			{
			case 0:
				Operaciones.setCodigo("+");
				s.sum();
				
			break;
			case 1:
				Operaciones.setCodigo("-");
				r.resta();
			break;
			case 2:
				Operaciones.setCodigo("*");
				m.mult();
			break;
			case 3:
				Operaciones.setCodigo("/");
				if(Operaciones.getNumero2()!="0")
				{
					d.div();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No puedo operar.");
				}
			break;
			case 4:
				Operaciones.setCodigo("");
				Operaciones.setNumero1("");
				Operaciones.setNumero2("");
				Operaciones.setResult("");
				JOptionPane.showMessageDialog(null,"Reiniciando valores.");
				Operaciones.setNumero1(JOptionPane.showInputDialog("Numero 1:"));
			break;
			case 5:
				finCalc="FIN";
			break;
			}
			if(opcion==5)
			{
				JOptionPane.showMessageDialog(null, "FIN");
			}
			else
			{
				JOptionPane.showMessageDialog(null, Operaciones.getNumero1()+" "+Operaciones.getCodigo()+" "+
						Operaciones.getNumero2()+" = "+Operaciones.getResult());
						Operaciones.setNumero1(Operaciones.getResult());
			}
		}
		input.close();
	}
}
