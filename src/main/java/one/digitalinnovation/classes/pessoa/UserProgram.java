package one.digitalinnovation.classes.pessoa;

import one.digitalinnovation.classes.usuario.SuperUser;

public class UserProgram {
    public static void amin(String[] args){
        final var batman = new SuperUser("batman", "12@#$%");

        batman.getLogin();
    }
}
