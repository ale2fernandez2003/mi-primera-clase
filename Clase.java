
public class Clase {

    private String nombreClase;
    private int numeroAsientos;
    private boolean estarOcupada;
    
    public Clase (String nombreDeClase, int numeroDeAsientos) {
        nombreClase = nombreDeClase;
        numeroAsientos = numeroDeAsientos;
        estarOcupada = true;
    }
    
    public String getnombreClase () {
        return nombreClase;    
    }
    
    public void setnombreClase (String nombreDeLaClase) {
        nombreClase = nombreDeLaClase;
    }
    
    public int getnumeroAsientos () {
        return numeroAsientos;
    }
    
    public void setasientosNuevosAñadidos (int nuevosAsientos) {
        numeroAsientos = numeroAsientos + nuevosAsientos;
    }
    
    public boolean getestarOcupada (){
        return estarOcupada;
    }
    
    public void setestarOcupada (){
        estarOcupada = !estarOcupada;
    }
    
    public void imprimirDetalles () { 
        System.out.println ("Nombre clase: "+(nombreClase)+" / Numero de asientos: "+(numeroAsientos)+" / Ocupada: "+(estarOcupada)+".");
    }
    
    public String devolverTodo (){
        String detalles = "";
        detalles = "Nombre clase: "+(nombreClase)+" / Numero de asientos: "+(numeroAsientos)+" / Ocupada: "+(estarOcupada)+".";
        return detalles;
    }
}
