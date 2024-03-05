package com.marmont.game.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.marmont.game.model.Choice;
import com.marmont.game.model.GameRound;
import com.marmont.game.model.Result;
import com.marmont.game.repository.GameRoundRepository;

@Service
@RequiredArgsConstructor
public class GameService {

    private GameRoundRepository gameRoundRepository;

    public GameRound playRound(Choice playerChoice) {
        Choice computerChoice = Choice.randomChoice();
        Result result = determineWinner(playerChoice, computerChoice);

        GameRound round = new GameRound();
        round.setPlayerChoice(playerChoice);
        round.setComputerChoice(computerChoice);
        round.setResult(result);

        return gameRoundRepository.save(round);
    }

    private Result determineWinner(Choice playerChoice, Choice computerChoice) {
        return playerChoice.compareChoices(computerChoice);
    }

}
