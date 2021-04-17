package webprog.oblig3;

public class Billetter {
    private static String film;
    private static String fornavn;
    private static String etternavn;
    private static String telefonnr;
    private static String epost;
    private static int antall;

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

    public static String getFilm(){
        return film;
    }

    public void setFilm(String film){
        this.film = film;
    }

    public static String getFornavn(){
        return fornavn;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public static String getEtternavn(){
        return etternavn;
    }

    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public static String getTelefonnr(){
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }

    public static String getEpost(){
        return epost;
    }

    public void setEpost(String epost){
        this.epost = epost;
    }

    public static int getAntall(){
        return antall;
    }
    public void setAntall(int antall){
        this.antall = antall;
    }
}
