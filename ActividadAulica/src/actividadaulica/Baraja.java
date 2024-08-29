package actividadaulica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Baraja {

    private ArrayList <Cartas> barajaCartas = new ArrayList();   //Acá guardo las cartas
    private String [] palos =  {"Oro", "Copa", "espada", "baston"};
    
     private ArrayList <Cartas> CartasEntregadas = new ArrayList(); //Sirve para guardar las cartas que ya han sido entregadas (se usa en el método cartas montón)

    //Esto es para poder instanciarlo 
    public Baraja() {
    }
    
   //Métodos adicionales 
    public void crearBaraja(){
        
        int i = 0; 
        
for (String palo : palos) {
    for (int num = 1; num <= 12; num++) {
        if (num == 8 || num == 9) {
            continue;  
        }
        barajaCartas.add(new Cartas(num, palo));
        i++;
    }
}
        System.out.println("La baraja ha sido creada");
    } 
    
    public void barajar(){
        Collections.shuffle(barajaCartas);

        System.out.println("");
        System.out.println("Las cartas han sido barajadas ");
    
        for (Cartas barajaCarta : barajaCartas) {
            System.out.println(barajaCarta);
        }
        
    }    
    
    public void siguienteCarta(){ 
        
        if (!barajaCartas.isEmpty()) {
            
            System.out.println(barajaCartas.remove(0)); 
            
        }else{
            System.out.println("No hay más cartas");
        }
    }
    
    public void cartasDisponibles(){
        
        System.out.println("");
       
        if (!barajaCartas.isEmpty() ) {
            
            if (barajaCartas.size() > 2) {                      //Esto lo pongo para que quede más presentable. 
            System.out.println("Queda un total de: " + barajaCartas.size() + " cartas" );        
            }else{
                System.out.println("Queda una sola carta");
            }
            
        }else{
            
            System.out.println("Se acabaron las cartas");
            
        }
    }  
    
    public List <Cartas> darCartas(int cantCartas){
        
        List <Cartas> darCartas = new ArrayList();       //Con este ArrayList entrego las cantidad de cartas que me piden. 
        
        if (barajaCartas.size()  >= cantCartas) {            //Acá quiere decir "si hay cartas entregar la cantidad que nos piden"
            
            for (int i = 0; i < cantCartas ; i++) {
                darCartas.add(barajaCartas.remove(0));  //Cuándo pongo 0 elimino el primer índice del ArrayList, y los restantes elementos se corren un lugar hacia la izquierda para ocupar ese lugar que quedó vacío
                CartasEntregadas.add(darCartas.get(i));
            }
          
            
            return darCartas;
          
        }else{
            System.out.println("");
            System.out.println("No hay cartas suficientes");
        }
        return null; 
    } 
    
    public void cartasMontón(){  
        
        System.out.println("");
        System.out.println("Las cartas que han salido son: ");
        
         for (Cartas CartasEntregada : CartasEntregadas) {
             System.out.println(CartasEntregada);
        }
        
    }
    
    public void mostrarBaraja(){
        
        System.out.println("");
        System.out.println("Las cartas disponibles son: ");
        for (Cartas barajaCarta : barajaCartas) {
            System.out.println(barajaCarta);
        }
        
    } 
    
}
