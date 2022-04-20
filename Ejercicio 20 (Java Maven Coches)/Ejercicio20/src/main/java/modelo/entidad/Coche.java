package modelo.entidad;
import org.apache.poi.hssf.util.HSSFColor;

import com.xuxueli.poi.excel.annotation.ExcelField;
import com.xuxueli.poi.excel.annotation.ExcelSheet;
@ExcelSheet (name="Listado de coches", headColor = HSSFColor.HSSFColorPredefined.LIGHT_GREEN)
public class Coche 
{
	 @ExcelField(name="id")
	private int id;
	 @ExcelField(name="matricula")
	private String matricula;
	 @ExcelField(name="marca")
	private String marca;
	 @ExcelField(name="modelo")
	private String modelo;
	 @ExcelField(name="kilometros")
	private double kilometros;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getKilometros() {
		return kilometros;
	}
	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo +", kilometros="+kilometros+ "]";
	}
}
