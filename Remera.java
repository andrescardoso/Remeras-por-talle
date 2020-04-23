package Ejercicio1;

public class Remera {

	 private double precio;
	 private int talle;
	
	 public Remera() {
		 
	 }
	 
     public Remera(double precio, int talle) {
    	 this.setPrecio(precio);
    	 this.setTalle(talle);
     }

     // SETTERS & GETTERS
     public void setPrecio(double precio) {
    	 this.precio=precio;
     }
     public void setTalle(int talle) {
    	 this.talle=talle;
     }
     public double obtenerPrecio() {
    	 return precio;
     }
     public int obtenerTalle() {
    	 return talle;
     } 
}

