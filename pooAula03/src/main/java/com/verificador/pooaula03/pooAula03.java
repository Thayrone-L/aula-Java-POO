package com.verificador.pooaula03;

/**
 *
 * @author thayrone
 */
public class pooAula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
       // c1.tampada = false;
        c1.status();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();

    }

}
