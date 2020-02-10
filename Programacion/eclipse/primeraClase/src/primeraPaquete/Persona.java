package primeraPaquete;

public class Persona 
{//Inicio
	//Creo atributos para la clase
	String nombre; //cadena
	String dni;
	String fechaNacimiento;
	int peso;
	double altura;
	String grupoSanguineo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String _nombre) 
	{
		this.nombre = _nombre;
	}
	public String getDni() 
	{
		return dni;
	}
	public void setDni(String _dni) 
	{
		this.dni = _dni;
	}
	public String getFechaNacimiento() 
	{
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String _fechaNacimiento) 
	{
		this.fechaNacimiento = _fechaNacimiento;
	}
	public int getPeso() 
	{
		return peso;
	}
	public void setPeso(int _peso) 
	{
		this.peso = _peso;
	}
	public double getAltura() 
	{
		return altura;
	}
	public void setAltura(double _altura) 
	{
		this.altura = _altura;
	}
	public String getGrupoSanguineo() 
	{
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(String _grupoSanguineo) 
	{
		this.grupoSanguineo = _grupoSanguineo;
	}
	
	void mostrarPersona()
	{
		System.out.println("Mostramos la información de la persona");
		System.out.println("Nombre: "+getNombre());
		System.out.println("DNI: "+getDni());
		System.out.println("Fecha nacimiento:"+getFechaNacimiento());
		System.out.println("Altura: "+getAltura());
		System.out.println("Peso: "+getPeso());
		System.out.println("Grupo Sanguineo: "+getGrupoSanguineo());
	}
	

}//fin
