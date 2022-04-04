package modelo.entidad;
import java.util.ArrayList;


public class Directivo extends Empleado{
	
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public double sueldoFinal()
	{
		this.sueldo = this.sueldo + empleados.size()*100;
		return this.sueldo;
	}

}
