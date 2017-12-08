package com.example.igor7.checkers_v2.game;

class GamePresenter implements IGameContract.Presenter {
    private IGameContract.View gameBoardView;

    GamePresenter(GameBoardFragment gameBoardView) {
        this.gameBoardView = gameBoardView;
    }
    @Override
    public void initializeGameBoard() {

    }
}
