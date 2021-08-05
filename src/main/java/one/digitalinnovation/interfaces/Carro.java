package one.digitalinnovation.interfaces;

public interface Carro {

    String marca();

    default void ligar(){
        System.out.println("Ligando o Carro!");
    }

    default String codigoRenavan(){ return "65982411"; }
}
