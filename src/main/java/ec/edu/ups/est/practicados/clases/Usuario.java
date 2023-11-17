package ec.edu.ups.est.practicados.clases;

public class Usuario {
	//Creo los atributos de la clase Usuario
	private String nombre;
	private String correo;
	private String contraseña;
	
	// Constructor vacio
	public Usuario() {
		
	}
	
	// Constructor con parámetros para inicializar un usuario con nombre, correo y contraseña
	public Usuario(String nombre, String correo, String contraseña) {
		this.nombre = nombre;
		this.correo = correo;
		this.contraseña = contraseña;
	}
	
	//Genero los get y set de los atributos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	//Genero el toString
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", contraseña=" + contraseña + "]";
	}
	
	
	
}
