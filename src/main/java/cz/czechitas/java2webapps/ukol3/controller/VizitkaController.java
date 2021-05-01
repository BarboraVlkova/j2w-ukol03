package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */

@Controller
public class VizitkaController {

    private final List<Vizitka> seznamVizitek;

    public VizitkaController() {
        seznamVizitek = List.of(
                new Vizitka("Čert (První) Pekelný", "P.E.K.L.O", "V Pekle", "Zahrádky", "", "666 0 666", "dopekla@sehrabe.cz", "www.peklo.cz"),
                new Vizitka("Hedwig Snowy Owl", null, "Privet drive no. 4", "Picket Post Close 12", "", null, "owl@wizardyworld.com", null),
                new Vizitka("Luna Lovegood", "*** QUIBBLER ***", "Diagon Alley", "Abbots Langley", "", "0987 654 3210", "nargles@nobodyknows.uk", "www.quibbler.uk" ),
                new Vizitka("Newton Scamander", ">> FANTASTIC BEASTS <<", "Suitcase Travel", "Dunstable", "", "123 321 1234", "NewtonScamander@magizoologist.uk", "www.magizoologist.uk"),
                new Vizitka("Dobby", " FREE.....ELVES ", "Around the World", "Pewsey", "", null, "dobbyisafree@elf.uk", "www.world.com")
        );
    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("vizitka", seznamVizitek);
        return modelAndView;
    }

    @GetMapping(value = "/detail" ,params = "id")
    public ModelAndView detail(int id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("vizitka", seznamVizitek.get(id));
        return modelAndView;
    }
}
