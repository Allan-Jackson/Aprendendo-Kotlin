package javapolimorfismo;

public interface Funcionario {
    Float taxaBonus = 10f; //msm que: 'public static final taxaBonus'

    default void baterPonto(int horario) { //msm que: 'public default int metodo1'
        System.out.println("O ponto foi assinado às " + horario + "h");
    }
}
