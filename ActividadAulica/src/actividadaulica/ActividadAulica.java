
package actividadaulica;


public class ActividadAulica {

    public static void main(String[] args) {
        
        Baraja baj1 = new Baraja();
            
            baj1.crearBaraja();
            
            baj1.barajar();
            
            baj1.cartasDisponibles();
            
            baj1.siguienteCarta();
            baj1.siguienteCarta();
            
            System.out.println("Las cartas recibidas son: " + baj1.darCartas(38));
            
             baj1.cartasDisponibles();
            
             baj1.darCartas(3);
             
             baj1.cartasMontón();
        
    }

}
