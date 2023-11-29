package model;

import java.util.ArrayList;
import java.util.List;

public class Dziecko {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int iloscNarkotykow;
    private List<Narkotyk> narkotyki;


    public Dziecko(String imie, String nazwisko, int wiek, int iloscNarkotyow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.iloscNarkotykow = iloscNarkotykow;
        this.narkotyki = new ArrayList<>();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getIloscNarkotykow() {
        return iloscNarkotykow;
    }

    public void setIloscNarkotyow(int iloscNarkotykow) {
        this.iloscNarkotykow = iloscNarkotykow;
    }

    @Override
    public String toString() {
        return "Dziecko{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", iloscNarkotykow=" + iloscNarkotykow +
                '}';
    }

    public void setIloscNarkotykow(int i) {
    }
}
