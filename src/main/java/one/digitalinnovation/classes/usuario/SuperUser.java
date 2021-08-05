package one.digitalinnovation.classes.usuario;

public class SuperUser {
    private String login;
    private String senha;
    String nome;

    public SuperUser(final String login, final String senha){
        this.login = login;
        this.senha = senha;
    }

    public String getLogin(){
        return login;
    }

    protected String getSenha(){
        return senha;
    }

}
