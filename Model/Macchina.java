public class Macchina {

    private String marca;
    private String modello;
    private String colore;
    private String matricola;
    private String targa;
    private int anno_produzione;

    public Macchina(String marca, String modello, String colore, String matricola, String targa, int anno_produzione) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.matricola = matricola;
        this.targa = targa;
        this.anno_produzione = anno_produzione;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getAnno_produzione() {
        return anno_produzione;
    }

    public void setAnno_produzione(int anno_produzione) {
        this.anno_produzione = anno_produzione;
    }
}