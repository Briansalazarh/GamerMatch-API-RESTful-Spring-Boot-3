package com.brian.gamermatch_api.domain.repository;

import com.brian.gamermatch_api.domain.model.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamerRepository extends JpaRepository<Gamer, Long> {
    // Método extra para validar reglas de negocio
    boolean existsByNickname(String nickname);
}