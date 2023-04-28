package paquetedos;

public class DispositivosElectronicos {

    private String sisOperativo,
            mac,
            imei;

    private double tamPantalla,
            costoInicial,
            costoIInicial,
            costoFinal;

    private int iva;

    public void establecerSOperativo(String sO) {
        sisOperativo = sO;
    }

    public void establecerTPantalla(double tP) {
        tamPantalla = tP;
    }

    public void establecerCInicial(double cI) {
        costoInicial = cI;
    }

    public void establecerIva(int i) {
        iva = i;
    }

    public void calcularCIInicial() {
        costoIInicial = (costoInicial * iva) / 100;
    }

    public void calcularCFinal() {
        costoFinal = costoIInicial + costoInicial;
    }

    public void establecerMac(String m) {
        mac = m;
    }

    public void establecerImei(String i) {
        imei = i;
    }

    public String obtenerSOperativo() {
        return sisOperativo;
    }

    public double obtenerTPantalla() {
        return tamPantalla;
    }

    public double obtenerCInicial() {
        return costoInicial;
    }

    public int obtenerIva() {
        return iva;
    }

    public double obtenerCIInicial() {
        return costoIInicial;
    }

    public double obtenerCFinal() {
        return costoFinal;
    }

    public String obtenerMac() {
        return mac;
    }

    public String obtenerImei() {
        return imei;

    }
}

// @cbhas
