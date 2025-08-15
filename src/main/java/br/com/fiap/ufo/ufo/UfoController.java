package br.com.fiap.ufo.ufo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ufo")
public class UfoController {

    private final UfoService ufoService;

    public UfoController(UfoService ufoService) {
        this.ufoService = ufoService;
    }

    @GetMapping
    public String index(Model model) {
        var ufos = ufoService.getAllUfos();
        model.addAttribute("ufos", ufos);
        return "index";
    }
}
