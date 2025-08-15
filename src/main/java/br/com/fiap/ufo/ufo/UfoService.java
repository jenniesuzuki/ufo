package br.com.fiap.ufo.ufo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UfoService {

    private final UfoRepository ufoRepository;

    public UfoService(UfoRepository ufoRepository) {
        this.ufoRepository = ufoRepository;
    }

    public List<Ufo> getAllUfos() {
        return ufoRepository.findAll();
    }
}
