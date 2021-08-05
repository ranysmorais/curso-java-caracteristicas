package one.digitalinnovation.interfaces;

public class Program {
    public static void main(String[] args) {
        final Carro gol = new Gol();
        System.out.println("Marca Gol: "+gol.marca());
        gol.ligar();

        final Trator trator = new Trator();
        System.out.println("Registro do Trator: "+trator.registro());
        trator.ligar();
        trator.desligar();

        final Fiesta fiesta = new Fiesta();
        System.out.println("Marca Fiesta: "+fiesta.marca()+
                "\n"+"Registro do Fiesta: "+fiesta.registro());
        fiesta.ligar();
    }
}
