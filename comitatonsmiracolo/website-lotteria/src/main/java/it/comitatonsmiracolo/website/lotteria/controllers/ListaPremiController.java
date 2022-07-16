package it.comitatonsmiracolo.website.lotteria.controllers;


import it.comitatonsmiracolo.website.lotteria.entity.Premio;
import it.comitatonsmiracolo.website.lotteria.service.ListaPremiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("")
public class ListaPremiController {

    @Autowired
    private ListaPremiService listaPremiService;

    @RequestMapping(value = "/premi", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<List<Premio>> getPremi(){
        return ResponseEntity.ok(listaPremiService.getAllPrizes());
    }
}
