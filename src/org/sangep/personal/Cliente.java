package org.sangep.personal;

public class Cliente extends Persona{

    int clienteID;

    public Cliente(){

    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String dirección,int clienteID){
        super(nombre, apellido, numeroFiscal, dirección);
        this.clienteID = clienteID;
    }

    public int getClienteID(){
        return clienteID;
    }

    @Override
    public  String toString(){
        return "ClienteID: " + clienteID + "\n" + super.toString();
    }


}
