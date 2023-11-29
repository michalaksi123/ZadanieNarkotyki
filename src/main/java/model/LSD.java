package model;

import enums.Jakosc;

import java.util.List;
import java.util.Objects;

public class LSD extends Narkotyk {


    private int licznikSmokow;
    public LSD(String nazwa, double cenaZagram, List<String> skladniki, String rodzaj, Jakosc jakosc) {
        super(nazwa, cenaZagram, skladniki, rodzaj, jakosc);
        this.licznikSmokow = licznikSmokow;
    }

    public int getLicznikSmokow() {
        return licznikSmokow;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LSD lsd = (LSD) o;
        return licznikSmokow == lsd.licznikSmokow;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), licznikSmokow);
    }

    @Override
    public String toString() {
        return "LSD{" +
                "licznikSmokow=" + licznikSmokow +
                '}';
    }
}
