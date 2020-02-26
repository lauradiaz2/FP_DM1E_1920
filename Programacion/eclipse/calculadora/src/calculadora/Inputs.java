package calculadora;

import javax.swing.JOptionPane;

public class Inputs 
{
	String opciones[];
	private double op1;
	private double op2;
	private int cod;

	Inputs()//Constructor por defecto
	{
		this.op1=0;
		this.op2=0;
		this.cod=0;
		opciones= new String[6];
			opciones[0]="SUMA";
			opciones[1]="RESTA";
			opciones[2]="MULTIPLICACION";
			opciones[3]="DIVISION";
			opciones[4]="REINICIAR";
			opciones[5]="CANCELAR";		
	}
	//Metodos
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
		cod = JOptionPane.showOptionDialog(null,
				"Qué operación quieres realizar", 
				"Operación a realizar", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opciones,
				null);
		
	}
//	SETTERS Y GETTERS
	
	public double getOp1() {
		return op1;
	}
	public void setOp1(double op1) {
		this.op1 = op1;
	}
	public double getOp2() {
		return op2;
	}
	public void setOp2(double op2) {
		this.op2 = op2;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}	
}