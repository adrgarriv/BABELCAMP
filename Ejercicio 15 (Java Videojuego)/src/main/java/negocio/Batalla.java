package negocio;
import entidad.*;
import java.util.*;

public class Batalla 
{
	public void combatePorTurnos(Personaje p1, Personaje p2)
	{
		Random rd = new Random();
		int moneda = rd.nextInt(2);
		boolean finCombate = false;
		double dmg;
		
		
		if(moneda==0) //Empieza p1
		{
			System.out.println("Empieza el personaje "+p1.getNombre());
			do
			{
				if(finCombate==false)
				{
					if(p1.getPs()>0)
					{
						System.out.println("La vida del personaje "+p1.getNombre()+" es "+p1.getPs()+" y la vida del personaje "+p2.getNombre()+" es "+p2.getPs() );
						dmg = p1.atacar(p2);
						if(rd.nextInt(16) == 15)
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
		
		}
		else //Empieza p2
		{
			System.out.println("Empieza el personaje "+p2.getNombre());
			do
			{
				if(finCombate == false)
				{
					if(p2.getPs()>0)
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
					
				if(finCombate==false)
				{
					if(p1.getPs() > 0)
					{
						System.out.println("La vida del personaje "+p1.getNombre()+" es "+p1.getPs()+" y la vida del personaje "+p2.getNombre()+" es "+p2.getPs() );
						dmg = p1.atacar(p2);
						if(rd.nextInt(16) == 15)
						{
							dmg = 2*dmg;
							System.out.println("Golpe critico del personaje "+p1.getNombre());
						}
						p2.setPs(p2.getPs()-dmg);
						if(p1.getEstado().equals("Envenenado"))
						{
							System.out.println("El personaje "+p1.getNombre()+" pierde vida por el veneno");
							p1.setPs(p1.getPs()-(p1.getPs()*0.05));
						}
						System.out.println("El daño final del personaje "+p1.getNombre()+" es "+dmg);
						System.out.println("La vida del personaje "+p1.getNombre()+" es "+p1.getPs()+" y la vida del personaje "+p2.getNombre()+" es "+p2.getPs() );
					}
					else
					{
						finCombate=true;
					}
				}
			}
			while(!finCombate);
		}
		if(p1.getPs()<0)
		{
			System.out.println("La vida del personaje "+p1.getNombre()+" esta por debajo de 0. Ha perdido");
		}
		else
		{
			System.out.println("La vida del personaje "+p2.getNombre()+" esta por debajo de 0. Ha perdido");
		}
	}
}
		
	

