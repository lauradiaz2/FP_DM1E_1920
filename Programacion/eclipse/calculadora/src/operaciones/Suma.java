package operaciones;

public class Suma extends Operaciones
{
	
	public void sum(String a, String b)
	{
		double n1,n2,result=0;
		n1=Double.parseDouble(a);
		n2=Double.parseDouble(b);
		result=n1+n2;
		setResult(String.valueOf(result));
	}
}
