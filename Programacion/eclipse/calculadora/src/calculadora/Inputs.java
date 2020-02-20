package calculadora;

import javax.swing.JOptionPane;

public class Inputs 
{
	private String op1;
	private String op2;
	private String cod;
	operaciones.Operaciones oper = new operaciones.Operaciones();
	public String getOp1() 
	{
		return op1;
	}
	public void setOp1(String contador) 
	{
		String op1;
		int x = Integer.parseInt(contador);
		if (x==0)
		{		
			op1=JOptionPane.showInputDialog("Numero 1:");
		}else
		{
			op1=oper.getResult();
		}
		this.op1 = op1;
	}
	public String getOp2() 
	{
		return op2;
	}
	public void setOp2() 
	{
		String op2=JOptionPane.showInputDialog("Numero 2:");
		this.op2 = op2;
	}
	public String getCod() 
	{
		return cod;
	}
	public void setCod() 
	{
		String cod;
		int opcion = JOptionPane.showOptionDialog(null,
				"Qué operación quieres realizar", 
				"Operación a realizar", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE,
				null,
				new Object [] {"Suma","Resta","Multiplicacion","Division","Reiniciar","Cancelar"},
				"seleccion 1");
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
		this.cod = cod;
	}
	
}