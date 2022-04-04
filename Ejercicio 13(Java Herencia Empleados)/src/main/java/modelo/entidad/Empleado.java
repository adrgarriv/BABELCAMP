package modelo.entidad;

public abstract class Empleado 
{
	double sueldo;
	String nombre;

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}


	public abstract double sueldoFinal();

}
