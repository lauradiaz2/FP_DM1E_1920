package primeraPaquete;

public class Perro 
{
	String raza;
	String tamaño;
	String color;
	String fechaNacimiento;
	boolean sexo;
	
	public String getRaza()
	{
		return raza;
	}
	
	public void setRaza(String _raza)
	{
		this.raza = _raza;
	}
	
	public String getTamaño()
	{
		return tamaño;
	}
	
	public void setTamaño(String _tamaño)
	{
		this.tamaño = _tamaño;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String _color)
	{
		this.color = _color;
	}
	
	public String getFechaNacimiento()
	{
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(String _fechaNacimiento)
	{
		this.fechaNacimiento = _fechaNacimiento;
	}
	
	public boolean isSexo()
	{
		return sexo;
	}
	
	public void setSexo(boolean _sexo)
	{
		this.sexo = _sexo;
	}
	
	void mostrarPerro()
	{
		System.out.println("Mostramos la información del mamifero");
		System.out.println("Raza: "+getRaza());
		System.out.println("Tamaño: "+getTamaño());
		System.out.println("Fecha nacimiento:"+getFechaNacimiento());
		System.out.println("Su color es: "+getColor());
		if (isSexo())//Si (condición) entonces
			System.out.println("Su género es masculino");//entonces hacemos esto
		else//sino
			System.out.println("Su género es femenino");//Pues hacemos esto :)
	}
	
}
