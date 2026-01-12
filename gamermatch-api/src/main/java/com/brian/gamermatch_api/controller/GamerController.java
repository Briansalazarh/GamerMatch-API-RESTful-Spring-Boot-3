package com.brian.gamermatch_api.controller;

import com.brian.gamermatch_api.domain.model.Gamer;
import com.brian.gamermatch_api.service.GamerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/gamers")
public class GamerController {

    private final GamerService gamerService;

    public GamerController(GamerService gamerService) {
        this.gamerService = gamerService;
    }

    @GetMapping
    public ResponseEntity<List<Gamer>> findAll() {
        return ResponseEntity.ok(gamerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gamer> findById(@PathVariable Long id) {
        return ResponseEntity.ok(gamerService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Gamer> create(@RequestBody Gamer gamer) {
        Gamer gamerCreated = gamerService.create(gamer);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(gamerCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(gamerCreated);
    }
}