import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();
        
        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();
        boolean result = empleadoContoller.addEmpleado(new Empleado(1, "Juan",  "Senior"));
        System.out.println("Empleado agregado: " + result);
        result = empleadoContoller.addEmpleado(new Empleado(1, "Juan",  "Senior"));
        empleadoContoller.addEmpleado(new Empleado(1, "Pablo",  "Senior"));
        empleadoContoller.addEmpleado(new Empleado(2, "Juan",  "Senior"));
        empleadoContoller.addEmpleado(new Empleado(3, "Andres",  "Senior"));
        System.out.println("Empleado agregado: " + result);

        empleadoContoller.displayEmpleados();
        empleadoContoller.displayEmpleadosSoloNombres();
        empleadoContoller.displayLlaves();
        empleadoContoller.displayEmpleadossinEntry();
    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
