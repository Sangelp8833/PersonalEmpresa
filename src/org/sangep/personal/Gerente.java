package org.sangep.personal;

public class Gerente extends Empleado{

    private double preosupuesto;

    public Gerente(){

    }

    public  Gerente(String nombre, String apellido, String numeroFiscal, String dirección,double salario, int empleadoID, double remuneracion, double presupuesto){
        super(nombre,apellido,numeroFiscal,dirección,salario,empleadoID,remuneracion);
        this.preosupuesto = presupuesto;
    }

    public double getPreosupuesto(){
        return preosupuesto;
    }

    public void setPreosupuesto(double preosupuestos){
        this.preosupuesto = preosupuestos;
    }

    @Override
    public  String toString(){
        return "Presupuesto: " + preosupuesto + "\n" + super.toString();
    }
}
