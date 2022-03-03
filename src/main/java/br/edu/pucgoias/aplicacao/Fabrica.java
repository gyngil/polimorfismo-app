package br.edu.pucgoias.aplicacao;

import br.edu.pucgoias.polimorfismo.Cilindro;
import br.edu.pucgoias.polimorfismo.Cubo;
import br.edu.pucgoias.polimorfismo.Forma;
import br.edu.pucgoias.polimorfismo.Piramide;

public class Fabrica {

    public static Forma getCilindro(){
        return new Cilindro();
    }

    public static Forma getCubo(){
        return new Cubo();
    }

    public static Forma getPiramide(){
        return new Piramide();
    }

}
