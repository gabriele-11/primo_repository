public class Persona {

    private String nome;
    private String Cognome;
    private int eta;

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        Cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}