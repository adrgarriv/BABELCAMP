package entidad;
import java.util.Random;
public class Guerrero extends Personaje
{
	double fuerza;
	
	public double atacar(Personaje p)
	{
		Random rd = new Random();
		double dmg = this.arma.getDmg();
		if(this.estado.equals("Confuso") && rd.nextInt(3)==2 )
		{
			System.out.println("El personaje "+this.nombre+" falla por estar confuso");
			dmg = 0;
		}
		else if(this.arma instanceof Espada)
		{
			int dado = rd.nextInt(101);
			double porcentaje = (double)dado/100;
			dmg += porcentaje*this.fuerza;
			if(rd.nextInt(16)==15)
			{
				System.out.println("El guerrero activa su habilidad al tener una espada. Este turno su dmg aumenta en un 50%" );
				dmg=1.5*dmg;
			}
		}
		else if(this.arma instanceof Arco)
		{
			int dado = rd.nextInt(101);
			double porcentaje = (double) dado/100;
			dmg += porcentaje*this.fuerza;
			if(rd.nextInt(16)==15)
			{
				System.out.println("El guerrero activa su habilidad al tener un arco. Este turno atacara multiples veces" );
				dmg=dmg+atacar(p);
			}
		}
		else if(this.arma == null)
		{
			dmg = fuerza;
		}
		if(this.estado.equals("Quemado"))
		{
			System.out.println("El personaje "+this.nombre+ "ve su daño reducido un 25% por estar quemado");
			dmg=0.75*dmg;
		}
		
		System.out.println("El guerrero "+this.nombre+" hara un daño de base "+dmg);
		return dmg;
	}

	public double getFuerza() {
		return fuerza;
	}

	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}
}
