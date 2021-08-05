package one.digitalinnovation.interfaces;

public interface Veiculo {
    default void ligar(){ System.out.println("Ligando o Veiculo!");}

    default void desligar() {System.out.println("Desligando o Veiculo!");}

    String registro();
}
