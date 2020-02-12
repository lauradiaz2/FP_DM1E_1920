package calculadora;

public class Operaciones 
{
	private static String operacion;
	
	public static String getOperacion() 
	{
		return operacion;
	}
	public static void setOperacion(String _operacion) 
	{
		operacion = _operacion;
	}
	
	public boolean isValidOp(char op)
	{
		return (op=='+'||op=='-'||op=='*'||op=='/')? true : false;
	}
	public String opWhatEver(String operacion1,String c)
	{
		String num1="", num2="";
		int x=0,v=Integer.parseInt(c);
		char opCode = '_';
		for(int i =0; i<operacion1.length();i++)
		{
			char operacion =operacion1.charAt(i);
			if(isValidOp(operacion))
			{
				opCode = operacion;
				x++;
			}
			else
			{
				if(x==1)
				{
					num2+= String.valueOf(operacion);
				}
				else
				{
					num1+=String.valueOf(operacion);
				}
			}
		}
		
		if (opCode == '+')
		{
			Suma.sum(num1,num2);
		}
		else if (opCode == '-') 
		{
			Resta.resta(num1,num2);
		}
		else if (opCode == '*') 
		{
			Multiplicacion.mult(num1, num2);
		}
		else if (opCode == '/') 
		{
			//ojO Esto puede petar 0/0 N/0
			if(!num2.contentEquals("0"))
			{
				Division.div(num1, num2);
			}
			else
			{
				setOperacion("No puedo realizar esa división");
				v++;
			}
		}
		else 
		{
			//Controlar operación inválida
			setOperacion("No puedo realizar esa operacion");
		}
		c=String.valueOf(v);
		return getOperacion();
	}
}
