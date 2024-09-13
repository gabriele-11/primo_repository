public class Alunno {

    private String nome;
    private Sring cognome;
    private String nome_scuola;
    private String classe;
    private Date data_nascita;

    public Alunno(String nome, Sring cognome, String nome_scuola, String classe, Date data_nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.nome_scuola = nome_scuola;
        this.classe = classe;
        this.data_nascita = data_nascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sring getCognome() {
        return cognome;
    }

    public void setCognome(Sring cognome) {
        this.cognome = cognome;
    }

    public String getNome_scuola() {
        return nome_scuola;
    }

    public void setNome_scuola(String nome_scuola) {
        this.nome_scuola = nome_scuola;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Date getData_nascita() {
        return data_nascita;
    }

    public void setData_nascita(Date data_nascita) {
        this.data_nascita = data_nascita;
    }
}