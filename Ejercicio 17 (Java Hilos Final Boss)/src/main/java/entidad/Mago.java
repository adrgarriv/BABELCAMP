package entidad;
import java.util.Random;

public class Mago extends Personaje
{
	double inteligencia;
	Fortaleza f;
	public Mago(String nombre, double ps, Arma arma, String estado, double inteligencia, Fortaleza f)
	{
		this.nombre = nombre;
		this.ps = ps;
		this.arma = arma;
		this.estado = estado;
		this.inteligencia = inteligencia;
		this.f = f;
	}
	public double atacar(Personaje p)
	{
		Random rd = new Random();
		double dmg = this.arma.dmg;
		if(this.estado.equals("Confuso") && rd.nextInt(3)==2 )
		{
			System.out.println("El personaje "+this.nombre+" falla por estar confuso");
			dmg = 0;
		}
		else if(this.arma instanceof Hechizo)
		{
			int dado = rd.nextInt(101);
			double porcentaje = (double)dado/100;
			dmg += porcentaje*this.inteligencia;
			if(rd.nextInt(16)==15)
			{
				System.out.println("El mago activa su habilidad al tener un hechizo. Alterara el estado del oponente" );
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
		}
		else if(this.arma == null)
		{
			dmg = this.inteligencia;
		}
		if(this.estado.equals("Quemado"))
		{
			System.out.println("El personaje "+this.nombre+ "ve su daño reducido un 25% por estar quemado");
			dmg=0.75*dmg;
		}
		System.out.println("El mago "+this.nombre+" hara un daño base de "+dmg);
		return dmg;
	}
	public double getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(double inteligencia) {
		this.inteligencia = inteligencia;
	}
	public void run()
	{
		f.entrar(this);
	}
}
