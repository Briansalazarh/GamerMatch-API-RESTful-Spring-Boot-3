package com.brian.gamermatch_api.service;

import com.brian.gamermatch_api.domain.model.Gamer;
import com.brian.gamermatch_api.domain.repository.GamerRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GamerService {

    private final GamerRepository gamerRepository;

    public GamerService(GamerRepository gamerRepository) {
        this.gamerRepository = gamerRepository;
    }

    public Gamer findById(Long id) {
        return gamerRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Gamer create(Gamer gamerToCreate) {
        if (gamerRepository.existsByNickname(gamerToCreate.getNickname())) {
            throw new IllegalArgumentException("Este Nickname ya está en uso.");
        }
        return gamerRepository.save(gamerToCreate);
    }

    public List<Gamer> findAll() {
        return gamerRepository.findAll();
    }
}