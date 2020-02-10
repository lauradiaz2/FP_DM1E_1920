package calculadora;

public class Resta extends Operaciones
{
	public static void resta(String num1,String num2)
	{
		int n1,n2,result=0;
		String resultado;
		n1=Integer.parseInt(num1);
		n2=Integer.parseInt(num2);
		result=n1-n2;
		resultado= String.valueOf(result);
		setOperacion(resultado);
	}
}
