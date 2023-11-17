package ec.edu.ups.est.practicados.clases;

public class Pedido {
	private String direccion;
	
	public Pedido() {
		
	}
	
	public Pedido(String direccion) {


		this.direccion = direccion;
	}




	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return  "Direccion de entrega=" + direccion;
	}
	
	
	
}
