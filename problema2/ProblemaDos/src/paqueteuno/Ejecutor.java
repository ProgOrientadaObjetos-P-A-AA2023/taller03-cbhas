package paqueteuno;

import paquetedos.EquivalenteHora;

public class Ejecutor {

    public static void main(String[] args) {
        EquivalenteHora eH = new EquivalenteHora();

        double horas = 13;

        eH.establecerHoras(horas);

        eH.calcularMinutos();
        eH.calcularSegundos();
        eH.calcularDias();
        eH.establecerHoras(horas);

        System.out.printf("""
                         Horas: %.1f
                         Minutos: %.0f
                         Segundos: %.0f
                         Dias: %.2f
                         """,
                eH.obtenerHoras(),
                eH.obtenerMinutos(),
                eH.obtenerSegundos(),
                eH.obtenerDias());
    }

}

// @cbhas
