package it.castellanidavide.compass.ui.floor2.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import it.castellanidavide.compass.R;

public class Floor2Fragment extends Fragment {

    private Floor2ViewModel floor2ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        floor2ViewModel = ViewModelProviders.of(this).get(Floor2ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_floor2, container, false);

        return root;
    }
}
