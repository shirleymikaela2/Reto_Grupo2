
package reto;

public class NodoEstudiante {

    private Estudiante dato;
    private NodoEstudiante izquierdo;
    private NodoEstudiante derecho;

    public NodoEstudiante(Estudiante dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Estudiante getDato() {
        return dato;
    }

    public void setDato(Estudiante dato) {
        this.dato = dato;
    }

    public NodoEstudiante getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoEstudiante izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoEstudiante getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoEstudiante derecho) {
        this.derecho = derecho;
    }
}
