package com.example.igor7.checkers_v2.models.game;

import com.example.igor7.checkers_v2.models.ai.RussianCheckersEasyAi;
import com.example.igor7.checkers_v2.models.ai.RussianCheckersHardAi;
import com.example.igor7.checkers_v2.models.ai.RussianCheckersMediumAi;
import com.example.igor7.checkers_v2.models.contracts.IAiPlayer;

class RussianCheckersRules extends SharedRules {
    @Override
    public IAiPlayer createEasyAi() {
        return new RussianCheckersEasyAi();
    }

    @Override
    public IAiPlayer createMediumAi() {
        return new RussianCheckersMediumAi();
    }

    @Override
    public IAiPlayer createHardAi() {
        return new RussianCheckersHardAi();
    }
}
