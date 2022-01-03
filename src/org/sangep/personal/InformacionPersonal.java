package org.sangep.personal;

public class InformacionPersonal {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Samuel", "Angel","1036664325","sasfasff",30000,123,30000,57000);
        gerente.aumentarRemuneracion(15);
        gerente.setPreosupuesto(77000.00);
        System.out.println(gerente);
    }
}
