package modelo.entidad;

public class Trabajador extends Empleado {


	private double valoracion;

	public double sueldoFinal()
	{
		if(valoracion <=4)
		{
			this.sueldo = this.sueldo+0;
		}
		if(valoracion>=5 && valoracion<=6)
		{
			this.sueldo=this.sueldo+50;
		}
		if(valoracion>=7 && valoracion<=8)
		{
			this.sueldo=this.sueldo+100;
		}
		if(valoracion>=9 && valoracion<=10)
		{
			this.sueldo=this.sueldo+200;
		}

		return this.sueldo;
	}

	

	public double getValoracion() {
		return valoracion;
	}

	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}

}
