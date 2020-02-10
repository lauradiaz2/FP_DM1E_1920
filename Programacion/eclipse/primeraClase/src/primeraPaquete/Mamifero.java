package primeraPaquete;

//Queremos crear una clase Mamifero
public class Mamifero 
{//Con las llaves decimos que aquí empieza mi clase
	
	//Estos son nuestro atributos
	//Se ponen SIEMPRE al principio de la clase ¿verdad?
	boolean sexoMasculino;//Lógico
	int  peso;//Entero
	double altura;//Real
	String fechaNacimiento;//Cadena
	String especie;//Cadena
	int tiempo_gestacion_dias;//Entero

	//Aquí empezamos a tener todos nuestros métodos
	public int getTiempo_gestacion_dias() {
		return tiempo_gestacion_dias;
	}

	public void setTiempo_gestacion_dias(int tiempo_gestacion_dias) {
		this.tiempo_gestacion_dias = tiempo_gestacion_dias;
	}

	public String getEspecie()//aquí decimos el tipo de datos que vamos a devolver
	{							//ya que el ordenador es cortito y no entiende de otra cosa
								//más que 0 y 1
		return especie;			//le estamos diciendo que nos devuelva algo
	}

	public void setEspecie(String _especie)//no le decimos que nos devuelva algo 
	{									  //por lo que ponemos void = nada
		especie = _especie;
	}
	
	public boolean isSexoMasculino() {
		return sexoMasculino;
	}

	public void setSexo_masculino(boolean _sexoMasculino) 
	{
		sexoMasculino = _sexoMasculino;
	}

	public int getPeso() {
		return peso;//Aquí devolvemos el valor, es peso <- getPeso() del PSeInt
	}

	public void setPeso(int peso) 
	{
		this.peso = peso;
	}

	public double getAltura() 
	{
		return altura;
	}


	public void setAltura(double altura) 
	{
		this.altura = altura;
	}


	public String getFecha_nacimiento() 
	{
		return fechaNacimiento;
	}


	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fechaNacimiento = fecha_nacimiento;
	}
	
	public Mamifero()
	{
		peso=50;
		altura=1.8;
		fechaNacimiento="02/07/2000";
		especie="Homo Sapiens Sapiens";
		sexoMasculino=false;
		tiempo_gestacion_dias=290;
	}
	
	public Mamifero(boolean _sexoMasculino,int _peso,double _altura,String _fechaNacimiento,String _especie,int _tiempoGestaciondias)
	{
		sexoMasculino=_sexoMasculino;
		peso=_peso;
		altura=_altura;
		fechaNacimiento=_fechaNacimiento;
		especie=_especie;
		tiempo_gestacion_dias=_tiempoGestaciondias;
	}
	
	public Mamifero(Mamifero _mp)
	{
		sexoMasculino=_mp.isSexoMasculino();
		peso=_mp.getPeso();
		altura=_mp.getAltura();
		fechaNacimiento=_mp.getFecha_nacimiento();
		especie=_mp.getEspecie();
		tiempo_gestacion_dias=_mp.getTiempo_gestacion_dias();
	}

	void mostrarInfo()
	{
		System.out.println("Mostramos la información del mamifero");
		System.out.println("Altura: "+getAltura());
		System.out.println("Peso: "+getPeso());
		System.out.println("Fecha nacimiento:"+getFecha_nacimiento());
		System.out.println("Su especie es: "+getEspecie());
		System.out.println("Su tiempo de gestación es de:"+getTiempo_gestacion_dias()+" dias.");
		if (isSexoMasculino())//Si (condición) entonces
			System.out.println("Su género masculino");//entonces hacemos esto
		else//sino
			System.out.println("Su género femenino");//Pues hacemos esto :)
	}
	
}//Aquí termina nuestra clase
