package one.digitalinnovation.classes.Cliente;

public class ClienteProgram {
    public static void main(String[] args) {
        final var cliente = new Cliente(27);

        cliente.getIdade();

        System.out.println(cliente.getIdade());
    }
}
