package org.sangep.personal;

public class Empleado extends Persona{

    private double salario;
    private int empleadoID;
    private double remuneracion;

    public Empleado(){

    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String dirección,double salario, int empleadoID,double remuneracion){
        super(nombre, apellido, numeroFiscal, dirección);
        this.salario = salario;
        this.empleadoID = empleadoID;
        this.remuneracion = remuneracion;
    }

    public void setRemuneracion(double remuneracion){
        this.remuneracion = remuneracion;
    }

    public double aumentarRemuneracion(int porcentaje){
        return  remuneracion += remuneracion * porcentaje/100;
    }

    public double getSalario(){
        return  salario;
    }

    public int getEmpleadoID(){
        return empleadoID;
    }

    @Override
    public  String toString(){
        return "EmpleadoID: " + empleadoID + "\n" + "Salario: " + salario +
                "\n" + super.toString();
    }

}
