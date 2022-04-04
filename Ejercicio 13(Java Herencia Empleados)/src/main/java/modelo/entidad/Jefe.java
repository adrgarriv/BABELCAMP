package modelo.entidad;

public class Jefe extends Empleado
{
	private double incentivos;

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	public double sueldoFinal()
	{
		this.sueldo=this.sueldo+incentivos;
		return this.sueldo;
	}
}
