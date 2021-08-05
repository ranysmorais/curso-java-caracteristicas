package one.digitalinnovation.classes.usuario;

public class SuperUserProgram {
    public static void  main(String[] args){
        final var superUser = new SuperUser("root", "1234");

        superUser.getLogin();
        superUser.getSenha();
        String root = superUser.nome;
    }

}
