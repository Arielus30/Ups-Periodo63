package ec.edu.ups.est.practicados.clases;

//Clase que representa un producto de ropa, hereda de Producto
public class ProductoRopa extends Producto {
	private String talla;
	
	// Constructor por defecto
	public ProductoRopa() {
		
	}
	// Constructor con parámetros para inicializar un producto de ropa 
	public ProductoRopa(int codigo, String nombre, String marca, String talla, double precio ) {
		super(codigo, nombre, marca, precio);
		this.talla = talla;
	}
	
	//genero get y set
	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	//Genero el metodo toString
	@Override
	public String toString() {
		return super.toString() + "Talla=" + talla;
	}
	
	
	
}
