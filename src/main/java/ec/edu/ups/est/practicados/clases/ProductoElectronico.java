package ec.edu.ups.est.practicados.clases;

public class ProductoElectronico extends Producto {
	private String tipo;

	public ProductoElectronico() {
		super();
	}

	public ProductoElectronico(int codigo, String nombre, String marca,String tipo, double precio) {
		super(codigo, nombre, marca, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo="+ tipo;
	}
	
}
