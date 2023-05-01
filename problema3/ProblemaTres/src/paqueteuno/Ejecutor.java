package paqueteuno;

import paquetedos.AdministrarInstituciones;

public class Ejecutor {

    public static void main(String[] args) {
        AdministrarInstituciones aI = new AdministrarInstituciones();

        String nombre = "Calasanz",
                tipoIns = "Fiscomisional";

        int numAlumnos = 450,
                numDocentes = 50,
                numSedes = 10;

        double gastoEstudiante = 48;

        aI.establecerNombre(nombre);
        aI.establecerTInstitucion(tipoIns);
        aI.establecerNAlumnos(numAlumnos);
        aI.establecerNDocentes(numDocentes);
        aI.establecerNSedes(numSedes);
        aI.establecerGEstudiante(gastoEstudiante);

        aI.calcularPresupuesto();

        System.out.printf("""
                          Nombre: %s
                          Tipo de Institución: %s
                          Número de Alumnos: %d
                          Número de Docentes: %d
                          Número de Sedes: %d
                          Gastos por Estudiante: %.2f
                          Presupuesto: %.2f
                          """,
                aI.obtenerNombre(),
                aI.obtenerTInstitucion(),
                aI.obtenerNAlumnos(),
                aI.obtenerNDocentes(),
                aI.obtenerNSedes(),
                aI.obtenerGEstudiante(),
                aI.obtenerPresupuesto());

    }

}

// @cbhas
