package model;

import enums.Jakosc;
import exceptions.BadDrugQualityException;
import exceptions.NotEnoughIngredientsException;
import interfaces.DrugController;

import java.util.ArrayList;
import java.util.List;

public abstract class Narkotyk {

    private String nazwa;
    private double CENA_ZA_GRAM = 30;
    private double cenaZagram;
    private List<String> skladniki;
    private String rodzaj;
    private Jakosc jakosc;
    private DrugController drugController;
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
        this.dzieci = new ArrayList<>();
    }

    public void checkDrug() {
        drugController.checkDrug();
        if (jakosc.equals(Jakosc.ZLA)) {
            throw new BadDrugQualityException("Narkotyk ma zła jakość");
        } else {
            System.out.println("Dobry temacik ");
        }
    }

    public void wzrostCeny() {
        if (nazwa.equalsIgnoreCase("LSD") && skladniki.size() > 5) {
            CENA_ZA_GRAM += 60;
        }
        if (nazwa.equalsIgnoreCase("LSD") && skladniki.size() < 5) {
            CENA_ZA_GRAM += 30;
        }
        if (nazwa.equalsIgnoreCase("MDMA") && skladniki.size() > 4){
            CENA_ZA_GRAM += 30;
        }
        if (nazwa.equalsIgnoreCase("MDMA") && skladniki.size() < 4){
            CENA_ZA_GRAM += 20;
        }
        if (nazwa.equalsIgnoreCase("MDMA") && skladniki.size() > 4){
            CENA_ZA_GRAM += 30;
        }
        if (nazwa.equalsIgnoreCase("MDMA") && skladniki.size() < 4){
            CENA_ZA_GRAM += 20;

        }
        if (nazwa.equalsIgnoreCase("Mefedron") && skladniki.size() > 5){
            CENA_ZA_GRAM += 60;
        }
        if (nazwa.equalsIgnoreCase("Mefedron") && skladniki.size() < 5){
            CENA_ZA_GRAM += 40;
        }

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

    public void setDzieci(List<Dziecko> dzieci) {
        this.dzieci = dzieci;
    }

    public double getCENA_ZA_GRAM() {
        return CENA_ZA_GRAM;
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




