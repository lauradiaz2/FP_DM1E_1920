package calculadora;

public class Resta extends Operaciones
{
	public static void resta(String num1,String num2)
	{
		double n1,n2,result=0;
		String resultado;
		n1=Double.parseDouble(num1);
		n2=Double.parseDouble(num2);
		result=n1-n2;
		resultado= String.valueOf(result);
		setOperacion(resultado);
	}
}
