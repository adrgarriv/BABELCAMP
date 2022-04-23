package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entidad.Usuario;
import persistencia.interfaces.DaoUsuario;

public class DaoUsuarioMySQL implements DaoUsuario {
	private Connection conexion;
	public boolean abrirConexion()
	{
		String url = "jdbc:mysql://localhost:3306/bbdd";
		String usuario = "root";
		String password = "";
		try 
		{
			conexion = DriverManager.getConnection(url,usuario,password);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean cerrarConexion()
	{
		try 
		{
			conexion.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	public boolean validarUsuario(Usuario usuario) 
	{
		boolean existe = false;
		if(!abrirConexion())
		{
			return false;
		}
		
		String query = "select usuario,password from usuarios "
				+ "where usuario = ?";
		try 
		{
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, usuario.getUsuario());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				if(rs.getString(1).equals(usuario.getUsuario())&&rs.getString(2).equals(usuario.getPassword()))
				{
					System.out.println("Usuario encontrado");
					existe = true;
				}
			}
		} catch (SQLException e) 
		{
			System.out.println("obtener -> error al obtener el "
					+ "usuario con con nombre " + usuario.getUsuario());
			e.printStackTrace();
		} finally 
		{
			cerrarConexion();
		}
		
		
		return existe;
	}
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver cargado");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver NO cargado");
			e.printStackTrace();
		}
	}

}
