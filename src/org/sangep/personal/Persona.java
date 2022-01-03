package org.sangep.personal;

public class Persona {

    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String dirección;

    public  Persona(){

    }

    public Persona(String nombre, String apellido, String numeroFiscal, String dirección){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.dirección = dirección;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getNumeroFiscal(){
        return numeroFiscal;
    }

    public String getDirección(){
        return dirección;
    }

    @Override
    public  String toString(){
        return  "Numero Fiscal: " + numeroFiscal + "\nNombre: " + nombre +
                " " + apellido + "\nDirección: " + dirección;
    }

}
