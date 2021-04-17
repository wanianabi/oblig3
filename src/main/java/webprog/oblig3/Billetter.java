package webprog.oblig3;

public class Billetter {
    private String film;
    private String fornavn;
    private String etternavn;
    private String telefonnr;
    private String epost;
    private int antall;

    public Billetter(String film, String fornavn, String etternavn, String telefonnr, String epost, int antall){
        this.film = film;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
        this.antall = antall;
    }

    public Billetter (){
    }

    public String getFilm(){
        return film;
    }

    public void setFilm(String film){
        this.film = film;
    }

    public String getFornavn(){
        return fornavn;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public String getTelefonnr(){
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }

    public String getEpost(){
        return epost;
    }

    public void setEpost(String epost){
        this.epost = epost;
    }

    public int getAntall(){
        return antall;
    }

    public void setAntall(int antall){
        this.antall = antall;
    }
}
