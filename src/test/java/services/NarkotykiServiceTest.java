package services;

import enums.Jakosc;
import enums.RodzajMiny;
import interfaces.DrugController;
import model.LSD;
import model.MDMA;
import model.Mefedron;
import model.Narkotyk;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class NarkotykiServiceTest {
    private NarkotykiService narkotykiService;
    private LSD lsd;
    private Mefedron mefedron;
    private MDMA mdma;
    private List<Narkotyk> narkotyki;
    private DrugController drugController;

    @Before
    public void init() {
        narkotykiService = new NarkotykiService();
        drugController = Mockito.mock(DrugController.class);
        lsd = new LSD("LSD",60.0, List.of("Domestos", "Acid", "Cif"),"sld", Jakosc.DOBRA );
        mdma = new MDMA("MDMA",30.0,List.of("sadsadsa","DSAD","dsdsd"),"DSDS", Jakosc.ZLA);
       mefedron = new Mefedron("Mefedron", 60.0, List.of("sdadsada", "dsadsa", "dsdada"),"sda", Jakosc.ZLA );
       narkotyki = new ArrayList<>(Arrays.asList(lsd, mdma, mefedron));
    }

    @Test
    public void shouldReturnDrugsWithGoodQuality() {
        List<Narkotyk> drugsForTest = new ArrayList<>(Arrays.asList(lsd, mefedron));
       assertEquals(drugsForTest, narkotykiService.narkotykiZdobraJakoscia(narkotyki));
    }
}