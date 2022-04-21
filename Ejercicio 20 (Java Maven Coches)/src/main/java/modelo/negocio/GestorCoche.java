package modelo.negocio;
import modelo.entidad.Coche;
import modelo.persistencia.DaoCocheMySQL;
import modelo.persistencia.interfaces.DaoCoche;
import java.util.ArrayList;

public class GestorCoche {

	private DaoCoche daoCoche = new DaoCocheMySQL();

	public int alta(Coche c){
		if(c.getMatricula().length() == 7) 
		{
			ArrayList<Coche> l = daoCoche.listar();
			boolean repetida = false;
			for(int i = 0;i<l.size();i++)
			{
				if(l.get(i).getMatricula().equals(c.getMatricula()))
				{
					repetida = true;
				}
			}
			if(!repetida)
			{
				if(c.getKilometros()<0)
				{
					return 4;
				}
				else
				{
					boolean alta = daoCoche.alta(c);
					if(alta) 
					{
						return 0;
					}
					else 
					{
						return 1;
					}
				}
			}
			else
			{
				return 3;
			}
		}
		else 
		{
			return 2;
		}
	}
	
	public boolean baja(int id){
		boolean baja = daoCoche.baja(id);
		return baja;
	}
	
	public int modificar(Coche c)
	{
		if(c.getMatricula().length() == 7) 
		{
			ArrayList<Coche> l = daoCoche.listar();
			boolean repetida = false;
			for(int i = 0;i<l.size();i++)
			{
				if(l.get(i).getMatricula().equals(c.getMatricula()))
				{
					repetida = true;
					System.out.println("Matricula repetida");
				}
			}
			if(!repetida)
			{
				if(c.getKilometros()<0)
				{
					return 4;
				}
				else
				{
					boolean modificada = daoCoche.modificar(c);
					if(modificada) 
					{
						return 0;
					}
					else 
					{
						return 1;
					}
				}
			}
			else
			{
				return 3;
			}
		}
		else 
		{
			return 2;
		}
	}
	
	public Coche obtenerPorId(int id){
		Coche c = daoCoche.obtenerPorId(id);
		return c;
	}
	public Coche obtenerPorMatricula(String matricula){
		Coche c = daoCoche.obtenerPorMatricula(matricula);
		return c;
	}
	
	public ArrayList<Coche> listar(){
		ArrayList<Coche> listaCoches = daoCoche.listar();
		return listaCoches;
	}
	public ArrayList<Coche> listarPorMarca(String marca){
		ArrayList<Coche> listaCoches = daoCoche.listarPorMarca(marca);
		return listaCoches;
	}
	public ArrayList<Coche> listarPorModelo(String modelo){
		ArrayList<Coche> listaCoches = daoCoche.listarPorModelo(modelo);
		return listaCoches;
	}
	public void cocheToJson(ArrayList<Coche> l)
	{
		daoCoche.cocheToJson(l);
	}


}
