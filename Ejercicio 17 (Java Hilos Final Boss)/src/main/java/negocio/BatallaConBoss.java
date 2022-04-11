package negocio;

import java.util.Random;
import entidad.*;

public class BatallaConBoss 
{
	public boolean combatePorTurnos(Personaje p1, Personaje p2)
	{

		Random rd = new Random();
		boolean finCombate = false;
		boolean bossRip = false;
		double dmg;
		do
		{
			if(p1.getPs()>0)
			{
				System.out.println("La vida del personaje "+p1.getNombre()+" es "+p1.getPs()+" y la vida del personaje "+p2.getNombre()+" es "+p2.getPs() );
				dmg = p1.atacar(p2);
				if(rd.nextInt(8) == 7)
				{
					dmg = 2*dmg;
					System.out.println("Golpe critico del personaje "+p1.getNombre());
				}
				p2.setPs(p2.getPs()-dmg);
				if(p1.getEstado().equals("Envenenado"))
				{
					System.out.println("El personaje "+p1.getNombre()+" pierde vida por el veneno");
					p1.setPs(p1.getPs()-(p1.getPs()*0.05));
					if(p1.getPs()<0)
					{
						finCombate=true;
					}
				}
				System.out.println("El daño final del personaje "+p1.getNombre()+" es "+dmg);
				System.out.println("La vida del personaje "+p1.getNombre()+" es "+p1.getPs()+" y la vida del personaje "+p2.getNombre()+" es "+p2.getPs() );
			}
			else
			{
				finCombate=true;	
			}
			if(finCombate==false)
			{
				if(p2.getPs() > 0)
				{
					System.out.println("La vida del personaje "+p1.getNombre()+" es "+p1.getPs()+" y la vida del personaje "+p2.getNombre()+" es "+p2.getPs() );
					dmg = p2.atacar(p1);
					if(rd.nextInt(16) == 15)
					{
						dmg = 2*dmg;
						System.out.println("Golpe critico del personaje "+p2.getNombre());
					}
					p1.setPs(p1.getPs()-dmg);
					if(p2.getEstado().equals("Envenenado"))
					{
						System.out.println("El personaje "+p2.getNombre()+" pierde vida por el veneno");
						p2.setPs(p2.getPs()-(p2.getPs()*0.05));
						if(p2.getPs()<0)
						{
							finCombate=true;
						}
					}
					System.out.println("El daño final del personaje "+p2.getNombre()+" es "+dmg);
					System.out.println("La vida del personaje "+p1.getNombre()+" es "+p1.getPs()+" y la vida del personaje "+p2.getNombre()+" es "+p2.getPs() );
				}
				else
				{
					finCombate=true;
				}
			}
		}
		while(!finCombate);
		
		if(finCombate == true && p1.getPs() < 0)
		{
			bossRip = true;
		}
		return bossRip;
	}
}
