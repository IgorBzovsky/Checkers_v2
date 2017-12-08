package com.example.igor7.checkers_v2.models.game;

import com.example.igor7.checkers_v2.models.contracts.IGame;
import com.example.igor7.checkers_v2.models.contracts.IGameFactory;

public class RussianCheckersFactory implements IGameFactory {
    @Override
    public IGame createPlayerVsPlayerGame() {
        return new PlayerVsPlayerGame(new RussianCheckersRules());
    }

    @Override
    public IGame createPlayerVsAiGame() {
        return new PlayerVsAiGame(new RussianCheckersRules());
    }
}
