package paqueteuno;

import paquetedos.AdministrarInstituciones;

public class Ejecutor {

    public static void main(String[] args) {
        AdministrarInstituciones aI1 = new AdministrarInstituciones();
        AdministrarInstituciones aI2 = new AdministrarInstituciones();

        String nombre1 = "Unidad Educativa Fiscomisional Calasanz",
                tipoIns1 = "Fiscomisional",
                nombre2 = "Antonio Peña Celi",
                tipoIns2 = "Privado";

        int numAlumnos1 = 450,
                numDocentes1 = 50,
                numSedes1 = 10,
                numAlumnos2 = 1020,
                numDocentes2 = 70,
                numSedes2 = 7;

        double gastoEstudiante1 = 48,
                gastoEstudiante2 = 145;

        aI1.establecerNombre(nombre1);
        aI1.establecerTInstitucion(tipoIns1);
        aI1.establecerNAlumnos(numAlumnos1);
        aI1.establecerNDocentes(numDocentes1);
        aI1.establecerNSedes(numSedes1);
        aI1.establecerGEstudiante(gastoEstudiante1);

        aI2.establecerNombre(nombre2);
        aI2.establecerTInstitucion(tipoIns2);
        aI2.establecerNAlumnos(numAlumnos2);
        aI2.establecerNDocentes(numDocentes2);
        aI2.establecerNSedes(numSedes2);
        aI2.establecerGEstudiante(gastoEstudiante2);

        aI1.calcularPresupuesto();
        aI2.calcularPresupuesto();

        System.out.printf("""
                          Nombre: %s
                          Tipo de Institución: %s
                          Número de Alumnos: %d
                          Número de Docentes: %d
                          Número de Sedes: %d
                          Gastos por Estudiante: %.2f
                          Presupuesto: %.2f
                          """,
                aI1.obtenerNombre(),
                aI1.obtenerTInstitucion(),
                aI1.obtenerNAlumnos(),
                aI1.obtenerNDocentes(),
                aI1.obtenerNSedes(),
                aI1.obtenerGEstudiante(),
                aI1.obtenerPresupuesto());

        System.out.println("-----------------------------------------------");

        System.out.printf("""
                          Nombre: %s
                          Tipo de Institución: %s
                          Número de Alumnos: %d
                          Número de Docentes: %d
                          Número de Sedes: %d
                          Gastos por Estudiante: %.2f
                          Presupuesto: %.2f
                          """,
                aI2.obtenerNombre(),
                aI2.obtenerTInstitucion(),
                aI2.obtenerNAlumnos(),
                aI2.obtenerNDocentes(),
                aI2.obtenerNSedes(),
                aI2.obtenerGEstudiante(),
                aI2.obtenerPresupuesto());

    }

}

// @cbhas
