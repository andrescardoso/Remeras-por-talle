package Ejercicio1;

public class Stock extends Remera {
		
	public static Remera[] remeras = new Remera[4];	
	public int[] cantidadPorTalle = new int[8];
	
	public Stock() { // CONSTRUCTOR VACÍO PORQUE REMERA TIENE UN CONSTRUCTOR VACÍO
		
	}
		
	public Stock(double precio, int talle) {
		super(precio,talle);
	}
		
	public int[] contarRemerasPorTalle(Remera[] remeras, double precioDesde, double precioHasta) {
		for (int i = 0; i < remeras.length; i++) {
			if (remeras[i].obtenerPrecio()>=precioDesde && remeras[i].obtenerPrecio()<=precioHasta) { // CONDICIÓN
				this.cantidadPorTalle[remeras[i].obtenerTalle()]+=1; // TALLE I TIENE UNA REMERA MÁS
			}
		}
		for (int i = 0; i < cantidadPorTalle.length; i++) {
			System.out.println("Talle "+i+": "+cantidadPorTalle[i]+" remeras"); // PARA MOSTRAR EL ARREGLO POR PANTALLA
		}
		return cantidadPorTalle;
	 }
	
	// MAIN
	 public static void main(String[] args) {
		 remeras[0]= new Remera (300, 1);
    	 remeras[1]= new Remera (450, 1);
    	 remeras[2]= new Remera (250, 2);
    	 remeras[3]= new Remera (400, 1);	
		 Stock obj = new Stock();
		 obj.contarRemerasPorTalle(remeras, 350, 800); 
	   } 
}
