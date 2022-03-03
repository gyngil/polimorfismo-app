package br.edu.pucgoias.polimorfismo;

public class Quadrado implements Forma{
    @Override
    public void desenhar() {
        System.out.println("Desenhar " + getClass());
    }

    @Override
    public void mover() {
        System.out.println("mover " + getClass());
    }

    @Override
    public void aumentar() {
        System.out.println("aumentar " + getClass());
    }

    @Override
    public void girar() {
        System.out.println("girar " + getClass());
    }
}
