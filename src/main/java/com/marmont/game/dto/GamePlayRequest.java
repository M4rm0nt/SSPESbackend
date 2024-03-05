package com.marmont.game.dto;

import com.marmont.game.model.Choice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamePlayRequest {

    private Choice playerChoice;

}
