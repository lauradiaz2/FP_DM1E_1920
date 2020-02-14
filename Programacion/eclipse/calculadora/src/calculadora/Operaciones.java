package calculadora;

import javax.swing.JOptionPane;

public class Operaciones 
{
	private static String numero1;
	private static String numero2;
	private static String codigo;
	private static String result;
	//cada operación tendrá dos operandos y un código de operación
	
	public static String getNumero1() 
	{
		return numero1;
	}
	public static void setNumero1(String _operacion) 
	{
		numero1 = _operacion;
	}
	public static String getNumero2() 
	{
		return numero2;
	}
	public static void setNumero2(String _numero2) 
	{
		numero2 = _numero2;
	}
	public static String getCodigo() 
	{
		return codigo;
	}
	public static void setCodigo(String _codigo) 
	{
		codigo = _codigo;
	}
	public static String getResult() 
	{
		return result;
	}
	public static void setResult(String _result) 
	{
		result = _result;
	}
	
	void mostrarInfo()
	{
		JOptionPane.showMessageDialog(null, Operaciones.getNumero1()+Operaciones.getCodigo()
		+Operaciones.getNumero2()+" = "+Operaciones.getResult());
		
	}
}
