package model;

import enums.Jakosc;

import java.util.List;
import java.util.Objects;

public class MDMA extends Narkotyk{

    private String dlugoscFazy;
    public MDMA(String nazwa, double cenaZagram, List<String> skladniki, String rodzaj, Jakosc jakosc) {
        super(nazwa, cenaZagram, skladniki, rodzaj, jakosc);
    }

    public String getDlugoscFazy() {
        return dlugoscFazy;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MDMA mdma = (MDMA) o;
        return Objects.equals(dlugoscFazy, mdma.dlugoscFazy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dlugoscFazy);
    }

    @Override
    public String toString() {
        return "MDMA{" + getNazwa() + "=" + getCENA_ZA_GRAM() + "$$, " +
                "lengthOfPhase='" + dlugoscFazy + '\'' +
                '}';
    }
}
