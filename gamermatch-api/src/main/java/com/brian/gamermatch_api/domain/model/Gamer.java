package com.brian.gamermatch_api.domain.model;


import jakarta.persistence.*;
import java.util.List;

@Entity(name = "tb_gamer")
public class Gamer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Game> games;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    public List<Game> getGames() { return games; }
    public void setGames(List<Game> games) { this.games = games; }
}
