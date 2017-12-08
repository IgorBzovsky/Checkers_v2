package com.example.igor7.checkers_v2.game;

class IGameContract {
    interface View {
        void setPresenter(Presenter presenter);
    }

    interface Presenter {
        void initializeGameBoard();
    }
}
