package calculadora;

import javax.swing.JOptionPane;

public class Inputs 
{
	String opciones[];
	private double op1;
	private double op2;
	private int cod;
//	operaciones.Operaciones oper = new operaciones.Operaciones();
	Inputs()
	{
		this.op1=0;
		this.op2=0;
		this.cod=0;
		opciones= new String[5];
			opciones[0]="";
			opciones[1]="";
			opciones[2]="";
			opciones[3]="";
			opciones[4]="";

		
	}
	public String getOp1() 
	{
		return op1;
	}
	public void pedirOp1()
	{
		op1=Double.parseDouble(JOptionPane.showInputDialog("Numero 1:"));
	}
	public void pedirOp2()
	{
		op2=Double.parseDouble(JOptionPane.showInputDialog("Numero 2:"));
	}
	public void pedirCod()
	{
		String cod;
		int opcion = JOptionPane.showOptionDialog(null,
				"Qué operación quieres realizar", 
				"Operación a realizar", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opciones,
				null);
		if(opcion==0)
		{
			cod="+";
		} else if (opcion==1) {
			cod="-";
		} else if (opcion==2) {
			cod="*";
		} else if (opcion==3) {
			cod="/";
		} else if (opcion==4) {
			cod="r";
		} else {
			cod="c";
		} 
	}
//	SETTERS Y GETTERS
	
	
	
	
//	public String getCod() 
//	{
//		return cod;
//	}
//	public void setCod() 
//	{
//		String cod;
//		int opcion = JOptionPane.showOptionDialog(null,
//				"Qué operación quieres realizar", 
//				"Operación a realizar", 
//				JOptionPane.YES_NO_CANCEL_OPTION, 
//				JOptionPane.INFORMATION_MESSAGE,
//				null,
//				new Object [] {"Suma","Resta","Multiplicacion","Division","Reiniciar","Cancelar"},
//				null);
//		if(opcion==0)
//		{
//			cod="+";
//		} else if (opcion==1) {
//			cod="-";
//		} else if (opcion==2) {
//			cod="*";
//		} else if (opcion==3) {
//			cod="/";
//		} else if (opcion==4) {
//			cod="r";
//		} else {
//			cod="c";
//		} 
//		this.cod = cod;
//	}
	
}