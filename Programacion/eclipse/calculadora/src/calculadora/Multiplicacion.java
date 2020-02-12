package calculadora;

public class Multiplicacion extends Operaciones
{
	public static void mult(String num1,String num2)
	{
		double result=0,n1,n2;
		String resultado;
		n1=Double.parseDouble(num1);
		n2=Double.parseDouble(num2);
		while (n2>0)
		{
			result+=n1;
			n2--;
		}
		resultado= String.valueOf(result);
		setOperacion(resultado);
	}
}
