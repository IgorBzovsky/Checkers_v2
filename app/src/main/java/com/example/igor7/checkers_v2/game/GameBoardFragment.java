package com.example.igor7.checkers_v2.game;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

import com.example.igor7.checkers_v2.R;

public class GameBoardFragment extends Fragment implements IGameContract.View {
    private IGameContract.Presenter presenter;

    //View components
    private GridLayout boardGridLayout;
    private ConstraintLayout disksLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_game_board, container, false);
    }

    @Override
    public void setPresenter(IGameContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
