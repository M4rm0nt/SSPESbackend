package com.marmont.game.repository;

import com.marmont.game.model.GameRound;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRoundRepository extends JpaRepository<GameRound, Long> {
}
