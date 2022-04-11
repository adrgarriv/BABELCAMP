package vista;
import entidad.HiloPrimos;
import java.util.Scanner;

public class MainPrimos {

	public static void main(String[] args) 
	{
		int n1,n2,n3;
		System.out.println("Introduzca los 3 numeros a comprobar:");	
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		new HiloPrimos(n1,"Hilo 1");
		new HiloPrimos(n2,"Hilo 2");
		new HiloPrimos(n3,"Hilo 3");
		
		System.out.println("Hilo principal parando");	
	}

}
