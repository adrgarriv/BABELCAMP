package entidad;
import java.util.Random;

public class FinalBoss extends Personaje
{
	double poder;
	public FinalBoss(String nombre, double ps, Arma arma, String estado, double poder)
	{
		this.nombre = nombre;
		this.ps = ps;
		this.arma = arma;
		this.estado = estado;
		this.poder = poder;
	}

	public double getPoder() {
		return poder;
	}

	public void setPoder(double poder) {
		this.poder = poder;
	}

	public double atacar(Personaje p)
	{
		Random rd = new Random();
		double dmg = this.arma.getDmg();
		if(this.arma instanceof ArmaBoss)
		{
			dmg+=poder;
			if(rd.nextInt(8)==7)
			{
				System.out.println("El boss activa la habilidad del guerrero. Este turno su dmg aumenta en un 50%" );
				dmg=1.5*dmg;
			}
			if(rd.nextInt(8)==7)
			{
				System.out.println("El boss activa la habilidad del mago. Alterara el estado del oponente" );
				int estado = rd.nextInt(3);
				if(estado==0)
				{
					p.setEstado("Confuso");
					System.out.println("El mago ha confundido a su oponente");
				}
				if(estado==1)
				{
					System.out.println("El mago ha quemado a su oponente");
					p.setEstado("Quemado");
				}
				if(estado==2)
				{
					System.out.println("El mago ha envenenado a su oponente");
					p.setEstado("Envenenado");
				}
			}
			if(rd.nextInt(8)==7)
			{
				System.out.println("El boss activa la habilidad del curandero. Este turno se curara el total de su poder");
				this.ps+=this.ps+poder;
			}
		}
		return dmg;
	}
	
	public void run()
	{
		
	}
	
	
	
}
