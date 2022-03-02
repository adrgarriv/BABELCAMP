public class Resta 
{
	private int total=0;
	
	public Resta() {}
	
	public void resta(int a, int b)
	{
		System.out.println("El resultado de la suma es "+(a-b));
	}
	
	public void resta_acumulada(int a)
	{
		total-=a;
		System.out.println("El resultado de la suma es "+(total));
	}
}
