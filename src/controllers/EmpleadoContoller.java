package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados = new HashMap<>();

    public EmpleadoContoller() {
        this.empleados = new HashMap<>();
    }
    public boolean addEmpleado(Empleado empleado){
        if(empleados.containsKey(empleado.getId())){
            return false;
        }
        empleados.put(empleado.getId(), empleado);
        return true;
    }
    public Empleado getEmpleado(int id){
        return empleados.get(id);
    }
    public void displayEmpleados(){
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " -" + empleadoEntry.getValue());
        }
        
        
    }  
    public void displayEmpleadosSoloNombres(){
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getValue().getName());
        }
    } 
    public void displayLlaves(){
        for(Integer key : empleados.keySet()){
            System.out.println(key);
        }
    }
    public void displayEmpleadossinEntry(){
        for(Empleado empleado : empleados.values()){
            System.out.println(empleado);
        }
    }
}