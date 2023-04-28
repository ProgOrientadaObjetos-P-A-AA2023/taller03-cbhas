package paquetedos;

import paqueteuno.Terreno;

public class Ejecutor {
    
    public static void main(String[] args) {
        Terreno vT = new Terreno();
        
        double ancho = 20,
                largo = 100,
                vMCuadrado = 12;
        
        vT.establecerAncho(ancho);
        vT.establecerLargo(largo);
        vT.establecerVMCuadrado(vMCuadrado);
        
        vT.calcularArea();
        vT.calcularCTerreno();
        
        System.out.printf("""
                          Ancho Terreno: %.2f
                          Largo Terreno: %.2f
                          Valor del Metro Cuadrado: %.2f
                          
                          Area del Terreno: %.2f metros cuadrados
                            - El costo del terreno es de $ %.2f
                          """, 
                vT.obtenerAncho(),
                vT.obtenerLargo(),
                vT.obtenerVMCuadrado(),
                vT.obtenerArea(),
                vT.obtenerCTerreno());
    }
    
}

// @cbhas