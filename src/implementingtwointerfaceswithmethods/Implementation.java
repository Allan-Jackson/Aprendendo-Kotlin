package implementingtwointerfaceswithmethods;

/*Teste Java implementando mais de uma interface quando
as duas possuem metodos iguais com implementação padrão
e chamando o método padrão de uma delas*/


public class Implementation implements One, Two{

    //Como o método é o mesmo nas duas interfaces, ele obrigatoriamente precisa ser sobreescrito
    @Override
    public void method(){
        //para fazer a chamada de um 'extension method' de uma interface determinada
        //é necessário passar o nome da interface antes do 'super'
        One.super.method();
    }

}
