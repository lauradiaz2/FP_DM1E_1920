package operaciones;

public class Operaciones 
{
	private static String numero1;
	private static String numero2;
	private static String result;
	calculadora.Inputs calc = new calculadora.Inputs();
	//cada operación tendrá dos operandos y un código de operación
	
	public static String getNumero1()
	{
		return numero1;
	}
	public void setNumero1()
	{
		numero1 = calc.getOp1();
	}
	public static String getNumero2()
	{
		return numero2;
	}
	public void setNumero2()
	{
		numero2 = calc.getOp2();
	}
	public String getResult()
	{
		return result;
	}
	public void setResult(String _result)
	{
		result = _result;
	}
	
	
}
