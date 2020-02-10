package calculadora;

public class Division extends Operaciones
{
	public static void div(String num1,String num2)
	{
		int result=0,n1,n2,x=0;
		String resultado;
		n1=Integer.parseInt(num1);
		n2=Integer.parseInt(num2);
		while (n1>n2)
		{
			if(n1!=0)
			{
				n1*=10;
			}
			else
			{
				n1=n1-n2;
				x++;
			}
			
		}
		result=x;
		resultado= String.valueOf(result);
		setOperacion(resultado);
	}
}
