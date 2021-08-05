package one.digitalinnovation.enums;

public enum Status {
    OPEN(13, "aberto"),CLOSE(02,"Fechado");
    private int cod;
    private String text;
    Status(final int cod, final String text){
        this.cod = cod;
        this.text = text;
    }
    public int getCod() { return cod; }
    public String getText() { return text; }
}
