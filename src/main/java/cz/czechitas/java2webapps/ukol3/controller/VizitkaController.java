package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.vizitka;
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

    private final List<vizitka> seznamVizitek;

    public VizitkaController() {
        seznamVizitek = Arrays.asList(
                new vizitka("Čert (První) Pekelný", "PEKLO s.r.o.", "Chráněné území 69", "Peklov 666", "", "666 0 666", "dopekla@sehrabe.cz", "www"),
                new vizitka("Hedwig Snowy Owl", null, "Privet Drive 4", "Little Whinging", "", null, "owl@wizardyworld.com", "www"),
                new vizitka("Luna Lovegood", "QUIBBLER - WARNER BROS.", "Studio Tour Drive 8", "RAVENCLAW", "", "0987 654 3210", "nargles@nobodyknows.uk", "www" ),
                new vizitka("Newton Scamander", "FANTASTIC BEASTS", "In a Suitcase", "HUFFLEPUFF", "", "123 321 1234", "NewtonScamander@magizoologist.uk", "www"),
                new vizitka("Dobby", "FREE ELVES", null, "- everywhere -", "", null, "dobbyisafree@elf.uk", "www")
        );
    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("vizitka", seznamVizitek);
        return modelAndView;
    }

    @GetMapping("/detail")
    public ModelAndView detail(int id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("vizitka", seznamVizitek.get(id));
        return modelAndView;
    }
}
