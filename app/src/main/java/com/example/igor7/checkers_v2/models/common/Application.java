package com.example.igor7.checkers_v2.models.common;

import com.example.igor7.checkers_v2.models.contracts.IGame;
import com.example.igor7.checkers_v2.models.contracts.IGameFactory;
import com.example.igor7.checkers_v2.models.game.RussianCheckersFactory;

class Application {
    private static IGame game;

    public static IGame getGame() {
        if(game == null)
            return createDeafaultGame();
        return game;
    }

    public static void setGame(IGame game) {
        Application.game = game;
    }

    private static IGame createDeafaultGame() {
        IGameFactory factory = new RussianCheckersFactory();
        return factory.createPlayerVsPlayerGame();
    }
}
