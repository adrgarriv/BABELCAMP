package entidad;
import negocio.BatallaConBoss;

public class Fortaleza 
{
	private FinalBoss fb;
	
	public Fortaleza(FinalBoss fb)
	{
		this.fb = fb;
	}
	
	public synchronized void entrar(Personaje p)
	{
		boolean bossRip;
		if(fb.getPs()>0)
		{
			BatallaConBoss b = new BatallaConBoss();
			bossRip = b.combatePorTurnos(fb, p);
			if(bossRip == true)
			{
				System.out.println("Enhorabuena "+p.getNombre()+" has vencido al final boss");
			}
			else
			{
				System.out.println("Una pena "+p.getNombre()+" has perdido");
			}
		}
		else
		{
			System.out.println("El jefe ya ha muerto. No puedes entrar a la fortaleza");
		}
	}
}
