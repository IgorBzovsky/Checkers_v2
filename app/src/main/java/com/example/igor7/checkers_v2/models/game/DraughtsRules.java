package com.example.igor7.checkers_v2.models.game;

import com.example.igor7.checkers_v2.models.ai.DraughtsEasyAi;
import com.example.igor7.checkers_v2.models.ai.DraughtsHardAi;
import com.example.igor7.checkers_v2.models.ai.DraughtsMediumAi;
import com.example.igor7.checkers_v2.models.contracts.IAiPlayer;

class DraughtsRules extends SharedRules {

    @Override
    public IAiPlayer createEasyAi() {
        return new DraughtsEasyAi();
    }

    @Override
    public IAiPlayer createMediumAi() {
        return new DraughtsMediumAi();
    }

    @Override
    public IAiPlayer createHardAi() {
        return new DraughtsHardAi();
    }
}
