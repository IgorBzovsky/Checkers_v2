package com.example.igor7.checkers_v2.models.game;

import com.example.igor7.checkers_v2.models.contracts.IAiGame;
import com.example.igor7.checkers_v2.models.contracts.IAiPlayer;
import com.example.igor7.checkers_v2.models.contracts.IGameRules;

class PlayerVsAiGame extends Game implements IAiGame {
    private IGameRules gameRules;
    private IAiPlayer aiPlayer;
    PlayerVsAiGame(IGameRules gameRules) {
        this.gameRules = gameRules;
        setDefaultAi();
    }

    @Override
    public void setEasyAi() {
        aiPlayer = gameRules.createEasyAi();
    }

    @Override
    public void setMediumAi() {
        aiPlayer = gameRules.createMediumAi();
    }

    @Override
    public void setHardAi() {
        aiPlayer = gameRules.createHardAi();
    }

    private void setDefaultAi() {
        setHardAi();
    }
}
