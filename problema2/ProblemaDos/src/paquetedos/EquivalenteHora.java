package paquetedos;

public class EquivalenteHora {

    private double horas,
            minutos,
            segundos,
            dias;

    public void establecerHoras(double h) {
        horas = h;
    }

    public void calcularMinutos() {
        minutos = horas * 60;
    }

    public void calcularSegundos() {
        segundos = horas * 3600;
    }

    public void calcularDias() {
        dias = horas / 24;
    }

    public double obtenerHoras() {
        return horas;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerSegundos() {
        return segundos;
    }

    public double obtenerDias() {
        return dias;
    }

}

// @cbhas
