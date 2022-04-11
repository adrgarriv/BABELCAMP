package entidad;

import java.util.Random;

public class Curandero extends Personaje 
{
	double sabiduria;
	Fortaleza f;
	public Curandero(String nombre, double ps, Arma arma, String estado, double sabiduria, Fortaleza f)
	{
		this.nombre = nombre;
		this.ps = ps;
		this.arma = arma;
		this.estado = estado;
		this.sabiduria = sabiduria;
		this.f = f;
	}
	public double atacar(Personaje p)
	{
		Random rd = new Random();
		double dmg = this.arma.getDmg();
		if(this.estado.equals("Confuso") && rd.nextInt(3)==2 )
		{
			System.out.println("El personaje "+this.nombre+" falla por estar confuso");
			dmg = 0;
		}
		else if(this.arma instanceof Rezo)
		{
			int dado = rd.nextInt(101);
			double porcentaje =(double) dado/100;
			dmg += porcentaje*this.sabiduria;
			if(rd.nextInt(16)==15)
			{
				int dado2 = rd.nextInt(101);
				double porcentaje2 = (double)dado2/100;
				System.out.println("A");
				System.out.println("A");
				System.out.println("A");
				System.out.println("A");
				System.out.println("A");
				System.out.println("El curandero activa su habilidad al usar un rezo. Este turno se curara un % de su sabiduria");
				this.ps=this.ps+(porcentaje2*sabiduria);
			}
		}
		else if(this.arma == null)
		{
			dmg = this.sabiduria;
		}
		if(this.estado.equals("Quemado"))
		{
			System.out.println("El personaje "+this.nombre+ "ve su daño reducido un 25% por estar quemado");
			dmg=0.75*dmg;
		}
		System.out.println("El curandero "+this.nombre+" hara un daño base de "+dmg);
		return dmg;
	}
	public double getSabiduria() {
		return sabiduria;
	}
	public void setSabiduria(double sabiduria) {
		this.sabiduria = sabiduria;
	}
	public void run()
	{
		f.entrar(this);
	}
}
