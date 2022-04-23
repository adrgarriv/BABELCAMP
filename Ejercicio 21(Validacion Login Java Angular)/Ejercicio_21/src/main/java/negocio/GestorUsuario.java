package negocio;

import entidad.Usuario;
import persistencia.DaoUsuarioMySQL;
import persistencia.interfaces.DaoUsuario;

public class GestorUsuario 
{
	private DaoUsuario daoUsuario = new DaoUsuarioMySQL();
	public boolean validarUsuario(Usuario usuario)
	{
		return daoUsuario.validarUsuario(usuario);
	}
}
