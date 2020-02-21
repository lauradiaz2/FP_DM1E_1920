package operaciones;

public class Multiplicacion extends Operaciones
{
	public void mult(String a, String b)
	{
		double result=0,n1,n2;
		n1=Double.parseDouble(a);
		n2=Double.parseDouble(b);
		while (n2>0)
		{
			result+=n1;
			n2--;
		}
		setResult(String.valueOf(result));
	}
}
