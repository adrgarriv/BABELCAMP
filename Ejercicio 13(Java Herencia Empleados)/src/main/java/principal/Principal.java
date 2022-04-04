package principal;
import modelo.entidad.*;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) 
	{
		
		Trabajador t = null;
		Directivo d = new Directivo();
		Jefe j = null;
		ArrayList<Empleado> e = new ArrayList<Empleado>();
		for(int i=0;i<5;i++)
		{
			if(i<3)
			{
				t=new Trabajador();
				t.setNombre("Trabajador"+i);
				t.setSueldo(i*100);
				t.setValoracion(i+3.5);
				e.add(t);
			}
			else
			{
				j = new Jefe();
				j.setNombre("Jefe"+i);
				j.setSueldo(i*200);
				j.setIncentivos((i*100)/2);
				e.add(j);
			}
		}
		d.setEmpleados(e);
		d.setNombre("Felix");
		d.setSueldo(2000);
		
		System.out.println("El sueldo de "+d.getNombre()+" es:"+d.sueldoFinal());
		for(int k = 0;k<d.getEmpleados().size();k++)
		{
			System.out.println("El sueldo de "+d.getEmpleados().get(k).getNombre()+" es:"+d.getEmpleados().get(k).sueldoFinal());
		}
	}

}
