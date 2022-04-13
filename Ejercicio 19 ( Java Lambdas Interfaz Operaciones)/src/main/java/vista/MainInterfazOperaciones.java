package vista;

interface InterfazDosParametros<T>
{
	
	public void operacion(T a, T b);
}
public class MainInterfazOperaciones {

	
	public static void main(String[] args) 
	{
		InterfazDosParametros<Integer> i1 = (a,b) -> {
			
			System.out.println("Suma de los dos Integer:"+(a+b));
			System.out.println("Resta de los dos Integer:"+(a-b));
			System.out.println("Producto de los dos Integer:"+(a*b));
			System.out.println("Division de los dos Integer:"+(a/b));
			int potencia = a;
			for(int i = 0;i<b-1;i++)
			{
				potencia = potencia*a;
			}
			System.out.println("Potencia de los dos Integer(a^b):"+(potencia));
		};
		
		InterfazDosParametros<Double> i2 = (a,b) -> {
			
			System.out.println("Suma de los dos Double:"+(a+b));
			System.out.println("Resta de los dos Double:"+(a-b));
			System.out.println("Producto de los dos Double:"+(a*b));
			System.out.println("Division de los dos Double:"+(a/b));
			System.out.println("Potencia de los dos Double(a^b):"+Math.pow(a,b));
		};
		
		i1.operacion(8, 4);
		i2.operacion(15.25, 3.8);
	}

}
