package interfaces;

import enums.Jakosc;
import exceptions.BadDrugQualityException;
import model.Narkotyk;

public interface DrugController {

    static void checkDrug(Narkotyk narkotyk){
        if(narkotyk.getJakosc() == Jakosc.ZLA) {
            throw new BadDrugQualityException("Zła jakość narkotyku");
        }
    }
}
