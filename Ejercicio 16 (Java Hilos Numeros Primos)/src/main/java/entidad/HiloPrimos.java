package entidad;

public class HiloPrimos implements Runnable{
	
	private int n;
	
	public HiloPrimos(int n, String nombreHilo)
	{
		this.n = n;
		Thread t1 = new Thread(this,nombreHilo);
		t1.start();
	}
	
	@Override
	public void run()
	{
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		if(esPrimo(n))
		{
			System.out.println("El numero "+n+" es primo");
		}
		else
		{
			System.out.println("El numero "+n+" no es primo");
		}
	}
	
	public boolean esPrimo(int num)
	{
		int contador = 0;
		boolean primo = false;
		for(int i = num; i > 0; i--)
		{
		    if(num % i == 0 )
		    {
		        contador++;
		    }
		}
		if(contador == 2)
		{
		    primo = true;
		}
		return primo;
	}

}
