

public class Singleton{
    private static final Singleton INSTANCIA = new Singleton(); //instancia dentro da classe
    public static int x = 10;
    public int y = 5;

	public static Singleton getInstancia(){
        return Singleton.INSTANCIA;
    }

    private Singleton(){}
}


