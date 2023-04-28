package paqueteuno;

import paquetedos.DispositivosElectronicos;

public class Ejecutor {

    public static void main(String[] args) {
        DispositivosElectronicos dE = new DispositivosElectronicos();

        String sO = "Android",
                mac = "00-1B-77-70-32",
                imei = "862139812998231";

        double tamanio = 7,
                costoI = 324;

        int iva = 12;

        dE.establecerSOperativo(sO);
        dE.establecerTPantalla(tamanio);
        dE.establecerCInicial(costoI);
        dE.establecerIva(iva);
        dE.establecerMac(mac);
        dE.establecerImei(imei);

        dE.calcularCIInicial();
        dE.calcularCFinal();

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
                dE.obtenerSOperativo(),
                dE.obtenerTPantalla(),
                dE.obtenerMac(),
                dE.obtenerImei(),
                dE.obtenerCInicial(),
                dE.obtenerIva(),
                dE.obtenerCIInicial(),
                dE.obtenerCFinal());
    }

}

// @cbhas
