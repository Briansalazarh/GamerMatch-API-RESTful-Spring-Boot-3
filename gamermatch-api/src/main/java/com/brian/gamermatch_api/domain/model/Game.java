package com.brian.gamermatch_api.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String platform; // PC, PS5, XBOX
    private String status;   // PLAYING, FINISHED

    // Getters, Setters, Constructor vacío
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}