package services;

import exceptions.TheKidIsNullException;
import model.Dziecko;

import java.util.*;

public class DzieckoService {

    public Dziecko najczesciejKupowaneNarkotyki(List<Dziecko> dzieci){
        return Optional.ofNullable(dzieci)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(Dziecko::getIloscNarkotykow))
                .orElseThrow(TheKidIsNullException::new);
    }
}
