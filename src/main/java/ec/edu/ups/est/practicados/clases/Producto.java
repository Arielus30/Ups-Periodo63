package ec.edu.ups.est.practicados.clases;

public class Producto {
	protected int codigo;
	private String nombre;
	private String marca;
	private double precio;
	public Producto() {

	}
	public Producto(int codigo, String nombre, String marca, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	

}
