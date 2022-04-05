package modelo.persistencia.interfaces;
import java.util.ArrayList;

import modelo.entidad.Coche;
public interface DaoCoche {
	
	boolean alta(Coche c);
	boolean baja(int id);
	boolean modificar(Coche c);
	Coche obtenerPorId(int id);
	Coche obtenerPorMatricula(String matricula);
	ArrayList<Coche> listarPorMarca(String marca);
	ArrayList<Coche> listarPorModelo(String modelo);
	ArrayList<Coche> listar();
}

