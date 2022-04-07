package vista;
import entidad.*;
import negocio.*;

public class Main {

	public static void main(String[] args) 
	{
		Guerrero p1 = new Guerrero();
		Arco a1 = new Arco();
		a1.setDmg(25);
		p1.setArma(a1);
		p1.setEstado("Ninguno");
		p1.setNombre("Hood");
		p1.setPs(400);
		p1.setFuerza(15);
		
		Mago p2 = new Mago();
		Hechizo a2 = new Hechizo();
		a2.setDmg(25);
		p2.setArma(a2);
		p2.setEstado("Ninguno");
		p2.setNombre("Magnus");
		p2.setPs(400);
		p2.setInteligencia(15);
		
		Batalla b = new Batalla();
		b.combatePorTurnos(p1, p2);
		
			
	}

}
