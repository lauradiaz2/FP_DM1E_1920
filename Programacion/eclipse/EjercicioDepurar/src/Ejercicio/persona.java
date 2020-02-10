package Ejercicio;

public class persona 
{
	String nombre;
	String apellidos;
	int edad;
	boolean casadx;
	String dni;
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String _nombre) 
	{
		nombre = _nombre;
	}
	
	public String getApellidos() 
	{
		return apellidos;
	}
	
	public void setApellidos(String _apellidos) 
	{
		apellidos = _apellidos;
	}
	
	public int getEdad() 
	{
		return edad;
	}
	
	public void setEdad(int _edad) 
	{
		edad = _edad;
	}
	
	public boolean isCasadx() 
	{
		return casadx;
	}
	
	public void setCasadx(boolean _casadx) 
	{
		casadx = _casadx;
	}
	
	public String getDni() 
	{
		return dni;
	}
	
	public void setDni(String _dni) 
	{
		dni = _dni;
	}
	
	public persona()
	{
		nombre="Laura";
		apellidos="Díaz";
		edad=19;
		casadx=false;
		dni="12345678A";
	}
	
	void mostrarInfo()
	{
		int x;
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Edad: "+edad);
		if(isCasadx())
		{
			System.out.println("Si está casadx");
		}
		else
		{
			System.out.println("No está casadx");
		}
		System.out.println("DNI: "+dni);
		x=0;
		while(edad>15)
		{
			++x;
			System.out.println(x);
		}
	}
}
