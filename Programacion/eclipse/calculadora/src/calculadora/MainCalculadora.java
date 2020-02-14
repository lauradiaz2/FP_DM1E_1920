package calculadora;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
		String numero;
		//Pido datos: los 2 numeros y el tipo de operacion que quiero.
		Operaciones.setNumero1(JOptionPane.showInputDialog("Numero 1:"));
		int opcion = JOptionPane.showOptionDialog(null,
				"Qué operación quieres realizar", 
				"Operación a realizar", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE,
				null,
				new Object [] {"Suma","Resta","Multiplicacion","Division","Cancelar"},
				"seleccion 1");
		
		numero=Operaciones.getNumero1();
		Operaciones.setNumero2(JOptionPane.showInputDialog("Numero 2:"));
		String x="0";
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
		break;
		}
			//1) Ha seleccionado una operación permitida o se ha salido
			//operacion2=JOptionPane.showInputDialog("Siguiente operación \nNumero 1:"+operacion1+"Numero 2: ");
			//compruebas que la cadena contenga solo números
			//operando válido, sino volvemos a pedir.
		
		input.close();
	}
}
