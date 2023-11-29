package model;

import enums.Jakosc;
import enums.RodzajMiny;

import java.util.List;
import java.util.Objects;

public class Mefedron extends Narkotyk{

    public RodzajMiny rodzajMiny;

    public Mefedron(String nazwa, double cenaZagram, List<String> skladniki, String rodzaj, Jakosc jakosc) {
        super(nazwa, cenaZagram, skladniki, rodzaj, jakosc);
    }

    public RodzajMiny getRodzajMiny() {
        return rodzajMiny;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mefedron that = (Mefedron) o;
        return rodzajMiny == that.rodzajMiny;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rodzajMiny);
    }

    @Override
    public String toString() {
        return "Mefedron {" + getNazwa() + "=" + getCENA_ZA_GRAM() + "$$, " +
                "RodzajMiny=" + rodzajMiny +
                '}';
    }
}
