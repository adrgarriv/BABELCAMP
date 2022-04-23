package vista;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Scanner;

import com.xuxueli.poi.excel.ExcelExportUtil;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;
public class Main {

	public static void main(String[] args) 
	{
		
		boolean validado = false;
		int contador = 0;
		do 
		{
			System.out.println("Introduzca usuario y contraseña");
			Scanner sc = new Scanner(System.in);
			String usuario = sc.next();
			String password = sc.next();
			try {
				//Se utiliza principalmente para consumir servicios REST
				//Tambien podemos consumir cualquier tipo de servidor web
				HttpRequest request = HttpRequest.newBuilder()
						  .uri(new URI("http://localhost:8080/Ejercicio_21/usuarios/login?nombre="+usuario+"&password="+password))
						  .GET()
						  .build();
				
				HttpClient client = HttpClient.newHttpClient();
				
				HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			
				if(response.body().contains("true"))
				{
					System.out.println("El usuario existe. Acceso al menu concedido");
					validado = true;
					contador = 3;
				}
				else
				{
					System.out.println("Error al introducir usuario o password. Le quedan "+(2-contador)+" intentos");
					contador++;
				}
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(contador<=2);
		if(validado)
		{
			System.out.println("Bienvenidos a nuestra CRUD de coches");
			Scanner sc = new Scanner(System.in);
			boolean fin = false;
			GestorCoche gc = new GestorCoche();
			String matricula;
			String marca;
			String modelo;
			double kilometros;
			Coche c;
			int id;
			ArrayList<Coche> l;

			do {
				menu();
				int opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Introduzca los datos del coche (matricula/marca/modelo/kilometros)");
					matricula = sc.next();
					marca = sc.next();
					modelo = sc.next();
					kilometros = sc.nextDouble();
					c = new Coche();
					c.setMatricula(matricula);
					c.setModelo(modelo);
					c.setMarca(marca);
					c.setKilometros(kilometros);
					int alta = gc.alta(c);
					if(alta == 0) {
						System.out.println("Coche dado de alta");
					}else if(alta == 1) {
						System.out.println("Error de conexion con la BBDD");
					}else if(alta == 2){
						System.out.println("La longitud de la matricula no es 7");
					}
					else if(alta==3) {
						System.out.println("Esta matricula ya existe");
					}
					else if(alta==4) {
						System.out.println("El numero de kilometros no puede ser negativo");
					}
					break;
				case 2:
					System.out.println("Introduzca el id del coche");
					id = sc.nextInt();
					boolean baja = gc.baja(id);
					if(baja)
					{
						System.out.println("Coche dado de baja con exito");
					}
					else
					{
						System.out.println("Error al dar de baja el coche");
					}
					break;
				case 3:
					System.out.println("Introduzca los datos del coche (id/matricula/marca/modelo/kilometros)");
					id=sc.nextInt();
					matricula = sc.next();
					marca = sc.next();
					modelo = sc.next();
					kilometros = sc.nextDouble();
					c = new Coche();
					c.setMatricula(matricula);
					c.setModelo(modelo);
					c.setMarca(marca);
					c.setKilometros(kilometros);
					c.setId(id);
					int modificar = gc.modificar(c);
					if(modificar == 0) {
						System.out.println("Coche modificado con exito");
					}else if(modificar == 1) {
						System.out.println("Error de conexion con la BBDD");
					}else if(modificar == 2){
						System.out.println("La longitud de la matricula no es 7");
					}
					else if(modificar==3) {
						System.out.println("Esta matricula ya existe");
					}
					else if(modificar==4) {
						System.out.println("El numero de kilometros no puede ser negativo");
					}
					break;
				case 4:
					System.out.println("Introduzca el id del coche");
					id = sc.nextInt();
					c = gc.obtenerPorId(id);
					System.out.println("El coche encontrado es: "+c);
					break;
				case 5:
					System.out.println("Introduzca la matricula del coche");
					matricula = sc.next();
					c = gc.obtenerPorMatricula(matricula);
					System.out.println("El coche encontrado es: "+c);
					break;
				case 6:
					System.out.println("Introduzca la marca del coche");
					marca = sc.next();
					l = gc.listarPorMarca(marca);
					System.out.println("Lista de coches encontrados:");
					for(int i=0;i<l.size();i++)
					{
						System.out.println(l.get(i));
					}
					break;
				case 7:
					System.out.println("Introduzca el modelo del coche");
					modelo = sc.next();
					l = gc.listarPorModelo(modelo);
					System.out.println("Lista de coches encontrados:");
					for(int i=0;i<l.size();i++)
					{
						System.out.println(l.get(i));
					}
					break;
				case 8:
					l = gc.listar();
					System.out.println("Lista de coches encontrados:");
					for(int i=0;i<l.size();i++)
					{
						System.out.println(l.get(i));
					}
					break;
				case 9:
					fin = true;
					break;
				case 10:
					l = gc.listar();
					gc.cocheToJson(l);
					break;
				case 11:
					String filePath = "/Users/adrian.garcia/Desktop/coches.xls";
					l=gc.listar();
					ExcelExportUtil.exportToFile(filePath, l);
					break;
				}
			}while(!fin);

			System.out.println("Fin de programa");

		}
		else
		{
			System.out.println("Acceso no concedido a la aplicacion");
		}
				
	}

	private static void menu() {
		System.out.println("Elija una opcion:");
		System.out.println("1- Alta de coche");
		System.out.println("2- Eliminar coche por id");
		System.out.println("3- Modificar coche por id");
		System.out.println("4- Buscar coche por id");
		System.out.println("5- Buscar coche por matricula");
		System.out.println("6- Buscar coches por marca");
		System.out.println("7- Buscar coches por modelo");
		System.out.println("8- Listar todos los coches");
		System.out.println("9- Salir de la aplicacion");
		System.out.println("10- Exportar coches a JSON");
		System.out.println("11- Exportar coches a Excel");
	}

}
