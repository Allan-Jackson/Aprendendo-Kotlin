import javax.crypto.spec.PSource;

public class TesteEnum {

    public static void main(String[] args) {

       Mes mes = Mes.JANEIRO;
       System.out.println(mes); //o metodo toString do Enum retorna o nome da constante
        //msm que: sout(Mes.ABRIL.name())

        //Mes mes2 = Mes.valueOf("ABRIL");
        /* ENHANCED-FOR
        for(Mes mes : Mes.values()){
            System.out.println(mes);
        } */

        //System.out.println(Mes.valueOf("ABRIL"));
        //System.out.println(Mes.ABRIL.feriado);
        //System.out.println(Mes.ABRIL.numeral);

        Periodo p = Periodo.DIURNO;

        System.out.println(Periodo.DIURNO.getId());

        System.out.println(Prioridade.ALTA);
        System.out.println(Prioridade.BAIXA);
    }
}
