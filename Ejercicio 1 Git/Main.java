
public class Main {

	public static void main(String[] args) 
	{
/*<<<<<<< HEAD
		Comentario fusion con conflictos hecho por resta
=======
		Comentario fusion con conflictos hecho por master
>>>>>>> master*/
		// TODO Auto-generated method stub
		Suma suma = new Suma();
		suma.suma(2,3);
		suma.suma_acumulada(5);
		suma.suma_acumulada(6);
		suma.suma_acumulada(7); //Hecho por local

		Resta resta = new Resta();
		resta.resta(2,3);
		resta.resta_acumulada(5);
		resta.resta_acumulada(6);
    }
}