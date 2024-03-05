package com.marmont.game.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.marmont.game.model.Choice;
import com.marmont.game.model.GameRound;
import com.marmont.game.service.GameService;

@RestController
@RequiredArgsConstructor
public class GameController {

    private GameService gameService;

    @PostMapping("/play")
    public GameRound play(@RequestBody Choice playerChoice) {
        return gameService.playRound(playerChoice);
    }
}
