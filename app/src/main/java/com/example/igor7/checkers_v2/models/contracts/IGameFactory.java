package com.example.igor7.checkers_v2.models.contracts;

public interface IGameFactory {
    IGame createPlayerVsPlayerGame();
    IGame createPlayerVsAiGame();
}
