package Personaje;

public class Personaje {

    private String nombre;
    private String Descripcion;
    private Long tamaño;
    private int Poder;
    private int Vida;

    //Voids

    public void desplazarce(){
     return;
    }

    public int monstrarVida(){
        return Vida;
    }

    public int mostrarPoder(){
        return Poder;
    }
}
