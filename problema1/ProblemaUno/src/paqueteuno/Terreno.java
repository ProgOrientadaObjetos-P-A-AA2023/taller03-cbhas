package paqueteuno;

public class Terreno {

    private double costoTerreno,
            ancho,
            largo,
            area,
            valorMCuadrado;

    public void calcularCTerreno() {
        costoTerreno = valorMCuadrado * area;
    }

    public void establecerAncho(double an) {
        ancho = an;
    }

    public void establecerLargo(double l) {
        largo = l;
    }

    public void calcularArea() {
        area = ancho * largo;
    }

    public void establecerVMCuadrado(double vMC) {
        valorMCuadrado = vMC;
    }

    public double obtenerCTerreno() {
        return costoTerreno;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerVMCuadrado() {
        return valorMCuadrado;
    }
}

// @cbhas
