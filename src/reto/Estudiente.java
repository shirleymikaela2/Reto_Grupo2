
package reto;

public class Estudiante {

    private int matricula;
    private String cedula;
    private String nombres;
    private double promedio;

    public Estudiante(int matricula, String cedula,
                      String nombres, double promedio) {
        this.matricula = matricula;
        this.cedula = cedula;
        this.nombres = nombres;
        this.promedio = promedio;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula
                + " | Nombre: " + nombres
                + " | Cedula: " + cedula
                + " | Promedio: " + promedio;
    }
}
