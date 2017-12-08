package com.example.igor7.checkers_v2.models.contracts;

public interface IGameRules {
    IAiPlayer createEasyAi();
    IAiPlayer createMediumAi();
    IAiPlayer createHardAi();
}
