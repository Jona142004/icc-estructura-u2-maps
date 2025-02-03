import java.util.Arrays;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();
        
        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
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
        System.out.println("Pruebas de Anagramas:");
        System.out.println("listen & silent -> " + Ejercicios.areAnagrams("listen", "silent")); // true
        System.out.println("hello & bello -> " + Ejercicios.areAnagrams("hello", "bello")); // false
        System.out.println("triangle & integral -> " + Ejercicios.areAnagrams("triangle", "integral")); // true
    Ejercicios ejercicios = new Ejercicios();

        int[] nums1 = {9, 2, 3, 6};
        int objetivo1 = 5;
        System.out.println("\nSuma de dos:");
        System.out.println("nums = [9,2,3,6], objetivo = 5 -> " + Arrays.toString(ejercicios.sumatoriaDeDos(nums1, objetivo1))); // [1,2]

        int[] nums2 = {9, 2, 3, 6};
        int objetivo2 = 10;
        System.out.println("nums = [9,2,3,6], objetivo = 10 -> " + Arrays.toString(ejercicios.sumatoriaDeDos(nums2, objetivo2)));

    }
}
