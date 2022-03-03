package br.edu.pucgoias.aplicacao;

import br.edu.pucgoias.polimorfismo.PainelDesenho;

public class App {

    public static void main(String[] args) {

        PainelDesenho painelDesenho = new PainelDesenho();

        painelDesenho.aumentar(Fabrica.getCubo());

        painelDesenho.girar(Fabrica.getCubo());

    }

}
