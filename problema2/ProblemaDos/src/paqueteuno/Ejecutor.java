package paqueteuno;

import paquetedos.EquivalenteHora;

public class Ejecutor {

    public static void main(String[] args) {
        EquivalenteHora eH1= new EquivalenteHora();
        EquivalenteHora eH2= new EquivalenteHora();

        double horas1 = 13,
                horas2 = 90;

        eH1.establecerHoras(horas1);
        eH2.establecerHoras(horas2);

        eH1.calcularMinutos();
        eH1.calcularSegundos();
        eH1.calcularDias();
        eH1.establecerHoras(horas1);
        
        eH2.calcularMinutos();
        eH2.calcularSegundos();
        eH2.calcularDias();
        eH2.establecerHoras(horas2);

        System.out.printf("""
                         %.1f Horas 
                         %.0f Minutos 
                         %.0f Segundos
                         %.2f Dias
                         """,
                eH1.obtenerHoras(),
                eH1.obtenerMinutos(),
                eH1.obtenerSegundos(),
                eH1.obtenerDias());
        
        System.out.println("----------------------------");
        
        System.out.printf("""
                         %.1f Horas 
                         %.0f Minutos 
                         %.0f Segundos
                         %.2f Dias
                         """,
                eH2.obtenerHoras(),
                eH2.obtenerMinutos(),
                eH2.obtenerSegundos(),
                eH2.obtenerDias());
    }

}

// @cbhas
