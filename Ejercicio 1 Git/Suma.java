public class Suma 
{
	/*Comentario fusion sin conflictos*/
	private int total=0;
	
	public Suma() {}
	
	public void suma(int a, int b)
	{
		System.out.println("El resultado de la suma es "+(a+b));
	}
	
	public void suma_acumulada(int a)
	{
		total+=a;
		System.out.println("El resultado de la suma es "+(total));
	}
	
}