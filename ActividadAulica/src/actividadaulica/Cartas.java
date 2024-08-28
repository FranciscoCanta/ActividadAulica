package actividadaulica;


public class Cartas {

     //Atributos
    private int numero;
    private String palo; 

    //Constructor
    public Cartas(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    //Getters
    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
    
}
