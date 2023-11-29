package services;

import enums.Jakosc;
import exceptions.TheKidIsAlreadyDeadException;
import model.Dziecko;
import model.Narkotyk;

import java.util.*;
import java.util.stream.Collectors;

public class NarkotykiService {

    public List<Narkotyk> narkotykiZdobraJakoscia(List<Narkotyk> narkotyki) {
        return Optional.ofNullable(narkotyki)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .filter(narkotyk -> narkotyk.getJakosc().equals(Jakosc.DOBRA))
                .collect(Collectors.toList());
    }

    public List<Narkotyk> narkotykiZzlaJakoscia(List<Narkotyk> narkotyki) {
        return Optional.ofNullable(narkotyki)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .filter(narkotyk -> narkotyk.getJakosc().equals(Jakosc.ZLA))
                .collect(Collectors.toList());
    }
    public List<Narkotyk> najdrozszyNarkotyk(List<Narkotyk> narkotyki) {
        return Optional.ofNullable(narkotyki)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(Narkotyk::getCENA_ZA_GRAM))
                .stream().toList();
    }


}