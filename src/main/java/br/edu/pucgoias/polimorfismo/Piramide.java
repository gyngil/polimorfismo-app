package br.edu.pucgoias.polimorfismo;

public class Piramide implements Forma {

    public void desenhar() {
        System.out.println("Desenhar " + getClass());
    }

    public void mover() {
        System.out.println("Mover " + getClass());
    }

    public void aumentar() {
        System.out.println("Aumentar " + getClass());
    }

    public void girar() {
        System.out.println("Girar " + getClass());
    }

}
