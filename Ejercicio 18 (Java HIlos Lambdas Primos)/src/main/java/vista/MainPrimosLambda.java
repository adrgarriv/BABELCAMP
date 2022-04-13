package vista;
import java.util.Scanner;
public class MainPrimosLambda 
{

	public static void main(String[] args) 
	{
		
		int n1,n2,n3;
		System.out.println("Introduzca los 3 numeros a comprobar:");	
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		Runnable r1 = () -> {
			System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
			if(esPrimo(n1))
			{
				System.out.println("El numero "+n1+" es primo");
			}
			else
			{
				System.out.println("El numero "+n1+" no es primo");
			}
			
		};
		Runnable r2 = () -> {
			System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
			if(esPrimo(n2))
			{
				System.out.println("El numero "+n2+" es primo");
			}
			else
			{
				System.out.println("El numero "+n2+" no es primo");
			}
			
		};
		
		Runnable r3 = () -> {
			System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
			if(esPrimo(n3))
			{
				System.out.println("El numero "+n3+" es primo");
			}
			else
			{
				System.out.println("El numero "+n3+" no es primo");
			}
			
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.setName("Hilo 1");
		t2.setName("Hilo 2");
		t3.setName("Hilo 3");
		try {
			Thread.sleep(5000);//5 seg
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		t2.start();
		t3.start();
		

		System.out.println("Hilo principal parando");
	}
	
	public static boolean esPrimo(int num)
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
