package paquetedos;

public class AdministrarInstituciones {

    private String nombre,
            tipoIns;

    private int numAlumnos,
            numDocentes,
            numSedes;

    private double gastoEstudiante,
            presupuesto;

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

// @cbhas
