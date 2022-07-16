package it.comitatonsmiracolo.website.lotteria.service;

import it.comitatonsmiracolo.website.lotteria.entity.Premio;
import it.comitatonsmiracolo.website.lotteria.repository.PremiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListaPremiService {

    @Autowired
    private PremiRepository premiRepository;


    public List<Premio> getAllPrizes(){
        List<Premio> prizes = new ArrayList<>();
        premiRepository.findAll().forEach(prizes::add);
        return prizes;
    }
}
