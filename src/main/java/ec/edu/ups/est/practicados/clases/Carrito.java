package ec.edu.ups.est.practicados.clases;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

		private int numeroProductos;
		// Lista de productos en el carrito
		private List<Producto> productos;
		
		
		// Constructor predeterminado
		public Carrito() 
		{
			this.productos = new ArrayList<>();

		}

		//Agrego un constructor con sus atributos de la clase Carrito 
		public Carrito(int numeroProductos) {
			this.numeroProductos = numeroProductos;
			this.productos = new ArrayList<>();

		}

		//Genero los getters y setters de los atributos 

		public int getNumeroProductos() {
			return numeroProductos;
		}

		public void setNumeroProductos(int numeroProductos) {
			this.numeroProductos = numeroProductos;
		}
		
		// Método para agregar un producto al carrito
	    public void agregarProducto(Producto producto) {
	        productos.add(producto);
	    }
	 // Método getter para obtener la lista de productos en el carrito
	    public List<Producto> getProductos() {
	        return productos;
	    }
	    
	  //Creo el método toString()
		@Override
		public String toString() {
			return "Carrito [numeroProductos=" + numeroProductos + ", productos=" + productos + "]";
		}


		
	    


}
