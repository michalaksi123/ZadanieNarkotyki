package model;

import enums.Jakosc;
import exceptions.BadDrugQualityException;
import exceptions.NotEnoughIngredientsException;
import interfaces.DrugController;

import java.util.ArrayList;
import java.util.List;

public abstract class Narkotyk {

    private String nazwa;
    private double cenaZagram;
    private List<String> skladniki;
    private String rodzaj;
    private Jakosc jakosc;
    private List<Dziecko> dzieci = new ArrayList<>();

    public Narkotyk(String nazwa, double cenaZagram, List<String> skladniki, String rodzaj, Jakosc jakosc) {
        if (skladniki.size() < 3) {
            throw new NotEnoughIngredientsException("Narkotyk musi mieć conajmniej 3 składniki!");
        }
        this.nazwa = nazwa;
        this.cenaZagram = cenaZagram;
        this.skladniki = skladniki;
        this.rodzaj = rodzaj;
        this.jakosc = jakosc;
    }




public String getNazwa() {
        return nazwa;
        }

public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
        }

public double getCenaZagram() {
        return cenaZagram;
        }

public void setCenaZagram(double cenaZagram) {
        this.cenaZagram = cenaZagram;
        }

public List<String> getSkladniki() {
        return skladniki;
        }

public void setSkladniki(List<String> skladniki) {
        this.skladniki = skladniki;
        }

public String getRodzaj() {
        return rodzaj;
        }

public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
        }

public Jakosc getJakosc() {
        return jakosc;
        }

public void setJakosc(Jakosc jakosc) {
        this.jakosc = jakosc;
        }

public List<Dziecko> getDzieci() {
        return dzieci;
        }


@Override
    public String toString() {
        return "Narkotyk{" +
                "nazwa='" + nazwa + '\'' +
                ", cenaZagram=" + cenaZagram +
                ", skladniki=" + skladniki +
                ", rodzaj='" + rodzaj + '\'' +
                ", jakosc='" + jakosc + '\'' +
                '}';
    }}




