package paquetedos;

import paqueteuno.Terreno;

public class Ejecutor {

    public static void main(String[] args) {
        Terreno vT1 = new Terreno();
        Terreno vT2 = new Terreno();

        double ancho1 = 20,
                largo1 = 100,
                vMCuadrado1 = 12,
                ancho2 = 30,
                largo2 = 110,
                vMCuadrado2 = 13;

        vT1.establecerAncho(ancho1);
        vT1.establecerLargo(largo1);
        vT1.establecerVMCuadrado(vMCuadrado1);
        
        vT2.establecerAncho(ancho2);
        vT2.establecerLargo(largo2);
        vT2.establecerVMCuadrado(vMCuadrado2);

        vT1.calcularArea();
        vT1.calcularCTerreno();
        vT2.calcularArea();
        vT2.calcularCTerreno();

        System.out.printf("""
                          Ancho Terreno: %.2f
                          Largo Terreno: %.2f
                          Valor del Metro Cuadrado: %.2f
                          
                          Area del Terreno: %.2f metros cuadrados
                            - El costo del terreno es de $ %.2f
                          """,
                vT1.obtenerAncho(),
                vT1.obtenerLargo(),
                vT1.obtenerVMCuadrado(),
                vT1.obtenerArea(),
                vT1.obtenerCTerreno());
        
        System.out.println("-------------------------------------");
        
        System.out.printf("""
                          Ancho Terreno: %.2f
                          Largo Terreno: %.2f
                          Valor del Metro Cuadrado: %.2f
                          
                          Area del Terreno: %.2f metros cuadrados
                            - El costo del terreno es de $ %.2f
                          """,
                vT2.obtenerAncho(),
                vT2.obtenerLargo(),
                vT2.obtenerVMCuadrado(),
                vT2.obtenerArea(),
                vT2.obtenerCTerreno());
    }

}

// @cbhas
