package paqueteuno;

import paquetedos.DispositivosElectronicos;

public class Ejecutor {

    public static void main(String[] args) {
        DispositivosElectronicos dE1 = new DispositivosElectronicos();
        DispositivosElectronicos dE2 = new DispositivosElectronicos();

        String sO1 = "Android",
                mac1 = "00-1B-77-70-32",
                imei1 = "862139812998231",
                sO2 = "IOS",
                mac2 = "00-1C-88-80-42",
                imei2 = "654321812998231";

        double tamanio1 = 7,
                costoI1 = 324,
                tamanio2 = 6,
                costoI2 = 312;

        int iva = 12;

        dE1.establecerSOperativo(sO1);
        dE1.establecerTPantalla(tamanio1);
        dE1.establecerCInicial(costoI1);
        dE1.establecerIva(iva);
        dE1.establecerMac(mac1);
        dE1.establecerImei(imei1);
        
        dE2.establecerSOperativo(sO2);
        dE2.establecerTPantalla(tamanio2);
        dE2.establecerCInicial(costoI2);
        dE2.establecerIva(iva);
        dE2.establecerMac(mac2);
        dE2.establecerImei(imei2);

        dE1.calcularCIInicial();
        dE1.calcularCFinal();
        dE2.calcularCIInicial();
        dE2.calcularCFinal();

        System.out.printf("""
                          Sistema Operativo: %s
                          Tamanio de Pantalla: %.2f pulgadas
                          Información MAC: %s
                          Información IMEI: %s
                          Costo Inicial: %.2f
                          IVA: %d
                          IVA del Costo Inicial: %.2f
                          Costo Final: %.2f
                          """,
                dE1.obtenerSOperativo(),
                dE1.obtenerTPantalla(),
                dE1.obtenerMac(),
                dE1.obtenerImei(),
                dE1.obtenerCInicial(),
                dE1.obtenerIva(),
                dE1.obtenerCIInicial(),
                dE1.obtenerCFinal());
        
        System.out.println("-------------------------------------");
        
        System.out.printf("""
                          Sistema Operativo: %s
                          Tamanio de Pantalla: %.2f pulgadas
                          Información MAC: %s
                          Información IMEI: %s
                          Costo Inicial: %.2f
                          IVA: %d
                          IVA del Costo Inicial: %.2f
                          Costo Final: %.2f
                          """,
                dE2.obtenerSOperativo(),
                dE2.obtenerTPantalla(),
                dE2.obtenerMac(),
                dE2.obtenerImei(),
                dE2.obtenerCInicial(),
                dE2.obtenerIva(),
                dE2.obtenerCIInicial(),
                dE2.obtenerCFinal());
    }

}

// @cbhas
