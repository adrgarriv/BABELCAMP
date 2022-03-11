package modelo;

public class Persona {
	
	private String usuario;
	private String pass;
	private int peso;
	
	public Persona() {
		super();
	}
	
	public Persona(String usuario, String pass)
	{
		this.usuario=usuario;
		this.pass=pass;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


	@Override
	public String toString() {
		return "Persona [usuario=" + usuario + ", pass=" + pass + ", peso=" + peso + "]";
	}
	
	
}
