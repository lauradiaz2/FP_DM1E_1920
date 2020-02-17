package Operaciones;

public class Suma extends Operaciones
{
	public void sum()
	{
		double n1,n2,result=0;
		n1=Double.parseDouble(getNumero1());
		n2=Double.parseDouble(getNumero2());
		result=n1+n2;
		setResult(String.valueOf(result));
	}
}
