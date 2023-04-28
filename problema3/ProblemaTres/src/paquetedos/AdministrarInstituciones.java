package paquetedos;

public class AdministrarInstituciones {

    private String nombre;
    private String tipoIns;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastoEstudiante;
    private double presupuesto;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTInstitucion(String tI) {
        tipoIns = tI;
    }

    public void establecerNAlumnos(int nA) {
        numAlumnos = nA;
    }

    public void establecerNDocentes(int nD) {
        numDocentes = nD;
    }

    public void establecerNSedes(int nS) {
        numSedes = nS;
    }

    public void establecerGEstudiante(double gE) {
        gastoEstudiante = gE;
    }

    public void calcularPresupuesto() {
        presupuesto = numAlumnos * gastoEstudiante;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTInstitucion() {
        return tipoIns;
    }

    public int obtenerNAlumnos() {
        return numAlumnos;
    }

    public int obtenerNDocentes() {
        return numDocentes;
    }

    public int obtenerNSedes() {
        return numSedes;
    }

    public double obtenerGEstudiante() {
        return gastoEstudiante;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

}
