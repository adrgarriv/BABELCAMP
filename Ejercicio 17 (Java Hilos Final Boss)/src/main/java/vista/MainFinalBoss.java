package vista;
import negocio.*;
import entidad.*;

public class MainFinalBoss 
{
	public static void main(String[] args)
	{
		FinalBoss fb = new FinalBoss("Maxwell",20,new ArmaBoss(),"Ninguno",50);
		Fortaleza f = new Fortaleza(fb);
		Guerrero gce = new Guerrero("Percy",500,new Espada(),"Ninguno",25,f);
		Guerrero gca = new Guerrero("Arrow",500,new Arco(),"Ninguno",25,f);
		Curandero c = new Curandero("Soraka",500,new Rezo(),"Ninguno",25,f);
		Mago m = new Mago("Percy",500,new Hechizo(),"Ninguno",25,f);
		
		Thread t1 = new Thread(gce);
		Thread t2 = new Thread(gca);
		Thread t3 = new Thread(c);
		Thread t4 = new Thread(m);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
}
