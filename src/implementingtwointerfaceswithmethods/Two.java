package implementingtwointerfaceswithmethods;

/*Para permitir o método ser implementado direto
na interface, a palavra-chave 'default' é obrigatória
configurando esse metodo como um 'extension method'*/

public interface Two {
    default void method(){
        System.out.println("Implementação padrão na interface 2");
    }
}
