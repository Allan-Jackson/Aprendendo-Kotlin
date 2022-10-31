package implementingtwointerfaceswithmethods;

/*default é um modificador menos restritivo que o private
ele que permite a interface cria um 'extension method':
um método com uma implementação padrão definida na interface*/

public interface One {
    default void method(){
        System.out.println("Implementação padrão na interface 1");
    }
}
