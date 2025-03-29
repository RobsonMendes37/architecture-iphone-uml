package AparelhoTelefonico;

import Iphone.Iphone;

public class AparelhoTelefonico extends Iphone implements IAparelhoTelefonico {

    @Override
    public void telefonar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Acessando correio de voz...");
    }
}
