package com.example.igor7.checkers_v2.game;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.igor7.checkers_v2.R;

public class GameActivity extends AppCompatActivity {
    private GamePresenter gamePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_game);
        GameBoardFragment gameBoardFragment = (GameBoardFragment) getSupportFragmentManager()
                .findFragmentById(R.id.gameBoardFragment);
        gamePresenter = new GamePresenter(gameBoardFragment);
        gameBoardFragment.setPresenter(gamePresenter);
    }
}
