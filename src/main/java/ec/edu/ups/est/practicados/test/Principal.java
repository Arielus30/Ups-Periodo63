package ec.edu.ups.est.practicados.test;
import ec.edu.ups.est.practicados.clases.*;
import java.util.*;


public class Principal {
	public static void main (String [] args) {	
		// Crear una lista para almacenar productos
		List<Producto> lista = new ArrayList<Producto>();
		// Inicializar un ArrayList para guardar pedidos
		ArrayList<Pedido> pedido = new ArrayList<>();

		// Inicializar un ArrayList para almacenar productos en el carrito
		ArrayList<Producto> carrito = new ArrayList<>();
		// Variable para rastrear el precio total de los productos
		double precioTotal=0;
		// Crear una instancia de la clase Usuario
    	Usuario usuario1 = new Usuario();
		//Instanciación el metodo Scanner 
        Scanner s = new Scanner(System.in);
        
        
        //Creo y establezco valores a Ropa y Electronico
		ProductoRopa productoRopa0 = new ProductoRopa (1,"Pantalon", "Levis", "30", 30);
		ProductoRopa productoRopa1 = new ProductoRopa (2,"Camiseta", "Pull&Bear","M",50);
		ProductoRopa productoRopa2 = new ProductoRopa (3,"Pantaloneta", "Nike", "S", 49);
		ProductoRopa productoRopa3 = new ProductoRopa (4,"Sueter", "Adidas", "L", 39);
		ProductoRopa productoRopa4 = new ProductoRopa (5,"Zapatos", "Nike", "9", 100);

        ProductoElectronico productoElectronico0 = new ProductoElectronico (6,"Impresora Epson L3110", "Epson", "Impresora", 538 );
		ProductoElectronico productoElectronico1 = new ProductoElectronico (7,"Asus TUF Gaming", "Asus", "Laptops", 799 );
		ProductoElectronico productoElectronico2 = new ProductoElectronico (8,"Alexa Amazon", "Amazon", "Parlante", 169 );
		ProductoElectronico productoElectronico3 = new ProductoElectronico (9,"Iphone 15 pro", "Apple", "Celular", 999 );
		ProductoElectronico productoElectronico4 = new ProductoElectronico (10,"Acer Nitro 17", "Acer", "Laptops", 969 );
		
		// Agregar productos de ropa a la lista	
		lista.add(productoRopa0);
		lista.add(productoRopa1);
		lista.add(productoRopa2);
		lista.add(productoRopa3);
		lista.add(productoRopa4);

		// Agregar productos electrónicos a la lista
		lista.add(productoElectronico0);
		lista.add(productoElectronico1);
		lista.add(productoElectronico2);
		lista.add(productoElectronico3);
		lista.add(productoElectronico4);

		

		
		System.out.println("----Registrese Para Comenzar----");
		int ñ = 1;
        
        if (ñ==1) {
        	//Pide que se ingrese los datos del usuario
        	System.out.println("Ingrese su nombre de usuario:");
        	String usuario = s.next();
        	usuario1.setNombre(usuario);

        	System.out.println("Ingrese su Correo Electronico:");
        	String correo = s.next();
        	usuario1.setCorreo(correo);

        	System.out.println("Ingrese su contraseña:");
        	String contraseña = s.next();
        	usuario1.setContraseña(contraseña);


        }	

        //creo un while para usar el programa 
    	while (true) {
            System.out.println("--Seleccione Una Opcion--\n");
            System.out.println("1. Productos");
            System.out.println("2. Carrito");
            System.out.println("3. Pedidos");
            System.out.println("4. Salir");

            int opcion = s.nextInt();
            
            if (opcion==1) {
            	// Mostrar los productos disponibles en la lista
        		for (int i = 0; i < lista.size(); i++) {
        		    System.out.println(lista.get(i));
        		}
        		boolean seguirComprando = true;
                while (seguirComprando) {
                	// Solicitar al usuario el código del producto a añadir al carrito
                	System.out.println("Digite el codigo del producto que desea añadir al carrito: \n");
					int codigoProducto = s.nextInt();
					// Obtener el producto seleccionado según el código ingresado y lo agrego al carrito
					Producto productoSeleccionado = lista.get(codigoProducto-1);
	                carrito.add(productoSeleccionado);
	                System.out.println("Producto agregado correctamente!");
	                // Actualizar el precio total con el precio del producto seleccionado
	                precioTotal=precioTotal+productoSeleccionado.getPrecio();
	                System.out.println("Precio actual a pagar:"+precioTotal);
	                System.out.println("--Seleccione 1 para agregar otro producto.--");
	                System.out.println("--Seleccione 2 regresar al menú.--");
	                int seguir = s.nextInt();
	                
	                //Volver al menu
                    if (seguir==2) {
                    	
                    	seguirComprando = false;
                    }

                } 
  
            }
            
           if (opcion==2) {
        	// Mostrar los productos en el carrito
	           	System.out.println("Carrito:\n");
	           	for (Producto compra : carrito ) 
	           	{
	           		System.out.println(compra.toString());
	           	}
	           	System.out.println("Valor a pagar:"+precioTotal);
	           	System.out.println("Seleccione 1 para comprar\n");
	           	System.out.println("Seleccione 2 para salir al menú\n");
	           	int seleccion = s.nextInt();
	           	if (seleccion == 1) {
	           	// Solicitar la dirección de envío al usuario
	           		System.out.println("Ingrese la direccion de envio:");
	           		String escanerDireccion = s.next();
	           	// Crear un nuevo pedido y establecer la dirección de envío
	           		Pedido unPedido = new Pedido();
	           		unPedido.setDireccion(escanerDireccion);
	           	// Agregar el pedido a la lista de pedidos
	           		pedido.add(unPedido);
	           		System.out.println("Su pedido a sido realizado exitosamente");
	               	
	           	}
	           	
	           	
	           	
           }
            
           if (opcion==3) {
        	 // Mostrar los detalles del pedido
       		System.out.println("--Los detalles de su pedido son-- \n");
       		System.out.println("Productos comprados:");
       		// Mostrar los productos comprados en el carrito
       		for (Producto compra : carrito ) 
           	{
           		System.out.println(compra.toString());
           	}
       	// Mostrar los detalles de entrega para cada pedido realizado
       		for (Pedido entrega : pedido ) 
           	{
           		System.out.println(entrega.toString());
           		
           	}
       		// Mostrar el Usuario dueño del carrito
       		System.out.println("Dueño del carrito:");
			System.out.println(usuario1.toString());
           }
           
           
	       if (opcion==4) {
	    	//Salir del programa
	       	System.out.println("Gracias por usar el programa :)");
	       	break;
	       }
	           
    	}
	}
}
